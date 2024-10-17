package pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Scrollpages extends Basepage{

	public Scrollpages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void scrollelement(WebDriver driver) throws InterruptedException {
	 for(int i=0;i<4;i++) {
			PointerInput f2=new PointerInput(Kind.TOUCH,"f2");
			Sequence scroll=new Sequence(f2,0);
			scroll.addAction(f2.createPointerMove(Duration.ofSeconds(0),Origin.viewport(),750, 1730));
			scroll.addAction(f2.createPointerDown(0));
			scroll.addAction(f2.createPointerMove(Duration.ofMillis(500),Origin.viewport(),750, 700));
			scroll.addAction(f2.createPointerUp(0));
			Thread.sleep(2000);
			((RemoteWebDriver) driver).perform(Arrays.asList(scroll));
			}



	}

}







   



 
	        
	


