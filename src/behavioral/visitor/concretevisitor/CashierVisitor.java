package behavioral.visitor.concretevisitor;

import behavioral.visitor.concreteelement.Coffee;
import behavioral.visitor.concreteelement.Tuna;
import behavioral.visitor.visitor.Visitor;

public class CashierVisitor implements Visitor {

	@Override
	public float visit(Tuna tuna) {
		return (float) (tuna.getTins() == 3 ? 3 : 5.5);
	}

	@Override
	public float visit(Coffee coffee) {
		return coffee.getGrams() * 2;
	}

}
