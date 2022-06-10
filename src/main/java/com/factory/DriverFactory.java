package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
public WebDriver driver;
public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();

public WebDriver init_browser(String browsername)
{
	if(browsername.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		tldriver.set(new ChromeDriver());
	}
	else if(browsername.equalsIgnoreCase("ff"))
	{
		WebDriverManager.firefoxdriver().setup();
		tldriver.set(new FirefoxDriver());
	}
	else if(browsername.equalsIgnoreCase("IE"))
	{
		WebDriverManager.edgedriver().setup();
		tldriver.set(new InternetExplorerDriver());
	}
	else {
		System.out.println("please pass correct browser " +browsername);
	}
	
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	return getDriver();
}

public static synchronized WebDriver getDriver()
{
	return tldriver.get();
}
	
}
