package ast;

import java.util.Vector;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class Stms extends No{

	public Stms(Token payload) {
		super(payload);
	}
	
	public Vector<No> getFilhos(){
		Vector<No> retorno = new Vector<No>();

		for (Object noFilho : this.getChildren()) {
			if (noFilho instanceof No) {
				No no = (No) noFilho;
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
