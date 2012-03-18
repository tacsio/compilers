package ast;

import org.antlr.runtime.Token;

import ast.terminais.Id;

import visitor.Visitor;

public class LacoFor extends No {

	private static int ATRIBUICAO = 0;
	private static int LIMITEFOR = 1;
	private static int STEPFOR = 2;
	private static int STMS = 3;
	private static int NEXTFOR = 4;

	public LacoFor(Token payload) {
		super(payload);

	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		return visitor.visit(this, o);
	}

	public Atribuicao getAtribuicao() {
		Atribuicao retorno;

		if (this.getChild(ATRIBUICAO) instanceof Atribuicao) {
			retorno = (Atribuicao) this.getChild(ATRIBUICAO);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public Expressao getLimiteFor() {
		Expressao retorno;

		if (this.getChild(LIMITEFOR) instanceof Expressao) {
			retorno = (Expressao) this.getChild(LIMITEFOR).getChild(0);
		} else {
			retorno = null;
		}
		return retorno;
	}

	public Expressao getStepFor() {

		Expressao retorno;

		if (this.getChild(STEPFOR) instanceof Expressao) {
			retorno = (Expressao) this.getChild(STEPFOR).getChild(0);
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

	public Id getNextFor() {
		Id retorno;

		if (this.getChild(NEXTFOR) instanceof Id) {
			retorno = (Id) this.getChild(NEXTFOR);
		} else {
			retorno = null;
		}

		return retorno;
	}

}
