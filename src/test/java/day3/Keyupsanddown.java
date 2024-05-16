package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyupsanddown {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
	    driver.navigate().to("https://www.facebook.com/login.php/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("pass"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(username,Keys.SHIFT).sendKeys("raj").keyUp(username,Keys.SHIFT).build().perform();
		act.keyDown(password,Keys.SHIFT).sendKeys("pass").keyUp(password,Keys.SHIFT).build().perform();
		
		Thread.sleep(2000);
		
		for(int i=0;i<8;i++) {
		
		act.keyDown(password,Keys.BACK_SPACE).keyUp(password,Keys.BACK_SPACE).build().perform();
		}
	}

}
