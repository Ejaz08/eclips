package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Capture_Url {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		String Urlofwebpage = driver.getCurrentUrl();
		System.out.println(Urlofwebpage);
				

	}

}
