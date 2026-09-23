package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;  
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.DrilledHolePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DrilledHole extends DriverFactory {
	
	DrilledHolePage drilledHolePage = new DrilledHolePage(driver);

	@When("Click on the drilled hole tab")
	public void click_on_the_drilled_hole_tab() {
		drilledHolePage.clickElementOnDrilledHoleTab();
	}
	
	@When("click on the no discard button")
	public void click_on_the_no_discard_button() {
		drilledHolePage.clickNoDiscardButton();
	}
	
	@When("Click on the yes save button")
	public void Click_on_the_yes_save_button() {
		drilledHolePage.clickYesSaveButton();
	}
	
	@Then("Verify drilled hole table header names")
	public void verify_the_drilled_hole_table_header_names() {
		drilledHolePage.verifyDrilledHoleTableHeaderNames();
	}
	
	@When("User enter the data into top md field")
	public void enter_the_data_into_top_md_field() {
		drilledHolePage.enterDataIntoTopMdFieldDrilledHoleTab();
	}
	
	@When("User enter the data into top md field for save and next")
	public void enter_the_data_into_top_md_field_for_save_and_next() {
		drilledHolePage.enterDataIntoTopMdFieldDrilledHoleTabForSn();
	}
	
	
	@When("User click on the next button")
	public void User_click_on_the_next_button() {
		drilledHolePage.clickNextButton();
	}
	
	@When("User verify the unsaved changes pop up")
	public void User_verify_the_unsaved_changes_pop_up() {
		drilledHolePage.verifyUnsavedChangesPopup();
	}
	
	@Then("User verify the bot md field should be auto updated")
	public void User_verify_the_bot_md_field_should_be_auto_updated() {
		drilledHolePage.verifyBotMdFieldAutoUpdated();
	}
	
	@When("User enter the data less than top md into bot md field")
	public void User_enter_the_data_less_than_top_md_into_bot_md_field() {
		drilledHolePage.enterDataLessThanTopMdIntoBotMdField();
	}

	@Then("User verify the error message")
	public void User_verify_the_error_message() {
		drilledHolePage.verifyErrorMessage();
	}

	@Then("Verify the save buttion should be disable")
	public void Verify_the_save_buttion_should_be_disable() {
		drilledHolePage.verifySaveButtonDisabled();
	}

	@When("Select a option from compute dropdown")
	public void select_a_option_from_compute_dropdown() {
		drilledHolePage.selectOptionFromComputeDropdown();
	}
	
	@When("User enter the data greater than top md into bot md field")
	public void User_enter_the_data_greater_than_top_md_into_bot_md_field() {
		drilledHolePage.enterDataGreaterThanTopMdIntoBotMdField();
	}
	
	@And("User right click on the first row and insert or remove rows")
	public void User_right_click_on_the_first_row_and_insert_or_remove_rows() {
		drilledHolePage.rightClickElement();
	}

	
	@When("Select a option from compute dropdown for second time")
	public void select_a_option_from_compute_dropdown_for_second_time() {
		drilledHolePage.selectOptionFromComputeDropdown2();
	}

	@And("Verify the open hole dropdown bydefault option for first row")
	public void verify_the_open_hole_dropdown_bydefault_option_for_first_row() {
		drilledHolePage.verifyOpenHoleDropdownDefaultOption();
	}

	@Then("User verify save button should be enable")
	public void User_verify_save_button_should_be_enable() {
		drilledHolePage.verifySaveButtonEnabled2();
	}
	
	@And("Verify the value in bot diam field for first row")
	public void verify_the_value_in_bot_diam_field_for_first_row() {
		drilledHolePage.verifyValueInBotDiamField();
	}

	@And("Verify the value in effective diam field for first row")
	public void verify_the_value_in_effective_diam_field_for_first_row() {
		drilledHolePage.verifyValueInEffectiveDiamField();
	}
	
	@And("User refresh the page")
	public void User_refresh_the_page() {
		drilledHolePage.pageRefresh();
	}
	
	@And("Verify the value in length field for first row")
	public void verify_the_value_in_length_field_for_first_row() {
		drilledHolePage.verifyValueInLengthField();
	} 

	@And("verify the sucessful message after data save")
	public void verify_the_sucessful_message_after_data_save() {
		drilledHolePage.verifySucessfulMessage();
	}
	
	@And("Verify the Top MD value for first row")
	public void Verify_the_Top_MD_value_for_first_row() {
		drilledHolePage.verifyValueInTopMDField();
	}
	
	@And("Verify the Bot MD value for first row")
	public void Verify_the_Bot_MD_value_for_first_row() {
		drilledHolePage.verifyValueInBotMDFieldForFirstRow();
	}
	
	@Then("Verify the values in first row table of drilled hole tab")
	public void verify_the_values_in_first_row_table_of_drilled_hole_tab() {
		drilledHolePage.verifyValuesInFirstRowTable();
	}

}