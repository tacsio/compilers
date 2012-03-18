package ast;

import java.util.Vector;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class Expressao extends No {

	private static int TERMINAL = 0;
	private static int OPERANDO1 = 0;
	private static int OPERANDO2 = 1;

	public Expressao(Token payload) {
		super(payload);
	}

	public Vector<No> getExpressao() {

		Vector<No> retorno = new Vector<No>();

		if (this.getChildCount() > 1) {
			retorno.add((Expressao) this.getChild(OPERANDO1));
			retorno.add((Expressao) this.getChild(OPERANDO2));
		} else {
			retorno.add((Expressao) this.getChild(TERMINAL));
		}

		return retorno;
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		return visitor.visit(this, o);
	}

}
