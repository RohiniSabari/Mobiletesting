package pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumBy;

public class Zoominandoutpages extends Basepage{
	public Zoominandoutpages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void zoominoutelement(WebDriver driver) throws InterruptedException {
	
		PointerInput f2 = new PointerInput(Kind.TOUCH, "f2");
		Sequence act1 = new Sequence(f2, 0);
		act1.addAction(f2.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 750, 1400));
		act1.addAction(f2.createPointerDown(0));
		act1.addAction(f2.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 750, 700));
		act1.addAction(f2.createPointerUp(0));
		//driver.perform(Arrays.asList(sccroll));

		PointerInput f1 = new PointerInput(Kind.TOUCH, "f1");
		Sequence act2 = new Sequence(f1, 0);
		act2.addAction(f1.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 750, 1550));
		act2.addAction(f1.createPointerDown(0));
		act2.addAction(f1.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 750, 2500));
		act2.addAction(f1.createPointerUp(0));
		((RemoteWebDriver) driver).perform(Arrays.asList(act1, act2));

		Thread.sleep(2000);
			
		PointerInput f3 = new PointerInput(Kind.TOUCH, "f3");
		Sequence act3 = new Sequence(f3, 0);
		act3.addAction(f3.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 750, 700));
		act3.addAction(f3.createPointerDown(0));
		act3.addAction(f3.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 750, 1400));
		act3.addAction(f3.createPointerUp(0));
		//driver.perform(Arrays.asList(sccroll));

		PointerInput f4 = new PointerInput(Kind.TOUCH, "f4");
		Sequence act4 = new Sequence(f4, 0);
		act4.addAction(f4.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), 750, 2500));
		act4.addAction(f4.createPointerDown(0));
		act4.addAction(f4.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 750, 1550));
		act4.addAction(f4.createPointerUp(0));
		((RemoteWebDriver) driver).perform(Arrays.asList(act3, act4));


	}
}
