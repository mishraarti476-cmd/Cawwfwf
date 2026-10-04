package selenum12;




import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class testpage123 {
	
	
	WebDriver driver;
	@BeforeMethod
void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	
}


	@Test(priority=2, dataProvider ="logindata", dataProviderClass=dataprovider123e.class )
	void invalidlogin(String username, String password) throws InterruptedException {
		loginpage23 pp = new loginpage23 (driver);
		
		pp.setusername(username);
		pp.setpassword(password);
		pp.button();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	void validenterlogin() throws InterruptedException {
		loginpage23 pp = new loginpage23 (driver);
		pp.setpassword("Admin");
		pp.setpassword("admin123");
		pp.button();
		Thread.sleep(1000);
	}
	
	
	@AfterMethod
	void closedriver() {
		driver.quit();
	}


}