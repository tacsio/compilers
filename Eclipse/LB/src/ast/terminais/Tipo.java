package ast.terminais;

import semantic.TipoPrimitivo;

public class Tipo {

	public static TipoPrimitivo tipo(String name) {

		if (name.equalsIgnoreCase("BOOLEAN")) {
			return TipoPrimitivo.BOOLEAN;
		} else if (name.equalsIgnoreCase("INTEGER")) {
			return TipoPrimitivo.INTEGER;
		} else if (name.equalsIgnoreCase("STRING")) {
			return TipoPrimitivo.STRING;
		} else {
			return TipoPrimitivo.INVALIDO;
		}
	}
}
