// Double authentification
package miam;
import homeshop.*;
import paris.*;
// Classe principale. Test.

public class Main {

	public static void main(String[] args) {

		/*
	    Parisien segolene = new Parisien();
	    Bus bus = new Bus();
	    Taxi G7 = new Taxi();
	    segolene.seDeplacer(bus);
	    segolene.seDeplacer(G7);
		*/
		
		// Création des produits
	    Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
	    Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
	    Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
		// Création d'un client
	    Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
	    final Delivery lowCostRelayDelivery = new RelayDelivery(27);
	    // Création d'une facture
	    Bill bill = new Bill(customer, lowCostRelayDelivery);
	    // Ajout de lignes à la facture
	    bill.addProduct(cafe, 1);
	    bill.addProduct(tv, 3);
	    bill.addProduct(fridge, 5);
	    bill.afficheBill();
	    bill.generate(new FileWriter("facture_leblanc.txt"));

	}

}
