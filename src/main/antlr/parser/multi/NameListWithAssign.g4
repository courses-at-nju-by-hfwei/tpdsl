grammar NameListWithAssign;

@header {
    package parser.multi;
}

list : '[' elements ']' ;

elements : element (',' element)* ;

element  : NAME '=' NAME
         | NAME
         | list
         ;

LBRACK : '[' ;
RBRACK : ']' ;
COMMA : ',' ;
ASSIGN : '=' ;

NAME : [a-zA-Z]+ ;
WS : [ \t\n\r]+ -> skip ;