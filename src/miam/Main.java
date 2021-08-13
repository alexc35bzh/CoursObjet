package miam;
import homeshop.*;
// Classe principale. Test.

public class Main {

	public static void main(String[] args) {

		// Cr�ation des produits
	    Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
	    Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurv�e 49\"", 599, 49, "LED");
	    Fridge fridge = new Fridge("BEKO TSE 1042 F", "R�frig�rateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
		// Cr�ation d'un client
	    Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
	    // Cr�ation d'une facture
	    Bill bill = new Bill(customer);
	    // Ajout de lignes � la facture
	    bill.addProduct(cafe, 1);
	    bill.addProduct(tv, 3);
	    bill.addProduct(fridge, 5);
	    bill.afficheBill();
	    
	}

}
