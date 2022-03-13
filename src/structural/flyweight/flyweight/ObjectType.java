package structural.flyweight.flyweight;

public class ObjectType {

	private String name;
	private String sprite;
	private int price;

	public ObjectType() {
	}

	public ObjectType(String name, String sprite, int price) {
		this.name = name;
		this.sprite = sprite;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSprite() {
		return sprite;
	}

	public void setSprite(String sprite) {
		this.sprite = sprite;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ObjectType [name=" + name + ", sprite=" + sprite + ", price=" + price + "]";
	}

}
