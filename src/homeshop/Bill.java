package homeshop;
import java.util.Map;

public class Bill {
	private Customer customer;
	private Map<Product, Integer> products;
	public void addProduct(Product product, Integer quantity) {
		this.products.put(product, quantity);
		
	}
	/**
	 * @return the customer
	 */
	Customer getCustomer() {
		return customer;
	}
	/**
	 * @return the products
	 */
	Map<Product, Integer> getProducts() {
		return products;
	}
}
