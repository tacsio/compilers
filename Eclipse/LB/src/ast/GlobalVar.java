package ast;

import java.util.Vector;

import org.antlr.runtime.Token;

import semantic.TipoPrimitivo;
import visitor.Visitor;
import ast.terminais.Id;
import ast.terminais.Tipo;

public class GlobalVar extends No {

	private static int TIPO = 0;

	public GlobalVar(Token payload) {
		super(payload);
	}

	public TipoPrimitivo getTipo() {
		return Tipo.tipo(this.getChild(TIPO).getText());
	}

	public Vector<Id> getId() {
		Vector<Id> retorno = new Vector<Id>();

		for (Object noFilho : this.getChildren()) {
			if (noFilho instanceof Id) {
				Id identificador = (Id) noFilho;
				retorno.add(identificador);
			}
		}
		return retorno;
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		return visitor.visit(this, o);
	}

}
