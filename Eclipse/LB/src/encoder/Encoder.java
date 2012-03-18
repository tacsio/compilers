package encoder;

import java.util.Vector;

import semantic.IdTable;
import semantic.TipoPrimitivo;
import util.Arquivo;
import visitor.Visitor;
import ast.Args;
import ast.Atribuicao;
import ast.Break;
import ast.Chamada;
import ast.Condicao;
import ast.Decls;
import ast.ElseNode;
import ast.Expressao;
import ast.Func;
import ast.GlobalVar;
import ast.GlobalVars;
import ast.IfNode;
import ast.IfThenElse;
import ast.Input;
import ast.LacoFor;
import ast.LacoUntil;
import ast.LacoWhile;
import ast.LocalVar;
import ast.LocalVars;
import ast.No;
import ast.Param;
import ast.Params;
import ast.Print;
import ast.Proc;
import ast.Program;
import ast.Stms;
import ast.terminais.Bool;
import ast.terminais.Id;
import ast.terminais.Int;
import ast.terminais.StringLiteral;

public class Encoder implements Visitor {

	private Arquivo arquivo;
	private IdTable idTable;
	private int labelCount;
	private String nomePrograma;

	private Vector<String> tempParametro;

	public Encoder(String entrada) {

		this.arquivo = new Arquivo("main.il", entrada);
		this.idTable = new IdTable();
		this.labelCount = 0;

		this.tempParametro = new Vector<String>();
	}

	@Override
	public Object visit(Program program, Object o) {

		this.nomePrograma = program.getName().getText();
		this.idTable.addVar(program.getName(), TipoPrimitivo.VOID);

		// cabecalho .NET
		this.arquivo.println(".assembly extern mscorlib {}");
		this.arquivo.println(".assembly " + nomePrograma + "{}");
		this.arquivo.println(".module " + nomePrograma);
		this.arquivo.println();

		// cabecalho classe
		this.arquivo.println(".class private auto ansi beforefieldinit "
				+ nomePrograma);
		this.arquivo.println("       extends [mscorlib]System.Object \n{");
		// quebra de linha
		this.arquivo.println();

		GlobalVars varGlobais = program.getVariaveisGlobais();
		varGlobais.accept(this, null);

		// quebra de linha
		this.arquivo.println();

		Decls declaracoes = program.getDeclaracoes();
		declaracoes.accept(this, null);

		// cabecalho metodo main
		this.arquivo
				.println(".method public hidebysig static void Main() cil managed \n{");
		this.arquivo.println("  .entrypoint");
		this.arquivo.println("  .maxstack  500\n");

		Stms statements = program.getStatements();
		statements.accept(this, null);

		this.arquivo.println("  ret");
		this.arquivo.println("}");
		this.arquivo.println("}");

		return null;
	}

	@Override
	public Object visit(GlobalVars globalVars, Object o) {

		if (globalVars.getChildren() != null) {
			for (GlobalVar var : globalVars.getVariaveisGlobais()) {
				var.accept(this, null);
			}
		}

		return null;
	}

	@Override
	public Object visit(GlobalVar var, Object o) {

		TipoPrimitivo tipo = var.getTipo();
		String tipoDotNet = getTipoDotNet(tipo);

		for (Id id : var.getId()) {
			this.idTable.addVar(id, tipo);
			this.arquivo.println(".field public static " + tipoDotNet + " "
					+ id.getText());
		}
		return null;
	}

	@Override
	public Object visit(Decls decls, Object o) {

		if (decls.getChildren() != null) {

			for (Object metodo : decls.getChildren()) {

				if (metodo instanceof Func) {
					((Func) metodo).accept(this, null);// accept funcao
				} else if (metodo instanceof Proc) {
					((Proc) metodo).accept(this, null);// accept procedimento
				}

			}
		}
		return null;
	}

