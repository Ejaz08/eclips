package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class By_ClickAndHold_MoveToElement_DragAndDrop {

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
		action.clickAndHold(img1).dragAndDropBy(trashbox, 400, 0).perform();
		Thread.sleep(2000);
		action.clickAndHold(img2).moveToElement(trashbox).release().perform();
		Thread.sleep(2000);
		action.clickAndHold(img3).dragAndDropBy(trashbox, 400, 0).perform();
		Thread.sleep(2000);
		action.clickAndHold(img4).moveToElement(trashbox).release().perform();
		Thread.sleep(2000);

		// drag and drop to gallary
		action.clickAndHold(img1).dragAndDropBy(gallary, 0, 400).perform();
		// Thread.sleep(2000);
		action.clickAndHold(img2).moveToElement(gallary).release().perform();
		// Thread.sleep(2000);
		action.clickAndHold(img3).dragAndDropBy(gallary, 0, 400).perform();
		// Thread.sleep(2000);
		action.clickAndHold(img4).moveToElement(gallary).release().perform();

	}

}
