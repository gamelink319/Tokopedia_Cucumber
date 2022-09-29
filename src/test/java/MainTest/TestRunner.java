package MainTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = ""
				,features = {"src/test/resources/feature/TestTokped.feature"}
				,glue = "MainTest"
				,plugin = {"pretty","html:target/cucumber-Tokpedreports.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

	
}