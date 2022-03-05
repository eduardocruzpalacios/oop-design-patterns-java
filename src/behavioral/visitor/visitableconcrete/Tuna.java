package behavioral.visitor.visitableconcrete;

import behavioral.visitor.visitable.Product;
import behavioral.visitor.visitor.Cashier;

public class Tuna implements Product {

	private int tins;

	public Tuna() {
	}

	public Tuna(int tins) {
		this.tins = tins;
	}

	public int getTins() {
		return tins;
	}

	public void setTins(int tins) {
		this.tins = tins;
	}

	@Override
	public String toString() {
		return "Tuna [tins=" + tins + "]";
	}

	@Override
	public float accept(Cashier cashier) {
		return cashier.visit(this);
	}

}
