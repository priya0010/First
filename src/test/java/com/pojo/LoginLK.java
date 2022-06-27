package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseLK;

public class LoginLK extends BaseLK{
	
	public LoginLK() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement login;
	
	@FindBy(xpath="//div[text()='Welcome, vishal!']")
	private WebElement homePage;
	
	public WebElement getHomePage() {
		return homePage;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
