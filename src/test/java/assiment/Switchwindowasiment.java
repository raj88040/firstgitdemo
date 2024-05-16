package assiment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switchwindowasiment {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://the-internet.herokuapp.com/login");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("Elemental Selenium")).click();
			
			String parenthandle = driver.getWindowHandle();
			Set<String> allhandles = driver.getWindowHandles();
			
			for (String singlehandle : allhandles) {
				
				driver.switchTo().window(singlehandle);
				
				if(driver.getTitle().equals("Home | Elemental Selenium")) {
					break;
					
					
				}
			}
			driver.findElement(By.id("email")).sendKeys("abc1@gmail.com");
			
			WebElement dropdown = driver.findElement(By.id("options"));
			Select s = new Select(dropdown);
			s.selectByIndex(2);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			driver.switchTo().window(parenthandle);
			driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("password")).sendKeys("aabbccdd");
			driver.findElement(By.linkText(" Login")).click();

	}

}
