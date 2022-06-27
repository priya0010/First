package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.Reports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features1\\instagram.feature", 
                    glue="com.step",dryRun=false, plugin= {"pretty","junit:src\\test\\resources\\Report\\Sample.xml",
                    		"html:src\\test\\resources\\Report",
                    		"json:src\\test\\resources\\Report\\out.json","rerun:src\\test\\resources\\failed.txt"},monochrome=true)

public class TestRunnerLK {
	
	@AfterClass
	public static void afterClass() {
		
		Reports.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\out.json");

	}

	
}
