 package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR(Object Repository):
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[contains(@type,'submit')]")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[text()='Sign Up']")
	WebElement signupBtn;
	
	@FindBy(xpath = "//div[@class='navbar-header']//a")
	WebElement crmLogo;
	
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
}
	