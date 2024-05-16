package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuLoginKey {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/login");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Rajkumar1@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Raaaj1#");
	
	driver.findElement(By.xpath("//*[text()=' Login']")).click();
  }

}
