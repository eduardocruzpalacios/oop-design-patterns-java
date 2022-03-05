package behavioral.templatemethod.template;

public abstract class BoardGamePlayAlgorithm {

	// steps of the algorithm, some are override by children classes, some are not
	private void isPlayable() {
		System.out.println("can we play?");
	}

	private void cannotPlay() {
		System.out.println("no, we cannot");
	}

	private void canPlay() {
		System.out.println("yes =)");
	}

	protected abstract void prepareEnvironment();

	protected abstract void setUpGame();

	protected abstract void play();

	protected abstract void declareResults();

	private void bye() {
		System.out.println("bye");
	}

	// shell of the algorithm
	public void meetUp(boolean isAnyPlaceToPlay, boolean areThereEnoughPlayers, boolean resultsAreNeeded) {
		isPlayable();
		if (!isAnyPlaceToPlay || !areThereEnoughPlayers) {
			cannotPlay();
			return;
		}
		canPlay();
		prepareEnvironment();
		setUpGame();
		play();
		if (resultsAreNeeded) {
			declareResults();
		}
		bye();
	}

}
