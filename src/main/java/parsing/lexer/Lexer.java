package parsing.lexer;

public abstract class Lexer {
    public static final char EOF = (char) -1;

    private final String input;
    private int pos;
    protected char ch;

    public Lexer(String input) {
        this.input = input;
        this.pos = 0;
        this.ch = input.charAt(pos);
    }

    public abstract Token nextToken();
    public abstract String getTokenName(int tokenType);

    public void consume() {
        this.pos++;
        if (this.pos >= this.input.length()) {
            this.ch = EOF;
        } else {
            this.ch = input.charAt(this.pos);
        }
    }

    public void match(char expected) {
        if (this.ch == expected) {
            consume();
        } else {
            throw new Error("Expecting " + expected + "; Found " + this.ch);
        }
    }
}