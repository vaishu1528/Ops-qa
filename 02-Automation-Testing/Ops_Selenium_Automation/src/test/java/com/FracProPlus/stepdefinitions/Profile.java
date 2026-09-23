package com.FracProPlus.stepdefinitions;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.CreatePadAndWellPage;
import com.FracProPlus.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Profile extends DriverFactory{
	
	CreatePadAndWellPage createPadAndWellPage = new CreatePadAndWellPage(driver);
	ProfilePage profilePage = new ProfilePage(driver);
	
	

//		@Given("the user is on the Dashboard Page")
//		public void the_user_is_on_the_Dashboard_Page() {
//			createPadAndWellPage.navigateToDashboardPage();
//		}
//	
//		@Then("User click on Continue button from the Fracpro live plus card")
//		public void click_continue_from_fracpro_live_plus_card() {
//		    createPadAndWellPage.clickContinueFromFracProLivePlusCard();
//		}

	 @When("the user click on username initials icon")
	 public void the_user_click_on_username_initials_icon() {
		 profilePage.clickOnUserInitialsIcon();
	}

	@Then("the user click and navigate to the My profile page")
	public void the_user_click_and_navigate_to_the_my_profile_page() {
		profilePage.navigateToMyProfile();
	}

	@Then("the user verify the email field should be read only")
	public void the_user_verify_the_email_field_should_be_read_only() {
		profilePage.isEmailFieldReadOnly();
	}

	@Then("the user try to update the editable fileds")
	public void the_user_try_to_update_the_editable_fileds() {
		profilePage.updateEditableFields("Shantanu");
	}

	@Then("the verify the updated data should be visible properly on profile page after refresh")
	public void the_verify_the_updated_data_should_be_visible_properly_on_profile_page_after_refresh() {
		String newFirstName = "Shantanu"; // this should be the same value you passed in updateEditableFields()
		boolean isProfileNameCorrect = profilePage.isProfileNameMatchingWithFirstName(newFirstName);
		Assert.assertTrue(isProfileNameCorrect, "The profile name does not match the updated first name!");

	}

	


	@Then("the user verify the side menu bar should work properly as required with the updated username")
	public void the_user_verify_the_side_menu_bar_should_work_properly_as_required_with_the_updated_username() {
		profilePage.getFirstNameFromProfile();
	}
}
