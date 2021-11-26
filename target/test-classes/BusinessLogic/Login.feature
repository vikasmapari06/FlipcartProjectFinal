Feature: Login Functionality

Background: User is on flipcart main page and mouse over login button
Given user open browser "FF" with exe "F:\\Automation support\\geckodriver.exe"
Given user enter url as "https://www.flipkart.com/"
Given user cancel initial login button
Given user move on Login button

@SmokeTest
Scenario: Login functionality with valid credentials
When user click on my profile
When user enter "vikasmapari06@gmail.com" as username
When user enter "vikas26884" as password
When user click on login button 
Then Application shows profile to user 
