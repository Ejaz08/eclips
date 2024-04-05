package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Manage_Window_Browser 
{
	public static void main(String[] args) throws InterruptedException
	 {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://blinkit.com/");
		
		//to get the size
		Dimension sizeofbrowser = driver.manage().window().getSize();
		System.out.println(sizeofbrowser);
				
		//used to maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//to get the size
		Dimension sizeofbrowsermax = driver.manage().window().getSize();
		System.out.println(sizeofbrowsermax);
		
		//used to minimize the window
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		//used to fullscreen the window
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		//to get the size
		Dimension sizeofbrowsermaxfull = driver.manage().window().getSize();
	 	System.out.println(sizeofbrowsermaxfull);
				
		driver.quit();

	 }
}


