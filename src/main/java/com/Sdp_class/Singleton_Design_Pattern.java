package com.Sdp_class;

import org.openqa.selenium.WebDriver;

import com.pom_Class.Book_Page;
import com.pom_Class.Login_page;
import com.pom_Class.Search_Hotel;
import com.pom_Class.search_Page;

public class Singleton_Design_Pattern {
public WebDriver driver;

private Login_page Lg;
private search_Page Search;
private Search_Hotel hotels;
private Book_Page BookPg;
	
	public Singleton_Design_Pattern(WebDriver driver1) {
		this.driver = driver1;
		
		

	}

	public Login_page getInstanceLg() {
		Lg = new Login_page(driver);
		return Lg;
	}

	public search_Page getInstanceSearch() {
		Search = new search_Page(driver);
		return Search;
	}

	public Search_Hotel getInstanceHotels() {
		hotels = new Search_Hotel(driver);
		return hotels;
	}

	public Book_Page getInstanceBookPg() {
		BookPg = new Book_Page(driver);
		return BookPg;
	}
	

	
	


	
	

}
