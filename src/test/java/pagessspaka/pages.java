package pagessspaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pages {

	
		
		WebDriver driver;
		
		By username= By.xpath("//input[@name='username']");
		By password=By.xpath("//input[@name='password']");
		By login=By.xpath("//button[text()=' Login ']");
		public By invalid = By.xpath("//p[text()='Invalid credentials']");

		
		
		//constructer
		public pages (WebDriver driver) {
			this.driver=driver;
			
		}
		
		//action
		public void enterusername(String username1) {
			driver.findElement(username).sendKeys(username1);
	
	}
		
		public void enterpassword(String password1) {
			driver.findElement(password).sendKeys(password1);
		}
		
		public void clicklogin() {
			driver.findElement(login).click();
		}
}


