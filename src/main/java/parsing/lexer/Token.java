package parsing.lexer;

public class Token {
    private TokenType type;
    private String text;

    public Token(TokenType type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Token {" +
                "type = " + type +
                ", text = " + text + '}';
    }
}