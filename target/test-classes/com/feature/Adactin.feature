Feature: Hotel Booking In Adactin Application

Scenario: Login
Given user Launch The Application
When user Enter The Username in Username Field
And user Enter The Password in Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Scenario: Search Hotel
When user Select The Location
And user Select The Hotel
And user Select The Room Type
And user Select The Number Of Rooms
And user Select The Number Of Adults Per Room
And user Select The Number Of Child Per Room
Then user Click The Search Button And It Navigates To The Select Hotel Page

Scenario: User Confirm The Room In Search Hotel Page
When user Click The Select Button
Then user Click The Continue Button It Navigates To The Book A Hotel

Scenario: User Book The Room And Payment Details In Search Hotel page
When user Enter The Valid First Name
And user Enter The Valid Last Name
And user Enter The Billing Address  
And user Enter The Valid Credit Number
And user Choose The Credit Card Type
And user Select The Month In The Expiry Date Box
And user Select The Year In The Expiry Date Box
And user Enter The Valid CVV Number
Then user Click The Book Now Button And It Navigates To The Booking Confirmation

Scenario: User Take Screenshot On The Booking Confirmation Page 
When user Take Screenshot On The Booking Confirmation Page

