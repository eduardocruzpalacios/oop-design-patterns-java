package structural.flyweight.flyweight;

import structural.flyweight.context.Square;

public abstract class Sprite {

	private String sprite;

	public Sprite() {
	}

	public Sprite(String sprite) {
		this.sprite = sprite;
	}

	public String getSprite() {
		return sprite;
	}

	public void setSprite(String sprite) {
		this.sprite = sprite;
	}

	public abstract void render(Square square);

}
