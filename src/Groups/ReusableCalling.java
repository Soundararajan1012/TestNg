package Groups;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ReusableCalling extends ReusableMethod {
  WebDriver driver;
	@Test
	public  void result()
	{
		getDriver();
		loadUrl("https://www.facebook.com/");
        implicitwait(20);  
		
	}
	

}
