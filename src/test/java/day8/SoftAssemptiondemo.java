package day8;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssemptiondemo {
	@Test
	public void zerodhatest2() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://zerodha.com/");
		driver.manage().window().maximize();
		String actualtitle = driver.getTitle();
		String expectedtitle ="Zerodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualtitle, expectedtitle);
		driver.findElement(By.linkText("Signup")).click();
		sa.assertAll();
	}

}
