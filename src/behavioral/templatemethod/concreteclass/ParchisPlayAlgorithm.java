package behavioral.templatemethod.concreteclass;

import behavioral.templatemethod.abstractclass.BoardGamePlayAlgorithm;

public class ParchisPlayAlgorithm extends BoardGamePlayAlgorithm {

	@Override
	protected void prepareEnvironment() {
		System.out.println("1 table and 1-4 chairs depending on how many players take part in the game");
	}

	@Override
	protected void setUpGame() {
		System.out.println("Board, dices, tokens and cubils");
	}

	@Override
	protected void play() {
		System.out.println("Take turns until sb win");
	}

	@Override
	protected void declareResults() {
		System.out.println("Celebrate and do not take having lost too much seriously");
	}

}
