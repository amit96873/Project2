package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

   
	public class Sendmail extends HomePageBaseClass {
		
		
		@Test
		public void sendmail() {
			WebElement contactusbutton = driver.findElementByXPath("//android.widget.TextView[@text='Contact Us' and @index='1']");
			 contactusbutton.click();
			//email support
		     WebElement email_support = driver.findElementById("in.rebase.app:id/support_email");
		     email_support.click();
		     WebElement email_sub = driver.findElementById("com.google.android.gm:id/subject");
		     email_sub.click();
		     email_sub.clear();
		     email_sub.sendKeys("concern");
			WebElement write_email = driver.findElementByXPath("//android.widget.EditText[@text='Compose email' and @index='0']");
		     write_email.click();
		     write_email.clear();
		     write_email.sendKeys("hi");
		     WebElement send = driver.findElementById("com.google.android.gm:id/send");
		     send.click();
		     System.out.println("mail has been send succesfully");
		     
		     
		}
		
		
	
		}
	


