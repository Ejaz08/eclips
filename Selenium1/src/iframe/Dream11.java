package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");

		// switch by index
		// driver.switchTo().frame(0);

		// switch by id or name
		// driver.switchTo().frame("send-sms-iframe");

		// switch by webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number' ]")).sendKeys("7077633380");
		
		//switch back to the previous webpage
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("About Us")).click();
		driver.quit();

	}

}
