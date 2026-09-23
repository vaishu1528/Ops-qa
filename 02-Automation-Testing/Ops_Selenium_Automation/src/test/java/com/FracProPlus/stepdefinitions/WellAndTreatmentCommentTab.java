package com.FracProPlus.stepdefinitions;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.WellAndTreatmentCommentTabPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class WellAndTreatmentCommentTab extends DriverFactory {
	WellAndTreatmentCommentTabPage CommentstabPage = new WellAndTreatmentCommentTabPage(driver);

	@And("Navigate and click on the pad from the home screen")
	public void navigate_and_click_on_the_pad_from_the_home_screen() {
		CommentstabPage.navigateAndClickOnPad();
		CommentstabPage.navigateAndClickOnWell();
	}

	@And("Click on the well from overview")
	public void Click_on_the_well_from_overview() {
		CommentstabPage.clickElementOnWellFromOverview();
	}

	@Then("the user verifies page title")
	public void user_verifies_page_title() {
		CommentstabPage.verifyPageTitle();
	}

	@Then("the user verfies the wellname")
	public void the_user_verifies_wellname() {
		CommentstabPage.verifyWellName();
	}

	@Then("the user clicks on the Well and Treatment option")
	public void user_clicks_on_Well_and_Treatment() throws InterruptedException {
		CommentstabPage.clickWellandTreatment();
	}
	
	@Then("the user clicks on the Well and Treatment option second time")
	public void user_clicks_on_Well_and_Treatment_second_time() throws InterruptedException {
		CommentstabPage.clickWellandTreatment1();
	}

	@Then("the user clicks on the comment tab")
	public void user_clicks_on_comment_tab() throws InterruptedException {
		CommentstabPage.clickCommentTab();
	}

	@Then("the user verifies that user directs to the Dashboard")
	public void user_On_is_dashboard() {
		CommentstabPage.UserDirectsToDashboardPage();
	}

	@Then("the user click Profile icon")
	public void the_user_click_Profile_icon() {
		CommentstabPage.ClickProfilrIcon();
	}

	@Then("the user click Bell icon")
	public void the_user_click_Bell_icon() {
		CommentstabPage.ClickBellIcon();
	}

	@Then("the user click on the one of the notification from noptification dropdown")
	public void the_user_click_notification() {
		CommentstabPage.Clicknotification();
	}

	@Then("the user click on the my profile from dropdown")
	public void the_user_click_on_the_my_profile_from_dropdown() {
		CommentstabPage.ClickMyProfileOption();
	}

	@Then("the user enter Minutes in the Job time column section")
	public void the_user_enters_Minutes_in_job_time_column() throws InterruptedException {
		CommentstabPage.enterJobTime();
	}

	@Then("the user enter Minutes in the Job time column section for forth row")
	public void the_user_enters_Minutes_in_job_time_column_forth_row() throws InterruptedException {
		CommentstabPage.enterJobTimeFourthdRow();
	}

	@Then("the user enter Minutes in the Job time column section in new row")
	public void the_user_enters_Minutes_in_job_time_column_new_row() throws InterruptedException {
		CommentstabPage.enterJobTimenewRow();
	}

	@Then("the user validate that entered time added in default time")
	public void the_user_validates_time_added_to_default() {
		CommentstabPage.validateTimeAdded();
	}

//@Then("the user clicks on the Save button")
//public void the_user_clicks_on_save_button() {
//    CommentstabPage.clickSaveButton();
//}

	@Then("the user verifies that after saving the data user is getting updated toast massage")
	public void the_user_verifies_that_after_saving_the_data_user_is_getting_updated_toast_message() {
		CommentstabPage.verifyUpdatedToastMessage();
	}

	@Then("the user add the new row")
	public void the_user_add_the_new_row() {
		CommentstabPage.newrowaddition();
	}

	@Then("the user add the new row first time")
	public void the_user_add_the_new_row_first_time() {
		CommentstabPage.newrowaddition1();
	}

	@Then("the user add the new row second time")
	public void the_user_add_the_new_row_second_time() {
		CommentstabPage.newrowaddition21();
	}

	@Then("the user enters comments in the Comments column")
	public void the_user_enters_comments_in_comments_column() {
		CommentstabPage.enterComments();
	}

	@Then("the user enters comments in the Comments column for forth row")
	public void the_user_enters_comments_in_comments_column_forth_row() {
		CommentstabPage.enterCommentsforthRow();
	}

	@Then("the user enters comments in the Comments column in new row")
	public void the_user_enters_comments_in_comments_column_new_row() {
		CommentstabPage.enterCommentsnewRow();
	}

	@Then("the user verifies new added data into new row")
	public void the_user_verifies_new_added_data_into_new_row() throws InterruptedException {
		CommentstabPage.NewDataInNewRow();
	}

	@Then("the user perform page refresh action")
	public void the_user_perform_page_refresh_action() {
		CommentstabPage.RefreshAction();
	}

	@Then("the user verify the date,time,job time and comment message after page refresh save or not")
	public void the_user_verify_the_date_time_job_time_and_comment_message_after_page_refresh_save_or_not() {
		CommentstabPage.DataVerifitionAfterRefresh();
	}

	@Then("the user click on the next button")
	public void the_user_clicks_on_next_button() {
		CommentstabPage.clickNextButton();
	}

	@Then("the user click Channel Inputs for Model option from the side bar menu")
	public void the_user_click_Channel_Inputs_for_Model_option() throws InterruptedException {
		CommentstabPage.ClickChannelinputs();
	}

	@Then("the user verifies that user is getting the Action Required popup")
	public void the_user_verifies_unsaved_changes_popup() {
		CommentstabPage.verifyUnsavedChangesPopup();
	}

	@Then("the user clicks on the No Discard button in the Action Required popup")
	public void the_user_clicks_return_to_save_button() {
		CommentstabPage.clickReturnToSaveButton();
	}

	@Then("the user verifies that user is rediecting to the general information tab")
	public void the_user_verifies_redirection_to_the_comments_page() {
		CommentstabPage.verifyRedirectionTogeneralinformationtab();
	}

	@Then("the user verifies that user is rediecting to the Channel Inputs for Model screen")
	public void the_user_verifies_redirection_to_the_Channel_Inputs_for_Model() throws InterruptedException {
		CommentstabPage.verifyRedirectionToChannelInputsforModel();
	}

	@Then("the user verifies that user is rediecting to the Profile screen")
	public void the_user_verifies_redirection_to_the_Profile_Model() {
		CommentstabPage.verifyRedirectionToProfilescreen();
	}

	@Then("the user verifies that user is rediecting to the Home screen")
	public void the_user_verifies_redirection_to_the_Home_screen() {
		CommentstabPage.verifyRedirectionToHomescreen();
	}

	@Then("the user clicks on the general information tab")
	public void the_user_clicks_on_general_information_tab() {
		CommentstabPage.clickGeneralInformationTab();
	}

	@Then("the user clicks on the proceed without saving")
	public void the_user_clicks_proceed_without_saving() {
		CommentstabPage.clickProceedWithoutSaving();
	}

	@Then("the user verifies that user directs to the General information tab")
	public void the_user_verifies_that_user_directs_to_the_General_information_tab() {
		CommentstabPage.DirectionToGeneralInforation();
	}

	@Then("the user verifies that the data has not been save")
	public void the_user_verifies_data_not_saved() {
		CommentstabPage.verifyDataNotSaved();
	}

	@Then("the user cilcks on the option from the side menu bar")
	public void the_user_clicks_option_from_side_menu() {
		CommentstabPage.clickSideMenuOption();
	}

}