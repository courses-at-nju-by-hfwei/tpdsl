grammar NameListWithParallelAssign;

@header {
    package parser.backtrack;
}

stat : list EOF
     | assign EOF
     ;

assign : list '=' list ;

list : '[' elements ']' ;

elements : element (',' element)* ;

element : NAME '=' NAME
        | NAME
        | list
        ;

LBRACK : '[' ;
RBRACK : ']' ;
COMMA : ',' ;
ASSIGN : '=' ;

NAME : [a-zA-Z]+ ;
WS : [ \t\n\r]+ -> skip ;