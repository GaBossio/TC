grammar MiLenguaje;

// Reglas del parser (simplificadas)
program : s* EOF ;

s : ID '=' e ;

e : e '+' t
  | e '-' t
  | t
  ;

t : ID
  | NUM
  ;

// Tokens
ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
NUM : [0-9]+ ;

// Ignorar espacios en blanco
WS  : [ \t\r\n]+ -> skip ;