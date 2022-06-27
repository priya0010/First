package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="com.stepdefinition",
                  plugin= { "json:src\\test\\resources\\Report\\output.json"})

public class TestRunner {


	@AfterClass
	public static void afterClass() {
		
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\output.json");

	}
	
}
