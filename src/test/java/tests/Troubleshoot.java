package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Troubleshoot extends HomePageBaseClass {
	
	@Test
	public void troubleshoot1() {
		WebElement menu_buttonbank = driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open\"]");
	     menu_buttonbank.click();
	     WebElement troubleshoot = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Troubleshoot' and @index='0']");
	     troubleshoot.click();
	     
	     WebElement  troubleshoot_button= driver.findElementById("in.rebase.app:id/primary_action_text");
	     troubleshoot_button.click();
	}
}
