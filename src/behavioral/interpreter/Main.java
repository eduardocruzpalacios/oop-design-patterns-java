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

	}

}
