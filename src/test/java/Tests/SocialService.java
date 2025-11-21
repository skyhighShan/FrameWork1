package Tests;

import org.testng.annotations.Test;

import Pages.HomeLandingPG;
import Pages.loginpage;
import TestBase.BaseClass;

public class SocialService extends BaseClass {
	
	loginpage lp;
	HomeLandingPG hp;
	@Test
	public void SocialService() {
		lp= new loginpage(driver);
		hp= new HomeLandingPG(driver);
		lp.enterlogin("admin", "pass123");
		hp.VerifyHomePage();
		hp.navigateTossuPatient();
	}

}
