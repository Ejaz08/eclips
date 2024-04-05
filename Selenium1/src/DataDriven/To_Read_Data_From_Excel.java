package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Read_Data_From_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//step:1
		FileInputStream fis = new FileInputStream("./textData/data.xlsx");
		
		//step:2
		
		Workbook wb = WorkbookFactory.create(fis);
		
		//step:3
		String URL = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String USERNAME = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String PASSWORD = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		
		
		

	}

}
