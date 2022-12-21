package com.hrms.test;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format= {"pretty","html:target/cucucmber-html-report"},tags= {"@Application"})
public class TestRun {
	


}
