package ast;

import java.util.ArrayList;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class GlobalVars extends No{

	public GlobalVars(Token payload) {
		super(payload);
	}

	public ArrayList<GlobalVar> getVariaveisGlobais() {
		ArrayList<GlobalVar> retorno = new ArrayList<GlobalVar>();

		for (Object noFilho : this.getChildren()) {
			if (noFilho instanceof GlobalVar) {
				GlobalVar var = (GlobalVar) noFilho;
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
