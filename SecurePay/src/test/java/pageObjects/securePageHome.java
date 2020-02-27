package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class securePageHome {
	
	public WebDriver ldriver;
	
	public securePageHome(WebDriver driver) {
		ldriver =driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(linkText ="Contact Us" )
		@CacheLookup
		WebElement contactUs;
		
	
		public String GetTitle()
		{
			return ldriver.getTitle();
		}
		
		public void clickContactUs() {
			contactUs.click();
			
		}

}
