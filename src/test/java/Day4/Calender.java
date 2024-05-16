package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
			
		    driver.navigate().to("https://www.facebook.com/login.php/");
			
			driver.manage().window().maximize();
			

	}
   }
