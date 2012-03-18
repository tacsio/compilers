package ast.terminais;

import org.antlr.runtime.Token;

import visitor.Visitor;
import ast.Expressao;

public class StringLiteral extends Expressao {

	public StringLiteral(Token payload) {
		super(payload);
		
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		return visitor.visit(this, o);
	}

}
