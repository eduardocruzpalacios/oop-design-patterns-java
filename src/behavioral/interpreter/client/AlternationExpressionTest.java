package behavioral.interpreter.client;

import behavioral.interpreter.abstractexpression.RegularExpression;
import behavioral.interpreter.context.AnyString;
import behavioral.interpreter.nonterminalexpression.AlternationExpression;
import behavioral.interpreter.terminalexpression.LiteralExpression;

public class AlternationExpressionTest {

	public static void main(String[] args) {

		RegularExpression expression1 = new LiteralExpression("uno");
		RegularExpression expression2 = new LiteralExpression("dos");

		RegularExpression alternationExpression = new AlternationExpression(expression1, expression2);

		AnyString anyString1 = new AnyString("unoydos");
		AnyString match1 = alternationExpression.match(anyString1);
		System.out.println(match1);

		AnyString anyString2 = new AnyString("unoy");
		AnyString match2 = alternationExpression.match(anyString2);
		System.out.println(match2);

		AnyString anyString3 = new AnyString("bufff");
		AnyString match3 = alternationExpression.match(anyString3);
		System.out.println(match3);

	}

}
