package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Launch_RoyalEnfield {

	@Test(groups = "Regression")
	public void Royal() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/");
		Reporter.log("RoyalEnfield got lunched",true);
		driver.quit();
	}
}
