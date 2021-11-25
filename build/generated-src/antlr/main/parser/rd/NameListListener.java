// Generated from parser/rd/NameList.g4 by ANTLR 4.9.2

    package parser.rd;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NameListParser}.
 */
public interface NameListListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NameListParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(NameListParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NameListParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(NameListParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NameListParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(NameListParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NameListParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(NameListParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NameListParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(NameListParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NameListParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(NameListParser.ElementContext ctx);
}