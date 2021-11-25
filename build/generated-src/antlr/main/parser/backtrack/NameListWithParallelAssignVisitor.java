// Generated from parser/backtrack/NameListWithParallelAssign.g4 by ANTLR 4.9.2

    package parser.backtrack;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NameListWithParallelAssignParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NameListWithParallelAssignVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NameListWithParallelAssignParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(NameListWithParallelAssignParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link NameListWithParallelAssignParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(NameListWithParallelAssignParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NameListWithParallelAssignParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(NameListWithParallelAssignParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NameListWithParallelAssignParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(NameListWithParallelAssignParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NameListWithParallelAssignParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(NameListWithParallelAssignParser.ElementContext ctx);
}