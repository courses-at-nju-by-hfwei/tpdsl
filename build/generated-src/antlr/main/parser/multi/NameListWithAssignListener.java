// Generated from parser/multi/NameListWithAssign.g4 by ANTLR 4.9.2

    package parser.multi;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NameListWithAssignParser}.
 */
public interface NameListWithAssignListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NameListWithAssignParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(NameListWithAssignParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NameListWithAssignParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(NameListWithAssignParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NameListWithAssignParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(NameListWithAssignParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NameListWithAssignParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(NameListWithAssignParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NameListWithAssignParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(NameListWithAssignParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NameListWithAssignParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(NameListWithAssignParser.ElementContext ctx);
}