Feature: User Registration

Background: 
Given User navigate to Register Account page

Scenario: Register with Mandatory fields
When User enters firstname "Vinu" into the First Name field
And Enters lastname "Testing" into the Last Name field  
And Enters email address "sherpaaus@gmail.com" into the Email field
And Enters telephone 1234567890 into the Telephone field
And Enters password 12345 into the Password field
And Enters password 12345 into the Password confirm field  
And Selects Privarcy Policy field
And Clicks on Continue button
Then Account should get successfully created

Scenario: Register with all fields
When User enters firstname "Vinu" into the First Name field
And Enters lastname "Testing" into the Last Name field  
And Enters email address "sherpaaus@gmail.com" into the Email field
And Enters telephone 1234567890 into the Telephone field
And Enters password 12345 into the Password field 
And Enters password 12345 into the Password confirm field  
And Selects Yes for Newsletter
And Selects Privarcy Policy field
And Clicks on Continue button
Then Account should get successfully created
 
Scenario: Register without providing any fields
When User dont enter into any fields
And Clicks on Continue button
Then Warning messages should be displayed for the mandatory fields

Scenario: Register with duplicate email address
When User enters firstname "Vinu" into the First Name field
And Enters lastname "Testing" into the Last Name field  
And Enters email address "testingvinu7@gmail.com" into the Email field
And Enters telephone 1234567890 into the Telephone field
And Enters password 12345 into the Password field 
And Enters password 12345 into the Password confirm field  
And Selects Yes for Newsletter
And Selects Privarcy Policy field
And Clicks on Continue button
Then Warning message informing the user about duplicate email should be displayed
