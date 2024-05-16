package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
            List<WebElement> Links = (List<WebElement>) driver.findElements(By.tagName("a"));
            
            System.out.println("total links in flipcart.com is"+Links.size());
            for(WebElement link : Links) {
            	
            	String hrefval = link.getAttribute("href");
            	System.out.println(hrefval);
            	
            }
            
	}

}
