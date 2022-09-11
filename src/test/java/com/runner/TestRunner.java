package com.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\" }, glue = {
		"com\\stepdefinition" }, monochrome = true, dryRun = false, tags = { "@asta" }, plugin = { "pretty",
				"json:src\\test\\resources\\Report\\NoBroker.json" })
public class TestRunner {

	@AfterClass
	public static void afterClass() {

		JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Report\\NoBroker.json");

	}

}