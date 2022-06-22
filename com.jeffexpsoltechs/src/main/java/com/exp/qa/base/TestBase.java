package com.exp.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.exp.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

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

	public static void intilization(String browser) {
		
//	String url = prop.getProperty("url");
	String url ="https://app.usegenie.com/login";	
		
	
		String chrome = "Chrome";
		String fireFox = "FireFox";
		String edge = "edge";
		
		if (browser.equals(chrome)) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicity_wait, TimeUnit.SECONDS);
		driver.get(url);
		}
		else if (browser.equals(fireFox)) {
		WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicity_wait, TimeUnit.SECONDS);
		driver.get(url);
		}
		else if (browser.equals(edge)) {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicity_wait, TimeUnit.SECONDS);
		driver.get(url);
		}
	
		
		
	}
}
