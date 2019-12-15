package com.test.testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SampleAnnotation2 {
	
	WebDriver driver;
	
	@Parameters("url")
	@BeforeTest
	public void setup(String site_url) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site_url);
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
	
	@Test
	public void m2() {
		System.out.println("22222");
	}

	@Test
	public void m3() {
		System.out.println("3333");
	}

	@Test
	public void m4() {
		System.out.println("4444");
	}

}
