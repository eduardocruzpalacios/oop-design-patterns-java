package creational.singleton;

public class LazySingleton {

	static private AnyObject lazySingleton;

	static public AnyObject getLazySingleton() {
		if (lazySingleton == null) {
			lazySingleton = new AnyObject();
		}
		return lazySingleton;
	}

}
