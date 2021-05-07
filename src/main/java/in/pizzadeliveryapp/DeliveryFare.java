package in.pizzadeliveryapp;

import java.time.LocalTime;
import java.util.HashMap;

public class DeliveryFare {

	public static void Time(double amount, String Area) {
		
		/**
		 * stored a hashmap to areatype and kilometer
		 */

		HashMap<String, Integer> areaType = new HashMap<String, Integer>();
		areaType.put("mugapairwest", 6);
		areaType.put("mugapaireast", 10);
		areaType.put("ampathur", 15);
		
		/**
		 * get local time to or system
		 */

		LocalTime time = LocalTime.now();
		

		double price = 0;
		int kiloMeter = areaType.get(Area);

		if (kiloMeter >= 3 && kiloMeter <= 7) {
			price = amount + 50;
			System.out.println("AMOUNT + DELIVERY CHARGES AMOUNT" + "\n" + price + "\n");
		} else if (kiloMeter >= 8 && kiloMeter <= 13) {
			price = amount + 100;
			System.out.println("AMOUNT + DELIVERY CHARGES AMOUNT" + "\n" + price + "\n");
		}else if (kiloMeter >= 14 && kiloMeter <= 18) {
			price = amount + 150;
			System.out.println("AMOUNT + DELIVERY CHARGES AMOUNT" + "\n" + price + "\n");
		}

		/**
		 * display a order time and use time to display delivery time to after 30
		 * minutes
		 */
		System.out.println("ORDER TIME:" + time + "\n");
		time = time.plusMinutes(30);

		System.out.println("YOU GET A DELIVERY IN ON TIME:" + "\n" + time + "\n");

	}
}
