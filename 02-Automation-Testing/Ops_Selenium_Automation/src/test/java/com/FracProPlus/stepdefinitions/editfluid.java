package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.EditFluidPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editfluid extends DriverFactory {
	EditFluidPage editFluidPage = new EditFluidPage(driver);

	@Given("the user is on the Material Selection module")
	public void the_user_is_on_the_Material_Selection_module() {
		editFluidPage.navigateToMaterialSelectionModule();
	}

//@Given("the user clicks on the Material Selection module")
//public void the_user_clicks_on_the_Material_Selection_module() {
//editFluidPage.clickElementMaterialSelectionModule();
//}
	@Then("the user verifies that they are on the fluid selection tab")
	public void the_user_verifies_that_they_are_on_the_fluid_selection_tab() {
		editFluidPage.isFluidSelectionTabDisplayed();
	}

	@When("the user clicks on the edit button in front of the fluid name")
	public void the_user_clicks_on_the_edit_button_in_front_of_the_fluid_name() {
		editFluidPage.clickElementEditButton();
	}
	
	@When("the user clicks on the edit button in front of the second fluid name")
	public void the_user_clicks_on_the_edit_button_in_front_of_the_second_fluid_name() {
		editFluidPage.clickElementEditButton2();
	}
	
	@When("the user clicks on the edit button in front of the third fluid name")
	public void the_user_clicks_on_the_edit_button_in_front_of_the_third_fluid_name() {
		editFluidPage.clickElementEditButton3();
	}
	
	@When("the user clicks on the edit button in front of the fourth fluid name")
	public void the_user_clicks_on_the_edit_button_in_front_of_the_fourth_fluid_name() {
		editFluidPage.clickElementEditButton4();
	}

	@Then("the user verifies the page title")
	public void the_user_verifies_the_page_title() {
		editFluidPage.isPageTitleDisplayed();
	}

	@And("the user verifies the fluid name under the selected fluid section")
	public void the_user_verifies_the_fluid_name_under_the_selected_fluid_section() {
		editFluidPage.isFluidNameDisplayed();
	}

	@When("the user selects a Second fluid from the dropdown")
	public void the_user_selects_a_Second_fluid_from_the_dropdown() {
		editFluidPage.selectSecondFluid();
	}

	@When("the user selects a third fluid from the dropdown")
	public void the_user_selects_a_third_fluid_from_the_dropdown() {
		editFluidPage.selectthirdFluid();
	}

	@When("the user selects a fourth fluid from the dropdown")
	public void the_user_selects_a_fourth_fluid_from_the_dropdown() {
		editFluidPage.selectfourthFluid();
	}

	@And("the user verifies the description for the fluid")
	public void the_user_verifies_the_description_for_the_fluid() {
		editFluidPage.isFluidDescriptionDisplayed();
	}

	@And("the user verifies the description for the Second fluid")
	public void the_user_verifies_the_description_for_the_Second_fluid() {
		editFluidPage.isChangedDescriptionDisplayedforsecondfluid();
	}

	@And("verify the vendor field data for the Second fluid")
	public void verify_the_vendor_field_data_for_the_Second_fluid() {
		editFluidPage.isFluidvendorfieldDisplayedforsecondfluid();
	}

	@And("verify the vendor field data for the Third fluid")
	public void verify_the_vendor_field_data_for_the_Third_fluid() {
		editFluidPage.isFluidvendorfieldDisplayedforThirdfluid();
	}

	@And("verify the vendor field data for the Fourth fluid")
	public void verify_the_vendor_field_data_for_the_Fourth_fluid() {
		editFluidPage.isFluidvendorfieldDisplayedforFourthfluid();
	}

	@And("verify Modified Properties field data for the Second fluid")
	public void verify_Modified_Properties_field_data_for_the_Second_fluid() {
		editFluidPage.isModifiedPropertiesfieldDisplayedforSecondfluid();
	}

	@And("verify Modified Properties field data for the Third fluid")
	public void verify_Modified_Properties_field_data_for_the_Third_fluid() {
		editFluidPage.isModifiedPropertiesfieldDisplayedforThirdfluid();
	}

	@And("verify Modified Properties field data for the Fourth fluid")
	public void verify_Modified_Properties_field_data_for_the_Fourth_fluid() {
		editFluidPage.isModifiedPropertiesfieldDisplayedforFourthfluid();
	}

	@And("verify system field data for the Second fluid")
	public void verify_system_field_data_for_the_Second_fluid() {
		editFluidPage.issystemfieldDisplayedforSecondfluid();
	}

	@And("verify system field data for the Third fluid")
	public void verify_system_field_data_for_the_Third_fluid() {
		editFluidPage.issystemfieldDisplayedforThirdfluid();
	}

	@And("verify system field data for the Fourth fluid")
	public void verify_system_field_data_for_the_Fourth_fluid() {
		editFluidPage.issystemfieldDisplayedforFourthfluid();
	}

	@And("the user verifies the description for the third fluid")
	public void the_user_verifies_the_description_for_the_third_fluid() {
		editFluidPage.isChangedDescriptionDisplayedforthirdfluid();
	}

	@And("the user verifies the description for the fourth fluid")
	public void the_user_verifies_the_description_for_the_fourth_fluid() {
		editFluidPage.isChangedDescriptionDisplayedforfourthfluid();
	}

	@When("the user selects a different fluid from the dropdown")
	public void the_user_selects_a_different_fluid_from_the_dropdown() {
		editFluidPage.selectDifferentFluid();
	}

//@Then("the user verifies the changed description for the selected fluid")
//public void the_user_verifies_the_changed_description_for_the_selected_fluid() {
//editFluidPage.isChangedDescriptionDisplayed();
//}
	@And("the user verifies the presence of the Use Multiplier radio button under the Friction Data for Selected Fluid and Wellbore Segment section")
	public void the_user_verifies_the_presence_of_the_Use_Multiplier_radio_button_under_the_Friction_Data_for_Selected_Fluid_and_Wellbore_Segment_section() {
		editFluidPage.isUseMultiplierRadioButtonDisplayed();
	}

	@And("the user verifies the Use Multiplier radio button is already selected")
	public void the_user_verifies_the_Use_Multiplier_radio_button_is_already_selected() {
		editFluidPage.isUseMultiplierRadioButtonSelected();
	}

	@And("the user verifies the Friction Multiplier field is visible")
	public void the_user_verifies_the_Friction_Multiplier_field_is_visible() {
		editFluidPage.isFrictionMultiplierFieldVisible();
	}

	@And("the user verifies the Friction Multiplier field is editable")
	public void the_user_verifies_the_Friction_Multiplier_field_is_editable() {
		editFluidPage.isFrictionMultiplierFieldEditable();
	}

	@When("the user enters data into the Friction Multiplier input box")
	public void the_user_enters_data_into_the_Friction_Multiplier_input_box() {
		editFluidPage.enterDataIntoFrictionMultiplierInputBox();
	}

	@When("the user enters data into the Friction Multiplier input box for second Fluid")
	public void the_user_enters_data_into_the_Friction_Multiplier_input_box_for_second_Fluid() {
		editFluidPage.enterDataIntoFrictionMultiplierInputBoxsecondFluid();
	}

	@When("the user enters data into the Friction Multiplier input box for third Fluid")
	public void the_user_enters_data_into_the_Friction_Multiplier_input_box_for_third_Fluid() {
		editFluidPage.enterDataIntoFrictionMultiplierInputBoxthirdFluid();
	}

	@When("the user enters data into the Friction Multiplier input box for fourth Fluid")
	public void the_user_enters_data_into_the_Friction_Multiplier_input_box_for_fourth_Fluid() {
		editFluidPage.enterDataIntoFrictionMultiplierInputBoxfourthFluid();
	}

	@And("the user clicks on the save button for Fluid data")
	public void the_user_clicks_on_the_save_button() {
		editFluidPage.clickElementSaveButton();
	}

	@Then("the user verifies that after saving the data, the user gets an updated toast message")
	public void the_user_verifies_that_after_saving_the_data_the_user_gets_an_updated_toast_message() {
		editFluidPage.isUpdatedToastMessageDisplayed();
	}

	@And("the user verifies that under the Friction Data for Selected Fluid and Wellbore Segment section, all table columns are not editable")
	public void the_user_verifies_that_under_the_Friction_Data_for_Selected_Fluid_and_Wellbore_Segment_section_all_table_columns_are_not_editable() {
		editFluidPage.areTableColumnsNotEditable();
	}

	@And("the user verifies the presence of the Set Individual Values radio button under the Friction Data for Selected Fluid and Wellbore Segment section")
	public void the_user_verifies_the_presence_of_the_Set_Individual_Values_radio_button_under_the_Friction_Data_for_Selected_Fluid_and_Wellbore_Segment_section() {
		editFluidPage.isSetIndividualValuesRadioButtonDisplayed();
	}

	@When("the user clicks on the Set Individual Values radio button")
	public void the_user_clicks_on_the_Set_Individual_Values_radio_button() {
		editFluidPage.clickElementSetIndividualValuesRadioButton();
	}

	@Then("the user verifies that the Friction Multiplier field is non-editable")
	public void the_user_verifies_that_the_Friction_Multiplier_field_is_non_editable() {
		editFluidPage.isFrictionMultiplierFieldnonEditable();
	}

	@And("the user verifies that columns under the Friction Data for Selected Fluid and Wellbore Segment section are editable")
	public void the_user_verifies_that_columns_under_the_Friction_Data_for_Selected_Fluid_and_Wellbore_Segment_section_are_editable() {
		editFluidPage.areTableColumnsEditable();
	}

	@When("the user enters data under the Q bpm column")
	public void the_user_enters_data_under_the_Q_bpm_column() {
		editFluidPage.enterDataUnderQbpmColumn();
	}

	@When("the user enters data under the Q bpm column for Second fluid")
	public void the_user_enters_data_under_the_Q_bpm_column_for_Second_fluid() {
		editFluidPage.enterDataUnderQbpmColumnforsecondfluid();
	}

	@When("the user enters data under the Q bpm column for Third fluid")
	public void the_user_enters_data_under_the_Q_bpm_column_for_Third_fluid() {
		editFluidPage.enterDataUnderQbpmColumnforthirdfluid();
	}

	@When("the user enters data under the Q bpm column for Fourth fluid")
	public void the_user_enters_data_under_the_Q_bpm_column_for_Fourth_fluid() {
		editFluidPage.enterDataUnderQbpmColumnforfourthfluid();
	}

	@And("the user enters data under the P psi column")
	public void the_user_enters_data_under_the_P_psi_column() {
		editFluidPage.enterDataUnderPpsiColumn();
	}

	@And("the user enters data under the P psi column for second fluid")
	public void the_user_enters_data_under_the_P_psi_column_for_Second_Fluid() {
		editFluidPage.enterDataUnderPpsiColumnforsecondfluid();
	}

	@And("the user enters data under the P psi column for third fluid")
	public void the_user_enters_data_under_the_P_psi_column_for_Third_fluid() {
		editFluidPage.enterDataUnderPpsiColumnforthirdfluid();
	}

	@And("the user enters data under the P psi column for fourth fluid")
	public void the_user_enters_data_under_the_P_psi_column_for_Fourth_fluid() {
		editFluidPage.enterDataUnderPpsiColumnforfourthfluid();
	}

	@Then("the user verifies that the Save button is enabled")
	public void the_user_verifies_that_the_Save_button_is_enabled() {
		editFluidPage.isSaveButtonEnabled();
	}

	@Then("the user verifies the presence of the Go Back button")
	public void the_user_verifies_the_presence_of_the_Go_Back_button() {
		editFluidPage.isGoBackButtonDisplayed();
	}

	@When("the user clicks on the Go Back button")
	public void the_user_clicks_on_the_Go_Back_button() {
		editFluidPage.clickElementGoBackButton();
	}

	@Then("the user verifies that they are directed to the Material selection screen")
	public void the_user_verifies_that_they_are_directed_to_the_Material_selection_screen() {
		editFluidPage.isMaterialSelectionScreenDisplayed();
	}

	@Given("User is on the fluid edit page")
	public void user_is_on_the_fluid_edit_page() {
		editFluidPage.navigateToFluidEditPage();
	}

	@When("User enters fluid name {string}")
	public void user_enters_fluid_name(String fluidName) {
		editFluidPage.enterFluidName(fluidName);
	}

	@And("User selects fluid type {string}")
	public void user_selects_fluid_type(String fluidType) {
		editFluidPage.selectFluidType(fluidType);
	}

	@And("User enters fluid density {string}")
	public void user_enters_fluid_density(String fluidDensity) {
		editFluidPage.enterFluidDensity(fluidDensity);
	}

	@And("User clickElements on save button")
	public void user_clickElements_on_save_button() {
		editFluidPage.clickElementSaveButton();
	}

	@Then("User should see the fluid saved confirmation message")
	public void user_should_see_the_fluid_saved_confirmation_message() {
		editFluidPage.isFluidSavedConfirmationDisplayed();
	}

	@When("User enters invalid fluid name {string}")
	public void user_enters_invalid_fluid_name(String invalidFluidName) {
		editFluidPage.enterFluidName(invalidFluidName);
	}

	@Then("User should see an error message for invalid fluid name")
	public void user_should_see_an_error_message_for_invalid_fluid_name() {
		editFluidPage.isInvalidFluidNameErrorDisplayed();
	}

	@When("User enters invalid fluid density {string}")
	public void user_enters_invalid_fluid_density(String invalidFluidDensity) {
		editFluidPage.enterFluidDensity(invalidFluidDensity);
	}

	@Then("User should see an error message for invalid fluid density")
	public void user_should_see_an_error_message_for_invalid_fluid_density() {
		editFluidPage.isInvalidFluidDensityErrorDisplayed();
	}
}