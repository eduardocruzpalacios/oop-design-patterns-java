package behavioral.visitor.client;

import behavioral.visitor.visitable.Product;
import behavioral.visitor.visitor.Cashier;
import behavioral.visitor.visitorconcrete.ProductsVisited;

public class ProductService {

	public static float calculateTotal(Product[] products) {
		Cashier cashier = new ProductsVisited();
		float total = 0f;
		for (Product product : products) {
			total += product.accept(cashier);
		}
		return total;
	}

}
