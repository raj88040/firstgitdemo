package Day4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowstabnew {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("Open Tab")).click();
			
			String parenthandle = driver.getWindowHandle();
			Set<String> allhandles = driver.getWindowHandles();
			
			for (String singlehandle : allhandles) {
				
				driver.switchTo().window(singlehandle);
				
				if(driver.getTitle().equals("QAClick Academy - A Testing Academy to Learn, Earn and Shine")) {
					break;
					
					
				}
			}
			
			driver.findElement(By.linkText("Access all our Courses")).click();
			driver.switchTo().window(parenthandle);
			driver.findElement(By.id("autocomplete")).sendKeys("Switched back to my parent window");
			
			driver.quit();
			
			
			

	}

}
