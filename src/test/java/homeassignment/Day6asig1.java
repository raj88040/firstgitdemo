package homeassignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6asig1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
JavascriptExecutor js = (JavascriptExecutor)driver;

        
        driver.get("https://www.ebay.com/");
		
		js.executeScript("document.getElementByID('checkBox1').click();");
		Thread.sleep(2000);
		js.executeScript("document.getElementByID('autocomplete').value='shoes'");
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

