package ast;

import java.util.Vector;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class Args extends No {

	public Args(Token payload) {
		super(payload);

	}

	public Vector<Expressao> getArgumentos() {
		Vector<Expressao> retorno = new Vector<Expressao>();

		for (Object noFilho : this.getChildren()) {
			if (noFilho instanceof Expressao) {
				Expressao no = (Expressao) noFilho;
				retorno.add(no);
			}
		}
		return retorno;
	}

	@Override
	public Object accept(Visitor visitor, Object o) {

		return visitor.visit(this, o);
	}
}
