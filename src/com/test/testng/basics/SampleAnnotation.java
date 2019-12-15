package com.test.testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SampleAnnotation {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
	@Test
	public void m1() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "SeleniumHQ Browsersd Automation");
	}
	
	@Test(groups="sanity")
	public void m2() {
		System.out.println("22222");
	}

	@Test(groups= {"sanity","regression"})
	public void m3() {
		System.out.println("3333");
	}

	@Test(groups="regression")
	public void m4() {
		System.out.println("4444");
	}

}
