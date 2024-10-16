grammar Lox; 

// Lox Grammar adapted from https://craftinginterpreters.com/appendix-i.html

@parser::header
{
// DO NOT MODIFY - generated from Lox.g4
}

@lexer::header
{
// DO NOT MODIFY - generated from Lox.g4
}

program        : declaration* EOF ;

declaration    :  statement ;

statement      : printStmt;

printStmt      : 'print' expression ';' ;

expression     : true;

true           : 'true';

// more... 
WS             : [ \t\r\n]+ -> skip ;
