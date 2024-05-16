package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5assig1 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://elementalselenium.com/");
			
			driver.manage().window().maximize();
	        
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("document.getElementByID('checkBox1').click();");
			Thread.sleep(2000);
			js.executeScript("document.getElementByID('autocomplete').value='python'");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,900");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-900");
			
			Thread.sleep(2000);
			WebElement brokenlink = driver.findElement(By.linkText("Broken Link"));
			js.executeScript("arguments[0].scrollIntoView();",brokenlink);
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.className("radioButton")));

	}

}
