package tests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	public class ScrollHomePage extends BaseClass{
		
		
		
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
		

		@Test
		public void BankStatement()   {
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
	        //bank statement o home page by reverse button
	        WebElement reverse_buton= driver.findElementsByClassName("android.widget.ImageButton").get(0);
	        reverse_buton.click();
	        
		}
		
		
		
		@Test
		public void MyCoins() {
			System.out.println("i am inside the mycoins");
			WebElement EarnCoins_Button= driver.findElementByXPath("//android.widget.Button[@text='EARN' and @index='0']");
			EarnCoins_Button.click();
			//Earn coins to home page by reverse button
		     WebElement reverse_buton= driver.findElementsByClassName("android.widget.ImageButton").get(0);
		     reverse_buton.click();
			
		}
		
		
		
            @Test
	 public void Scrollin() throws InterruptedException  {
			  //scrolling home page
            	System.out.println("scrolling the home page");
			     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Utilities\").instance(0))").click();
			      Thread.sleep(5000);
		  }
            
         @Test   
    public void MyKhata() {
        	 System.out.println("i am inside the mykhata");
            	
        	 WebElement mykhata = driver.findElementsByClassName("android.widget.LinearLayout").get(0);
        	 mykhata.click();
        	 WebElement reverse_buton= driver.findElementsByClassName("android.widget.ImageButton").get(0);
		     reverse_buton.click();
            }
         
         @Test
         public void MyProfile() {
        	 System.out.println("i am inside the myprofile");
        	 WebElement myprofile = driver.findElementsByClassName("android.widget.LinearLayout").get(1);
        	 myprofile.click();
        	 WebElement reverse_buton= driver.findElementsByClassName("android.widget.ImageButton").get(0);
		     reverse_buton.click();
        	 
         }
          
         @Test
         public void ContactUs() {
        	 System.out.println("i am inside the contactus");
        	 WebElement contactus = driver.findElementsByClassName("android.widget.LinearLayout").get(2);
        	 contactus.click();
        	 WebElement reverse_buton= driver.findElementsByClassName("android.widget.ImageButton").get(0);
		     reverse_buton.click();
        	 
         }
		    
		   

		  
		   
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	