// Generated from parsing/multi/NameListWithAssign.g4 by ANTLR 4.9.2

    package parsing.multi;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NameListWithAssignParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NameListWithAssignVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NameListWithAssignParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(NameListWithAssignParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NameListWithAssignParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(NameListWithAssignParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NameListWithAssignParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(NameListWithAssignParser.ElementContext ctx);
}