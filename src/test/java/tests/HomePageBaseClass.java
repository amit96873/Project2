
package tests;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


	public class HomePageBaseClass {
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
			dc.setCapability(MobileCapabilityType.NO_RESET, true);
			dc.setCapability(MobileCapabilityType.FULL_RESET, false);
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
			WebElement pin1 = driver.findElementByXPath("//android.widget.TextView[@text='1' and @index='0']");
		     pin1.click();
		     
		     WebElement pin2 = driver.findElementByXPath("//android.widget.TextView[@text='2' and @index='0']");
		     pin2.click();
		     
		     WebElement pin3 = driver.findElementByXPath("//android.widget.TextView[@text='3' and @index='0']");
		     pin3.click();
		     
		     WebElement pin4 = driver.findElementByXPath("//android.widget.TextView[@text='4' and @index='0']");
		     
		     pin4.click();
		     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"My Utilities\").instance(0))").click();
		}
		
		
		

		@AfterTest
		public void aftertest() throws InterruptedException {
			System.out.println("i am inside after test");
			Thread.sleep(5000);
			driver.quit();
	    }
		}