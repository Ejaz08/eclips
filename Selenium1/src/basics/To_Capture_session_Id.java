package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Capture_session_Id {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		String sessionid = driver.getWindowHandle();
				System.out.println(sessionid);
				
				
				
				driver.quit();
	}

}
