package behavioral.interpreter.expressions;

import behavioral.interpreter.context.DateContext;

public class YearExpression extends DateExpression {

	@Override
	public void interpret(DateContext dateContext) {
		String expression = dateContext.getExpression();
		int year = dateContext.getYear();
		String tempExpression = expression.replaceAll("YYYY", String.valueOf(year));
		dateContext.setExpression(tempExpression);
	}

}
