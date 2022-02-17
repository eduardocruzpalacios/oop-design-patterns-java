package behavioral.visitor.visitorconcrete;

import behavioral.visitor.visitableconcrete.Coffee;
import behavioral.visitor.visitableconcrete.Tuna;
import behavioral.visitor.visitor.Cashier;

public class ProductsVisited implements Cashier {

	@Override
	public float visit(Tuna tuna) {
		return (float) (tuna.getTins() == 3 ? 3 : 5.5);
	}

	@Override
	public float visit(Coffee coffee) {
		return coffee.getGrams() * 2;
	}

}
