package ast.terminais;

import org.antlr.runtime.Token;

import visitor.Visitor;
import ast.Expressao;

public class Int extends Expressao {

	public Int(Token payload) {
		super(payload);

	}

	/**
	 * retorna o valor do INT que esta decorado na arvore
	 * 
	 * @return
	 */
	public int getValue() {
		return Integer.parseInt(this.getText());
	}

	@Override
	public Object accept(Visitor visitor, Object o) {

		return visitor.visit(this, o);
	}

}
