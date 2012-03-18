package ast;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class Break extends No {

	public Break(Token payload) {
		super(payload);
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		return visitor.visit(this, o);
	}

}
