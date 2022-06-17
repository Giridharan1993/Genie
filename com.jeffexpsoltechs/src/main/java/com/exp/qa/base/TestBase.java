package com.exp.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.exp.qa.util.TestUtil;

public class TestBase {
	
	public static Properties prop;
	
	public static WebDriver driver;

	public TestBase() {
		
		try{
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\est0204\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe"
				+ "src\\main\\java\\com\\exp\\qa\\configure");
		prop.load(ip);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			}
		catch(IOException e) {
			e.printStackTrace();
		    }
		
		}

	public static void intilization() {
		
//	String url =prop.getProperty("url");
	String url ="https://app.usegenie.com/login";	
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\est0204\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicity_wait, TimeUnit.SECONDS);
	driver.get(url);
	
		
		
	}
}
