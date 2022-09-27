package behavioral.interpreter.client;

import behavioral.interpreter.abstractexpression.RegularExpression;
import behavioral.interpreter.context.AnyString;
import behavioral.interpreter.terminalexpression.LiteralExpression;

public class LiteralExpressionTest {

	public static void main(String[] args) {

		RegularExpression literalExpression = new LiteralExpression("hola");

		AnyString anyString1 = new AnyString("hola");
		AnyString match1 = literalExpression.match(anyString1);
		System.out.println(match1);

		AnyString anyString2 = new AnyString("coche");
		AnyString match2 = literalExpression.match(anyString2);
		System.out.println(match2);

	}

}
