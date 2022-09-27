package behavioral.interpreter.nonterminalexpression;

import behavioral.interpreter.abstractexpression.RegularExpression;
import behavioral.interpreter.context.AnyString;
import behavioral.interpreter.terminalexpression.LiteralExpression;

public class SequenceExpression implements RegularExpression {

	private RegularExpression expression1;
	private RegularExpression expression2;

	public SequenceExpression(RegularExpression expression1, RegularExpression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public AnyString match(AnyString anyString) {
		AnyString anyStringFinal = expression1.match(anyString);
		AnyString anyStringHalf1 = expression1.match(anyString);
		AnyString anyStringHalf2 = expression2.match(anyString);
		anyStringFinal.addAll(anyStringHalf2);
		if (anyStringFinal.getState().equals(anyStringHalf1.getState())) {
			return new AnyString();
		} else {
			RegularExpression expression = new LiteralExpression(anyStringFinal.getState());
			return expression.match(anyStringFinal);
		}
	}

}
