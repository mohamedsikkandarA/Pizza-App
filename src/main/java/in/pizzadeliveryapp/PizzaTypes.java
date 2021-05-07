package in.pizzadeliveryapp;

import java.util.HashMap;

public class PizzaTypes {
	/**
	 * Array List to store pizzaTypes
	 */

	//static ArrayList<String> pizzaTypes = new ArrayList<String>();
	public static HashMap<Integer, String> pizzaTypes = new HashMap<Integer, String>();
	
	/**
	 * Add a pizza name
	 *  
	 * @param pizzaName
	 * @return
	 */
	public static boolean addPizzaTypes(int pizzaId,String pizzaName) {
		pizzaTypes.put(pizzaId,pizzaName);
		return true;
	}
	/**
	 * Delete a pizza name
	 * 
	 * @param pizzaName
	 * @return
	 */

	public static boolean deletePizzaTypes(int pizzaId) {
		if(pizzaTypes.containsKey(pizzaId)) {
			pizzaTypes.remove(pizzaId);
			return true;
		}
		else {
			return false;
		}
			
		}
		//int index = pizzaTypes.indexOf(pizzaName);
		//pizzaTypes.remove(index);
		//return true;
	
	/**
	 * Update a pizza name
	 * 
	 * @param pizzaName
	 * @param newname
	 * @return
	 */

	public static boolean updatePizzaTypes(int pizzaId  , String newname) {
		if(pizzaTypes.containsKey(pizzaId)) {
			pizzaTypes.replace(pizzaId, newname);
			return true;
		}
		else {
			return false;
		}
			
}
		
		//int index = pizzaTypes.indexOf(pizzaName);
		//pizzaTypes.set(index, newname);
		//return true;
	
	
	/**
	 * Display A pizza types
	 * 
	 */

	public static void displayPizzaTypes() {
		System.out.println("*************LIST OF PIZZA TYPES**************");
		for (Integer pizza : pizzaTypes.keySet()) {
			String pizzaName = pizzaTypes.get(pizza);
			System.out.println("Pizza Id : "+ pizza  +  "     "+"Pizza Name :"+pizzaName);
		}
	}

}

