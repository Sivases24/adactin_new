package com.pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")
	public WebElement Loc;
	
	@FindBy(xpath = "//select[@name='hotels']")
	public WebElement Hot;
	
	@FindBy(xpath = "//select[@name='room_type']")
	public WebElement Room;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	public WebElement Rooms;
	
	
	@FindBy(xpath = "//select[@name='adult_room']")
	public WebElement Adroom;
	
	@FindBy (xpath = "//select[@name='child_room']")
	public WebElement Child;
	
	@FindBy(xpath = "//input[@name='Submit']")
	public WebElement submit;
	
	public search_Page(WebDriver search ) {
		this.driver = search;
		
		PageFactory.initElements(driver, this); 

	}

	public WebElement getLoc() {
		return Loc;
	}

	public WebElement getHot() {
		return Hot;
	}

	public WebElement getRoom() {
		return Room;
	}

	public WebElement getRooms() {
		return Rooms;
	}


	public WebElement getAdroom() {
		return Adroom;
	}

	public WebElement getChild() {
		return Child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
