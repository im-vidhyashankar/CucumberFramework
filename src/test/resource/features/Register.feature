@all
Feature: User Registration

Background: 
Given User navigate to Register Account page

@register @mandatoryfields @smoke @regression
Scenario: Register with Mandatory fields

When User enters below details into the fields
|firstname			|Vinu|
|lastname				|Testing|
|email address		|sherpaaus@gmail.com|
|telephone			|1234567890|
|password				|12345|
And Selects Privarcy Policy field
And Clicks on Continue button
Then Account should get successfully created

@register @allfields @smoke @regression
Scenario: Register with all fields
When User enters below details into the fields
|firstname			|Vinu|
|lastname				|Testing|
|email address		|sherpaaus@gmail.com|
|telephone			|1234567890|
|password				|12345|
And Selects Yes for Newsletter
And Selects Privarcy Policy field
And Clicks on Continue button
Then Account should get successfully created
 
@register @notdetails @regression 
Scenario: Register without providing any fields
When User dont enter into any fields
And Clicks on Continue button
Then Warning messages should be displayed for the mandatory fields

@register @duplicateemail @regression
Scenario: Register with duplicate email address
When User enters below details into the fields
|firstname			|Vinu|
|lastname				|Testing|
|email address		|testing9@gmail.com|
|telephone			|1234567890|
|password				|12345|
And Selects Yes for Newsletter
And Selects Privarcy Policy field
And Clicks on Continue button
Then Warning message informing the user about duplicate email should be displayed
