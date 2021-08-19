package paris;

public class Taxi implements MoyenDeLocomotion{
	@Override
	public void deplace(String adresse) {
		System.out.println("Je susi un taxi et je vais à: "+ adresse);
	}

}
