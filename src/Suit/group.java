package Suit;

import org.testng.annotations.Test;

public class group {
	@Test(groups = {"smoke"})
	public void register()
	{
		System.out.println("This is register");
	}
	@Test(groups = {"sanity"})
	public void login()
	{
		System.out.println("This is login");
	}
	@Test(groups = {"regression"})
	public void personaldetails()
	{
		System.out.println("This is personal details");
	}
	@Test(groups = {"sanity"})
	public void logout()
	{
		System.out.println("This is logout");
	}
	

}
