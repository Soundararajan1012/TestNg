package TestNGOne;

import org.testng.annotations.Test;

public class DayTwo {
	@Test(priority=1)
	public void login()
	{
		System.out.println("This is login method...");
	}
	@Test(priority=0)
	public void setup()
	{
		System.out.println("This is setup method...");
	}
	@Test(priority=2)
	public void logout()
	{
		System.out.println("This is logout method...");
	}

}
