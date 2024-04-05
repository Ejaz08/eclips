package advaceSeleniumE1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_02 extends BaseClass{

	@Test
	public void toCheckComputers() {
		driver.findElement(By.partialLinkText("Computers")).click();
		Reporter.log("Navigated to Computers successfully",true);
	}
}
