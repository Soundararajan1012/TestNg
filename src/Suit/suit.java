package Suit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suit {
	WebDriver driver;
	long Start;
	@BeforeSuite
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		Start=System.currentTimeMillis();
		driver=new ChromeDriver();
	}
	@Test
	public void opengoogle()
	{
		driver.get("https://www.google.com");
	}
	@Test
	public void openbing()
	{
		driver.get("https://www.bing.com");
	}
	@Test
	public void openyahoo()
	{
		driver.get("https://www.yahoo.com");
	}
	@AfterSuite
	public void result()
	{
		long End=System.currentTimeMillis();
		long totaltime= End - Start;
		System.out.println(totaltime);
	}


}
