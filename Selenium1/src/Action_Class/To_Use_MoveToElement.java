package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_Use_MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.woodenstreet.com/");
		
		driver.findElement(By.id("loginclose1")).click();
		WebElement mousehover = driver.findElement(By.linkText("Bedroom"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(mousehover).perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
