package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" ;
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test(dataProvider = "datap")
	public void logintest(String username,String password) throws InterruptedException {
		Thread.sleep(5000);
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']li[4]/a")).click();
		 Thread.sleep(5000);
		 }
	@DataProvider(name="datap")
	public Object[][] datap() {
		return new Object[] [] {
			new Object[] {"Admin","admin123"},
			new Object[] {"Admin","adminpass"},
			new Object[] {"user123","admin123"},
			new Object[] {"operator","user123"},
		};
	}
	@AfterMethod
	public void afterTest() {
		driver.close();
	}

}
