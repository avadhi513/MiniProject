package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Utility {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\MiniProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void type(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void click(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).doubleClick().build().perform();
	}

}
