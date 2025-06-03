grammar MiLenguaje;

// Reglas del parser
program : (incluide | declaracion)* EOF ;

incluide
    : INCLUIR libreria PUNTOYCOMA?
    ;

libreria
    : MENOR ID (PUNTO ID)* MAYOR
    | COMILLA ID (PUNTO ID)* COMILLA
    ;



listaParametros
    : parametro (COMA parametro)*
    ;

parametro
    : tipo ID
    ;

bloque
    : LLAVE_IZQ (declaracion | instruccion)* LLAVE_DER
    ;

instrucciones
    : instruccion*
    ;

instruccion
    : declaracion
    | bucles
    ;

bucles
    : whileLoop
    | forLoop
    ;

whileLoop
    : 'while' PAREN_IZQ expresion PAREN_DER bloque
    ;

forLoop
    : 'for' PAREN_IZQ declaracionVariable? PUNTOYCOMA expresion? PUNTOYCOMA expresion? PAREN_DER bloque
    ;

expresion
    : ID
    | literal
    | expresion operadorAritmetico expresion
    | PAREN_IZQ expresion PAREN_DER
    ;


declaracion
    : declaracionVariable
    | declaracionFuncion
    ;

declaracionFuncion
    : tipo ID
      PAREN_IZQ
        ( listaParametros
        | VOID
        |
        )
      PAREN_DER
      bloque
    ;

declaracionVariable
    : tipo ID ASIGNAR literal PUNTOYCOMA
    ;

tipo
    : INT
    | FLOAT
    | VOID
    | CHAR
    | DOUBLE
    | STRING
    | BOOL
    ;

literal
    : INT_LIT
    | FLOAT_LIT
    | CHAR_LIT
    | DOUBLE_LIT
    | STRING_LIT
    | TRUE
    | FALSE
    ;

operadorAritmetico
: IGUAL_IGUAL
| MAYOR_IGUAL
| MAYOR
| MENOR_IGUAL
| MENOR
| DIFERENTE;


// Regalas Léxicas (lexer)
// -----------------------------------------------------------------------------

// Tipos de datos
INT     : 'int' ;
FLOAT   : 'float' ;
VOID    : 'void' ;
CHAR    : 'char' ;
DOUBLE  : 'double' ;
STRING  : 'string' ;
BOOL    : 'bool' ;

// Literales
INT_LIT   : [0-9]+ ;
FLOAT_LIT : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
CHAR_LIT  : '\'' (~['\\\r\n] | '\\' .) '\'' ;
DOUBLE_LIT : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
STRING_LIT : '"' (~["\\\r\n] | '\\' .)* '"' ;
// Booleanos
TRUE    : 'true' ;
FALSE   : 'false' ;


// Palabras reservadas
RETURN      : 'return' ;
SI          : 'if' ;
SINO        : 'else' ;
IMPRIMIR    : 'print' ;
WHILE       : 'while' ;
FOR         : 'for' ;
INCLUIR     : '#include' ;

// Operadores compuestos de asignación
MASIGUAL         : '+=' ;
MENOSIGUAL       : '-=' ;
ASTERISCOIGUAL   : '*=' ;
BARRAIGUAL       : '/=' ;
PORCENTAJEIGUAL  : '%=' ;

// Operadores de comparación de dos caracteres
MENOR_IGUAL      : '<=' ;
MAYOR_IGUAL      : '>=' ;

// Símbolos simples '<' y '>'
MENOR            : '<' ;
MAYOR            : '>' ;

// Para cadenas literales y "entre comillas"
COMILLA          : '"' ;

// Operadores
MAS              : '+' ;
MENOS            : '-' ;
ASTERISCO        : '*' ;
BARRA            : '/' ;
PORCENTAJE       : '%' ;

IGUAL_IGUAL      : '==' ;
DIFERENTE        : '!=' ;
ASIGNAR          : '=' ;

Y_LOGICO         : '&&' ;
O_LOGICO         : '||' ;
NO_LOGICO        : '!' ;

INCREMENTO       : '++' ;
DECREMENTO       : '--' ;

// Separadores
PUNTO            : '.' ;
PAREN_IZQ        : '(' ;
PAREN_DER        : ')' ;
LLAVE_IZQ        : '{' ;
LLAVE_DER        : '}' ;
PUNTOYCOMA       : ';' ;
COMA             : ',' ;

// Identificadores
ID          : [a-zA-Z][a-zA-Z0-9_]* ;

// Ignorar espacios en blanco y comentarios
WS          : [ \t\r\n]+ -> skip ;
COMMENT     : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
