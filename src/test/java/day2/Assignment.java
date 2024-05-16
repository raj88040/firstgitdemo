
package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ilaindia.co.in/registration");
		driver.manage().window().maximize();
		driver.findElement(By.id("jform_first_name")).sendKeys("RAJ");
		driver.findElement(By.id("jform_last_name")).sendKeys("KUMAR");
		driver.findElement(By.id("jform_address_r")).sendKeys("BIHAR");
		driver.findElement(By.id("jform_zipcode_r")).sendKeys("802101");
		driver.findElement(By.id("jform_mobile")).sendKeys("9876543210");
		driver.findElement(By.id("jform_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("jform_password1")).sendKeys("12345689");
		driver.findElement(By.id("jform_password2")).sendKeys("12345689");
		
		WebElement title = driver.findElement(By.id("jform_title"));
		Select s = new Select(title);
		s.selectByValue("mr");
		
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.id("jform_country_r"));
		Select s1 = new Select(country);
		s1.selectByValue("99");
		
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.id("jform_state_r"));
		Select s2 = new Select(state);
		s2.selectByValue("412");
		
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.id("jform_city_r"));
		Select s3 = new Select(city);
		s3.deselectByValue("68");
		
		Thread.sleep(2000);
		
		WebElement plan = driver.findElement(By.id("jform_plan_id"));
		Select s4 = new Select(plan);
		s4.deselectByValue("2");
		
		Thread.sleep(2000);
		
		WebElement zone = driver.findElement(By.id("jform_zone_id"));
		Select s5 = new Select(zone);
		s5.deselectByValue("1");
		
		Thread.sleep(2000);
		
		WebElement payment = driver.findElement(By.id("jform_payment_method"));
		Select s6 = new Select(payment);
		s6.deselectByValue("payumoney");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("btn btn-info btn-block validate nextBtn")).click();
		
		
		

	}

}
