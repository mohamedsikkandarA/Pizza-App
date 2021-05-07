package in.pizzadeliveryapp;

import java.util.HashMap;

public class Calculation {
	
	/**
	 * validate a Quantity and pizzatype
	 */

	public static final String regularExpression1 = "[1-9]+";// str1
	public static final String regularExpression2 = "[a-zA-Z_]+";// str2
	static double gst = 0.07;

	public static  void priceEstimater(String str1, String str2) {
		
		/**
		 * set a pizzatypes and amount stored for calculation process
		 */

		HashMap<String, Integer> pizzatypes = new HashMap<String, Integer>();
		pizzatypes.put("VEGPIZZA", 150);
		pizzatypes.put("MUSHOOMPIZZA", 200);
		pizzatypes.put("PANNERPIZZA", 250);
		
		/**
		 * if condition check a validate Quantity and pizzatypes
		 * then inside a price and gst calculation
		 * other wise else part execute
		 */

		if (str1.matches(Calculation.regularExpression1) && str2.matches(Calculation.regularExpression2)) {
			
			int Quantity = Integer.parseInt(str1);
			int price = pizzatypes.get(str2);
			double totalamount = Quantity * price;
			double gstamount = (totalamount * gst) + totalamount;
			System.out.println("*************List Of Total Amount**************");
			System.out.println("PizzaType:" + str2);
			System.out.println("Quantity:" + Quantity);
			System.out.println("TotalAmount:" + totalamount);
			System.out.println("TotalAmount + GST amount:" + gstamount);
			
		} else {

			System.out.println("YOUR PIZZA TYPES AND QUANTITY IS WRONG"+"\n");
			System.out.println("------------------OR------------------"+"\n");
			System.out.println("BOTH ARE WRONG"+"\n");
			
		}
		
		
	}
	
}
