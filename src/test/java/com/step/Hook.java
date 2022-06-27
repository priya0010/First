package com.step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseLK;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseLK{
	
	@Before
	public void beforeScenario() {
		launchBrowser();
		loadURL("https://www.linkedin.com/checkpoint/rm/sign-in-another-account?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

	}
	
	@After
	public void afterScenario(Scenario s) {
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		byte[] as = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(as, "image/png");
		
		close();
		
		

	}

}
