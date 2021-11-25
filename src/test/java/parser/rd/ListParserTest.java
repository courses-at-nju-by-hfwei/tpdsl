package parser.rd;

import lexer.ListLexer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListParserTest {
    private String input;
    private ListLexer lexer;
    private ListParser parser;

    @BeforeMethod
    public void setUp() throws IOException {
        input = Files.readString(Path.of("src/test/resources/parser/rd/NameList0.txt"));
        lexer = new ListLexer(input);
        parser = new ListParser(lexer);
    }

    @Test
    public void testList() {
        parser.list();
    }
}