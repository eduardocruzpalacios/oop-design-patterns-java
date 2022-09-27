package behavioral.templatemethod;

import behavioral.templatemethod.abstractclass.BoardGamePlayAlgorithm;
import behavioral.templatemethod.concreteclass.ArcadiaQuestPlayAlgorithm;
import behavioral.templatemethod.concreteclass.ParchisPlayAlgorithm;

public class Main {

	public static void main(String[] args) {

		// client uses polymorphism to refer the superclass but initialize the subclass
		System.out.println("ARCADIA QUEST\n");
		BoardGamePlayAlgorithm boardGamePlayAlgorithm = new ArcadiaQuestPlayAlgorithm();

		// client calls superclass method which uses implemented abstract methods
		boardGamePlayAlgorithm.meetUp(false, false, false);
		boardGamePlayAlgorithm.meetUp(false, true, false);
		boardGamePlayAlgorithm.meetUp(true, false, false);
		boardGamePlayAlgorithm.meetUp(true, true, false);
		System.out.println();
		boardGamePlayAlgorithm.meetUp(true, true, true);

		/*
		 * client uses polymorphism to initialize another subclass of the same parent
		 * class
		 */
		boardGamePlayAlgorithm = new ParchisPlayAlgorithm();

		// client calls superclass method which uses implemented abstract methods
		System.out.println("\nPARCHIS\n");
		boardGamePlayAlgorithm.meetUp(false, false, false);
		boardGamePlayAlgorithm.meetUp(false, true, false);
		boardGamePlayAlgorithm.meetUp(true, false, false);
		boardGamePlayAlgorithm.meetUp(true, true, false);
		System.out.println();
		boardGamePlayAlgorithm.meetUp(true, true, true);

		/*
		 * in case a new BoardGamePlayAlgorithm is needed, the maintainer must:
		 *
		 * - create the class in the templated package, extending BoardGamePlayAlgorithm
		 * class and override its abstract methods
		 */

	}

}
