package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	//What is Page object model?
	// Its concept that makes each element and action on the element reusable. 
	
	WebDriver driver;
	
	public HomePage (WebDriver driver)	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//step 1 - identify/locate the web element
	//WebElement searchBox = driver.findElement(By.name("q"));
	 @FindBy(name="q")
	    WebElement searchbox;
	    public void enterSearchterm(String string)	{
	    	searchbox.sendKeys(string);
	
	
	
	
	//selenium offer 8 different locators
	//id, name, tag, link text, partial link text, class, css, xpath
	
	//step 2 - perform the action
    //searchBox.sendKeys(string);
    
    
    //WebElement searchButton = driver.findElement(By.name("btnK"));
    //searchButton.click();
    
	    	
    }
   
	    @FindBy(name="btnK")
	    WebElement searchButton;
	    public void clickSearch()	{
	    	searchButton.submit();
    	
    }
    
    
	
	
	
	
}
