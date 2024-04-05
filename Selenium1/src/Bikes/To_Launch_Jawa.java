package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Launch_Jawa {

	@Test(groups = "Smoke")
	public void Jawa() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jawa.com/");
		Reporter.log("Jawa got lunched",true);
		driver.quit();
	}
}
