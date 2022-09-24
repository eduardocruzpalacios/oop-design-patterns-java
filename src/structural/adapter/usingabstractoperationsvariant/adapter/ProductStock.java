package structural.adapter.usingabstractoperationsvariant.adapter;

import java.time.LocalDateTime;

import structural.adapter.usingabstractoperationsvariant.adaptee.Product;
import structural.adapter.usingabstractoperationsvariant.targetinterface.Stock;

public class ProductStock implements Stock {

	private Product product;
	private LocalDateTime stockedLocalDateTime;

	public ProductStock() {
		this.product = new Product();
	}

	public ProductStock(String ean, String name, float price) {
		this.product = new Product(ean, name, price);
		this.stockedLocalDateTime = LocalDateTime.now();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public LocalDateTime getStockedLocalDateTime() {
		return stockedLocalDateTime;
	}

	public void setStockedLocalDateTime(LocalDateTime stockedLocalDateTime) {
		this.stockedLocalDateTime = stockedLocalDateTime;
	}

	@Override
	public String toString() {
		return "ProductStock [product=" + product + ", stockedLocalDateTime=" + stockedLocalDateTime + "]";
	}

}
