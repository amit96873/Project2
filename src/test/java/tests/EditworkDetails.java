package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

   
	public class EditworkDetails extends HomePageBaseClass {
		
		
		 @Test
	     public void editworkdetails() {
	    	 System.out.println("i am inside the edit work details");
	    	 WebElement myprofile = driver.findElementByXPath("//android.widget.TextView[@text='My Profile' and @index='1']");
	    	 myprofile.click();
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"DESIGNATION\").instance(0))").click();
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CUSTOMER RELATIONSHIP NUMBER (CRN)\").instance(0))").click();
	    	 WebElement expend= driver.findElementById("in.rebase.app:id/fab_expand_menu_button");
	    	 expend.click();
	    	 WebElement editworkdetails = driver.findElementByXPath("//android.widget.TextView[@text='EDIT WORK DETAILS' and @index='2']");
	    	 editworkdetails.click();
	    	 WebElement Employement_status= driver.findElementById("in.rebase.app:id/spinner");
	    	 Employement_status.click();
	    	 WebElement selectEmpStatus = driver.findElementByXPath("//android.widget.Button[@text='PRIVATE SECTOR JOB - OTHER' and @index='0']");
	    	 selectEmpStatus.click();
	    	 WebElement monthallyincome= driver.findElementById("in.rebase.app:id/monthly_income");
	    	 monthallyincome.click();
	    	 monthallyincome.clear();
	    	 monthallyincome.sendKeys("50000");
	    	 WebElement editpannumber= driver.findElementById("in.rebase.app:id/pan");
	    	 editpannumber.click();
	    	 editpannumber.clear();
	    	 editpannumber.sendKeys("GFLPK6195D");
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Postal Code (Pincode)\").instance(0))").click();
	    	 WebElement designation = driver.findElementByXPath("//android.widget.TextView[@text='OWNER OF SHOP' and @index='0']");
	    	 designation.click();
	    	 WebElement seldesignation = driver.findElementByXPath("//android.widget.Button[@text='OWNER OF SHOP' and @index='0']");
	    	 seldesignation.click();
	    	 WebElement editworkspacename= driver.findElementById("in.rebase.app:id/workplace_name");
	    	 editworkspacename.click();
	    	 editworkspacename.clear();
	    	 editworkspacename.sendKeys("xyz financial corporation");
	    	 WebElement editworkspaceaddress= driver.findElementById("in.rebase.app:id/workplace_address");
	    	 editworkspaceaddress.click();
	    	 editworkspaceaddress.clear();
	    	 editworkspaceaddress.sendKeys("electronic city bangalore");
	    	 WebElement editworkspacepincode= driver.findElementById("in.rebase.app:id/workplace_pincode");
	    	 editworkspacepincode.click();
	    	 editworkspacepincode.clear();
	    	 editworkspacepincode.sendKeys("560037");
	    	 WebElement editworkcontinuebutton= driver.findElementById("in.rebase.app:id/primary_action_text");
	    	 editworkcontinuebutton.click();
	    	 
	     }
	
	

		    
	}
		     