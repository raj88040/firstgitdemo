package homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Day81231 {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	public void reportconfig() {
		 report = new ExtentReports("C:\\Users\\bhims\\OneDrive\\Desktop\\B35\\Salenium_project\\report2.html");
		 test = report.startTest("HerokuLogin");
	}

	@Test
	public void setup() {
		driver = new ChromeDriver();
		 test.log(LogStatus.PASS, "Chrome opened successfully");
		 driver.get("https://the-internet.herokuapp.com/login");
		 driver.manage().window().maximize();
		 test.log(LogStatus.PASS, "maximised browser");
		 driver.findElement(By.id("username")).sendKeys("tomsmith");
	     test.log(LogStatus.PASS, "user name enter successfully");
		 driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		test.log(LogStatus.PASS, "password enter successfully");
		driver.findElement(By.xpath("//*[text()=' Login']")).click();
			
		String actualtitle = driver.getTitle();
		String expectedtitle="https://the-internet.herokuapp.com/secure";   
		Assert.assertEquals(actualtitle, expectedtitle);
		test.log(LogStatus.PASS, "login successfully");
		driver.close();
		
	}
	@Test
	public void firefoxtest() {
		WebDriver driver1 = new FirefoxDriver();
		 test.log(LogStatus.PASS, "Firefox opened successfully");
		driver1.get("https://the-internet.herokuapp.com/login");
		driver1.manage().window().maximize();
		test.log(LogStatus.PASS, "maximised browser");
		driver1.findElement(By.id("username")).sendKeys("tomsmith");
		test.log(LogStatus.PASS, "user name enter successfully");
		driver1.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		test.log(LogStatus.PASS, "password enter successfully");
		driver1.findElement(By.xpath("//*[text()=' Login']")).click();
		
		String actualtitle = driver.getTitle();
		String expectedtitle="https://the-internet.herokuapp.com/secure";   
		Assert.assertEquals(actualtitle, expectedtitle);
		test.log(LogStatus.PASS, "login successfully");
		driver1.close();
	}
	@Test
	public void IEtest() {
		WebDriver driver2 = new InternetExplorerDriver();
		 test.log(LogStatus.PASS, "IE opened successfully");
		driver2.get("https://the-internet.herokuapp.com/login");
		driver2.manage().window().maximize();
		test.log(LogStatus.PASS, "maximised browser");
		driver2.findElement(By.id("username")).sendKeys("tomsmith");
		test.log(LogStatus.PASS, "user name enter successfully");
		driver2.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		test.log(LogStatus.PASS, "password enter successfully");
		driver2.findElement(By.xpath("//*[text()=' Login']")).click();
		
		String actualtitle = driver.getTitle();
		String expectedtitle="https://the-internet.herokuapp.com/secure";   
		Assert.assertEquals(actualtitle, expectedtitle);
		test.log(LogStatus.PASS, "login successfully");
		driver2.close();
	}
	@Test
	public void edgetest() {
		WebDriver driver3 = new EdgeDriver();
		test.log(LogStatus.PASS, "edge opened successfully");
		driver3.get("https://the-internet.herokuapp.com/login");
		driver3.manage().window().maximize();
		test.log(LogStatus.PASS, "maximised browser");
		driver3.findElement(By.id("username")).sendKeys("tomsmith");
		test.log(LogStatus.PASS, "user name enter successfully");
		driver3.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		test.log(LogStatus.PASS, "password enter successfully");
		driver3.findElement(By.xpath("//*[text()=' Login']")).click();
		
		String actualtitle = driver.getTitle();
		String expectedtitle="https://the-internet.herokuapp.com/secure";   
		Assert.assertEquals(actualtitle, expectedtitle);
		test.log(LogStatus.PASS, "login successfully");
		driver3.close();
	}
	
	@AfterClass
	public void reportflush() {
		report.endTest(test);
		report.flush();
	}
	}
