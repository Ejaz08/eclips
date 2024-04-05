package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Launch_Ducatti {

	@Test(groups = "Smoke")
	public void Ducatti() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ducati.com/");
		Reporter.log("Ducatti got lunched",true);
		driver.quit();
	}
}
