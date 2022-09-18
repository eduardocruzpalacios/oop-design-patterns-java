package creational.prototype;

import creational.prototype.client.GraphicTool;
import creational.prototype.concreteprototype.HalfNotePrototypeDeepCopy;
import creational.prototype.concreteprototype.HalfNotePrototypeShadowCopy;
import creational.prototype.prototype.MusicalNotePrototype;

public class Main {

	public static void main(String[] args) {
		System.out.println("DEEP COPY");
		// Given a set of musical note prototypes
		MusicalNotePrototype halfNotePrototypeDeepCopy = new HalfNotePrototypeDeepCopy();

		// the application needs a new instance of one of them
		MusicalNotePrototype clonedByDeepCopy = halfNotePrototypeDeepCopy.clone();

		// original and clone have different hash code because they are not the same object
		System.out.println(halfNotePrototypeDeepCopy.hashCode());
		System.out.println(clonedByDeepCopy.hashCode());
		System.out.println(halfNotePrototypeDeepCopy.equals(clonedByDeepCopy));

		// they have same properties values
		System.out.println(halfNotePrototypeDeepCopy.getRepresentation());
		System.out.println(clonedByDeepCopy.getRepresentation());

		// the clone is made by deep copy, so the hash code of their members are different
		System.out.println(halfNotePrototypeDeepCopy.getRepresentation().hashCode());
		System.out.println(clonedByDeepCopy.getRepresentation().hashCode());
		System.out.println(halfNotePrototypeDeepCopy.getRepresentation().equals(clonedByDeepCopy.getRepresentation()));

		System.out.println("SHADOW COPY");
		// Given a set of musical note prototypes
		MusicalNotePrototype halfNotePrototypeShadowCopy = new HalfNotePrototypeShadowCopy();

		// the application needs a new instance of one of them
		MusicalNotePrototype clonedByShadowCopy = halfNotePrototypeShadowCopy.clone();

		// original and clone have different hash code because they are not the same object
		System.out.println(halfNotePrototypeShadowCopy.hashCode());
		System.out.println(clonedByShadowCopy.hashCode());
		System.out.println(halfNotePrototypeShadowCopy.equals(clonedByShadowCopy));

		// they have same properties values
		System.out.println(halfNotePrototypeShadowCopy.getRepresentation());
		System.out.println(clonedByShadowCopy.getRepresentation());

		// the clone is made by shadow copy, so the hash code of their members is the same
		System.out.println(halfNotePrototypeShadowCopy.getRepresentation().hashCode());
		System.out.println(clonedByShadowCopy.getRepresentation().hashCode());
		System.out.println(halfNotePrototypeShadowCopy.getRepresentation().equals(clonedByShadowCopy.getRepresentation()));

		// THE CLIENT CAN USE CLONES
		GraphicTool graphicTool = new GraphicTool();
		graphicTool.draw(clonedByShadowCopy);
		graphicTool.draw(clonedByDeepCopy);

	}

}