	@Override
	public Object visit(Func func, Object o) {

		TipoPrimitivo tipo = func.getRetorno();
		String tipoDotNet = getTipoDotNet(tipo);
		Id id = func.getName();

		this.idTable.addVar(id, tipo);// adiciona na tabela de simbolos
		this.idTable.addMetodo(id);// adiciona no escopoMetodos
		this.idTable.abrirEscopo();// abre o escopo local

		// cabecalho declaracao
		this.arquivo.print(".method public hidebysig static " + tipoDotNet
				+ " " + id.getText() + "(");

		Params parametros = func.getParametros();
		parametros.accept(this, id); // passa o identificador da funcao

		this.arquivo.println(") cil managed \n{");

		LocalVars varLocais = func.getVariaveis();
		varLocais.accept(this, null);

		Stms statements = func.getStatements();
		statements.accept(this, null);

		this.tempParametro.clear();

		this.arquivo.println("  ret");// ret
		this.arquivo.println("}\n");// fim do procedimento

		this.idTable.fecharEscopo();// fecha escopo local
		return null;
	}

	@Override
	public Object visit(Proc proc, Object o) {

		Id id = proc.getName();
		this.idTable.addVar(id, TipoPrimitivo.VOID);

		this.idTable.addMetodo(id);// adiciona no escopoMetodos
		this.idTable.abrirEscopo();// abre escopo local

		// cabecalho declaracao
		this.arquivo.print(".method public hidebysig static void "
				+ id.getText() + "(");

		Params parametros = proc.getParametros();
		parametros.accept(this, id);

		this.arquivo.println(") cil managed \n{");

		LocalVars varLocais = proc.getVariaveis();
		varLocais.accept(this, null);

		Stms statements = proc.getStatements();
		statements.accept(this, null);

		this.tempParametro.clear();

		this.arquivo.println("  ret");// ret
		this.arquivo.println("}\n");// fim do procedimento

		this.idTable.fecharEscopo();

		return null;
	}

	@Override
	public Object visit(LocalVars vars, Object o) {

		if (vars.getChildren() != null) {

			// cabecalho variaveis locais
			this.arquivo.print("  .locals init (");

			for (LocalVar var : vars.getVariaveisLocais()) {

				if (var.equals(vars.getVariaveisLocais().lastElement())) {
					var.accept(this, null);
				} else {
					var.accept(this, null);
					this.arquivo.println(",");
					this.arquivo.print("\t\t\t\t");
				}
			}

			this.arquivo.println(")");
		}
		return null;
	}

	@Override
	public Object visit(LocalVar localVar, Object o) {

		TipoPrimitivo tipo = localVar.getTipo();
		String tipoDotNet = getTipoDotNet(tipo);

		for (Id id : localVar.getId()) {

			this.idTable.addVar(id, tipo);// adiciona na idTable

			if (id.equals(localVar.getId().lastElement())) {
				this.arquivo.print(tipoDotNet + " " + id.getText());
			} else {
				this.arquivo.println(tipoDotNet + " " + id.getText() + ",");
				this.arquivo.print("\t\t\t\t");
			}

		}

		return null;
	}

	@Override
	public Object visit(Params params, Object o) {

		if (params.getChildren() != null) {

			for (Param parametro : params.getParametros()) {
				if (parametro.equals(params.getParametros().lastElement())) {
					parametro.accept(this, o); // passa id do pai
				} else {
					parametro.accept(this, o);// passa id do pai
					this.arquivo.println(",");
					this.arquivo.print("\t\t\t\t\t\t\t\t\t\t   ");
				}
			}
		}
		return null;
	}

	@Override
	public Object visit(Param param, Object o) {

		TipoPrimitivo tipo = param.getTipo();
		String tipoDotNet = getTipoDotNet(tipo);
		Id id = param.getId();
		this.tempParametro.add(id.getText());
		this.idTable.addVar(id, tipo);
		this.idTable.addParametros((Id) o, id, tipo);

		// parametros
		this.arquivo.print(tipoDotNet + " " + id.getText());

		return null;
	}

	@Override
	public Object visit(Stms stms, Object o) {

		if (stms.getChildren() != null) {
			for (int i = 0; i < stms.getChildCount(); i++) {

				No filho = (No) stms.getChild(i);
				filho.accept(this, null);

			}
		}

		return null;
	}

