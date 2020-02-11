
package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	public class EditPersionalDetails extends HomePageBaseClass{
		
		 @Test
	     public void editpersionaldetails() throws InterruptedException {
	    	 System.out.println("i am inside the edit persional details");
	    	 WebElement myprofile = driver.findElementByXPath("//android.widget.TextView[@text='My Profile' and @index='1']");
	    	 myprofile.click();
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"DESIGNATION\").instance(0))").click();
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CUSTOMER RELATIONSHIP NUMBER (CRN)\").instance(0))").click();
	    	 WebElement expend= driver.findElementById("in.rebase.app:id/fab_expand_menu_button");
	    	 expend.click();
	    	 WebElement editmyprofile = driver.findElementByXPath("//android.widget.TextView[@text='EDIT PERSONAL DETAILS' and @index='0']");
	    	 editmyprofile.click();
	    	 WebElement editname= driver.findElementById("in.rebase.app:id/name");
	    	 editname.click();
	    	 editname.clear();
	    	 editname.sendKeys("Ajit Singh");
	    	 WebElement editnumber= driver.findElementById("in.rebase.app:id/mobile_number");
	    	 editnumber.click();
	    	 editnumber.clear();
	    	 editnumber.sendKeys("8073420765");
	    	 WebElement dob= driver.findElementById("in.rebase.app:id/dob");
	    	 dob.click();
	    	
		     WebElement month = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText");
		     month.click();
		     System.out.println("clicked");
		     month.clear();
		     month.sendKeys("May");
		     
		     WebElement date = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText");
		     date.click();
		     System.out.println("clicked");
		     date.clear();
		     date.sendKeys("22");
		     
		     WebElement yesr = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText");
		     yesr.click();
		     System.out.println("clicked");
		     yesr.clear();
		     yesr.sendKeys("1991");
		     WebElement edit_DOB_select_ok = driver.findElementById("android:id/button1");
		     edit_DOB_select_ok.click();
	    	 WebElement transgender = driver.findElementByXPath("//android.widget.RadioButton[@text='Trans' and @index='2']");
	    	 transgender.click();
	    	 WebElement famale = driver.findElementByXPath("//android.widget.RadioButton[@text='Female' and @index='1']");
	    	 famale.click();
	    	 WebElement male = driver.findElementByXPath("//android.widget.RadioButton[@text='Male' and @index='0']");
	    	 male.click();
	    	 WebElement editaddress= driver.findElementById("in.rebase.app:id/residence_address");
	    	 editaddress.click();
	    	 editaddress.clear();
	    	 editaddress.sendKeys("Aswath nagar kala mandir bangalore 560037");	    	 
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Yes\").instance(0))").click();		    	 
	    	 WebElement pincode= driver.findElementById("in.rebase.app:id/residence_pincode");
	    	 pincode.click();
	    	 pincode.clear();
	    	 pincode.sendKeys("560037");
	    	 WebElement edit_fathersname= driver.findElementById("in.rebase.app:id/father_name");
	    	 edit_fathersname.click();
	    	 edit_fathersname.clear();
	    	 edit_fathersname.sendKeys("xysdf kumar");
	    	 WebElement edit_mothersname= driver.findElementById("in.rebase.app:id/mother_name");
	    	 edit_mothersname.click();
	    	 edit_mothersname.clear();
	    	 edit_mothersname.sendKeys("fghdje singh");
	    	 WebElement maryedyes= driver.findElementByXPath("//android.widget.RadioButton[@text='Yes' and @index='0']");
	    	 maryedyes.click();
	    	 WebElement maryedno= driver.findElementByXPath("//android.widget.RadioButton[@text='No' and @index='1']");
	    	 maryedno.click();
	    	 WebElement editpersionaldetailscontinuebutton= driver.findElementById("in.rebase.app:id/primary_action_text");
	    	 editpersionaldetailscontinuebutton.click();
	     }
	     
	}
		     