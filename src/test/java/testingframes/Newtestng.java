package testingframes;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newtestng {

	public WebDriver driver;
	
	@BeforeClass
	private void DateandTime() {

		Date d = new Date();
		System.out.println(d);

		
	}
	
	@BeforeMethod
	private void Browserlauch() {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	
	@Test
	private void tc1() {

		driver.get("https://www.facebook.com/");

		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("selenium");
		
			}
	
	@Test
	private void tc2() {

		driver.get("https://www.snapdeal.com/");
		
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("iphone");
	}
	
    @AfterMethod	
	private void enddate() {

		Date d = new Date();
		System.out.println(d);
		
	}
	
    @AfterClass
	private void browserclose() {

		driver.close();
		System.out.println("closed");
		System.err.println("quiet");
	}
	
	
	
	
}
