package parsing.rd;

import lexer.Lexer;
import lexer.Token;

/**
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 */

public abstract class Parser {
    protected Lexer input;     // from where do we get tokens?
    protected Token lookahead; // the current lookahead token

    public Parser(Lexer input) {
        this.input = input;
        consume();
    }

    public void consume() {
        lookahead = input.nextToken();
    }

    public void match(int x) {
        if (lookahead.getType() == x ) {
            consume();
        }
        else {
            throw new Error("expecting "+input.getTokenName(x)+
                    "; found "+ lookahead);
        }
    }
}