package com.tem.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				//strict = true,
				features = "classpath:features",
				glue = {"com.tem.stepdefinitions","com.tem.hooks"},
				plugin = {"html:target/cucumber-pretty-report/regression-tests.html",
						"json:target/cucumber.json"},
				tags = "@Regression"
			
)

public class RegressionTestRunner {

}
