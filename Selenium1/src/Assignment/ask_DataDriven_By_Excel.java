package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ask_DataDriven_By_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step:1
		FileInputStream fis = new FileInputStream("./textData/demoshop.xlsx");
		
		//Step:2
		Workbook wb =WorkbookFactory.create(fis);
		
		//Step:3
		String URL = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String FIRSTNAME = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String LASTNAME = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		String EMAIL = wb.getSheet("Sheet1").getRow(3).getCell(0).toString();
		String PASSWORD = wb.getSheet("Sheet1").getRow(4).getCell(0).toString();
		String CONFIRMPASSWORD = wb.getSheet("Sheet1").getRow(5).getCell(0).toString();
		
		//Test Scripts
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(URL);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@name='Gender' and @value='M']")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.name("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.name("Email")).sendKeys(EMAIL);
		driver.findElement(By.name("Password")).sendKeys(PASSWORD);
		driver.findElement(By.name("ConfirmPassword")).sendKeys(CONFIRMPASSWORD);
		driver.findElement(By.name("register-button")).click();
		

	}

}
