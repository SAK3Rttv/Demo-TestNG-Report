package ch4_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DemoB {
	WebDriver driver;
	
	@Test
	public void run() {
		driver = new ChromeDriver();
		Reporter.log("The browser is opened now");
		driver.manage().window().maximize();
		Reporter.log("The browser is maximized");
		driver.get("https://www.google.co.in");
		Reporter.log("The Google website is opened");
		driver.findElement(By.name("aq")).sendKeys("Bye");
		Reporter.log("The data \"BYE\" is entered");
	}
	
	@AfterMethod
	public void closeDriver() {
		if (driver != null) {
			driver.quit();
			Reporter.log("The browser is closed successfully");
		}
	}
}
