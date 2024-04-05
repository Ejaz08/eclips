package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_Xpath_By_Contains {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[(@value='Log in')]")).click();
		Thread.sleep(3000);
		String errormsg = driver.findElement(By.xpath("//span[contains(text (),'unsuccessful')]")).getText();
		System.out.println(errormsg);
		Thread.sleep(4000);
		driver.quit();
	}

}
