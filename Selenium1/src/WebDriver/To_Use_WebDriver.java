package WebDriver; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_WebDriver { //to close the pop-pop notification

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");

		for (     ;    ;     ) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			} catch (Exception e) {
				Thread.sleep(2000);
			}
		}

	}

}
