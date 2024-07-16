package stepdefinitions;

//import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class Login {
	
	/*
	@Before(order=0, value="@search") // Hooks and attribute : If we have to specify tags and order then use value 
	public void  setup() {
		System.out.println(" ++ before hook - setup methos got executed ++ ");
	}
	
	@After("@search")
	public void tearDown() {
		System.out.println("-- after hook - teardown methos got executed -- ");
	}
	*/
	
	
	
	
	@Given("^User navigates to login page$")
	public void User_navigates_to_login_page() {
		System.out.println("User got navigated to Login page");
		}
	
	@When("^User enters valid email address (.+)$")
	public void User_enters_valid_email_address(String email) {
		System.out.println("User has entered valid email address: "+ email);
	}

	@And ("^Enter valid password (.+)")
	public void Enter_valid_password(String password) {
		System.out.println("User entered valid password: "+ password);
	}

	@And("Clicks on login button")
	public void Clicks_on_login_button(){
		System.out.println("User has clicked on login button ");
	}
	
	@Then("User should login successfully")
	public void User_should_login_successfully() {
		System.out.println("User got login successfully ");
	}

	@When("^User enters invalid email address \"([^\"]*)\"$")    // // \"(.+)\"$"
	public void User_enters_invalid_email_address(String invalildEmail) {
		System.out.println("User has entered invalid email address: "+ invalildEmail);
	}

	@When("^Enter invalid password \"([^\"]*)\"$")   // \"(.+)\"$"
	public void Enter_invalid_password(String invalildPassword) {
		System.out.println("User has entered invalid password: "+ invalildPassword);
	}

	@Then("User should a proper warning message")
	public void User_should_a_proper_warning_message() {
		System.out.println("Proper warning message got displayed to the user");
	}
	
	@When("User dont enter any credentials")
	public void User_dont_enter_any_credentials() {
		System.out.println("User not entered any credentials");
	}
	
	
}
