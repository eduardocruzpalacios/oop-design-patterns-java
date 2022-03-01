package behavioral.observer;

class Main {

	public static void main(String[] args) {

		// initialize an observable
		Observable observable = new Observable();

		// initialize 2 observers
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();

		// observers are subscribed to the observable
		observable.subscribe(observer1);
		observable.subscribe(observer2);

		// observable changes its state and the subscribers are notified
		observable.setState(1);
		observable.notifySubscribers();

		// observers are unsubscribed from the observable
		observable.unsubscribe(observer1);
		observable.unsubscribe(observer2);

		// observable changes its state again and the subscribers are notified
		observable.setState(1);
		observable.notifySubscribers();

	}

}
