package creational.prototype;

public class Main {

	public static void main(String[] args) {

		// instances
		Prototype anyObject = new AnyObject(10);
		Prototype clone = anyObject.getClone();

		// they have different hash code but same properties values
		System.out.println(clone.hashCode());
		System.out.println(anyObject.hashCode());
		System.out.println(clone);
		System.out.println(anyObject);

		// they do not refer to the same object
		System.out.println(anyObject.equals(clone));

	}

}
