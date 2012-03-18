package ast;

import org.antlr.runtime.Token;

import visitor.Visitor;
import ast.terminais.Id;

public class Chamada extends Expressao {

	public static int ID = 0;
	public static int ARGS = 1;

	public Chamada(Token payload) {
		super(payload);

	}

	public Id getId() {

		if (this.getChild(ID) instanceof Id) {
			return (Id) this.getChild(ID);
		} else {
			return null;
		}
	}

	public Args getArgs() {

		if (this.getChild(ARGS) instanceof Args) {
			return (Args) this.getChild(ARGS);
		} else {
			return null;
		}
	}

	@Override
	public Object accept(Visitor visitor, Object o) {

		return visitor.visit(this, o);
	}

}
