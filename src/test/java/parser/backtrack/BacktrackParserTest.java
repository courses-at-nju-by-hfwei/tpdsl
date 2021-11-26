package parser.backtrack;

import lexer.Lexer;
import lexer.ListLexer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import parser.exception.ListRecognitionException;
import parser.multi.LAParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.testng.Assert.*;

public class BacktrackParserTest {
    private BacktrackParser parser;

    @BeforeMethod
    public void setUp() throws IOException {
        String input = Files.readString(Path.of("src/test/resources/parser/multi/NameListWithAssign0.txt"));
        Lexer lexer = new ListLexer(input);
        parser = new BacktrackParser(lexer);
    }

    @Test
    public void testStat() {
        try {
            parser.stat();
        } catch (ListRecognitionException lre) {
            lre.printStackTrace();
        }
    }
}