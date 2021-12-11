package symtab.simple;

import symtab.*;

public class DefSymbolsAndScopes extends SimpleBaseListener {
	Scope currentScope;

	@Override
	public void enterFile(SimpleParser.FileContext ctx) {
		GlobalScope g = new GlobalScope(null);
		pushScope(g);
	}

	@Override
	public void exitFile(SimpleParser.FileContext ctx) {
		popScope();
	}

	@Override
	public void enterFunc(SimpleParser.FuncContext ctx) {
		FunctionSymbol f = new FunctionSymbol(ctx.name.getText(), ctx);
		f.setEnclosingScope(currentScope);
		currentScope.define(f);
		pushScope(f);
	}

	@Override
	public void exitFunc(SimpleParser.FuncContext ctx) {
		popScope();
	}

	@Override
	public void enterBlock(SimpleParser.BlockContext ctx) {
		LocalScope l = new LocalScope(currentScope);
		pushScope(l);
	}

	@Override
	public void exitBlock(SimpleParser.BlockContext ctx) {
		popScope();
	}

	@Override
	public void enterVar(SimpleParser.VarContext ctx) {
		VariableSymbol v = new VariableSymbol(ctx.ID().getText(), currentScope);
		currentScope.define(v);
	}

	@Override
	public void enterArg(SimpleParser.ArgContext ctx) {
		VariableSymbol v = new VariableSymbol(ctx.ID().getText(), currentScope);
		currentScope.define(v);
	}

	private void pushScope(Scope s) {
		currentScope = s;
		System.out.println("Entering " + currentScope.getName() + ": " + s);
	}

	private void popScope() {
		System.out.println("Leaving " + currentScope.getName() + ": " + currentScope);
		currentScope = currentScope.getEnclosingScope();
	}
}