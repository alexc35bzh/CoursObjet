package homeshop;
import java.util.Map;
import java.util.HashMap;

public class Bill {
	private Customer customer;
	// Création d'une liste de paies produits/qté
	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	
	// Alimentation des produits et quantités
	public void addProduct(Product product, Integer quantity) {
		this.products.put(product, quantity);	
	}
	
	/**
	 * CONSTRUCTEUR
	 * @param customer
	 */
	public Bill(Customer customer) {
		this.customer = customer;
	}
	
	// Affiche le contenu du HashMap products
	public void afficheBill() {
		for (Product key : products.keySet()) {
			System.out.print(key + " => ");
			System.out.println(products.get(key));
		}
	}
	

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @return the products
	 */
	public Map<Product, Integer> getProducts() {
		return products;
	}
}
