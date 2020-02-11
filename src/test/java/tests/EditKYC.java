
package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

   
	public class EditKYC extends HomePageBaseClass {
		
		 @Test
	     public void editworkyc() {
	    	 System.out.println("i am inside the edit work details");
	    	 WebElement myprofile = driver.findElementByXPath("//android.widget.TextView[@text='My Profile' and @index='1']");
	    	 myprofile.click();
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"DESIGNATION\").instance(0))").click();
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CUSTOMER RELATIONSHIP NUMBER (CRN)\").instance(0))").click();
	    	 WebElement expend= driver.findElementById("in.rebase.app:id/fab_expand_menu_button");
	    	 expend.click();
	    	 WebElement editworkyc = driver.findElementById("in.rebase.app:id/kyc_edit_button");
	    	 editworkyc.click();
	    	 //select documents types front
	    	 WebElement selectanotherdocumentfront = driver.findElementById("in.rebase.app:id/alternate_button");
	    	 selectanotherdocumentfront.click();
	    	 WebElement selectiddocument = driver.findElementByXPath("//android.widget.RadioButton[@text='Aadhaar front' and @index='1']");
	    	 selectiddocument.click();
	    	 WebElement okdocumenttype = driver.findElementById("in.rebase.app:id/positive_button");		     
	    	 okdocumenttype.click();
	    	 //Aadhaar front
             WebElement aadharfront = driver.findElementById("in.rebase.app:id/desc");		     
             aadharfront.click();
             WebElement capture = driver.findElementById("in.rebase.app:id/positive_button");		     
             capture.click();
             WebElement shoot = driver.findElementById("com.android.camera2:id/shutter_button");		     
             shoot.click();
             WebElement donebutton = driver.findElementById("com.android.camera2:id/done_button");		     
             donebutton.click(); 
             //select document type back
//             WebElement selectiddocumentback = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.Button[2]");
//	    	 selectiddocumentback.click();
//	    	 WebElement selectiddocumentadharandutility = driver.findElementByXPath("//android.widget.RadioButton[@text='Utility Bill' and @index='1']");
//	    	 selectiddocumentadharandutility.click();
             //aadhar back
//             WebElement okdocumenttypeback = driver.findElementById("in.rebase.app:id/positive_button");		     
//	    	 okdocumenttypeback.click();
             WebElement edit_kyc_Aadharback = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]");
             edit_kyc_Aadharback.click();
             WebElement capture2 = driver.findElementById("in.rebase.app:id/positive_button");		     
             capture2.click();
             WebElement shoot2 = driver.findElementById("com.android.camera2:id/shutter_button");		     
             shoot2.click();
             WebElement donebutton2 = driver.findElementById("com.android.camera2:id/done_button");		     
             donebutton2.click();
             driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Need Help?\").instance(0))").click();
             WebElement okhelpbuton = driver.findElementById("in.rebase.app:id/negative_button");		     
             okhelpbuton.click();
             WebElement editSelfee = driver.findElementByXPath("//android.widget.TextView[@text='take a selfie' and @index='2']");
             editSelfee.click();
             WebElement capture3 = driver.findElementById("in.rebase.app:id/positive_button");		     
             capture3.click();
             WebElement shoot3 = driver.findElementById("com.android.camera2:id/shutter_button");		     
             shoot3.click();
             WebElement donebutton3 = driver.findElementById("com.android.camera2:id/done_button");		     
             donebutton3.click();
             WebElement donekycbutton = driver.findElementById("in.rebase.app:id/primary_action_text");		     
             donekycbutton.click();
             
		     
	     }

	}
		     