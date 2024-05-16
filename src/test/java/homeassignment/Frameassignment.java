package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameassignment {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Frames.html");
			
			driver.manage().window().maximize();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame']")));
			driver.findElement(By.id("actionButton")).click();
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(1);
			
			driver.findElement(By.id("actionButton")).click();

	}

}
