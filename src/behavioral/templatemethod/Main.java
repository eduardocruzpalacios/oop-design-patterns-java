package behavioral.templatemethod;

import behavioral.templatemethod.abstractclass.BoardGamePlayAlgorithm;
import behavioral.templatemethod.concreteclass.ArcadiaQuestPlayAlgorithm;
import behavioral.templatemethod.concreteclass.ParchisPlayAlgorithm;

public class Main {

	public static void main(String[] args) {

		// 1 concrete class
		System.out.println("ARCADIA QUEST\n");
		BoardGamePlayAlgorithm boardGamePlayAlgorithm = new ArcadiaQuestPlayAlgorithm();

		// client calls superclass method which uses implemented abstract methods
		boardGamePlayAlgorithm.meetUp(false, false, false);
		boardGamePlayAlgorithm.meetUp(false, true, false);
		boardGamePlayAlgorithm.meetUp(true, false, false);
		boardGamePlayAlgorithm.meetUp(true, true, false);
		System.out.println();
		boardGamePlayAlgorithm.meetUp(true, true, true);

		// another concrete class
		boardGamePlayAlgorithm = new ParchisPlayAlgorithm();

		// client calls superclass method which uses implemented abstract methods
		System.out.println("\nPARCHIS\n");
		boardGamePlayAlgorithm.meetUp(false, false, false);
		boardGamePlayAlgorithm.meetUp(false, true, false);
		boardGamePlayAlgorithm.meetUp(true, false, false);
		boardGamePlayAlgorithm.meetUp(true, true, false);
		System.out.println();
		boardGamePlayAlgorithm.meetUp(true, true, true);

	}

}
