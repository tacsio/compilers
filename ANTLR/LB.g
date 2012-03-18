grammar LB;

options{

output = AST;
ASTLabelType = CommonTree;

}


tokens{

TRUE 		=  'TRUE'		;
FALSE		=  'FALSE'		;
NOT		=  'NOT'		;
AND		=  'AND'		;
OR		=  'OR'		;
AS		=  'AS'		;
FUNCTION		=  'FUNCTION'	;
END		=  'END'		;
PROCEDURE		=  'SUB'		;
PRINT		=  'PRINT'		;
INPUT		=  'INPUT'		;
IF		=  'IF'		;
THEN		=  'THEN'		;
ELSE		=  'ELSE'		;
FOR		=  'FOR'		;
TO		=  'TO'		;
STEP		=  'STEP'		;
NEXT		=  'NEXT'		;
DO		=  'DO'		;
WHILE		=  'WHILE'		;
LOOP		=  'LOOP'		;
UNTIL		=  'UNTIL'		;
PROGRAM		=  'PROGRAM'	;
END_IF		=  'END IF'		;
END_FUNCTION	=  'END FUNCTION'	;
END_PROCEDURE	=  'END SUB'		;
EXIT_DO		=  'EXIT DO'		;
EXIT_FOR		=  'EXIT FOR'		;


PROG;
ARGS;
GLOBAL_VAR;
LOCAL_VAR;
FUNCS;
PROCS;
FUNC;
PROC;
STMS;
DECLS;
CHAMADA;
IF_THEN_ELSE;
LACO_FOR;
LACO_UNTIL;
LACO_WHILE;
ATRIBUICAO;
CONDICAO;
PARAMS;
PARAM;
IF_NODE;
ELSE_NODE;
F_PRINT;
F_INPUT;
NAO;
BREAK_FOR;
BREAK_DO;
LIMITE_FOR;
STEP_FOR;
NEXT_FOR;
LOCAL_VARS;
GLOBAL_VARS;

}



program	: PROGRAM 
	  nomePrograma 
	  listaVariavelGlobal
	  listaDeclaracao
	  listaStatement
	  
	 END
	
	 //REGRA SEMANTICA
	-> ^(PROG 
	^(nomePrograma) 
	^(GLOBAL_VARS listaVariavelGlobal?)
	^(DECLS listaDeclaracao?)
	^(STMS listaStatement?)
	 ) 
	;

nomePrograma
	: ID
	;

	
////////////////////////////////////////////////////////////////////////////////
/////                                          STATEMENTS                                           ////
///////////////////////////////////////////////////////////////////////////////

statement
	: chamadaMetodo 
	 //REGRA SEMANTICA
	-> ^(CHAMADA chamadaMetodo)
	
	| if_then_else 
	 //REGRA SEMANTICA
	-> ^(IF_THEN_ELSE if_then_else)
	
	| lacoFor 
	//REGRA SEMANTICA
	-> ^(lacoFor) 	
	
	| lacoUntil
	//REGRA SEMANTICA
	 -> ^(lacoUntil) 
	 
	| lacoWhile
	//REGRA SEMANTICA
	 -> ^(lacoWhile) 
	 
	| built_in
	//REGRA SEMANTICA
	 -> ^(built_in) 
	 
	| atribuicao
	//REGRA SEMANTICA
	 -> ^(ATRIBUICAO atribuicao)
	 
	| EXIT_DO
	//REGRA SEMANTICA
	-> ^(BREAK_DO)
	
	| EXIT_FOR
	//REGRA SENANTICA
	-> ^(BREAK_FOR)
	;


////////////////////////////////////////////////////////////////////////////////
/////                             EXPRESSOES                        ////
///////////////////////////////////////////////////////////////////////////////
expressao
	: conjuncao (OR^ conjuncao)*
	;

conjuncao
	: termo (operadorN1^ termo)*
	;

termo	: expr1 (operadorN2^ expr1)*
	;
	
