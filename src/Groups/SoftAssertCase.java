package Groups;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertCase {
	SoftAssert softAssert=new SoftAssert();
	@Test
	public void testcasetwo()
	{
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello","First soft assert failed - testCasetwo");
		System.out.println("soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCaseTwo");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed - testCasetwo");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll();
		
	}
	@Test
	public void testcasethree()
	{
		System.out.println("*** test case three started ***");
		softAssert.assertEquals("Hello", "Hello","First soft assert failed - testCasetwo");
		System.out.println("soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCaseTwo");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed - testCasetwo");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll();
		
	}

}
