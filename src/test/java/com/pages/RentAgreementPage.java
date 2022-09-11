package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class RentAgreementPage extends Utility{
	

	public RentAgreementPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='css-19bqh2r']")
	private WebElement dura;
	
	public WebElement getDura() {
		return dura;
	}

	@FindBy(xpath="//*[@id='listPageSearchLocality']")
	private WebElement locality;
	 
	public WebElement getLocality() {
		return locality;
	}

	@FindBy(xpath="//img[@alt='star']")
	private WebElement clkRent;
	

	@FindBy(xpath="//button[@type='button'][1]")
	private WebElement SearchBtn;
	
	@FindBy(id="react-select-3-option-2")
	private WebElement AgreeDur;
	
	@FindBy(name="rentAmount")
	private WebElement MonRent;
	
	@FindBy(name="deposit")
	private WebElement RefDepo;
	
	@FindBy(xpath="//div[@value='TENANT'][2]")
	private WebElement Own;
	
	@FindBy(xpath="//button[@class='default-footer-button btn btn-default']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//button[@class='btn btn-primary'][1]")
	private WebElement PayBtn;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement ConBtn;
	
	public WebElement getClkRent() {
		return clkRent;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getAgreeDur() {
		return AgreeDur;
	}

	public WebElement getMonRent() {
		return MonRent;
	}

	public WebElement getRefDepo() {
		return RefDepo;
	}

	public WebElement getOwn() {
		return Own;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}

	public WebElement getPayBtn() {
		return PayBtn;
	}

	public WebElement getConBtn() {
		return ConBtn;
	}
	
}