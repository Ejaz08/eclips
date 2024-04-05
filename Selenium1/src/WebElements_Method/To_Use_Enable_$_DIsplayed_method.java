package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_Enable_$_DIsplayed_method {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);

		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Before passing data");
		System.out.println(loginButton.isDisplayed());
		Thread.sleep(4000);
		System.out.println(loginButton.isEnabled());

		System.out.println("=========================");

		driver.findElement(By.name("username")).sendKeys("ejazkhan08");
		driver.findElement(By.name("password")).sendKeys("123456578");

		System.out.println("After passing the data");
		System.out.println(loginButton.isDisplayed());
		Thread.sleep(4000);
		System.out.println(loginButton.isEnabled());

		Thread.sleep(5000);
		driver.quit();
	}

}
