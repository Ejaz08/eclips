package basics;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Navigate_BFR {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://blinkit.com/");
		
		Navigation nav = driver.navigate();
		
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