expr1	: expr2 (operadorN3^ expr2)*
	;
	
expr2	: expr3 (operadorN4^ expr3)*
	;
	
expr3	:fator (operadorN5^ fator)*
	;
	
fator	: LPAREN expressao RPAREN -> ^(expressao) //REGRA SEMANTICA
	| NOT fator -> ^(NAO fator) //REGRA SEMANTICA
	| ID
	| INT
	| TRUE
	| FALSE
	| STRING
	| CHAR
	| chamadaMetodo
	// REGRA SEMANTICA
	-> ^(CHAMADA chamadaMetodo)
	;

operadorN1
	: AND	
	;
	
operadorN2
	: MAIOR
	| MAIOR_IGUAL
	| MENOR
	| MENOR_IGUAL
	;
	
operadorN3
	: IGUAL
	| DIFERENTE
	;
	
operadorN4
	: SOM
	| SUB
	;
	
operadorN5
	: MULT
	| DIV
	;


////////////////////////////////////////////////////////////////////////////////
/////                                  LACOS                           ////
///////////////////////////////////////////////////////////////////////////////


lacoFor	: FOR atribuicao TO expressao (STEP expressao)?
 	 listaStatement
	  NEXT ID
	  
	  //REGRA SEMANTICA
	-> ^(LACO_FOR
	^(ATRIBUICAO atribuicao)
	^(LIMITE_FOR expressao)
	^(STEP_FOR expressao?)
	^(STMS listaStatement)
	^(NEXT_FOR ID)
      	)
	;


	
lacoWhile
	: DO WHILE expressao
	 listaStatement 
	 LOOP
	 
	 //REGRA SEMANTICA
	 -> ^(LACO_WHILE 
	 ^(CONDICAO expressao) 
	 ^(STMS listaStatement)
	 )	 
	;
	
lacoUntil
	: DO 
	 listaStatement
  	 LOOP UNTIL expressao
  	 
  	 //REGRA SEMANTICA
  	 -> ^(LACO_UNTIL
  	 ^(STMS listaStatement)
  	 ^(CONDICAO expressao)
  	 )
 	;
	
	

////////////////////////////////////////////////////////////////////////////////
/////                ESTRUTURAS DE CONTROLE            ////
///////////////////////////////////////////////////////////////////////////////
	
if_then_else
	: IF expressao THEN
	 a = listaStatement
	  ELSE
	// elseStatement
	 b = listaStatement
	  END_IF
	  
	  -> ^(CONDICAO expressao) 
	  ^(IF_NODE ^(STMS $a)?)
	  ^(ELSE_NODE ^(STMS $b)?)
	;
	
	
////////////////////////////////////////////////////////////////////////////////
/////                   CHAMADAS DE METODO               ////
///////////////////////////////////////////////////////////////////////////////

chamadaMetodo
	: ID LPAREN listaArgs? RPAREN
	
	//REGRA SEMANTICA
	-> ID ^(ARGS listaArgs?) 
	;
	
listaArgs
	: argumentos (VIRGULA argumentos)*
	
	//REGRA SEMANTICA
	-> ^(argumentos)*
	;

argumentos
	: expressao
	
	//REGRA SEMANTICA
	-> ^(expressao)
	;

////////////////////////////////////////////////////////////////////////////////
/////             ATRIBUICOES E DECLARACOES            ////
///////////////////////////////////////////////////////////////////////////////


atribuicao
	: ID IGUAL expressao
	
	//REGRA SEMANTICA
	-> ^(ID)
	^(expressao)
	;
	
declaracaoVariavel
	: tipo listaID 
	//| tipo atribuicao  -> tipo ^(ATRIBUICAO atribuicao) //REGRA SEMANTICA
	;
		
listaID	: ID (VIRGULA ID)*

	//REGRA SEMANTICA
	-> ^(ID)*
	;

tipo	: ('BOOLEAN' 
	| 'INTEGER' 
	| 'STRING' 
	| 'CHAR')
	;

