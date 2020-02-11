package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	public class Mobile_Number_Verification extends BaseClass {
		
		@Test
		public void MobileNumVerification() {
			System.out.println("i am inside the mobile number verification");
			 WebElement M_number_very_button= driver.findElementByXPath("//android.widget.Button[@text='VERIFY' and @index='0']");
			 M_number_very_button.click();
			 WebElement change_number= driver.findElementById("in.rebase.app:id/change_number");
			 change_number.click();
//			 WebElement resend_otp= driver.findElementById("in.rebase.app:id/resend_code");			 
			 WebElement change_number_enter= driver.findElementById("in.rebase.app:id/phone_number_to_be_changed");
			 change_number_enter.click();
			 change_number_enter.clear();
			 change_number_enter.sendKeys("8073420765");
			 WebElement save_number= driver.findElementById("in.rebase.app:id/save");
			 save_number.click();
//			 WebElement cancle_number= driver.findElementById("in.rebase.app:id/cancel");
			 WebElement enterotp1= driver.findElementsByClassName("android.widget.EditText").get(0);
			 enterotp1.click();
			 enterotp1.sendKeys("1");
			 WebElement enterotp2= driver.findElementsByClassName("android.widget.EditText").get(1);
			 enterotp2.click();
			 enterotp2.sendKeys("2");
			 WebElement enterotp3= driver.findElementsByClassName("android.widget.EditText").get(2);
			 enterotp3.click();
			 enterotp3.sendKeys("3");
			 WebElement enterotp4= driver.findElementsByClassName("android.widget.EditText").get(3);
			 enterotp4.click();
			 enterotp4.sendKeys("4");
			 WebElement enterotp5= driver.findElementsByClassName("android.widget.EditText").get(4);
			 enterotp5.click();
			 enterotp5.sendKeys("5");
			 WebElement verify_buton= driver.findElementById("in.rebase.app:id/primary_action_text");
			 verify_buton.click();
			 //mobile number verification to home page by reverse button
		     WebElement reverse_buton= driver.findElementsByClassName("android.widget.ImageButton").get(0);
		     reverse_buton.click();
		}
		
		
	}
		
