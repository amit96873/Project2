
package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	public class Call extends HomePageBaseClass {
		
		 	
		  @Test
			public void call() {
			
			//help and support
			WebElement contactusbutton = driver.findElementByXPath("//android.widget.TextView[@text='Contact Us' and @index='1']");
			contactusbutton.click();
		    //call
		    WebElement call_us = driver.findElementById("in.rebase.app:id/support_number");
		    call_us.click();
		    WebElement call_us_buton = driver.findElementById("com.google.android.dialer:id/dialpad_floating_action_button");
		    call_us_buton.click();
		    }
		
		     
	}
		     
    


