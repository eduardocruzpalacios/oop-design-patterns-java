package behavioral.interpreter.parsers;

import behavioral.interpreter.context.DateContext;
import behavioral.interpreter.expressions.DateExpression;
import behavioral.interpreter.expressions.DayExpression;
import behavioral.interpreter.expressions.MonthExpression;
import behavioral.interpreter.expressions.YearExpression;

public class DateParser {

	public static DateContext parseDateContext(DateContext dateContext) {

		DateExpression dateExpression = new DayExpression();
		dateExpression.interpret(dateContext);

		dateExpression = new MonthExpression();
		dateExpression.interpret(dateContext);

		dateExpression = new YearExpression();
		dateExpression.interpret(dateContext);

		return dateContext;

	}

}
