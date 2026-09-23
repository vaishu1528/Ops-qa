package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends DriverFactory {
	
loginPage loginPage = new loginPage(driver);


@Given("the user is on the Login Page")
public void the_user_is_on_the_Login_Page() {
	
loginPage.navigateToLoginPage();
}
@When("I enter valid username")
public void i_enter_valid_username() {
loginPage.enterValidUsername();
}
@And("I enter valid password")
public void i_enter_valid_password() {
loginPage.enterValidPassword();
}
@And("I click on the Login button")
public void i_click_on_the_Login_button() {
loginPage.clickElementLoginButton();
}
@Then("the user should be successfully logged in")
public void the_user_should_be_successfully_logged_in() {
loginPage.isUserLoggedIn();
}
@When("I enter an invalid username or password")
public void i_enter_an_invalid_username_or_password() {
loginPage.enterInvalidUsernameOrPassword();
}
@Then("the user should see an error message")
public void the_user_should_see_an_error_message() {
loginPage.isErrorMessageDisplayed();
}
@When("the user leaves the username and password fields empty")
public void the_user_leaves_the_username_and_password_fields_empty() {
loginPage.leaveUsernameAndPasswordFieldsEmpty();
}
@And("the user clicks on the Login button")
public void the_user_clicks_on_the_Login_button() {
loginPage.clickElementLoginButton();
}
@When("the user clicks on the Forgot Password link")
public void the_user_clicks_on_the_Forgot_Password_link() {
loginPage.clickElementForgotPasswordLink();
}
@And("the user enters a registered email ID")
public void the_user_enters_a_registered_email_ID() {
loginPage.enterRegisteredEmailID();
}
@And("the user clicks on the Send Verification Code button")
public void the_user_clicks_on_the_Send_Verification_Code_button() {
loginPage.clickElementSendVerificationCodeButton();
}
@Then("the user should receive a verification code")
public void the_user_should_receive_a_verification_code() {
loginPage.isVerificationCodeReceived();
}
// @Given("User opens the Application")
// public void user_opens_the_application() {
// driver = DriverFactory.getDriver();
// }
@When("User enters valid username {string} into Username field")
public void user_enters_valid_username_into_username_field(String username) {
loginPage.enterUsername(username);
}
@And("User enters valid password {string} into Password field")
public void user_enters_valid_password_into_password_field(String password) {
loginPage.enterPassword(password);
}
@And("User clickElements on Login button")
public void user_clickElements_on_login_button() {
loginPage.clickElementLoginButton();
}
@Then("User should get successfully logged in")
public void user_should_get_successfully_logged_in() {
loginPage.isLoginSuccessful();
}
@When("User enters invalid username {string} into Username field")
public void user_enters_invalid_username_into_username_field(String invalidUsername) {
loginPage.enterUsername(invalidUsername);
}
@And("User enters invalid password {string} into Password field")
public void user_enters_invalid_password_into_password_field(String invalidPassword) {
loginPage.enterPassword(invalidPassword);
}
@Then("User should see an error message {string}")
public void user_should_see_an_error_message(String errorMessage) {
Assert.assertEquals(loginPage.getErrorMessage(), errorMessage);
}
@When("the user clicks on the Profile icon")
public void userClicksOnProfileIcon() {
	loginPage.clickProfileIcon();
}

@And("user clicks on sign out button")
public void userClicksSignOut() {
	loginPage.clickSignOutButton();
}

@Then("verify that user gets successfully sign out form application")
public void verifyUserSuccessfullyLoggedOut() {
	loginPage.verifyUserIsLoggedOut();
}
}