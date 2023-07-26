package Groups;

import org.testng.annotations.DataProvider;

public class SampleDataProvider1 {
	@DataProvider(name="LoginData")
	public Object[][] loginDataProvider()
	{
		Object[][] dataValue= {{"rajan@gmail.com","rajan123@"},{"sri@gmail.com","sri321@"},{"surya@gmail.com","surya768@"}};
		return dataValue;
	}

}
