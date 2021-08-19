package homeshop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressDeliveryTest {

	@Test
	public void Given_RegionCityAsLocation_WHenGettingDeliveryPrice_ThenGet_9e99() {
		Delivery delivery = new ExpressDelivery("Bordeaux");
		assertEquals(9.99, delivery.getPrice(), 0.01);
	}

	@Test
	public void Given_ParisAsLocation_WHenGettingDeliveryPrice_ThenGet_6e99() {
		Delivery delivery = new ExpressDelivery("Paris");
		assertEquals(6.99, delivery.getPrice(), 0.01);
	}
}
