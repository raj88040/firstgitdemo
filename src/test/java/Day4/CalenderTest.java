package Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderTest {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-datepicker-div"))));
		
		String actualmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String actualyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(actualmonth.equals("October")&&actualyear.equals("2026"))) {
			
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
			actualmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			actualyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[.='3']")).click();

	}

}
