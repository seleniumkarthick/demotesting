package com.test.selenium.commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSample {
	
	public static void main(String[] args) {
		
		String x="testing";
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.findElement(By.name("q")).sendKeys(x);*/
		WebElement textbox=driver.findElement(By.name("q"));
		textbox.clear();
		textbox.sendKeys(x);
		
		
		driver.findElement(By.id("submit")).click();
		
		
		String actual=driver.findElement(By.name("search")).getAttribute("value");
	
		if(actual.equals(x)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		driver.quit();
	}

}
