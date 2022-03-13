package behavioral.visitor;

import behavioral.visitor.client.ProductService;
import behavioral.visitor.visitable.Product;
import behavioral.visitor.visitableconcrete.Coffee;
import behavioral.visitor.visitableconcrete.Tuna;

public class Main {

	public static void main(String[] args) {

		/*
		 * In this example the Visitor is a cashier of a supermarket that receives a
		 * group of products and returns the total cost of all these products. Each
		 * product has a different implementation of how its own price is calculated
		 */

		/*
		 * a group of different objects implementing the visitable interface
		 * (Product.java)
		 */
		Product[] products = new Product[] { new Tuna(6), new Tuna(3), new Coffee(600) };

		/*
		 * the client is a class that uses a concrete visitor (class implementing
		 * visitor interface)
		 * 
		 * The client receives and iterates the group above (see ProductService.java).
		 * 
		 * Each visitable object is passed the visitor in each loop, which returns a
		 * visitor receiving the visitable instance.
		 * 
		 * Depending on the type of instance the visitor do a different action
		 */
		float totalCost = ProductService.calculateTotal(products);
		System.out.println("total cost = " + totalCost);

		/*
		 * in case a new product is added, the maintainer must do the following:
		 * 
		 * - Create the class in model-intended package, implementing the visitable
		 * interface returning "cashier.visit(this)"
		 * 
		 * - visitor interface must be updated generating a new method that depends on
		 * the new class created
		 * 
		 * - concrete visitor must implement this new interface method above
		 */

	}

}
