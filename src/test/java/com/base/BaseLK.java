package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLK {
	
	public static WebDriver driver;
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void loadURL(String url) {
		driver.get(url);
	}
	public void text(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void title() {
		driver.getTitle();
	}
	
	public void btnClick(WebElement element) {
		element.click();
	}
	
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public void close() {
		driver.quit();
	}

}
