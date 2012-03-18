package util;


public class PreProcessador {

	public static void run(String source) {

		Arquivo arq = new Arquivo(source, "main.lbc");

		char atual;

		boolean ehString = false;

		while (!arq.isEndOfFile()) {

			atual = arq.readChar();

			if (atual == '"') {
				arq.print(atual);

				if (ehString) {
					ehString = false;
				} else {
					ehString = true;
				}
			} else if (atual == ' ') {
				arq.print(atual);
			} else if (atual == '\n') {
				arq.print(atual);
			} else if (atual == '\t') {
				arq.print(atual);
			} else if (!ehString && atual >= 'a' && atual <= 'z') {
				arq.print((char) (atual - 32));
			} else {
				arq.print(atual);
			}

		}

		arq.flush();
		arq.close();

	}
}
