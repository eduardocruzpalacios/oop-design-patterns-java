package behavioral.interpreter.expressions;

import behavioral.interpreter.context.DateContext;

public class DayExpression extends DateExpression {

	@Override
	public void interpret(DateContext dateContext) {
		String expression = dateContext.getExpression();
		int day = dateContext.getDay();
		String tempExpression = expression.replaceAll("DD", String.valueOf(day));
		dateContext.setExpression(tempExpression);
	}

}
