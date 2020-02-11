package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	public class BankStatement extends BaseClass {
		
		@Test
		public void bankStatement()   {
			System.out.println("i am inside BankStatement test");
		    //bank statement
		    WebElement bankstatementbutton= driver.findElementByXPath("//android.widget.Button[@text='UPLOAD' and @index='0']");
		    bankstatementbutton.click();
		    WebElement spinner= driver.findElementById("in.rebase.app:id/spinner");
		    spinner.click();
		    WebElement selectBank= driver.findElementByXPath("//android.widget.Button[@text='ADARSH BANK' and @index='0']");
		    selectBank.click();
		    WebElement help= driver.findElementById("in.rebase.app:id/help_button");
		    help.click();
		    WebElement helpOk= driver.findElementById("in.rebase.app:id/negative_button");
		    helpOk.click();
		    WebElement pdfupload= driver.findElementById("in.rebase.app:id/desc");
		    pdfupload.click();
//		    WebElement allow= driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//		    WebElement deny= driver.findElementById("com.android.packageinstaller:id/permission_deny_button");
//		    WebElement pdf_password_yes = driver.findElementByXPath("//android.widget.RadioButton[@text='Yes' and @index='0']");
//		    pdf_password_yes.click();
		    WebElement pdf_password_no = driver.findElementByXPath("//android.widget.RadioButton[@text='No' and @index='1']");
		    pdf_password_no.click();
//	        WebElement ifccode= driver.findElementById("in.rebase.app:id/text_field_boxes_editTextLayout");
//	        ifccode.click();
//	        ifccode.sendKeys("151199556789");
	        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PAN Card - FRONT\").instance(0))").click();WebElement help2= driver.findElementById("in.rebase.app:id/help_button");
	        help2.click();
	        WebElement help2ok= driver.findElementById("in.rebase.app:id/negative_button");
	        help2ok.click();
	        WebElement panupload= driver.findElementById("in.rebase.app:id/desc");
	        panupload.click();
	        WebElement shootbutton= driver.findElementById("com.android.camera2:id/shutter_button");
	        shootbutton.click();
	        WebElement shootbuttondone= driver.findElementById("com.android.camera2:id/done_button");
	        shootbuttondone.click();WebElement unlock_lon_offer_continue_button= driver.findElementById("in.rebase.app:id/primary_action_text");
	        unlock_lon_offer_continue_button.click();
//	        bank statement o home page by reverse button
//	        WebElement reverse_buton= driver.findElementsByClassName("android.widget.ImageButton").get(0);
//	        reverse_buton.click();
	        
		}
		
	  
		
	}
		