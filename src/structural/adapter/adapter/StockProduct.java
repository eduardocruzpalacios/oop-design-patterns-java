package structural.adapter.adapter;

import java.time.LocalDateTime;

import structural.adapter.adaptee.Product;
import structural.adapter.targetinterface.Stock;

public class StockProduct extends Product implements Stock {

	private LocalDateTime stockedLocalDateTime;

	public StockProduct(String ean, String name, float price) {
		super(ean, name, price);
		this.stockedLocalDateTime = LocalDateTime.now();
	}

	// Adapter method
	public static StockProduct ProductToStockProduct(Product product) {
		return new StockProduct(product.getEan(), product.getName(), product.getPrice());
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
		return "StockProduct [stockedLocalDateTime=" + stockedLocalDateTime + ", getEan()=" + getEan() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + "]";
	}

}
