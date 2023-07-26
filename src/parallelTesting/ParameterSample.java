package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterSample 
{
	WebDriver driver;
  
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String webbrowser,String webapp)
	{
		if(webbrowser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
			driver = new ChromeDriver(co);
		}
		else if(webbrowser.equalsIgnoreCase("gecko"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\TestNG\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}
		
		
		driver.manage().window().maximize();
		driver.get(webapp);
	}
	
	@Test(priority = 1)
	void findLogo()
	{
		WebElement logo= driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Assert.assertTrue(logo.isDisplayed(),"logo displayed");
		//Assert.assertFalse(logo.isDisplayed(),"logo not displayed");
	}
	
	@Test(priority = 0)
	void findPageTitle()
	{
		String s=driver.getTitle();
		Assert.assertEquals( s,"Facebook – log in or sign up","The title is matched");
	//	Assert.assertEquals( s,"Facebook","The title is not matched");
	}
	
	@Test(priority = 2)
	void homePageLogin()
	{
		driver.findElement(By.id("email")).sendKeys("sibi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sibi@gmail.com");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
