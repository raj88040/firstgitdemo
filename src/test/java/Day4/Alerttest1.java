package Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerttest1 {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
			
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("alertBox")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			driver.findElement(By.id("confirmBox")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			
			driver.findElement(By.xpath("//*[@id='promptBox']")).click();
			Thread.sleep(2000);
			
			Alert al = driver.switchTo().alert();
			al.sendKeys("Rajkumar");
			
			al.accept();
			
			
			
			
			

	}

}
