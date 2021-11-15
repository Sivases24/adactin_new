package com.pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name ='first_name']")
	public WebElement First;
	
	@FindBy(xpath = "//input[@name ='last_name']")
	public WebElement Last;
	
	@FindBy(xpath = "//textarea[@name ='address']")
	public WebElement Address;
	
	@FindBy(xpath = "//input[@name ='cc_num']")
	public WebElement CC;
	
	@FindBy(xpath = "//select[@name ='cc_type']")
	public WebElement CCtype;
	
	@FindBy(xpath = "//select[@name ='cc_exp_month']")
	public WebElement ExpMon;
	
	@FindBy(xpath = "//select[@name ='cc_exp_year']")
	public WebElement Expyr;
	
	@FindBy(xpath = "//input[@name ='cc_cvv']")
	public WebElement CVV;
	
	@FindBy(xpath = "//input[@name='book_now']")
	public WebElement booknow;
	
	
	public Book_Page(WebDriver Booking) {
		this.driver = Booking;
		
		PageFactory.initElements(driver, this); 

	}


	public WebElement getFirst() {
		return First;
	}


	public WebElement getLast() {
		return Last;
	}


	public WebElement getAddress() {
		return Address;
	}


	public WebElement getCC() {
		return CC;
	}


	public WebElement getCCtype() {
		return CCtype;
	}


	public WebElement getExpMon() {
		return ExpMon;
	}


	public WebElement getExpyr() {
		return Expyr;
	}


	public WebElement getCVV() {
		return CVV;
	}


	public WebElement getBooknow() {
		return booknow;
	}
	
	

}
