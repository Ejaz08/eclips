package Advance_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learn_threadpoolsize {
	
	@Test(invocationCount = 2,threadPoolSize = 2)//without invocationCount, threadPoolSize will not work 
    public void cricbuzz(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed",true);
		driver.quit();
	}
		@Test(invocationCount = 3,threadPoolSize = 3)  
		public void baskinrobbins() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://baskinrobbinsindia.com/");
			Reporter.log("baskinrobbins got executed",true);
			driver.quit();
			
	}
		@Test(invocationCount = 3,threadPoolSize = 3)
		public void amazon() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://amazon.in/");
			Reporter.log("amazon got executed",true);
			driver.quit();
		}

}
