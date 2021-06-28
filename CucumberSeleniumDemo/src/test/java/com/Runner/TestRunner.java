package com.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Ashish\\git\\CucumberBDDDemo\\CucumberSeleniumDemo\\src\\test\\java\\com\\Features\\Login.feature", //the path of the feature files
		glue={"StepDefination"} //the path of the step definition files
				
		)

public class TestRunner {

}
