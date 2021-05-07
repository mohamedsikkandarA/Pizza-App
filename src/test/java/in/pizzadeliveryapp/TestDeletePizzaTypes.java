package in.pizzadeliveryapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeletePizzaTypes {
	
	/**
	 * Add a pizza type in two
	 * Then delete a One pizza Type
	 * and display after delete pizza type
	 */
		@Test
		public void TestDeletePizzaTypes1(){
			int pizzaId=201;
			String pizzaName = "VEG PIZZA";
			PizzaTypes.addPizzaTypes(pizzaId,pizzaName);
			int pizzaId1=202;
			String pizzaName1 = "CHICKEN PIZZA";
			PizzaTypes.addPizzaTypes(pizzaId1,pizzaName1);
			PizzaTypes.displayPizzaTypes();
			boolean  isDeleted =PizzaTypes.deletePizzaTypes(pizzaId1);
			PizzaTypes.displayPizzaTypes();
			assertTrue(isDeleted);
		}
		
	}


