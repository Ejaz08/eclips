package Dropdwon_Handle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class To_Handle_MultiSelect_list {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demoapp.skillrary.com/");

		// to locate
		WebElement multipleselectlistbox = driver.findElement(By.id("cars"));

		// to handle
		Select multipleselect = new Select (multipleselectlistbox);
		System.out.println(multipleselect.isMultiple());
		
		//to call
		multipleselect.selectByIndex(0);
		Thread.sleep(3000);
		multipleselect.selectByValue("99");
		//Thread.sleep(4000);
		//multipleselect.deselectByValue("99");
		Thread.sleep(3000);
		multipleselect.deselectAll();
	}

}