	@Override
	public Object visit(Chamada chamada, Object o) {

		Id id = chamada.getId();// nome da funcao ou procedimento
		TipoPrimitivo tipo = null; // Tipo de retorno da chamada
		tipo = this.idTable.getTipo(id);// tipo de retono da chamada

		String tipoDotNet = getTipoDotNet(tipo);

		Args args = chamada.getArgs();

		args.accept(this, id);// passa o id da chamda para saber quais
		// args ela posui

		this.arquivo.print("  call\t\t" + tipoDotNet + " " + this.nomePrograma
				+ "::" + id.getText());

		this.arquivo.print("(");

		Vector<TipoPrimitivo> tipos = this.idTable.getTipoArgumentos(id);
		int limite = args.getChildCount();

		for (int i = 0; i < limite; i++) {
			if (i + 1 == limite) {// ultimo
				this.arquivo.print(getTipoDotNet(tipos.get(i)));
			} else {
				this.arquivo.println(getTipoDotNet(tipos.get(i)) + ",");
				this.arquivo.print("\t\t\t\t\t\t\t\t ");
			}
		}

		this.arquivo.println(")");

		return tipo;// tipo de retorno
	}

	@Override
	public Object visit(Args args, Object o) {

		if (args.getChildren() != null) {
			for (Expressao exp : args.getArgumentos()) {
				exp.accept(this, null);
			}
		}

		return null;
	}

	@Override
	public Object visit(Atribuicao atribuicao, Object o) {

		Id id = atribuicao.getId();
		String tipo = getTipoDotNet(this.idTable.getTipo(id));
		Expressao expr = atribuicao.getExpressao();
		expr.accept(this, null);// avalia expressao

		if (this.idTable.hasMetodo(id)) {
			this.arquivo.println("  ret");// ret
		} else {
			if (this.idTable.hasGlobal(id)) {
				this.arquivo.println("  stsfld\t" + tipo + " "
						+ this.nomePrograma + "::" + id.getText());

			} else {
				if (this.tempParametro.contains(id.getText())) {
					this.arquivo.println("  starg\t\t" + id.getText());
				} else {
					// atribuicao de variaveis locais
					this.arquivo.println("  stloc\t\t" + id.getText());
				}
			}
		}

		return null;
	}

	@Override
	public Object visit(Expressao expressao, Object o) {

		TipoPrimitivo tipoRetorno = null;

		if (expressao.getChildCount() == 2) {

			((No) expressao.getChild(0)).accept(this, null);
			((No) expressao.getChild(1)).accept(this, null);

			if (expressao.getText().equals("+")) {

				arquivo.println("  add");
				tipoRetorno = TipoPrimitivo.INTEGER;

			} else if (expressao.getText().equals("-")) {

				arquivo.println("  sub");
				tipoRetorno = TipoPrimitivo.INTEGER;

			} else if (expressao.getText().equals("*")) {

				arquivo.println("  mul");
				tipoRetorno = TipoPrimitivo.INTEGER;

			} else if (expressao.getText().equals("/")) {

				arquivo.println("  div");
				tipoRetorno = TipoPrimitivo.INTEGER;

			} else if (expressao.getText().equals("AND")) {

				arquivo.println("  and");
				tipoRetorno = TipoPrimitivo.BOOLEAN;

			} else if (expressao.getText().equals("OR")) {

				arquivo.println("  or");
				tipoRetorno = TipoPrimitivo.BOOLEAN;

			} else if (expressao.getText().equals("=")) {

				arquivo.println("  ceq");
				tipoRetorno = TipoPrimitivo.BOOLEAN;

			} else if (expressao.getText().equals("<>")
					|| expressao.getText().equals("><")) {

				arquivo.println("  ceq; ldc.i4 1; xor");
				tipoRetorno = TipoPrimitivo.BOOLEAN;

			} else if (expressao.getText().equals(">=")) {

				arquivo.println("  clt\n  ldc.i4 1\n  xor");
				tipoRetorno = TipoPrimitivo.BOOLEAN;

			} else if (expressao.getText().equals("<=")) {

				arquivo.println("  cgt\n  ldc.i4 1\n  xor");
				tipoRetorno = TipoPrimitivo.BOOLEAN;

			} else if (expressao.getText().equals(">")) {

				arquivo.println("  cgt");
				tipoRetorno = TipoPrimitivo.BOOLEAN;

			} else if (expressao.getText().equals("<")) {

				arquivo.println("  clt");
				tipoRetorno = TipoPrimitivo.BOOLEAN;

			}

		} else {

			((No) expressao.getChild(0)).accept(this, o);

			if (expressao.getText().equals("NAO")) {

				arquivo.println("  ldc.i4 1\n  xor");
				tipoRetorno = TipoPrimitivo.BOOLEAN;

			}
		}

		return tipoRetorno;
	}

