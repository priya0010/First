package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void loadURL(String url) {
		driver.get(url);
	}
	public void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	public void select(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public String getTxt(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public String getTxtMsg(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String currentURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public void clear(WebElement element) {
		element.clear();
	}
	public void quitBrowser() {
		driver.quit();
	}
}
