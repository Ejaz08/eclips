package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String webpageurl = driver.getCurrentUrl();
		System.out.println(webpageurl);
		
		driver.quit();
	}

}
