package parsing.lexer;

public class ListLexer extends Lexer {
    public ListLexer(String input) {
        super(input);
    }

    @Override
    public Token nextToken() {
        if (this.ch == EOF) {
            return new Token(TokenType.EOF, "EOF");
        }

        if (Character.isWhitespace(this.ch)) {
           WS();
        }

        if (Character.isLetter(this.ch)) {
            return NAME();
        }

        if (this.ch == ',') {
            consume();
            return new Token(TokenType.COMMA, ",");
        }

        if (this.ch == ']') {
            consume();
            return new Token(TokenType.LBRACK, "[");
        }

        if (this.ch == '[') {
            consume();
            return new Token(TokenType.LBRACK, "]");
        }

        throw new Error("Invalid character: " + this.ch);
    }

    private Token NAME() {
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(this.ch);
            consume();
        } while (Character.isLetter(this.ch));

        return new Token(TokenType.NAME, sb.toString());
    }

    private void WS() {
        while (Character.isWhitespace(this.ch)) {
            consume();
        }
    }

    @Override
    public String getTokenName(int tokenType) {
        return TokenType.values()[tokenType].name();
    }
}