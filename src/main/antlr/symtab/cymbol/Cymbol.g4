// source: http://media.pragprog.com/titles/tpantlr2/code/examples/Cymbol.g4

/**
 * Simple statically-typed programming language with functions and variables
 * taken from "Language Implementation Patterns" book.
 */

grammar Cymbol;

@header {
    package symtab.cymbol;
}

prog : (varDecl | structDecl | functionDecl )+ EOF ;

varDecl : type ID ('=' expr)? ';' ;

structDecl : 'struct' ID '{' structMember+ '}' ';' ;

structMember : type ID ';'
             | structDecl
             ;

functionDecl : type ID '(' paras? ')' block ;

paras : type ID (',' type ID)* ;

type : 'int'
     | 'float'
     | 'void'
     | ID   // struct type name
     ;

block : '{' stat* '}' ;

stat : block
     | structDecl
     | varDecl
     | 'if' expr stat ('else' stat)?
     | 'while' expr stat
     | 'for' '(' expr? ';' expr? ';' expr? ')' stat
     | 'return' expr? ';'
     | expr '=' expr ';'
     | expr ';'
     ;

expr: '(' expr ')'
    | ID '(' args? ')'        // function call
    | expr '[' expr ']'       // array subscripts
    | expr '.' expr           // member access (hfwei)
    | '-' expr
    | '!' expr
    | <assoc=right> expr '^' expr
    | expr ('*'|'/') expr
    | expr ('+'|'-') expr
    | expr ('<' | '<=' | '>' | '>=') expr
    | expr ('==' | '!=') expr
    | expr ('&&' | '||') expr
    | ID
    | INT
    ;

args : expr (',' expr)* ;
////////////////////////////////////////////
// You can use "Alt + Insert" to automatically generate
// the following lexer rules for literals in the grammar above.
// Note: Remember to rename the automatically generated 'INT' to avoid clash.
EQUAL : '=' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
COMMA : ',' ;
LBRACE : '{' ;
RBRACE : '}' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;
RETURN : 'return' ;
INTTYPE : 'int' ;
FLOATTYPE : 'float' ;
VOIDTYPE : 'void' ;
LBRACK : '[' ;
RBRACK : ']' ;
SUB : '-' ;
LNOT : '!' ;
POWER : '^' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
LT : '<' ;
LE : '<=' ;
GT : '>' ;
GE : '>=' ;
EQUAL_EQUAL : '==' ;
NOT_EQUAL : '!=' ;
LAND : '&&' ;
LOR : '||' ;
STRUCT : 'struct' ;
DOT : '.' ;
////////////////////////////////////////////
ID : LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT : [0-9]+ ;

WS  : [ \t\n\r]+ -> skip ;

SL_COMMENT : '//' .*? '\n' -> channel(HIDDEN)
           ;