package miam;

public class aliment {
	String nom;
	boolean estCuit = false;
	
	void manger() {
		if (estCuit) {
			System.out.println("Cuit");
		} else {
			System.out.println("Cru");
		}
			
	}
}
