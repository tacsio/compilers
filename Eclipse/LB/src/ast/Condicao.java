package ast;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class Condicao extends No {
	private static int EXPRESSAO = 0;

	public Condicao(Token payload) {
		super(payload);

	}

	public Expressao getExpressao() {
		Expressao retorno;

		if (this.getChild(EXPRESSAO) instanceof Expressao) {
			retorno = (Expressao) this.getChild(EXPRESSAO);
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
