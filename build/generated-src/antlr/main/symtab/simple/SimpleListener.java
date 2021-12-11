// Generated from symtab/simple/Simple.g4 by ANTLR 4.9.2

    package symtab.simple;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SimpleParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SimpleParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(SimpleParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(SimpleParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(SimpleParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(SimpleParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SimpleParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SimpleParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SimpleParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SimpleParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimpleParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimpleParser.StatContext ctx);
}