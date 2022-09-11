package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class LoginPage extends Utility {
	
	WebDriver driver;
	
	public LoginPage() {
		
		driver = getDriver();
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='nb__19hcF']//following::div[2]")
	public WebElement loginBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Mobile Number']")
	public WebElement phnNo;
	
	@FindBy(xpath="//div[@class='login-signup-form-group step3 show ']/label[2]/input")
	public WebElement passBtn;
	
	@FindBy(xpath="//*[@id='login-signup-form__password-input']")          
	public WebElement password;
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	public WebElement conBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getPhnNo() {
		return phnNo;
	}

	public WebElement getPassBtn() {
		return passBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConBtn() {
		return conBtn;
	}
	
}
