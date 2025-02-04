package Dropdwon_Handle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class To_Handle_Single_Select_Dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/signup");

		// to locate dropdown
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));

		// to handle dropdown
		Select dayselect = new Select(daydropdown);
		Select monthselect = new Select(monthdropdown);
		Select yearselect = new Select (yeardropdown);
		
		//to call dropdown
		dayselect.selectByIndex(15);
		monthselect.selectByValue("4");
		yearselect.selectByVisibleText("1999");
		
		//is it  multiple ??????
		System.out.println(dayselect.isMultiple());
		System.out.println(monthselect.isMultiple());
		System.out.println(yearselect.isMultiple());
		
		// to get all the options present in dropdown
		List<WebElement> allmonth = monthselect.getOptions();
		
		for(WebElement month:allmonth) {
			System.out.println(month.getText());
		monthselect.selectByVisibleText(month.getText());  //magic
	}
		
		

	}

}
