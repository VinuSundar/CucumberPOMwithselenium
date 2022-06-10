package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	private WebDriver driver;
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By login=By.id("login-button");
	
	public Loginpage(WebDriver driver)
	{
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
	public HomePage dologin(String un,String pwd)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
		return new HomePage(driver);
	}

	public void login() {
		// TODO Auto-generated method stub
		driver.findElement(login).click();
	}
}
