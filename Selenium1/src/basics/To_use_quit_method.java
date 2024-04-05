package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_use_quit_method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://blinkit.com/");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
