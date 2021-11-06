package parsing.lexer;

import static java.lang.Character.isLetter;
import static org.stringtemplate.v4.compiler.STLexer.EOF_TYPE;

public class ListLexer extends Lexer {
    /**
     * TODO: using enum
     */
    public static int NAME = 2;
    public static int COMMA = 3;
    public static int LBRACK = 4;
    public static int RBRACK = 5;

    public static String[] tokenNames = {
            "null", "EOF", "NAME", "COMMA", "LBRACK", "RBRACK"
    };

    public ListLexer(String input) {
        super(input);
    }

    @Override
    public Token nextToken() {
        /**
         * TODO: using if
         */
        while (this.ch != EOF) {
            switch (this.ch) {
                case ' ' : case '\t' : case '\r' : case '\n' :
                    WS();
                    continue;
                case ',' :
                    consume();
                    return new Token(COMMA, ",");
                case '[' :
                    consume();
                    return new Token(LBRACK, "[");
                case ']' :
                    consume();
                    return new Token(LBRACK, "]");
                default :
                    if (isLetter(this.ch)) {
                        return NAME();
                    }
                    throw new Error("Invalid character: " + this.ch);
            }
        }
        return new Token(EOF_TYPE, "EOF");
    }

    private Token NAME() {
        // TODO
        return null;
    }

    private void WS() {
        // TODO
    }

    @Override
    public String getTokenName(int tokenType) {
        return tokenNames[tokenType];
    }
}
