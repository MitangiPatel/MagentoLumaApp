package StepDefinations;

import org.testng.Assert;

import PageObject.SignInSignUpPageObject;
import Utility.BaseTest;
import Utility.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSignUpStepDefinations extends BaseTest {
	SignInSignUpPageObject signInSignUpPageObject;
	ConfigReader configReader;

	@Given("Launch browser and Navigate to url")
	public void launch_browser_and_navigate_to_url() {

		signInSignUpPageObject = new SignInSignUpPageObject(driver);
		configReader = new ConfigReader();
		driver.get(configReader.getProperty("URL"));
	}

	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
		String HomeTitle = driver.getTitle();
		Assert.assertEquals(HomeTitle, configReader.getProperty("HomePageTitle"));
	}

	@When("Click on Create an Account button")
	public void click_on_create_an_account_button() {
		signInSignUpPageObject.createAnAccountButton().click();
	}

	@Then("Verify that Create Account page is visible successfully")
	public void verify_that_create_account_page_is_visible_successfully() {
		String signupTitle = driver.getTitle();
		Assert.assertEquals(signupTitle, configReader.getProperty("SinupPage"));
	}

	@When("Click on {string} button")
	public void click_on_button(String firstName) {
		signInSignUpPageObject.firstNameTextbox().sendKeys(firstName);
	}

	@When("Enter {string} {string} {string} {string} and {string}")
	public void enter_and(String firstName, String lastName, String email, String password, String confirmPassword) {
		signInSignUpPageObject.firstNameTextbox().sendKeys(firstName);
		signInSignUpPageObject.lastNameTextbox().sendKeys(lastName);
		signInSignUpPageObject.emailAddressTextbox().sendKeys(email);
		signInSignUpPageObject.passwordTextbox().sendKeys(password);
		signInSignUpPageObject.confirmPasswordTextbox().sendKeys(confirmPassword);

	}

	@When("Click on Create Account button")
	public void click_on_create_account_button() {
		signInSignUpPageObject.submitButton().click();
	}

	@Then("Verify message for account creation")
	public void verify_message_for_account_creation() {
		String ThankyouMessage = signInSignUpPageObject.thankYouMessage().getText();
		Assert.assertEquals(ThankyouMessage, configReader.getProperty("ThankYouMessage"));
	}

	@Then("Verify the {string} address")
	public void verify_the_address(String email) {
		String emailID = signInSignUpPageObject.verifyEmail().getText().split("\\n")[1];
		Assert.assertEquals(emailID, email);

	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	}

	@When("Click on Sign in button")
	public void click_on_sign_in_button() {
		signInSignUpPageObject.signInButton().click();
	}

	@Then("Verify that Customer Login Page is visible successfully")
	public void verify_that_customer_login_page_is_visible_successfully() {
		String customerTitle = driver.getTitle();
		Assert.assertEquals(customerTitle, configReader.getProperty("CustomerLoginTitle"));
	}

	@When("Enter {string} and {string}")
	public void enter_and(String email, String password) {
		signInSignUpPageObject.emailTextbox().sendKeys(email);
		signInSignUpPageObject.passTextbox().sendKeys(password);
	}

	@When("Click on Sign In button in login page")
	public void click_on_sign_in_button_in_login_page() {
		signInSignUpPageObject.loginPageSignInButton().click();
	}

	@Then("Verify that user is Sign in successfully.")
	public void verify_that_user_is_sign_in_successfully() {
		String message = signInSignUpPageObject.welcomeMessage().getText().split(",")[0];
		Assert.assertEquals(message, configReader.getProperty("WelcomeMessage"));
	}

}
