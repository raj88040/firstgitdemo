package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Day8123 {
	@Test
	public void chrometest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith ");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[text()=' Login']")).click();
		driver.close();
	}
	@Test
	public void firefoxtest() {
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://the-internet.herokuapp.com/login");
		driver1.findElement(By.id("username")).sendKeys("tomsmith ");
		driver1.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver1.findElement(By.xpath("//*[text()=' Login']")).click();
		driver1.close();
	}
	@Test
	public void IEtest() {
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("https://the-internet.herokuapp.com/login");
		driver2.findElement(By.id("username")).sendKeys("tomsmith");
		driver2.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver2.findElement(By.xpath("//*[text()=' Login']")).click();
		driver2.close();
	}
	@Test
	public void safaritest() {
		WebDriver driver3 = new SafariDriver();
		driver3.get("https://the-internet.herokuapp.com/login");
		driver3.findElement(By.id("username")).sendKeys("tomsmith");
		driver3.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver3.findElement(By.xpath("//*[text()=' Login']")).click();
		driver3.close();
	}

}
