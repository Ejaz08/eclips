package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_Clear_Method {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement UsernameTextField = driver.findElement(By.id("username"));
		UsernameTextField.clear();
		Thread.sleep(2000);
		UsernameTextField.sendKeys("ejaz");

		WebElement PasswordTextField = driver.findElement(By.id("password"));
		PasswordTextField.clear();
		Thread.sleep(2000);
		PasswordTextField.sendKeys("xyz1234");

	}

}
