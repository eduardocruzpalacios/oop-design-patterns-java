package behavioral.interpreter;

import behavioral.interpreter.context.DateContext;
import behavioral.interpreter.parsers.DateParser;

public class Main {

	public static void main(String[] args) {

		// context with its date value and desired format
		String expression = "DD-MM-YYYY";
		int year = 2022;
		int month = 2;
		int day = 25;

		DateContext dateContext = new DateContext(expression, day, month, year);

		// print initial state
		System.out.println("INPUT");
		System.err.println(dateContext);

		// parse
		DateParser.parseDateContext(dateContext);

		// print parsed date format
		System.out.println("OUTPUT -> " + expression);
		System.err.println(dateContext.getExpression());

		// parse again
		expression = "YYYY-MM-DD";
		dateContext.setExpression(expression);
		DateParser.parseDateContext(dateContext);

		// print parsed date format again
		System.out.println("OUTPUT -> " + expression);
		System.err.println(dateContext.getExpression());

		/*
		 * in case a new concrete expression is needed, the maintainer must:
		 * 
		 * - create the concrete expression in expression package, making it to inherit
		 * Expression abstract class and implement its abstract methods
		 * 
		 * the expression would be fully operative only with that change, this example
		 * includes a parser which is not part of the Interpreter pattern. The parser is
		 * expendable by putting the code of its static method in Main.java
		 */

	}

}
