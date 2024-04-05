package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Learn_Close_method {

public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://hdhub4u.re/");
			
			Thread.sleep(4000);
			driver.close();
	}

}
