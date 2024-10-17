package Mobiletestingproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import jdk.internal.org.jline.utils.Log;

public class Newmobile {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	URL u=new URL("http://127.0.0.1:4723");
	
	UiAutomator2Options uia=new UiAutomator2Options();
	uia.setAppPackage("com.solodroid.solomerce");
	uia.setAppActivity(".activities.MainActivity");
	uia.setPlatformName("android");
	uia.setDeviceName("RZ8RA1FD6RH");
	uia.setPlatformVersion("13");
	uia.setAutomationName("Uiautomator2");


	AndroidDriver driver=new AndroidDriver(u,uia);
	
	System.out.println("App launched");
	Thread.sleep(2000);

	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	//wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.solodroid.solomerce:id/category_image'])[1]"))).click();
	WebElement element=driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.solodroid.solomerce:id/category_image\"])[1]"));
	element.click();	
	WebElement element1=driver.findElement(AppiumBy.id("com.solodroid.solomerce:id/product_image"));
	element1.click();
//PointerInput f5=new PointerInput(Kind.TOUCH,"f5");
//Sequence swipe=new Sequence(f5,0);
//swipe.addAction(f5.createPointerMove(Duration.ofSeconds(0),Origin.viewport(),840, 1420));
//swipe.addAction(f5.createPointerDown(0));
//swipe.addAction(f5.createPointerMove(Duration.ofMillis(500),Origin.viewport(),840, 700));
//swipe.addAction(f5.createPointerUp(0));
//driver.perform(Arrays.asList(swipe));
//	Thread.sleep(2000);
//
//for(int i=0;i<4;i++) {
//PointerInput f2=new PointerInput(Kind.TOUCH,"f2");
//Sequence scroll=new Sequence(f2,0);
//scroll.addAction(f2.createPointerMove(Duration.ofSeconds(0),Origin.viewport(),750, 1730));
//scroll.addAction(f2.createPointerDown(0));
//scroll.addAction(f2.createPointerMove(Duration.ofMillis(500),Origin.viewport(),750, 700));
//scroll.addAction(f2.createPointerUp(0));
//driver.perform(Arrays.asList(scroll));
//}

	
	
	

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
driver.perform(Arrays.asList(act1, act2));

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
driver.perform(Arrays.asList(act3, act4));
////	
////	AppiumBy.id("com.solodroid.solomerce:id/product_image"))
//
//WebElement productImage = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.solodroid.solomerce:id/product_image\")"));
//productImage.click();
//
//String loc = "new UiScrollable(new UiSelector()"
//+ ".resourceId(\"scrollable container\")).scrollTextIntoView(\"Portable bottle heater\")";
//
//driver.findElement(AppiumBy.androidUIAutomator(loc)).click();
	
	
	//click Add to cart 
//	driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.solodroid.solomerce:id/btn_add_cart\"]")).click();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}


