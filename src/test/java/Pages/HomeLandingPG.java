package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeLandingPG extends BasePage{
	
	public HomeLandingPG(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//span[contains(text(),\"Dispensary\")])[1]")
	WebElement Dispensary;
	
	@FindBy(xpath="//i[contains(text(),\"Main Dispensary\")]")
	WebElement MainDispensary;
	
	@FindBy(xpath="(//span[contains(text(),\"click to Activate\")])[1]")
	WebElement MorningCounter;
	
	@FindBy(xpath="//span[contains(text(),\"SocialService\")]")
	WebElement SocialService;
	
	@FindBy(xpath="//a[contains(text(),\" Register New SSU Patient\")]")
	WebElement RegisterPatient;
	
	public void VerifyHomePage() {
		String Title=driver.getTitle();
		Assert.assertEquals("DanpheHealth", Title, "Home Page Validation");
		
		
	}
	
	public void NavigateToDispensary() {
		Dispensary.click();
		MainDispensary.click();
		MorningCounter.click();
	}
	
	public void navigateTossuPatient() {
		SocialService.click();
		RegisterPatient.click();
		
	}
	
	

}
