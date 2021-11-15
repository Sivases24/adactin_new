package com.Step_D;

import org.openqa.selenium.WebDriver;

import com.Reader.FileReaderManger;
import com.Sdp_class.Singleton_Design_Pattern;

import FinalProject.com.AdactinFinal.Runner_Class;
import FinalProject.com.AdactinFinal.base_class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defi extends base_class {
	
	public static WebDriver driver = Runner_Class.driver;
	
	public static Singleton_Design_Pattern pom = new Singleton_Design_Pattern(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		geturl("https://adactinhotelapp.com/index.php");
	}

	@When("^user Enter The Username in Username Field$")
	public void user_Enter_The_Username_in_Username_Field() throws Throwable {
		String username = FileReaderManger.getInstanceFRM().getInstance().getusername();
		Inputvalues(pom.getInstanceLg().getUser(), username);
	}

	@When("^user Enter The Password in Password Field$")
	public void user_Enter_The_Password_in_Password_Field() throws Throwable {
		String password = FileReaderManger.getInstanceFRM().getInstance().getpassword();
		Inputvalues(pom.getInstanceLg().getPass(), password);

	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceLg().getLog());
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		dropdown(pom.getInstanceSearch().getLoc(), "Sydney");
	}
	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		dropdown(pom.getInstanceSearch().getHot(), "Hotel Creek");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		 dropdown(pom.getInstanceSearch().getRoom(), "Deluxe");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		 dropdown(pom.getInstanceSearch().getRooms(), "2");
	}

	@When("^user Select The Number Of Adults Per Room$")
	public void user_Select_The_Number_Of_Adults_Per_Room() throws Throwable {
		 dropdown(pom.getInstanceSearch().getAdroom(), "1");
	}

	@When("^user Select The Number Of Child Per Room$")
	public void user_Select_The_Number_Of_Child_Per_Room() throws Throwable {
		 dropdown(pom.getInstanceSearch().getChild(), "3");
	}

	@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		 clickOnElement(pom.getInstanceSearch().getSubmit());
		 waitForSeconds(10);
	}

	@When("^user Click The Select Button$")
	public void user_Click_The_Select_Button() throws Throwable {
		
		clickOnElement(pom.getInstanceHotels().getRadio());
		
	}

	@Then("^user Click The Continue Button It Navigates To The Book A Hotel$")
	public void user_Click_The_Continue_Button_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
		 clickOnElement(pom.getInstanceHotels().getCont());
		    waitForSeconds(10);
	}

	@When("^user Enter The Valid First Name$")
	public void user_Enter_The_Valid_First_Name() throws Throwable {
		String name = FileReaderManger.getInstanceFRM().getInstance().getName();
	    Inputvalues(pom.getInstanceBookPg().getFirst(), name);
	}

	@When("^user Enter The Valid Last Name$")
	public void user_Enter_The_Valid_Last_Name() throws Throwable {
		String lastname = FileReaderManger.getInstanceFRM().getInstance().getLastname();
	    Inputvalues(pom.getInstanceBookPg().getLast(), lastname);
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		   String address = FileReaderManger.getInstanceFRM().getInstance().getAddress();
		    Inputvalues(pom.getInstanceBookPg().getAddress(), address);
	}

	@When("^user Enter The Valid Credit Number$")
	public void user_Enter_The_Valid_Credit_Number() throws Throwable {
	    String creditcardNo = FileReaderManger.getInstanceFRM().getInstance().getCreditcardNo();
	    Inputvalues(pom.getInstanceBookPg().getCC(), creditcardNo);
	}

	@When("^user Choose The Credit Card Type$")
	public void user_Choose_The_Credit_Card_Type() throws Throwable {
		  dropdown(pom.getInstanceBookPg().getCCtype(), "VISA");
	}

	@When("^user Select The Month In The Expiry Date Box$")
	public void user_Select_The_Month_In_The_Expiry_Date_Box() throws Throwable {
		 dropdown(pom.getInstanceBookPg().getExpMon(), "March");
	}

	@When("^user Select The Year In The Expiry Date Box$")
	public void user_Select_The_Year_In_The_Expiry_Date_Box() throws Throwable {
		 dropdown(pom.getInstanceBookPg().getExpyr(), "2022");
	}

	@When("^user Enter The Valid CVV Number$")
	public void user_Enter_The_Valid_CVV_Number() throws Throwable {
		 String cvv = FileReaderManger.getInstanceFRM().getInstance().getCVV();
		    Inputvalues(pom.getInstanceBookPg().getCVV(), cvv);
	}

	@Then("^user Click The Book Now Button And It Navigates To The Booking Confirmation$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation() throws Throwable {
		clickOnElement(pom.getInstanceBookPg().getBooknow());
	    waitForSeconds(10);
	}

	@When("^user Take Screenshot On The Booking Confirmation Page$")
	public void user_Take_Screenshot_On_The_Booking_Confirmation_Page() throws Throwable {
		  Takescreenshot("snap1.png");
	}


}
 

