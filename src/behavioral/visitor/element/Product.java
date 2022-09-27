package behavioral.visitor.element;

import behavioral.visitor.visitor.Visitor;

public interface Product {

	float accept(Visitor visitor);

}
