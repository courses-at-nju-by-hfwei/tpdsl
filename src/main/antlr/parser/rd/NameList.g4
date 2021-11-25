grammar NameList;

@header {
    package parser.rd;
}

list : '[' elements ']' ;

elements : element (',' element)* ;

element : NAME
        | list
        ;

LBRACK : '[' ;
RBRACK : ']' ;
COMMA : ',' ;

NAME : [a-zA-Z]+ ;
WS : [ \t\n\r]+ -> skip ;