package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue={"steps","Apphooks"},
monochrome=true,
plugin= {"pretty","json:target/JSONreport/reports.json","pretty","html:target/reports.html","junit:target/Junitreport/reports.xml",
		"timeline:test-output-thread/"})

public class Testrunner {

}
