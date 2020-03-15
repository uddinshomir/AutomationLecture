package com.runner;

//import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import org.testng.annotations.AfterClass;

import java.io.File;


@CucumberOptions(
features = {"src/main/resources/GCR.feature"}, 
glue= {"com.stepdef"},
plugin = {"pretty", "html:target","json:target/cucumber.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	}

)

public class Runner1 extends AbstractTestNGCucumberTests {
//	@AfterClass
//	public static void teardown() {
//		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//		Reporter.setSystemInfo("user", System.getProperty("user.name"));
//		Reporter.setSystemInfo("os", "Mac OSX");
//		Reporter.setTestRunnerOutput("Sample test runner output message");
//	}
}
