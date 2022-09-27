package behavioral.visitor.visitor;

import behavioral.visitor.concreteelement.Coffee;
import behavioral.visitor.concreteelement.Tuna;

public interface Visitor {

	float visit(Tuna tuna);

	float visit(Coffee coffee);

}
