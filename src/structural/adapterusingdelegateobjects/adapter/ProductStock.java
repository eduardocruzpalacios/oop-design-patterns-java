package structural.adapterusingdelegateobjects.adapter;

import java.time.LocalDateTime;

import structural.adapterusingdelegateobjects.adaptee.Product;
import structural.adapterusingdelegateobjects.targetinterface.Stock;

public class ProductStock extends Product implements Stock {

	private LocalDateTime stockedLocalDateTime;

	public ProductStock(String ean, String name, float price) {
		super(ean, name, price);
		this.stockedLocalDateTime = LocalDateTime.now();
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
		return "ProductStock [stockedLocalDateTime=" + stockedLocalDateTime + ", getEan()=" + getEan() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + "]";
	}

}
