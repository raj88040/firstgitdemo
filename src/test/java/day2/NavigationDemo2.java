package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo2 {
	
    public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.ebay.com/");
		
		
		dr.findElement(By.linkText("Help & Contact")).click();
		
		Thread.sleep(2000);
		dr.navigate().back();
		
		dr.findElement(By.linkText("Daily Deals")).click();
		
		Thread.sleep(2000);
		dr.navigate().back();
		
		
    }

}
