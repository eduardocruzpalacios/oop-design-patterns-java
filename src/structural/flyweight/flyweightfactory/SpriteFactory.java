package structural.flyweight.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

import structural.flyweight.concreteflyweight.ObjectSprite;
import structural.flyweight.flyweight.Sprite;

public class SpriteFactory {

	private static Map<String, Sprite> sprites = new HashMap<String, Sprite>();

	static {
		Sprite regularShowerSprite = new ObjectSprite("regularShower.jpg");
		Sprite basicChairSprite = new ObjectSprite("basicChair.jpg");
		sprites.put("regularShower", regularShowerSprite);
		sprites.put("basicChair", basicChairSprite);
	}

	public static Sprite getSprite(String key) {
		if (sprites.containsKey(key)) {
			return sprites.get(key);
		} else {
			Sprite sprite = new ObjectSprite();
			sprites.put(key, sprite);
			return sprite;
		}
	}

}
