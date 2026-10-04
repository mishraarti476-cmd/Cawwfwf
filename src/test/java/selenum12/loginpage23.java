package selenum12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage23 {

	WebDriver driver;
	
	loginpage23(WebDriver driver){
		this.driver=driver;
		
	}
	
	By user=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
	By login=By.xpath("//button[text()=' Login ']");
		
		
	public void setusername(String username) {
		driver.findElement(user).sendKeys(username);
	}
	public void setpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void button() {
		driver.findElement(login).click();
	}
	}
	

