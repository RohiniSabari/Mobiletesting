package tests;

import java.net.MalformedURLException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import pages.Recentpages;
import pages.Zoominandoutpages;



public class Zoominouttest extends Basetest{
	 public Zoominandoutpages zp;

		WebDriver driver;
	Recentpages rp;
		
		@Test
		public void searchTestTC02() throws MalformedURLException, InterruptedException {
			
			WebDriver driver = getDriver("android");
			rp=new Recentpages(driver);
			rp.clickElement(driver);
	 zp=new Zoominandoutpages(driver);
zp.zoominoutelement(driver);
	
	}


			
			
		}


