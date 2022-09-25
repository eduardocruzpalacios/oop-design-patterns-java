package behavioral.interpreter.abstractexpression;

import behavioral.interpreter.context.AnyString;

public interface RegularExpression {

	public AnyString match(AnyString anyString);

}
