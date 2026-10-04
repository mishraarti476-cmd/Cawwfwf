package utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;



public class dataproviderclass1 {

	
		
		@DataProvider(name="logindata")
		
		public Object[][] getdata() throws IOException {
			
			return excelfatchclass.getexceldata();
			
		}
	}

