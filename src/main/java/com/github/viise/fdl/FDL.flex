package com.github.viise.fdl;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.github.viise.fdl.psi.FDLTypes;
import com.intellij.psi.TokenType;
%%

%class FDLLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

//A=[aA];
//B=[bB];
//C=[cC];
//D=[dD];
//E=[eE];
//F=[fF];
//G=[gG];
//H=[hH];
//I=[iI];
//J=[jJ];
//K=[kK];
//L=[lL];
//M=[mM];
//N=[nN];
//O=[oO];
//P=[pP];
//Q=[qQ];
//R=[rR];
//S=[sS];
//T=[tT];
//U=[uU];
//V=[vV];
//W=[wW];
//X=[xX];
//Y=[yY];
//Z=[zZ];
// Keywords
AND      = [aA][nN][dD]                         // {A}{N}{D}
CONST    = [cC][oO][nN][sS][tT]                 // {C}{O}{N}{S}{T}
ELIF     = [eE][lL][iI][fF]                     // {E}{L}{I}{F}
ELSE     = [eE][lL][sS][eE]                     // {E}{L}{S}{E}
ELSEIF   = [eE][lL][sS][eE][iI][fF]             // {E}{L}{S}{E}{I}{F}
END      = [eE][nN][dD]                         // {E}{N}{D}
ENDMACRO = [eE][nN][dD][mM][aA][cC][rR][oO]     // {E}{N}{D}{M}{A}{C}{R}{O}
EXCEPT   = [eE][xX][cC][eE][pP][tT]             // {E}{X}{C}{E}{P}{T}
FINALLY  = [fF][iI][nN][aA][lL][lL][yY]         // {F}{I}{N}{A}{L}{L}{Y}
FUNCTION = [fF][uU][nN][cC][tT][iI][oO][nN]     // {F}{U}{N}{C}{T}{I}{O}{N}
IF       = [iI][fF]                             // {I}{F}
INPUT    = [iI][nN][pP][uU][tT]                 // {I}{N}{P}{U}{T}
LINK     = [lL][iI][nN][kK]                     // {L}{I}{N}{K}
MACRO    = [mM][aA][cC][rR][oO]                 // {M}{A}{C}{R}{O}
NIL      = [nN][iI][lL]                         // {N}{I}{L}
NOT      = [nN][oO][tT]                         // {N}{O}{T}
NULL     = [nN][uU][lL][lL]                     // {N}{U}{L}{L}
OR       = [oO][rR]                             // {O}{R}
OUTPUT   = [oO][uU][tT][pP][uU][tT]             // {O}{U}{T}{P}{U}{T}
PRIVATE  = [pP][rR][iI][vV][aA][tT][eE]         // {P}{R}{I}{V}{A}{T}{E}
PROCEDURE= [pP][rR][oO][cC][eE][dD][uU][rR][eE] // {P}{R}{O}{C}{E}{D}{U}{R}{E}
RAISE    = [rR][aA][iI][sS][eE]                 // {R}{A}{I}{S}{E}
STRUCT   = [sS][tT][rR][uU][cC][tT]             // {S}{T}{R}{U}{C}{T}
TABLE    = [tT][aA][bB][lL][eE]                 // {T}{A}{B}{L}{E}
TRY      = [tT][rR][yY]                         // {T}{R}{Y}
USES     = [uU][sS][eE][sS]                     // {U}{S}{E}{S}
VAR      = [vV][aA][rR]                         // {V}{A}{R}
WHILE    = [wW][hH][iI][lL][eE]                 // {W}{H}{I}{L}{E}
XOR      = [xX][oO][rR]                         // {X}{O}{R}
TRUE     = [tT][rR][uU][eE]                     // {T}{R}{U}{E}
FALSE    = [fF][aA][lL][sS][eE]                 // {F}{A}{L}{S}{E}

INTEGER=0|[1-9][0-9]*
FLOAT=({INTEGER}{DOT}{INTEGER})

HEX=0[xX]({HEX_DIGIT})+
HEX_DIGIT=([0-9]|[a-f]|[A-F])

NUMBER = INTEGER | FLOAT | HEX

STRING=[^\"\n]
STRINGOQOUTES=[^\'\n]

LITERAL={NUMBER} | {STRING} | {TRUE} | {FALSE} | {NULL}
LITERAL_ANY={LITERAL} | {NAME}

// Variables name
NAME=[:jletter:][:jletterdigit:]*

BASICSTRING={INTEGER}([^\ \n\r(){}\[\];,.=><!~?:+\-*/&|\^%@\"])+

// Separators
LPAREN="("
RPAREN=")"
LBRACE="{"
RBRACE="}"
LBRACK="["
RBRACK="]"
SEMI=[;]
//COMMA=,
DOT=[.]

// Operators
ASSIGN=[=]
ASSIGN2=[:=]
GT=[>]
LT=[<]
BANG=[!]
TILDE=[~]
QUESTION=[?]
COLON=[:]
EQUAL=[==]
LE=[<=]
GE=[>=]
NOTEQUAL=[<>]
ADD=[+]
SUB=[-]
MUL=[*]
DIV=[/]
BITAND=[&]
BITOR=[|]
POW=\^
MOD=[%]
PTR=[@]
LF=[_LF]
FF=[_FF]

// Whitespace and comments
CRLF=\R
WS=[\ \t\r\n\u000C]
COMMENT=("//"[^\r\n]*)|("{"[^{}]*~"}")

OPERATIONS={ADD} | {SUB} | {DIV} | {MUL} | {ASSIGN}

%state WAITING_VALUE, START_STRING, STOP_STRING

%%
<YYINITIAL>  {COMMENT}               { yybegin(YYINITIAL); return FDLTypes.COMMENT; }
<YYINITIAL>  {VAR}                   { yybegin(YYINITIAL); return FDLTypes.VAR; }
<YYINITIAL>  {NAME}                  { yybegin(YYINITIAL); return FDLTypes.NAME; }
<YYINITIAL>  ({ASSIGN}|{ASSIGN2})    { yybegin(YYINITIAL); return FDLTypes.ASSIGN; }
             {INTEGER}               { yybegin(YYINITIAL); return FDLTypes.INTEGER; }
             {FLOAT}                 { yybegin(YYINITIAL); return FDLTypes.FLOAT; }
             {TRUE}                  { yybegin(YYINITIAL); return FDLTypes.TRUE; }
             {FALSE}                 { yybegin(YYINITIAL); return FDLTypes.FALSE; }
             {NULL}                  { yybegin(YYINITIAL); return FDLTypes.NULL; }
             {HEX}                   { yybegin(YYINITIAL); return FDLTypes.HEX; }
             {ADD}                   { yybegin(YYINITIAL); return FDLTypes.ADD; }
             {SUB}                   { yybegin(YYINITIAL); return FDLTypes.SUB; }
             {DIV}                   { yybegin(YYINITIAL); return FDLTypes.DIV; }
             {MUL}                   { yybegin(YYINITIAL); return FDLTypes.MUL; }
<YYINITIAL>  {SEMI}                  { yybegin(YYINITIAL); return FDLTypes.SEMI; }
<YYINITIAL>  (\"{STRING}*~\")
             | ("'"{STRINGOQOUTES}*~"'")
             | (\"{NAME}*~\")
             | ("'"{NAME}*~"'")      { yybegin(YYINITIAL); return FDLTypes.STRING; }

             ({CRLF}|{WS})+          { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
[^]                                  { return TokenType.BAD_CHARACTER; }// throw new Error("Illegal character <"+yytext()+">"); }

