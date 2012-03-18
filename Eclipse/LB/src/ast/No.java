package ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import visitor.Visitor;

public abstract class No extends CommonTree {

	public No(Token payload) {
		super(payload);
	}

	public abstract Object accept(Visitor visitor, Object o);
}
