package Parallel;

//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Parallel",
//glue={"steps","Apphooks"},
glue= {"Parallel"},
monochrome=true,
plugin= {"pretty","json:target/JSONreport/reports.json","pretty","html:target/reports.html","junit:target/Junitreport/reports.xml",
		
		})

public class Parallelrun extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
