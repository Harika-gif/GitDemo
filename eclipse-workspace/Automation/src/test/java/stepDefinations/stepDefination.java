package stepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {



	    @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	       //code to navigate to login url
	    	System.out.println("navigated to login url");
	    }

	    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	      System.out.println("logged in user with username " +strArg1+ "and password" +strArg2 );
	      
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	      //home page validation  
	    	System.out.println("Validate home page");
	    }

	    @And("^Cards are displayed \"([^\"]*)\"$")
	    public void cards_are_displayed_something(String strArg1) throws Throwable {
	        System.out.println(strArg1);
	    }
	
	}
	

