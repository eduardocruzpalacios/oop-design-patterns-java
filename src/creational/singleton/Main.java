package creational.singleton;

public class Main {

	public static void main(String[] args) {

		// EARLY SINGLETON
		// isEquals
		AnyObject anyObject1 = EarlySingleton.getEarlySingleton();
		AnyObject anyObject2 = EarlySingleton.getEarlySingleton();
		boolean isSameInstance = anyObject1.equals(anyObject2);
		System.out.println("are anyObject1 and anyObject2 the same instance? " + isSameInstance);

		// by changing one, the other changes
		anyObject1.setName("name of 1");
		System.out.println(anyObject2.getName());

		// both references have the same hash code
		System.out.println(anyObject1.hashCode());
		System.out.println(anyObject2.hashCode());

		// LAZY SINGLETON
		// isEquals
		AnyObject anyObject3 = LazySingleton.getLazySingleton();
		AnyObject anyObject4 = LazySingleton.getLazySingleton();
		isSameInstance = anyObject3.equals(anyObject4);
		System.out.println("are anyObject3 and anyObject4 the same instance? " + isSameInstance);

		// by changing one, the other changes
		anyObject3.setName("name of 3");
		System.out.println(anyObject4.getName());

		// both references have the same hash code
		System.out.println(anyObject3.hashCode());
		System.out.println(anyObject4.hashCode());

	}

}
