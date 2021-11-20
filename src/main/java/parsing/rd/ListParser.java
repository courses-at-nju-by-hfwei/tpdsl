package parsing.rd;

import lexer.Lexer;
import lexer.ListLexer;

/**
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 */

public class ListParser extends Parser {
    public ListParser(Lexer input) {
        super(input);
    }
    
    // list : '[' elements ']'
    public void list() {
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    // elements : element (',' element)*
    void elements() {
        element();
        while (lookahead.getType() == ListLexer.COMMA) {
            match(ListLexer.COMMA);
            element();
        }
    }

    // element : NAME | list
    void element() {
        if (lookahead.getType() == ListLexer.NAME ) {
            match(ListLexer.NAME);
        } else if (lookahead.getType() == ListLexer.LBRACK ) {
            list();
        } else {
            throw new Error("expecting name or list; found "+lookahead);
        }
    }
}