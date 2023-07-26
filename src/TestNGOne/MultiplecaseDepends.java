package TestNGOne;

import org.testng.annotations.Test;

public class MultiplecaseDepends {
	@Test
	public void user()
	{
		System.out.println("This is user case..");
	}
	@Test(dependsOnMethods = "user")
	public void software()
	{
		System.out.println("The software case is depends on user");
	}
	@Test(dependsOnMethods = {"user","software"})
	public void developer()
	{
		System.out.println("The developer case are depends on user and software");
	}
	@Test(dependsOnMethods = {"user","software","developer"})
	public void tester()
	{
		System.out.println("The tester case are depends on user and software and developer..");
	}

}
