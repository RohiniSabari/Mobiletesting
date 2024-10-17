package tests;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import pages.Recentpages;

public class Basetest {
	  
	WebDriver driver;
	AppiumDriverLocalService service;
	
	
	
	
  
  
	  @BeforeSuite()
	  public void start() throws MalformedURLException {
		 // service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib")).withIPAddress("127.0.0.1").usingPort(4723).build();
		  service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				    .usingPort(4723));
				   
	        service.start();
	        driver = getDriver("Android");
			Recentpages rp = new Recentpages(driver);
			 
	  }
	  @AfterSuite()
	 
	    public void teardown() {
	      
	            service.stop();
	    
	  }
		
	
	
	  
	  
	  
	  
	  
	public WebDriver getDriver(String platformName) throws MalformedURLException {
	WebDriver driver = null;
		
		
		String platform = platformName.toLowerCase();
		
		
		
		
		
		
		URL u=new URL("http://127.0.0.1:4723");
		
		UiAutomator2Options uia=new UiAutomator2Options();
		uia.setAppPackage("com.solodroid.solomerce");
		uia.setAppActivity(".activities.MainActivity");
		uia.setPlatformName("android");
		uia.setDeviceName("RZ8RA1FD6RH");
		uia.setPlatformVersion("13");
		uia.setAutomationName("Uiautomator2");


		
		
		
		
		if(platform.equals("android")) {
	
			driver = new AndroidDriver(u, uia);
			System.out.println("App launched");
		} else if(platform.equals("ios")) {
			XCUITestOptions ios = new XCUITestOptions();
			ios.setPlatformName("ios");
			ios.setCapability("appPackage", "com.solodroid.solomerce");
			ios.setCapability("appActivity","com.solodroid.solomerce.activities.MainActivity");
			ios.setUdid("");
			ios.setDeviceName("ios 13");
			driver = new IOSDriver(ios);
		}
		return driver;
	}

}


