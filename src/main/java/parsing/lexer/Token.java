package parsing.lexer;

public class Token {
    private int type;
    private String text;

    public Token(int type, String text) {
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