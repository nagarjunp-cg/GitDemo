package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("User is on NetBanking landing page");
	}

	@When("User login into application with {string} and password {string}")
	public void user_login_into_applicationwith_and_password(String username, String password) {
		System.out.println(username+password);
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    System.out.println("User is on Practice landing page");
	    System.out.println("Line1Y");
	    System.out.println("Line2Y");
	}

	
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
		for(int i=0;i<data.size();i++) {
	  System.out.println(data.get(i));
		}
	}
}
