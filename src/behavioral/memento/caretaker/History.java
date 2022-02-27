package behavioral.memento.caretaker;

import java.util.ArrayList;
import java.util.List;

import behavioral.memento.mementos.Memento;

public class History {

	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento memento) {
		this.mementoList.add(memento);
	}

	public Memento get(int index) {
		return this.mementoList.get(index);
	}

	@Override
	public String toString() {
		return "History [mementoList=" + mementoList + "]";
	}

}
