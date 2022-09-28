package behavioral.templatemethod;

import behavioral.templatemethod.abstractclass.BoardGamePlayAlgorithm;
import behavioral.templatemethod.concreteclass.ArcadiaQuestPlayAlgorithm;
import behavioral.templatemethod.concreteclass.ParchisPlayAlgorithm;

public class Main {

	public static void main(String[] args) {

		System.out.println("ARCADIA QUEST\n");

		BoardGamePlayAlgorithm boardGamePlayAlgorithm = new ArcadiaQuestPlayAlgorithm();

		boardGamePlayAlgorithm.meetUp(false, false, false);
		boardGamePlayAlgorithm.meetUp(false, true, false);
		boardGamePlayAlgorithm.meetUp(true, false, false);
		boardGamePlayAlgorithm.meetUp(true, true, false);
		boardGamePlayAlgorithm.meetUp(true, true, true);

		System.out.println("\nPARCHIS\n");

		boardGamePlayAlgorithm = new ParchisPlayAlgorithm();

		boardGamePlayAlgorithm.meetUp(false, false, false);
		boardGamePlayAlgorithm.meetUp(false, true, false);
		boardGamePlayAlgorithm.meetUp(true, false, false);
		boardGamePlayAlgorithm.meetUp(true, true, false);
		boardGamePlayAlgorithm.meetUp(true, true, true);

	}

}
