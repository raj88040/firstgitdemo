package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavogationDemo {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("checkBoxOption1")).click();
		
		
		
		
}

}
