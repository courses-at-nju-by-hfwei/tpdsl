package symtab;

import org.antlr.v4.runtime.ParserRuleContext;

public class VariableSymbol extends BaseSymbol implements TypedSymbol {
	public VariableSymbol(String name) {
		super(name);
	}

	public VariableSymbol(String name, Scope scope) {
		super(name, scope);
	}

	@Override
	public void setType(Type type) {
		super.setType(type);
	}
}
