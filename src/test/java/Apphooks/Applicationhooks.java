package Apphooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.util.Configreader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Applicationhooks {
	private DriverFactory driverfactory;
	private WebDriver driver;
	private Configreader configReader;
	Properties prop;
	
	@Before(order=0)
	public void getproperty()
	{
		configReader = new Configreader();
		try {
			 prop=configReader.getfile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Before(order=1)
	public void lanchbrowser()
	{
		String browsername=prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driver = driverfactory.init_browser(browsername);
		driver.get(prop.getProperty("url"));
		
	}

	@After(order=0)
	public void teardown()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void takescreenshot(Scenario scenario)
	{if(scenario.isFailed()) {
		String screenshotName= scenario.getName().replaceAll(" ","_");
		byte[] sourcePath=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);
	}}
}
