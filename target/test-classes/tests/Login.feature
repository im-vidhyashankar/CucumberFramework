Feature: User Login
Registered used should be able to login to access account details

Background: 
Given User navigates to login page

Scenario Outline: Login with valid credentials
When User enters valid email address <email>
And Enter valid password <password>
And Clicks on login button
Then User should login successfully
Examples: 
|email										|password|
|testingvinu7@gmail.com	|Testing@12345 |
|testingvinu8@gmail.com	|Testing@12545 |
|testingvinu9@gmail.com	|Testing@123445|


#Scenario:  Login with valid credentials
#When User enters valid email address "testingvinu7@gmail.com"
#And Enter valid password "Test12345"
#And Clicks on login button
#Then User should login successfully
 
Scenario: Login with invalid credentials
When User enters invalid email address "testingvinu1@gmail.com"
And Enter valid password "232432"
And Clicks on login button
Then User should a proper warning message

Scenario: Login with valid email address and invalid password
When User enters valid email address "testingvinu0@gmail.com"
And Enter invalid password "27327"
And Clicks on login button
Then User should a proper warning message

Scenario: Login with invalid email address and valid password
When User enters invalid email address "testingvinu2@gmail.com"
And Enter valid password "Testing@12345"
And Clicks on login button
Then User should a proper warning message

Scenario: Login without provinding any credentials
When User dont enter any credentials
And Clicks on login button
Then User should a proper warning message
