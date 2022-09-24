package structural.flyweight.concreteflyweight;

import structural.flyweight.context.Square;
import structural.flyweight.flyweight.Sprite;

public class ObjectSprite extends Sprite {

	public ObjectSprite() {
	}

	public ObjectSprite(String sprite) {
		super(sprite);
	}

	@Override
	public void render(Square square) {
		System.out.println("Sprite " + getSprite() + " is rendered in square " + square.getId());
	}

}
