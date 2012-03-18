package visitor;

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

public interface Visitor {

	public Object visit(Program program, Object o);

	public Object visit(GlobalVars globalVars, Object o);

	public Object visit(GlobalVar var, Object o);

	public Object visit(Decls decls, Object o);

	public Object visit(Func func, Object o);

	public Object visit(Proc proc, Object o);

	public Object visit(LocalVars vars, Object o);

	public Object visit(LocalVar localVar, Object o);

	public Object visit(Params params, Object o);

	public Object visit(Param param, Object o);

	public Object visit(Stms stms, Object o);

	public Object visit(Chamada chamada, Object o);

	public Object visit(Args args, Object o);

	public Object visit(Atribuicao atribuicao, Object o);

	public Object visit(Expressao expressao, Object o);

	public Object visit(IfThenElse ifThenElse, Object o);

	public Object visit(Condicao condicao, Object o);

	public Object visit(IfNode ifNode, Object o);

	public Object visit(ElseNode elseNode, Object o);

	public Object visit(LacoFor lacoFor, Object o);

	public Object visit(LacoWhile lacoWhile, Object o);

	public Object visit(LacoUntil lacoUntil, Object o);

	public Object visit(Break break1, Object o);

	public Object visit(Input input, Object o);

	public Object visit(Print print, Object o);

	public Object visit(Id id, Object o);

	public Object visit(Int int1, Object o);

	public Object visit(Bool bool, Object o);

	public Object visit(StringLiteral stringLiteral, Object o);

}
