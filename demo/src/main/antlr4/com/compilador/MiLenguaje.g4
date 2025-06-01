grammar MiLenguaje;

// Reglas del parser (simplificadas)
program : incluide* EOF ;

incluide
    : INCLUIR libreria PUNTOYCOMA?
    ;

libreria
    : MENOR ID (PUNTO ID)* MAYOR
    | COMILLA ID (PUNTO ID)* COMILLA
    ;

// Lexer rules (reglas léxicas)
// Identificadores
ID          : [a-zA-Z][a-zA-Z0-9_]* ;

// Literales
HEX         : '0' [xX] [0-9a-fA-F]+ ;           //Se coloca aca para que no se confunda con un Integer,
                                                //ya que el lexer lee primero los tokens
                                                //y luego los pasa al parser
                                                //si no se coloca aca, el lexer lo leeria como un Integer
                                                //y fallaria al parsear el siguiente token
INTEGER     : [0-9]+ ;
STRING      : '"' (~["\r\n] | '\\"')* '"' ;
BOOLEAN     : 'true' | 'false' ;

// Palabras reservadas
KEYWORD     : 'var' | 'if' | 'else' | 'print' | 'while' | 'function' | 'return' ;
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

// Ignorar espacios en blanco y comentarios
WS          : [ \t\r\n]+ -> skip ;
COMMENT     : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
