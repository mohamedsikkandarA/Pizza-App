package in.pizzadeliveryapp;

import org.junit.Test;

public class TestCalculation {
	
	/**
	 * pass a value for calculation in Quantity and pizza type
	 * and valid Quantity and pizzatype
	 */

	@Test
	public void test() {

		String str1 = "0";//str1
		String str2 = "VEGPIZZA";//str2
		Calculation.priceEstimater(str1, str2);

	}
	
	/**
	 * pass a value for calculation in Quantity and pizza type
	 * and invalid Quantity and pizzatype
	 */
	
	@Test
	public void test1() {

		String str1 = "-3";
		String str2 = "VEGPIZZA";
		Calculation.priceEstimater(str1, str2);

	}
}