package behavioral.visitor.visitor;

import behavioral.visitor.visitableconcrete.Coffee;
import behavioral.visitor.visitableconcrete.Tuna;

public interface Cashier {

	float visit(Tuna tuna);

	float visit(Coffee coffee);

}
