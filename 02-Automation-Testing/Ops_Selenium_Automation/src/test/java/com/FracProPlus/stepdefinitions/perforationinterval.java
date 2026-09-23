package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.CommonUtils;
import com.FracProPlus.utils.ElementUtils;

import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.PerforationIntervalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class perforationinterval extends DriverFactory {
	PerforationIntervalPage perforationIntervalPage = new PerforationIntervalPage(driver);

	@Given("the user is on the Home Screens")
	public void the_user_is_on_the_Home_Screens() {
		
		CommonUtils.dismissChromePasswordPopup();
		perforationIntervalPage.verifyHomeScreen();
	}

	@And("Navigate and click on the pad from the home screens")
	public void navigate_and_click_on_the_pad_from_the_home_screens() {
		perforationIntervalPage.navigateAndClickOnPad();
		perforationIntervalPage.navigateAndClickOnWell();
	}

	@And("Clicks on the well from overviews")
	public void clicks_on_the_well_from_overviews() {
		perforationIntervalPage.clickElementOnWellFromOverview();
	}

	@And("Click on wellbore configuration option")
	public void click_on_wellbore_configuration_option() {
		perforationIntervalPage.clickElementOnWellboreConfigurationOption();
	}

	@And("Verify the page header name")
	public void verify_the_page_header_name() {
		perforationIntervalPage.verifyPageHeaderName();
	}

	@When("the user clicks on the perforation interval tab")
	public void the_user_clicks_on_the_perforation_interval_tab() {
		perforationIntervalPage.clickElementOnPerforationIntervalTab();
	}

	@Then("the table header names should be verified")
	public void the_table_header_names_should_be_verified() {
		perforationIntervalPage.verifyTableHeaderNamesInPerforationIntervalTab();
	}

	@And("the presence of copy and paste button should be verified")
	public void the_presence_of_copy_and_paste_button_should_be_verified() {
		perforationIntervalPage.verifyCopyAndPasteButtonPresence();
	}

	@And("the by default state of use multiple clusters for model check box should be verified")
	public void the_by_default_state_of_use_multiple_clusters_for_model_check_box_should_be_verified() {
		perforationIntervalPage.verifyDefaultStateOfUseMultipleClustersForModelCheckBox();
	}

	@When("the user clicks on the copy and paste button")
	public void the_user_clicks_on_the_copy_and_paste_button() {
		perforationIntervalPage.clickElementOnCopyAndPasteButton();
	}

	@Then("the copy and paste page title name should be verified")
	public void the_copy_and_paste_page_title_name_should_be_verified() {
		perforationIntervalPage.verifyCopyAndPastePageTitleName();
	}
	
	@Then("verify the first column name as edit clusters in the first column")
	public void verify_the_first_column_name_as_edit_clusters_in_the_first_column() {
		perforationIntervalPage.verifyEditClusterTooltripName();
	}
	

	@And("the page header name of copy and paste page should be verified")
	public void the_page_header_name_of_copy_and_paste_page_should_be_verified() {
		perforationIntervalPage.verifyCopyAndPastePageHeaderName();
	}

	@When("the user copies the data from excel and pastes it into the copy and paste table")
	public void the_user_copies_the_data_from_excel_and_pastes_it_into_the_copy_and_paste_table() throws Exception {
		perforationIntervalPage.PastingDataToColumnRowWise();
	}
	
	@And("the user clicks on the save button for save")
	public void the_user_clicks_on_the_save_button_for_save() {
		perforationIntervalPage.UserclickElementOnSaveButton();
	}

	@And("the user clicks on the save button")
	public void the_user_clicks_on_the_save_button() {
		perforationIntervalPage.clickElementOnSaveButton();
	}
	
	@And("the user clicks on the save button2")
	public void the_user_clicks_on_the_save_button2() {
		perforationIntervalPage.clickElementOnSaveButton2();
	}

	@And("the user clicks on save button in the perforation interval page")
	public void the_user_clicks_on_save_button_in_the_perforation_interval_page() {
		perforationIntervalPage.clickElementOnSaveButtonInPerforationIntervalPage();
	}

	@Then("the value in the perforation interval table should be verified")
	public void the_value_in_the_perforation_interval_table_should_be_verified() {
		perforationIntervalPage.verifyValueInPerforationIntervalTable();
	}

	@When("the user refreshes the page")
	public void the_user_refreshes_the_page() {
		perforationIntervalPage.refreshPage();
	}

	@Then("the value in the perforation interval table should be verified again")
	public void the_value_in_the_perforation_interval_table_should_be_verified_again() {
		perforationIntervalPage.verifyValueInPerforationIntervalTable();
	}

	@When("the user clicks on the add row button")
	public void the_user_clicks_on_the_add_row_button() {
		perforationIntervalPage.clickElementOnAddRowButton();
	}

	@Then("the subinterval page title name should be verified")
	public void the_subinterval_page_title_name_should_be_verified() {
		perforationIntervalPage.verifySubintervalPageTitleName();
	}

	@And("the sub interval table header name should be verified")
	public void the_sub_interval_table_header_name_should_be_verified() {
		perforationIntervalPage.verifySubIntervalTableHeaderName();
	}

	@And("the sub interval row values should be verified")
	public void the_sub_interval_row_values_should_be_verified() {
		perforationIntervalPage.verifySubIntervalRowValues();
	}

	@When("the user navigates to the second row of the sub interval")
	public void the_user_navigates_to_the_second_row_of_the_sub_interval() {
		perforationIntervalPage.navigateToSecondRowOfSubInterval();
	}

	@And("the user enters the data into the Top MD field")
	public void the_user_enters_the_data_into_the_Top_MD_field() {
		perforationIntervalPage.enterDataIntoTopMDField();
	}

	@And("the user enters the data into the Bot MD field")
	public void the_user_enters_the_data_into_the_Bot_MD_field() {
		perforationIntervalPage.enterDataIntoBotMDField();
	}

	@When("the user enters the data into the Diameter field")
	public void the_user_enters_the_data_into_the_Diameter_field() {
		perforationIntervalPage.enterDataIntoDiameterField();
	}

	@And("the user enters the data into the no of perfs field")
	public void the_user_enters_the_data_into_the_no_of_perfs_field() {
		perforationIntervalPage.enterDataIntoNoOfPerfsField();
	}

	@And("the user selects the data into the perf phasing dropdown")
	public void the_user_selects_the_data_into_the_perf_phasing_dropdown() {
		perforationIntervalPage.selectDataIntoPerfPhasingDropdown();
	}

	@And("the user clicks on the ok button")
	public void the_user_clicks_on_the_ok_button() {
		perforationIntervalPage.clickElementOnOkButton();
	}

	@Then("the value of the no of cluster field should be verified")
	public void the_value_of_the_no_of_cluster_field_should_be_verified() {
		perforationIntervalPage.verifyValueOfNoOfClusterField();
	}

	@And("the value of the Top MDs field should be verified")
	public void the_value_of_the_Top_MDs_field_should_be_verified() {
		perforationIntervalPage.verifyValueOfTopMDsField();
	}

	@And("the value of the Bot MDs field should be verified")
	public void the_value_of_the_Bot_MDs_field_should_be_verified() {
		perforationIntervalPage.verifyValueOfBotMDsField();
	}

	@And("the value of the Diameter field should be verified")
	public void the_value_of_the_Diameter_field_should_be_verified() {
		perforationIntervalPage.verifyValueOfDiameterField();
	}

	@And("the value of Number of Perfs should be verified")
	public void the_value_of_Number_of_Perfs_should_be_verified() {
		perforationIntervalPage.verifyValueOfNumberOfPerfs();
	}

	@And("all fields of Interval should be read only")
	public void all_fields_of_Interval_should_be_read_only() {
		perforationIntervalPage.verifyAllFieldsOfIntervalAreReadOnly();
	}

	@When("the user clicks on the save button again")
	public void the_user_clicks_on_the_save_button_again() {
		perforationIntervalPage.clickElementOnSaveButtonAgain();
	}

	@And("the user refreshes the page again")
	public void the_user_refreshes_the_page_again() {
		perforationIntervalPage.refreshPageAgain();
	}

	@Then("the values of the interval should be verified")
	public void the_values_of_the_interval_should_be_verified() {
		perforationIntervalPage.verifyValuesOfInterval();
	}

	@When("the user clicks on the user stage alias check box")
	public void the_user_clicks_on_the_user_stage_alias_check_box() {
		perforationIntervalPage.clickElementOnUserStageAliasCheckBox();
	}

	@Then("the Alias table header name should be verified")
	public void the_Alias_table_header_name_should_be_verified() {
		perforationIntervalPage.verifyAliasTableHeaderName();
	}

	@When("the user enters the data into the alias column of the intervals")
	public void the_user_enters_the_data_into_the_alias_column_of_the_intervals() {
		perforationIntervalPage.enterDataIntoAliasColumnOfIntervals();
	}

	@And("the user clicks on save button again")
	public void the_user_clicks_on_save_button_again() {
		perforationIntervalPage.clickElementOnSaveButtonAgain();
	}

	@Then("the new entered value in the alias column should be verified")
	public void the_new_entered_value_in_the_alias_column_should_be_verified() {
		perforationIntervalPage.verifyNewEnteredValueInAliasColumn();
	}

	@When("the user unchecks the stage alias check box")
	public void the_user_unchecks_the_stage_alias_check_box() {
		perforationIntervalPage.uncheckStageAliasCheckBox();
	}

	@Then("the alias table header name should be disabled")
	public void the_alias_table_header_name_should_be_disabled() {
		perforationIntervalPage.verifyAliasTableHeaderNameDisabled();
	}

	@When("the user clicks on the stage alias check box again for enabled")
	public void the_user_clicks_on_the_stage_alias_check_box_again_for_enabled() {
		perforationIntervalPage.clickElementOnStageAliasCheckBoxAgainForEnabled();
	}

	@Then("the new entered value in the alias column should be verified again")
	public void the_new_entered_value_in_the_alias_column_should_be_verified_again() {
		perforationIntervalPage.verifyNewEnteredValueInAliasColumnAgain();
	}

	@When("the user unchecks the Use Multiple Clusters for Model check box")
	public void the_user_unchecks_the_Use_Multiple_Clusters_for_Model_check_box() {
		perforationIntervalPage.uncheckUseMultipleClustersForModelCheckBox();
	}
	
	@When("the user click on the use Multiple Clusters For Model Check Box")
	public void the_user_click_on_the_use_Multiple_Clusters_For_Model_Check_Box() {
		perforationIntervalPage.uncheckUseMultipleClustersForModelCheckBox();
	}

	@Then("all the fields Both Interval and its sub intervals should be editable except TOP and BOT Tvd")
	public void all_the_fields_Both_Interval_and_its_sub_intervals_should_be_editable_except_TOP_and_BOT_Tvd() throws InterruptedException {
		perforationIntervalPage.verifyAllFieldsEditableExceptTopAndBotTvd();
	}

	@When("the user enters the value into Top MDs field")
	public void the_user_enters_the_value_into_Top_MDs_field() {
		perforationIntervalPage.enterValueIntoTopMDsField();
	}

	@And("the user enters the value into Bot MDs field")
	public void the_user_enters_the_value_into_Bot_MDs_field() {
		perforationIntervalPage.enterValueIntoBotMDsField();
	}

	@Then("the value into Top TVD field should be verified")
	public void the_value_into_Top_TVD_field_should_be_verified() {
		perforationIntervalPage.verifyValueIntoTopTVDField();
	}

	@And("the value into Bot TVD field should be verified")
	public void the_value_into_Bot_TVD_field_should_be_verified() {
		perforationIntervalPage.verifyValueIntoBotTVDField();
	}

	@When("the user enters the value into Diameter field")
	public void the_user_enters_the_value_into_Diameter_field() {
		perforationIntervalPage.enterValueIntoDiameterField();
	}

	@And("the user enters the value into No of perfs field")
	public void the_user_enters_the_value_into_No_of_perfs_field() {
		perforationIntervalPage.enterValueIntoNoOfPerfsField();
	}

	
	@And("the user verify the behavior of use multiple clusters for model check box")
	public void the_user_verify_the_behavior_of_use_multiple_clusters_for_model_check_box() {
		perforationIntervalPage.verifyUncheckUseMultipleClustersForModelCheckBox();
	}
	
	@And("the user enters the value into Perf phasing field")
	public void the_user_enters_the_value_into_Perf_phasing_field() {
		perforationIntervalPage.enterValueIntoPerfPhasingField();
	}

	@And("the user enters the value into No of clusters field")
	public void the_user_enters_the_value_into_No_of_clusters_field() {
		perforationIntervalPage.enterValueIntoNoOfClustersField();
	}

//    @And("the user clicks on the save button again")
	@Then("the newly added values into the intervals should be verified")
	public void the_newly_added_values_into_the_intervals_should_be_verified() {
		perforationIntervalPage.verifyNewlyAddedValuesIntoIntervals();
	}

	@When("the user unchecks the stage alias check box again")
	public void the_user_unchecks_the_stage_alias_check_box_again() {
		perforationIntervalPage.uncheckStageAliasCheckBoxAgain();
	}

	@Then("the alias table header name should be disabled again")
	public void the_alias_table_header_name_should_be_disabled_again() {
		perforationIntervalPage.verifyAliasTableHeaderNameDisabledAgain();
	}

	@When("Click on the add row button for first row")
	public void click_on_the_add_row_button_for_first_row() {
		perforationIntervalPage.ClickOnAddRow();
	}

	@When("Enter the data into the Top MD field greater than to the BOT MD")
	public void enter_the_data_into_the_top_md_field_greater_than_to_the_bot_md() {
		perforationIntervalPage.enterDataIntoTopMDField();
	}

	@Then("Verify the error message in perforation interval page")
	public void verify_the_error_message_in_perforation_interval_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter the data into Top md field less than Bot md value")
	public void user_enter_the_data_into_top_md_field_less_than_bot_md_value() {
		perforationIntervalPage.enterDataIntoTopMDFieldLess();
	}

	@Then("Verify the auto populated value into Top TVD field")
	public void verify_the_auto_populated_value_into_top_tvd_field() {
		perforationIntervalPage.verifyDataIntoTopTVDField();
	}

	@When("User enter the data into Bot md field in sub interval of first row")
	public void user_enter_the_data_into_bot_md_field_in_sub_interval_of_first_row() {
		perforationIntervalPage.enterDataIntoBotMDField();
	}

	@When("Verify the auto populated value into Bot TVD field in sub interval of first row")
	public void verify_the_auto_populated_value_into_bot_tvd_field_in_sub_interval_of_first_row() {
		perforationIntervalPage.verifyDataIntoBotTVDField();
	}

	@When("User enter data into Top md field for second sub interval of first row")
	public void user_enter_data_into_top_md_field_for_second_sub_interval_of_first_row() {
		perforationIntervalPage.enterDataIntoTopMDFieldSecondRow();
	}

	@When("User enter data into Bot md field for second sub interval of first row")
	public void user_enter_data_into_bot_md_field_for_second_sub_interval_of_first_row() {
		perforationIntervalPage.enterDataIntoBotMDFieldSecondRow();
	}

	@When("User enter the value into the diameter field in sub interval")
	public void user_enter_the_value_into_the_diameter_field_in_sub_interval() {
		perforationIntervalPage.enterDataIntoDiameterField();
	}

	@When("User enter the value into the number of perfs field into the sub interval") 
	public void User_enter_the_value_into_the_number_of_perfs_field_into_the_sub_interval() {
	perforationIntervalPage.enterDataIntoNoOfPerfsField();
	}

	@When("User select the value into the perf phasing field into the sub interval")
	public void user_select_the_value_into_the_perf_phasing_field_into_the_sub_interval() {
		perforationIntervalPage.selectDataIntoPerfPhasingDropdown();
	}

	@When("Click on the ok button in Perforation Interval tab")
	public void click_on_the_ok_button_in_perforation_interval_tab() {
		perforationIntervalPage.clickElementOnOkButton();
	}

//	@Then("Verify the value into the Top MD field for the first row interval")
//	public void verify_the_value_into_the_top_md_field_for_the_first_row_interval() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Verify the value into the Bot MD field for the first row interval")
//	public void verify_the_value_into_the_bot_md_field_for_the_first_row_interval() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Verify the value into the Top TVD field for the first row interval")
//	public void verify_the_value_into_the_top_tvd_field_for_the_first_row_interval() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Verify the value into the Bot TVD field for the first row interval")
//	public void verify_the_value_into_the_bot_tvd_field_for_the_first_row_interval() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Verify the value into the Diameter field for the first row interval")
//	public void verify_the_value_into_the_diameter_field_for_the_first_row_interval() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Verify the value into the Num of perfs field for the first row interval")
//	public void verify_the_value_into_the_num_of_perfs_field_for_the_first_row_interval() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Verify the value into the Num of clusters field for the first row interval")
//	public void verify_the_value_into_the_num_of_clusters_field_for_the_first_row_interval() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}