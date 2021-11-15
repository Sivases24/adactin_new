package com.pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public WebDriver driver;
	
	@FindBy(xpath =  "//input[@id='username']")
	public WebElement user;
	
	@FindBy(xpath  = "//input[@id='password']")
	public WebElement pass;
	
	@FindBy(xpath = "//input[@id='login']")
	public  WebElement log;
	
	public Login_page (WebDriver lg) {
		   this.driver = lg;
				
				PageFactory.initElements(driver, this); 
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}
	
	
  
	

}
