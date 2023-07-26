package TestNGOne;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
	@Test
	public void users()
	{
		System.out.println("This is users method....");
	}
	@Test(dependsOnMethods = "users")
	public void software()
	{
		
		System.out.println("This is software method....");
		Assert.fail();
		
	}
	@Test(dependsOnMethods = "software",alwaysRun = true)
	public void developer()
	{
		System.out.println("This is developer method....");
	}
	@Test(dependsOnMethods = "developer")
	public void tester()
	{
		System.out.println("This is tester method....");
	}

}
