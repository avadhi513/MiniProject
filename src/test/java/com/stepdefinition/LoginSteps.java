package com.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.base.Utility;
import com.manager.PageObjectManager;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends Utility {

	WebDriver driver = null;
	PageObjectManager pm;
	LoginPage loginPage;

	@Given("Launch the browser")
	public void launch_the_browser() {
		getDriver();
        getUrl("https://www.nobroker.in/");
        
	}

	@When("user Clicks on Login button")
	public void user_Clicks_on_Login_button() {
		
		/*pm= new PageObjectManager();
		loginPage = pm.getLogInPage();*/
		loginPage = new LoginPage();
		driver.findElement(By.id("login-signup-form-login-radio-password")).click();
		}

	@When("Enters Phone Number")
	public void enters_Phone_Number() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		type(loginPage.getPhnNo(),"7900174454");
	}
	

	@When("Clicks on I have Passowrd")
	public void clicks_on_I_have_Passowrd() {
		//Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("login-signup-form-login-radio-password")).click();
	}

	@When("Enters the Password")
	public void enters_the_Password() {
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		type(loginPage.getPassword(),"riya2540");
		
	}

	@Then("Click on the Continue button")
	public void click_on_the_Continue_button() throws IOException {
		driver.findElement(By.id("login-signup-form-login-radio-password")).click();
	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	       TakesScreenshot tk = (TakesScreenshot)driver;
			
			File src = tk.getScreenshotAs(OutputType.FILE);
			
			File des = new File("C:\\Users\\Aastha\\eclipse-workspace\\MiniProject\\src\\test\\resources\\Report\\Login.png");
			
			FileUtils.copyFile(src, des);
	
	}
}
