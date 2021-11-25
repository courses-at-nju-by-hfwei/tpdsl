package parser.backtrack;

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

public class BacktrackParser extends AbstractBacktrackParser {
    public BacktrackParser(Lexer input) { super(input); }

    // stat : list EOF | assign EOF
    public void stat() throws ListRecognitionException {
        if (speculateStatAlt1()) {
            list(); match(Lexer.EOF_TYPE);
        } else if (speculateStatAlt2()) {
            assign(); match(Lexer.EOF_TYPE);
        } else {
            throw new NoViableAltException("expecting stat found "+LT(1));
        }
    }

    private boolean speculateStatAlt1() {
        boolean success = true;

        mark();
        try {
            list();
            match(Lexer.EOF_TYPE);
        } catch (ListRecognitionException e) {
            success = false;
        }
        release();

        return success;
    }

    private boolean speculateStatAlt2() {
        boolean success = true;

        mark();
        try {
            assign(); match(Lexer.EOF_TYPE);
        } catch (ListRecognitionException e) {
            success = false;
        }
        release();

        return success;
    }

    // assign : list '=' list
    public void assign() throws ListRecognitionException {
        list();
        match(ListLexer.EQUALS);
        list();
    }

    // list : '[' elements ']'
    public void list() throws ListRecognitionException {
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    // elements : element (',' element)*
    void elements() throws ListRecognitionException {
        element();
        while (LA(1) == ListLexer.COMMA) {
            match(ListLexer.COMMA);
            element();
        }
    }

    // element : NAME '=' NAME | NAME | list
    void element() throws ListRecognitionException {
        if (LA(1) == ListLexer.NAME && LA(2) == ListLexer.EQUALS) {
            match(ListLexer.NAME);
            match(ListLexer.EQUALS);
            match(ListLexer.NAME);
        } else if (LA(1) == ListLexer.NAME) {
            match(ListLexer.NAME);
        } else if (LA(1)==ListLexer.LBRACK) {
            list();
        } else {
            throw new NoViableAltException("expecting element found "+LT(1));
        }
    }
}