package parser;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g 2009-11-30 00:13:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class LBLexer extends Lexer {
    public static final int FUNCTION=10;
    public static final int END_PROCEDURE=29;
    public static final int WHILE=23;
    public static final int MENOR=71;
    public static final int STMS=40;
    public static final int GLOBAL_VARS=62;
    public static final int BREAK_DO=57;
    public static final int OCTAL_ESC=85;
    public static final int INPUT=14;
    public static final int CHAR=68;
    public static final int DO=22;
    public static final int STEP=20;
    public static final int FOR=18;
    public static final int PARAM=50;
    public static final int SUB=76;
    public static final int NEXT_FOR=60;
    public static final int NOT=6;
    public static final int BREAK_FOR=56;
    public static final int ID=63;
    public static final int AND=7;
    public static final int EOF=-1;
    public static final int MENOR_IGUAL=72;
    public static final int MAIOR=69;
    public static final int LPAREN=64;
    public static final int IF=15;
    public static final int AS=9;
    public static final int RPAREN=65;
    public static final int PROG=32;
    public static final int ESC_SEQ=82;
    public static final int THEN=16;
    public static final int STEP_FOR=59;
    public static final int END_FUNCTION=28;
    public static final int CHAMADA=42;
    public static final int LOCAL_VAR=35;
    public static final int LOOP=24;
    public static final int PROC=39;
    public static final int ARGS=33;
    public static final int NEXT=21;
    public static final int F_INPUT=54;
    public static final int COMMENT=80;
    public static final int LIMITE_FOR=58;
    public static final int PARAMS=49;
    public static final int VIRGULA=79;
    public static final int TO=19;
    public static final int UNICODE_ESC=84;
    public static final int ELSE=17;
    public static final int DIFERENTE=74;
    public static final int HEX_DIGIT=83;
    public static final int INT=66;
    public static final int PROCS=37;
    public static final int LOCAL_VARS=61;
    public static final int DECLS=41;
    public static final int MULT=77;
    public static final int T__87=87;
    public static final int TRUE=4;
    public static final int T__86=86;
    public static final int PROCEDURE=12;
    public static final int PRINT=13;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int IF_NODE=51;
    public static final int EXIT_DO=30;
    public static final int LACO_WHILE=46;
    public static final int WS=81;
    public static final int ATRIBUICAO=47;
    public static final int LACO_FOR=44;
    public static final int ELSE_NODE=52;
    public static final int UNTIL=25;
    public static final int FUNC=38;
    public static final int IF_THEN_ELSE=43;
    public static final int F_PRINT=53;
    public static final int OR=8;
    public static final int LACO_UNTIL=45;
    public static final int EXIT_FOR=31;
    public static final int END_IF=27;
    public static final int SOM=75;
    public static final int PROGRAM=26;
    public static final int FUNCS=36;
    public static final int IGUAL=73;
    public static final int DIV=78;
    public static final int END=11;
    public static final int FALSE=5;
    public static final int NAO=55;
    public static final int MAIOR_IGUAL=70;
    public static final int CONDICAO=48;
    public static final int STRING=67;
    public static final int GLOBAL_VAR=34;

    // delegates
    // delegators

    public LBLexer() {;} 
    public LBLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LBLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g"; }

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:3:6: ( 'TRUE' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:3:8: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:4:7: ( 'FALSE' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:4:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:5:5: ( 'NOT' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:5:7: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:6:5: ( 'AND' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:6:7: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:7:4: ( 'OR' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:7:6: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:8:4: ( 'AS' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:8:6: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:9:10: ( 'FUNCTION' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:9:12: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:10:5: ( 'END' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:10:7: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:11:11: ( 'SUB' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:11:13: 'SUB'
            {
            match("SUB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:12:7: ( 'PRINT' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:12:9: 'PRINT'
            {
            match("PRINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "INPUT"
    public final void mINPUT() throws RecognitionException {
        try {
            int _type = INPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:13:7: ( 'INPUT' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:13:9: 'INPUT'
            {
            match("INPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INPUT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:14:4: ( 'IF' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:14:6: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:15:6: ( 'THEN' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:15:8: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:16:6: ( 'ELSE' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:16:8: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:17:5: ( 'FOR' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:17:7: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:18:4: ( 'TO' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:18:6: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "STEP"
    public final void mSTEP() throws RecognitionException {
        try {
            int _type = STEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:19:6: ( 'STEP' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:19:8: 'STEP'
            {
            match("STEP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STEP"

    // $ANTLR start "NEXT"
    public final void mNEXT() throws RecognitionException {
        try {
            int _type = NEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:20:6: ( 'NEXT' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:20:8: 'NEXT'
            {
            match("NEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEXT"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:21:4: ( 'DO' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:21:6: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:22:7: ( 'WHILE' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:22:9: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:23:6: ( 'LOOP' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:23:8: 'LOOP'
            {
            match("LOOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:24:7: ( 'UNTIL' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:24:9: 'UNTIL'
            {
            match("UNTIL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:25:9: ( 'PROGRAM' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:25:11: 'PROGRAM'
            {
            match("PROGRAM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "END_IF"
    public final void mEND_IF() throws RecognitionException {
        try {
            int _type = END_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:26:8: ( 'END IF' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:26:10: 'END IF'
            {
            match("END IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_IF"

    // $ANTLR start "END_FUNCTION"
    public final void mEND_FUNCTION() throws RecognitionException {
        try {
            int _type = END_FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:27:14: ( 'END FUNCTION' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:27:16: 'END FUNCTION'
            {
            match("END FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_FUNCTION"

    // $ANTLR start "END_PROCEDURE"
    public final void mEND_PROCEDURE() throws RecognitionException {
        try {
            int _type = END_PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:28:15: ( 'END SUB' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:28:17: 'END SUB'
            {
            match("END SUB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_PROCEDURE"

    // $ANTLR start "EXIT_DO"
    public final void mEXIT_DO() throws RecognitionException {
        try {
            int _type = EXIT_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:29:9: ( 'EXIT DO' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:29:11: 'EXIT DO'
            {
            match("EXIT DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT_DO"

    // $ANTLR start "EXIT_FOR"
    public final void mEXIT_FOR() throws RecognitionException {
        try {
            int _type = EXIT_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:30:10: ( 'EXIT FOR' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:30:12: 'EXIT FOR'
            {
            match("EXIT FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT_FOR"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:31:7: ( 'BOOLEAN' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:31:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:32:7: ( 'INTEGER' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:32:9: 'INTEGER'
            {
            match("INTEGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:33:7: ( 'STRING' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:33:9: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:34:7: ( 'CHAR' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:34:9: 'CHAR'
            {
            match("CHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:464:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:464:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:464:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:467:5: ( ( '0' .. '9' )+ | LPAREN SUB ( '0' .. '9' )+ RPAREN )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='(') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:467:7: ( '0' .. '9' )+
                    {
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:467:7: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:467:7: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:468:8: LPAREN SUB ( '0' .. '9' )+ RPAREN
                    {
                    mLPAREN(); 
                    mSUB(); 
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:468:19: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:468:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    mRPAREN(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:472:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:472:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:472:14: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:472:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:472:28: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:472:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:473:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:473:14: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:473:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:476:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:476:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:484:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:484:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:484:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:484:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:484:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:487:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:487:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:487:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                alt10=1;
            }
            else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:487:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:487:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "IGUAL"
    public final void mIGUAL() throws RecognitionException {
        try {
            int _type = IGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:491:5: ( '=' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:491:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IGUAL"

    // $ANTLR start "DIFERENTE"
    public final void mDIFERENTE() throws RecognitionException {
        try {
            int _type = DIFERENTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:495:5: ( '<>' | '><' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='<') ) {
                alt11=1;
            }
            else if ( (LA11_0=='>') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:495:9: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:496:9: '><'
                    {
                    match("><"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIFERENTE"

    // $ANTLR start "MENOR"
    public final void mMENOR() throws RecognitionException {
        try {
            int _type = MENOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:500:5: ( '<' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:500:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MENOR"

    // $ANTLR start "MAIOR"
    public final void mMAIOR() throws RecognitionException {
        try {
            int _type = MAIOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:504:5: ( '>' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:504:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAIOR"

    // $ANTLR start "MAIOR_IGUAL"
    public final void mMAIOR_IGUAL() throws RecognitionException {
        try {
            int _type = MAIOR_IGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:508:6: ( '>=' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:508:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAIOR_IGUAL"

    // $ANTLR start "MENOR_IGUAL"
    public final void mMENOR_IGUAL() throws RecognitionException {
        try {
            int _type = MENOR_IGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:512:6: ( '<=' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:512:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MENOR_IGUAL"

    // $ANTLR start "VIRGULA"
    public final void mVIRGULA() throws RecognitionException {
        try {
            int _type = VIRGULA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:516:5: ( ',' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:516:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VIRGULA"

    // $ANTLR start "SOM"
    public final void mSOM() throws RecognitionException {
        try {
            int _type = SOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:520:5: ( '+' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:520:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOM"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:524:5: ( '-' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:524:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:528:5: ( '*' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:528:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:532:5: ( '/' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:532:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:537:5: ( '(' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:537:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:541:5: ( ')' )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:541:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:546:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:546:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:550:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt12=1;
                    }
                    break;
                case 'u':
                    {
                    alt12=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt12=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:550:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:551:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:552:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:557:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\\') ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='3')) ) {
                    int LA13_2 = input.LA(3);

                    if ( ((LA13_2>='0' && LA13_2<='7')) ) {
                        int LA13_4 = input.LA(4);

                        if ( ((LA13_4>='0' && LA13_4<='7')) ) {
                            alt13=1;
                        }
                        else {
                            alt13=2;}
                    }
                    else {
                        alt13=3;}
                }
                else if ( ((LA13_1>='4' && LA13_1<='7')) ) {
                    int LA13_3 = input.LA(3);

                    if ( ((LA13_3>='0' && LA13_3<='7')) ) {
                        alt13=2;
                    }
                    else {
                        alt13=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:557:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:557:14: ( '0' .. '3' )
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:557:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:557:25: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:557:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:557:36: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:557:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:558:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:558:14: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:558:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:558:25: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:558:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:559:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:559:14: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:559:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:564:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:564:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:8: ( TRUE | FALSE | NOT | AND | OR | AS | FUNCTION | END | PROCEDURE | PRINT | INPUT | IF | THEN | ELSE | FOR | TO | STEP | NEXT | DO | WHILE | LOOP | UNTIL | PROGRAM | END_IF | END_FUNCTION | END_PROCEDURE | EXIT_DO | EXIT_FOR | T__86 | T__87 | T__88 | T__89 | ID | INT | COMMENT | WS | STRING | CHAR | IGUAL | DIFERENTE | MENOR | MAIOR | MAIOR_IGUAL | MENOR_IGUAL | VIRGULA | SOM | SUB | MULT | DIV | LPAREN | RPAREN )
        int alt14=51;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:10: TRUE
                {
                mTRUE(); 

                }
                break;
            case 2 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:15: FALSE
                {
                mFALSE(); 

                }
                break;
            case 3 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:21: NOT
                {
                mNOT(); 

                }
                break;
            case 4 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:25: AND
                {
                mAND(); 

                }
                break;
            case 5 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:29: OR
                {
                mOR(); 

                }
                break;
            case 6 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:32: AS
                {
                mAS(); 

                }
                break;
            case 7 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:35: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 8 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:44: END
                {
                mEND(); 

                }
                break;
            case 9 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:48: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 10 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:58: PRINT
                {
                mPRINT(); 

                }
                break;
            case 11 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:64: INPUT
                {
                mINPUT(); 

                }
                break;
            case 12 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:70: IF
                {
                mIF(); 

                }
                break;
            case 13 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:73: THEN
                {
                mTHEN(); 

                }
                break;
            case 14 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:78: ELSE
                {
                mELSE(); 

                }
                break;
            case 15 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:83: FOR
                {
                mFOR(); 

                }
                break;
            case 16 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:87: TO
                {
                mTO(); 

                }
                break;
            case 17 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:90: STEP
                {
                mSTEP(); 

                }
                break;
            case 18 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:95: NEXT
                {
                mNEXT(); 

                }
                break;
            case 19 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:100: DO
                {
                mDO(); 

                }
                break;
            case 20 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:103: WHILE
                {
                mWHILE(); 

                }
                break;
            case 21 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:109: LOOP
                {
                mLOOP(); 

                }
                break;
            case 22 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:114: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 23 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:120: PROGRAM
                {
                mPROGRAM(); 

                }
                break;
            case 24 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:128: END_IF
                {
                mEND_IF(); 

                }
                break;
            case 25 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:135: END_FUNCTION
                {
                mEND_FUNCTION(); 

                }
                break;
            case 26 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:148: END_PROCEDURE
                {
                mEND_PROCEDURE(); 

                }
                break;
            case 27 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:162: EXIT_DO
                {
                mEXIT_DO(); 

                }
                break;
            case 28 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:170: EXIT_FOR
                {
                mEXIT_FOR(); 

                }
                break;
            case 29 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:179: T__86
                {
                mT__86(); 

                }
                break;
            case 30 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:185: T__87
                {
                mT__87(); 

                }
                break;
            case 31 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:191: T__88
                {
                mT__88(); 

                }
                break;
            case 32 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:197: T__89
                {
                mT__89(); 

                }
                break;
            case 33 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:203: ID
                {
                mID(); 

                }
                break;
            case 34 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:206: INT
                {
                mINT(); 

                }
                break;
            case 35 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:210: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 36 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:218: WS
                {
                mWS(); 

                }
                break;
            case 37 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:221: STRING
                {
                mSTRING(); 

                }
                break;
            case 38 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:228: CHAR
                {
                mCHAR(); 

                }
                break;
            case 39 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:233: IGUAL
                {
                mIGUAL(); 

                }
                break;
            case 40 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:239: DIFERENTE
                {
                mDIFERENTE(); 

                }
                break;
            case 41 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:249: MENOR
                {
                mMENOR(); 

                }
                break;
            case 42 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:255: MAIOR
                {
                mMAIOR(); 

                }
                break;
            case 43 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:261: MAIOR_IGUAL
                {
                mMAIOR_IGUAL(); 

                }
                break;
            case 44 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:273: MENOR_IGUAL
                {
                mMENOR_IGUAL(); 

                }
                break;
            case 45 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:285: VIRGULA
                {
                mVIRGULA(); 

                }
                break;
            case 46 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:293: SOM
                {
                mSOM(); 

                }
                break;
            case 47 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:297: SUB
                {
                mSUB(); 

                }
                break;
            case 48 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:301: MULT
                {
                mMULT(); 

                }
                break;
            case 49 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:306: DIV
                {
                mDIV(); 

                }
                break;
            case 50 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:310: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 51 :
                // /home/tarcisio/Desktop/Compiladores/Projeto/ProjetoCompiladores/limited_basic/ANTLR/LB.g:1:317: RPAREN
                {
                mRPAREN(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\17\20\2\uffff\1\70\1\72\4\uffff\1\75\1\77\5\uffff\2\20"+
        "\1\102\6\20\1\111\1\112\7\20\1\125\1\126\5\20\10\uffff\2\20\1\uffff"+
        "\2\20\1\140\1\141\1\20\1\143\2\uffff\1\145\2\20\1\150\6\20\2\uffff"+
        "\5\20\1\164\1\165\2\20\2\uffff\1\170\3\uffff\1\174\1\20\1\uffff"+
        "\1\176\6\20\1\u0085\2\20\1\u0088\2\uffff\1\u0089\1\20\7\uffff\1"+
        "\20\1\u008e\1\20\1\u0090\1\20\1\u0092\1\uffff\1\u0093\1\20\2\uffff"+
        "\1\20\2\uffff\1\u0096\1\uffff\1\20\1\uffff\1\20\2\uffff\2\20\1\uffff"+
        "\1\u009b\1\u009c\1\u009d\1\u009e\4\uffff";
    static final String DFA14_eofS =
        "\u009f\uffff";
    static final String DFA14_minS =
        "\1\11\1\110\1\101\1\105\1\116\1\122\1\114\1\124\1\122\1\106\1\117"+
        "\1\110\1\117\1\116\1\117\1\110\2\uffff\1\55\1\52\4\uffff\1\75\1"+
        "\74\5\uffff\1\125\1\105\1\44\1\114\1\116\1\122\1\124\1\130\1\104"+
        "\2\44\1\104\1\123\1\111\1\102\1\105\1\111\1\120\2\44\1\111\1\117"+
        "\1\124\1\117\1\101\10\uffff\1\105\1\116\1\uffff\1\123\1\103\2\44"+
        "\1\124\1\44\2\uffff\1\40\1\105\1\124\1\44\1\120\1\111\1\116\1\107"+
        "\1\125\1\105\2\uffff\1\114\1\120\1\111\1\114\1\122\2\44\1\105\1"+
        "\124\2\uffff\1\44\1\uffff\1\106\1\uffff\1\44\1\40\1\uffff\1\44\1"+
        "\116\1\124\1\122\1\124\1\107\1\105\1\44\1\114\1\105\1\44\2\uffff"+
        "\1\44\1\111\5\uffff\1\104\1\uffff\1\107\1\44\1\101\1\44\1\105\1"+
        "\44\1\uffff\1\44\1\101\2\uffff\1\117\2\uffff\1\44\1\uffff\1\115"+
        "\1\uffff\1\122\2\uffff\2\116\1\uffff\4\44\4\uffff";
    static final String DFA14_maxS =
        "\1\172\1\122\1\125\1\117\1\123\1\122\1\130\1\125\1\122\1\116\1\117"+
        "\1\110\1\117\1\116\1\117\1\110\2\uffff\1\55\1\57\4\uffff\1\76\1"+
        "\75\5\uffff\1\125\1\105\1\172\1\114\1\116\1\122\1\124\1\130\1\104"+
        "\2\172\1\104\1\123\1\111\1\102\1\122\1\117\1\124\2\172\1\111\1\117"+
        "\1\124\1\117\1\101\10\uffff\1\105\1\116\1\uffff\1\123\1\103\2\172"+
        "\1\124\1\172\2\uffff\1\172\1\105\1\124\1\172\1\120\1\111\1\116\1"+
        "\107\1\125\1\105\2\uffff\1\114\1\120\1\111\1\114\1\122\2\172\1\105"+
        "\1\124\2\uffff\1\172\1\uffff\1\123\1\uffff\1\172\1\40\1\uffff\1"+
        "\172\1\116\1\124\1\122\1\124\1\107\1\105\1\172\1\114\1\105\1\172"+
        "\2\uffff\1\172\1\111\5\uffff\1\106\1\uffff\1\107\1\172\1\101\1\172"+
        "\1\105\1\172\1\uffff\1\172\1\101\2\uffff\1\117\2\uffff\1\172\1\uffff"+
        "\1\115\1\uffff\1\122\2\uffff\2\116\1\uffff\4\172\4\uffff";
    static final String DFA14_acceptS =
        "\20\uffff\1\41\1\42\2\uffff\1\44\1\45\1\46\1\47\2\uffff\1\55\1\56"+
        "\1\57\1\60\1\63\31\uffff\1\62\1\43\1\61\1\50\1\54\1\51\1\53\1\52"+
        "\2\uffff\1\20\6\uffff\1\6\1\5\12\uffff\1\14\1\23\11\uffff\1\17\1"+
        "\3\1\uffff\1\4\1\uffff\1\10\2\uffff\1\11\13\uffff\1\1\1\15\2\uffff"+
        "\1\22\1\30\1\31\1\32\1\16\1\uffff\1\21\6\uffff\1\25\2\uffff\1\40"+
        "\1\2\1\uffff\1\33\1\34\1\uffff\1\12\1\uffff\1\13\1\uffff\1\24\1"+
        "\26\2\uffff\1\37\4\uffff\1\27\1\36\1\35\1\7";
    static final String DFA14_specialS =
        "\u009f\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\1\uffff\1\25\1\uffff\1\20\2"+
            "\uffff\1\26\1\22\1\36\1\35\1\33\1\32\1\34\1\uffff\1\23\12\21"+
            "\2\uffff\1\30\1\27\1\31\2\uffff\1\4\1\16\1\17\1\12\1\6\1\2\2"+
            "\20\1\11\2\20\1\14\1\20\1\3\1\5\1\10\2\20\1\7\1\1\1\15\1\20"+
            "\1\13\3\20\4\uffff\1\20\1\uffff\32\20",
            "\1\40\6\uffff\1\41\2\uffff\1\37",
            "\1\42\15\uffff\1\44\5\uffff\1\43",
            "\1\46\11\uffff\1\45",
            "\1\47\4\uffff\1\50",
            "\1\51",
            "\1\53\1\uffff\1\52\11\uffff\1\54",
            "\1\56\1\55",
            "\1\57",
            "\1\61\7\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "\1\21",
            "\1\71\4\uffff\1\71",
            "",
            "",
            "",
            "",
            "\1\74\1\73",
            "\1\73\1\76",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117\14\uffff\1\120",
            "\1\121\5\uffff\1\122",
            "\1\123\3\uffff\1\124",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\142",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "",
            "",
            "\1\144\3\uffff\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1"+
            "\20\1\uffff\32\20",
            "\1\146",
            "\1\147",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\166",
            "\1\167",
            "",
            "",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "",
            "\1\172\2\uffff\1\171\11\uffff\1\173",
            "",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\175",
            "",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\u0086",
            "\1\u0087",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "",
            "",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "",
            "\1\u008b\1\uffff\1\u008c",
            "",
            "\1\u008d",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\u008f",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\u0091",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\u0094",
            "",
            "",
            "\1\u0095",
            "",
            "",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "",
            "",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( TRUE | FALSE | NOT | AND | OR | AS | FUNCTION | END | PROCEDURE | PRINT | INPUT | IF | THEN | ELSE | FOR | TO | STEP | NEXT | DO | WHILE | LOOP | UNTIL | PROGRAM | END_IF | END_FUNCTION | END_PROCEDURE | EXIT_DO | EXIT_FOR | T__86 | T__87 | T__88 | T__89 | ID | INT | COMMENT | WS | STRING | CHAR | IGUAL | DIFERENTE | MENOR | MAIOR | MAIOR_IGUAL | MENOR_IGUAL | VIRGULA | SOM | SUB | MULT | DIV | LPAREN | RPAREN );";
        }
    }
 

}