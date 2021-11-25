package parser.backtrack;

/**
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 */

import lexer.Lexer;
import lexer.Token;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.ArrayList;

public abstract class AbstractBacktrackParser {
    private final Lexer input;
    private final Deque<Integer> markers;
    private final List<Token> buffer;
    private int pos = 0;    // position in @buffer

    public AbstractBacktrackParser(Lexer input) {
        this.input = input;
        markers = new ArrayDeque<>();
        buffer = new ArrayList<>();
        sync(1);
    }

    public void consume() {
        pos++;
        // if we reach the end of the buffer when not backtracking?
        if (pos == buffer.size() && !isSpeculating()) {
            pos = 0;
            buffer.clear();
        }
        sync(1);
    }

    // Make sure we have i tokens from current position p
    private void sync(int nums) {
        // out of tokens?
        int n = (pos + nums - 1) - (buffer.size() - 1);
        for (int i = 1; i <= n; i++) {
            buffer.add(input.nextToken());
        }
    }

    public Token LT(int i) {
        sync(i);
        return buffer.get(pos + i - 1);
    }

    public int LA(int i) {
        return LT(i).getType();
    }

    public void match(int x) throws MismatchedTokenException {
        if (LA(1) == x) {
            consume();
        } else {
            throw new MismatchedTokenException("expecting "+
                    input.getTokenName(x)+" found "+LT(1));
        }
    }
    
    public void mark() {
        markers.push(pos);
    }

    public void release() {
        pos = markers.pop();
    }

    private boolean isSpeculating() {
        return !markers.isEmpty();
    }
}