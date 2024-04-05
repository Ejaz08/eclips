package Basicss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.shoppersstack.com/products_page/8");
		driver.findElement(By.id("Check Delivery")).sendKeys("560011");
		driver.findElement(By.id("Check")).click();
	}

}
