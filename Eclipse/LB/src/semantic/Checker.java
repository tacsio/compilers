package semantic;

import java.util.Vector;

import util.ReportError;
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

public class Checker implements Visitor {

	private IdTable idTable;
	public ReportError consoleError;

	private boolean gambiPai = false;// TODO: faz parte da gambiarra
	private String gambiFilho;// TODO: filhindo dumaL
	private boolean retorno = false;

	public Checker() {
		this.idTable = new IdTable();
		this.consoleError = new ReportError();
	}

	@Override
	public Object visit(Program program, Object o) {

		Id nomePrograma = program.getName();
		this.idTable.addVar(nomePrograma, TipoPrimitivo.VOID);

		GlobalVars varGlobais = program.getVariaveisGlobais();
		varGlobais.accept(this, null);

		Decls declaracoes = program.getDeclaracoes();
		declaracoes.accept(this, null);

		Stms statements = program.getStatements();
		statements.accept(this, null);

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

		for (Id id : var.getId()) {

			if (!this.idTable.hasVar(id)) {
				this.idTable.addVar(id, tipo);// adiciona na id table
			} else {
				this.consoleError.reportError(id, "identificador '" + id
						+ "' ja existente");
			}
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
		Id id = func.getName();

		if (!this.idTable.hasVar(id)) {
			this.idTable.addVar(id, tipo);
		} else {
			this.consoleError.reportError(id, "identificador '" + id
					+ "' ja existente");
		}

		this.idTable.addMetodo(id);// adiciona no escopoMetodos
		this.idTable.abrirEscopo();// abre o escopo local

		Params parametros = func.getParametros();
		parametros.accept(this, id); // passa o identificador da funcao

		LocalVars varLocais = func.getVariaveis();
		varLocais.accept(this, null);

		this.retorno = false;// funcao ainda nao tem retorno definido
		this.gambiPai = true; // agora pode atribuir em funcao
		this.gambiFilho = id.getText(); // nome da funcao que esta sendo
		// avaliada

		Stms statements = func.getStatements();
		statements.accept(this, null);

		// revifica se a funcao tem retorno
		if (!this.retorno) {
			this.consoleError.reportError(id, "a funcao '" + id
					+ "' nao possui um retorno definido");
		}

		this.gambiPai = false; // fechou a budega
		// TODO: Faz parte da gambiarra

		this.idTable.fecharEscopo();// fecha escopo local

		return null;
	}

	@Override
	public Object visit(Proc proc, Object o) {

		Id id = proc.getName();

		if (!this.idTable.hasVar(id)) {
			this.idTable.addVar(id, TipoPrimitivo.VOID);
		} else {
			this.consoleError.reportError(id, "identificador '" + id
					+ "' ja existente");
		}

		this.idTable.addMetodo(id);// adiciona no escopoMetodos
		this.idTable.abrirEscopo();// abre escopo local

		Params parametros = proc.getParametros();
		parametros.accept(this, id);

		LocalVars varLocais = proc.getVariaveis();
		varLocais.accept(this, null);

		Stms statements = proc.getStatements();
		statements.accept(this, null);

		this.idTable.fecharEscopo();

		return null;
	}

	@Override
	public Object visit(LocalVars vars, Object o) {

		if (vars.getChildren() != null) {

			for (LocalVar var : vars.getVariaveisLocais()) {
				var.accept(this, null);
			}
		}

		return null;
	}

	@Override
	public Object visit(Params params, Object o) {

		if (params.getChildren() != null) {

			for (Param parametro : params.getParametros()) {
				parametro.accept(this, o); // passa id do pai
			}
		}
		return null;
	}

	@Override
	public Object visit(Param param, Object o) {

		TipoPrimitivo tipo = param.getTipo();
		Id id = param.getId();

		if (!this.idTable.hasVar(id)) {
			this.idTable.addVar(id, tipo);
			this.idTable.addParametros((Id) o, id, tipo);// adiciona parametro
			// lembrar que Object o eh o id do procedimento ou funcao que possui
			// aquele parametro, e esse id sera a chave na tabela de metodos
		} else {
			this.consoleError.reportError(id, "identificador '" + id
					+ "' ja existente");
		}

		return null;
	}

	@Override
	public Object visit(LocalVar localVar, Object o) {

		TipoPrimitivo tipo = localVar.getTipo();

		for (Id id : localVar.getId()) {

			if (!this.idTable.hasVar(id)) {
				this.idTable.addVar(id, tipo);// adiciona na idTable
			} else {
				this.consoleError.reportError(id, "identificador '" + id
						+ "' ja existe");
			}

		}
		return null;
	}

	@Override
	public Object visit(Stms stms, Object o) {

		// caso statement aninhado (passagens de informacao do break)
		if (o instanceof LacoFor || o instanceof LacoUntil
				|| o instanceof LacoWhile) {
			for (int i = 0; i < stms.getChildCount(); i++) {
				No no = (No) stms.getChild(i);
				no.accept(this, o);// Informacao de qual statement desce
			}
		} else {
			for (int i = 0; i < stms.getChildCount(); i++) {
				No no = (No) stms.getChild(i);
				no.accept(this, no);// Informacao de qual statement desce

			}
		}

		return null;
	}

	@Override
	public Object visit(Chamada chamada, Object o) {

		TipoPrimitivo retorno = null; // Tipo de retorno da chamada

		Id id = chamada.getId();// nome da funcao ou procedimento
		if (this.idTable.hasVar(id)) {

			retorno = this.idTable.getTipo(id);// tipo de retono da chamada

			Args args = chamada.getArgs();

			// verifica se o numero de parametros esta correto
			if (args.getChildCount() == this.idTable.getNumeroArgumentos(id)) {

				args.accept(this, id);// passa o id da chamda para saber quais
				// args ela posui

			} else {
				this.consoleError.reportError(id,
						"numero de parametros inconsistentes na chamada do metodo '"
								+ id + "'");
			}

		} else {
			this.consoleError.reportError(id, "O procedimento '" + id
					+ "' nao foi declarado");
		}

		return retorno;// tipo de retorno da chamada
	}

	@Override
	public Object visit(Args args, Object o) {

		if (args.getChildCount() > 0) {

			Vector<Tupla> temp = this.idTable.getArgs((Id) o);// o nome do
			// metodo

			int i = 0;
			for (Expressao exp : args.getArgumentos()) {

				TipoPrimitivo tipoExpressao = (TipoPrimitivo) exp.accept(this,
						null);

				if (temp.get(i).tipo != tipoExpressao) {

					consoleError.reportError(args,
							"Erro de tipo na passagem do parametro");

				}

				i++; // incrementa o parametro do vetor<tupla> para poder
				// comparar de forma correspondente com as expressoes
				// que sao passadas como parametro na chamada do metodo
			}
		}

		return null;
	}

	@Override
	public Object visit(Atribuicao atribuicao, Object o) {

		Id id = atribuicao.getId();

		if (this.idTable.hasVar(id)) {

			// verifica se o id pertence a um procedimento
			if (this.idTable.hasMetodo(id)) {

				// verificar se a atribuicao eh feita dentro de uma funcao
				if (this.gambiPai) {

					if (this.gambiFilho.equals(id.getText())) {

					} else {
						consoleError
								.reportError(
										id,
										"Retorno invalido '"
												+ id
												+ "' se refere a outro procedimento, logo a atribucao nao esta correta");
					}

					this.retorno = true; // identifica o retorno da funcao
					TipoPrimitivo tipo = this.idTable.getTipo(id);

					Expressao expr = atribuicao.getExpressao();
					TipoPrimitivo tipoExpressao = (TipoPrimitivo) expr.accept(
							this, null);

					if (tipo != tipoExpressao) {
						this.consoleError.reportError(id,
								"Tipos inconsistentes no retorno da funcao '"
										+ id + "'");
					}
					// reporta erro pois a atribuicao nao eh um retorno
				} else {

					this.consoleError.reportError(id, "atribuicao invalida '"
							+ id
							+ "' nao eh uma variavel e sim um procedimento");
				}
				// atribuicao normal
			} else {
				TipoPrimitivo tipo = this.idTable.getTipo(id);

				Expressao expr = atribuicao.getExpressao();
				TipoPrimitivo tipoExpressao = (TipoPrimitivo) expr.accept(this,
						null);

				if (tipo != tipoExpressao) {
					this.consoleError.reportError(id,
							"Tipos inconsistentes na atribuicao de '" + id
									+ "'");
				}
			}
			// erro na atribuicao pois o id nao existe
		} else {
			this.consoleError.reportError(id, "variavel '" + id
					+ "' ainda nao foi declarada");
		}

		return id;
	}

	@Override
	public Object visit(Expressao expressao, Object o) {

		TipoPrimitivo tipoRetorno = null;

		if (expressao.getText().equals("+")) {

			tipoRetorno = acceptAritmetico(expressao);

		} else if (expressao.getText().equals("-")) {

			tipoRetorno = acceptAritmetico(expressao);

		} else if (expressao.getText().equals("*")) {

			tipoRetorno = acceptAritmetico(expressao);

		} else if (expressao.getText().equals("/")) {

			tipoRetorno = acceptAritmetico(expressao);

		} else if (expressao.getText().equals("AND")) {

			tipoRetorno = acceptBooleano(expressao);

		} else if (expressao.getText().equals("OR")) {

			tipoRetorno = acceptBooleano(expressao);

		} else if (expressao.getText().equals("NAO")) {

			tipoRetorno = (TipoPrimitivo) ((No) expressao.getChild(0)).accept(
					this, TipoPrimitivo.BOOLEAN);

		} else if (expressao.getText().equals("=")) {

			tipoRetorno = acceptRelacional(expressao);

		} else if (expressao.getText().equals("<>")
				|| expressao.getText().equals("><")) {

			tipoRetorno = acceptRelacional(expressao);

		} else if (expressao.getText().equals(">=")) {

			tipoRetorno = acceptRelacional(expressao);

		} else if (expressao.getText().equals("<=")) {

			tipoRetorno = acceptRelacional(expressao);

		} else if (expressao.getText().equals(">")) {

			tipoRetorno = acceptRelacional(expressao);

		} else if (expressao.getText().equals("<")) {

			tipoRetorno = acceptRelacional(expressao);

		}

		return tipoRetorno;
	}

	@Override
	public Object visit(IfThenElse ifThenElse, Object o) {

		Condicao condicao = ifThenElse.getCondicao();
		condicao.accept(this, null);

		IfNode ifNode = ifThenElse.getIfNode();
		ifNode.accept(this, o);// passa informacao do statement

		ElseNode elseNode = ifThenElse.getElseNode();
		elseNode.accept(this, o); // passa informacao do statement

		return null;
	}

	@Override
	public Object visit(Condicao condicao, Object o) {

		Expressao exp = condicao.getExpressao();
		TipoPrimitivo tipoExp = (TipoPrimitivo) exp.accept(this, null);

		if (!tipoExp.equals(TipoPrimitivo.BOOLEAN)) {

			this.consoleError.reportError(exp,
					"A condicao precisa ser do tipo booleano");

			tipoExp = TipoPrimitivo.INVALIDO;
		}

		return tipoExp;
	}

	@Override
	public Object visit(IfNode ifNode, Object o) {

		if (ifNode.getChildren() != null) {
			Stms stms = ifNode.getStms();
			stms.accept(this, o);
		}

		return null;
	}

	@Override
	public Object visit(ElseNode elseNode, Object o) {

		if (elseNode.getChildren() != null) {
			Stms stms = elseNode.getStms();
			stms.accept(this, o);
		}

		return null;
	}

	@Override
	public Object visit(LacoFor lacoFor, Object o) {

		Atribuicao atribuicao = lacoFor.getAtribuicao();
		Id id = (Id) atribuicao.accept(this, null);

		Expressao limite = lacoFor.getLimiteFor();
		TipoPrimitivo expLim = (TipoPrimitivo) limite.accept(this, null);

		if (!expLim.equals(TipoPrimitivo.INTEGER)) {

			this.consoleError.reportError(limite,
					"Erro no tipo da expressao limite.");

		}

		Expressao step = lacoFor.getStepFor();

		if (step != null) {

			TipoPrimitivo expStep = (TipoPrimitivo) step.accept(this, null);

			if (!expStep.equals(TipoPrimitivo.INTEGER)) {

				this.consoleError
						.reportError(limite,
								"Erro no incremento do for. Verifique se a expressao eh do tipo INTEGER.");

			}
		}

		Stms stms = lacoFor.getStatements();
		stms.accept(this, lacoFor);// informacao do statement de loop

		Id next = (Id) lacoFor.getNextFor().getChild(0);

		if (this.idTable.hasVar(id)) {
			if (!next.getText().equalsIgnoreCase(id.getText())) {

				this.consoleError
						.reportError(
								next,
								"A variavel '"
										+ next
										+ "' nao eh a mesma variavel atribuida na condicao do FOR");
			}
		} else {
			this.consoleError.reportError(id, "variavel '" + id
					+ "' nao foi declarada");
		}

		return null;
	}

	@Override
	public Object visit(LacoWhile lacoWhile, Object o) {

		Condicao condicao = lacoWhile.getCondicao();
		condicao.accept(this, null);

		Stms stms = lacoWhile.getStatements();
		stms.accept(this, lacoWhile);// informacao do statement de loop

		return null;
	}

	@Override
	public Object visit(LacoUntil lacoUntil, Object o) {

		Stms stms = lacoUntil.getStatements();
		stms.accept(this, lacoUntil);// informacao do statement de loop

		Condicao condicao = lacoUntil.getCondicao();
		condicao.accept(this, null);

		return null;
	}

	@Override
	public Object visit(Break break1, Object o) {

		String className = o.getClass().getSimpleName();

		if (break1.getText().equalsIgnoreCase("BREAK_DO")) {

			// verifica se o EXIT DO esta dentro de um laco While
			if (!((className.equalsIgnoreCase(ast.LacoWhile.class
					.getSimpleName())) || (className
					.equalsIgnoreCase(ast.LacoUntil.class.getSimpleName())))) {

				this.consoleError.reportError(break1,
						"comando 'EXIT DO' em area incorreta.");

			}
		} else {// BREAK_FOR
			// verifica se o EXIT FOR esta dentro de um laco For
			if (!className.equalsIgnoreCase(ast.LacoFor.class.getSimpleName())) {

				this.consoleError.reportError(break1,
						"Comando 'EXIT FOR' em area incorreta");
			}
		}
		return null;
	}

	@Override
	public Object visit(Input input, Object o) {

		for (Id id : input.getVariaveis()) {
			if (!this.idTable.hasVar(id)) {
				this.consoleError.reportError(id, "variavel '" + id
						+ "' nao foi declarada");
			}
		}

		return null;
	}

	@Override
	public Object visit(Print print, Object o) {

		for (Object expr : print.getChildren()) {
			if (expr instanceof Expressao) {

				TipoPrimitivo tipo = (TipoPrimitivo) ((Expressao) expr).accept(
						this, null);

				if (tipo.equals(TipoPrimitivo.VOID)) {
					this.consoleError.reportError(print,
							"operacao de impressao incorreta");
				}

			}
		}

		return null;
	}

	@Override
	public Object visit(Id id, Object o) {

		TipoPrimitivo retorno;
		TipoPrimitivo retornoEsperado = (TipoPrimitivo) o;
		if (this.idTable.hasVar(id)) {

			if (retornoEsperado == null) {

				retorno = this.idTable.getTipo(id);

			} else if (!retornoEsperado.equals(this.idTable.getTipo(id))) {

				this.consoleError.reportError(id, "tipo de '" + id
						+ "' inconsistente.  *Tipo Esperado: "
						+ retornoEsperado + "  *Tipo Real: "
						+ this.idTable.getTipo(id));
				retorno = TipoPrimitivo.INVALIDO;

			} else {
				retorno = retornoEsperado;
			}

		} else {
			this.consoleError.reportError(id, "variavel '" + id
					+ "' nao foi declarada");
			retorno = TipoPrimitivo.INVALIDO;
		}

		return retorno;
	}

	@Override
	public Object visit(Int int1, Object o) {

		return TipoPrimitivo.INTEGER;
	}

	@Override
	public Object visit(Bool bool, Object o) {

		return TipoPrimitivo.BOOLEAN;
	}

	@Override
	public Object visit(StringLiteral stringLiteral, Object o) {

		return TipoPrimitivo.STRING;
	}

	private TipoPrimitivo acceptBooleano(Expressao expressao) {
		TipoPrimitivo filho1;
		TipoPrimitivo filho2;
		TipoPrimitivo retorno;

		filho1 = (TipoPrimitivo) ((No) expressao.getChild(0)).accept(this,
				TipoPrimitivo.BOOLEAN);

		filho2 = (TipoPrimitivo) ((No) expressao.getChild(1)).accept(this,
				TipoPrimitivo.BOOLEAN);

		if (filho1.equals(filho2) && filho1.equals(TipoPrimitivo.BOOLEAN)) {
			retorno = filho1;
		} else {
			this.consoleError.reportError(expressao, "tipos incosistentes");
			retorno = TipoPrimitivo.INVALIDO;
		}

		return retorno;
	}

	private TipoPrimitivo acceptAritmetico(Expressao expressao) {
		TipoPrimitivo filho1;
		TipoPrimitivo filho2;
		TipoPrimitivo retorno;

		filho1 = (TipoPrimitivo) ((No) expressao.getChild(0)).accept(this,
				TipoPrimitivo.INTEGER);

		filho2 = (TipoPrimitivo) ((No) expressao.getChild(1)).accept(this,
				TipoPrimitivo.INTEGER);

		if (filho1.equals(filho2) && filho1.equals(TipoPrimitivo.INTEGER)) {
			retorno = filho1;
		} else {
			this.consoleError.reportError(expressao,
					"tipos incosistentes na operacao aritmetica");
			retorno = TipoPrimitivo.INVALIDO;
		}

		return retorno;
	}

	private TipoPrimitivo acceptRelacional(Expressao expressao) {
		TipoPrimitivo filho1;
		TipoPrimitivo filho2;
		TipoPrimitivo retorno;

		filho1 = (TipoPrimitivo) ((No) expressao.getChild(0))
				.accept(this, null);

		filho2 = (TipoPrimitivo) ((No) expressao.getChild(1))
				.accept(this, null);

		if (filho1.equals(filho2)) {
			retorno = TipoPrimitivo.BOOLEAN;
		} else {
			this.consoleError.reportError(expressao,
					"tipos incosistentes na operacao booleana");
			retorno = TipoPrimitivo.INVALIDO;
		}

		return retorno;
	}

}