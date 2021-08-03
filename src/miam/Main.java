package miam;

public class Main {

	public static void main(String[] args) {
		aliment pates = new aliment();
			pates.nom = "Spaghettis";
			pates.estCuit = false;
		four petitFour = new four();
			petitFour.capacite = 50;
			petitFour.puissance = 200;
		four grandFour = new four();
			grandFour.capacite = 500;
			grandFour.puissance = 1000;

		
			pates.manger();
			petitFour.cuire(pates);
			grandFour.cuire(pates);
			pates.manger();

	}

}
