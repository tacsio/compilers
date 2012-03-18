package ast;

import org.antlr.runtime.Token;

import ast.terminais.Id;
import ast.terminais.Tipo;

import semantic.TipoPrimitivo;
import visitor.Visitor;

public class Param extends No {

	private static int ID = 0;
	private static int TIPO = 1;

	public Param(Token payload) {
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

	public TipoPrimitivo getTipo() {
		return Tipo.tipo(this.getChild(TIPO).getText());
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
	
		return visitor.visit(this, o);
	}

}
