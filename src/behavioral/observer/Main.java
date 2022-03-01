package behavioral.observer;

class Main {

	public static void main(String[] args) {

		Observable observable = new Observable();

		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();

		observable.subscribe(observer1);
		observable.subscribe(observer2);

		observable.setState(1);

		observable.notifySubscribers();

		observable.unsubscribe(observer1);
		observable.unsubscribe(observer2);

		observable.notifySubscribers();

	}

}
