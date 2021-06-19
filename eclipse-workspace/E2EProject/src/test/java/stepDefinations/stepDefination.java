package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class stepDefination extends base {

	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
		driver = initializeDriver();
	}

	@Given("Navigate to {string} site")
	public void navigate_to_site(String string) {
		driver.get(string);
	}

	@Given("Click on Login link in home page to land on sign in page")
	public void click_on_login_link_in_home_page_to_land_on_sign_in_page() {
		LandingPage l = new LandingPage(driver);
		// popup displays only few times...sometimes it displays sometimes it wont
		// display then use below if condition
		if (l.getPopUpSize().size() > 0) {
			l.getPopUp().click();
		}
		l.getLogin().click();
	}

	@When("^User enter (.+) and (.+) and logins in$")
	public void user_enter_and_and_logins_in(String username, String password) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
	}

	/*
	 * @When("User enter {string} and {string} and logins in") public void
	 * user_enter_and_and_logins_in(String string, String string2) { LoginPage
	 * lp=new LoginPage(driver); lp.getEmail().sendKeys(string);
	 * lp.getPassword().sendKeys(string2); lp.getLogin().click(); }
	 */

	@Then("Verify that user is successfully login")
	public void verify_that_user_is_successfully_login() {
		System.out.println("sorry your credentials are invalid");
	}
	
	@And("^close browser$")
    public void close_browser() throws Throwable {
       driver.close();
    }
}