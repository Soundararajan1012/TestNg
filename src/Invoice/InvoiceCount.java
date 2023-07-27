package Invoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvoiceCount {
	WebDriver driver;
	@Test(invocationCount = 4,threadPoolSize = 2,invocationTimeOut = 40000,timeOut  = 35000)
	void homepage() throws InterruptedException
	{ 
	   System.setProperty("webdriver.chrome.driver","D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("rajan123@gmail.com");
//		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("rajan123@");
//		driver.findElement(By.xpath("//div[text()='Log in']")).click();
//		driver.close();
	}
	
}
//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
//Rajan1012@