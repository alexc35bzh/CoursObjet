package homeshop;
import java.util.Map;
import java.util.HashMap;

public class Bill {
	private Customer customer;
	// Création d'une liste de paires produits/qté
	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	
	// Création d'une livraison
	private Delivery delivery;
		public Bill(Delivery delivery) {
			this.delivery = delivery;
		}

	// Alimentation des produits et quantités
		
	public void addProduct(Product product, Integer quantity) {
		this.products.put(product, quantity);	
	}
	
	/**
	 * CONSTRUCTEUR
	 * @param customer
	 */
	public Bill(Customer customer, Delivery delivery) {
		this.customer = customer;
		this.delivery = delivery;
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
	
	/**
	 * Generate an output for the current Bill
	 * @param writer object in charge of writing
	 */
	public void generate(Writer writer) {
	    writer.start();
	    writer.writeLine("HomeShop compagnie");
	    writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
	    writer.writeLine("");
	    writer.writeLine("Facture à l'attention de : ");
	    writer.writeLine(customer.getFullName());
	    writer.writeLine(customer.getAddress());
	    writer.writeLine("");
//	    writer.writeLine("Mode de livraison : " + delivery.getInfo());
	    writer.writeLine("");
	    writer.writeLine("Produits : ");
	    writer.writeLine("-----------------------------------------------------");
	    for (Map.Entry<Product, Integer> entry : products.entrySet()) {
	        Product product = entry.getKey();
	        Integer quantity = entry.getValue();
	        writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
	        writer.writeLine(product.getDescription());
	        writer.writeLine("");
	    }
	    writer.writeLine("Livraison : " + delivery.getPrice());
	    writer.writeLine("-----------------------------------------------------");
	    writer.writeLine("Total : " + this.getTotal());
	    writer.stop();
	}

	/**
	 * get the total price for the current bill, including products and delivery cost
	 * @return total price
	*/
	public double getTotal() {
	double total = delivery.getPrice();
	    for (Map.Entry<Product, Integer> entry : products.entrySet()) {
	        Product product = entry.getKey();
	        Integer quantity = entry.getValue();
	        total += product.getPrice() * quantity;
	    }
	    return total;
	}
	
}
