package Testcase;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
ChromeDriver driver;
	
	@Test
	public void testcase2()
	{
		System.setProperty("webdriver.chrome.driver",  "//home//himanijain//Documents//chromedriver//");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.quit();
	}

}
