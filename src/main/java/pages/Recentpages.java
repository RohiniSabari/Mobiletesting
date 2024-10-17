package pages;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Recentpages extends Basepage{
	
public Recentpages(WebDriver driver) {
			super(driver);
				//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			}
		@iOSXCUITFindBy(accessibility = "element1")
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.solodroid.solomerce:id/category_image'])[1]")
	

	
	
	public WebElement element;
		@iOSXCUITFindBy(accessibility = "element2")
		@AndroidFindBy(id="com.solodroid.solomerce:id/product_image")
		public WebElement element2;
	public void clickElement(WebDriver driver) {
    
      

        if (element != null) {
            this.element.click();
            this.element2.click();
        } else {
            System.out.println("Element is not initialized.");
        }
    }



	
     
		        
		
	}

