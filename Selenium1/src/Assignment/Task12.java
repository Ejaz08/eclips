package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("register-button")).click();
		Thread.sleep(5000);
		String firstname = driver.findElement(By.xpath("//span[contains(text(),'First')]")).getText();
		System.out.println(firstname);
		
		String lastname = driver.findElement(By.xpath("//span[contains(text(),'Last')]")).getText();
		System.out.println(lastname);
		
		String email = driver.findElement(By.xpath("//span[contains(text(),'Email')]")).getText();
		System.out.println(email);
		
		String pass = driver.findElement(By.xpath("//span[contains(text(),'Password')]")).getText();
		System.out.println(pass);
	}

}
