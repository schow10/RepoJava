package com.careerhack.advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {

	public static void main(String[] args) {
		
				
				ChromeDriver driver; 
				
				WebDriverManager.chromedriver().setup(); 
				
				driver = new ChromeDriver(); 
				
				driver.get("https://the-internet.herokuapp.com/hovers");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				WebElement a = driver.findElement(By.xpath("//img[@alt='User Avatar])[1]"));
				
				WebElement b = driver.findElement(By.xpath("(//a[contains(text(),'View profile')])[1]"));
				
				Actions act = new Actions(driver);
				
				act.moveToElement(a).moveToElement(b).build().perform();
				
				
				//tagname[contains(text(),'value')] contains method to finding xpath
				
				
				

			}




	}

