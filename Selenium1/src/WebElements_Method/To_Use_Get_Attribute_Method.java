package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_Get_Attribute_Method {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
		WebElement tryfreebuttom = driver.findElement(By.linkText("Try Free"));
		System.out.println(tryfreebuttom.getAttribute("href"));
		
	}

}
