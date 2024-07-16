@all
Feature: Search Functionality

# The below statements demonstrates the use of background of Gherkin keyword

Background: 
Given User opens the application 

@search @validproduct @smoke @regression
Scenario: Search for valid product
When User enters valid product into Search field
And User clicks on search button
Then Valid product should be displayed in the search result 
#But Invalid product should not be displayed in search results

@search @nonexistingproduct @regression
Scenario: Search for non-existing product
When User enters non-existing product into Search field
And User clicks on search button
Then Proper text informing the user about no product matching should be displayed

@search @noproduct @regression
Scenario: Search without providing any product
When User donot enter any product into Search field
And User clicks on search button
Then Proper text informing the user about no product matching should be displayed


