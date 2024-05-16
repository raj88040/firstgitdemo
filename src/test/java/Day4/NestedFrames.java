package Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://v1.training-support.net/selenium/nested-iframes");
			
			driver.manage().window().maximize();
			WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']"));
			driver.switchTo().frame(outerframe);
			
			WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
			driver.switchTo().frame(innerframe);
			
			driver.findElement(By.xpath("(//button[contains(text(),'Click Me!')])[1]")).click();
			
			driver.switchTo().defaultContent();
			
			
			

	}

}
