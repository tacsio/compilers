import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        LBLexer lex = new LBLexer(new ANTLRFileStream("/home/CIN/tcs5/Desktop/Compiladores/limited_basic/ANTLR/output/__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        LBParser g = new LBParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}