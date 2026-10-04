package selenum12;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataprovider123e {
	
	@DataProvider(name="logindata")
	public Object[][] getdata() throws IOException {
		
		return exclassfatch12.getexceldata();
		
	}

}
