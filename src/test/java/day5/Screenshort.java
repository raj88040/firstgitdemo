package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {
	
	 static WebDriver driver;
	 
	 public static void capture(int number) throws IOException {
		 
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  
		 File file1 = ts.getScreenshotAs(OutputType.FILE);
		 file file2 = new file("C:\\Users\\bhims\\OneDrive\\Pictures\\Screenshots\\screenshot"+number+".png");
		 
		 FileUtils.copyDirectory(file1, file1);
		 
		  }

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
	        
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("document.getElementById('checkBoxOption1').click();");
			Thread.sleep(2000);
			js.executeScript("document.getElementById('autocomplete').value='Hi Good Morning!'");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,900)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-900)");
			
			Thread.sleep(2000);
			WebElement brokenlink = driver.findElement(By.linkText("Broken Link"));
			js.executeScript("arguments[0].scrollIntoView();",brokenlink);
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.className("radioButton")));


	}

}
