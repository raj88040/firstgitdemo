package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverrefubrished {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.ebay.com/");
			
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			
			WebElement refubrished = driver.findElement(By.xpath("(//div[@class='vl-image vl-image-js js-only vl-popular-destinations-evo__image vl-image__fill'])[4]"));
			
			act.moveToElement(refubrished).build().perform();
			

	}

}
