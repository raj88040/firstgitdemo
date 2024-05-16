package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6assig2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\bhims\\Downloads\\Letter");
		//driver.findElement(By.id("terms")).click();
		//driver.findElement(By.id("submitbutton")).click();
		
		//String text = driver.findElement(By.xpath("//*[@id='res']/centre")).getText();
		
		//if(text.contains("successfully")) {
			//System.out.println("test case is pass");
		//}else {
			//System.out.println("Test case is failed");
		}
	
	}

//}
