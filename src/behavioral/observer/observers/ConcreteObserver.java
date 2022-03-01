package behavioral.observer.observers;

import behavioral.observer.observables.Observable;

public class ConcreteObserver implements Observer<Integer> {

	@Override
	public void update(Observable<Integer> observable) {
		System.out.println("The state has changed to " + observable.getState());
	}

}
