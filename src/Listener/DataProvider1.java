package Listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider1 {
	WebDriver driver;
	
	@Test(priority=1,dataProvider = "datas" )
	public void Users(String UserName,String Password)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("UserName:"+UserName+"\n Password:"+Password);
		driver.findElement(By.id("email")).sendKeys(UserName);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
        
	}
	
	@DataProvider
	public Object[][] datas(){
		Object[][] sample= {{"chinna@gmail.com","chinna@"},{"raja@gmail.com","raja123@"}};
		return sample;
		}
	}

