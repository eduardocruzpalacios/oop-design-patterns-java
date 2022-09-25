package behavioral.interpreter.client;

import behavioral.interpreter.abstractexpression.RegularExpression;
import behavioral.interpreter.context.AnyString;
import behavioral.interpreter.nonterminalexpression.RepetitionExpression;
import behavioral.interpreter.terminalexpression.LiteralExpression;

public class RepetitionExpressionTest {

	public static void main(String[] args) {

		RegularExpression expression = new LiteralExpression("uno");

		RegularExpression repetitionExpression = new RepetitionExpression(expression);

		AnyString anyString1 = new AnyString("unounounodostrescuatro");
		AnyString match1 = repetitionExpression.match(anyString1);
		System.out.println(match1);

		AnyString anyString2 = new AnyString("dostrescuatro");
		AnyString match2 = repetitionExpression.match(anyString2);
		System.out.println(match2);

	}

}
