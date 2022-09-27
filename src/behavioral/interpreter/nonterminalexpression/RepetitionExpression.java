package behavioral.interpreter.nonterminalexpression;

import behavioral.interpreter.abstractexpression.RegularExpression;
import behavioral.interpreter.context.AnyString;

public class RepetitionExpression implements RegularExpression {

	private RegularExpression repetition;

	public RepetitionExpression(RegularExpression repetition) {
		this.repetition = repetition;
	}

	@Override
	public AnyString match(AnyString anyString) {
		AnyString anyStringCurrent = new AnyString(anyString.getState());
		AnyString anyStringToMatch = this.repetition.match(anyString);
		AnyString anyStringFinal = new AnyString();
		String stringToMatch = anyStringToMatch.getState();
		if (stringToMatch.length() > 0) {
			String fullString = anyStringCurrent.getState();
			while (fullString.contains(stringToMatch)) {
				anyStringFinal.addAll(anyStringToMatch);
				anyStringCurrent.remove(anyStringToMatch);
				fullString = anyStringCurrent.getState();
			}
		}
		return anyStringFinal;
	}

}
