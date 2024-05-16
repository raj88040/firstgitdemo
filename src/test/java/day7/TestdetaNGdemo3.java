package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestdetaNGdemo3 {
	WebDriver driver;
	@BeforeTest(alwaysRun = true)
	public void setup() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
     
	
	 @Test(dataProvider = "datap")
	 public void login(String username,String password) throws InterruptedException {
		 
	 Thread.sleep(5000);	 
     driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath("//*[@type='submit'")).click();
	 Thread.sleep(5000);
	 
	 driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']li[4]/a")).click();
	 Thread.sleep(5000);
	 }
	 
	 
	 
	 @DataProvider(name="datap")
		public Object[][] datap() {
			
			return new Object[][] // 2 - D array
					{
				new Object[] { "Admin", "admin123" }, // new objects of 2darray and passing my data from it
				new Object[] { "Admin", "adminpass" },
				new Object[] { "user123", "admin123" },
				new Object[] { "operator", "user123" },
				
					};
	 
	 }
	 @AfterTest
	 public void afterTest() {
		 driver.close();
	 }

}
