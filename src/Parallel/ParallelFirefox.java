package Parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelFirefox {
	WebDriver driver;
	@Test
	void homepage() throws InterruptedException
	{ 
	   System.setProperty("webdriver.edge.driver","D:\\eclipse\\TestNG\\Driver\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("rajan123@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("rajan123@");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		//driver.close();
	}

}
