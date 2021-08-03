package miam;

public class four {

	int puissance;
	int capacite;
	void cuire(aliment Aliment) {
		Aliment.estCuit = true;
		System.out.println("J'ai une puissance de " + puissance + " W " + " et une capacité de " + capacite + " L.");
		System.out.println("J'ai cuit: " + Aliment.nom);
	}
	
}
