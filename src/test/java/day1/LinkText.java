package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkText {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		WebDriverWait wait = new WebDriverWait(driver,
		
}
}
