package homeshop;

public class ExpressDelivery implements Delivery {
	String city;

	public ExpressDelivery(String city) {
		this.city = city;
	}
	@Override
	public Double getPrice() {

		if (city.equals("Paris")) {
			return 6.99;
		}
		else {
			return 9.99;
		}
	}

}
