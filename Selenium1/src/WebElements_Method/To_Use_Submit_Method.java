package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_Submit_Method {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("987654678");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1234545");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
