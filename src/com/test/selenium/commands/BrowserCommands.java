package com.test.selenium.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		
		String title=driver.getTitle();
		
		if(title.equals("Selenium - Web Browser Automation")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String sourceCode=driver.getPageSource();
		System.out.println(sourceCode);
		
		driver.quit();
	}

}
