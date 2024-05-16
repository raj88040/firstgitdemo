package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Frames.html");
			
			driver.manage().window().maximize();
			WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']"));
			driver.switchTo().frame(outerframe);
			
			WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
			driver.switchTo().frame(innerframe);
			
			driver.findElement(By.xpath("(//button[contains(text(),'Click Me!')])[1]")).click();
			
			driver.switchTo().defaultContent();
			

	}

}
