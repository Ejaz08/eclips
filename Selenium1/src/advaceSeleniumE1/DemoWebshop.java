package advaceSeleniumE1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoWebshop extends Base_Class_For_CrossBrowsing {

	String exceptedData = "Books";
	@Test
	public void toCheckBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
}
}