package ast.terminais;

import org.antlr.runtime.Token;

import visitor.Visitor;
import ast.Expressao;

public class Bool extends Expressao {

	public Bool(Token payload) {
		super(payload);
	}

	/**
	 * Retorna o terminal booleano
	 * 
	 * @return
	 */
	public boolean getValue() {
		return Boolean.parseBoolean(this.getText());
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		return visitor.visit(this, o);
	}

}
