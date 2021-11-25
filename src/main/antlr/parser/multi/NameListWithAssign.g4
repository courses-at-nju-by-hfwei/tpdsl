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

NAME : [a-zA-Z]+ ;
WS : [ \t\n\r]+ -> skip ;