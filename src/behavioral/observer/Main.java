package behavioral.observer;

import behavioral.observer.observables.ConcreteObservable;
import behavioral.observer.observables.Observable;
import behavioral.observer.observers.ConcreteObserver;
import behavioral.observer.observers.Observer;

class Main {

	public static void main(String[] args) {

		// initialize an observable
		Observable<Integer> observable = new ConcreteObservable();

		// initialize 2 observers
		Observer<Integer> observer1 = new ConcreteObserver();
		Observer<Integer> observer2 = new ConcreteObserver();

		// observers are subscribed to the observable
		observable.subscribe(observer1);
		observable.subscribe(observer2);

		/*
		 * observable changes its state. Theirs subscribers are notified due to internal
		 * logic of setState method which call the method in charge of the notification
		 * after the new state value is changed
		 */
		observable.setState(1);

		// observers are unsubscribed from the observable
		observable.unsubscribe(observer1);
		observable.unsubscribe(observer2);

		// observable changes its state again and the subscribers are notified
		observable.setState(4);

		/*
		 * Observable abstract class is prepared to bestow all the logic needed for
		 * creating observables. In case a new one is needed the maintainer must:
		 * 
		 * - decide which Object is needed for the state
		 * 
		 * - create a new concrete observable making it to inherit Observable abstract
		 * class and having as argument the state-intended Object above
		 * 
		 * - create one concrete observer that implement observable Interface and takes
		 * as argument the state-intended Object above
		 */

	}

}
