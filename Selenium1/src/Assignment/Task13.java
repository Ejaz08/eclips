package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("search_query")).sendKeys("main dhoondne ko zamaane mein");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='हार्टलेस: मैं ढ़ूढने को जमाने में वीडियो गाना | अरजीत सिंह | अध्ययन सुमन, एरियना अयाम']")).click();
		

	}

}
