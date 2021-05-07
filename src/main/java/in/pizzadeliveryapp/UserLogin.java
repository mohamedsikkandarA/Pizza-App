package in.pizzadeliveryapp;

import java.util.HashMap;

public class UserLogin {
	
	/**
	 * Set A Hashmap to userListss
	 */

	static HashMap<String, String> userLists = new HashMap<String, String>();
	
	/**
	 * validate a name and mobile no
	 */

	public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{6,19}$";
	public static final String regularExpression1 = "(0/91)?[7-9][0-9]{9}";

	
	/**
	 * get a name to and cheack a valid or invalid
	 * @param name
	 */
	public static void nameValidation(String name) {

		if (name.matches(UserLogin.regularExpression)) {
			System.out.println("VALID NAME :" + "\n" + name);

		} else {
			System.out.println("NAME IS INVALID:" + "\n" + name);

		}

	}
	/**
	 * get a mobile no and cheak a valid or invalid
	 * @param mobileno
	 */

	public static void mobilenoValidation(String mobileno) {

		if (mobileno.matches(UserLogin.regularExpression1)) {
			System.out.println("VALID USERID :" + "\n" + mobileno);

		} else {
			System.out.println("USER ID IS INVALID" + "\n" + mobileno);

		}

	}
	
	/**
	 * add user name and mobile no
	 * @param name
	 * @param mobileno
	 * @return
	 */

	public static boolean addUser(String name, String mobileno) {
		userLists.put(name, mobileno);
		return true;
	}
	
	/**
	 * get a name to delete a name and mobile no
	 * @param name
	 * @param mobileno
	 * @return
	 */
	
	
	public static boolean deleteuserLists(String name, String mobileno) {
		
		userLists.remove(name,mobileno);
		return true;
	}
	
	
	/**
	 * stored name and mobile number display
	 */
	public static void displayuserLists() {
		System.out.println("*************LIST OF PIZZA TYPES**************");
			System.out.println(userLists);
		}
}

	
