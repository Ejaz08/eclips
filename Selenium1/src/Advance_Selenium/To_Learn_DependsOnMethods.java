package Advance_Selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learn_DependsOnMethods {

	@Test
	public void createAccount() {
		Reporter.log("Account created successfully",true);
	}
	@Test(dependsOnMethods = "createAccount")
	public void editAccount() {
		Reporter.log("Account edited successfully",true);
	}
	@Test(dependsOnMethods = "editAccount")
	public void deleteAccount (){
		Reporter.log("Account deleted successfully",true);
	}
}
