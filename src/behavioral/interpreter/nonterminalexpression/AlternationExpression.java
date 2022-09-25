package behavioral.interpreter.nonterminalexpression;

import behavioral.interpreter.abstractexpression.RegularExpression;
import behavioral.interpreter.context.AnyString;

public class AlternationExpression implements RegularExpression {

	private RegularExpression alternative1;
	private RegularExpression alternative2;

	public AlternationExpression(RegularExpression alternative1, RegularExpression alternative2) {
		this.alternative1 = alternative1;
		this.alternative2 = alternative2;
	}

	@Override
	public AnyString match(AnyString anyString) {
		AnyString anyStringFinal = alternative1.match(anyString);
		anyStringFinal.addAll(alternative2.match(anyString));
		return anyStringFinal;
	}

}
