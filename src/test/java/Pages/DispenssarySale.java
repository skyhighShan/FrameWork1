package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DispenssarySale extends BasePage{
	
	
	public DispenssarySale(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		@FindBy(xpath="//input[@id=\"patient-search\"]")
		WebElement nameText;
	
	
	

	public void salePageOperation(String name) {
		nameText.sendKeys(name);
	}
}

