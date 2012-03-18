package ast;

import org.antlr.runtime.Token;

import ast.terminais.Id;

import visitor.Visitor;

public class Proc extends No {

	private static int ID = 0;
	private static int PARAMS = 1;
	private static int LOCALVARS = 2;
	private static int STMS = 3;

	public Proc(Token payload) {
		super(payload);

	}

	public Id getName() {
		Id retorno;

		if (this.getChild(ID) instanceof Id) {
			retorno = (Id) this.getChild(ID);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public Params getParametros() {
		Params retorno;

		if (this.getChild(PARAMS) instanceof Params) {
			retorno = (Params) this.getChild(PARAMS);
		} else {
			retorno = null;
		}

		return retorno;
	}

	public LocalVars getVariaveis() {
		LocalVars retorno;

		if (this.getChild(LOCALVARS) instanceof LocalVars) {
			retorno = (LocalVars) this.getChild(LOCALVARS);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public Stms getStatements() {
		Stms retorno;

		if (this.getChild(STMS) instanceof Stms) {
			retorno = (Stms) this.getChild(STMS);
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
