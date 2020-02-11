package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	public class Language_setting extends HomePageBaseClass {
		
		
		 	
		 @Test
	     public void helpandsupport() {
			 
			 WebElement menuebuton = driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Open' and @index='0']");
			 menuebuton.click();
			 WebElement helpandsupport = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Language Settings' and @index='0']");
			 helpandsupport.click();
			//language select button
				WebElement radiobuttonup= driver.findElementById("in.rebase.app:id/radio_group");
				radiobuttonup.click();
				WebElement telgu1= driver.findElements(By.className("android.widget.RadioButton")).get(2);
				telgu1.click();
				WebElement hindi1= driver.findElements(By.className("android.widget.RadioButton")).get(1);
				hindi1.click();
				WebElement english1= driver.findElements(By.className("android.widget.RadioButton")).get(0);
				english1.click();
				//clicked continue button
		        WebElement cont1 = driver.findElementById("in.rebase.app:id/primary_action_text");
		        cont1.click();
			
	     }
	     
		    

}
