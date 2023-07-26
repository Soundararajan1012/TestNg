package parallelTesting;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestTwo {
	WebDriver driver;
	@Test
	void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("rajan123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("rajan123@");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
	@AfterMethod
	void close()
	{
		driver.quit();
	}

}
