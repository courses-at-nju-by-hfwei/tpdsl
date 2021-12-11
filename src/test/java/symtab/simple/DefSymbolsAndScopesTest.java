package symtab.simple;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.testng.Assert.*;

public class DefSymbolsAndScopesTest {
  ParserRuleContext tree;

  @BeforeMethod
    public void setUp() throws IOException {
      ANTLRInputStream input = new ANTLRFileStream("src/test/resources/symtab/simple/Simple0.txt");
      SimpleLexer l = new SimpleLexer(input);
      TokenStream tokens = new CommonTokenStream(l);

      SimpleParser parser = new SimpleParser(tokens);
      tree = parser.file();
      System.out.println(tree.toStringTree(parser));
    }

    @Test
    public void testFile() {
      DefSymbolsAndScopes def = new DefSymbolsAndScopes();
      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(def, tree);
    }
}