package ast;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class IfThenElse extends No {

	private static int CONDICAO = 0;
	private static int IF_NODE = 1;
	private static int ELSE_NODE = 2;

	public IfThenElse(Token payload) {
		super(payload);

	}

	/**
	 * Primeiro filho do No IF_THEN_ELSE
	 * 
	 * @return
	 */
	public Condicao getCondicao() {
		Condicao retorno;

		if (this.getChild(CONDICAO) instanceof Condicao) {
			retorno = (Condicao) this.getChild(CONDICAO);
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Segundo filho do No
	 * 
	 * @return
	 */
	public IfNode getIfNode() {
		IfNode retorno;

		if (this.getChild(IF_NODE) instanceof IfNode) {
			retorno = (IfNode) this.getChild(IF_NODE);
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Terceiro Filho do No
	 * 
	 * @return
	 */
	public ElseNode getElseNode() {
		ElseNode retorno;

		if (this.getChild(ELSE_NODE) instanceof ElseNode) {
			retorno = (ElseNode) this.getChild(ELSE_NODE);
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
