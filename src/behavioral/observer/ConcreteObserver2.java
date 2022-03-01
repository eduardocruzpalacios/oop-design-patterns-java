package behavioral.observer;

public class ConcreteObserver2 implements Observer {

	@Override
	public void update(Observable observable) {
		System.out.println("The state plus 5 = " + (observable.getState() + 5));
	}

}
