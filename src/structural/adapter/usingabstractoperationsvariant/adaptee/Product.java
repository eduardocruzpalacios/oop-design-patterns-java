package structural.adapter.usingabstractoperationsvariant.adaptee;

public class Product {

	private String ean;
	private String name;
	private float price;

	public Product() {
	}

	public Product(String ean, String name, float price) {
		this.ean = ean;
		this.name = name;
		this.price = price;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [ean=" + ean + ", name=" + name + ", price=" + price + "]";
	}

}
