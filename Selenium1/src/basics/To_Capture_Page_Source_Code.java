package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Capture_Page_Source_Code {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		
		Thread.sleep(3000);
		String Sourcecode = driver.getPageSource();
		System.out.println(Sourcecode);
		
	}

}
