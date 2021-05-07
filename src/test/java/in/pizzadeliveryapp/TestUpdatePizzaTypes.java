package in.pizzadeliveryapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUpdatePizzaTypes {

	/**
	 * add a one pizza type and set a old name
	 * then update a old name to new name
	 * and display a after update pizza type 
	 */
	
	@Test
	public void TestUpdatePizzaTypes1() {
		int pizzaId=102;
		String oldname = "CHICKEN PIZZA";
		String newname = "PANNER PIZZA";
		PizzaTypes.addPizzaTypes(pizzaId,oldname);  
		PizzaTypes.displayPizzaTypes();						
		boolean isUpdated = PizzaTypes.addPizzaTypes(pizzaId,newname);  	
		PizzaTypes.displayPizzaTypes();						
		assertTrue(isUpdated);
		
	}

}
