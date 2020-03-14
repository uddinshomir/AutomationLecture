package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
features = {"src/main/resources/GCR.feature"}, 
glue= {"com.stepdef"},
plugin = {"pretty", "html:target","json:target/cucumber.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	}

)

public class Runner1 extends AbstractTestNGCucumberTests {

}
