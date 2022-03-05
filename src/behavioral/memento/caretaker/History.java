package behavioral.memento.caretaker;

import java.util.ArrayList;
import java.util.List;

import behavioral.memento.mementos.Memento;

public class History<T> {

	private List<Memento<T>> mementoList = new ArrayList<Memento<T>>();

	public void add(Memento<T> memento) {
		this.mementoList.add(memento);
	}

	public Memento<T> get(int index) {
		return this.mementoList.get(index);
	}

	@Override
	public String toString() {
		return "History [mementoList=" + mementoList + "]";
	}

}
