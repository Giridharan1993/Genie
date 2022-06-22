package com.exp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exp.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name ="email")
	@CacheLookup
	WebElement UserName;
	
	@FindBy(name =" password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(id= "btnLogin")
	@CacheLookup
	WebElement Login_button;
	
	@FindBy(xpath="//img[@class ='sidebar-logo h-100']")
	@CacheLookup
	WebElement Genie_img;
	
	@FindBy(xpath ="//a[contains(text(),'Sign Up')]")
	@CacheLookup
	WebElement Signup_link;
	
	//intialization the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validation_title() {
		return driver.getTitle();
	}
	
	public boolean genie_img_validation() {
		return Genie_img.isDisplayed();
		
	}
	
	public HomePage login(String username , String pass) {
		UserName.sendKeys(username);
		Password.sendKeys(pass);
		Login_button.click();
		
		return new HomePage();
	}
	
	
	
	
	
	

}
