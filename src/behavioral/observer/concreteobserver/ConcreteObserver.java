package behavioral.observer.concreteobserver;

import behavioral.observer.concretesubject.ConcreteSubject;
import behavioral.observer.observer.Observer;

public class ConcreteObserver implements Observer {

	private Integer observerState;

	@Override
	public void update(ConcreteSubject concreteSubject) {
		this.observerState = concreteSubject.getState();
	}

	@Override
	public String toString() {
		return "ConcreteObserver [observerState=" + observerState + "]";
	}

}
