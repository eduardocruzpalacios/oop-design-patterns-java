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

		// both references print same memory address if toString() not overridden
		System.out.println(anyObject1);
		System.out.println(anyObject2);

	}

}
