package Stepdefinitions;

import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "src/test/Cucumber",
		format = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
		tags = {}
		)
public class CucumberRunner {

    }