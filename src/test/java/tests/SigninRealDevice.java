package tests;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SigninRealDevice {
	AndroidDriver<WebElement> driver;
	
	@BeforeTest
	public void setup() {
		try {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1807");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		dc.setCapability(MobileCapabilityType.UDID, "c789124b");
//		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		dc.setCapability("appPackage", "in.rebase.app");
		dc.setCapability("appActivity", "com.payvoo.app.ui.activity.SplashScreenActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url,dc);
	}catch(Exception exp) {
		
		System.out.println("Cause is : "+exp.getCause());
		System.out.println("Message is : "+exp.getMessage());
		exp.printStackTrace();
	     }
	}
/*
	@Test
	public void signin() {
		System.out.println("i am inside signin test");
		//sign in
		WebDriverWait wait1  = new WebDriverWait(driver, 30);	
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/sign_in_button")));
		WebElement signin= driver.findElementById("in.rebase.app:id/sign_in_button");
		signin.click();
		
		//language select button
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/radio_group")));
		WebElement radiobuttonup= driver.findElementById("in.rebase.app:id/radio_group");
		radiobuttonup.click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.RadioButton")));
		WebElement telgu1= driver.findElements(By.className("android.widget.RadioButton")).get(2);
		telgu1.click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.RadioButton")));
		WebElement hindi1= driver.findElements(By.className("android.widget.RadioButton")).get(1);
		hindi1.click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.RadioButton")));
		WebElement english1= driver.findElements(By.className("android.widget.RadioButton")).get(0);
		english1.click();
		//clicked continue button
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
        WebElement cont1 = driver.findElementById("in.rebase.app:id/primary_action_text");
        cont1.click();
        
     //read terms and conditions and click 
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/drawer_layout")));
     WebElement UPER3 = driver.findElementById("in.rebase.app:id/drawer_layout");
     UPER3.click();	     
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/primary_action_text")));
     WebElement CONT3 = driver.findElementById("in.rebase.app:id/primary_action_text");
  	 CONT3.click();
  	 //give permission
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
     WebElement allow1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     
     if(allow1.isEnabled()) {
  	    System.out.println("allow1 is Enabled");
  	 allow1.click();
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
     WebElement allow2 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     
     if(allow2.isEnabled()) {
  	    System.out.println("allow2 is Enabled");
  	 allow2.click();
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
     WebElement allow3 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     
     if(allow3.isEnabled()) {
  	    System.out.println("allow3 is Enabled");
  	 allow3.click();
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
     WebElement allow4 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
     
     if(allow4.isEnabled()) {
  	    System.out.println("allow4 is Enabled");
  	 allow4.click();
      }
     
     //Sign in with Email
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/sign_in_google")));
     WebElement gong = driver.findElementById("in.rebase.app:id/sign_in_google");
     
     if(gong.isEnabled()) {
  	    System.out.println("google id picker is Enabled");
  	 gong.click();
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.gms:id/account_name")));
     WebElement A_name = driver.findElementById("com.google.android.gms:id/account_name");
     
     if(A_name.isEnabled()) {
  	    System.out.println("google_name picker is Enabled");
  	 A_name.click();
      }
      
     
     //sign in with face book
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("in.rebase.app:id/fb_sign_in")));
     WebElement fb = driver.findElementById("in.rebase.app:id/fb_sign_in");
     
     if(fb.isEnabled()) {
  	    System.out.println("redirect fb login page is Enabled");
  	  fb.click();
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
		WebElement fb_user_name= driver.findElements(By.className("android.widget.EditText")).get(0);		
     if(fb_user_name.isEnabled()) {
  	    System.out.println("facebook user name text is Enabled");
  	    fb_user_name.click();
  	    fb_user_name.sendKeys("amit96873@gmail.com");
  	    System.out.println("user name is enterd succesfully");
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
		WebElement fb_password= driver.findElements(By.className("android.widget.EditText")).get(1);	
     if(fb_password.isEnabled()) {
  	    System.out.println("facebook password text is Enabled");
  	    fb_password.click();
  	    fb_password.sendKeys("8226993297");
  	    System.out.println("password is enterd succesfully");
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));
		WebElement fb_login_button= driver.findElement(By.className("android.widget.Button"));
     if(fb_login_button.isEnabled()) {
  	    System.out.println("facebook login button is Enabled");
  	  fb_login_button.click();
      }
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")));
     WebElement fb_continue_button = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Continue\"]");
     if(fb_continue_button.isEnabled()) {
  	    System.out.println("facebook continue button is Enabled");
  	  fb_continue_button.click();
      }
      
     //create password
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));
     WebElement pin1 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
     pin1.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")));
     WebElement pin2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
     pin2.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")));
     WebElement pin3 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView");
     pin3.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));
     WebElement pin4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
     pin4.click();
     //confirm password
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));
     WebElement confirmpin1 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
     confirmpin1.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")));
     WebElement confirmpin2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
     confirmpin2.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")));
     WebElement confirmpin3 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView");
     confirmpin3.click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")));
     WebElement confirmpin4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView");
     confirmpin4.click();
     System.out.println("signed in succesfully");
    	
	}
	*/
	
	

	@AfterTest
	public void teardown() throws InterruptedException {
		System.out.println("i am after test");
		
	         }

}
