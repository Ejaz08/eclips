package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Capture_Title {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		Thread.sleep(4000);
		String ToGetTitle = driver.getTitle();
		System.out.println(ToGetTitle);
		

	}

}
