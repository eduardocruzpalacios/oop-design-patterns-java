package behavioral.observer;

import behavioral.observer.concreteobserver.ConcreteObserver;
import behavioral.observer.concretesubject.ConcreteSubject;
import behavioral.observer.observer.Observer;
import behavioral.observer.subject.Subject;

class Main {

	public static void main(String[] args) {

		// initialize subject
		Subject subject = new ConcreteSubject();

		// initialize 2 observers
		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();

		// observers are attached to the observable
		subject.attach((ConcreteObserver) observer1);
		subject.attach((ConcreteObserver) observer2);

		// subject state changes, theirs observers are notified and updated
		// automatically
		((ConcreteSubject) subject).setState(1);

		// check observers state
		System.out.println(observer1);
		System.out.println(observer2);

		// observers are detached from the observable
		subject.detach((ConcreteObserver) observer1);
		subject.detach((ConcreteObserver) observer2);

		// subject states changes, theirs observers are not notified now
		((ConcreteSubject) subject).setState(4);

		// check observers state
		System.out.println(observer1);
		System.out.println(observer2);

	}

}
