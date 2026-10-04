package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseproject.baseclass2;
import pagessspaka.Dashboardpages;
import pagessspaka.pages;
import utility.dataproviderclass1;

public class testloginclass  extends baseclass2{

	
		@Test(priority=1)
		public void validlogintest() {
			pages pg = new pages(driver);
			
			pg.enterusername("Admin");
			pg.enterpassword("admin123");
			pg.clicklogin();
			
			Dashboardpages db = new Dashboardpages(driver);
			
			String result = driver.findElement(db.dashboard).getText();
			
			Assert.assertEquals(result, "Dashboard");
		}
			
		@Test(priority=2, dataProvider="logindata", dataProviderClass=dataproviderclass1.class )	
			public void invalidlogintest(String username, String password) throws InterruptedException {
				pages pg = new pages(driver);
				
				pg.enterusername(username);
				pg.enterpassword(password);
				pg.clicklogin();
				Thread.sleep(2000);
				
				
				
				String result = driver.findElement(pg.invalid).getText();
				
				Assert.assertEquals(result, "Invalid credentials");	
			
			
		}
	}


