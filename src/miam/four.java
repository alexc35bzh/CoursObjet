package miam;

public class four {

	int puissance;
	int capacite;
	private Resistance resistance;
	private Soufflerie soufflerie;
	
	/**
	 * @return the capacite
	 */
	int getCapacite() {
		return capacite;
	}

	/**
	 * @param capacite the capacite to set
	 */
	void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	/**
	 * @return the resistance
	 */
	Resistance getResistance() {
		return resistance;
	}

	/**
	 * @return the soufflerie
	 */
	Soufflerie getSoufflerie() {
		return soufflerie;
	}

	public void cuire(aliment Aliment) {
		Aliment.estCuit = true;
		System.out.println("J'ai une puissance de " + puissance + " W " + " et une capacité de " + capacite + " L.");
		System.out.println("J'ai cuit: " + Aliment.nom);
		maintenir();
	}
	
	private void maintenir() {
		
	}

	
}
