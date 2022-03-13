package behavioral.interpreter.context;

public class DateContext {

	private String expression;
	private int day;
	private int month;
	private int year;

	public DateContext() {
	}

	public DateContext(String expression, int day, int month, int year) {
		this.expression = expression;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "DateContext [expression=" + expression + ", day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
