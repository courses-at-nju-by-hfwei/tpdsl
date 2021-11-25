// Generated from parser/rd/NameList.g4 by ANTLR 4.9.2

    package parser.rd;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NameListParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NameListVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NameListParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(NameListParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NameListParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(NameListParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NameListParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(NameListParser.ElementContext ctx);
}