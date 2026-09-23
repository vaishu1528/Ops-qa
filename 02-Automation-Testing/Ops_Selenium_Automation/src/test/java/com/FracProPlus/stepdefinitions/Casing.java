package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.CasingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casing extends DriverFactory {
	
	CasingPage casingPage = new CasingPage(driver);

	@When("Click on the casing tab")
	public void click_on_the_casing_tab() {
		casingPage.clickElementOnCasingTab();
	}

	@Then("Verify the casing table header names")
	public void verify_the_casing_table_header_names() {
		casingPage.verifyCasingTableHeaderNames();
	}

	@When("Enter the data into top md field")
	public void enter_the_data_into_top_md_field() {
		casingPage.enterDataIntoTopMdField();
	}

	@Then("Verify the bot md field should be auto updated")
	public void verify_the_bot_md_field_should_be_auto_updated() {
		casingPage.verifyBotMdFieldAutoUpdated();
	}

	@When("Enter the data less than top md into bot md field")
	public void enter_the_data_less_than_top_md_into_bot_md_field() {
		casingPage.enterDataLessThanTopMdIntoBotMdField();
	}

	@Then("Verify the error message")
	public void verify_the_error_message() {
		casingPage.verifyErrorMessage();
	}
	
	@Then("Verify the error message sub interval")
	public void verify_the_error_message_sub_interval() {
		casingPage.verifyErrorMessageSubinterval();
	}

	@And("Verify the save button should be disable")
	public void verify_the_save_button_should_be_disable() {
		casingPage.verifySaveButtonDisabled();
	}

	@When("Enter the data greater than top md into bot md field")
	public void enter_the_data_greater_than_top_md_into_bot_md_field() {
		casingPage.enterDataGreaterThanTopMdIntoBotMdField();
	}

	@Then("Verify the save button should be enable")
	public void verify_the_save_button_should_be_enable() {
		casingPage.verifySaveButtonEnabled();
	}

	@And("Verify the default selection option in casing field")
	public void verify_the_default_selection_option_in_casing_field() {
		casingPage.verifyDefaultSelectionOptionInCasingField();
	}

	@And("Verify the default selection option in grade field")
	public void verify_the_default_selection_option_in_grade_field() {
		casingPage.verifyDefaultSelectionOptionInGradeField();
	}

	@When("Select the OD(in) field drop down")
	public void select_the_od_in_field_drop_down() {
		casingPage.selectOdInFieldDropDown();
		casingPage.selectOdInFieldDropDownValue();
	}

	@Then("Verify all the option in the Od field dropdown")
	public void verify_all_the_option_in_the_od_field_dropdown() throws InterruptedException {
		casingPage.verifyAllOptionsInOdFieldDropdown();
	}

	@When("Select a option from weight field dropdown")
	public void select_a_option_from_weight_field_dropdown() {
		casingPage.selectOptionFromWeightFieldDropdown();
		casingPage.selectWeightFieldDropDownValue();
	}

	@Then("Verify the value in ID field")
	public void verify_the_value_in_id_field() {
		casingPage.verifyValueInIdField();
	}

	@And("Verify the value in length field of first row")
	public void verify_the_value_in_length_field_of_first_row() {
		casingPage.verifyValueInLengthFieldOfFirstRow();
	}

	@When("Select casing option from injection is down dropdown")
	public void select_casing_option_from_injection_is_down_dropdown() {
		casingPage.selectCasingOptionFromInjectionIsDownDropdown();
	}

	@And("Click on save button")
	public void click_on_save_button() {
		casingPage.clickElementOnSaveButton();
	}

//	@And("User refresh the page")
//	public void user_refresh_the_page() {
//		casingPage.refreshPage();
//	}

	@Then("Verify the values in Length Top MD Bot MD Casing OD Weight ID Grade fields")
	public void Verify_the_values_in_Length_Top_MD_Bot_MD_Casing_OD_Weight_ID_Grade_fields() {
		casingPage.verifyValuesInFields();
	}

	@When("User enter the value in top md field")
	public void user_enter_the_value_in_top_md_field() {
		casingPage.enterValueInTopMdField();
	}

	@And("User enter the value in bot md field")
	public void user_enter_the_value_in_bot_md_field() {
		casingPage.enterValueInBotMdField();
	}

	@Then("Verify the bydefault dropdown value of casing field")
	public void verify_the_bydefault_dropdown_value_of_casing_field() {
		casingPage.verifyByDefaultDropdownValueOfCasingField();
	}

	@And("Verify the bydefault dropdown value of grade field")
	public void verify_the_bydefault_dropdown_value_of_grade_field() {
		casingPage.verifyByDefaultDropdownValueOfGradeField();
	}

	@When("User enter the value into OD field")
	public void user_enter_the_value_into_od_field() {
		casingPage.enterValueIntoOdField();
	}

	@And("User enter the value into weight field")
	public void user_enter_the_value_into_weight_field() {
		casingPage.enterValueIntoWeightField();
	}

	@And("User enter the value into ID field")
	public void user_enter_the_value_into_id_field() {
		casingPage.enterValueIntoIdField();
	}

	@And("User select a option from grade dropdown")
	public void user_select_a_option_from_grade_dropdown() {
		casingPage.selectOptionFromGradeDropdown();
	}

	@And("Click on the save button")
	public void click_on_the_save_button() {
		casingPage.clickElementOnSaveButton();
	}

	@Then("Verify the values in Length Top MD Bot MD Casing OD Weight ID Grade fields for second row")
	public void Verify_the_values_in_Length_Top_MD_Bot_MD_Casing_OD_Weight_ID_Grade_fields_for_second_row() {
		casingPage.verifyValuesInFieldsForSecondRow();
	}

	@Then("verify the save button should be disabled")
	public void verify_the_save_button_should_be_disabled() {
		casingPage.isSaveButtonEnabled();
	}
	
	@Then("Verify the values in the Length field for the first row under the Casing tab")
	public void Verify_the_values_in_the_Length_field_for_the_first_row_under_the_Casing_tab() {
		casingPage.verifyValueInLengthFieldOfFirstRow();
	}

	@Then("Verify the values in the Top MD field for the first row under the Casing tab")
	public void Verify_the_values_in_the_Top_MD_field_for_the_first_row_under_the_Casing_tab() {
		casingPage.verifyValueInTopMDFieldOfFirstRow();
	}
	
	@Then("Verify the values in the Bot MD field for the first row under the Casing tab")
	public void Verify_the_values_in_the_Bot_MD_field_for_the_first_row_under_the_Casing_tab() {
		casingPage.verifyValueInBotMDFieldOfFirstRow();
	}
	
	@Then("Verify the values in the casing field for the first row under the Casing tab")
	public void Verify_the_values_in_the_casing_field_for_the_first_row_under_the_Casing_tab() {
		casingPage.verifyDefaultSelectionOptionInCasingField();
	}
	
	@Then("Verify the values in the OD field for the first row under the Casing tab")
	public void Verify_the_values_in_the_OD_field_for_the_first_row_under_the_Casing_tab() {
		casingPage.verifyValueInODFieldOfFirstRow();
	}
	
	@Then("Verify the values in the Weight field for the first row under the Casing tab")
	public void Verify_the_values_in_the_Weight_field_for_the_first_row_under_the_Casing_tab() {
		casingPage.verifyValueInWeightFieldOfFirstRow();
	}
	
	@Then("Verify the values in the ID field for the first row under the Casing tab")
	public void Verify_the_values_in_the_ID_field_for_the_first_row_under_the_Casing_tab() {
		casingPage.verifyValueInIDFieldOfFirstRow();
	}
	
	@Then("Verify the values in the Grade field for the first row under the Casing tab")
	public void Verify_the_values_in_the_Grade_field_for_the_first_row_under_the_Casing_tab() {
		casingPage.verifyValueInGradeFieldOfFirstRow();
	}
	
	@When("clickElement on the save button")
	public void clickElement_on_the_save_button() {
		casingPage.clickElementSaveButton();
	}
	
	@When("User enter the value into the Top MD field for second row")
	public void User_enter_the_value_into_the_Top_MD_field_for_second_row() {
		casingPage.enterDataIntoTopMdFieldForSecondRow();
	}

	@When("User enter the value into the Bot MD field for second row")
	public void User_enter_the_value_into_the_Bot_MD_field_for_second_row() {
		casingPage.enterDataIntoBotMdFieldForSecondRow();
	}

	@When("User Select the value from the Casing dropdown for second row")
	public void User_Select_the_value_from_the_Casing_dropdown_for_second_row() {
		casingPage.verifyDefaultSelectionOptionInCasingFieldForSecondRow();
	}

	@When("User enter the value into the OD field for second row")
	public void User_enter_the_value_into_the_OD_field_for_second_row() {
		casingPage.enterDataIntoODFieldForSecondRow();
	}

	@When("User enter the value into the Weight field for second row")
	public void User_enter_the_value_into_the_Weight_field_for_second_row() {
		casingPage.enterDataIntoWeightFieldForSecondRow();
	}

	@When("User enter the value into the ID field for second row")
	public void User_enter_the_value_into_the_ID_field_for_second_row() {
		casingPage.enterDataIntoIDFieldForSecondRow();
	}

	@When("User Select the value from the grade dropdown for second row")
	public void User_Select_the_value_from_the_grade_dropdown_for_second_row() {
		casingPage.verifyDefaultSelectionOptionInGradeFieldForSecondRow();
	}
	
	@Then("Verify the values in the Length field for the second row under the Casing tab")
	public void Verify_the_values_in_the_Length_field_for_the_second_row_under_the_Casing_tab() {
		casingPage.verifyValueInLengthFieldOfFirstRow();
	}

	@Then("Verify the values in the Top MD field for the second row under the Casing tab")
	public void Verify_the_values_in_the_Top_MD_field_for_the_second_row_under_the_Casing_tab() {
		casingPage.verifyValueInTopMDFieldOfSecondRow();
	}
	
	@Then("Verify the values in the Bot MD field for the second row under the Casing tab")
	public void Verify_the_values_in_the_Bot_MD_field_for_the_second_row_under_the_Casing_tab() {
		casingPage.verifyValueInBotMDFieldOfSecondRow();
	}
	
	@Then("Verify the values in the casing field for the second row under the Casing tab")
	public void Verify_the_values_in_the_casing_field_for_the_second_row_under_the_Casing_tab() {
		casingPage.SelectionOptionInCasingFieldForSecondRow();
	}
	
	@Then("Verify the values in the OD field for the second row under the Casing tab")
	public void Verify_the_values_in_the_OD_field_for_the_second_row_under_the_Casing_tab() {
		casingPage.verifyValueInODFieldOfSecondRow();
	}
	
	@Then("Verify the values in the Weight field for the second row under the Casing tab")
	public void Verify_the_values_in_the_Weight_field_for_the_second_row_under_the_Casing_tab() {
		casingPage.verifyValueInWeightFieldOfSecondRow();
	}
	
	@Then("Verify the values in the ID field for the second row under the Casing tab")
	public void Verify_the_values_in_the_ID_field_for_the_second_row_under_the_Casing_tab() {
		casingPage.verifyValueInIDFieldOfSecondRow();
	}
	
	@Then("Verify the values in the Grade field for the second row under the Casing tab")
	public void Verify_the_values_in_the_Grade_field_for_the_second_row_under_the_Casing_tab() {
		casingPage.verifyValueInGradeFieldOfSecondRow();
	}

}