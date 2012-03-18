package util;

import org.antlr.runtime.tree.CommonTree;

public class ReportError {

	private int qtdErrors;

	public int getNumberErros() {
		return this.qtdErrors;
	}

	public void reportError(CommonTree node, String description) {
		this.qtdErrors++;
		System.err.printf("Error %d (Linha %d, Coluna %d): %s\n",
				getNumberErros(), node.getLine(), node.getCharPositionInLine(),
				description);
	}
}
