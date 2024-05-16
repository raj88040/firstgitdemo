package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert2 {
	@Test
	public void zirodhatest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://zerodha.com/");
        String actualtitle = driver.getTitle();
		String expectedtitle="Zerodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";   
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.findElement(By.linkText("Signup")).click();
	}

}
