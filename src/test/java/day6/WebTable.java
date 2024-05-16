package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			String text = driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]/td[3]")).getText();
			System.out.println(text);
			
         
	}

}
