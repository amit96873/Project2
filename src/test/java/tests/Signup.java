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

public class Signup {
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
			//		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			//		dc.setCapability(MobileCapabilityType.NO_RESET, true);
			//		dc.setCapability(MobileCapabilityType.FULL_RESET, false);
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
	public void newsignup() {
		System.out.println("i am inside the signup test");

		WebElement signup1= driver.findElementById("in.rebase.app:id/sign_up_button");
		signup1.click();
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

		WebElement FullName = driver.findElementById("in.rebase.app:id/name");      
		if(FullName.isEnabled()) {    	   
			System.out.println("name is Enabled");
			FullName.click();
			FullName.sendKeys("spider singh");   	    
		}

		WebElement Number = driver.findElementById("in.rebase.app:id/mobile_number");

		if(Number.isEnabled()) {
			System.out.println("mobile number Enabled");
			Number.click();
			Number.sendKeys("8226993297");

		}
		WebElement CONTINUE1 = driver.findElementById("in.rebase.app:id/primary_action_text");

		if(CONTINUE1.isEnabled()) {
			System.out.println("continue is Enabled");
			CONTINUE1.click();
		}
		WebElement CONT3 = driver.findElementById("in.rebase.app:id/primary_action_text");

		if(CONT3.isEnabled()) {
			System.out.println("continue2 is Enabled");
			CONT3.click();
		}

		WebElement allow1 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");

		allow1.click();
		WebElement allow2 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		allow2.click();

		WebElement allow3 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		allow3.click();

		WebElement allow4 = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");


		allow4.click();


		WebElement goog = driver.findElementById("in.rebase.app:id/login_google");

		goog.click();

		WebElement A_name = driver.findElementById("com.google.android.gms:id/account_name");

		A_name.click();

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

		WebElement editaddress= driver.findElementById("in.rebase.app:id/residence_address");
		editaddress.click();
		editaddress.clear();
		editaddress.sendKeys("Aswath nagar kala mandir bangalore 560037");	  
		WebElement pincode= driver.findElementById("in.rebase.app:id/residence_pincode");
		pincode.click();
		pincode.clear();
		pincode.sendKeys("560037");
		WebElement count4 = driver.findElementById("in.rebase.app:id/primary_action_text");
		count4.click();
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
		WebElement count5 = driver.findElementById("in.rebase.app:id/primary_action_text");
		count5.click();
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
		System.out.println("signed up  succesfully");

	}

	@AfterTest
	public void aftertest() throws InterruptedException {
		System.out.println("i have completed my test so now i am going to close");
		Thread.sleep(5000);
		driver.quit();
	}
}
