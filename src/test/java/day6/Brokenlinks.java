package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
     List<WebElement> Links = (List<WebElement>) driver.findElements(By.tagName("a"));
     
     System.out.println("total links in rahulshettyademy.com is"+Links.size());
     for(WebElement link : Links) {
    	 
     	WebElement link1;
		String url = link1.getAttribute("href");
          if(url!=null)
          {
        	  try {
        	  driver = new ChromeDriver();
        	  driver.get(url);
        	  
        	  if(driver.getTitle().isEmpty()||driver.getTitle().equalsIgnoreCase("not found"))
        		  
        	  {
        		  System.out.println("broken link" + url);
        		 
        	  }
        	  else if(!driver.getTitle().isEmpty())
        	  {
        		  System.out.println("valid link:" + url );
        	  }
        	  else
        	  {
        		  System.out.println("broken link" + url);
        	  }
        	  }catch(Exeption e) {
        	  
    		 
    	 }
     	driver.close();
     }
          driver.quit();
	  }
	}
	


