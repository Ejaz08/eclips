package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://polarbear.co.in/franchisee/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
				

	}

}
