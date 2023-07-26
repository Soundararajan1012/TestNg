package TestNGTwo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertdependon {
	@Test
	public void company()
	{
		System.out.println("This is company..");
	}
	@Test(dependsOnMethods = "company")
	public void CEO()
	{
		System.out.println("This is CEO.");
		Assert.fail();
	}
	@Test(dependsOnMethods = "CEO",alwaysRun = true)
	public void manager()
	{
		System.out.println("This is manager..");
	}
	@Test(dependsOnMethods = "manager")
	public void employee()
	{
		System.out.println("This is employee..");
	}

}
