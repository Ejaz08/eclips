package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shirt");
		Thread.sleep(3000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li"));
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}
	}

}
