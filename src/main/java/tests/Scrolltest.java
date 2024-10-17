package tests;

import java.net.MalformedURLException;


import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;


import pages.Scrollpages;

public class Scrolltest extends Basetest{
	  
		 public Scrollpages sp;

		WebDriver driver;
	
		
		@Test
		public void searchTestTC02() throws MalformedURLException, InterruptedException {
			
			WebDriver driver = getDriver("android");
			
	 sp=new Scrollpages(driver);
sp.scrollelement(driver);

	
	}


			
			
		}

