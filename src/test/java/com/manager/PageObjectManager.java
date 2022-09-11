package com.manager;

import com.base.Utility;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.RentAgreementPage;
import com.pages.SearchFunctionalityPage;

public class PageObjectManager extends Utility {

	public LoginPage logInPage;
	public HomePage homePage;
	public SearchFunctionalityPage searchFunctionalityPage;
	public RentAgreementPage rentAgreementPage;

	public LoginPage getLogInPage() {
		return (logInPage == null) ? logInPage = new LoginPage() : logInPage;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage() : homePage;
	}
	
	public SearchFunctionalityPage getSearchFunctionalityPage() {
		return (searchFunctionalityPage == null) ? searchFunctionalityPage = new SearchFunctionalityPage() : searchFunctionalityPage;
	}
	
	public RentAgreementPage getRentAgreementPage() {
		return (rentAgreementPage == null) ? rentAgreementPage = new RentAgreementPage() : rentAgreementPage;
	}
	
}
