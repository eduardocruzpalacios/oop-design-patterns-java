package structural.adapter;

import java.util.ArrayList;
import java.util.List;

import structural.adapter.adaptee.Product;
import structural.adapter.adapter.StockProduct;
import structural.adapter.targetinterface.Stock;

public class Main {

	public static void main(String[] args) {

		/*
		 * Given a class or a data structure that uses (thus, depends on) a target
		 * interface
		 */
		List<Stock> stockProducts = new ArrayList<Stock>();

		/*
		 * we have another class (adaptee) which is incompatible with the interface
		 * above. Besides, we do not want to modify the class to prevent unexpected
		 * errors occurs in the rest of the application
		 * 
		 * so, we cannot do: stockProducts.add(product);
		 */
		Product product = new Product("aaa000", "chair", 80);

		/*
		 * with the adapter (a class extending the incompatible class and implementing
		 * the target interface), we have 2 approaches ()
		 */

		// 1st approach
		Stock stockProduct1 = new StockProduct(product.getEan(), product.getName(), product.getPrice());

		// 2nd approach
		Stock stockProduct2 = StockProduct.ProductToStockProduct(product);

		/*
		 * now, the given class or a data structure can use the adapter to reuse the
		 * data within the adaptee
		 */
		stockProducts.add(stockProduct1);
		stockProducts.add(stockProduct2);

		for (int i = 0; i < stockProducts.size(); i++) {
			System.out.println(stockProducts.get(i));
		}

	}

}
