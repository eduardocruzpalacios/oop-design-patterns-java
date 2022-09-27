package behavioral.observer.observer;

import behavioral.observer.concretesubject.ConcreteSubject;

public interface Observer {

	public void update(ConcreteSubject concreteSubject);

}
