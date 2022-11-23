package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.careerhack.common.GoogleBase;
import com.careerhack.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch extends GoogleBase{
	
	

	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		launchBrowser ();
		
		
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		HomePage jhp = new HomePage(driver);
		jhp.enterSearchterm(string);

	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		HomePage jhp = new HomePage(driver);
		jhp.clickSearch();
		
	    
	}

	@Then("I receive relevant results")
	public void i_receive_relevant_results() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assert == validation == expected vs Actual
		
		Assert.assertEquals(title, "Quality Assurance - Google Search");
		
		WebElement results = driver.findElement(By.id("result-stats"));
		
		String numberofResults=results.getText();
		
		System.out.println(numberofResults);
		//Assert.assertEquals(numberofResults, "About 720,000,000 results (0.46 seconds");
		
		closeBrowser();
		// Locating an element should always happen in the page object model
		//HW convert last part into page object model
	 
	}

}
