
package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	public class HelpAndsupport extends HomePageBaseClass{
		
		 	
		 @Test
	     public void helpandsupport() {
			 
			 WebElement menuebuton = driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Open' and @index='0']");
			 menuebuton.click();
			 WebElement helpandsupport = driver.findElementByXPath("//android.widget.CheckedTextView[@text='Help & Support' and @index='0']");
			 helpandsupport.click();
			 WebElement chatbutton = driver.findElementById("in.rebase.app:id/primary_action_text");
			 chatbutton.click();
			 
		     WebElement type_message = driver.findElementById("in.rebase.app:id/chat_sdk_et_message_to_send");
		     type_message.click();
		     type_message.sendKeys("hi");
		     WebElement send_message = driver.findElementById("in.rebase.app:id/chat_sdk_btn_chat_send_message");
		     send_message.click();
		     System.out.println("message has been send ");
		     //send media files and image as concern
		     WebElement files_button = driver.findElementById("in.rebase.app:id/chat_sdk_btn_options");
		     files_button.click();
		     //select take photo		    
		     WebElement take_Chat_pic = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
		     take_Chat_pic.click();		     
//		     WebElement Pic_allow_button = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//		     Pic_allow_button.click();	     
//		     WebElement Pic_deny_button = driver.findElementById("com.android.packageinstaller:id/permission_deny_button");
//		     Pic_deny_button.click();
		     WebElement Pic_shoot_button = driver.findElementById("com.android.camera2:id/shutter_button");
		     Pic_shoot_button.click();
		     WebElement Pic_shoot_done_button = driver.findElementById("com.android.camera2:id/done_button");
		     Pic_shoot_done_button.click();
//		     WebElement Pic_cancle_done_button = driver.findElementById("com.android.camera2:id/cancel_button");
//		     Pic_cancle_done_button.click();
//		     WebElement Pic_retake_done_button = driver.findElementById("com.android.camera2:id/retake_button");
//		     Pic_retake_done_button.click();
//		     choose photo
//		     WebElement files_button1 = driver.findElementById("in.rebase.app:id/chat_sdk_btn_options");
//		     files_button1.click();
//		     WebElement choose_chat_pic = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
//		     choose_chat_pic.click();
//		     allow galary axcess
//		     WebElement choose_Pic_allow_button = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//		     choose_Pic_allow_button.click();
		     //deny galary axcess
//		     WebElement choose_deny_deny_button = driver.findElementById("com.android.packageinstaller:id/permission_deny_button");
//		     choose_deny_deny_button.click();
//		     WebElement selectpicup = driver.findElementById("com.google.android.apps.photos:id/image");
//		     selectpicup.click();
//		     WebElement  selectpic2 =driver.findElementsByClassName("android.view.ViewGroup").get(8);
//		     selectpic2.click();
		     
	     }
	     
		     
	}
		     