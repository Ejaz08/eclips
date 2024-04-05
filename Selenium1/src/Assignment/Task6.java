package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(3000);

		driver.findElement(By.id("FirstName")).sendKeys("Ejaz Ahmed");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("Khan");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("ejazkhn07@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Company")).sendKeys("textyantra");
	}

}
