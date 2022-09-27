package behavioral.interpreter.client;

import behavioral.interpreter.abstractexpression.RegularExpression;
import behavioral.interpreter.context.AnyString;
import behavioral.interpreter.nonterminalexpression.SequenceExpression;
import behavioral.interpreter.terminalexpression.LiteralExpression;

public class SequencelExpressionTest {

	public static void main(String[] args) {

		RegularExpression expression1 = new LiteralExpression("uno");
		RegularExpression expression2 = new LiteralExpression("dos");

		RegularExpression sequenceExpression = new SequenceExpression(expression1, expression2);

		AnyString anyString1 = new AnyString("unodostres");
		AnyString match1 = sequenceExpression.match(anyString1);
		System.out.println(match1);

		AnyString anyString2 = new AnyString("unotres");
		AnyString match2 = sequenceExpression.match(anyString2);
		System.out.println(match2);

	}

}
