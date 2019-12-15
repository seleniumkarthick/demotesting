package com.test.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3docs.com/learn-html/html-select-tag.html");
		
		Select result=new Select(driver.findElement(By.xpath("//form/select")));
		result.selectByValue("books");
	}

}
