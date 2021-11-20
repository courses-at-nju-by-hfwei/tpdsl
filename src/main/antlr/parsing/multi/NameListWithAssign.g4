grammar NameListWithAssign;

@header {
    package parsing.multi;
}

list : '[' elements ']' ;

elements : element (',' element)* ;

element  : NAME '=' NAME
         | NAME
         | list
         ;

NAME : [a-zA-Z]+ ;
WS : [ \t\n\r]+ -> skip ;