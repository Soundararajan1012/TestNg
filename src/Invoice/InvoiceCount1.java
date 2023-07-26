package Invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvoiceCount1 {
	WebDriver driver;
	
	@Test(invocationCount = 4, invocationTimeOut = 50000,timeOut = 120000)
	void homepage() throws InterruptedException
	{ 
	   System.setProperty("webdriver.chrome.driver","D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("rajan123@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("rajan123@");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		driver.close();
	}
//	@Test(priority=1)
//	void Login()
//	{
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("rajan123@gmail.com");
//		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("rajan123@");
//		driver.findElement(By.xpath("//div[text()='Log in']")).click();
//	}
//	@Test
//	void result()
//	{
//		driver.close();
//	}

}
