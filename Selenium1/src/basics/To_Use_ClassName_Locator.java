package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_ClassName_Locator {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * 
		 * driver.get("https://www.instagram.com/"); Thread.sleep(4000);
		 * driver.findElement(By.className("_aa4b_add6_ac4d_ap35")).sendKeys("7077633");
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.className("email")).sendKeys("7077633");

	}

}
