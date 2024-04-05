package Advance_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learn_Invocation {
	
	@Test(priority = -7,invocationCount = 2)
    public void cricbuzz(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed",true);
		driver.quit();
	}
		@Test(priority = 5,invocationCount = 0) //invocationCount=0 will be skiped
		public void baskinrobbins() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://baskinrobbinsindia.com/");
			Reporter.log("baskinrobbins got executed",true);
			driver.quit();
			
	}
		@Test(priority = 0,invocationCount = 3)
		public void amazon() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://amazon.in/");
			Reporter.log("amazon got executed",true);
			driver.quit();
		}

}
