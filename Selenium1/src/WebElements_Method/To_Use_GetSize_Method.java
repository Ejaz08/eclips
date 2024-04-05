package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Use_GetSize_Method {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		Dimension getTheSize = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
		System.out.println(getTheSize);
		System.out.println(getTheSize.getHeight());
		System.out.println(getTheSize.getWidth());
	}
}
