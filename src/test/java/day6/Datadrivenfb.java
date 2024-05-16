package day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivenfb {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		FileInputStream files = new FileInputStream("C:\\Users\\bhims\\OneDrive\\Desktop\\B35\\Salenium_project\\src\\main\\resources\\testdeta\\Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(files);
		String email = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
        book.close();
	}

}
