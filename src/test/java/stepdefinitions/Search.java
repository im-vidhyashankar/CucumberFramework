package stepdefinitions;

//import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class Search {
	
	
			/*
			Hooks in Cucumber :  This can be added any one feature file and all applies to all feature files and executes for every complete scenario start and end
		
			@Before
			public void  setup() {
				System.out.println("Browser got opened");
			}
			
			@After
			public void tearDown() {
				System.out.println("Browser got closed");
			}
			*/
	
	
			/*
			Tagged Hooks in Cucumber : Provide the tags details  --> Execute scenarios which having tags only @register in register feature file 
			and this can be applicable for beforeEveryStep, afterEveryStep, setup, teardown
		
			@Before("@register")
			public void  setup() {
				System.out.println("Browser got opened");
			}
			
			@After("@register")
			public void tearDown() {
				System.out.println("Browser got closed");
			}
			 */
	
	
			/*	
			 Hook -- execute before & after of every test step
				
				@BeforeStep
				public void beforeEveryStep() {
					System.out.println("++Before every step hook");
				}
				
				@AfterStep
				public void afyterEveryStep() {
					System.out.println("++After every step hook");
				}
			*/	
	
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
