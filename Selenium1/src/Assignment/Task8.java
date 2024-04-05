package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);

		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.name("Gender")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("FirstName")).sendKeys("Ejaz Ahmed");
		Thread.sleep(3000);
		
		driver.findElement(By.name("LastName")).sendKeys("khan");
		Thread.sleep(3000);
		
		driver.findElement(By.name("Email")).sendKeys("ejazkhn07@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("Password")).sendKeys("Ejkhan@08");
		Thread.sleep(3000);
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Ejkhan@08");
		Thread.sleep(3000);
		
		driver.findElement(By.name("register-button")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
