package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	
	private Properties prop;
	
  public Properties getfile() throws IOException
  {
	prop=new Properties();
   FileInputStream ip;
try {
	ip = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\CucumberPOMwithselenium\\src\\test\\resources\\config\\config.properties");
	prop.load(ip);
} catch (FileNotFoundException e1) {e1.printStackTrace();}

return prop;
  }
}
