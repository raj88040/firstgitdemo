package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement Sportslink = driver.findElement(By.linkText("Sports"));
		
		act.moveToElement(Sportslink).build().perform();
		
		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
		
		act.moveToElement(Electronics).build().perform();
		
		

	}

}
