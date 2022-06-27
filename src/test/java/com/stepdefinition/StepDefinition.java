package com.stepdefinition;

import com.base.LibGlobal;
import com.pojo.LoginPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition  extends LibGlobal{
	 LoginPOJO l;
	
	@Given("User launch Adactin web application")
	public void user_launch_Adactin_web_application() {
	}

	@When("User enters valid {string} and  {string}")
	public void user_enters_valid_and(String string, String string2) {
		   l=new LoginPOJO();
		   type(l.getUsername(),string);
		   type(l.getPassword(), string2);
	}
	
	@When("User clicks Login Button")
	public void user_clicks_Login_Button() {
		 l=new LoginPOJO();
		 btnClick(l.getLogin());
	}

	@Then("User verify Search Hotel is displayed")
	public void user_verify_Search_Hotel_is_displayed() {
		l=new LoginPOJO();
		String msg = getTxtMsg(l.getText());
		System.out.println(msg);
		boolean b = msg.contains("Search");
		System.out.println(b);  
	}
	
	@When("User selects valid {string},{string},{string},{string},enters {string},{string}and selects {string},{string}")
	public void user_selects_valid_enters_and_selects(String location,String hotel,String roomtype,String roomno,String datain,String dataout,String adult,String child) {
		l=new LoginPOJO();
        select(l.getLocation(), location);
        select(l.getHotels(), hotel);
        select(l.getRoomtype(), roomtype);
        select(l.getRoomnos(), roomno);
        clear(l.getDatepickin());
        type(l.getDatepickin(), datain);
        clear(l.getDatepickout());
        type(l.getDatepickout(), dataout);
        select(l.getAdultroom(), adult);
        select(l.getChildroom(), child);
	}
	

	@When("User clicks Search Button")
	public void user_clicks_Search_Button() {
		l=new LoginPOJO();
		btnClick(l.getSubmit()); 
	}

	@Then("User verify Select Hotel is displayed")
	public void user_verify_Select_Hotel_is_displayed() {
		l=new LoginPOJO();
		String msg = getTxtMsg(l.getText1());
		System.out.println(msg);
		boolean b = msg.contains("Select");
		System.out.println(b);   
	}

	@When("User clicks Radio Button")
	public void user_clicks_Radio_Button() {
		l=new LoginPOJO();
		btnClick(l.getRadiobutton());
	}

	@When("User clicks Continue Button")
	public void user_clicks_Continue_Button() {
		l=new LoginPOJO();
		btnClick(l.getCont());
	}

	@Then("User Verify Book A Hotel is displayed")
	public void user_Verify_Book_A_Hotel_is_displayed() {
		l=new LoginPOJO();
		String msg = getTxtMsg(l.getText2());
		System.out.println(msg);
		boolean b = msg.contains("Book");
		System.out.println(b);
	}
	
	@When("User enters valid {string},{string},{string},{string},selects valid {string},{string},{string} and enters{string}")
	public void user_enters_valid_selects_valid_and_enters(String first,String last,String address,String ccnum,String cctype,String month,String year,String cvv) {
		l=new LoginPOJO();
		type(l.getFirstname(), first);
		type(l.getLastname(), last);
		type(l.getAddress(), address);
		type(l.getCcnum(), ccnum);
		select(l.getCctype(), cctype);
		select(l.getCcexpmonth(), month);
		select(l.getCcexpyear(), year);
		type(l.getCccvv(), cvv);
	}
	
	@When("User clicks Book Now Button")
	public void user_clicks_Book_Now_Button() {
		l=new LoginPOJO();
		btnClick(l.getBooknow());
	}

	@Then("User verify Order No is displayed")
	public void user_verify_Order_No_is_displayed() throws InterruptedException {
		Thread.sleep(8000);
		l=new LoginPOJO();
		String txt = getTxt(l.getOrder());
	    System.out.println(txt);
	    
	}
}
