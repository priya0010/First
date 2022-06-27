package com.step;

	import org.junit.Assert;

import com.base.BaseLK;
	import com.pojo.LoginLK;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class StepLk extends BaseLK{
	    LoginLK l; 
		
		@Given("User launch Linkedin Web Application")
		public void user_launch_Linkedin_Web_Application() {
		    
		}

		@When("User enters valid username and password")
		public void user_enters_valid_username_and_password() {
			
			
			
			l =new LoginLK();
			text(l.getUsername(), "priyaece4d@gmail.com");
			text(l.getPassword(), "8148992965");   
		}

		@When("User Clicks Login Button")
		public void user_Clicks_Login_Button() {
			l =new LoginLK();
			btnClick(l.getLogin());
		}

		@Then("User verify Home Page is displayed")
		public void user_verify_Home_Page_is_displayed() {
			l =new LoginLK();
			String text = getText(l.getHomePage());
			Assert.assertTrue(false);
			System.out.println(text);
			boolean b = text.contains("vishal");
			System.out.println(b);
			
		}
	}

