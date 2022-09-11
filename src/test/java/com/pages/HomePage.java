package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class HomePage extends Utility {
  
  public HomePage() {
    PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//*[@class='leave-intent-close-icon']")
    private WebElement popUp;
  
  public WebElement getPopUp() {
    return popUp;
  }
  
  @FindBy(xpath="//*[@class='css-19bqh2r']")
  private WebElement indicator;
  
  @FindBy(xpath="//div[contains(text(),'Mumbai')]")
  private WebElement dropDown;
  
  @FindBy(xpath="//*[@id='listPageSearchLocality']")
  private WebElement locality;
  
  @FindBy(xpath="//*[@class='prop-search-button btn btn-primary btn-lg']")
  private WebElement search;
  
  @FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer nb-select_indicator nb-select_dropdown-indicator'])[2]")
  private WebElement tenant;
  
  @FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer nb-select_indicator nb-select_dropdown-indicator'])[3]")
  private WebElement availability;

  public WebElement getAvailability() {
    return availability;
  }

  public WebElement getTenant() {
    return tenant;
  }

  public WebElement getLocality() {
    return locality;
  }

  public WebElement getSearch() {
    return search;
  }

  public WebElement getIndicator() {
    return indicator;
  }

  public WebElement getDropDown() {
    return dropDown;
  }

}