package tests;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;

public class Register {
	
	@Given("^User navigate to Register Account page$")
	public void User_navigate_to_Register_Account_page() {
		System.out.println(" User got navigated to Register Account Page");
	}

	@When("User enters firstname {string} into the First Name field")
	public void User_enters_firstname_into_the_First_Name_field(String firstNameText) {
		System.out.println(" User has entered firstname: "+firstNameText+" into the firstname field ");		
	}
	
	@And("Enters lastname {string} into the Last Name field")
	public void enters_lastname_into_the_last_name_field(String lastNameText) {
		System.out.println(" User has entered email: "+lastNameText+" into the lastname field ");		
	}

	@And("Enters email address {string} into the Email field")
	public void enters_email_address_into_the_email_field(String emailText) {
		System.out.println(" User has entered email address: "+emailText+" into the email address field");		
	}

	@And("Enters telephone {string} into the Telephone field")
	public void enters_telephone_into_the_telephone_field(String telephoneText) {
		System.out.println(" User has entered Telephone number : "+telephoneText+" into the telephone field");		
	}

	@And("Enters password {string} into the Password field")
	public void enters_password_into_the_password_field(String passwordText) {
		System.out.println(" User has entered password : "+passwordText+" into the Password field");		
	}

	@And("Enters password {string} into the Password confirm field")
	public void enters_password_into_the_password_confirm_field(String passwordconfirmText) {
		System.out.println(" User has entered confirm password : "+passwordconfirmText+" into the Password confirm field");		
	}

	@When("Selects Privarcy Policy field")
	public void selects_privarcy_policy_field() {
		System.out.println(" User has selected privacy policy field");		
	}

	@When("Clicks on Continue button")
	public void clicks_on_continue_button() {
		System.out.println(" User has clicked on continue button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		System.out.println(" User account got successfully created");
	}

	@When("Selects Yes for Newsletter")
	public void selects_yes_for_newsletter() {
		System.out.println(" User has selected Yes for NewsLetter");
	}

	@When("User dont enter into any fields")
	public void user_dont_enter_into_any_fields() {
		System.out.println(" User has kept asll fields blank");
	}

	@Then("Warning messages should be displayed for the mandatory fields")
	public void warning_messages_should_be_displayed_for_the_mandatory_fields() {
		System.out.println(" Warining message for all the mandatory fields should be displayed");
	}

	@Then("Warning message informing the user about duplicate email should be displayed")
	public void warning_message_informing_the_user_about_duplicate_email_should_be_displayed() {
		System.out.println("Warning message informing the user about duplicate email should be displayed ");

	}
	
}
