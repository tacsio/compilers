package ast;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class LacoWhile extends No {

	private static int CONDICAO = 0;
	private static int STMS = 1;

	public LacoWhile(Token payload) {
		super(payload);
		
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

	public Stms getStatements() {
		Stms retorno;

		if (this.getChild(STMS) instanceof Stms) {
			retorno = (Stms) this.getChild(STMS);
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
