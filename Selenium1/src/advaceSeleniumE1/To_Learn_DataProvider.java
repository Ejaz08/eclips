package advaceSeleniumE1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class To_Learn_DataProvider {

	@DataProvider(name = "cred")
	public String[][] toSendData() {

		String sarr[][] = { { "ejaz08@gmail.com", "ejaz@123" }, { "chiku123@gmail.com", "chiku@123" },
				{ "aditya@gamil.com", "aditya@123" } };
		return sarr;

	}
	@Test(dataProvider = "cred")
		public void login(String username,String pass) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
}