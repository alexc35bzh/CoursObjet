package homeshop;

public class Product {
	String name;
	String description;
	double price;
	
	/**
	 * CONSTRUCTEUR
	 * @param name
	 * @param description
	 * @param price
	 */
	public Product(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public void look() {
		
	}
	
	public void buy(Bill bill, Integer quantity) {
		
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	String getName() {
		return name;
	}

	String getDescription() {
		return description;
	}
}
