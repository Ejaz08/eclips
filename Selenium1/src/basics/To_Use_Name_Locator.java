package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_Name_Locator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("ejaz08");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Khan@123");
		Thread.sleep(3000);

	}

}
