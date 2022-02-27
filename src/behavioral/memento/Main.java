package behavioral.memento;

import behavioral.memento.caretaker.History;
import behavioral.memento.originators.Editor;

public class Main {

	public static void main(String[] args) {

		// client holds an editor and a history
		Editor editor = new Editor();
		History history = new History();

		// The event in charge of saving the current state is triggered 3 times
		editor.setState(1);
		history.add(editor.save());

		editor.setState(2);
		history.add(editor.save());

		editor.setState(3);
		history.add(editor.save());

		// the editor only has last state
		System.out.println("current state = " + editor.getState());

		// we can access to any snapshot from the history
		System.out.println(history);

		/*
		 * in order to restore a previous state, editor uses the history to get a
		 * snapshot and modify its own state
		 */
		editor.restore(history.get(0));
		System.out.println("editor restored to 1st saved State: " + editor.getState());

		editor.restore(history.get(1));
		System.out.println("editor restored to 2nd saved State: " + editor.getState());

		editor.restore(history.get(2));
		System.out.println("editor restored to 3rd saved State: " + editor.getState());

		/*
		 * future improvement:
		 * 
		 * - make state representation to be more abstract by means of generics of
		 * Object class instead of being represented by only an int primitive value (see
		 * Memento interface)
		 */

		/*
		 * in case a new concrete memento is needed the maintainer must:
		 * 
		 * - create a class for the new concrete memento in mementos package
		 * implementing Memento interface
		 * 
		 * - create a class for the new concrete originator in orignators package
		 * implementing Originator interface
		 * 
		 * the History class is already prepared to work with classes implementing the
		 * Memento interface, so no more changes are needed
		 */

	}

}
