package Groups;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SampleDataProvider{
WebDriver driver;
@Test(dataProvider="LoginData",dataProviderClass = SampleDataProvider1.class)
public void login(String Username,String Password) {
	System.out.println("User value==>"+Username+""+Password);
}
//@DataProvider(name="LoginData")
//public Object[][] loginDataProvider()
//{
//	Object[][] dataValue= {{"rajan@gmail.com","rajan123@"},{"sri@gmail.com","sri321@"},{"surya@gmail.com","surya768@"}};
//	return dataValue;
//}
//
}
