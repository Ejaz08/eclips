package advaceSeleniumE1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_01 extends BaseClass {

	String exceptedData = "Books";

	@Test
	public void toCheckBooks() {
		driver.findElement(By.partialLinkText("Books")).click();

		String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
		if (exceptedData.equals(actualData)) {
			Reporter.log("navigated to books successful",true);
		}
		else {
			Reporter.log("navigated to books unsuccessful",true);
		}
		

	}
}
