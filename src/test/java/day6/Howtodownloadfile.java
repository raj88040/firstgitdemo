package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtodownloadfile {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/FileDownload.html#google_vignette");
			
			driver.manage().window().maximize();
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,500)");
			//driver.findElement(By.xpath("//a[@type='button']")).click();
			driver.findElement(By.linkText("Download")).click();
			//driver.findElement(By.id("submitbutton")).click();
			
			//String text = driver.findElement(By.xpath("//*[@id='res']/centre")).getText();
			
			//if(text.contains("successfully")) {
				//System.out.println("test case is pass");
			//}else {
			//	System.out.println("Test case is failed");

	}

}
