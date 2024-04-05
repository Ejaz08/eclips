package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Capture_MultipleElements_ByForEach_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'autocomplete')]/div/div[1]/div"));
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}
			
		

	}

}
