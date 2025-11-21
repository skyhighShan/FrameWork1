package Tests;

import org.testng.annotations.Test;

import Pages.DispenssarySale;
import Pages.HomeLandingPG;
import Pages.loginpage;
import TestBase.BaseClass;

public class DispensaryTest extends BaseClass {

	
		// TODO Auto-generated method stub


		loginpage lp;
		HomeLandingPG hp;
		DispenssarySale dp;
		
		@Test
		public void DispensaryTest() {
		
		lp= new loginpage(driver);
		hp= new HomeLandingPG(driver);
		dp=new DispenssarySale(driver);
		
		
		lp.enterlogin("admin", "pass123");
		hp.VerifyHomePage();
		hp.NavigateToDispensary();
		dp.salePageOperation(prop.getProperty("PatientName"));
		
		}
		
}







