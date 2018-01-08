package Testcase;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {
ChromeDriver driver;
	
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver",  "//home//himanijain//Documents//chromedriver//");
	 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.quit();
	}


}
