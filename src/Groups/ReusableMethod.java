package Groups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethod {
	public static  WebDriver driver; //global variable
	//webdriver
	public  static WebDriver getDriver() {
		
		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\TestNG\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
		return driver;
		
	}
	//URL
	public static void  loadUrl(String url) {
		
	driver.get(url);	
	}
	//SendKey
	public static void sendInput(WebElement element,String Input)
	{
		element.sendKeys(Input);
	}
	//Button Click
	public static void buttonclick(WebElement element)
	{
		element.click();
	}
	//dropdown
	//selectbyIndex
	public static void SelectIndex(WebElement web,int i)
	{
		Select s=new Select(web);
		s.selectByIndex(i);
	}
	//selectbyVisibleText
	public static void Selectvisibletext(WebElement web,String text)
	{
		Select s=new Select(web);
		s.selectByVisibleText(text);
	}
	//selectByValue
	public static void Selectvalue(WebElement web,String value)
	{
		Select s=new Select(web);
		s.selectByValue(value);
	}
//alert method
	//alert accept
	public static void accept()
	{
		Alert obj=driver.switchTo().alert();
		obj.accept();
	}
	//alert dismiss
	public static void dismiss()
	{
		Alert obj=driver.switchTo().alert();
		obj.dismiss();
	}
	//alert sendvalues
	public static void alertsend(String s)
	{
		Alert obj=driver.switchTo().alert();
		obj.sendKeys(s);
	}
	//window commands
	//Window Maximize
	public static void max()
	{
		driver.manage().window().maximize();
	}
	//Window Close
	public static void close()
	{
		driver.close();
	}
	//Window Quit
	public static void quit()
	{
		driver.quit();
	}
	//Full Screen
	public static void fullscr()
	{
		driver.manage().window().fullscreen();
	}
	//screenshot
	public static void screenshot(String s) throws IOException
	{
		TakesScreenshot obj=(TakesScreenshot) driver;
		String timestamp=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		File src=obj.getScreenshotAs(OutputType.FILE);
		File des=new File(s+timestamp+".png");
		org.openqa.selenium.io.FileHandler.copy(src, des);
	}
	//implicitwait
	public static void implicitwait(int time) 
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	//explicitwait
	//i)alertIsPresent()
	public static void explicitalertIsPresent(int time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	//ii)elementSelectionStateToBe()
	public static void explicitwaitelementSelectionStateToBe(int time, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementSelectionStateToBe(element, false));
	}
	//iii)elementToBeClickable()
	public static void explicitwaitelementToBeClickable(int time, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	//iv)elementToBeSelected()
	public static void explicitwaitelementToBeSelected(int time, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	//v)frameToBeAvaliableAndSwitchToIt()
	public static void explicitwaitframeToBeAvaliableAndSwitchToIt(int time, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		//or
//		int frame;
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
//		//or
//		String frame1;
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
	}
	//vi)invisibilityOfTheElementLocated()
	public static void explicitwaitinvisibilityOfTheElementLocated(int time, String xpath)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	}
	//vii)invisibilityOfElementWithText()
	public static void explicitwaitinvisibilityOfElementWithText(int time, String locator,String Text)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(locator), Text));
	}
	//viii)presenceOfAllElementsLocatedBy()
	public static void explicitwaitpresenceOfAllElementsLocatedBy(int time, String xpath)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
	}
	//ix)presenceOfElementLocated()
	public static void explicitwaitpresenceOfElementLocated(int time, String xpath)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
	//x)textToBePresentInElement()
	public static void explicitwaittextToBePresentInElement(int time, WebElement element, String Text)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.textToBePresentInElement(element, Text));
	}
	//xi)textToBePresentInElementLocated()
	public static void textToBePresentInElementLocated(int time, String locator,String Text)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(locator), Text));
	}
	//xii)textToBePresentInElementValue()
	public static void explicitwaittextToBePresentInElementValue(int time, WebElement element, String Text)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, Text));
	}
	//xiii)titleIs()
	public static void explicitwaittitleIs(int time, String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.titleIs(title));
	}
	//xiv)titleContains()
	public static void explicitwaittitleContains(int time,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.titleContains(title));
	}
	//xv)visibilityOf()
	public static void explicitwaitvisibilityOf(int time, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//xvi)visibilityOfAllElements()
	public static void explicitwaitvisibilityOfAllElements(int time, List<WebElement> elements)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	//xvii)visibilityOfAllElementsLocatedBy()
	public static void explicitwaitvisibilityOfAllElementsLocatedBy(int time, String xpath)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
	}
	//viii)visibilityOfElementLocated()
	public static void explicitwaitvisibilityOfElementLocated(int time, String xpath)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	//fluent wait
	public static void fluentwait(int time,WebElement sample)
	{
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(time))
				.pollingEvery(Duration.ofSeconds(time))
				.ignoring(NoSuchElementException.class);
		
		
	}
	//Actions
	//i)click[webelement]
	public static void click(WebElement web)
	{
		Actions a=new Actions(driver);
		a.click(web).build().perform();
	}
	//ii)doubleclick
	public static void doubleclick(WebElement web)
	{
		Actions a=new Actions(driver);
		a.doubleClick(web).build().perform();
	}
	//iii)contextclick
	public static void contextclick(WebElement web)
	{
		Actions a=new Actions(driver);
		a.contextClick(web).build().perform();
	}
	//iv)clickandHold
	public static void clickandhold(WebElement web)
	{
		Actions a=new Actions(driver);
		a.clickAndHold(web).build().perform();
	}
	//v)moveToElement
	public static void movetoelement(WebElement web)
	{
		Actions a=new Actions(driver);
		a.moveToElement(web).build().perform();
	}
	//vi)Release
	public static void release(WebElement web)
	{
		Actions a=new Actions(driver);
		a.release(web).build().perform();
	}
	//vii)draganddrop
	public static void draganddrop(WebElement web1,WebElement web2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(web1, web2).build().perform();
	}
	//Robot
	//i)keydown
	public static void keydown() throws AWTException
	{
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
	}
	//ii)keyenter
	public static void keyenter() throws AWTException
	{
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
	}
	//iFrame
	//i)Index based
	public static void iframeindex(int s)
	{
		driver.switchTo().frame(s);
	}
	//ii)Name or Id
	public static void iframeIdorName(String s)
	{
		driver.switchTo().frame(s);
	}
	//iii)WebElement
	public static void iframewebelement(WebElement s)
	{
		driver.switchTo().frame(s);
	}
	//iv)Switch Back to Main Frame
	public static void iframeMainFrame()
	{
		driver.switchTo().parentFrame();
		//or
		driver.switchTo().defaultContent();
	}
	//Window Handling
	public static void windowhandles(int s)
	{
		Set<String> a=driver.getWindowHandles();
		List<String> b=new ArrayList<String>(a);
		driver.switchTo().window(b.get(s));
	}
	//webTable
//	public static void table()
//	{
//		List<WebElement> row=
//	}
	//window handle
	public static void windowhandle()
	{
		String window=driver.getWindowHandle();
		System.out.println(window);
		
	}
	public static void windowhandles() {
		String window=driver.getWindowHandle();
		System.out.println(window);
		Set<String>first=driver.getWindowHandles();
		for(String f:first) {
			System.out.println(f);
			if(!window.equals(window)) {
				driver.switchTo().window(f);
			}
		}
	}


	
}