package semantic;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

import parser.LBParser;
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

public class TreeAdaptor extends CommonTreeAdaptor {

	@Override
	public Object create(Token payload) {

		if (payload != null) {
			switch (payload.getType()) {

			case LBParser.PROG:
				return new Program(payload);
			case LBParser.ID:
				return new Id(payload);
			case LBParser.GLOBAL_VARS:
				return new GlobalVars(payload);
			case LBParser.GLOBAL_VAR:
				return new GlobalVar(payload);
			case LBParser.DECLS:
				return new Decls(payload);
			case LBParser.PROC:
				return new Proc(payload);
			case LBParser.FUNC:
				return new Func(payload);
			case LBParser.LOCAL_VARS:
				return new LocalVars(payload);
			case LBParser.LOCAL_VAR:
				return new LocalVar(payload);
			case LBParser.PARAMS:
				return new Params(payload);
			case LBParser.PARAM:
				return new Param(payload);
			case LBParser.ARGS:
				return new Args(payload);
			case LBParser.CONDICAO:
				return new Condicao(payload);
			case LBParser.LIMITE_FOR:
				return new Int(payload);
			case LBParser.STEP_FOR:
				return new Int(payload);
			case LBParser.NEXT_FOR:
				return new Id(payload);
			case LBParser.IF_THEN_ELSE:
				return new IfThenElse(payload);
			case LBParser.ELSE_NODE:
				return new ElseNode(payload);
			case LBParser.IF_NODE:
				return new IfNode(payload);
			case LBParser.STMS:
				return new Stms(payload);
			case LBParser.CHAMADA:
				return new Chamada(payload);
			case LBParser.LACO_FOR:
				return new LacoFor(payload);
			case LBParser.LACO_UNTIL:
				return new LacoUntil(payload);
			case LBParser.LACO_WHILE:
				return new LacoWhile(payload);
			case LBParser.ATRIBUICAO:
				return new Atribuicao(payload);
			case LBParser.STRING:
				return new StringLiteral(payload);
			case LBParser.TRUE:
				return new Bool(payload);
			case LBParser.FALSE:
				return new Bool(payload);
			case LBParser.INT:
				return new Int(payload);
			case LBParser.IGUAL:
				return new Expressao(payload);
			case LBParser.DIFERENTE:
				return new Expressao(payload);
			case LBParser.MAIOR:
				return new Expressao(payload);
			case (LBParser.MAIOR_IGUAL):
				return new Expressao(payload);
			case LBParser.MENOR:
				return new Expressao(payload);
			case LBParser.MENOR_IGUAL:
				return new Expressao(payload);
			case LBParser.AND:
				return new Expressao(payload);
			case LBParser.OR:
				return new Expressao(payload);
			case LBParser.NAO:
				return new Expressao(payload);
			case LBParser.SOM:
				return new Expressao(payload);
			case LBParser.SUB:
				return new Expressao(payload);
			case LBParser.MULT:
				return new Expressao(payload);
			case LBParser.DIV:
				return new Expressao(payload);
			case LBParser.F_PRINT:
				return new Print(payload);
			case LBParser.F_INPUT:
				return new Input(payload);
			case LBParser.BREAK_FOR:
				return new Break(payload);
			case LBParser.BREAK_DO:
				return new Break(payload);
			}
		}
		return super.create(payload);
	}
}
