package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_Id_Locator {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys("ejaz08@facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("xyz@123");
	}

}
