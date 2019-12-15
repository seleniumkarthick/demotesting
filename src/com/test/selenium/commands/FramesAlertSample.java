package com.test.selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAlertSample  {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//body/button")).click();
		driver.switchTo().defaultContent();
		
		Alert x=driver.switchTo().alert();
		x.accept();
		
	}

}
