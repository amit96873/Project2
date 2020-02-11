package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class All_Transactions extends HomePageBaseClass {
	
	@Test
	public void alltranscation() {
		
		System.out.println("i am inside all transactions test");
		
	     WebElement menu_buttonbank = driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open\"]");
	     menu_buttonbank.click();
	     
	     WebElement alltransaction = driver.findElementByXPath("//android.widget.CheckedTextView[@text='All Transactions' and @index='0']");
	     alltransaction.click();
		
	}

}
