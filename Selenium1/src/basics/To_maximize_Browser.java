package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_maximize_Browser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://blinkit.com/");

				
		//used to maximize the window
	//	driver.manage().window().maximize();
		
		//used to minimize the window
	//	driver.manage().window().minimize();
		
		
		//used to fullscreen the window
	//	driver.manage().window().fullscreen();
		
		//to get the size
	//	Dimension sizeofbrowser = driver.manage().window().getSize();
	//	System.out.println(sizeofbrowser);
		
		//to set the size of window (1st way)
	//	driver.manage().window().setSize(new Dimension(987,456));
		
		
		
		//to set the size of window (2nd way)
	//	Dimension d = new Dimension(1000,678);
	//	driver.manage().window().setSize(d);
		
		//to get position
//		Point pos = driver.manage().window().getPosition();
//		System.out.println(pos);
		
	//	to set the position (1st way)
	//	driver.manage().window().setPosition(new Point(50,30));
		
//		to set the position (2nd way)
		Point p=new Point(40,20);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
