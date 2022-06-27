package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reports {

	public static void generateJVMReport(String jsonFile) {
		
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report");
		
		Configuration c=new Configuration(f, "linked");
		
		c.addClassifications("platformName", "windows");
		c.addClassifications("platformVersion", "10");
		c.addClassifications("buildNumber", "125896");
		c.addClassifications("sprintNumber", "85");
		
		List<String> jsonFiles =new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder=new ReportBuilder(jsonFiles, c);
		builder.generateReports();

	}
}