	@Override
	public Object visit(IfThenElse ifThenElse, Object o) {

		this.labelCount = this.labelCount + 1;
		String labelElse = "ELSE_" + this.labelCount;
		String labelOut = "OUT_" + this.labelCount;

		Condicao condicao = ifThenElse.getCondicao();
		condicao.accept(this, null);

		this.arquivo.println("  brfalse\t" + labelElse);
		IfNode ifNode = ifThenElse.getIfNode();
		ifNode.accept(this, null);// passa informacao do statement

		this.arquivo.println("  br.s\t\t" + labelOut);

		this.arquivo.println("  " + labelElse + ":");
		ElseNode elseNode = ifThenElse.getElseNode();
		elseNode.accept(this, null); // passa informacao do statement

		this.arquivo.println("  " + labelOut + ":");

		return null;
	}

	@Override
	public Object visit(Condicao condicao, Object o) {

		Expressao expBool = condicao.getExpressao();
		expBool.accept(this, null);
		return null;
	}

	@Override
	public Object visit(IfNode ifNode, Object o) {

		if (ifNode.getChildren() != null) {
			ifNode.getStms().accept(this, null);
		}
		return null;
	}

	@Override
	public Object visit(ElseNode elseNode, Object o) {

		if (elseNode.getChildren() != null) {
			elseNode.getStms().accept(this, null);
		}
		return null;
	}

	@Override
	public Object visit(LacoFor lacoFor, Object o) {

		this.labelCount++;
		String labelBegin = "BEGIN_" + labelCount;
		String labelOut = "OUT_" + labelCount;

		Atribuicao atribuicao = lacoFor.getAtribuicao();
		atribuicao.accept(this, null);

		atribuicao.getExpressao().accept(this, null);

		arquivo.println("  " + labelBegin + ":");

		arquivo.println();

		Expressao expLimite = lacoFor.getLimiteFor();
		expLimite.accept(this, null);

		arquivo.println("  cgt; ldc.i4 1; xor");
		arquivo.println("  brfalse\t" + labelOut);

		Stms stmt = lacoFor.getStatements();
		stmt.accept(this, null);

		Expressao step = lacoFor.getStepFor();
		if (step != null) {

			step.accept(this, null);
		} else {

			arquivo.println("  ldc.i4\t1");
		}

		Id id = atribuicao.getId();
		id.accept(this, null);
		arquivo.println("  add");

		if (idTable.hasGlobal(id)) {

			this.arquivo.println("  stsfld\t"
					+ getTipoDotNet(this.idTable.getTipo(id)) + " "
					+ nomePrograma + "::" + id.getText());
		} else {
			arquivo.println("  stloc\t" + id.getText());
		}

		id.accept(this, null);

		arquivo.println("  br.s\t\t" + labelBegin);

		arquivo.println();
		arquivo.println("  " + labelOut + ":");
		arquivo.println();
		return null;
	}

	@Override
	public Object visit(LacoWhile lacoWhile, Object o) {

		this.labelCount++;
		String labelBegin = "BEGIN_" + labelCount;
		String labelOut = "OUT_" + labelCount;

		this.arquivo.println();
		this.arquivo.println("  " + labelBegin + ":");
		this.arquivo.println();
		Condicao condicao = lacoWhile.getCondicao();
		condicao.accept(this, null);

		this.arquivo.println("  brfalse\t" + labelOut);

		Stms stms = lacoWhile.getStatements();
		stms.accept(this, null);

		this.arquivo.println("  br.s\t\t" + labelBegin);
		this.arquivo.println();
		this.arquivo.println("  " + labelOut + ":");

		return null;
	}

	@Override
	public Object visit(LacoUntil lacoUntil, Object o) {

		this.labelCount++;
		String labelBegin = "BEGIN_" + labelCount;
		String labelOut = "OUT_" + labelCount;

		this.arquivo.println();
		this.arquivo.println("  " + labelBegin + ":");
		this.arquivo.println();

		Stms stmts = lacoUntil.getStatements();
		stmts.accept(this, null);

		Condicao condicao = lacoUntil.getCondicao();
		condicao.accept(this, null);

		this.arquivo.println("  brtrue\t" + labelBegin);
		this.arquivo.println("  " + labelOut + ":");

		return null;
	}

