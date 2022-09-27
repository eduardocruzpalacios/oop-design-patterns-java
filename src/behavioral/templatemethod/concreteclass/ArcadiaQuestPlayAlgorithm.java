package behavioral.templatemethod.concreteclass;

import behavioral.templatemethod.abstractclass.BoardGamePlayAlgorithm;

public class ArcadiaQuestPlayAlgorithm extends BoardGamePlayAlgorithm {

	@Override
	protected void prepareEnvironment() {
		System.out.println("1 big table and 1-4 chairs depending on how many players take part in the game");
	}

	@Override
	protected void setUpGame() {
		System.out.println("Board, cards, dices, miniatures, tokens and cartoons");
	}

	@Override
	protected void play() {
		System.out.println("Take turns following game rules until sb win");
	}

	@Override
	protected void declareResults() {
		System.out.println("Explain prizes for winners");
	}

}
