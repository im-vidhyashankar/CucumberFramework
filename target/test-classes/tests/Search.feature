Feature: Search Functionality

Background: 
Given User opens the application 

Scenario: Search for valid product
When User enters valid product into Search field
And User clicks on search button
Then Valid product should be displayed in the search result 

Scenario: Search for non-existing product
When User enters non-existing product into Search field
And User clicks on search button
Then Proper text informing the user about no product matching should be displayed

Scenario: Search without providing any product
When User donot enter any product into Search field
And User clicks on search button
Then Proper text informing the user about no product matching should be displayed


