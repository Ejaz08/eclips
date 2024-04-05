package Mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class task3_zomato {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/india");
		
		File temp = driver.findElement(By.xpath("//img[@alt='Zomato logo' and @loading='lazy']")).getScreenshotAs(OutputType.FILE);
		File scr = new File("./errorShots/zomato.png");
		FileHandler.copy(temp, scr);
	}

}
