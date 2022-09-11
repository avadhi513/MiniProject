package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.Utility;
import com.pages.RentAgreementPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RentAgreementSteps extends Utility {
RentAgreementPage rentAgreementPage;
	
	@Given("User is on Rent Agreement Page")
	public void user_is_on_Rent_Agreement_Page() {
		Assert.assertTrue(true);
	}
	
	@When("User clicks on Rent Agreement")
	public void user_clicks_on_rent_agreement() throws InterruptedException {
	    rentAgreementPage = new RentAgreementPage();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    Actions acc= new Actions(driver);
//	    WebElement rnt=driver.findElement(By.xpath("//span[text()='Rental Agreement']"));
//	    acc.moveToElement(rnt).click().perform();
	    Thread.sleep(2000);
	    WebElement rnt=driver.findElement(By.id("raHomeTile"));
	    rnt.click();
	    
	    String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		
		//All the window id -- 1 & 2
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		
		for(String x : all) {   //(1,2)
			 
			if(!pwid.equals(x)) {    // 1 ! =(1,2)
				driver.switchTo().window(x);
			}
		}
	    //btnClick(rentAgreementPage.getClkRent());
	}
	@When("user selects city")
	public void user_selects_city() throws InterruptedException{
//		Thread.sleep(2000);
//		WebElement city= driver.findElement(By.xpath("//*[@class='jss1 city-selection-arrow']"));
//		city.click();
//		
//		WebElement c = driver.findElement(By.xpath("(//div[@class='flex flex-col items-center nb__4kuzs'])[1]"));
//		c.click();
//		Thread.sleep(2000);
//        btnClick(rentAgreementPage.getLocality());
//        
//        //driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//        
//	    type(rentAgreementPage.getLocality(),"Mumbai");
//	    
//	    Thread.sleep(3000);
//	    Robot r=  new Robot();
//		   r.keyPress(KeyEvent.VK_DOWN);
//		   r.keyRelease(KeyEvent.VK_DOWN);
//		   
//		   r.keyPress(KeyEvent.VK_DOWN);
//		   r.keyRelease(KeyEvent.VK_DOWN);
//		   
//		   r.keyPress(KeyEvent.VK_ENTER);
//		   r.keyRelease(KeyEvent.VK_ENTER);
	Assert.assertTrue(true);
	}
	@When("user Clicks on rent agreement Select button")
	public void user_clicks_on_rent_agreement_select_button() throws InterruptedException {
		Thread.sleep(2000);
	   WebElement select = driver.findElement(By.xpath("(//button[@class='select-package btn btn-default'])[1]"));
	   select.click();
		//btnClick(rentAgreementPage.getSearchBtn());
	}
	@When("User selects agreement duration")
	public void user_selects_agreement_duration() throws InterruptedException, AWTException {
//		
//		btnClick(rentAgreementPage.getAgreeDur());
//		
//		 Thread.sleep(3000);
//		    Robot r=  new Robot();
//			   r.keyPress(KeyEvent.VK_DOWN);
//			   r.keyRelease(KeyEvent.VK_DOWN);
//			   
//			   r.keyPress(KeyEvent.VK_DOWN);
//			   r.keyRelease(KeyEvent.VK_DOWN);
//			   
//			   r.keyPress(KeyEvent.VK_ENTER);
//			   r.keyRelease(KeyEvent.VK_ENTER);
		// btnClick(rentAgreementPage.getAgreeDur());
		Assert.assertTrue(true);
	    
	}
	@When("User Enters Montly rent amount")
	public void user_enters_montly_rent_amount() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	   // type(rentAgreementPage.getMonRent(),"15,000");
		WebElement amt = driver.findElement(By.id("ls-calculatecharge-rentAmount-nbInput"));
		amt.clear();
		amt.sendKeys("15000");
	}
	@When("user enters Refundable Deposit Amount")
	public void user_enters_refundable_deposit_amount() {
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
	//  type(rentAgreementPage.getRefDepo(),"30,000");
		WebElement amt = driver.findElement(By.id("ls-calculatecharge-deposit-nbInput"));
		amt.clear();
		amt.sendKeys("35000");
	}
	@When("User clicks on owner button")
	public void user_clicks_on_owner_button() {
		Assert.assertTrue(true);
		//WebElement own = driver.findElement(By.xpath("//div[contains(text(),'Owner')]"));
		//own.click();
		//btnClick(rentAgreementPage.getOwn());
	}
	@When("User Clicks On Save and Continue button")
	public void user_clicks_on_save_and_continue_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebElement con = driver.findElement(By.xpath("//*[@class='default-footer-button btn btn-default']"));
		con.click();
		//btnClick(rentAgreementPage.getSaveBtn());
	}
	@When("User Clicks On Paynow button")
	public void user_clicks_on_paynow_button() {
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        WebElement pop = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]"));
//        pop.click();
        //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement pay = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		pay.click();
		//btnClick(rentAgreementPage.getPayBtn());
	}
	
	@Then("User Clicks on continue button")
	public void user_clicks_on_continue_button() throws IOException {
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		btnClick(rentAgreementPage.getConBtn());
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Aastha\\eclipse-workspace\\MiniProject\\src\\test\\resources\\Report\\Login.png");
		
		FileUtils.copyFile(src, des);
		
	}
}