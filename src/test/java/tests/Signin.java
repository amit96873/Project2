package tests;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

   
	public class Signin {
		AndroidDriver<WebElement> driver;
		
		@BeforeTest
		public void setup() {
			try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
			dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//			dc.setCapability(MobileCapabilityType.NO_RESET, true);
//			dc.setCapability(MobileCapabilityType.FULL_RESET, false);
			dc.setCapability("appPackage", "in.rebase.app");
			dc.setCapability("appActivity", "com.payvoo.app.ui.activity.SplashScreenActivity");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<WebElement>(url,dc);
			
		}catch(Exception exp) {
			
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
		     }
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			System.out.println("Session is Created");
		}

	@Test
	public void signin() {
		System.out.println("i am inside signin test");
		//sign in
		
		
		WebElement signin= driver.findElementById("in.rebase.app:id/sign_in_button");
		signin.click();
		
		//language select button
		
		WebElement radiobuttonup= driver.findElementById("in.rebase.app:id/radio_group");
		radiobuttonup.click();
		
		WebElement telgu1= driver.findElements(By.className("android.widget.RadioButton")).get(2);
		telgu1.click();
		
		WebElement hindi1= driver.findElements(By.className("android.widget.RadioButton")).get(1);
		hindi1.click();
		
		WebElement english1= driver.findElements(By.className("android.widget.RadioButton")).get(0);
		english1.click();
		//clicked continue button
		
        WebElement cont1 = driver.findElementById("in.rebase.app:id/primary_action_text");
        cont1.click();
        
     //read terms and conditions and click 
     
     WebElement UPER3 = driver.findElementById("in.rebase.app:id/drawer_layout");
     UPER3.click();	     
     
     WebElement CONT3 = driver.findElementById("in.rebase.app:id/primary_action_text");
  	 CONT3.click();
  	 //give permission
     
     WebElement allow1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     
     if(allow1.isEnabled()) {
  	    System.out.println("allow1 is Enabled");
  	 allow1.click();
      }
     
     WebElement allow2 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     
     if(allow2.isEnabled()) {
  	    System.out.println("allow2 is Enabled");
  	 allow2.click();
      }
    
     WebElement allow3 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     
     if(allow3.isEnabled()) {
  	    System.out.println("allow3 is Enabled");
  	 allow3.click();
      }
    
     WebElement allow4 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     
     if(allow4.isEnabled()) {
  	    System.out.println("allow4 is Enabled");
  	 allow4.click();
      }
     
     //Sign in with Email
     /*
     WebElement gong = driver.findElementById("in.rebase.app:id/sign_in_google");
     
     if(gong.isEnabled()) {
  	    System.out.println("google id picker is Enabled");
  	 gong.click();
      }
     
     WebElement A_name = driver.findElementById("com.google.android.gms:id/account_name");
     
     if(A_name.isEnabled()) {
  	    System.out.println("google_name picker is Enabled");
  	 A_name.click();
      }
      */
     
     //sign in with face book
     
     WebElement fb = driver.findElementById("in.rebase.app:id/fb_sign_in");
     
     if(fb.isEnabled()) {
  	    System.out.println("redirect fb login page is Enabled");
  	  fb.click();
      }
    
		WebElement fb_user_name= driver.findElements(By.className("android.widget.EditText")).get(0);		
     if(fb_user_name.isEnabled()) {
  	    System.out.println("facebook user name text is Enabled");
  	    fb_user_name.click();
  	    fb_user_name.sendKeys("amit96873@gmail.com");
  	    System.out.println("user name is enterd succesfully");
      }
     
		WebElement fb_password= driver.findElements(By.className("android.widget.EditText")).get(1);	
     if(fb_password.isEnabled()) {
  	    System.out.println("facebook password text is Enabled");
  	    fb_password.click();
  	    fb_password.sendKeys("8226993297");
  	    System.out.println("password is enterd succesfully");
      }
     
		WebElement fb_login_button= driver.findElement(By.className("android.widget.Button"));
     if(fb_login_button.isEnabled()) {
  	    System.out.println("facebook login button is Enabled");
  	  fb_login_button.click();
      }
    
     WebElement fb_continue_button = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Continue\"]");
     if(fb_continue_button.isEnabled()) {
  	    System.out.println("facebook continue button is Enabled");
  	  fb_continue_button.click();
      }
     //create password
     WebElement pin1 = driver.findElementByXPath("//android.widget.TextView[@text='1' and @index='0']");
     pin1.click();
     WebElement pin2 = driver.findElementByXPath("//android.widget.TextView[@text='2' and @index='0']");
     pin2.click();
     WebElement pin3 = driver.findElementByXPath("//android.widget.TextView[@text='3' and @index='0']");
     pin3.click();
     WebElement pin4 = driver.findElementByXPath("//android.widget.TextView[@text='4' and @index='0']");
     pin4.click();
     //reenter password
     WebElement reenterpin1 = driver.findElementByXPath("//android.widget.TextView[@text='1' and @index='0']");
     reenterpin1.click();
     WebElement reenterpin2 = driver.findElementByXPath("//android.widget.TextView[@text='2' and @index='0']");
     reenterpin2.click();
     WebElement reenterpin3 = driver.findElementByXPath("//android.widget.TextView[@text='3' and @index='0']");
     reenterpin3.click();
     WebElement reenterpin4 = driver.findElementByXPath("//android.widget.TextView[@text='4' and @index='0']");
     reenterpin4.click();
     System.out.println("signed in succesfully");
    	
	}
	

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	         }

}
