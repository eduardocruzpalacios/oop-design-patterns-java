package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {

	// observable
	private List<Observer<T>> observers = new ArrayList<Observer<T>>();

	public void subscribe(Observer<T> observer) {
		this.observers.add(observer);
	}

	public void unsubscribe(Observer<T> observer) {
		this.observers.remove(observer);
	}

	private void notifySubscribers() {
		for (Observer<T> observer : this.observers) {
			observer.update(this);
		}
	}

	// state
	private T state;

	public T getState() {
		return state;
	}

	public void setState(T state) {
		this.state = state;
		this.notifySubscribers();
	}

}
