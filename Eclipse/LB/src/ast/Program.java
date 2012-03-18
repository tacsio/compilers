package ast;

import org.antlr.runtime.Token;

import visitor.Visitor;
import ast.terminais.Id;

public class Program extends No {

	private static int NAME = 0;
	private static int GLOBAL_VARS = 1;
	private static int DECLARACOES = 2;
	private static int STATEMENTS = 3;

	public Program(Token payload) {
		super(payload);
	}

	public Id getName() {
		Id retorno;

		if (this.getChild(NAME) instanceof Id) {
			retorno = (Id) this.getChild(NAME);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public GlobalVars getVariaveisGlobais() {
		GlobalVars retorno;

		if (this.getChild(GLOBAL_VARS) instanceof GlobalVars) {
			retorno = (GlobalVars) this.getChild(GLOBAL_VARS);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public Decls getDeclaracoes() {
		Decls retorno;

		if (this.getChild(DECLARACOES) instanceof Decls) {
			retorno = (Decls) this.getChild(DECLARACOES);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public Stms getStatements() {
		Stms retorno;

		if (this.getChild(STATEMENTS) instanceof Stms) {
			retorno = (Stms) this.getChild(STATEMENTS);
		} else {
			retorno = null;
		}
		return retorno;
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		return visitor.visit(this, o);
	}

}
