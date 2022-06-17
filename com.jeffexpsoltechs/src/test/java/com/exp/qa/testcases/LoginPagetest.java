package com.exp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.exp.qa.base.TestBase;
import com.exp.qa.pages.HomePage;
import com.exp.qa.pages.LoginPage;

public class LoginPagetest extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	
	public LoginPagetest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intilization();
	    loginpage = new LoginPage();
	}
	
//	@Test
//	public void LoginpageTitleTest() {
//		String title = loginpage.validation_title();
//		Assert.assertEquals(title, "Genie");
//	}
	
	@Test
	public void genielogoTest() {
		Boolean flag = loginpage.genie_img_validation();
		Assert.assertTrue(flag);
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
