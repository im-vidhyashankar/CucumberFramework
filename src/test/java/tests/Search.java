package tests;

import io.cucumber.java.en.*;

public class Search {
	
	
	@Given("User opens the application")
	public void user_opens_the_application() {
		System.out.println("Application got opened");
	}

	@When("User enters valid product into Search field")
	public void user_enters_valid_product_into_search_field() {
		System.out.println("Valid products entered into search field");
	}

	@And("User clicks on search button")
	public void user_clicks_on_search_button() {
		System.out.println("User clicks on search button");
	}

	@Then("Valid product should be displayed in the search result")
	public void valid_product_should_be_displayed_in_the_search_result() {
		System.out.println("Valid product got displayed in the search result");
	}

	@When("User enters non-existing product into Search field")
	public void user_enters_non_existing_product_into_search_field() {
		System.out.println("Non-existing product entered into Search field");
			}

	@Then("Proper text informing the user about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
		System.out.println("No product message got displayed");
	}

	@When("User donot enter any product into Search field")
	public void user_donot_enter_any_product_into_search_field() {
		System.out.println("User not entered any product ");
	
	}




}
