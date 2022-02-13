package creational.builder.builders;

import creational.builder.model.Product;

public interface ProductBuilder {

	public void select(String type);

	public void prepare();

	public Product get();

}
