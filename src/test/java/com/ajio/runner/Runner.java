package com.ajio.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ajio.baseclass.BaseClassConcept;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\ajio\\feature" , glue = "com\\ajio\\stepdefinition" , monochrome = true)

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = BaseClassConcept.get_Browser("chrome");

	}
	
	

}
