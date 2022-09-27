package behavioral.observer.concretesubject;

import behavioral.observer.subject.Subject;

public class ConcreteSubject extends Subject {

	private Integer subjectState;

	public Integer getState() {
		return subjectState;
	}

	public void setState(Integer state) {
		this.subjectState = state;
		this.notifySubscribers();
	}

}