declaracaoFuncao	
	: FUNCTION nomeFuncao LPAREN listaParametros? RPAREN AS tipo 
	
	  listaVariavelLocal
	  
	  listaStatement
	
	  END_FUNCTION
	
	 //REGRA SEMANTICA
	-> ^(FUNC
	^(nomeFuncao)
	^(tipo)
	^(PARAMS listaParametros?)
	^(LOCAL_VARS listaVariavelLocal?)
	^(STMS listaStatement?)
	)
	
	;

declaracaoProcedure
	: PROCEDURE nomeProcedimento LPAREN listaParametros? RPAREN
	  listaVariavelLocal
	  listaStatement
	  END_PROCEDURE
	  
	  //REGRA SEMANTICA
	  -> ^(PROC
	  ^(nomeProcedimento)
	  ^(PARAMS listaParametros?)
	  ^(LOCAL_VARS listaVariavelLocal?)
	  ^(STMS listaStatement?)
	  )	  
	;


nomeFuncao
	: ID
	;
	
			
nomeProcedimento
	: ID
	;
	
		
listaParametros
	: parametro AS tipo (VIRGULA parametro AS tipo)*
	
	//REGRA SEMANTICA
	-> ^(PARAM parametro ^(tipo))*
	; 
		
listaExpressao
	: expressao (VIRGULA expressao)*
	
	//REGRA SEMANTICA
	-> ^(expressao)*
	;
	
parametro
	: ID
	;




built_in	: PRINT listaExpressao
	//REGRA SEMANTICA
	-> ^(F_PRINT listaExpressao)
	
	| INPUT listaID
	//REGRA SEMANTICA
	-> ^(F_INPUT listaID)
	;



////////////////////////////////////////////////////////////////////////////////
/////                                SEMANTICA                                  /////
///////////////////////////////////////////////////////////////////////////////
	
listaFuncao
	: declaracaoFuncao*
	
	//REGRA SEMANTICA
	-> ^(FUNC declaracaoFuncao)*
		
	;
		
listaProcedure
	: declaracaoProcedure*
	
	//REGRA SEMANTICA
	-> ^(PROC declaracaoProcedure)*
	;
	
listaVariavelGlobal
	: declaracaoVariavel*
	
	//REGRA SEMANTICA
	-> ^(GLOBAL_VAR declaracaoVariavel)*
	;
	
listaVariavelLocal
	: declaracaoVariavel*
	
	//REGRA SEMANTICA
	-> ^(LOCAL_VAR declaracaoVariavel)*
	;

listaStatement
	: statement*
	
	//REGRA SEMANTICA
	-> ^(statement)*	
	;
	
elseStatement
	: listaStatement	
	;


listaDeclaracao
	: (declaracaoFuncao | declaracaoProcedure)* 
	
	//REGRA SEMANTICA
	/*-> 
	^(PROCS declaracaoProcedure*)
	^(FUNCS declaracaoFuncao*)*/
	;


////////////////////////////////////////////////////////////////////////////////
/////                                LEXEMAS                        /////
///////////////////////////////////////////////////////////////////////////////

ID  :	('a'..'z'|'A'..'Z'|'_'|'$') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')*
    ;

INT :	'0'..'9'+
    	| LPAREN SUB '0'..'9'+  RPAREN
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
    
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

IGUAL 
    :   '='
    ;
    
DIFERENTE
    :   '<>'
    |   '><'
    ;

MENOR 
    :    '<'
    ;

MAIOR 
    :    '>'
    ;
    
MAIOR_IGUAL
     :   '>='
     ;
     
MENOR_IGUAL
     :  '<='
     ;

VIRGULA
    :   ','
    ;
    
SOM
    :   '+'
    ;

SUB
    :   '-'
    ;

MULT
    :   '*'
    ;

DIV
    :   '/'
    ;


LPAREN
    :   '('
    ;

RPAREN
    :   ')'
    ;


fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
