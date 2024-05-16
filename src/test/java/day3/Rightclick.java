package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			driver.manage().window().maximize();
			
			WebElement rightclick = driver.findElement(By.xpath("//span[.='right click me']"));
			
			Actions act = new Actions(driver);
			
			act.contextClick().build().perform();
			

	}

}
