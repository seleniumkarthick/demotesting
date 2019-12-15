package com.test.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabWindowSample extends CommonMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		
		for(String child:driver.getWindowHandles()) {
			driver.switchTo().window(child);
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.switchTo().window(parent);
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
	}

}
