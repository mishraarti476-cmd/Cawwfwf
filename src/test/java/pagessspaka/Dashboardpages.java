package pagessspaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboardpages {

	
		
		WebDriver driver;
		
		 public By dashboard= By.xpath("//h6[text()='Dashboard']");

		

		  
		  
		  
		  public  Dashboardpages(WebDriver driver) {
			  this.driver=driver;
		  }
		
	}

