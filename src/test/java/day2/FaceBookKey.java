package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookKey {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Rajkumar1@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Raaaj1#");
		
		driver.findElement(By.id("u_0_5_3u")).click();
      }

}
