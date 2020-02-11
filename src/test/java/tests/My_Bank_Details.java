package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	public class My_Bank_Details extends HomePageBaseClass {
		  
		
		@Test
		public void mybankdetai() {
			//my bank account details
			WebElement menuebuton = driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Open' and @index='0']");
			 menuebuton.click();
			 WebElement mybankdetails = driver.findElementByXPath("//android.widget.CheckedTextView[@text='My Bank Details' and @index='0']");
			 mybankdetails.click();
		     WebElement add_account = driver.findElementById("in.rebase.app:id/positive_button");
		     add_account.click();
		     WebElement bankaccountnumber = driver.findElementByXPath("//android.widget.TextView[@text='Bank Account Number' and @index='2']");
		     bankaccountnumber.click();
		     WebElement enter_account_num = driver.findElementById("in.rebase.app:id/bank_account_number");
		     enter_account_num.click();
		     enter_account_num.sendKeys("987654321345765");
		     WebElement reenterbankaccountnumber = driver.findElementByXPath("//android.widget.TextView[@text='Re-enter Bank Account Number' and @index='2']");
		     reenterbankaccountnumber.click();
		     WebElement reenter_account_num = driver.findElementById("in.rebase.app:id/re_bank_account_number");
		     reenter_account_num.click();
		     reenter_account_num.sendKeys("987654321345765");
		     WebElement noifsc = driver.findElementByXPath("//android.widget.RadioButton[@text='No' and @index='1']");
		     noifsc.click();
		     WebElement yesifsc = driver.findElementByXPath("//android.widget.RadioButton[@text='Yes' and @index='0']");
		     yesifsc.click();
		     WebElement enterifsc = driver.findElementByXPath("//android.widget.TextView[@text='IFSC Code' and @index='2']");
		     enterifsc.click();
		     WebElement enter_ifsc = driver.findElementById("in.rebase.app:id/ifsc_code");
		     enter_ifsc.click();
		     enter_ifsc.sendKeys("YESB0CMSNOC");
		     WebElement bank_conti = driver.findElementById("in.rebase.app:id/primary_action_text");
		     bank_conti.click();
			
		}

	     
		    
	}
		     
	

