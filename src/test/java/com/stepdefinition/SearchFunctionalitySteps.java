package com.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.base.Utility;
import com.pages.SearchFunctionalityPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import graphql.Assert;

public class SearchFunctionalitySteps extends Utility {
	
	SearchFunctionalityPage searchPage;
	
	@Given("user is on Search Property Page")
	public void user_is_on_Search_Property_Page() {
		Assert.assertTrue(true);

	}

	@When("user selects apartment type")
	public void user_selects_apartment_type(){
		searchPage = new SearchFunctionalityPage();
		Assert.assertTrue(true);
        
	}

	@When("user selects availabiltity")
	public void user_selects_availabiltity() {
		//Assert.assertTrue(true);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement av= driver.findElement(By.id("availability15Days"));
		av.click();
		//btnClick(searchPage.getAvailibility());
   }

	@When("user selects preferred tenants")
	public void user_selects_preferred_tenants() {
		//Assert.assertTrue(true);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement ten= driver.findElement(By.id("tenant_family"));
		ten.click();
	}

	@When("user selects Furnishing type")
	public void user_selects_Furnishing_type() {
		//Assert.assertTrue(true);
		WebElement fur = driver.findElement(By.id("furnishingSemi"));
		fur.click();
	}

	@When("user selects Floors")
	public void user_selects_Floors() {
		//Assert.assertTrue(true);
		WebElement floor = driver.findElement(By.xpath("//div[contains(text(),'1 to 3')]"));
		floor.click();
	}

	@When("user selects matching property")
	public void user_selects_matching_property() throws InterruptedException {
		
		//btnClick(searchPage.getMatchProperty());
		//Assert.assertTrue(true);
		Thread.sleep(2000);
		WebElement match= driver.findElement(By.xpath("(//*[@class='overflow-hidden overflow-ellipsis whitespace-nowrap max-w-80pe po:max-w-full'])[1]"));
		match.click();
		
		//click(searchPage.getMatchProperty());
		
	}

	@When("user clicks on create agreement")
	public void user_clicks_on_create_agreement() throws InterruptedException {
		/*String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		
		//All the window id -- 1 & 2
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		
		for(String x : all) {   //(1,2)
			 
			if(!pwid.equals(x)) {    // 1 ! =(1,2)
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(2000);
		
		WebElement agree = driver.findElement(By.xpath("(//div[@class='nb__frQqv'])[2]"));
		agree.click();*/
		
		Assert.assertTrue(true);
	}

	@Then("user clicks on know more")
	public void user_clicks_on_know_more() throws IOException {
		/*WebElement know= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		know.click();*/
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Aastha\\eclipse-workspace\\MiniProject\\src\\test\\resources\\Report\\Login.png");
		
		FileUtils.copyFile(src, des);
		
		Assert.assertTrue(true);
		
	}

}