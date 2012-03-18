package ast;

import org.antlr.runtime.Token;

import semantic.TipoPrimitivo;
import visitor.Visitor;
import ast.terminais.Id;
import ast.terminais.Tipo;

public class Func extends No {

	private static int ID = 0;
	private static int RETURN = 1;
	private static int PARAMS = 2;
	private static int VARS = 3;
	private static int STMS = 4;

	public Func(Token payload) {
		super(payload);
	}

	public Id getName() {
		Id retorno;

		if (this.getChild(ID) instanceof Id) {
			retorno = (Id) this.getChild(ID);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public TipoPrimitivo getRetorno() {
		return Tipo.tipo(this.getChild(RETURN).getText());
	}

	public Params getParametros() {
		Params retorno;

		if (this.getChild(PARAMS) instanceof Params) {
			retorno = (Params) this.getChild(PARAMS);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public LocalVars getVariaveis() {
		LocalVars retorno;

		if (this.getChild(VARS) instanceof LocalVars) {
			retorno = (LocalVars) this.getChild(VARS);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public Stms getStatements() {
		Stms retorno;

		if (this.getChild(STMS) instanceof Stms) {
			retorno = (Stms) this.getChild(STMS);
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
