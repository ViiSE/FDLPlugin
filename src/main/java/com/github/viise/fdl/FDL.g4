grammar FDL;

/* Lexer */

// Case-Insensitive
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

// Keywords
AND       : A N D;
CONST     : C O N S T;
ELIF      : E L I F;
ELSE      : E L S E;
ELSEIF    : E L S E I F;
END       : E N D;
ENDMACRO  : E N D M A C R O;
EXCEPT    : E X C E P T;
FINALLY   : F I N A L L Y;
FUNCTION  : F U N C T I O N;
IF        : I F ;
INPUT     : I N P U T;
LINK      : L I N K;
MACRO     : M A C R O;
NIL       : N I L;
NOT       : N O T;
NULL      : N U L L;
OR        : O R;
OUTPUT    : O U T P U T;
PRIVATE   : P R I V A T E;
PROCEDURE : P R O C E D U R E;
RAISE     : R A I S E;
STRUCT    : S T R U C T;
TABLE     : T A B L E;
TRY       : T R Y;
USES      : U S E S;
VAR       : V A R;
WHILE     : W H I L E;
XOR       : X O R;
TRUE      : T R U E;
FALSE     : F A L S E;

INTEGER
   : DIGIT+
   ;

FLOAT
   : INTEGER DOT INTEGER
   ;

HEX: '0' 'x' HEX_DIGIT+;

fragment
HEX_DIGIT: ('0'..'9'|'a'..'f'|'A'..'F');

fragment
DIGIT: [0-9];

STRING
   : '"' ~[\r\n"]* '"'
   | '\'' ~[\r\n']* '\''
   ;

// Variables name
NAME: ~(
              '\r'
              |
              '\n'
              |
              '('
              |
              ')'
              |
              '{'
              |
              '}'
              |
              '['
              |
              ']'
              |
              ';'
              |
              ','
              |
              '.'
              |
              '='
              |
              '>'
              |
              '<'
              |
              '!'
              |
              '~'
              |
              '?'
              |
              ':'
              |
              '+'
              |
              '-'
              |
              '*'
              |
              '/'
              |
              '&'
              |
              '|'
              |
              '^'
              |
              '%'
              |
              '@'
              |
              '"')
           |
           (
              'a'..'z'
              |'A'..'Z'
              |'_'
              )
           (
              'a'..'z'
              |'A'..'Z'
              |'0'..'9'
              |'_'
           )+;

BASICSTRING
   : DIGIT+ ~(
      '\r'
      |
      '\n'
      |
      '('
      |
      ')'
      |
      '{'
      |
      '}'
      |
      '['
      |
      ']'
      |
      ';'
      |
      ','
      |
      '.'
      |
      '='
      |
      '>'
      |
      '<'
      |
      '!'
      |
      '~'
      |
      '?'
      |
      ':'
      |
      '+'
      |
      '-'
      |
      '*'
      |
      '/'
      |
      '&'
      |
      '|'
      |
      '^'
      |
      '%'
      |
      '@'
      |
      ' '
      |
      '"'
      )*;

// Separators
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

// Operators
ASSIGN : '=';
ASSIGN2 : ':=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '<>';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
POW : '^';
MOD : '%';
PTR: '@';
LF: '_LF';
FF: '_FF';

// Whitespace and comments
WS: [ \t\r\n\u000C]+ -> skip;

COMMENT: '{' .*? '}' -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;

/* Parser */

program
   :
   rules EOF
   ;

rules
   :
   (varRules
   |
   comment
   |
   expressions)*
   ;

number
   : INTEGER
   | FLOAT
   | HEX
   ;


literal
   : number
   |
   STRING
   |
   TRUE
   |
   FALSE
   |
   NULL
   ;

literalName: NAME;

literalAny
   :
   literal
   |
   literalName
   ;

varRules
   :
   varRule1
   |
   varRule2
   ;

operations
   :
   ADD
   |
   SUB
   |
   DIV
   |
   MUL
   |
   ASSIGN
   ;

expressions: literalName (' ')* operations (' ')* literalAny (' ')* SEMI (' ')* comment* ;

varRule1: VAR (' ')* literalName (' ')* ASSIGN (' ')* literalAny (' ')* SEMI (' ')* comment* ;
varRule2: VAR (' ')* literalName (' ')* ASSIGN (' ')* literalAny (' ')* operations (' ')* literalAny (' ')* SEMI (' ')* comment*;

comment: COMMENT | LINE_COMMENT;