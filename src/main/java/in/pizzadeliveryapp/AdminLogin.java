package in.pizzadeliveryapp;

import java.util.HashMap;

public class AdminLogin {
	
	/**
	 * Set A Hashmap to adminList
	 */
	static HashMap<String, String> adminList = new HashMap<String, String>();
	
	/**
	 * validate a name and mobile no
	 */

	public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{6,19}$";
	public static final String regularExpression1 = "(0/91)?[7-9][0-9]{9}";

	
	/**
	 * get a name to and check a valid or invalid
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


	public static boolean addAdmin(String name, String mobileno) {
		adminList.put(name, mobileno);
		return true;
	}
	/**
	 * stored name and mobile number display
	 */
	
	public static void displayAdminList() {
		System.out.println("*************LIST OF PIZZA TYPES**************");
			System.out.println(adminList);
		}


}
