package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By listofitems=By.xpath("//div[@class=\'inventory_item_name\']");
	
	public List<String> getitems()
	{
		List<String> homelist = new ArrayList<>();
		List<WebElement> ll = driver.findElements(listofitems);
		for(WebElement newlist:ll)
		{
		String list = newlist.getText();
		System.out.println(list);
		homelist.add(list);
		}return homelist;
	}
	public String gettitle()
	{
	
		String title = driver.getTitle();
		return title;
	}
	public int getsize()
	{
		List<WebElement> ll = driver.findElements(listofitems);
		int i=ll.size();
		return i;
	}
	
}
