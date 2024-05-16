package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	WebDriver driver;
	
	@BeforeTest(alwaysRun = true)
	public void setup() {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		
	}
	
	        @Test(groups = "smoke")
	        public void webtabletest() throws InterruptedException {
		
			driver.findElement(By.id("email")).sendKeys("Rajkumar1@gmail.com");
			Thread.sleep(2000);
	}
			
			@Test(groups = "regression")
			public void sendkeys() throws InterruptedException {
				
			driver.findElement(By.id("pass")).sendKeys("Raaaj1#");
			Thread.sleep(2000);
			}
			
			@Test(groups = "smoke")
			public void checkboxtest() {
				
			}
			
			@Test(groups = "regression",dependsOnMethods = "sendkeys")
			public void linktext() {
				
			}
			
			@AfterTest(alwaysRun = true)
			public void teardown() {
				
				
			}
			
			
}
