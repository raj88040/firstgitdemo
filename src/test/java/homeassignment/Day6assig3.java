package homeassignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6assig3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			
			FileInputStream files = new FileInputStream("C:\\Users\\bhims\\OneDrive\\Desktop\\B35\\Salenium_project\\src\\main\\resources\\testdeta\\Book1.xlsx");
			
			Workbook book = WorkbookFactory.create(files);
			String email = book.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
			String password = book.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
			
			
			driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys(email);
			driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys(password);
			
			driver.findElement(By.className(" _acan _acap _acas _aj1- _ap30")).click();
	        book.close();

	}

}
