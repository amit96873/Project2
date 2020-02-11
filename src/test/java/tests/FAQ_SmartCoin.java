package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FAQ_SmartCoin  extends HomePageBaseClass{
	
	@Test
	public void FAQ() {
		
		
	     WebElement menu_buttonbank = driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open\"]");
	     menu_buttonbank.click();
	     WebElement fq = driver.findElementByXPath("//android.widget.CheckedTextView[@text='FAQ' and @index='0']");
	     fq.click();
	     
	  
	}

}
 