package behavioral.visitor.visitable;

import behavioral.visitor.visitor.Cashier;

public interface Product {

	float accept(Cashier cashier);

}
