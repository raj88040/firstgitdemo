package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtouploadfile {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/upload/");
			
			driver.manage().window().maximize();
			driver.findElement(By.className("upload_txt")).sendKeys("C:\\Users\\bhims\\Downloads");
			driver.findElement(By.id("terms")).click();
			driver.findElement(By.id("submitbutton")).click();
			
			String text = driver.findElement(By.xpath("//*[@id='res']/centre")).getText();
			
			if(text.contains("successfully")) {
				System.out.println("test case is pass");
			}else {
				System.out.println("Test case is failed");
			
			}

	}

}
