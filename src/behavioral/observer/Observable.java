package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

	// observable
	private List<Observer> observers = new ArrayList<Observer>();

	public void subscribe(Observer observer) {
		this.observers.add(observer);
	}

	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	public void notifySubscribers() {
		for (Observer observer : this.observers) {
			observer.update(this);
		}
	}

	// state
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
