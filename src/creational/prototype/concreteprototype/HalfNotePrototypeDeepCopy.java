package creational.prototype.concreteprototype;

import creational.prototype.client.model.Representation;
import creational.prototype.prototype.MusicalNotePrototype;

public class HalfNotePrototypeDeepCopy implements MusicalNotePrototype {

	private Representation representation = new Representation("HalfNote");

	public HalfNotePrototypeDeepCopy() {
	}

	public HalfNotePrototypeDeepCopy(Representation representation) {
		this.representation = representation;
	}

	@Override
	public Representation getRepresentation() {
		return this.representation;
	}

	public void setRepresentation(Representation representation) {
		this.representation = representation;
	}

	@Override
	public String toString() {
		return "HalfNotePrototypeDeepCopy [representation=" + representation + "]";
	}

	@Override
	public MusicalNotePrototype clone() {
		return new HalfNotePrototypeDeepCopy(this);
	}

	private HalfNotePrototypeDeepCopy(HalfNotePrototypeDeepCopy halfNotePrototypeDeepCopy) {
		this.representation = new Representation(halfNotePrototypeDeepCopy.getRepresentation().getString());
	}

}
