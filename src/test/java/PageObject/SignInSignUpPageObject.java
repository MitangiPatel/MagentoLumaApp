package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInSignUpPageObject {

	public WebDriver driver;

	public SignInSignUpPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='panel header']//a[text()='Create an Account']")
	private WebElement createAnAccountButton;

	@FindBy(id = "firstname")
	private WebElement firstNameTextbox;

	@FindBy(id = "lastname")
	private WebElement lastNameTextbox;

	@FindBy(id = "email_address")
	private WebElement email_addressTextbox;

	@FindBy(id = "password")
	private WebElement passwordTextbox;

	@FindBy(id = "password-confirmation")
	private WebElement passwordconfirmationTextbox;

	@FindBy(xpath = "//button[@class='action submit primary']")
	private WebElement submitButton;

	@FindBy(xpath = "//div[contains(text(),'Thank you')]")
	private WebElement thankYouMessage;

	@FindBy(xpath = "//div[@class='box box-information']/div[@class='box-content']/p")
	private WebElement verifyEmail;

	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	private WebElement signInButton;

	@FindBy(id = "email")
	private WebElement emailTextbox;

	@FindBy(id = "pass")
	private WebElement passTextbox;

	@FindBy(id = "send2")
	private WebElement signInButtonLoginPage;

	@FindBy(xpath = "//div[@class='panel header']//span[@class='logged-in']")
	private WebElement welcomeMessage;

	public WebElement createAnAccountButton() {
		return createAnAccountButton;
	}

	public WebElement firstNameTextbox() {
		return firstNameTextbox;
	}

	public WebElement lastNameTextbox() {
		return lastNameTextbox;
	}

	public WebElement emailAddressTextbox() {
		return email_addressTextbox;
	}

	public WebElement passwordTextbox() {
		return passwordTextbox;
	}

	public WebElement confirmPasswordTextbox() {
		return passwordconfirmationTextbox;
	}

	public WebElement submitButton() {
		return submitButton;
	}

	public WebElement thankYouMessage() {
		return thankYouMessage;
	}

	public WebElement verifyEmail() {
		return verifyEmail;
	}

	public WebElement signInButton() {
		return signInButton;
	}

	public WebElement emailTextbox() {
		return emailTextbox;
	}

	public WebElement passTextbox() {
		return passTextbox;
	}

	public WebElement loginPageSignInButton() {
		return signInButtonLoginPage;
	}

	public WebElement welcomeMessage() {
		return welcomeMessage;
	}

}
