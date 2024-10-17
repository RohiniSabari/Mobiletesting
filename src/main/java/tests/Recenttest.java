package tests;



import java.net.MalformedURLException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import pages.Recentpages;






public class Recenttest extends Basetest{
	

	  

	   
	
	 public Recentpages rp;

	 WebDriver driver;
	 
	 
	 
	 
	
	    
	
	
	
	@Test
	public void searchTestTC01() throws MalformedURLException {
		
		WebDriver driver = getDriver("android");
		
 rp=new Recentpages(driver);
 
rp.clickElement(driver);


		
		
	}
	   

}



























