package structural.adapter.usingabstractoperationsvariant;

import structural.adapter.usingabstractoperationsvariant.adapter.ProductStock;
import structural.adapter.usingabstractoperationsvariant.client.Shop;

public class Main {

	public static void main(String[] args) {

		// Given a client that uses the target interface but the adaptee isn't compatible
		Shop shop = new Shop();

		// so, we have the adapter class, which was designed from the target interface and an adaptee class
		ProductStock productStock = new ProductStock("aaa000", "chair", 80);

		// now, the client can use the adaptee through the adapter
		shop.add(productStock);
		shop.print();

	}

}
