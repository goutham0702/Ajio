package com.ajio.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {
	
	public static WebDriver driver;
	
	@FindBy(name = "searchVal")
	private WebElement search;
	
	@FindBy(xpath = "//span[text()='tshirts for men']")
	private WebElement tshirt;
	
	@FindBy(xpath = "(//span[@class='facet-left-pane-label'])[3]")
	private WebElement price;
	
	@FindBy(xpath = "//label[@for='Rs.1501-2000']")
	private WebElement price_selection;

	
	public SearchBox(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getPrice_selection() {
		return price_selection;
	}
	
	
	
	

}
