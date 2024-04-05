package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_vtiger {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.vtiger.com/");
		driver.findElement(By.xpath("//div[@id='s-zoom']/div/div/ul/li[5]")).click();
		driver.findElement(By.partialLinkText(" Contact Us")).click();
		WebElement number = driver.findElement(By.partialLinkText(" +91 9243602352"));
		System.out.println(number.getText());
		
		driver.quit();
	}

}
