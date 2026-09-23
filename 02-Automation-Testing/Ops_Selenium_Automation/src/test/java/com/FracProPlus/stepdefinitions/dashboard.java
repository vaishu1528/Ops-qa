package com.FracProPlus.stepdefinitions;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.dashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dashboard extends DriverFactory {
	dashboardPage dashboardPage = new dashboardPage(driver);

// @Given("the user is on the Dashboard Page")
// public void the_user_is_on_the_Dashboard_Page() {
// dashboardPage.navigateToDashboardPage();
// }
	@Then("the user name should be visible to the user")
	public void the_user_name_should_be_visible_to_the_user() {
		dashboardPage.isUserNameVisible();
	}
	
	@Then("verify the Explore Our Digital Solutions header name")
	public void verify_the_Explore_Our_Digital_Solutions_header_name() {
		dashboardPage.simulationTab();
	}
	
	@Then("verify the bydefault status for simulation tab")
	public void verify_the_bydefault_status_for_simulation_tab() {
		dashboardPage.simulationTab();
	}
	
	@Then("verify the From basic functionality to advanced features we have the right solution for you")
	public void verify_the_From_basic_functionality_to_advanced_features_we_have_the_right_solution_for_you() {
		dashboardPage.basicFunctionalityHeaderName();
	}
	
	@Then("verify the linqx logo")
	public void verify_the_linqx_logo() {
		dashboardPage.verifyLinqxLogo();
	}
	
	@Then("verify the functionality of well construction tab")
	public void verify_the_functionality_of_well_construction_tab() {
		dashboardPage.wellconstuctiontab();
		dashboardPage.clickElementsimulationTab();
	}
	

	@And("the user should be able to see the FracPro Live + card")
	public void the_user_should_be_able_to_see_the_FracPro_Live_card() {
		dashboardPage.isFracProLiveCardVisible();
	}

	@And("the user should be able to see the XOPS card")
	public void the_user_should_be_able_to_see_the_XOPS_card() {
		dashboardPage.isXOPSCardVisible();
	}

	@When("the user clicks on the Go to Application button under the FracPro Live + card")
	public void the_user_clicks_on_the_Go_to_Application_button_under_the_FracPro_Live_card() {
		dashboardPage.clickElementGoToApplicationButton();
	}

	@Then("the user should be directed to the FracPro Live + application")
	public void the_user_should_be_directed_to_the_FracPro_Live_application() {
		dashboardPage.isDirectedToFracProLiveApplication();
	}

	@And("the user should be able to see the Bell icon")
	public void the_user_should_be_able_to_see_the_Bell_icon() {
		dashboardPage.isBellIconVisible();
	}

	@And("the user should be able to see the profile icon")
	public void the_user_should_be_able_to_see_the_profile_icon() {
		dashboardPage.isProfileIconVisible();
	}

	@And("user verifies the Page title")
	public void user_verifies_the_Page_title() {
		dashboardPage.Verifypagetitle();
	}

	@And("user verifies the first name")
	public void user_verifies_the_first_name() {
		dashboardPage.VerifyFirstname();
	}

	@And("user verifies the Last name")
	public void user_verifies_the_Last_name() {
		dashboardPage.VerifyLastname();
	}

	@And("user verifies the Email")
	public void user_verifies_the_Email() {
		dashboardPage.VerifyEmail();
	}

	@And("User verifies Company Name")
	public void user_verifies_Company_Name() {
		dashboardPage.VerifyCompanyName();
	}

	@And("User Enters the First Name")
	public void User_Enters_the_First_Name() {
		dashboardPage.EnterFirstName();
	}

	@And("User Enters the Last name")
	public void User_Enters_the_Last_Name() {
		dashboardPage.EnterLastName();
	}

	@And("User Enters the Email")
	public void User_Enters_the_Email() {
		dashboardPage.EnterEmail();
	}

	@And("User clicks on the save button")
	public void User_clicks_on_the_save_button() {
		dashboardPage.Clickonsavebutton();
	}

	@And("user verifies that data has been saved or not")
	public void user_verifies_that_data_has_been_saved_or_not() {
		dashboardPage.VerifyDatasavedinprofile();
	}

	@And("user verifies that profile name has been chnaged")
	public void user_verifies_that_profile_name_has_been_chnaged() {
		dashboardPage.VerifyProfilenamechanges();
	}

	@And("user verifies the name on the dashboard page matches with First name")
	public void user_verifies_the_name_on_the_dashboard_page() {
		dashboardPage.VerifyDashboardname();
	}

// @And("user is pan the map")
// public void  user_is_pan_the_map() {
// dashboardPage.MapPanning();
// }

	@And("user enter the first name")
	public void user_enter_the_first_name() {
		dashboardPage.EnterFirstName1();
	}

	@And("user enter the last name")
	public void user_enter_the_last_name() {
		dashboardPage.EnterLastName1();
	}

	@Then("the user should see a map with pad markers")
	public void the_user_should_see_a_map_with_pad_markers() {
		dashboardPage.isMapWithPadMarkersVisible();
	}

	@And("the user should see a list of Favorite Pads")
	public void the_user_should_see_a_list_of_Favorite_Pads() {
		dashboardPage.isFavoritePadsListVisible();
	}

	@When("the user clicks on any pad from List in pad section")
	public void the_user_clicks_on_any_pad_group_dropdown() {
		dashboardPage.clickOnAnyPadGroupDropdown();
	}

	@Then("the user should see the Wells listed under that Pad")
	public void the_user_should_see_the_Wells_listed_under_that_Pad() {
		dashboardPage.areWellsListedUnderSelectedPad();
	}

	@When("the user clicks on a specific pad marker on the map")
	public void the_user_clicks_on_a_specific_pad_marker_on_the_map() {
		dashboardPage.MapPanningAndClickOnPad();
	}

	@Then("detailed pad information should be displayed")
	public void detailed_pad_information_should_be_displayed() {
		dashboardPage.isDetailedPadInformationDisplayed();
	}

	@When("the user drags a pad to the Favorite Pads section")
	public void the_user_drags_a_pad_to_the_Favorite_Pads_section() {
		dashboardPage.dragPadToFavoritePads();
	}

	@Then("that pad should appear in the Favorite Pads list")
	public void that_pad_should_appear_in_the_Favorite_Pads_list() {
		dashboardPage.isPadPresentInFavoritePads();
	}

	@When("the user clicks on the star icon for a pad from the Favorite Pads section")
	public void the_user_clicks_on_the_star_icon_for_a_pad_from_the_Favorite_Pads_section() {
		dashboardPage.clickOnStarIconFromFavoritePads();
	}

	@Then("that pad should be removed from the Favorite Pads list")
	public void that_pad_should_be_removed_from_the_Favorite_Pads_list() {
		dashboardPage.isPadRemovedFromFavoriteList();
	}

	@Then("the user verifies that the user is getting the Pad Added toast message")
	public void the_user_verifies_that_the_user_is_getting_the_Pad_Added_toast_message() {
		dashboardPage.isPadAddedToastMessageDisplayed();
	}

	@Then("the user verifies that the user is getting the Pad Removed toast message")
	public void the_user_verifies_that_the_user_is_getting_the_Pad_Removed_toast_message() {
		dashboardPage.isPadRemovedToastMessageDisplayed();
	}

	@When("the user clicks on the star icon for a pad")
	public void the_user_clicks_on_the_star_icon_for_a_pad() {
		dashboardPage.clickStarIconForPad();
	}

	@When("the user clicks on the plus icon for a pad")
	public void the_user_clicks_on_the_plus_icon_for_a_pad() {
		dashboardPage.clickPlusIconForPad();
	}

	@Then("the user should be redirected to the General Information page")
	public void the_user_should_be_redirected_to_the_General_Information_page() {
		dashboardPage.isRedirectedToGeneralInformationPage();
	}

	@And("the Pad Name field should be pre-filled with the selected pad’s name")
	public void the_Pad_Name_field_should_be_pre_filled_with_the_selected_pad_name() {
		dashboardPage.isPadNameFieldPreFilled();
	}

	@When("the user click on the pad")
	public void the_user_click_on_the_pad() {
		dashboardPage.clickonpad();
	}

	@Then("the user verifies the add New Well button is visible")
	public void the_user_verifies_the_add_New_Well_button_is_visible() {
		dashboardPage.isAddNewWellButtonVisible();
	}

	@And("the user click on the add New Well button")
	public void the_user_click_on_the_add_New_Well_button() {
		dashboardPage.clickonAddNewWellButton();
	}

	@And("the user filled the required details to New Well under the same pad")
	public void the_user_filled_the_required_details_to_New_Well_under_the_same_pad() {
		dashboardPage.FillTheRequiredDetails();
	}

	@And("the user verifies Well Name")
	public void the_user_verifies_Well_Name() {
		dashboardPage.VerifyWellName();
	}

	@When("the user will look for the Expand All button present on screen")
	public void the_user_will_look_for_the_Expand_All_button_present_on_screen() {
		dashboardPage.isExpandAllbuttonPresentInPadsSection();
	}

	@When("the user will look for the Collapse All button present on screen")
	public void the_user_will_look_for_the_Collapse_All_button_present_on_screen() {
		dashboardPage.isCollapseAllbuttonPresentInPadsSection();
	}

	@When("the user verifies that New Pad button is visible under the Pads Section")
	public void the_user_verifies_that_New_Pad_button_is_visible_under_the_Pads_Section() {
		dashboardPage.isNewPadPresentInPadsSection();
	}

	@When("the user clicks on the New Pad button")
	public void the_user_clicks_on_the_New_Pad_button() {
		dashboardPage.clickNewPadButton();
	}

	@Then("the user should be navigated to the General Information page")
	public void the_user_should_be_navigated_to_the_General_Information_page() {
		dashboardPage.isNavigatedToGeneralInformationPage();
	}

	@When("the user fills all required details and submits the form")
	public void the_user_fills_all_required_details_and_submits_the_form() {
		dashboardPage.fillRequiredPadDetailsAndSubmit();
	}

	@Then("a new pad should be created and visible in the pad list")
	public void a_new_pad_should_be_created_and_visible_in_the_pad_list() {
		dashboardPage.isNewPadVisibleInPadList();
	}

	@When("the user clicks on the Expand All button")
	public void the_user_clicks_on_the_Expand_All_button() {
		dashboardPage.clickExpandAllButton();
	}

	@Then("all pad groups should be expanded")
	public void all_pad_groups_should_be_expanded() {
		dashboardPage.areAllPadGroupsExpanded();
	}

	@When("the user clicks on the Collapse All button")
	public void the_user_clicks_on_the_Collapse_All_button() {
		dashboardPage.clickCollapseAllButton();
	}

	@Then("all pad groups should be collapsed")
	public void all_pad_groups_should_be_collapsed() {
		dashboardPage.areAllPadGroupsCollapsed();
	}

	@When("the user clicks on the filter icon")
	public void the_user_clicks_on_the_filter_icon() {
		dashboardPage.clickFilterIcon();
	}

	@Then("all filter options should be displayed")
	public void all_filter_options_should_be_displayed() {
		dashboardPage.areFilterOptionsDisplayed();
	}

	@And("the All option should be selected by default in the filter type")
	public void the_All_option_should_be_selected_by_default_in_the_filter_type() {
		dashboardPage.isAllOptionSelectedByDefault();
	}

	@And("the three months option should be selected by default in the time filter")
	public void the_three_months_option_should_be_selected_by_default_in_the_time_filter() {
		dashboardPage.isThreeMonthsOptionSelectedByDefault();
	}
	
	@And("verify the reset compute resources button functionality")
	public void verify_the_reset_compute_resources_button_functionality() {
		dashboardPage.verifyResetComputeResourceButton();
	}
}