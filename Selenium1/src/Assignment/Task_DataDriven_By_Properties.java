package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_DataDriven_By_Properties {

	public static void main(String[] args) throws IOException {
		
		//Step:1
		FileInputStream fis = new FileInputStream("./textData/demoshop.properties");
		
		//Step:2
		Properties prop = new Properties();
		prop.load(fis);
		
		//Step:3
		String URL = prop.getProperty("url");
		String FIRSTNAME = prop.getProperty("firstname");
		String LASTNAME = prop.getProperty("lastname");
		String EMAIL = prop.getProperty("email");
		String PASSWORD = prop.getProperty("password");
		String CONFIRMPASSWORD = prop.getProperty("cpassword");
		
		//Text scripts
		
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
