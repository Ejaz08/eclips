package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Launch_Yamaha {

	@Test(groups = "Regression")
	public void Yamaha() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha.com/");
		Reporter.log("Yamaha got lunched",true);
		driver.quit();
	}
}
