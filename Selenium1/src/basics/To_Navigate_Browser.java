package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Navigate_Browser {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//to navigate to the browser (to string url)
	//	driver.navigate().to("https://blinkit.com/");
		
		
		//to navigate to the browser (to url url)
	//	driver.navigate().to(new URL("https://blinkit.com/"));
		
		Thread.sleep(3000);
		driver.quit();
	}

}
