package behavioral.memento.originators;

import behavioral.memento.mementos.Memento;

public interface Originator<T> {

	public Memento<T> save();

	public void restore(Memento<T> memento);

}