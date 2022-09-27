package behavioral.visitor.client;

import behavioral.visitor.concreteelement.Coffee;
import behavioral.visitor.concreteelement.Tuna;
import behavioral.visitor.concretevisitor.CashierVisitor;
import behavioral.visitor.element.Product;
import behavioral.visitor.objectstructure.ProductComposite;
import behavioral.visitor.visitor.Visitor;

public class Main {

	public static void main(String[] args) {

		// concrete elements and object structure
		Product product1 = new Tuna(6);
		Product product2 =new Tuna(3);
		Product product3 = new Coffee(600);
		ProductComposite productComposite = new ProductComposite();
		productComposite.add(product1);
		productComposite.add(product2);
		productComposite.add(product3);

		// use visitor
		Visitor visitor = new CashierVisitor();
		float totalCost = productComposite.accept(visitor);
		System.out.println("total cost = " + totalCost);

	}

}
