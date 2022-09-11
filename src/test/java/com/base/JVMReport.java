package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonFile) {
		// location of jvm report
		File loc = new File(System.getProperty("user.dir") + "src\\test\\resources\\Report");

		// Configuration
		Configuration con = new Configuration(loc, "NoBroker Automation");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser version", "100");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Testing", "Regression");

		// List
		List<String> jsonfiles = new ArrayList<String>();

		jsonfiles.add(jsonFile);

		// Generate the report

		ReportBuilder builder = new ReportBuilder(jsonfiles, con);
		builder.generateReports();

	}

}
