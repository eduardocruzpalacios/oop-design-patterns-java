package structural.flyweight.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import structural.flyweight.context.Square;
import structural.flyweight.flyweight.Sprite;
import structural.flyweight.flyweightfactory.SpriteFactory;

public class Board {

	private List<Square> squares = new ArrayList<Square>();
	private Map<Integer, Sprite> spritesContext = new HashMap<Integer, Sprite>();

	public Board() {
		for (int i = 0; i < 16; i++) {
			Square square = new Square(i);
			this.squares.add(square);
		}
	}

	public void renderSprite(String spriteKey, int squareId) {
		if (squares.get(squareId).isFull()) {
			System.out.println("Square with id " + squareId + " is not free");
			return;
		}
		Sprite sprite = SpriteFactory.getSprite(spriteKey);
		spritesContext.put(squareId, sprite);
		sprite.render(squares.get(squareId));
		squares.get(squareId).setFull(true);
	}

	public void render() {
		for (var entry : this.spritesContext.entrySet()) {
			entry.getValue().render(this.squares.get(entry.getKey()));
		}
	}

}
