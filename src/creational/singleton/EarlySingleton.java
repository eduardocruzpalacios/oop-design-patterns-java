package creational.singleton;

public class EarlySingleton {

	static private AnyObject earlySingleton = new AnyObject();

	static public AnyObject getEarlySingleton() {
		return earlySingleton;
	}

}
