package ast;

import org.antlr.runtime.Token;

import ast.terminais.Id;

import visitor.Visitor;

public class Atribuicao extends No {

	private static int ID = 0;
	private static int EXPRESSAO = 1;

	public Atribuicao(Token payload) {
		super(payload);

	}

	public Id getId() {
		Id retorno;

		if (this.getChild(ID) instanceof Id) {
			retorno = (Id) this.getChild(ID);
		} else {
			retorno = null;
		}
		return retorno;
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
