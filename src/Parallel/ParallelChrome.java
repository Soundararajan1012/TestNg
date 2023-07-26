package Parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelChrome {
	WebDriver driver;
	@Test
	void homepage() throws InterruptedException
	{ 
	   System.setProperty("webdriver.chrome.driver","D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("rajan123@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("rajan123@");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		//driver.close();
	}

}
