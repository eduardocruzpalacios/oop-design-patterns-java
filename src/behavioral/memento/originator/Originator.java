package behavioral.memento.originator;

import behavioral.memento.caretaker.Memento;

public interface Originator {

	public Memento save();

	public void restore(Memento memento);

}