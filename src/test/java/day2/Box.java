package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Box {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("United States (USA)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='United States (USA)' and @class='ui-menu-item-wrapper']")).click();
		
		
      }
		

}
