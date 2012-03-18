package ast;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class LacoUntil extends No {
	private static int STMS = 0;
	private static int CONDICAO = 1;

	public LacoUntil(Token payload) {
		super(payload);

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

	public Condicao getCondicao() {
		Condicao retorno;

		if (this.getChild(CONDICAO) instanceof Condicao) {
			retorno = (Condicao) this.getChild(CONDICAO);
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
