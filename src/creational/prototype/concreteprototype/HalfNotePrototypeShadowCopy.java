package creational.prototype.concreteprototype;

import creational.prototype.client.model.Representation;
import creational.prototype.prototype.MusicalNotePrototype;

public class HalfNotePrototypeShadowCopy implements MusicalNotePrototype {

	private Representation representation = new Representation("HalfNote");

	public HalfNotePrototypeShadowCopy() {
	}

	public HalfNotePrototypeShadowCopy(Representation representation) {
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
		return "HalfNotePrototypeShadowCopy [representation=" + representation + "]";
	}

	@Override
	public MusicalNotePrototype clone() {
		return new HalfNotePrototypeShadowCopy(this);
	}

	private HalfNotePrototypeShadowCopy(HalfNotePrototypeShadowCopy halfNotePrototypeShadowCopy) {
		this.representation = halfNotePrototypeShadowCopy.getRepresentation();
	}

}
