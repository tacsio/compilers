package compilator;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import parser.LBLexer;
import parser.LBParser;
import semantic.Checker;
import semantic.TreeAdaptor;
import util.PreProcessador;
import ast.Program;
import encoder.Encoder;

public class Driver {

	public static void main(String[] args) {

		try {
			PreProcessador.run("main.lb");
			ANTLRFileStream entrada = new ANTLRFileStream("main.lbc");

			LBLexer lex = new LBLexer(entrada);

			CommonTokenStream tokens = new CommonTokenStream(lex);

			LBParser parser = new LBParser(tokens);

			parser.setTreeAdaptor(new TreeAdaptor());

			Program program = (Program) parser.program().getTree();

			Checker check = new Checker();

			Encoder encoderDotNet = new Encoder("main.il");
			try {
				check.visit(program, null);
			} catch (Exception e) {
				System.err.println("Semantic Fatal Error!");
			}
			try {
				encoderDotNet.visit(program, null);
			} catch (Exception e) {
				System.err.println("Encoder Fatal Error!");
			}

			System.out.println("Compilacao Finalizada");
			System.out.println("Quantidade de erros: "
					+ (check.consoleError.getNumberErros() + parser
							.getNumberOfSyntaxErrors()));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
}
