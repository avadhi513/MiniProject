package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.Utility;

public class SearchFunctionalityPage extends Utility {

	@FindBy(xpath="//*[@id='listPageSearchLocality']")
	private WebElement search;
	
    @FindBy(xpath="(//*[@class='overflow-hidden overflow-ellipsis whitespace-nowrap max-w-80pe po:max-w-full'])[1]")
    private WebElement matchProperty;
    
    @FindBy(xpath="(//*[@class='font-semi-bold nb__1Z9Qg'])[2]")
    private WebElement createAgree;
    
    @FindBy(xpath="//*[@class='btn btn-default']")
    private WebElement knowMore;
    
    @FindBy(xpath="(//*[@class='unselected'])[3]")
	private WebElement apartment;
	
	@FindBy(id="availability15Days")
	private WebElement availibility;
	
	@FindBy(xpath="//input[@id='tenant_family']")
	private WebElement tenant;
	
	@FindBy(xpath="//input[@id='furnishingSemi']")
	private WebElement furnishing;
	
	@FindBy(xpath="//*[@name='floor1to3']")
	private WebElement floor;
    
	@FindBy(xpath="//*[@class='leave-intent-close-icon']")
    private WebElement popUp;
	
	public WebElement getMatchProperty() {
		return matchProperty;
	}

	public WebElement getCreateAgree() {
		return createAgree;
	}

	public WebElement getKnowMore() {
		return knowMore;
	}

	public WebElement getPopUp() {
		return popUp;
	}

	public WebElement getTenant() {
		return tenant;
	}

	public WebElement getFurnishing() {
		return furnishing;
	}

	public WebElement getFloor() {
		return floor;
	}

	public WebElement getAvailibility() {
		return availibility;
	}

	public WebElement getApartment() {
		return apartment;
	} 

    public WebElement getSearch() {
		return search;
	}

}