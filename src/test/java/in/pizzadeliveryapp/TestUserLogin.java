package in.pizzadeliveryapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUserLogin {
	
	/**
	 * pass a vaild user name and mobile no 
	 */

	@Test
	public void test() {
		String name = "mohamed";
		String mobileno = "9698612143";
		UserLogin.nameValidation(name);
		UserLogin.mobilenoValidation(mobileno);
		UserLogin.addUser(name,mobileno);
		UserLogin.displayuserLists();
	}
	
	/**
	 * pass a invaild user name and mobile no 
	 */

	@Test
	public void test1() {
		String name = "8";
		String mobileno = "969861214";
		UserLogin.nameValidation(name);
		UserLogin.mobilenoValidation(mobileno);
	}
	
	/**
	 * pass a invaild user name and mobile no 
	 */

	@Test
	public void test2() {
		String name = "8";
		String mobileno = "969861";
		UserLogin.nameValidation(name);
		UserLogin.mobilenoValidation(mobileno);
	}
	
	/**
	 * pass a invaild user name and mobile no 
	 */
	
	@Test
	public void test4() {
		String name = "2Priyam";
		String mobileno = "9698612143";
		UserLogin.nameValidation(name);
		UserLogin.mobilenoValidation(mobileno);

	}
	
	/**
	 * pass a invaild user name and mobile no 
	 */
	
	@Test
	public void test5() {
		String name = "Anjelina@007";
		String mobileno = "9698612143";
		UserLogin.nameValidation(name);
		UserLogin.mobilenoValidation(mobileno);

	}
	
	/**
	 * pass a invaild user name and mobile no 
	 */

	@Test
	public void test6() {
		String name = "_James007";
		String mobileno = "9698612143";
		UserLogin.nameValidation(name);
		UserLogin.mobilenoValidation(mobileno);

	}
	
	/**
	 * pass a invaild user name and mobile no 
	 */

	@Test
	public void test7() {
		String name = "   ";
		String mobileno = "-9698612143";
		UserLogin.nameValidation(name);
		UserLogin.mobilenoValidation(mobileno);

	}
	
	/**
	 * add a username and mobile no in hashmap userlist 
	 * and display the current hashmap values
	 */
	
	@Test
	public void testAddUser() {
		String name = "mohamed";
		String mobileno = "9698612143";
		boolean isValid = UserLogin.addUser(name,mobileno);
		assertTrue(isValid);
		UserLogin.displayuserLists();
	}
	
	/**
	 * delete a username and mobile no in hashmap userlist 
	 *  and display the current hashmap values
	 */
	@Test
	public void TestDeleteUserList(){
		String name = "fazil";
		String mobileno="9080393585";
		UserLogin.addUser(name, mobileno);
		String name1 = "tamim";
		String mobileno1="9080393580";
		UserLogin.addUser(name1, mobileno1);
		UserLogin.displayuserLists();
		boolean  isDeleted =UserLogin.deleteuserLists("fazil","9080393585");
		UserLogin.deleteuserLists(name, mobileno);
		UserLogin.displayuserLists();
		assertTrue(isDeleted);
	}
	
	
}
