// Generated from symtab/simple/Simple.g4 by ANTLR 4.9.2

    package symtab.simple;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SimpleParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(SimpleParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(SimpleParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SimpleParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SimpleParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SimpleParser.StatContext ctx);
}