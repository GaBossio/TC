grammar MiLenguaje;

// Reglas del parser
program : elemento* EOF ;

elemento
    : incluide
    | declaracion
    | instruccion
    ;

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
    : LLAVE_IZQ declaracionOInstruccion* LLAVE_DER
    ;

declaracionOInstruccion
    : declaracionVariable
    | instruccionSimple
    ;

instruccionSimple
    : bucles
    | asignacion
    | asignacionCompuesta
    | sentenciaRetorno
    | sentenciaBreak
    | sentenciaContinue
    | sentenciaExpr
    | sentenciaIf
    ;

instruccion
    : instruccionSimple
    | declaracionVariable
    ;

// Nueva regla para asignaciones
asignacion
    : ID ASIGNAR expresion PUNTOYCOMA
    ;

// Nueva regla para asignaciones compuestas y operadores unarios
asignacionCompuesta
    : ID (MASIGUAL | MENOSIGUAL | ASTERISCOIGUAL | BARRAIGUAL | PORCENTAJEIGUAL) expresion PUNTOYCOMA
    | ID (INCREMENTO | DECREMENTO) PUNTOYCOMA
    | (INCREMENTO | DECREMENTO) ID PUNTOYCOMA
    ;

// Nueva regla para if statements
sentenciaIf
    : SI PAREN_IZQ expresion PAREN_DER bloque (SINO bloque)?
    ;

bucles
    : whileLoop
    | forLoop
    ;

whileLoop
    : WHILE PAREN_IZQ expresion PAREN_DER bloque
    ;

forLoop
    : FOR PAREN_IZQ forInit? PUNTOYCOMA expresion? PUNTOYCOMA forUpdate? PAREN_DER bloque
    ;

forInit
    : declaracionVariable
    | asignacion
    ;

forUpdate
    : expresion
    | asignacionCompuesta
    ;

expresion
    : expresionLogica
    ;

expresionLogica
    : expresionComparacion (operadorLogico expresionComparacion)*
    ;

expresionComparacion
    : expresionAritmetica (operadorComparacion expresionAritmetica)*
    ;

expresionAritmetica
    : expresionUnaria (operadorAritmetico expresionUnaria)*
    ;

expresionUnaria
    : NO_LOGICO expresionUnaria
    | MENOS expresionUnaria
    | MAS expresionUnaria
    | INCREMENTO expresionPrimaria
    | DECREMENTO expresionPrimaria
    | expresionPostfijo
    ;

expresionPostfijo
    : expresionPrimaria (INCREMENTO | DECREMENTO)?
    ;

expresionPrimaria
    : ID
    | literal
    | PAREN_IZQ expresion PAREN_DER
    ;

declaracion
    : declaracionVariable
    | declaracionFuncion
    ;

declaracionFuncion
    : tipo ID PAREN_IZQ listaParametros? PAREN_DER bloque
    ;

declaracionVariable
    : tipo ID (ASIGNAR expresion)? PUNTOYCOMA
    ;

sentenciaRetorno
    : RETURN expresion? PUNTOYCOMA
    ;

sentenciaBreak
    : BREAK PUNTOYCOMA
    ;

sentenciaContinue
    : CONTINUAR PUNTOYCOMA
    ;

sentenciaExpr
    : expresion PUNTOYCOMA
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

// Separados los operadores aritméticos de los de comparación
operadorAritmetico
    : MAS
    | MENOS
    | ASTERISCO
    | BARRA
    | PORCENTAJE
    ;

operadorComparacion
    : IGUAL_IGUAL
    | DIFERENTE
    | MAYOR_IGUAL
    | MENOR_IGUAL
    | MAYOR
    | MENOR
    ;

// Operadores lógicos
operadorLogico
    : Y_LOGICO
    | O_LOGICO
    ;

// Reglas Léxicas (lexer)
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
BREAK       : 'break' ;
CONTINUAR   : 'continue' ;
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
BARRA_DOBLE      : '\\' ;
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
ID          : [a-zA-Z_][a-zA-Z0-9_]* ;

// Ignorar espacios en blanco y comentarios
WS          : [ \t\r\n]+ -> skip ;
COMMENT     : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;