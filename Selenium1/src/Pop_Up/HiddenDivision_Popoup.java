package Pop_Up;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Popoup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.makemytrip.com/");

		// switch to iframe
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class='close']")).click();

		// switch to the parent frame
		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//label[@for='departure']")).click();

		// perform try and catch to achive sept
		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='September 2024']/../..//p[text()='4']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
		}

	}

}
