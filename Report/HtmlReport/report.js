$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username in Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password in Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defi.user_Launch_The_Application()"
});
formatter.result({
  "duration": 9061849800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Enter_The_Username_in_Username_Field()"
});
formatter.result({
  "duration": 2068856700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Enter_The_Password_in_Password_Field()"
});
formatter.result({
  "duration": 241463600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 3438858000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select The Number Of Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select The Number Of Child Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Click The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defi.user_Select_The_Location()"
});
formatter.result({
  "duration": 767311300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 345966600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 321709200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 244003000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Select_The_Number_Of_Adults_Per_Room()"
});
formatter.result({
  "duration": 279736900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Select_The_Number_Of_Child_Per_Room()"
});
formatter.result({
  "duration": 285808900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1626987000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User Confirm The Room In Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirm-the-room-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user Click The Select Button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Click The Continue Button It Navigates To The Book A Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defi.user_Click_The_Select_Button()"
});
formatter.result({
  "duration": 168217000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Click_The_Continue_Button_It_Navigates_To_The_Book_A_Hotel()"
});
formatter.result({
  "duration": 974546400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User Book The Room And Payment Details In Search Hotel page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-book-the-room-and-payment-details-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "user Enter The Valid First Name",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Enter The Valid Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Enter The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enter The Valid Credit Number",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Choose The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Select The Month In The Expiry Date Box",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Select The Year In The Expiry Date Box",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Enter The Valid CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Click The Book Now Button And It Navigates To The Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defi.user_Enter_The_Valid_First_Name()"
});
formatter.result({
  "duration": 882975400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Enter_The_Valid_Last_Name()"
});
formatter.result({
  "duration": 357179100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Enter_The_Billing_Address()"
});
formatter.result({
  "duration": 440838000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Enter_The_Valid_Credit_Number()"
});
formatter.result({
  "duration": 302280100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Choose_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 275736100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Select_The_Month_In_The_Expiry_Date_Box()"
});
formatter.result({
  "duration": 274347200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Select_The_Year_In_The_Expiry_Date_Box()"
});
formatter.result({
  "duration": 339486300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Enter_The_Valid_CVV_Number()"
});
formatter.result({
  "duration": 209361800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defi.user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation()"
});
formatter.result({
  "duration": 184974800,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User Take Screenshot On The Booking Confirmation Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-take-screenshot-on-the-booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "user Take Screenshot On The Booking Confirmation Page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Defi.user_Take_Screenshot_On_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 1152316000,
  "status": "passed"
});
});