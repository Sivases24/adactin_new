package com.pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
public WebDriver driver;

@FindBy(xpath = "//input[@name ='radiobutton_0']")
public WebElement radio;

@FindBy(xpath = "//input[@name ='continue']")
public WebElement Cont;

public Search_Hotel(WebDriver Hotels ) {
	
	this.driver = Hotels;
	
	PageFactory.initElements(driver, this); 

}

public WebElement getRadio() {
	return radio;
}

public WebElement getCont() {
	return Cont;
}
	

}
