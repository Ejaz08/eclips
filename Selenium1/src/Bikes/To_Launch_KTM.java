package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Launch_KTM {

	@Test(groups = "System")
	public void Ktm() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ktm.com/");
		Reporter.log("KTM got lunched",true);
		driver.quit();
}
}