	@Override
	public Object visit(Break break1, Object o) {

		String labelOut = "OUT_" + labelCount;
		arquivo.println("  br.s\t\t" + labelOut);

		return null;
	}

	@Override
	public Object visit(Input input, Object o) {

		for (Id id : input.getVariaveis()) {
			TipoPrimitivo tipo = this.idTable.getTipo(id);

			this.arquivo
					.println("  call\t\tstring [mscorlib]System.Console::ReadLine()");

			if (this.idTable.hasGlobal(id)) {

				if (tipo.equals(TipoPrimitivo.STRING)) {
					// carrega string
					this.arquivo.println("  stsfld\tstring "
							+ this.nomePrograma + "::" + id.getText());

				} else if (tipo.equals(TipoPrimitivo.INTEGER)) {

					// converte string para int
					this.arquivo
							.println("  call\t\tint32 [mscorlib]System.Int32::Parse(string)");

					this.arquivo.println("  stsfld\tint32 " + this.nomePrograma
							+ "::" + id.getText());

				} else if (tipo.equals(TipoPrimitivo.BOOLEAN)) {
					// TODO: Fazer input boolean
				}

				// locais
			} else {

				if (tipo.equals(TipoPrimitivo.STRING)) {
					// carrega string
					this.arquivo.println("  stloc\t\t" + id.getText());

				} else if (tipo.equals(TipoPrimitivo.INTEGER)) {

					// converte string para int
					this.arquivo
							.println("  call\t\tint32 [mscorlib]System.Int32::Parse(string)");

					this.arquivo.println("  stloc\t\t" + id.getText());

				} else if (tipo.equals(TipoPrimitivo.BOOLEAN)) {
					// TODO: Fazer input boolean
				}

			}
		}
		return null;
	}

	@Override
	public Object visit(Print print, Object o) {

		for (Object expr : print.getChildren()) {

			TipoPrimitivo tipo = (TipoPrimitivo) ((Expressao) expr).accept(
					this, null);

			String tipoDotNet = getTipoDotNet(tipo);
			this.arquivo
					.println("  call\t\tvoid [mscorlib]System.Console::WriteLine("
							+ tipoDotNet + ")");
		}
		return null;
	}

	@Override
	public Object visit(Id id, Object o) {

		TipoPrimitivo tipo = this.idTable.getTipo(id);
		String tipoDotNet = getTipoDotNet(tipo);

		if (idTable.hasGlobal(id)) {
			this.arquivo.println("  ldsfld\t" + tipoDotNet + " " + nomePrograma
					+ "::" + id.getText());
		} else if (this.tempParametro.contains(id.getText())) {
			this.arquivo.println("  ldarg\t\t" + id.getText());
		} else {
			this.arquivo.println("  ldloc\t\t" + id.getText());
		}

		return tipo;
	}

	@Override
	public Object visit(Int int1, Object o) {

		this.arquivo.println("  ldc.i4\t" + int1.getValue());

		return TipoPrimitivo.INTEGER;
	}

	@Override
	public Object visit(Bool bool, Object o) {

		if (bool.getValue() == true) {
			arquivo.println("  ldc.i4\t1");
		} else {
			arquivo.println("  ldc.i4\t0");
		}

		return TipoPrimitivo.BOOLEAN;
	}

	@Override
	public Object visit(StringLiteral stringLiteral, Object o) {

		this.arquivo.println("  ldstr\t\t" + stringLiteral.getText());

		return TipoPrimitivo.STRING;
	}

	private String getTipoDotNet(TipoPrimitivo tipo) {

		String tipoRetorno = null;

		if (tipo.equals(TipoPrimitivo.INTEGER)) {

			tipoRetorno = "int32";

		} else if (tipo.equals(TipoPrimitivo.BOOLEAN)) {

			tipoRetorno = "int32";

		} else if (tipo.equals(TipoPrimitivo.STRING)) {

			tipoRetorno = "string";

		} else if (tipo.equals(TipoPrimitivo.VOID)) {

			tipoRetorno = "void";

		}

		return tipoRetorno;
	}

}
