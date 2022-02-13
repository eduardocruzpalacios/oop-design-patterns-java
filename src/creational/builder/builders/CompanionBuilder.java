package creational.builder.builders;

import creational.builder.model.Product;
import creational.builder.model.companions.Companion;
import creational.builder.model.companions.OnionRings;

public class CompanionBuilder implements ProductBuilder {

	private Companion companion;

	@Override
	public void select(String type) {

		switch (type) {
		case "onion rings":
			companion = new OnionRings();
			break;
		default:
			break;
		}

	}

	@Override
	public void prepare() {
		System.out.println("your companion is being fried!");
	}

	@Override
	public Product get() {
		return companion;
	}

}
