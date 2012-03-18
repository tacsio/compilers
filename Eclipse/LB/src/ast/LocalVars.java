package ast;

import java.util.Vector;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class LocalVars extends No {

	public LocalVars(Token payload) {
		super(payload);
	}

	public Vector<LocalVar> getVariaveisLocais() {
		Vector<LocalVar> retorno = new Vector<LocalVar>();

		for (Object noFilho : this.getChildren()) {
			if (noFilho instanceof LocalVar) {
				LocalVar var = (LocalVar) noFilho;
				retorno.add(var);
			}
		}
		return retorno;
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		return visitor.visit(this, o);
	}

}
