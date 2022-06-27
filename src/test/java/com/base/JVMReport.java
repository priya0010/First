package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	 public static void generateJVMReport(String jsonFile) {
		 
		 File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report");
		 
		 Configuration conf =new Configuration(loc, "Adactin Hotel");
		 
		 conf.addClassifications("platformName", "windows");
		 conf.addClassifications("platformVersion", "10");
		 conf.addClassifications("buildNumber", "589645");
		 conf.addClassifications("sprintNumber", "25");
		 
		 List<String> jsonFiles =new ArrayList<String>();
		 jsonFiles.add(jsonFile);
		 
		 ReportBuilder builder=new ReportBuilder(jsonFiles, conf);
		 builder.generateReports();

		 
	}
		

	
}
