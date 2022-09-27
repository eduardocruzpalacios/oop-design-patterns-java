package behavioral.memento.caretaker;

import behavioral.memento.memento.Memento;
import behavioral.memento.originator.StateDesiredToStore;

public class Main {

	public static void main(String[] args) {

		// State we want to store
		Integer state = 5;
		StateDesiredToStore stateDesiredToStore = new StateDesiredToStore(state);

		// use the originator to create a memnto
		Memento memento = stateDesiredToStore.createMemento();

		// state changes
		state = 7;

		// but we want the previous state
		state = memento.getState();
		System.out.println(state);

		// state changes again
		state = 7;

		// if the originator lost its state, we can restore it with the memento
		stateDesiredToStore = new StateDesiredToStore(state);
		stateDesiredToStore.setMemento(memento);
		System.out.println(stateDesiredToStore.createMemento().getState());

	}

}
