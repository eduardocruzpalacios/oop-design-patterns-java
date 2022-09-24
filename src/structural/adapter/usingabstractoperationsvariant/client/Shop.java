package structural.adapter.usingabstractoperationsvariant.client;

import java.util.ArrayList;
import java.util.List;

import structural.adapter.usingabstractoperationsvariant.targetinterface.Stock;

public class Shop {

	private List<Stock> stock = new ArrayList<Stock>();

	public Stock add(Stock stock) {
		this.stock.add(stock);
		return stock;
	}

	public void print() {
		this.stock.forEach(e -> {
			System.out.println(e);
		});
	}

}
