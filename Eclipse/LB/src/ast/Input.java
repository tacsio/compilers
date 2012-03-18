package ast;

import java.util.Vector;

import ast.terminais.Id;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class Input extends No {

	public Input(Token payload) {
		super(payload);
	}

	public Vector<Id> getVariaveis() {
		Vector<Id> retorno = new Vector<Id>();

		for (Object noFilho : this.getChildren()) {
			if (noFilho instanceof Id) {
				Id id = (Id) noFilho;
				retorno.add(id);
			}
		}
		return retorno;
	}

	@Override
	public Object accept(Visitor visitor, Object o) {

		return visitor.visit(this, o);
	}

}
