package advaceSeleniumE1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class To_Learn_configuration_Annotation {
	
	@BeforeSuite
	public void beforesuit() {
		Reporter.log("Before suit got executed",true);
	}
	@AfterSuite
	public void aftersuit() {
		Reporter.log("After suit got executed",true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("Before test got executed",true);
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("After test got executed",true);
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Before class got executed",true);
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("After class got executed",true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Before method got executed",true);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("After method got executed",true);
	}
	@Test
	public void testcase() {
		Reporter.log("Tastcase got Executed",true);
	}
}
