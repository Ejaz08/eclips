package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_Xpath_By_Surrounding {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(90000);
		driver.findElement(By.xpath("//span[(text()='APPLE iPhone 14 Pro')]/../..//button[@type='button']")).click();

	}

}

