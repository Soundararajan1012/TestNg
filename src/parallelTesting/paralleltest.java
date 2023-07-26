package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class paralleltest {
	WebDriver driver;
	@Test
	void logo()
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-or-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver(co);
		driver.get("https://www.orangehrm.com/");
		WebElement logo=driver.findElement(By.xpath("//img[@src='/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']"));
		Assert.assertTrue(logo.isDisplayed());
	}
	@Test
	void homepageTitle()
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-or-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver(co);
		driver.get("https://www.orangehrm.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM");
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
	

}
