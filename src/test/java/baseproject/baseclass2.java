package baseproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass2 {

	
	protected	WebDriver driver;
		
		@BeforeMethod
		  public void setup() {
		            driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					
			
			}
				
				
				
		@AfterMethod		

		public void teardown() {
			if(driver!=null) {
				driver.quit();
			}
			}
			
			
	}


