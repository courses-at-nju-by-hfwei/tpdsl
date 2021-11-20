grammar NameList;

@header {
    package parsing.rd;
}

list : '[' elements ']' ;

elements : element (',' element)* ;

element : NAME
        | list
        ;

NAME : [a-zA-Z]+ ;
WS : [ \t\n\r]+ -> skip ;
