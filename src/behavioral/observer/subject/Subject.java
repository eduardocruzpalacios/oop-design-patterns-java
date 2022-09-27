package behavioral.observer.subject;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.concreteobserver.ConcreteObserver;
import behavioral.observer.concretesubject.ConcreteSubject;
import behavioral.observer.observer.Observer;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();

	public void attach(ConcreteObserver concreteObserver) {
		this.observers.add(concreteObserver);
	}

	public void detach(ConcreteObserver concreteObserver) {
		this.observers.remove(concreteObserver);
	}

	protected void notifySubscribers() {
		for (Observer observer : this.observers) {
			observer.update((ConcreteSubject) this);
		}
	}

}
