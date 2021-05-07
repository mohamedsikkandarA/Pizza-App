package in.pizzadeliveryapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAdminLogin {
	
	/**
	 * pass a vaild user name and mobile no 
	 */
	@Test
	public void test() {
		String name = "admim";
		String mobileno = "9698612143";
		AdminLogin.nameValidation(name);
		AdminLogin.mobilenoValidation(mobileno);
		AdminLogin.addAdmin(name, mobileno);
		
	}
	/**
	 * pass a invaild user name and mobile no 
	 */


	@Test
	public void test1() {
		String name = "8";
		String mobileno = "969861214";
		AdminLogin.nameValidation(name);
		AdminLogin.mobilenoValidation(mobileno);
	}

	/**
	 * pass a invaild user name and mobile no 
	 */
	@Test
	public void test2() {
		String name = "8";
		String mobileno = "969861";
		AdminLogin.nameValidation(name);
		AdminLogin.mobilenoValidation(mobileno);
	}
	/**
	 * pass a invaild user name and mobile no 
	 */

	@Test
	public void test4() {
		String name = "2Priyam";
		String mobileno = "9698612143";
		AdminLogin.nameValidation(name);
		AdminLogin.mobilenoValidation(mobileno);

	}
	/**
	 * pass a invaild user name and mobile no 
	 */

	@Test
	public void test5() {
		String name = "Anjelina@007";
		String mobileno = "9698612143";
		AdminLogin.nameValidation(name);
		AdminLogin.mobilenoValidation(mobileno);

	}
	/**
	 * pass a invaild user name and mobile no 
	 */

	@Test
	public void test6() {
		String name = "_James007";
		String mobileno = "9698612143";
		AdminLogin.nameValidation(name);
		AdminLogin.mobilenoValidation(mobileno);

	}
	/**
	 * pass a invaild user name and mobile no 
	 */

	@Test
	public void test7() {
		String name = "   ";
		String mobileno = "-9698612143";
		AdminLogin.nameValidation(name);
		AdminLogin.mobilenoValidation(mobileno);

	}
	
	@Test
	public void testAddAdmin() {
		String name = "mohamed";
		String mobileno = "9698612143";
		boolean isValid = AdminLogin.addAdmin(name,mobileno);
		assertTrue(isValid);
		AdminLogin.displayAdminList();
	}
}
