package Advance_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learn_enable {
	
	@Test(enabled = true) 
    public void cricbuzz(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed",true);
		driver.quit();
	}
		@Test(enabled = false)  
		public void baskinrobbins() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://baskinrobbinsindia.com/");
			Reporter.log("baskinrobbins got executed",true);
			driver.quit();
			
	}
		@Test(enabled = true)
		public void amazon() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://amazon.in/");
			Reporter.log("amazon got executed",true);
			driver.quit();
		}

}
