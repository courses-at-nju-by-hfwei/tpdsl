package parser.backtrack;

import lexer.Lexer;
import lexer.ListLexer;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class BacktrackParser extends AbstractBacktrackParser {
    public BacktrackParser(Lexer input) { super(input); }

    /** stat : list EOF | assign EOF ; */
    public void stat() throws ListRecognitionException {
        // attempt alternative 1: list EOF
        if ( speculate_stat_alt1() ) {
            list(); match(Lexer.EOF_TYPE);
        }
        // attempt alternative 2: assign EOF
        else if ( speculate_stat_alt2() ) {
            assign(); match(Lexer.EOF_TYPE);
        }
        // must be an error; neither matched; LT(1) is lookahead token 1
        else throw new NoViableAltException("expecting stat found "+LT(1));
    }

    public boolean speculate_stat_alt1() {
        boolean success = true;
        mark(); // mark this spot in input so we can rewind
        try { list(); match(Lexer.EOF_TYPE); }
        catch (ListRecognitionException e) { success = false; }
        release(); // either way, rewind to where we were
        return success;
    }

    public boolean speculate_stat_alt2() {
        boolean success = true;
        mark(); // mark this spot in input so we can rewind
        try { assign(); match(Lexer.EOF_TYPE); }
        catch (ListRecognitionException e) { success = false; }
        release(); // either way, rewind to where we were
        return success;
    }

    /** assign : list '=' list ; // parallel assignment */
    public void assign() throws ListRecognitionException {
        list(); match(ListLexer.EQUALS); list();
    }

    /** list : '[' elements ']' ; // match bracketed list */
    public void list() throws ListRecognitionException {
        match(ListLexer.LBRACK); elements(); match(ListLexer.RBRACK);
    }

    /** elements : element (',' element)* ; // match comma-separated list */
    void elements() throws ListRecognitionException {
        element(); while ( LA(1)== ListLexer.COMMA ) { match(ListLexer.COMMA); element(); }
    }

    /** element : name '=' NAME | NAME | list ; // assignment, name or list */
    void element() throws ListRecognitionException {
        if ( LA(1)==ListLexer.NAME && LA(2)==ListLexer.EQUALS) {
            match(ListLexer.NAME);
            match(ListLexer.EQUALS);
            match(ListLexer.NAME);
        }
        else if ( LA(1)==ListLexer.NAME ) match(ListLexer.NAME);
        else if ( LA(1)==ListLexer.LBRACK ) list();
        else throw new NoViableAltException("expecting element found "+LT(1));
    }
}
