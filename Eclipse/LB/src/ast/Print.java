package ast;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class Print extends No {

	public Print(Token payload) {
		super(payload);

	}

	@Override
	public Object accept(Visitor visitor, Object o) {

		return visitor.visit(this, o);
	}

}
