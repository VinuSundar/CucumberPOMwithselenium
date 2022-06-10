package com.pages;

import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;

public class Contact {
	WebDriver driver;
	public Contact(WebDriver driver) {
this.driver=driver;

	}

	public String gettitle()
	{
	
		String title = driver.getTitle();
		return title;
	}


	
	public void enterusername(String us)
	{
		driver.findElement(username).sendKeys(us);
	}

	public void enterpassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	

}
