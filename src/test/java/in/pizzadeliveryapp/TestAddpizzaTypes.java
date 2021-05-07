package in.pizzadeliveryapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddpizzaTypes {
	
	/**
	 * Add a pizza type and Display added pizza type
	 */
	@Test
	public void TestAddpizzaTypes1() {
		int pizzaId=101;
		String pizzaName = "VEG PIZZA";
		boolean isValid = PizzaTypes.addPizzaTypes(pizzaId,pizzaName);
		assertTrue(isValid);
		PizzaTypes.displayPizzaTypes();
	}
	
	/**
	 * Add a pizza type and Display added pizza type
	 */

	@Test
	public void TestAddpizzaTypes2() {
		int pizzaId=102;
		String pizzaName = "CHICKEN PIZZA";
		boolean isValid = PizzaTypes.addPizzaTypes(pizzaId,pizzaName);
		assertTrue(isValid);
		PizzaTypes.displayPizzaTypes();
	}
	
	/**
	 * Add a pizza type and Display added pizza type
	 */
	
	@Test
	public void TestAddpizzaTypes3() {
		int pizzaId=103;
		String pizzaName = "PANNER PIZZA";
		boolean isValid = PizzaTypes.addPizzaTypes(pizzaId,pizzaName);
		assertTrue(isValid);
		PizzaTypes.displayPizzaTypes();
	}

}
