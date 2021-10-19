package com.ajio.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ajio.baseclass.BaseClassConcept;
import com.ajio.pom.SearchBox;
import com.ajio.runner.Runner;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClassConcept{
	
	public static WebDriver driver = Runner.driver;
	
	SearchBox sb = new SearchBox(driver);
	
	@Given("User want to launch the web application")
	public void user_want_to_launch_the_web_application() throws Throwable {
			get_URL("https://www.ajio.com/");
	}
	
	@When("User need to select the search text box")
	public void user_need_to_select_the_search_text_box() {
		InputValueElement(sb.getSearch(), "tshirts for men");
		
	}
	
	@When("User want to enter the product")
	public void user_want_to_enter_the_product() throws AWTException {
		SelectElement(sb.getTshirt());
		
	}
	
	@When("User want to select the price range")
	public void user_want_to_select_the_price_range() {
		SelectElement(sb.getPrice());
	}
	
	@Then("Verify the product and price")
	public void verify_the_product_and_price() {
		SelectElement(sb.getPrice_selection());
	}

}
