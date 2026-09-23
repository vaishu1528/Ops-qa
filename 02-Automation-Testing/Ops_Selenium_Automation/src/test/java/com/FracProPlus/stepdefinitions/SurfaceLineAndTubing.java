package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.SurfaceLineAndTubingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SurfaceLineAndTubing extends DriverFactory {
	SurfaceLineAndTubingPage surfaceLineAndTubingPage = new SurfaceLineAndTubingPage(driver);


	@When("Click on the surface line and tubing tab")
	public void click_on_the_surface_line_and_tubing_tab() {
		surfaceLineAndTubingPage.clickElementOnSurfaceLineAndTubingTab();
	}

	@Then("Verify the table page header")
	public void verify_the_table_page_header() {
		surfaceLineAndTubingPage.verifyTablePageHeader();
	}

	@When("Enter the data in to Top MD input field")
	public void enter_the_data_in_to_top_md_input_field() {
		surfaceLineAndTubingPage.enterDataIntoTopMDInputField();
	}

	@Then("User verify bot md field should be auto updated")
	public void verify_the_bot_md_field_should_be_auto_updated() {
		surfaceLineAndTubingPage.verifyBotMdFieldAutoUpdatedInSurfAndTubing();
	}
	
	@When("User enter data less than top md into bot md field")
	public void User_enter_the_data_less_than_top_md_into_bot_md_field() {
		surfaceLineAndTubingPage.verifylessBotMdFieldAutoUpdatedInSurfAndTubing();
	}

	
	@And("Enter the data in to Bot MD input field")
	public void enter_the_data_in_to_bot_md_input_field() {
		surfaceLineAndTubingPage.enterDataIntoBotMDInputField();
	}

	@Then("Verify the surf line and tubing default value")
	public void verify_the_surf_line_and_tubing_default_value() {
		surfaceLineAndTubingPage.verifySurfLineAndTubingDefaultValue();
	}

	@When("Select a value from Od input field")
	public void select_a_value_from_od_input_field() {
		surfaceLineAndTubingPage.selectValueFromOdInputField();
	}

	@And("Select a value fron Weight input field")
	public void select_a_value_fron_weight_input_field() {
		surfaceLineAndTubingPage.selectValueFromWeightInputField();
	}

	@Then("Verify the values of ID input field")
	public void verify_the_values_of_id_input_field() {
		surfaceLineAndTubingPage.verifyValuesOfIDInputField();
	}

	@And("Verify the by default value of Grade field")
	public void verify_the_by_default_value_of_grade_field() {
		surfaceLineAndTubingPage.verifyByDefaultValueOfGradeField();
	}

	@And("Verify the value of length field for first row under surf line and tubing tab")
	public void verify_the_value_of_length_field_for_first_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfLengthField();
	}
	
	@And("Verify the value of Top MD field for first row under surf line and tubing tab")
	public void Verify_the_value_of_Top_MD_field_for_first_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfTopMDFieldForfirstRow();
	}
	
	@And("Verify the value of Bot MD field for first row under surf line and tubing tab")
	public void Verify_the_value_of_Bot_MD_field_for_first_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfBotMDFieldForfirstRow();
	}

	@And("Verify the value of surfline and tubing field field for first row under surf line and tubing tab")
	public void Verify_the_value_of_surfline_and_tubing_field_field_for_first_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifySurfLineAndTubingDefaultValue();
	}
	
	@And("Verify the value of od field for first row under surf line and tubing tab")
	public void Verify_the_value_of_od_field_for_first_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfODFieldForfirstRow();
	}
	
	@And("Verify the value of weight field for first row under surf line and tubing tab")
	public void Verify_the_value_of_weight_field_for_first_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfWeightFieldForfirstRow();
	}
	
	@And("Verify the value of id field for first row under surf line and tubing tab")
	public void Verify_the_value_of_id_field_for_first_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfIDFieldForSecondRow();
	}
	@And("Verify the value of grade field for first row under surf line and tubing tab")
	public void Verify_the_value_of_grade_field_for_first_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyDefaultSelectionOptionInGradeField();
	}
	
	@And("User enter the value into Top MD input field for second row under surf line and tubing tab")
	public void user_enter_the_value_into_top_md_input_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.userEnterValueIntoTopMDInputField();
		surfaceLineAndTubingPage.selectOptionFromComputeDropdown();
	}
	
	@And("User enter the value into length input field for second row under surf line and tubing tab")
	public void user_enter_the_value_into_length_input_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.userEnterValueIntoLengthInputField();
		
	}

	@And("User enter the value in to Bot MD input field for second row under surf line and tubing tab")
	public void user_enter_the_value_in_to_bot_md_input_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.userEnterValueIntoBotMDInputField();
	}

	@Then("User select the value from surf line dropdown for second row under surf line and tubing tab")
	public void User_select_the_value_from_surf_line_dropdown_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyAllValuesOfSurfLineAndTubingDropdown();
	}

	@And("User select the value from surf line dropdown")
	public void user_select_the_value_from_surf_line_dropdown() {
		surfaceLineAndTubingPage.userSelectValueFromSurfLineDropdown();
	}

	@Then("Verify all the values of OD drodown field for second row under surf line and tubing tab")
	public void Verify_all_the_values_of_od_drodown_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyAllValuesOfODDropdownField();
	}

	@When("User select a value from Od input field for second row under surf line and tubing tab")
	public void User_select_a_value_from_od_input_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyAllValuesOfODDropdownField();
	}

	@And("User select a value from Weight input field for second row under surf line and tubing tab")
	public void User_select_a_value_from_weight_input_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.userSelectValueFromWeightInputField();
	}

	@And("User enter the value into ID input field for second row under surf line and tubing tab")
	public void User_enter_the_value_into_id_input_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.userEnterValueIntoIDInputField();
	}

	@And("Select the value from grade field dropdown for second row under surf line and tubing tab")
	public void Select_the_value_from_grade_field_dropdown_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.selectValueFromGradeFieldDropdown();
	}
	
	@And("Verify the value of length field for second row under surf line and tubing tab")
	public void verify_the_value_of_length_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfLengthFieldForSecondRow();
	}
	
	@And("Verify the value of Top MD field for second row under surf line and tubing tab")
	public void Verify_the_value_of_Top_MD_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfTopMDFieldForSecondRow();
	}
	
	@And("Verify the value of Bot MD field for second row under surf line and tubing tab")
	public void Verify_the_value_of_Bot_MD_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.userEnterValueIntoBotMDInputField();
	}

	@And("Verify the value of surfline and tubing second field for second row under surf line and tubing tab")
	public void Verify_the_value_of_surfline_and_tubing_field_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifySurfLineAndTubingDefaultValueForSecondRow();
	}
	
	@And("Verify the value of od field for second row under surf line and tubing tab")
	public void Verify_the_value_of_od_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfODFieldForSecondRow();
	}
	
	@And("Verify the value of weight field for second row under surf line and tubing tab")
	public void Verify_the_value_of_weight_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfWeightFieldForSecondRow();
	}
	
	@And("User verify the value of id field for first row under surf line and tubing tab")
	public void User_verify_the_value_of_id_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyValueOfIDFieldForfirstRow();
	}
	
	@And("Verify the value of grade field for second row under surf line and tubing tab")
	public void Verify_the_value_of_grade_field_for_second_row_under_surf_line_and_tubing_tab() {
		surfaceLineAndTubingPage.verifyDefaultSelectionOptionInGradeFieldforSLT();
	}

	@And("User perform right click action on the table")
	public void user_perform_right_click_action_on_the_table() {
		surfaceLineAndTubingPage.userPerformRightClickActionOnTable();
	}

	@And("Select insert row below option")
	public void select_insert_row_below_option() {
		surfaceLineAndTubingPage.selectInsertRowBelowOption();
	}

	@And("User click on insert row above option")
	public void user_click_on_insert_row_above_option() {
		surfaceLineAndTubingPage.userClickOnInsertRowAboveOption();
	}

	@And("User select remove row option")
	public void user_select_remove_row_option() {
		surfaceLineAndTubingPage.userSelectRemoveRowOption();
	}

	@And("Enter the data into the Top MD and Bot MD field")
	public void enter_the_data_into_the_top_md_and_bot_md_field() {
		surfaceLineAndTubingPage.enterDataIntoTopMDAndBotMDField();
	}

	@Then("Verify the automatically new added row")
	public void verify_the_automatically_new_added_row() {
		surfaceLineAndTubingPage.verifyAutomaticallyNewAddedRow();
	}

	@And("clickElement on save button")
	public void clickElement_on_save_button() {
		surfaceLineAndTubingPage.clickElementSaveButton();
	}
}