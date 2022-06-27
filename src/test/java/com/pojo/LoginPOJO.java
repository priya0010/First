package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPOJO extends LibGlobal{

	public LoginPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(xpath="//td[contains(text(),'Search')]")
	private WebElement text;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement roomnos;
	@FindBy(id="datepick_in")
	private WebElement datepickin;
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	@FindBy(id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement childroom;
	@FindBy(id="Submit")
	private WebElement Submit;
	@FindBy(xpath="//td[contains(text(),'Select')]")
	private WebElement text1;
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id="continue")
	private WebElement cont;
	@FindBy(xpath="//td[contains(text(),'Book')]")
	private WebElement text2;
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnum;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(id="cc_cvv")
	private WebElement cccvv;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(xpath="//input[@name='order_no'][@type='text']")
	private WebElement order;
	public WebElement getOrder() {
		return order;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getText1() {
		return text1;
	}
	public WebElement getText2() {
		return text2;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getDatepickin() {
		return datepickin;
	}
	public WebElement getDatepickout() {
		return datepickout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getCont() {
		return cont;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}
	public WebElement getCcexpyear() {
		return ccexpyear;
	}
	public WebElement getCccvv() {
		return cccvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getText() {
		return text;
	}
}
