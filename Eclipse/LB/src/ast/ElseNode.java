package ast;

import org.antlr.runtime.Token;

import visitor.Visitor;

public class ElseNode extends No{

	public static int STMS = 0;
	
	public ElseNode(Token payload) {
		super(payload);
		
	}
	
	public Stms getStms (){
			
		if(this.getChild(STMS) instanceof Stms){
			return (Stms) this.getChild(STMS);
		}else{
			return null;
		}
			
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
	
		return visitor.visit(this, o);
	}

}
