package behavioral.interpreter.terminalexpression;

import behavioral.interpreter.abstractexpression.RegularExpression;
import behavioral.interpreter.context.AnyString;

public class LiteralExpression implements RegularExpression {

	private String components;

	public LiteralExpression(String components) {
		this.components = components;
	}

	@Override
	public AnyString match(AnyString anyString) {
		AnyString anyStringFinal = new AnyString();
		if (anyString.getState().contains(this.components)) {
			anyStringFinal.setState(components);
		}
		return anyStringFinal;
	}

}
