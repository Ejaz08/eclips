package Enum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.instagram.com/");

		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("ejaz", Keys.CONTROL + "a");
		name.sendKeys(Keys.CONTROL + "c");

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(Keys.CONTROL + "v");

	}

}
