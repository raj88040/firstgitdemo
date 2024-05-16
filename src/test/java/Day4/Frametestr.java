package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frametestr {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver = new ChromeDriver();
			
			driver.get("https://v1.training-support.net/selenium/iframes");
			
			driver.manage().window().maximize();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
			driver.findElement(By.id("actionButton")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
			
			

	}

}
