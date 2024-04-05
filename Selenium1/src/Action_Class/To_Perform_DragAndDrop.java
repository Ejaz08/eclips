package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_Perform_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		// To Identify the Images
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);

		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		// to locate trash
		WebElement trashbox = driver.findElement(By.id("trash"));

		// to locate gallary
		WebElement gallary = driver.findElement(By.id("gallery"));

		// To perform Action
		Actions action = new Actions(driver);

		// drag and drop to trash
		action.dragAndDrop(img1, trashbox).perform();
		Thread.sleep(2000);
		action.dragAndDrop(img2, trashbox).perform();
		Thread.sleep(2000);
		action.dragAndDrop(img3, trashbox).perform();
		Thread.sleep(2000);
		action.dragAndDrop(img4, trashbox).perform();
		Thread.sleep(3000);

		// drag and drop to gallary
		action.dragAndDrop(img1, gallary).perform();
		Thread.sleep(2000);
		action.dragAndDrop(img2, gallary).perform();
		Thread.sleep(2000);
		action.dragAndDrop(img3, gallary).perform();
		Thread.sleep(2000);
		action.dragAndDrop(img4, gallary).perform();
		Thread.sleep(4000);

		driver.quit();

	}

}
