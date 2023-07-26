package TestNGTwo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionSample {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	@Test(priority=1)
	public void findLogo()
	{
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		//Assert.assertTrue(logo.isDisplayed());
		Assert.assertFalse(logo.isDisplayed(), "logo not displayed");
	}
	@Test(priority=0)
	public void findPageTitle()
	{
		//Assert.assertEquals("Facebook - log in or sign up", "Facebook - log in or sign up","The title is matched");
		Assert.assertEquals("s","Facebook", "The title is not matched");
	}
	@Test(priority=2)
	void homePageLogin()
	{
		driver.findElement(By.id("email")).sendKeys("rajan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("rajan123@");
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}


}
