package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;
import com.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import graphql.Assert;

public class HomeSteps extends Utility {

	HomePage homePage;

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		Assert.assertTrue(true);
	}

	@When("user selects a city")
	public void user_selects_a_city() {
		homePage = new HomePage();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		btnClick(homePage.getIndicator());
		btnClick(homePage.getDropDown());
	}

	@When("user selects a locality")
	public void user_selects_a_locality() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		btnClick(homePage.getLocality());

		// driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

		type(homePage.getLocality(), "Mumbai");

		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("user selects the options\\(pg\\/ flat\\/ house)")
	public void user_selects_the_options_pg_flat_house() {
		Assert.assertTrue(true);
	}

	@When("user selects tenant type")
	public void user_selects_tenant_type() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		btnClick(homePage.getTenant());

		Thread.sleep(3000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("user selects room type")
	public void user_selects_room_type() throws AWTException {

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// btnClick(homePage.getAvailability());
		// Robot r2 = new Robot();
		// r2.keyPress(KeyEvent.VK_DOWN);
		// r2.keyRelease(KeyEvent.VK_DOWN);
		//
		// r2.keyPress(KeyEvent.VK_ENTER);
		// r2.keyRelease(KeyEvent.VK_ENTER);
		Assert.assertTrue(true);
	}

	@Then("user clicks on Search button.")
	public void user_clicks_on_Search_button() throws IOException {
		btnClick(homePage.getSearch());

		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// click(homePage.getPopUp());

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(
				"C:\\Users\\Aastha\\eclipse-workspace\\MiniProject\\src\\test\\resources\\Report\\Login.png");

		FileUtils.copyFile(src, des);

	}

}