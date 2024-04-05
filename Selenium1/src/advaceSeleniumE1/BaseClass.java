package advaceSeleniumE1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;

	@BeforeClass
	public void toLunchTheBrowser() {
		driver = new ChromeDriver();
		Reporter.log("Browser got lunched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized Successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("SeleniumE1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		Reporter.log("Navigated to homepage successfully",true);
	}

	@AfterMethod
	public void toLogout() {
		driver.findElement(By.id("Log out"));
		Reporter.log("Log out successfully",true);
	}

	@AfterClass
	public void toCloseTheBrowser() {
		driver.quit();
		Reporter.log("Browser got closed Successfully");
	}

}
