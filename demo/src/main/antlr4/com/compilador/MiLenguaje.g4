grammar MiLenguaje;

//Test
// Reglas del parser (simplificadas)
program : token* EOF ;
token   : ID | HEX | INTEGER | STRING | KEYWORD | OPERATOR | SEPARATOR ;

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

// Palabras clave
KEYWORD     : 'var' | 'if' | 'else' | 'print' | 'while' | 'function' | 'return' ;

// Operadores
OPERATOR    : '+' | '-' | '*' | '/' | '%' | '=' | '==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||' | '!' ;

// Separadores
SEPARATOR   : ';' | '(' | ')' | '{' | '}' | ',' | '.' ;

// Ignorar espacios en blanco y comentarios
WS          : [ \t\r\n]+ -> skip ;
COMMENT     : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
