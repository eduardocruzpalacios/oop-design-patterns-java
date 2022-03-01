package behavioral.observer;

public class ConcreteObserver1 implements Observer {

	@Override
	public void update(Observable observable) {
		System.out.println("¡The state has changed! Let's do nothing");
	}

}
