package behavioral.observer;

import behavioral.observer.concreteobserver.ConcreteObserver;
import behavioral.observer.concretesubject.ConcreteSubject;
import behavioral.observer.observer.Observer;
import behavioral.observer.subject.Subject;

class Main {

	public static void main(String[] args) {

		// instantiation, observers subscribe to subject
		Subject subject = new ConcreteSubject();

		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();

		subject.attach((ConcreteObserver) observer1);
		subject.attach((ConcreteObserver) observer2);

		// subject state changes, their observers are notified and updated
		// automatically
		((ConcreteSubject) subject).setState(1);

		System.out.println(observer1);
		System.out.println(observer2);

		// observers are detached from the observable, subject states changes, their
		// observers are not notified now
		subject.detach((ConcreteObserver) observer1);
		subject.detach((ConcreteObserver) observer2);

		((ConcreteSubject) subject).setState(4);

		System.out.println(observer1);
		System.out.println(observer2);

	}

}
