package structural.flyweight;

import structural.flyweight.client.Board;

public class Main {

	public static void main(String[] args) {

		Board board = new Board();

		int squareId0 = 0;
		int squareId1 = 1;
		int squareId2 = 2;

		String sprite1 = "regularShower";
		String sprite2 = "basicChair";

		board.renderSprite(sprite1, squareId0);
		board.renderSprite(sprite2, squareId0);
		board.renderSprite(sprite2, squareId1);
		board.renderSprite(sprite2, squareId2);

		board.render();

	}

}
