package parser.multi;

import lexer.Lexer;
import lexer.ListLexer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.testng.Assert.*;

public class LookaheadParserTest {
    private LookaheadParser parser;

    @BeforeMethod
    public void setUp() throws IOException {
        String input = Files.readString(Path.of("src/test/resources/parser/multi/NameListWithAssign0.txt"));
        Lexer lexer = new ListLexer(input);
        parser = new LookaheadParser(lexer, 2);
    }

    @Test
    public void testList() {
        parser.list();
    }
}