package parser.multi;

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

public class LookaheadParser extends AbstractLAParser {
    public LookaheadParser(Lexer input, int k) { super(input, k); }
    
    // list : '[' elements ']'
    public void list() {
        match(ListLexer.LBRACK); elements(); match(ListLexer.RBRACK);
    }

    // elements : element (',' element)*
    void elements() {
        element();
        while (LA(1) == ListLexer.COMMA) {
            match(ListLexer.COMMA);
            element();
        }
    }

    // element : NAME '=' NAME | NAME | list
    void element() {
        if (LA(1) == ListLexer.NAME && LA(2) == ListLexer.EQUALS) {
            match(ListLexer.NAME);
            match(ListLexer.EQUALS);
            match(ListLexer.NAME);
        } else if (LA(1) == ListLexer.NAME) {
            match(ListLexer.NAME);
        } else if (LA(1) == ListLexer.LBRACK) {
            list();
        } else {
            throw new Error("expecting name or list; found "+LT(1));
        }
    }
}