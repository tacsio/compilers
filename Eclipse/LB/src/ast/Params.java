package ast;

import java.util.Vector;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class Params extends No {

	public Params(Token payload) {
		super(payload);

	}

	public Vector<Param> getParametros() {
		Vector<Param> retorno = new Vector<Param>();

		for (Object noFilho : this.getChildren()) {
			if (noFilho instanceof Param) {
				Param parametro = (Param) noFilho;
				retorno.add(parametro);
			}
		}
		return retorno;
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		
		return visitor.visit(this, o);
	}

}
