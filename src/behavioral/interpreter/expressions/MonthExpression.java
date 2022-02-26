package behavioral.interpreter.expressions;

import behavioral.interpreter.context.DateContext;

public class MonthExpression extends DateExpression {

	@Override
	public void interpret(DateContext dateContext) {
		String expression = dateContext.getExpression();
		int month = dateContext.getMonth();
		String tempExpression = expression.replaceAll("MM", String.valueOf(month));
		dateContext.setExpression(tempExpression);
	}

}
