package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestingMethods {
	WebDriver driver;
	@BeforeMethod
	void logo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//i[@data-visualcompletion='css-img']"));
		Assert.assertTrue(logo.isDisplayed());
	}
	@Test
	void homePageTitle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Instagram");
	}
	@AfterMethod
	void close()
	{
		driver.quit();
	}

}
