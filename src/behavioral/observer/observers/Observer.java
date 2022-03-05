package behavioral.observer.observers;

import behavioral.observer.observables.Observable;

public interface Observer<T> {

	public void update(Observable<T> observable);

}
