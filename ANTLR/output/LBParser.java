// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g 2009-11-27 15:14:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LBParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TRUE", "FALSE", "NOT", "AND", "OR", "AS", "FUNCTION", "END", "PROCEDURE", "PRINT", "INPUT", "IF", "THEN", "ELSE", "FOR", "TO", "STEP", "NEXT", "DO", "WHILE", "LOOP", "UNTIL", "PROGRAM", "END_IF", "END_FUNCTION", "END_PROCEDURE", "EXIT_DO", "EXIT_FOR", "PROG", "ARGS", "GLOBAL_VAR", "LOCAL_VAR", "FUNCS", "PROCS", "FUNC", "PROC", "STMS", "DECLS", "CHAMADA", "IF_THEN_ELSE", "LACO_FOR", "LACO_UNTIL", "LACO_WHILE", "ATRIBUICAO", "CONDICAO", "PARAMS", "PARAM", "IF_NODE", "ELSE_NODE", "F_PRINT", "F_INPUT", "NAO", "BREAK_FOR", "BREAK_DO", "LIMITE_FOR", "STEP_FOR", "NEXT_FOR", "LOCAL_VARS", "GLOBAL_VARS", "ID", "LPAREN", "RPAREN", "INT", "STRING", "CHAR", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "IGUAL", "DIFERENTE", "SOM", "SUB", "MULT", "DIV", "VIRGULA", "COMMENT", "WS", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'BOOLEAN'", "'INTEGER'", "'STRING'", "'CHAR'"
    };
    public static final int FUNCTION=10;
    public static final int END_PROCEDURE=29;
    public static final int WHILE=23;
    public static final int MENOR=71;
    public static final int STMS=40;
    public static final int GLOBAL_VARS=62;
    public static final int OCTAL_ESC=85;
    public static final int BREAK_DO=57;
    public static final int CHAR=68;
    public static final int INPUT=14;
    public static final int FOR=18;
    public static final int STEP=20;
    public static final int DO=22;
    public static final int SUB=76;
    public static final int PARAM=50;
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
    public static final int LOCAL_VARS=61;
    public static final int PROCS=37;
    public static final int MULT=77;
    public static final int DECLS=41;
    public static final int TRUE=4;
    public static final int T__87=87;
    public static final int PRINT=13;
    public static final int PROCEDURE=12;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int IF_NODE=51;
    public static final int WS=81;
    public static final int LACO_WHILE=46;
    public static final int EXIT_DO=30;
    public static final int ATRIBUICAO=47;
    public static final int LACO_FOR=44;
    public static final int ELSE_NODE=52;
    public static final int UNTIL=25;
    public static final int FUNC=38;
    public static final int F_PRINT=53;
    public static final int IF_THEN_ELSE=43;
    public static final int LACO_UNTIL=45;
    public static final int OR=8;
    public static final int EXIT_FOR=31;
    public static final int END_IF=27;
    public static final int SOM=75;
    public static final int PROGRAM=26;
    public static final int IGUAL=73;
    public static final int FUNCS=36;
    public static final int DIV=78;
    public static final int END=11;
    public static final int NAO=55;
    public static final int FALSE=5;
    public static final int MAIOR_IGUAL=70;
    public static final int CONDICAO=48;
    public static final int STRING=67;
    public static final int GLOBAL_VAR=34;

    // delegates
    // delegators


        public LBParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LBParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LBParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:79:1: program : PROGRAM nomePrograma listaVariavelGlobal listaDeclaracao listaStatement END -> ^( PROG ^( nomePrograma ) ^( GLOBAL_VARS ( listaVariavelGlobal )? ) ^( DECLS ( listaDeclaracao )? ) ^( STMS ( listaStatement )? ) ) ;
    public final LBParser.program_return program() throws RecognitionException {
        LBParser.program_return retval = new LBParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROGRAM1=null;
        Token END6=null;
        LBParser.nomePrograma_return nomePrograma2 = null;

        LBParser.listaVariavelGlobal_return listaVariavelGlobal3 = null;

        LBParser.listaDeclaracao_return listaDeclaracao4 = null;

        LBParser.listaStatement_return listaStatement5 = null;


        CommonTree PROGRAM1_tree=null;
        CommonTree END6_tree=null;
        RewriteRuleTokenStream stream_PROGRAM=new RewriteRuleTokenStream(adaptor,"token PROGRAM");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_listaVariavelGlobal=new RewriteRuleSubtreeStream(adaptor,"rule listaVariavelGlobal");
        RewriteRuleSubtreeStream stream_listaDeclaracao=new RewriteRuleSubtreeStream(adaptor,"rule listaDeclaracao");
        RewriteRuleSubtreeStream stream_listaStatement=new RewriteRuleSubtreeStream(adaptor,"rule listaStatement");
        RewriteRuleSubtreeStream stream_nomePrograma=new RewriteRuleSubtreeStream(adaptor,"rule nomePrograma");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:79:9: ( PROGRAM nomePrograma listaVariavelGlobal listaDeclaracao listaStatement END -> ^( PROG ^( nomePrograma ) ^( GLOBAL_VARS ( listaVariavelGlobal )? ) ^( DECLS ( listaDeclaracao )? ) ^( STMS ( listaStatement )? ) ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:79:11: PROGRAM nomePrograma listaVariavelGlobal listaDeclaracao listaStatement END
            {
            PROGRAM1=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_program440);  
            stream_PROGRAM.add(PROGRAM1);

            pushFollow(FOLLOW_nomePrograma_in_program446);
            nomePrograma2=nomePrograma();

            state._fsp--;

            stream_nomePrograma.add(nomePrograma2.getTree());
            pushFollow(FOLLOW_listaVariavelGlobal_in_program452);
            listaVariavelGlobal3=listaVariavelGlobal();

            state._fsp--;

            stream_listaVariavelGlobal.add(listaVariavelGlobal3.getTree());
            pushFollow(FOLLOW_listaDeclaracao_in_program457);
            listaDeclaracao4=listaDeclaracao();

            state._fsp--;

            stream_listaDeclaracao.add(listaDeclaracao4.getTree());
            pushFollow(FOLLOW_listaStatement_in_program462);
            listaStatement5=listaStatement();

            state._fsp--;

            stream_listaStatement.add(listaStatement5.getTree());
            END6=(Token)match(input,END,FOLLOW_END_in_program470);  
            stream_END.add(END6);



            // AST REWRITE
            // elements: listaStatement, nomePrograma, listaDeclaracao, listaVariavelGlobal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:2: -> ^( PROG ^( nomePrograma ) ^( GLOBAL_VARS ( listaVariavelGlobal )? ) ^( DECLS ( listaDeclaracao )? ) ^( STMS ( listaStatement )? ) )
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:88:5: ^( PROG ^( nomePrograma ) ^( GLOBAL_VARS ( listaVariavelGlobal )? ) ^( DECLS ( listaDeclaracao )? ) ^( STMS ( listaStatement )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:89:2: ^( nomePrograma )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_nomePrograma.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:90:2: ^( GLOBAL_VARS ( listaVariavelGlobal )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GLOBAL_VARS, "GLOBAL_VARS"), root_2);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:90:16: ( listaVariavelGlobal )?
                if ( stream_listaVariavelGlobal.hasNext() ) {
                    adaptor.addChild(root_2, stream_listaVariavelGlobal.nextTree());

                }
                stream_listaVariavelGlobal.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:91:2: ^( DECLS ( listaDeclaracao )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLS, "DECLS"), root_2);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:91:10: ( listaDeclaracao )?
                if ( stream_listaDeclaracao.hasNext() ) {
                    adaptor.addChild(root_2, stream_listaDeclaracao.nextTree());

                }
                stream_listaDeclaracao.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:92:2: ^( STMS ( listaStatement )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMS, "STMS"), root_2);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:92:9: ( listaStatement )?
                if ( stream_listaStatement.hasNext() ) {
                    adaptor.addChild(root_2, stream_listaStatement.nextTree());

                }
                stream_listaStatement.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class nomePrograma_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nomePrograma"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:96:1: nomePrograma : ID ;
    public final LBParser.nomePrograma_return nomePrograma() throws RecognitionException {
        LBParser.nomePrograma_return retval = new LBParser.nomePrograma_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID7=null;

        CommonTree ID7_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:97:2: ( ID )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:97:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID7=(Token)match(input,ID,FOLLOW_ID_in_nomePrograma528); 
            ID7_tree = (CommonTree)adaptor.create(ID7);
            adaptor.addChild(root_0, ID7_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nomePrograma"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:105:1: statement : ( chamadaMetodo -> ^( CHAMADA chamadaMetodo ) | if_then_else -> ^( IF_THEN_ELSE if_then_else ) | lacoFor -> ^( lacoFor ) | lacoUntil -> ^( lacoUntil ) | lacoWhile -> ^( lacoWhile ) | built_in -> ^( built_in ) | atribuicao -> ^( ATRIBUICAO atribuicao ) | EXIT_DO -> ^( BREAK_DO ) | EXIT_FOR -> ^( BREAK_FOR ) );
    public final LBParser.statement_return statement() throws RecognitionException {
        LBParser.statement_return retval = new LBParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXIT_DO15=null;
        Token EXIT_FOR16=null;
        LBParser.chamadaMetodo_return chamadaMetodo8 = null;

        LBParser.if_then_else_return if_then_else9 = null;

        LBParser.lacoFor_return lacoFor10 = null;

        LBParser.lacoUntil_return lacoUntil11 = null;

        LBParser.lacoWhile_return lacoWhile12 = null;

        LBParser.built_in_return built_in13 = null;

        LBParser.atribuicao_return atribuicao14 = null;


        CommonTree EXIT_DO15_tree=null;
        CommonTree EXIT_FOR16_tree=null;
        RewriteRuleTokenStream stream_EXIT_DO=new RewriteRuleTokenStream(adaptor,"token EXIT_DO");
        RewriteRuleTokenStream stream_EXIT_FOR=new RewriteRuleTokenStream(adaptor,"token EXIT_FOR");
        RewriteRuleSubtreeStream stream_built_in=new RewriteRuleSubtreeStream(adaptor,"rule built_in");
        RewriteRuleSubtreeStream stream_lacoUntil=new RewriteRuleSubtreeStream(adaptor,"rule lacoUntil");
        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_lacoWhile=new RewriteRuleSubtreeStream(adaptor,"rule lacoWhile");
        RewriteRuleSubtreeStream stream_chamadaMetodo=new RewriteRuleSubtreeStream(adaptor,"rule chamadaMetodo");
        RewriteRuleSubtreeStream stream_if_then_else=new RewriteRuleSubtreeStream(adaptor,"rule if_then_else");
        RewriteRuleSubtreeStream stream_lacoFor=new RewriteRuleSubtreeStream(adaptor,"rule lacoFor");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:106:2: ( chamadaMetodo -> ^( CHAMADA chamadaMetodo ) | if_then_else -> ^( IF_THEN_ELSE if_then_else ) | lacoFor -> ^( lacoFor ) | lacoUntil -> ^( lacoUntil ) | lacoWhile -> ^( lacoWhile ) | built_in -> ^( built_in ) | atribuicao -> ^( ATRIBUICAO atribuicao ) | EXIT_DO -> ^( BREAK_DO ) | EXIT_FOR -> ^( BREAK_FOR ) )
            int alt1=9;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:106:4: chamadaMetodo
                    {
                    pushFollow(FOLLOW_chamadaMetodo_in_statement545);
                    chamadaMetodo8=chamadaMetodo();

                    state._fsp--;

                    stream_chamadaMetodo.add(chamadaMetodo8.getTree());


                    // AST REWRITE
                    // elements: chamadaMetodo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 108:2: -> ^( CHAMADA chamadaMetodo )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:108:5: ^( CHAMADA chamadaMetodo )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHAMADA, "CHAMADA"), root_1);

                        adaptor.addChild(root_1, stream_chamadaMetodo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:110:4: if_then_else
                    {
                    pushFollow(FOLLOW_if_then_else_in_statement565);
                    if_then_else9=if_then_else();

                    state._fsp--;

                    stream_if_then_else.add(if_then_else9.getTree());


                    // AST REWRITE
                    // elements: if_then_else
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 112:2: -> ^( IF_THEN_ELSE if_then_else )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:112:5: ^( IF_THEN_ELSE if_then_else )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_THEN_ELSE, "IF_THEN_ELSE"), root_1);

                        adaptor.addChild(root_1, stream_if_then_else.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:114:4: lacoFor
                    {
                    pushFollow(FOLLOW_lacoFor_in_statement585);
                    lacoFor10=lacoFor();

                    state._fsp--;

                    stream_lacoFor.add(lacoFor10.getTree());


                    // AST REWRITE
                    // elements: lacoFor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 116:2: -> ^( lacoFor )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:116:5: ^( lacoFor )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_lacoFor.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:118:4: lacoUntil
                    {
                    pushFollow(FOLLOW_lacoUntil_in_statement604);
                    lacoUntil11=lacoUntil();

                    state._fsp--;

                    stream_lacoUntil.add(lacoUntil11.getTree());


                    // AST REWRITE
                    // elements: lacoUntil
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:3: -> ^( lacoUntil )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:120:6: ^( lacoUntil )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_lacoUntil.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:122:4: lacoWhile
                    {
                    pushFollow(FOLLOW_lacoWhile_in_statement623);
                    lacoWhile12=lacoWhile();

                    state._fsp--;

                    stream_lacoWhile.add(lacoWhile12.getTree());


                    // AST REWRITE
                    // elements: lacoWhile
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 124:3: -> ^( lacoWhile )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:124:6: ^( lacoWhile )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_lacoWhile.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:126:4: built_in
                    {
                    pushFollow(FOLLOW_built_in_in_statement642);
                    built_in13=built_in();

                    state._fsp--;

                    stream_built_in.add(built_in13.getTree());


                    // AST REWRITE
                    // elements: built_in
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 128:3: -> ^( built_in )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:128:6: ^( built_in )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_built_in.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:130:4: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_statement661);
                    atribuicao14=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao14.getTree());


                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 132:3: -> ^( ATRIBUICAO atribuicao )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:132:6: ^( ATRIBUICAO atribuicao )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATRIBUICAO, "ATRIBUICAO"), root_1);

                        adaptor.addChild(root_1, stream_atribuicao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:134:4: EXIT_DO
                    {
                    EXIT_DO15=(Token)match(input,EXIT_DO,FOLLOW_EXIT_DO_in_statement681);  
                    stream_EXIT_DO.add(EXIT_DO15);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 136:2: -> ^( BREAK_DO )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:136:5: ^( BREAK_DO )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BREAK_DO, "BREAK_DO"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:138:4: EXIT_FOR
                    {
                    EXIT_FOR16=(Token)match(input,EXIT_FOR,FOLLOW_EXIT_FOR_in_statement697);  
                    stream_EXIT_FOR.add(EXIT_FOR16);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 140:2: -> ^( BREAK_FOR )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:140:5: ^( BREAK_FOR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BREAK_FOR, "BREAK_FOR"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class expressao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressao"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:147:1: expressao : conjuncao ( OR conjuncao )* ;
    public final LBParser.expressao_return expressao() throws RecognitionException {
        LBParser.expressao_return retval = new LBParser.expressao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR18=null;
        LBParser.conjuncao_return conjuncao17 = null;

        LBParser.conjuncao_return conjuncao19 = null;


        CommonTree OR18_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:148:2: ( conjuncao ( OR conjuncao )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:148:4: conjuncao ( OR conjuncao )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conjuncao_in_expressao721);
            conjuncao17=conjuncao();

            state._fsp--;

            adaptor.addChild(root_0, conjuncao17.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:148:14: ( OR conjuncao )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==OR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:148:15: OR conjuncao
            	    {
            	    OR18=(Token)match(input,OR,FOLLOW_OR_in_expressao724); 
            	    OR18_tree = (CommonTree)adaptor.create(OR18);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR18_tree, root_0);

            	    pushFollow(FOLLOW_conjuncao_in_expressao727);
            	    conjuncao19=conjuncao();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conjuncao19.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressao"

    public static class conjuncao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conjuncao"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:151:1: conjuncao : termo ( operadorN1 termo )* ;
    public final LBParser.conjuncao_return conjuncao() throws RecognitionException {
        LBParser.conjuncao_return retval = new LBParser.conjuncao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.termo_return termo20 = null;

        LBParser.operadorN1_return operadorN121 = null;

        LBParser.termo_return termo22 = null;



        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:152:2: ( termo ( operadorN1 termo )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:152:4: termo ( operadorN1 termo )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_termo_in_conjuncao740);
            termo20=termo();

            state._fsp--;

            adaptor.addChild(root_0, termo20.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:152:10: ( operadorN1 termo )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AND) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:152:11: operadorN1 termo
            	    {
            	    pushFollow(FOLLOW_operadorN1_in_conjuncao743);
            	    operadorN121=operadorN1();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(operadorN121.getTree(), root_0);
            	    pushFollow(FOLLOW_termo_in_conjuncao746);
            	    termo22=termo();

            	    state._fsp--;

            	    adaptor.addChild(root_0, termo22.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conjuncao"

    public static class termo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termo"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:155:1: termo : expr1 ( operadorN2 expr1 )* ;
    public final LBParser.termo_return termo() throws RecognitionException {
        LBParser.termo_return retval = new LBParser.termo_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.expr1_return expr123 = null;

        LBParser.operadorN2_return operadorN224 = null;

        LBParser.expr1_return expr125 = null;



        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:155:7: ( expr1 ( operadorN2 expr1 )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:155:9: expr1 ( operadorN2 expr1 )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr1_in_termo758);
            expr123=expr1();

            state._fsp--;

            adaptor.addChild(root_0, expr123.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:155:15: ( operadorN2 expr1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=MAIOR && LA4_0<=MENOR_IGUAL)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:155:16: operadorN2 expr1
            	    {
            	    pushFollow(FOLLOW_operadorN2_in_termo761);
            	    operadorN224=operadorN2();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(operadorN224.getTree(), root_0);
            	    pushFollow(FOLLOW_expr1_in_termo764);
            	    expr125=expr1();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr125.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termo"

    public static class expr1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr1"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:158:1: expr1 : expr2 ( operadorN3 expr2 )* ;
    public final LBParser.expr1_return expr1() throws RecognitionException {
        LBParser.expr1_return retval = new LBParser.expr1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.expr2_return expr226 = null;

        LBParser.operadorN3_return operadorN327 = null;

        LBParser.expr2_return expr228 = null;



        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:158:7: ( expr2 ( operadorN3 expr2 )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:158:9: expr2 ( operadorN3 expr2 )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr2_in_expr1777);
            expr226=expr2();

            state._fsp--;

            adaptor.addChild(root_0, expr226.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:158:15: ( operadorN3 expr2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=IGUAL && LA5_0<=DIFERENTE)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:158:16: operadorN3 expr2
            	    {
            	    pushFollow(FOLLOW_operadorN3_in_expr1780);
            	    operadorN327=operadorN3();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(operadorN327.getTree(), root_0);
            	    pushFollow(FOLLOW_expr2_in_expr1783);
            	    expr228=expr2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr228.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr1"

    public static class expr2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr2"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:161:1: expr2 : expr3 ( operadorN4 expr3 )* ;
    public final LBParser.expr2_return expr2() throws RecognitionException {
        LBParser.expr2_return retval = new LBParser.expr2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.expr3_return expr329 = null;

        LBParser.operadorN4_return operadorN430 = null;

        LBParser.expr3_return expr331 = null;



        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:161:7: ( expr3 ( operadorN4 expr3 )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:161:9: expr3 ( operadorN4 expr3 )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr3_in_expr2796);
            expr329=expr3();

            state._fsp--;

            adaptor.addChild(root_0, expr329.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:161:15: ( operadorN4 expr3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=SOM && LA6_0<=SUB)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:161:16: operadorN4 expr3
            	    {
            	    pushFollow(FOLLOW_operadorN4_in_expr2799);
            	    operadorN430=operadorN4();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(operadorN430.getTree(), root_0);
            	    pushFollow(FOLLOW_expr3_in_expr2802);
            	    expr331=expr3();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr331.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr2"

    public static class expr3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr3"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:164:1: expr3 : fator ( operadorN5 fator )* ;
    public final LBParser.expr3_return expr3() throws RecognitionException {
        LBParser.expr3_return retval = new LBParser.expr3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.fator_return fator32 = null;

        LBParser.operadorN5_return operadorN533 = null;

        LBParser.fator_return fator34 = null;



        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:164:7: ( fator ( operadorN5 fator )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:164:8: fator ( operadorN5 fator )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fator_in_expr3814);
            fator32=fator();

            state._fsp--;

            adaptor.addChild(root_0, fator32.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:164:14: ( operadorN5 fator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=MULT && LA7_0<=DIV)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:164:15: operadorN5 fator
            	    {
            	    pushFollow(FOLLOW_operadorN5_in_expr3817);
            	    operadorN533=operadorN5();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(operadorN533.getTree(), root_0);
            	    pushFollow(FOLLOW_fator_in_expr3820);
            	    fator34=fator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fator34.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr3"

    public static class fator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fator"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:167:1: fator : ( LPAREN expressao RPAREN -> ^( expressao ) | NOT fator -> ^( NAO fator ) | ID | INT | TRUE | FALSE | STRING | CHAR | chamadaMetodo -> ^( CHAMADA chamadaMetodo ) );
    public final LBParser.fator_return fator() throws RecognitionException {
        LBParser.fator_return retval = new LBParser.fator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN35=null;
        Token RPAREN37=null;
        Token NOT38=null;
        Token ID40=null;
        Token INT41=null;
        Token TRUE42=null;
        Token FALSE43=null;
        Token STRING44=null;
        Token CHAR45=null;
        LBParser.expressao_return expressao36 = null;

        LBParser.fator_return fator39 = null;

        LBParser.chamadaMetodo_return chamadaMetodo46 = null;


        CommonTree LPAREN35_tree=null;
        CommonTree RPAREN37_tree=null;
        CommonTree NOT38_tree=null;
        CommonTree ID40_tree=null;
        CommonTree INT41_tree=null;
        CommonTree TRUE42_tree=null;
        CommonTree FALSE43_tree=null;
        CommonTree STRING44_tree=null;
        CommonTree CHAR45_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_fator=new RewriteRuleSubtreeStream(adaptor,"rule fator");
        RewriteRuleSubtreeStream stream_chamadaMetodo=new RewriteRuleSubtreeStream(adaptor,"rule chamadaMetodo");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:167:7: ( LPAREN expressao RPAREN -> ^( expressao ) | NOT fator -> ^( NAO fator ) | ID | INT | TRUE | FALSE | STRING | CHAR | chamadaMetodo -> ^( CHAMADA chamadaMetodo ) )
            int alt8=9;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:167:9: LPAREN expressao RPAREN
                    {
                    LPAREN35=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fator833);  
                    stream_LPAREN.add(LPAREN35);

                    pushFollow(FOLLOW_expressao_in_fator835);
                    expressao36=expressao();

                    state._fsp--;

                    stream_expressao.add(expressao36.getTree());
                    RPAREN37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fator837);  
                    stream_RPAREN.add(RPAREN37);



                    // AST REWRITE
                    // elements: expressao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 167:33: -> ^( expressao )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:167:36: ^( expressao )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_expressao.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:168:4: NOT fator
                    {
                    NOT38=(Token)match(input,NOT,FOLLOW_NOT_in_fator849);  
                    stream_NOT.add(NOT38);

                    pushFollow(FOLLOW_fator_in_fator851);
                    fator39=fator();

                    state._fsp--;

                    stream_fator.add(fator39.getTree());


                    // AST REWRITE
                    // elements: fator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 168:14: -> ^( NAO fator )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:168:17: ^( NAO fator )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAO, "NAO"), root_1);

                        adaptor.addChild(root_1, stream_fator.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:169:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID40=(Token)match(input,ID,FOLLOW_ID_in_fator865); 
                    ID40_tree = (CommonTree)adaptor.create(ID40);
                    adaptor.addChild(root_0, ID40_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:170:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT41=(Token)match(input,INT,FOLLOW_INT_in_fator870); 
                    INT41_tree = (CommonTree)adaptor.create(INT41);
                    adaptor.addChild(root_0, INT41_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:171:4: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TRUE42=(Token)match(input,TRUE,FOLLOW_TRUE_in_fator875); 
                    TRUE42_tree = (CommonTree)adaptor.create(TRUE42);
                    adaptor.addChild(root_0, TRUE42_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:172:4: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FALSE43=(Token)match(input,FALSE,FOLLOW_FALSE_in_fator880); 
                    FALSE43_tree = (CommonTree)adaptor.create(FALSE43);
                    adaptor.addChild(root_0, FALSE43_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:173:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING44=(Token)match(input,STRING,FOLLOW_STRING_in_fator885); 
                    STRING44_tree = (CommonTree)adaptor.create(STRING44);
                    adaptor.addChild(root_0, STRING44_tree);


                    }
                    break;
                case 8 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:174:4: CHAR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR45=(Token)match(input,CHAR,FOLLOW_CHAR_in_fator890); 
                    CHAR45_tree = (CommonTree)adaptor.create(CHAR45);
                    adaptor.addChild(root_0, CHAR45_tree);


                    }
                    break;
                case 9 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:175:4: chamadaMetodo
                    {
                    pushFollow(FOLLOW_chamadaMetodo_in_fator895);
                    chamadaMetodo46=chamadaMetodo();

                    state._fsp--;

                    stream_chamadaMetodo.add(chamadaMetodo46.getTree());


                    // AST REWRITE
                    // elements: chamadaMetodo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 177:2: -> ^( CHAMADA chamadaMetodo )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:177:5: ^( CHAMADA chamadaMetodo )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHAMADA, "CHAMADA"), root_1);

                        adaptor.addChild(root_1, stream_chamadaMetodo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fator"

    public static class operadorN1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operadorN1"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:180:1: operadorN1 : AND ;
    public final LBParser.operadorN1_return operadorN1() throws RecognitionException {
        LBParser.operadorN1_return retval = new LBParser.operadorN1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND47=null;

        CommonTree AND47_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:181:2: ( AND )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:181:4: AND
            {
            root_0 = (CommonTree)adaptor.nil();

            AND47=(Token)match(input,AND,FOLLOW_AND_in_operadorN1917); 
            AND47_tree = (CommonTree)adaptor.create(AND47);
            adaptor.addChild(root_0, AND47_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operadorN1"

    public static class operadorN2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operadorN2"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:184:1: operadorN2 : ( MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL );
    public final LBParser.operadorN2_return operadorN2() throws RecognitionException {
        LBParser.operadorN2_return retval = new LBParser.operadorN2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set48=null;

        CommonTree set48_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:185:2: ( MAIOR | MAIOR_IGUAL | MENOR | MENOR_IGUAL )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set48=(Token)input.LT(1);
            if ( (input.LA(1)>=MAIOR && input.LA(1)<=MENOR_IGUAL) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set48));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operadorN2"

    public static class operadorN3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operadorN3"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:191:1: operadorN3 : ( IGUAL | DIFERENTE );
    public final LBParser.operadorN3_return operadorN3() throws RecognitionException {
        LBParser.operadorN3_return retval = new LBParser.operadorN3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set49=null;

        CommonTree set49_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:192:2: ( IGUAL | DIFERENTE )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set49=(Token)input.LT(1);
            if ( (input.LA(1)>=IGUAL && input.LA(1)<=DIFERENTE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set49));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operadorN3"

    public static class operadorN4_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operadorN4"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:196:1: operadorN4 : ( SOM | SUB );
    public final LBParser.operadorN4_return operadorN4() throws RecognitionException {
        LBParser.operadorN4_return retval = new LBParser.operadorN4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set50=null;

        CommonTree set50_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:197:2: ( SOM | SUB )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set50=(Token)input.LT(1);
            if ( (input.LA(1)>=SOM && input.LA(1)<=SUB) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set50));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operadorN4"

    public static class operadorN5_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operadorN5"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:201:1: operadorN5 : ( MULT | DIV );
    public final LBParser.operadorN5_return operadorN5() throws RecognitionException {
        LBParser.operadorN5_return retval = new LBParser.operadorN5_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set51=null;

        CommonTree set51_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:202:2: ( MULT | DIV )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set51=(Token)input.LT(1);
            if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set51));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operadorN5"

    public static class lacoFor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lacoFor"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:212:1: lacoFor : FOR atribuicao TO expressao ( STEP expressao )? listaStatement NEXT ID -> ^( LACO_FOR ^( ATRIBUICAO atribuicao ) ^( LIMITE_FOR expressao ) ^( STEP_FOR ( expressao )? ) ^( STMS listaStatement ) ^( NEXT_FOR ID ) ) ;
    public final LBParser.lacoFor_return lacoFor() throws RecognitionException {
        LBParser.lacoFor_return retval = new LBParser.lacoFor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FOR52=null;
        Token TO54=null;
        Token STEP56=null;
        Token NEXT59=null;
        Token ID60=null;
        LBParser.atribuicao_return atribuicao53 = null;

        LBParser.expressao_return expressao55 = null;

        LBParser.expressao_return expressao57 = null;

        LBParser.listaStatement_return listaStatement58 = null;


        CommonTree FOR52_tree=null;
        CommonTree TO54_tree=null;
        CommonTree STEP56_tree=null;
        CommonTree NEXT59_tree=null;
        CommonTree ID60_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_STEP=new RewriteRuleTokenStream(adaptor,"token STEP");
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        RewriteRuleSubtreeStream stream_listaStatement=new RewriteRuleSubtreeStream(adaptor,"rule listaStatement");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:212:9: ( FOR atribuicao TO expressao ( STEP expressao )? listaStatement NEXT ID -> ^( LACO_FOR ^( ATRIBUICAO atribuicao ) ^( LIMITE_FOR expressao ) ^( STEP_FOR ( expressao )? ) ^( STMS listaStatement ) ^( NEXT_FOR ID ) ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:212:11: FOR atribuicao TO expressao ( STEP expressao )? listaStatement NEXT ID
            {
            FOR52=(Token)match(input,FOR,FOLLOW_FOR_in_lacoFor1012);  
            stream_FOR.add(FOR52);

            pushFollow(FOLLOW_atribuicao_in_lacoFor1014);
            atribuicao53=atribuicao();

            state._fsp--;

            stream_atribuicao.add(atribuicao53.getTree());
            TO54=(Token)match(input,TO,FOLLOW_TO_in_lacoFor1016);  
            stream_TO.add(TO54);

            pushFollow(FOLLOW_expressao_in_lacoFor1018);
            expressao55=expressao();

            state._fsp--;

            stream_expressao.add(expressao55.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:212:39: ( STEP expressao )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==STEP) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:212:40: STEP expressao
                    {
                    STEP56=(Token)match(input,STEP,FOLLOW_STEP_in_lacoFor1021);  
                    stream_STEP.add(STEP56);

                    pushFollow(FOLLOW_expressao_in_lacoFor1023);
                    expressao57=expressao();

                    state._fsp--;

                    stream_expressao.add(expressao57.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_listaStatement_in_lacoFor1030);
            listaStatement58=listaStatement();

            state._fsp--;

            stream_listaStatement.add(listaStatement58.getTree());
            NEXT59=(Token)match(input,NEXT,FOLLOW_NEXT_in_lacoFor1035);  
            stream_NEXT.add(NEXT59);

            ID60=(Token)match(input,ID,FOLLOW_ID_in_lacoFor1037);  
            stream_ID.add(ID60);



            // AST REWRITE
            // elements: ID, listaStatement, expressao, expressao, atribuicao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 217:2: -> ^( LACO_FOR ^( ATRIBUICAO atribuicao ) ^( LIMITE_FOR expressao ) ^( STEP_FOR ( expressao )? ) ^( STMS listaStatement ) ^( NEXT_FOR ID ) )
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:217:5: ^( LACO_FOR ^( ATRIBUICAO atribuicao ) ^( LIMITE_FOR expressao ) ^( STEP_FOR ( expressao )? ) ^( STMS listaStatement ) ^( NEXT_FOR ID ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LACO_FOR, "LACO_FOR"), root_1);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:218:2: ^( ATRIBUICAO atribuicao )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATRIBUICAO, "ATRIBUICAO"), root_2);

                adaptor.addChild(root_2, stream_atribuicao.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:219:2: ^( LIMITE_FOR expressao )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIMITE_FOR, "LIMITE_FOR"), root_2);

                adaptor.addChild(root_2, stream_expressao.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:220:2: ^( STEP_FOR ( expressao )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STEP_FOR, "STEP_FOR"), root_2);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:220:13: ( expressao )?
                if ( stream_expressao.hasNext() ) {
                    adaptor.addChild(root_2, stream_expressao.nextTree());

                }
                stream_expressao.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:221:2: ^( STMS listaStatement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMS, "STMS"), root_2);

                adaptor.addChild(root_2, stream_listaStatement.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:222:2: ^( NEXT_FOR ID )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEXT_FOR, "NEXT_FOR"), root_2);

                adaptor.addChild(root_2, stream_ID.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lacoFor"

    public static class lacoWhile_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lacoWhile"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:228:1: lacoWhile : DO WHILE expressao listaStatement LOOP -> ^( LACO_WHILE ^( CONDICAO expressao ) ^( STMS listaStatement ) ) ;
    public final LBParser.lacoWhile_return lacoWhile() throws RecognitionException {
        LBParser.lacoWhile_return retval = new LBParser.lacoWhile_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DO61=null;
        Token WHILE62=null;
        Token LOOP65=null;
        LBParser.expressao_return expressao63 = null;

        LBParser.listaStatement_return listaStatement64 = null;


        CommonTree DO61_tree=null;
        CommonTree WHILE62_tree=null;
        CommonTree LOOP65_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        RewriteRuleSubtreeStream stream_listaStatement=new RewriteRuleSubtreeStream(adaptor,"rule listaStatement");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:229:2: ( DO WHILE expressao listaStatement LOOP -> ^( LACO_WHILE ^( CONDICAO expressao ) ^( STMS listaStatement ) ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:229:4: DO WHILE expressao listaStatement LOOP
            {
            DO61=(Token)match(input,DO,FOLLOW_DO_in_lacoWhile1110);  
            stream_DO.add(DO61);

            WHILE62=(Token)match(input,WHILE,FOLLOW_WHILE_in_lacoWhile1112);  
            stream_WHILE.add(WHILE62);

            pushFollow(FOLLOW_expressao_in_lacoWhile1114);
            expressao63=expressao();

            state._fsp--;

            stream_expressao.add(expressao63.getTree());
            pushFollow(FOLLOW_listaStatement_in_lacoWhile1118);
            listaStatement64=listaStatement();

            state._fsp--;

            stream_listaStatement.add(listaStatement64.getTree());
            LOOP65=(Token)match(input,LOOP,FOLLOW_LOOP_in_lacoWhile1123);  
            stream_LOOP.add(LOOP65);



            // AST REWRITE
            // elements: expressao, listaStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 234:3: -> ^( LACO_WHILE ^( CONDICAO expressao ) ^( STMS listaStatement ) )
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:234:6: ^( LACO_WHILE ^( CONDICAO expressao ) ^( STMS listaStatement ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LACO_WHILE, "LACO_WHILE"), root_1);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:235:3: ^( CONDICAO expressao )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDICAO, "CONDICAO"), root_2);

                adaptor.addChild(root_2, stream_expressao.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:236:3: ^( STMS listaStatement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMS, "STMS"), root_2);

                adaptor.addChild(root_2, stream_listaStatement.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lacoWhile"

    public static class lacoUntil_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lacoUntil"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:240:1: lacoUntil : DO listaStatement LOOP UNTIL expressao -> ^( LACO_UNTIL ^( STMS listaStatement ) ^( CONDICAO expressao ) ) ;
    public final LBParser.lacoUntil_return lacoUntil() throws RecognitionException {
        LBParser.lacoUntil_return retval = new LBParser.lacoUntil_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DO66=null;
        Token LOOP68=null;
        Token UNTIL69=null;
        LBParser.listaStatement_return listaStatement67 = null;

        LBParser.expressao_return expressao70 = null;


        CommonTree DO66_tree=null;
        CommonTree LOOP68_tree=null;
        CommonTree UNTIL69_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_UNTIL=new RewriteRuleTokenStream(adaptor,"token UNTIL");
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleSubtreeStream stream_listaStatement=new RewriteRuleSubtreeStream(adaptor,"rule listaStatement");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:241:2: ( DO listaStatement LOOP UNTIL expressao -> ^( LACO_UNTIL ^( STMS listaStatement ) ^( CONDICAO expressao ) ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:241:4: DO listaStatement LOOP UNTIL expressao
            {
            DO66=(Token)match(input,DO,FOLLOW_DO_in_lacoUntil1172);  
            stream_DO.add(DO66);

            pushFollow(FOLLOW_listaStatement_in_lacoUntil1177);
            listaStatement67=listaStatement();

            state._fsp--;

            stream_listaStatement.add(listaStatement67.getTree());
            LOOP68=(Token)match(input,LOOP,FOLLOW_LOOP_in_lacoUntil1183);  
            stream_LOOP.add(LOOP68);

            UNTIL69=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_lacoUntil1185);  
            stream_UNTIL.add(UNTIL69);

            pushFollow(FOLLOW_expressao_in_lacoUntil1187);
            expressao70=expressao();

            state._fsp--;

            stream_expressao.add(expressao70.getTree());


            // AST REWRITE
            // elements: expressao, listaStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 246:5: -> ^( LACO_UNTIL ^( STMS listaStatement ) ^( CONDICAO expressao ) )
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:246:8: ^( LACO_UNTIL ^( STMS listaStatement ) ^( CONDICAO expressao ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LACO_UNTIL, "LACO_UNTIL"), root_1);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:247:5: ^( STMS listaStatement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMS, "STMS"), root_2);

                adaptor.addChild(root_2, stream_listaStatement.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:248:5: ^( CONDICAO expressao )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDICAO, "CONDICAO"), root_2);

                adaptor.addChild(root_2, stream_expressao.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lacoUntil"

    public static class if_then_else_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_then_else"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:258:1: if_then_else : IF expressao THEN a= listaStatement ELSE b= listaStatement END_IF -> ^( CONDICAO expressao ) ^( IF_NODE ( ^( STMS $a) )? ) ^( ELSE_NODE ( ^( STMS $b) )? ) ;
    public final LBParser.if_then_else_return if_then_else() throws RecognitionException {
        LBParser.if_then_else_return retval = new LBParser.if_then_else_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF71=null;
        Token THEN73=null;
        Token ELSE74=null;
        Token END_IF75=null;
        LBParser.listaStatement_return a = null;

        LBParser.listaStatement_return b = null;

        LBParser.expressao_return expressao72 = null;


        CommonTree IF71_tree=null;
        CommonTree THEN73_tree=null;
        CommonTree ELSE74_tree=null;
        CommonTree END_IF75_tree=null;
        RewriteRuleTokenStream stream_END_IF=new RewriteRuleTokenStream(adaptor,"token END_IF");
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        RewriteRuleSubtreeStream stream_listaStatement=new RewriteRuleSubtreeStream(adaptor,"rule listaStatement");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:259:2: ( IF expressao THEN a= listaStatement ELSE b= listaStatement END_IF -> ^( CONDICAO expressao ) ^( IF_NODE ( ^( STMS $a) )? ) ^( ELSE_NODE ( ^( STMS $b) )? ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:259:4: IF expressao THEN a= listaStatement ELSE b= listaStatement END_IF
            {
            IF71=(Token)match(input,IF,FOLLOW_IF_in_if_then_else1253);  
            stream_IF.add(IF71);

            pushFollow(FOLLOW_expressao_in_if_then_else1255);
            expressao72=expressao();

            state._fsp--;

            stream_expressao.add(expressao72.getTree());
            THEN73=(Token)match(input,THEN,FOLLOW_THEN_in_if_then_else1257);  
            stream_THEN.add(THEN73);

            pushFollow(FOLLOW_listaStatement_in_if_then_else1265);
            a=listaStatement();

            state._fsp--;

            stream_listaStatement.add(a.getTree());
            ELSE74=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_then_else1270);  
            stream_ELSE.add(ELSE74);

            pushFollow(FOLLOW_listaStatement_in_if_then_else1280);
            b=listaStatement();

            state._fsp--;

            stream_listaStatement.add(b.getTree());
            END_IF75=(Token)match(input,END_IF,FOLLOW_END_IF_in_if_then_else1285);  
            stream_END_IF.add(END_IF75);



            // AST REWRITE
            // elements: b, expressao, a
            // token labels: 
            // rule labels: retval, b, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 266:4: -> ^( CONDICAO expressao ) ^( IF_NODE ( ^( STMS $a) )? ) ^( ELSE_NODE ( ^( STMS $b) )? )
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:266:7: ^( CONDICAO expressao )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDICAO, "CONDICAO"), root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:267:4: ^( IF_NODE ( ^( STMS $a) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_NODE, "IF_NODE"), root_1);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:267:14: ( ^( STMS $a) )?
                if ( stream_a.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:267:14: ^( STMS $a)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMS, "STMS"), root_2);

                    adaptor.addChild(root_2, stream_a.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_a.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:268:4: ^( ELSE_NODE ( ^( STMS $b) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE_NODE, "ELSE_NODE"), root_1);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:268:16: ( ^( STMS $b) )?
                if ( stream_b.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:268:16: ^( STMS $b)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMS, "STMS"), root_2);

                    adaptor.addChild(root_2, stream_b.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_b.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_then_else"

    public static class chamadaMetodo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "chamadaMetodo"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:276:1: chamadaMetodo : ID LPAREN ( listaArgs )? RPAREN -> ID ^( ARGS ( listaArgs )? ) ;
    public final LBParser.chamadaMetodo_return chamadaMetodo() throws RecognitionException {
        LBParser.chamadaMetodo_return retval = new LBParser.chamadaMetodo_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID76=null;
        Token LPAREN77=null;
        Token RPAREN79=null;
        LBParser.listaArgs_return listaArgs78 = null;


        CommonTree ID76_tree=null;
        CommonTree LPAREN77_tree=null;
        CommonTree RPAREN79_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_listaArgs=new RewriteRuleSubtreeStream(adaptor,"rule listaArgs");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:277:2: ( ID LPAREN ( listaArgs )? RPAREN -> ID ^( ARGS ( listaArgs )? ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:277:4: ID LPAREN ( listaArgs )? RPAREN
            {
            ID76=(Token)match(input,ID,FOLLOW_ID_in_chamadaMetodo1349);  
            stream_ID.add(ID76);

            LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_chamadaMetodo1351);  
            stream_LPAREN.add(LPAREN77);

            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:277:14: ( listaArgs )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=TRUE && LA10_0<=NOT)||(LA10_0>=ID && LA10_0<=LPAREN)||(LA10_0>=INT && LA10_0<=CHAR)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:277:14: listaArgs
                    {
                    pushFollow(FOLLOW_listaArgs_in_chamadaMetodo1353);
                    listaArgs78=listaArgs();

                    state._fsp--;

                    stream_listaArgs.add(listaArgs78.getTree());

                    }
                    break;

            }

            RPAREN79=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_chamadaMetodo1356);  
            stream_RPAREN.add(RPAREN79);



            // AST REWRITE
            // elements: listaArgs, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 280:2: -> ID ^( ARGS ( listaArgs )? )
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:280:8: ^( ARGS ( listaArgs )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:280:15: ( listaArgs )?
                if ( stream_listaArgs.hasNext() ) {
                    adaptor.addChild(root_1, stream_listaArgs.nextTree());

                }
                stream_listaArgs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "chamadaMetodo"

    public static class listaArgs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaArgs"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:283:1: listaArgs : argumentos ( VIRGULA argumentos )* -> ( ^( argumentos ) )* ;
    public final LBParser.listaArgs_return listaArgs() throws RecognitionException {
        LBParser.listaArgs_return retval = new LBParser.listaArgs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRGULA81=null;
        LBParser.argumentos_return argumentos80 = null;

        LBParser.argumentos_return argumentos82 = null;


        CommonTree VIRGULA81_tree=null;
        RewriteRuleTokenStream stream_VIRGULA=new RewriteRuleTokenStream(adaptor,"token VIRGULA");
        RewriteRuleSubtreeStream stream_argumentos=new RewriteRuleSubtreeStream(adaptor,"rule argumentos");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:284:2: ( argumentos ( VIRGULA argumentos )* -> ( ^( argumentos ) )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:284:4: argumentos ( VIRGULA argumentos )*
            {
            pushFollow(FOLLOW_argumentos_in_listaArgs1385);
            argumentos80=argumentos();

            state._fsp--;

            stream_argumentos.add(argumentos80.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:284:15: ( VIRGULA argumentos )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==VIRGULA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:284:16: VIRGULA argumentos
            	    {
            	    VIRGULA81=(Token)match(input,VIRGULA,FOLLOW_VIRGULA_in_listaArgs1388);  
            	    stream_VIRGULA.add(VIRGULA81);

            	    pushFollow(FOLLOW_argumentos_in_listaArgs1390);
            	    argumentos82=argumentos();

            	    state._fsp--;

            	    stream_argumentos.add(argumentos82.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: argumentos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 287:2: -> ( ^( argumentos ) )*
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:287:5: ( ^( argumentos ) )*
                while ( stream_argumentos.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:287:5: ^( argumentos )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_argumentos.nextNode(), root_1);

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_argumentos.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaArgs"

    public static class argumentos_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentos"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:290:1: argumentos : expressao -> ^( expressao ) ;
    public final LBParser.argumentos_return argumentos() throws RecognitionException {
        LBParser.argumentos_return retval = new LBParser.argumentos_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.expressao_return expressao83 = null;


        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:291:2: ( expressao -> ^( expressao ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:291:4: expressao
            {
            pushFollow(FOLLOW_expressao_in_argumentos1415);
            expressao83=expressao();

            state._fsp--;

            stream_expressao.add(expressao83.getTree());


            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 294:2: -> ^( expressao )
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:294:5: ^( expressao )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_expressao.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argumentos"

    public static class atribuicao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atribuicao"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:302:1: atribuicao : ID IGUAL expressao -> ^( ID ) ^( expressao ) ;
    public final LBParser.atribuicao_return atribuicao() throws RecognitionException {
        LBParser.atribuicao_return retval = new LBParser.atribuicao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID84=null;
        Token IGUAL85=null;
        LBParser.expressao_return expressao86 = null;


        CommonTree ID84_tree=null;
        CommonTree IGUAL85_tree=null;
        RewriteRuleTokenStream stream_IGUAL=new RewriteRuleTokenStream(adaptor,"token IGUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:303:2: ( ID IGUAL expressao -> ^( ID ) ^( expressao ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:303:4: ID IGUAL expressao
            {
            ID84=(Token)match(input,ID,FOLLOW_ID_in_atribuicao1442);  
            stream_ID.add(ID84);

            IGUAL85=(Token)match(input,IGUAL,FOLLOW_IGUAL_in_atribuicao1444);  
            stream_IGUAL.add(IGUAL85);

            pushFollow(FOLLOW_expressao_in_atribuicao1446);
            expressao86=expressao();

            state._fsp--;

            stream_expressao.add(expressao86.getTree());


            // AST REWRITE
            // elements: expressao, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 306:2: -> ^( ID ) ^( expressao )
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:306:5: ^( ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:307:2: ^( expressao )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_expressao.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atribuicao"

    public static class declaracaoVariavel_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaracaoVariavel"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:310:1: declaracaoVariavel : tipo listaID ;
    public final LBParser.declaracaoVariavel_return declaracaoVariavel() throws RecognitionException {
        LBParser.declaracaoVariavel_return retval = new LBParser.declaracaoVariavel_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.tipo_return tipo87 = null;

        LBParser.listaID_return listaID88 = null;



        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:311:2: ( tipo listaID )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:311:4: tipo listaID
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_tipo_in_declaracaoVariavel1474);
            tipo87=tipo();

            state._fsp--;

            adaptor.addChild(root_0, tipo87.getTree());
            pushFollow(FOLLOW_listaID_in_declaracaoVariavel1476);
            listaID88=listaID();

            state._fsp--;

            adaptor.addChild(root_0, listaID88.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaracaoVariavel"

    public static class listaID_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaID"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:315:1: listaID : ID ( VIRGULA ID )* -> ( ^( ID ) )* ;
    public final LBParser.listaID_return listaID() throws RecognitionException {
        LBParser.listaID_return retval = new LBParser.listaID_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID89=null;
        Token VIRGULA90=null;
        Token ID91=null;

        CommonTree ID89_tree=null;
        CommonTree VIRGULA90_tree=null;
        CommonTree ID91_tree=null;
        RewriteRuleTokenStream stream_VIRGULA=new RewriteRuleTokenStream(adaptor,"token VIRGULA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:315:9: ( ID ( VIRGULA ID )* -> ( ^( ID ) )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:315:11: ID ( VIRGULA ID )*
            {
            ID89=(Token)match(input,ID,FOLLOW_ID_in_listaID1491);  
            stream_ID.add(ID89);

            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:315:14: ( VIRGULA ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==VIRGULA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:315:15: VIRGULA ID
            	    {
            	    VIRGULA90=(Token)match(input,VIRGULA,FOLLOW_VIRGULA_in_listaID1494);  
            	    stream_VIRGULA.add(VIRGULA90);

            	    ID91=(Token)match(input,ID,FOLLOW_ID_in_listaID1496);  
            	    stream_ID.add(ID91);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 318:2: -> ( ^( ID ) )*
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:318:5: ( ^( ID ) )*
                while ( stream_ID.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:318:5: ^( ID )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ID.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaID"

    public static class tipo_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tipo"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:321:1: tipo : ( 'BOOLEAN' | 'INTEGER' | 'STRING' | 'CHAR' ) ;
    public final LBParser.tipo_return tipo() throws RecognitionException {
        LBParser.tipo_return retval = new LBParser.tipo_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set92=null;

        CommonTree set92_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:321:6: ( ( 'BOOLEAN' | 'INTEGER' | 'STRING' | 'CHAR' ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:321:8: ( 'BOOLEAN' | 'INTEGER' | 'STRING' | 'CHAR' )
            {
            root_0 = (CommonTree)adaptor.nil();

            set92=(Token)input.LT(1);
            if ( (input.LA(1)>=86 && input.LA(1)<=89) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set92));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tipo"

    public static class declaracaoFuncao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaracaoFuncao"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:327:1: declaracaoFuncao : FUNCTION nomeFuncao LPAREN ( listaParametros )? RPAREN AS tipo listaVariavelLocal listaStatement END_FUNCTION -> ^( FUNC ^( nomeFuncao ) ^( tipo ) ^( PARAMS ( listaParametros )? ) ^( LOCAL_VARS ( listaVariavelLocal )? ) ^( STMS listaStatement ) ) ;
    public final LBParser.declaracaoFuncao_return declaracaoFuncao() throws RecognitionException {
        LBParser.declaracaoFuncao_return retval = new LBParser.declaracaoFuncao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FUNCTION93=null;
        Token LPAREN95=null;
        Token RPAREN97=null;
        Token AS98=null;
        Token END_FUNCTION102=null;
        LBParser.nomeFuncao_return nomeFuncao94 = null;

        LBParser.listaParametros_return listaParametros96 = null;

        LBParser.tipo_return tipo99 = null;

        LBParser.listaVariavelLocal_return listaVariavelLocal100 = null;

        LBParser.listaStatement_return listaStatement101 = null;


        CommonTree FUNCTION93_tree=null;
        CommonTree LPAREN95_tree=null;
        CommonTree RPAREN97_tree=null;
        CommonTree AS98_tree=null;
        CommonTree END_FUNCTION102_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END_FUNCTION=new RewriteRuleTokenStream(adaptor,"token END_FUNCTION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_listaParametros=new RewriteRuleSubtreeStream(adaptor,"rule listaParametros");
        RewriteRuleSubtreeStream stream_nomeFuncao=new RewriteRuleSubtreeStream(adaptor,"rule nomeFuncao");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_listaVariavelLocal=new RewriteRuleSubtreeStream(adaptor,"rule listaVariavelLocal");
        RewriteRuleSubtreeStream stream_listaStatement=new RewriteRuleSubtreeStream(adaptor,"rule listaStatement");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:328:2: ( FUNCTION nomeFuncao LPAREN ( listaParametros )? RPAREN AS tipo listaVariavelLocal listaStatement END_FUNCTION -> ^( FUNC ^( nomeFuncao ) ^( tipo ) ^( PARAMS ( listaParametros )? ) ^( LOCAL_VARS ( listaVariavelLocal )? ) ^( STMS listaStatement ) ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:328:4: FUNCTION nomeFuncao LPAREN ( listaParametros )? RPAREN AS tipo listaVariavelLocal listaStatement END_FUNCTION
            {
            FUNCTION93=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_declaracaoFuncao1551);  
            stream_FUNCTION.add(FUNCTION93);

            pushFollow(FOLLOW_nomeFuncao_in_declaracaoFuncao1553);
            nomeFuncao94=nomeFuncao();

            state._fsp--;

            stream_nomeFuncao.add(nomeFuncao94.getTree());
            LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_declaracaoFuncao1555);  
            stream_LPAREN.add(LPAREN95);

            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:328:31: ( listaParametros )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:328:31: listaParametros
                    {
                    pushFollow(FOLLOW_listaParametros_in_declaracaoFuncao1557);
                    listaParametros96=listaParametros();

                    state._fsp--;

                    stream_listaParametros.add(listaParametros96.getTree());

                    }
                    break;

            }

            RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_declaracaoFuncao1560);  
            stream_RPAREN.add(RPAREN97);

            AS98=(Token)match(input,AS,FOLLOW_AS_in_declaracaoFuncao1562);  
            stream_AS.add(AS98);

            pushFollow(FOLLOW_tipo_in_declaracaoFuncao1564);
            tipo99=tipo();

            state._fsp--;

            stream_tipo.add(tipo99.getTree());
            pushFollow(FOLLOW_listaVariavelLocal_in_declaracaoFuncao1572);
            listaVariavelLocal100=listaVariavelLocal();

            state._fsp--;

            stream_listaVariavelLocal.add(listaVariavelLocal100.getTree());
            pushFollow(FOLLOW_listaStatement_in_declaracaoFuncao1581);
            listaStatement101=listaStatement();

            state._fsp--;

            stream_listaStatement.add(listaStatement101.getTree());
            END_FUNCTION102=(Token)match(input,END_FUNCTION,FOLLOW_END_FUNCTION_in_declaracaoFuncao1588);  
            stream_END_FUNCTION.add(END_FUNCTION102);



            // AST REWRITE
            // elements: listaParametros, listaStatement, listaVariavelLocal, tipo, nomeFuncao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 337:2: -> ^( FUNC ^( nomeFuncao ) ^( tipo ) ^( PARAMS ( listaParametros )? ) ^( LOCAL_VARS ( listaVariavelLocal )? ) ^( STMS listaStatement ) )
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:337:5: ^( FUNC ^( nomeFuncao ) ^( tipo ) ^( PARAMS ( listaParametros )? ) ^( LOCAL_VARS ( listaVariavelLocal )? ) ^( STMS listaStatement ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC, "FUNC"), root_1);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:338:2: ^( nomeFuncao )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_nomeFuncao.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:339:2: ^( tipo )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_tipo.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:340:2: ^( PARAMS ( listaParametros )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMS, "PARAMS"), root_2);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:340:11: ( listaParametros )?
                if ( stream_listaParametros.hasNext() ) {
                    adaptor.addChild(root_2, stream_listaParametros.nextTree());

                }
                stream_listaParametros.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:341:2: ^( LOCAL_VARS ( listaVariavelLocal )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCAL_VARS, "LOCAL_VARS"), root_2);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:341:15: ( listaVariavelLocal )?
                if ( stream_listaVariavelLocal.hasNext() ) {
                    adaptor.addChild(root_2, stream_listaVariavelLocal.nextTree());

                }
                stream_listaVariavelLocal.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:342:2: ^( STMS listaStatement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMS, "STMS"), root_2);

                adaptor.addChild(root_2, stream_listaStatement.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaracaoFuncao"

    public static class declaracaoProcedure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaracaoProcedure"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:347:1: declaracaoProcedure : PROCEDURE nomeProcedimento LPAREN ( listaParametros )? RPAREN listaVariavelLocal listaStatement END_PROCEDURE -> ^( PROC ^( nomeProcedimento ) ^( PARAMS ( listaParametros )? ) ^( LOCAL_VARS ( listaVariavelLocal )? ) ^( STMS ( listaStatement )? ) ) ;
    public final LBParser.declaracaoProcedure_return declaracaoProcedure() throws RecognitionException {
        LBParser.declaracaoProcedure_return retval = new LBParser.declaracaoProcedure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE103=null;
        Token LPAREN105=null;
        Token RPAREN107=null;
        Token END_PROCEDURE110=null;
        LBParser.nomeProcedimento_return nomeProcedimento104 = null;

        LBParser.listaParametros_return listaParametros106 = null;

        LBParser.listaVariavelLocal_return listaVariavelLocal108 = null;

        LBParser.listaStatement_return listaStatement109 = null;


        CommonTree PROCEDURE103_tree=null;
        CommonTree LPAREN105_tree=null;
        CommonTree RPAREN107_tree=null;
        CommonTree END_PROCEDURE110_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token END_PROCEDURE");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_listaParametros=new RewriteRuleSubtreeStream(adaptor,"rule listaParametros");
        RewriteRuleSubtreeStream stream_nomeProcedimento=new RewriteRuleSubtreeStream(adaptor,"rule nomeProcedimento");
        RewriteRuleSubtreeStream stream_listaVariavelLocal=new RewriteRuleSubtreeStream(adaptor,"rule listaVariavelLocal");
        RewriteRuleSubtreeStream stream_listaStatement=new RewriteRuleSubtreeStream(adaptor,"rule listaStatement");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:348:2: ( PROCEDURE nomeProcedimento LPAREN ( listaParametros )? RPAREN listaVariavelLocal listaStatement END_PROCEDURE -> ^( PROC ^( nomeProcedimento ) ^( PARAMS ( listaParametros )? ) ^( LOCAL_VARS ( listaVariavelLocal )? ) ^( STMS ( listaStatement )? ) ) )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:348:4: PROCEDURE nomeProcedimento LPAREN ( listaParametros )? RPAREN listaVariavelLocal listaStatement END_PROCEDURE
            {
            PROCEDURE103=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_declaracaoProcedure1648);  
            stream_PROCEDURE.add(PROCEDURE103);

            pushFollow(FOLLOW_nomeProcedimento_in_declaracaoProcedure1650);
            nomeProcedimento104=nomeProcedimento();

            state._fsp--;

            stream_nomeProcedimento.add(nomeProcedimento104.getTree());
            LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_declaracaoProcedure1652);  
            stream_LPAREN.add(LPAREN105);

            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:348:38: ( listaParametros )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:348:38: listaParametros
                    {
                    pushFollow(FOLLOW_listaParametros_in_declaracaoProcedure1654);
                    listaParametros106=listaParametros();

                    state._fsp--;

                    stream_listaParametros.add(listaParametros106.getTree());

                    }
                    break;

            }

            RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_declaracaoProcedure1657);  
            stream_RPAREN.add(RPAREN107);

            pushFollow(FOLLOW_listaVariavelLocal_in_declaracaoProcedure1662);
            listaVariavelLocal108=listaVariavelLocal();

            state._fsp--;

            stream_listaVariavelLocal.add(listaVariavelLocal108.getTree());
            pushFollow(FOLLOW_listaStatement_in_declaracaoProcedure1667);
            listaStatement109=listaStatement();

            state._fsp--;

            stream_listaStatement.add(listaStatement109.getTree());
            END_PROCEDURE110=(Token)match(input,END_PROCEDURE,FOLLOW_END_PROCEDURE_in_declaracaoProcedure1672);  
            stream_END_PROCEDURE.add(END_PROCEDURE110);



            // AST REWRITE
            // elements: listaVariavelLocal, listaParametros, listaStatement, nomeProcedimento
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 354:4: -> ^( PROC ^( nomeProcedimento ) ^( PARAMS ( listaParametros )? ) ^( LOCAL_VARS ( listaVariavelLocal )? ) ^( STMS ( listaStatement )? ) )
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:354:7: ^( PROC ^( nomeProcedimento ) ^( PARAMS ( listaParametros )? ) ^( LOCAL_VARS ( listaVariavelLocal )? ) ^( STMS ( listaStatement )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC, "PROC"), root_1);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:355:4: ^( nomeProcedimento )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_nomeProcedimento.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:356:4: ^( PARAMS ( listaParametros )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMS, "PARAMS"), root_2);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:356:13: ( listaParametros )?
                if ( stream_listaParametros.hasNext() ) {
                    adaptor.addChild(root_2, stream_listaParametros.nextTree());

                }
                stream_listaParametros.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:357:4: ^( LOCAL_VARS ( listaVariavelLocal )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCAL_VARS, "LOCAL_VARS"), root_2);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:357:17: ( listaVariavelLocal )?
                if ( stream_listaVariavelLocal.hasNext() ) {
                    adaptor.addChild(root_2, stream_listaVariavelLocal.nextTree());

                }
                stream_listaVariavelLocal.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:358:4: ^( STMS ( listaStatement )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMS, "STMS"), root_2);

                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:358:11: ( listaStatement )?
                if ( stream_listaStatement.hasNext() ) {
                    adaptor.addChild(root_2, stream_listaStatement.nextTree());

                }
                stream_listaStatement.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaracaoProcedure"

    public static class nomeFuncao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nomeFuncao"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:363:1: nomeFuncao : ID ;
    public final LBParser.nomeFuncao_return nomeFuncao() throws RecognitionException {
        LBParser.nomeFuncao_return retval = new LBParser.nomeFuncao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID111=null;

        CommonTree ID111_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:364:2: ( ID )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:364:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID111=(Token)match(input,ID,FOLLOW_ID_in_nomeFuncao1745); 
            ID111_tree = (CommonTree)adaptor.create(ID111);
            adaptor.addChild(root_0, ID111_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nomeFuncao"

    public static class nomeProcedimento_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nomeProcedimento"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:368:1: nomeProcedimento : ID ;
    public final LBParser.nomeProcedimento_return nomeProcedimento() throws RecognitionException {
        LBParser.nomeProcedimento_return retval = new LBParser.nomeProcedimento_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID112=null;

        CommonTree ID112_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:369:2: ( ID )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:369:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID112=(Token)match(input,ID,FOLLOW_ID_in_nomeProcedimento1761); 
            ID112_tree = (CommonTree)adaptor.create(ID112);
            adaptor.addChild(root_0, ID112_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nomeProcedimento"

    public static class listaParametros_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaParametros"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:373:1: listaParametros : parametro AS tipo ( VIRGULA parametro AS tipo )* -> ( ^( PARAM parametro ^( tipo ) ) )* ;
    public final LBParser.listaParametros_return listaParametros() throws RecognitionException {
        LBParser.listaParametros_return retval = new LBParser.listaParametros_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AS114=null;
        Token VIRGULA116=null;
        Token AS118=null;
        LBParser.parametro_return parametro113 = null;

        LBParser.tipo_return tipo115 = null;

        LBParser.parametro_return parametro117 = null;

        LBParser.tipo_return tipo119 = null;


        CommonTree AS114_tree=null;
        CommonTree VIRGULA116_tree=null;
        CommonTree AS118_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_VIRGULA=new RewriteRuleTokenStream(adaptor,"token VIRGULA");
        RewriteRuleSubtreeStream stream_parametro=new RewriteRuleSubtreeStream(adaptor,"rule parametro");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:374:2: ( parametro AS tipo ( VIRGULA parametro AS tipo )* -> ( ^( PARAM parametro ^( tipo ) ) )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:374:4: parametro AS tipo ( VIRGULA parametro AS tipo )*
            {
            pushFollow(FOLLOW_parametro_in_listaParametros1776);
            parametro113=parametro();

            state._fsp--;

            stream_parametro.add(parametro113.getTree());
            AS114=(Token)match(input,AS,FOLLOW_AS_in_listaParametros1778);  
            stream_AS.add(AS114);

            pushFollow(FOLLOW_tipo_in_listaParametros1780);
            tipo115=tipo();

            state._fsp--;

            stream_tipo.add(tipo115.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:374:22: ( VIRGULA parametro AS tipo )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==VIRGULA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:374:23: VIRGULA parametro AS tipo
            	    {
            	    VIRGULA116=(Token)match(input,VIRGULA,FOLLOW_VIRGULA_in_listaParametros1783);  
            	    stream_VIRGULA.add(VIRGULA116);

            	    pushFollow(FOLLOW_parametro_in_listaParametros1785);
            	    parametro117=parametro();

            	    state._fsp--;

            	    stream_parametro.add(parametro117.getTree());
            	    AS118=(Token)match(input,AS,FOLLOW_AS_in_listaParametros1787);  
            	    stream_AS.add(AS118);

            	    pushFollow(FOLLOW_tipo_in_listaParametros1789);
            	    tipo119=tipo();

            	    state._fsp--;

            	    stream_tipo.add(tipo119.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);



            // AST REWRITE
            // elements: tipo, parametro
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 377:2: -> ( ^( PARAM parametro ^( tipo ) ) )*
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:377:5: ( ^( PARAM parametro ^( tipo ) ) )*
                while ( stream_tipo.hasNext()||stream_parametro.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:377:5: ^( PARAM parametro ^( tipo ) )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);

                    adaptor.addChild(root_1, stream_parametro.nextTree());
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:377:23: ^( tipo )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_tipo.nextNode(), root_2);

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_tipo.reset();
                stream_parametro.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaParametros"

    public static class listaExpressao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaExpressao"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:380:1: listaExpressao : expressao ( VIRGULA expressao )* -> ( ^( expressao ) )* ;
    public final LBParser.listaExpressao_return listaExpressao() throws RecognitionException {
        LBParser.listaExpressao_return retval = new LBParser.listaExpressao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VIRGULA121=null;
        LBParser.expressao_return expressao120 = null;

        LBParser.expressao_return expressao122 = null;


        CommonTree VIRGULA121_tree=null;
        RewriteRuleTokenStream stream_VIRGULA=new RewriteRuleTokenStream(adaptor,"token VIRGULA");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:381:2: ( expressao ( VIRGULA expressao )* -> ( ^( expressao ) )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:381:4: expressao ( VIRGULA expressao )*
            {
            pushFollow(FOLLOW_expressao_in_listaExpressao1823);
            expressao120=expressao();

            state._fsp--;

            stream_expressao.add(expressao120.getTree());
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:381:14: ( VIRGULA expressao )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==VIRGULA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:381:15: VIRGULA expressao
            	    {
            	    VIRGULA121=(Token)match(input,VIRGULA,FOLLOW_VIRGULA_in_listaExpressao1826);  
            	    stream_VIRGULA.add(VIRGULA121);

            	    pushFollow(FOLLOW_expressao_in_listaExpressao1828);
            	    expressao122=expressao();

            	    state._fsp--;

            	    stream_expressao.add(expressao122.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 384:2: -> ( ^( expressao ) )*
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:384:5: ( ^( expressao ) )*
                while ( stream_expressao.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:384:5: ^( expressao )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_expressao.nextNode(), root_1);

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_expressao.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaExpressao"

    public static class parametro_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametro"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:387:1: parametro : ID ;
    public final LBParser.parametro_return parametro() throws RecognitionException {
        LBParser.parametro_return retval = new LBParser.parametro_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID123=null;

        CommonTree ID123_tree=null;

        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:388:2: ( ID )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:388:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID123=(Token)match(input,ID,FOLLOW_ID_in_parametro1854); 
            ID123_tree = (CommonTree)adaptor.create(ID123);
            adaptor.addChild(root_0, ID123_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parametro"

    public static class built_in_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "built_in"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:394:1: built_in : ( PRINT listaExpressao -> ^( F_PRINT listaExpressao ) | INPUT listaID -> ^( F_INPUT listaID ) );
    public final LBParser.built_in_return built_in() throws RecognitionException {
        LBParser.built_in_return retval = new LBParser.built_in_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRINT124=null;
        Token INPUT126=null;
        LBParser.listaExpressao_return listaExpressao125 = null;

        LBParser.listaID_return listaID127 = null;


        CommonTree PRINT124_tree=null;
        CommonTree INPUT126_tree=null;
        RewriteRuleTokenStream stream_INPUT=new RewriteRuleTokenStream(adaptor,"token INPUT");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_listaID=new RewriteRuleSubtreeStream(adaptor,"rule listaID");
        RewriteRuleSubtreeStream stream_listaExpressao=new RewriteRuleSubtreeStream(adaptor,"rule listaExpressao");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:394:10: ( PRINT listaExpressao -> ^( F_PRINT listaExpressao ) | INPUT listaID -> ^( F_INPUT listaID ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==PRINT) ) {
                alt17=1;
            }
            else if ( (LA17_0==INPUT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:394:12: PRINT listaExpressao
                    {
                    PRINT124=(Token)match(input,PRINT,FOLLOW_PRINT_in_built_in1867);  
                    stream_PRINT.add(PRINT124);

                    pushFollow(FOLLOW_listaExpressao_in_built_in1869);
                    listaExpressao125=listaExpressao();

                    state._fsp--;

                    stream_listaExpressao.add(listaExpressao125.getTree());


                    // AST REWRITE
                    // elements: listaExpressao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 396:2: -> ^( F_PRINT listaExpressao )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:396:5: ^( F_PRINT listaExpressao )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(F_PRINT, "F_PRINT"), root_1);

                        adaptor.addChild(root_1, stream_listaExpressao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:398:4: INPUT listaID
                    {
                    INPUT126=(Token)match(input,INPUT,FOLLOW_INPUT_in_built_in1887);  
                    stream_INPUT.add(INPUT126);

                    pushFollow(FOLLOW_listaID_in_built_in1889);
                    listaID127=listaID();

                    state._fsp--;

                    stream_listaID.add(listaID127.getTree());


                    // AST REWRITE
                    // elements: listaID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 400:2: -> ^( F_INPUT listaID )
                    {
                        // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:400:5: ^( F_INPUT listaID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(F_INPUT, "F_INPUT"), root_1);

                        adaptor.addChild(root_1, stream_listaID.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "built_in"

    public static class listaFuncao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaFuncao"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:409:1: listaFuncao : ( declaracaoFuncao )* -> ( ^( FUNC declaracaoFuncao ) )* ;
    public final LBParser.listaFuncao_return listaFuncao() throws RecognitionException {
        LBParser.listaFuncao_return retval = new LBParser.listaFuncao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.declaracaoFuncao_return declaracaoFuncao128 = null;


        RewriteRuleSubtreeStream stream_declaracaoFuncao=new RewriteRuleSubtreeStream(adaptor,"rule declaracaoFuncao");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:410:2: ( ( declaracaoFuncao )* -> ( ^( FUNC declaracaoFuncao ) )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:410:4: ( declaracaoFuncao )*
            {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:410:4: ( declaracaoFuncao )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==FUNCTION) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:410:4: declaracaoFuncao
            	    {
            	    pushFollow(FOLLOW_declaracaoFuncao_in_listaFuncao1918);
            	    declaracaoFuncao128=declaracaoFuncao();

            	    state._fsp--;

            	    stream_declaracaoFuncao.add(declaracaoFuncao128.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // AST REWRITE
            // elements: declaracaoFuncao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 413:2: -> ( ^( FUNC declaracaoFuncao ) )*
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:413:5: ( ^( FUNC declaracaoFuncao ) )*
                while ( stream_declaracaoFuncao.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:413:5: ^( FUNC declaracaoFuncao )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC, "FUNC"), root_1);

                    adaptor.addChild(root_1, stream_declaracaoFuncao.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_declaracaoFuncao.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaFuncao"

    public static class listaProcedure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaProcedure"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:417:1: listaProcedure : ( declaracaoProcedure )* -> ( ^( PROC declaracaoProcedure ) )* ;
    public final LBParser.listaProcedure_return listaProcedure() throws RecognitionException {
        LBParser.listaProcedure_return retval = new LBParser.listaProcedure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.declaracaoProcedure_return declaracaoProcedure129 = null;


        RewriteRuleSubtreeStream stream_declaracaoProcedure=new RewriteRuleSubtreeStream(adaptor,"rule declaracaoProcedure");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:418:2: ( ( declaracaoProcedure )* -> ( ^( PROC declaracaoProcedure ) )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:418:4: ( declaracaoProcedure )*
            {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:418:4: ( declaracaoProcedure )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==PROCEDURE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:418:4: declaracaoProcedure
            	    {
            	    pushFollow(FOLLOW_declaracaoProcedure_in_listaProcedure1949);
            	    declaracaoProcedure129=declaracaoProcedure();

            	    state._fsp--;

            	    stream_declaracaoProcedure.add(declaracaoProcedure129.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



            // AST REWRITE
            // elements: declaracaoProcedure
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 421:2: -> ( ^( PROC declaracaoProcedure ) )*
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:421:5: ( ^( PROC declaracaoProcedure ) )*
                while ( stream_declaracaoProcedure.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:421:5: ^( PROC declaracaoProcedure )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC, "PROC"), root_1);

                    adaptor.addChild(root_1, stream_declaracaoProcedure.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_declaracaoProcedure.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaProcedure"

    public static class listaVariavelGlobal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaVariavelGlobal"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:424:1: listaVariavelGlobal : ( declaracaoVariavel )* -> ( ^( GLOBAL_VAR declaracaoVariavel ) )* ;
    public final LBParser.listaVariavelGlobal_return listaVariavelGlobal() throws RecognitionException {
        LBParser.listaVariavelGlobal_return retval = new LBParser.listaVariavelGlobal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.declaracaoVariavel_return declaracaoVariavel130 = null;


        RewriteRuleSubtreeStream stream_declaracaoVariavel=new RewriteRuleSubtreeStream(adaptor,"rule declaracaoVariavel");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:425:2: ( ( declaracaoVariavel )* -> ( ^( GLOBAL_VAR declaracaoVariavel ) )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:425:4: ( declaracaoVariavel )*
            {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:425:4: ( declaracaoVariavel )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=86 && LA20_0<=89)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:425:4: declaracaoVariavel
            	    {
            	    pushFollow(FOLLOW_declaracaoVariavel_in_listaVariavelGlobal1976);
            	    declaracaoVariavel130=declaracaoVariavel();

            	    state._fsp--;

            	    stream_declaracaoVariavel.add(declaracaoVariavel130.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);



            // AST REWRITE
            // elements: declaracaoVariavel
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 428:2: -> ( ^( GLOBAL_VAR declaracaoVariavel ) )*
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:428:5: ( ^( GLOBAL_VAR declaracaoVariavel ) )*
                while ( stream_declaracaoVariavel.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:428:5: ^( GLOBAL_VAR declaracaoVariavel )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GLOBAL_VAR, "GLOBAL_VAR"), root_1);

                    adaptor.addChild(root_1, stream_declaracaoVariavel.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_declaracaoVariavel.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaVariavelGlobal"

    public static class listaVariavelLocal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaVariavelLocal"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:431:1: listaVariavelLocal : ( declaracaoVariavel )* -> ( ^( LOCAL_VAR declaracaoVariavel ) )* ;
    public final LBParser.listaVariavelLocal_return listaVariavelLocal() throws RecognitionException {
        LBParser.listaVariavelLocal_return retval = new LBParser.listaVariavelLocal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.declaracaoVariavel_return declaracaoVariavel131 = null;


        RewriteRuleSubtreeStream stream_declaracaoVariavel=new RewriteRuleSubtreeStream(adaptor,"rule declaracaoVariavel");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:432:2: ( ( declaracaoVariavel )* -> ( ^( LOCAL_VAR declaracaoVariavel ) )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:432:4: ( declaracaoVariavel )*
            {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:432:4: ( declaracaoVariavel )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=86 && LA21_0<=89)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:432:4: declaracaoVariavel
            	    {
            	    pushFollow(FOLLOW_declaracaoVariavel_in_listaVariavelLocal2003);
            	    declaracaoVariavel131=declaracaoVariavel();

            	    state._fsp--;

            	    stream_declaracaoVariavel.add(declaracaoVariavel131.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);



            // AST REWRITE
            // elements: declaracaoVariavel
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 435:2: -> ( ^( LOCAL_VAR declaracaoVariavel ) )*
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:435:5: ( ^( LOCAL_VAR declaracaoVariavel ) )*
                while ( stream_declaracaoVariavel.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:435:5: ^( LOCAL_VAR declaracaoVariavel )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCAL_VAR, "LOCAL_VAR"), root_1);

                    adaptor.addChild(root_1, stream_declaracaoVariavel.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_declaracaoVariavel.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaVariavelLocal"

    public static class listaStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaStatement"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:438:1: listaStatement : ( statement )* -> ( ^( statement ) )* ;
    public final LBParser.listaStatement_return listaStatement() throws RecognitionException {
        LBParser.listaStatement_return retval = new LBParser.listaStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.statement_return statement132 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:439:2: ( ( statement )* -> ( ^( statement ) )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:439:4: ( statement )*
            {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:439:4: ( statement )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=PRINT && LA22_0<=IF)||LA22_0==FOR||LA22_0==DO||(LA22_0>=EXIT_DO && LA22_0<=EXIT_FOR)||LA22_0==ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:439:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_listaStatement2029);
            	    statement132=statement();

            	    state._fsp--;

            	    stream_statement.add(statement132.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 442:2: -> ( ^( statement ) )*
            {
                // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:442:5: ( ^( statement ) )*
                while ( stream_statement.hasNext() ) {
                    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:442:5: ^( statement )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_statement.nextNode(), root_1);

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_statement.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaStatement"

    public static class elseStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStatement"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:445:1: elseStatement : listaStatement ;
    public final LBParser.elseStatement_return elseStatement() throws RecognitionException {
        LBParser.elseStatement_return retval = new LBParser.elseStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.listaStatement_return listaStatement133 = null;



        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:446:2: ( listaStatement )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:446:4: listaStatement
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_listaStatement_in_elseStatement2055);
            listaStatement133=listaStatement();

            state._fsp--;

            adaptor.addChild(root_0, listaStatement133.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseStatement"

    public static class listaDeclaracao_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listaDeclaracao"
    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:450:1: listaDeclaracao : ( declaracaoFuncao | declaracaoProcedure )* ;
    public final LBParser.listaDeclaracao_return listaDeclaracao() throws RecognitionException {
        LBParser.listaDeclaracao_return retval = new LBParser.listaDeclaracao_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LBParser.declaracaoFuncao_return declaracaoFuncao134 = null;

        LBParser.declaracaoProcedure_return declaracaoProcedure135 = null;



        try {
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:451:2: ( ( declaracaoFuncao | declaracaoProcedure )* )
            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:451:4: ( declaracaoFuncao | declaracaoProcedure )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:451:4: ( declaracaoFuncao | declaracaoProcedure )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==FUNCTION) ) {
                    alt23=1;
                }
                else if ( (LA23_0==PROCEDURE) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:451:5: declaracaoFuncao
            	    {
            	    pushFollow(FOLLOW_declaracaoFuncao_in_listaDeclaracao2069);
            	    declaracaoFuncao134=declaracaoFuncao();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaracaoFuncao134.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\macn\\Desktop\\CompilaDORES\\limited_basic\\ANTLR\\LB.g:451:24: declaracaoProcedure
            	    {
            	    pushFollow(FOLLOW_declaracaoProcedure_in_listaDeclaracao2073);
            	    declaracaoProcedure135=declaracaoProcedure();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaracaoProcedure135.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listaDeclaracao"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\15\1\100\2\uffff\1\15\7\uffff";
    static final String DFA1_maxS =
        "\1\77\1\111\2\uffff\1\77\7\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\6\1\10\1\11\1\1\1\7\1\5\1\4";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\2\5\1\2\2\uffff\1\3\3\uffff\1\4\7\uffff\1\6\1\7\37\uffff\1"+
            "\1",
            "\1\10\10\uffff\1\11",
            "",
            "",
            "\3\13\2\uffff\1\13\3\uffff\1\13\1\12\1\13\5\uffff\2\13\37"+
            "\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "105:1: statement : ( chamadaMetodo -> ^( CHAMADA chamadaMetodo ) | if_then_else -> ^( IF_THEN_ELSE if_then_else ) | lacoFor -> ^( lacoFor ) | lacoUntil -> ^( lacoUntil ) | lacoWhile -> ^( lacoWhile ) | built_in -> ^( built_in ) | atribuicao -> ^( ATRIBUICAO atribuicao ) | EXIT_DO -> ^( BREAK_DO ) | EXIT_FOR -> ^( BREAK_FOR ) );";
        }
    }
    static final String DFA8_eotS =
        "\13\uffff";
    static final String DFA8_eofS =
        "\3\uffff\1\12\7\uffff";
    static final String DFA8_minS =
        "\1\4\2\uffff\1\7\7\uffff";
    static final String DFA8_maxS =
        "\1\104\2\uffff\1\117\7\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\3";
    static final String DFA8_specialS =
        "\13\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\5\1\6\1\2\70\uffff\1\3\1\1\1\uffff\1\4\1\7\1\10",
            "",
            "",
            "\2\12\2\uffff\1\12\1\uffff\12\12\1\uffff\1\12\2\uffff\5\12"+
            "\37\uffff\1\12\1\11\1\12\3\uffff\13\12",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "167:1: fator : ( LPAREN expressao RPAREN -> ^( expressao ) | NOT fator -> ^( NAO fator ) | ID | INT | TRUE | FALSE | STRING | CHAR | chamadaMetodo -> ^( CHAMADA chamadaMetodo ) );";
        }
    }
 

    public static final BitSet FOLLOW_PROGRAM_in_program440 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_nomePrograma_in_program446 = new BitSet(new long[]{0x80000000C044FC00L,0x0000000003C00000L});
    public static final BitSet FOLLOW_listaVariavelGlobal_in_program452 = new BitSet(new long[]{0x80000000C044FC00L});
    public static final BitSet FOLLOW_listaDeclaracao_in_program457 = new BitSet(new long[]{0x80000000C044E800L});
    public static final BitSet FOLLOW_listaStatement_in_program462 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_END_in_program470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_nomePrograma528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaMetodo_in_statement545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_then_else_in_statement565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lacoFor_in_statement585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lacoUntil_in_statement604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lacoWhile_in_statement623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_built_in_in_statement642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_statement661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_DO_in_statement681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_FOR_in_statement697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjuncao_in_expressao721 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_OR_in_expressao724 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_conjuncao_in_expressao727 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_termo_in_conjuncao740 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_operadorN1_in_conjuncao743 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_termo_in_conjuncao746 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_expr1_in_termo758 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_operadorN2_in_termo761 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expr1_in_termo764 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_expr2_in_expr1777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_operadorN3_in_expr1780 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expr2_in_expr1783 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_expr3_in_expr2796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_operadorN4_in_expr2799 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expr3_in_expr2802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_fator_in_expr3814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_operadorN5_in_expr3817 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_fator_in_expr3820 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_LPAREN_in_fator833 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expressao_in_fator835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_fator837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fator849 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_fator_in_fator851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fator865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_fator870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_fator875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_fator880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_fator885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_fator890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaMetodo_in_fator895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_operadorN1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operadorN20 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operadorN30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operadorN40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operadorN50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_lacoFor1012 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_atribuicao_in_lacoFor1014 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_TO_in_lacoFor1016 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expressao_in_lacoFor1018 = new BitSet(new long[]{0x80000000C074E000L});
    public static final BitSet FOLLOW_STEP_in_lacoFor1021 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expressao_in_lacoFor1023 = new BitSet(new long[]{0x80000000C064E000L});
    public static final BitSet FOLLOW_listaStatement_in_lacoFor1030 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NEXT_in_lacoFor1035 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ID_in_lacoFor1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_lacoWhile1110 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_WHILE_in_lacoWhile1112 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expressao_in_lacoWhile1114 = new BitSet(new long[]{0x80000000C144E000L});
    public static final BitSet FOLLOW_listaStatement_in_lacoWhile1118 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LOOP_in_lacoWhile1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_lacoUntil1172 = new BitSet(new long[]{0x80000000C144E000L});
    public static final BitSet FOLLOW_listaStatement_in_lacoUntil1177 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LOOP_in_lacoUntil1183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_UNTIL_in_lacoUntil1185 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expressao_in_lacoUntil1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_then_else1253 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expressao_in_if_then_else1255 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_THEN_in_if_then_else1257 = new BitSet(new long[]{0x80000000C046E000L});
    public static final BitSet FOLLOW_listaStatement_in_if_then_else1265 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ELSE_in_if_then_else1270 = new BitSet(new long[]{0x80000000C844E000L});
    public static final BitSet FOLLOW_listaStatement_in_if_then_else1280 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_END_IF_in_if_then_else1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_chamadaMetodo1349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LPAREN_in_chamadaMetodo1351 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001FL});
    public static final BitSet FOLLOW_listaArgs_in_chamadaMetodo1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_chamadaMetodo1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumentos_in_listaArgs1385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_VIRGULA_in_listaArgs1388 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_argumentos_in_listaArgs1390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_expressao_in_argumentos1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atribuicao1442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_IGUAL_in_atribuicao1444 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expressao_in_atribuicao1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_declaracaoVariavel1474 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_listaID_in_declaracaoVariavel1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_listaID1491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_VIRGULA_in_listaID1494 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ID_in_listaID1496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_tipo1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_declaracaoFuncao1551 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_nomeFuncao_in_declaracaoFuncao1553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LPAREN_in_declaracaoFuncao1555 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_listaParametros_in_declaracaoFuncao1557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_declaracaoFuncao1560 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_declaracaoFuncao1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_tipo_in_declaracaoFuncao1564 = new BitSet(new long[]{0x80000000D044E000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_listaVariavelLocal_in_declaracaoFuncao1572 = new BitSet(new long[]{0x80000000D044E000L});
    public static final BitSet FOLLOW_listaStatement_in_declaracaoFuncao1581 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_END_FUNCTION_in_declaracaoFuncao1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_declaracaoProcedure1648 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_nomeProcedimento_in_declaracaoProcedure1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LPAREN_in_declaracaoProcedure1652 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_listaParametros_in_declaracaoProcedure1654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_declaracaoProcedure1657 = new BitSet(new long[]{0x80000000E044E000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_listaVariavelLocal_in_declaracaoProcedure1662 = new BitSet(new long[]{0x80000000E044E000L});
    public static final BitSet FOLLOW_listaStatement_in_declaracaoProcedure1667 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_END_PROCEDURE_in_declaracaoProcedure1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_nomeFuncao1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_nomeProcedimento1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parametro_in_listaParametros1776 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_listaParametros1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_tipo_in_listaParametros1780 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_VIRGULA_in_listaParametros1783 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_parametro_in_listaParametros1785 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_listaParametros1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_tipo_in_listaParametros1789 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_expressao_in_listaExpressao1823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_VIRGULA_in_listaExpressao1826 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_expressao_in_listaExpressao1828 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_parametro1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_built_in1867 = new BitSet(new long[]{0x8000000000000070L,0x000000000000001DL});
    public static final BitSet FOLLOW_listaExpressao_in_built_in1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INPUT_in_built_in1887 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_listaID_in_built_in1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoFuncao_in_listaFuncao1918 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_declaracaoProcedure_in_listaProcedure1949 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_declaracaoVariavel_in_listaVariavelGlobal1976 = new BitSet(new long[]{0x0000000000000002L,0x0000000003C00000L});
    public static final BitSet FOLLOW_declaracaoVariavel_in_listaVariavelLocal2003 = new BitSet(new long[]{0x0000000000000002L,0x0000000003C00000L});
    public static final BitSet FOLLOW_statement_in_listaStatement2029 = new BitSet(new long[]{0x80000000C044E002L});
    public static final BitSet FOLLOW_listaStatement_in_elseStatement2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoFuncao_in_listaDeclaracao2069 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_declaracaoProcedure_in_listaDeclaracao2073 = new BitSet(new long[]{0x0000000000001402L});

}