package com.test.selenium.commands;

public class SeleniumCommands {
	
	/*
	 * ==========================================================
	 * 
	 * 			BROWSER RELATED  
	 * 
	 * ==========================================================
	 * 
	 *  
	 * 
	 * WebDriver driver = new FirefoxDriver();
	 * 
	 * driver.get(url) -> used to launch the url
	 * quit();
	 * getTitle();
	 * getCurrentUrl();
	 * getPageSource();
	 * getWindowHandle();
	 * getWindowHandles();
	 * getAttribute("class");
	 * 
	 * ==========================================================
	 * 
	 * 			FORM COMPONENTS
	 * 
	 * ==========================================================
	 * 
	 * WebElement 
	 * 
	 * driver.findElement(By.name("xxx")).sendKeys("testing");
	 * 
	 * or
	 * 
	 * WebElement xx=driver.findElement(By.name("Email"));
	 * xx.clear();
	 * xx.sendKeys("testing@gmail.com");
	 * xx.getAttribute("value");
	 * 
	 * WebElement xx1=driver.findElement(By.name("signIn"));
	 * xx1.click();
	 * 
	 * Select 
	 * 
	 * selectByVisibleText("Audi");
	 * selectByIndex(6);
	 * selectByValue("01");
	 * deselectAll();
	 * 
	 * =========================================================
	 * 
	 * 			ALERT, WINDOWS and FRAMES
	 * 
	 * =========================================================
	 * 
	 * 
	 * Alert
	 * 
	 * Alert x=driver.switchTo().alert();
	 * x.accept();
	 * x.dismiss();
	 * x.getText();
	 * x.sendKeys("test");
	 * 
	 * 
	 * Windows
	 * 
	 * To hanlde single window
	 * 
	 * String parentWindow=driver.getWindowHandle();
	 * 
	 * driver.switchTo().window(parentWindow);
	 * 
	 * To hanlde multiple window
	 * 
	 * for(String x:driver.getWindowHandles()){
	 * 
	 * 		driver.switchTo().window(x);
	 * 
	 * }
	 * 
	 * driver.switchTo().window(parentWindow);
	 * 
	 * Frame
	 * 
	 * driver.switchTo().frame(locator);
	 * 
	 * driver.switchTo().defaultContent();
	 * 
	 * 
	 * =======================================================
	 * 
	 * 		BROWSER BUTTONS
	 * 
	 * =======================================================
	 * 
	 * driver.navigate().to(url);
	 * driver.navigate().back();
	 * driver.navigate().forward();
	 * driver.navigate().refresh();
	 * 
	 * 
	 * ========================================================
	 * 
	 * 		WAITING CONCEPT
	 * 
	 * =========================================================
	 * 
	 * 1. Implicity Wait - wait for Entire DOM to be loaded
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * 
	 * 2. Explicit Waits - particular component to be loaded
	 * 
	 * WebElement myDynamicElement = (new WebDriverWait(driver, 10))
  			.until(ExpectedConditions.presenceOfElementLocated(By.id("selN9K_chzn")));
	 * 
	 * 
	 * =========================================================
	 * 
	 * 		REMOTE WEBDRIVER
	 * 
	 * =========================================================
	 * 
	 * WebDriver driver = new RemoteWebDriver(
                                new URL("http://localhost:4444/wd/hub"), 
                                DesiredCapabilities.firefox());
                                
        driver.get("http://www.google.com");
	 * 
	 * 
	 * =========================================================
	 * 
	 * 		SCREENSHOT
	 * 
	 * =========================================================
	 * 
	 *  WebDriver augmentedDriver = new Augmenter().augment(driver);
        File screenshot = ((TakesScreenshot)augmentedDriver).
                            getScreenshotAs(OutputType.FILE);
	 * 
	 * 
	 *  
	 */

}

