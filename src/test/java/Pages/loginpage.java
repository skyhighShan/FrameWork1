package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends BasePage {

	public loginpage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//input[@id='username_id']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//button[@id='login']")
	WebElement login;

	public void enterlogin(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		login.click();
	}

}
