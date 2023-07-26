package TestNGOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeSuite
	public void suiteCall()
	{
		System.out.println("Calling via suite....");
	}
	@BeforeTest
	public void firstTest()
	{
		System.out.println("This is my first test...");
	}
	@BeforeClass
	public void ClassCall()
	{
		System.out.println("First call via Class...");
	}
	@BeforeMethod
	public void url()
	{
		System.out.println("This is url start method...");
	}
	@Test
	public void login()
	{
		System.out.println("This is login method....");
	}
	@Test
	public void setup()
	{
		System.out.println("This is setup method...");
	}
	@Test
	public void register()
	{
		System.out.println("This is register method...");
	}
	@Test
	public void profile()
	{
		System.out.println("This is profile method...");
	}
	@Test
	public void logout()
	{
		System.out.println("This is logout method...");
	}
	@AfterMethod
	public void getOuturl()
	{
		System.out.println("This is url end method...");
	}
	@AfterClass
	public void classCalling()
	{
		System.out.println("Last call via class...");
	}
	@AfterTest
	public void lastTest()
	{
		System.out.println("This is my last test...");
	}
	@AfterSuite
	public void suiteCalling()
	{
		System.out.println("Last call via suite...");
	}

}
