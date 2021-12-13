// Generated from symtab/cymbol/Cymbol.g4 by ANTLR 4.9.2

    package symtab.cymbol;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CymbolParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CymbolParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(CymbolParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#structDecl}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(CymbolParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code field}
	 * labeled alternative in {@link CymbolParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterField(CymbolParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code field}
	 * labeled alternative in {@link CymbolParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitField(CymbolParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structField}
	 * labeled alternative in {@link CymbolParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterStructField(CymbolParser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structField}
	 * labeled alternative in {@link CymbolParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitStructField(CymbolParser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#paras}.
	 * @param ctx the parse tree
	 */
	void enterParas(CymbolParser.ParasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#paras}.
	 * @param ctx the parse tree
	 */
	void exitParas(CymbolParser.ParasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(CymbolParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(CymbolParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveType}
	 * labeled alternative in {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CymbolParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveType}
	 * labeled alternative in {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CymbolParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idType}
	 * labeled alternative in {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdType(CymbolParser.IdTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idType}
	 * labeled alternative in {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdType(CymbolParser.IdTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CymbolParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CymbolParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(CymbolParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(CymbolParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(CymbolParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(CymbolParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(CymbolParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(CymbolParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(CymbolParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(CymbolParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(CymbolParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(CymbolParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(CymbolParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(CymbolParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(CymbolParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(CymbolParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(CymbolParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(CymbolParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paraExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParaExpr(CymbolParser.ParaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParaExpr(CymbolParser.ParaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(CymbolParser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(CymbolParser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraySubExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArraySubExpr(CymbolParser.ArraySubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraySubExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArraySubExpr(CymbolParser.ArraySubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(CymbolParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(CymbolParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(CymbolParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(CymbolParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(CymbolParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(CymbolParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link CymbolParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(CymbolParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link CymbolParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(CymbolParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberID}
	 * labeled alternative in {@link CymbolParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMemberID(CymbolParser.MemberIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberID}
	 * labeled alternative in {@link CymbolParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMemberID(CymbolParser.MemberIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CymbolParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CymbolParser.ArgsContext ctx);
}