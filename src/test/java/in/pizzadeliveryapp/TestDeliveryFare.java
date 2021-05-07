package in.pizzadeliveryapp;

import org.junit.Test;

public class TestDeliveryFare {

	/**
	 * 
	 *pass a amount and area types are pass
	 * 
	 */

	@Test
	public void TestDeliveryFarecalculation() {

		double amount = 160.5;
		String Area = "mugapairwest";
		DeliveryFare.Time(amount, Area);
	}
	/**
	 * 
	 *pass a amount and various area types are pass
	 * 
	 */
	
	@Test
	public void TestDeliveryFarecalculation1() {

		double amount = 160.5;
		String Area = "mugapaireast";
		DeliveryFare.Time(amount, Area);
	}
	/**
	 * 
	 *pass a amount and various area types are pass
	 * 
	 */

	@Test
	public void TestDeliveryFarecalculation2() {

		double amount = 160.5;
		String Area = "ampathur";
		DeliveryFare.Time(amount, Area);
	}

}
