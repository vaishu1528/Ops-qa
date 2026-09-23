package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.fluidrheologyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fluidrheology extends DriverFactory {
	fluidrheologyPage fluidrheologyPage = new fluidrheologyPage(driver);

// @Given("the user is on the Material Selection module")
// public void the_user_is_on_the_material_selection_module() {
// fluidrheologyPage.navigateToMaterialSelectionModule();
// }
	@Given("the user clicks on the Material Selection module")
	public void the_user_clicks_on_the_material_selection_module() {
		fluidrheologyPage.clickElementOnMaterialSelectionModule();
	}

	@Then("verify that user is on the fluid selection tab")
	public void verify_that_user_is_on_the_fluid_selection_tab() {
		fluidrheologyPage.isOnFluidSelectionTab();
	}

// @When("the user clicks on the edit button in front of the fluid name")
// public void the_user_clicks_on_the_edit_button_in_front_of_the_fluid_name() {
// fluidrheologyPage.clickElementOnEditButton();
// }
//@Then("verify the page title")
//public void verify_the_page_title() {
//fluidrheologyPage.isPageTitleCorrect();
//}
	@When("the user clicks on Fluid Rheology tab")
	public void the_user_clicks_on_fluid_rheology_tab() {
		fluidrheologyPage.clickElementOnFluidRheologyTab();
	}

//@Then("verify the fluid name under selected fluid section")
//public void verify_the_fluid_name_under_selected_fluid_section() {
//fluidrheologyPage.isFluidNameCorrect();
//}
	@And("verify the Description for the fluid")
	public void verify_the_description_for_the_fluid() {
		fluidrheologyPage.isDescriptionCorrect();
	}

	@And("verify the vendor field data")
	public void verify_the_vendor_field_data() {
		fluidrheologyPage.isVendorFieldDataCorrect();
	}

	@And("verify system field data")
	public void verify_system_field_data() {
		fluidrheologyPage.isSystemFieldDataCorrect();
	}

	@And("verify Modified Properties field data")
	public void verify_modified_properties_field_data() {
		fluidrheologyPage.isModifiedPropertiesFieldDataCorrect();
	}

	@When("the user enters more than three digits into time column under Rheology for Selected Fluid section")
	public void the_user_enters_more_than_three_digits_into_time_column_under_rheology_for_selected_fluid_section() {
		fluidrheologyPage.enterMoreThanThreeDigitsIntoTimeColumn();
	}

	@Then("verify user is getting Error popup")
	public void verify_user_is_getting_error_popup() {
		fluidrheologyPage.isErrorPopupDisplayed();
	}

	@Then("user click on close button")
	public void user_click_on_close_button() {
		fluidrheologyPage.clickclosebutton();
	}

	@When("the user enters less than three digits into time column under Rheology for Selected Fluid section")
	public void the_user_enters_less_than_three_digits_into_time_column_under_rheology_for_selected_fluid_section() {
		fluidrheologyPage.enterLessThanThreeDigitsIntoTimeColumn();
	}

	@And("the user enters more than three digits into n column under Rheology for Selected Fluid section")
	public void the_user_enters_more_than_three_digits_into_n_column_under_rheology_for_selected_fluid_section() {
		fluidrheologyPage.enterMoreThanThreeDigitsIntoNColumn();
	}

	@When("the user enters less than three digits into n column under Rheology for Selected Fluid section")
	public void the_user_enters_less_than_three_digits_into_n_column_under_rheology_for_selected_fluid_section() {
		fluidrheologyPage.enterLessThanThreeDigitsIntoNColumn();
	}

	@And("the user enters data into k column under Rheology for Selected Fluid section")
	public void the_user_enters_data_into_k_column_under_rheology_for_selected_fluid_section() {
		fluidrheologyPage.enterDataIntoKColumn();
	}

	@When("the user clicks on the Save button")
	public void the_user_clicks_on_the_save_button() {
		fluidrheologyPage.clickElementOnSaveButton();
	}

	@Then("verify that data has been saved or not")
	public void verify_that_data_has_been_saved_or_not() {
		fluidrheologyPage.isDataSaved();
	}

	@Then("user clicks on the Fluid Thermal Properties tab")
	public void user_clicks_on_the_Fluid_Thermal_Properties_tab() {
		fluidrheologyPage.clickonFluidThermalPropertiestab();
	}

	@Then("user verifies the default data for all fields under the Thermal properties section")
	public void user_verifies_the_default_data_for_all_fields_under_the_Thermal_properties_section() {
		fluidrheologyPage.defaultdataforThermalPropertiessection();
	}

	@Then("verify that data has been saved or not for the first Fluid under Thermal Properties tab")
	public void verify_that_data_has_been_saved_or_not_for_the_first_Fluid_under_Thermal_Properties_tab() {
		fluidrheologyPage.dataverificationforfirstfluid();
	}

	@Then("verify that data has been saved or not for the Second Fluid under Thermal Properties tab")
	public void verify_that_data_has_been_saved_or_not_for_the_Second_Fluid_under_Thermal_Properties_tab() {
		fluidrheologyPage.dataverificationforSecondfluid();
	}

	@Then("verify that data has been saved or not for the Third Fluid under Thermal Properties tab")
	public void verify_that_data_has_been_saved_or_not_for_the_Third_Fluid_under_Thermal_Properties_tab() {
		fluidrheologyPage.dataverificationforThirdfluid();
	}

	@Then("verify that data has been saved or not for the Fourth Fluid under Thermal Properties tab")
	public void verify_that_data_has_been_saved_or_not_for_the_Fourth_Fluid_under_Thermal_Properties_tab() {
		fluidrheologyPage.dataverificationforFourthfluid();
	}

	@Then("user enters data for the Thermal Conductivity field")
	public void user_enters_data_for_the_Thermal_Conductivity_field() {
		fluidrheologyPage.enterdataThermalConductivity();
	}

	@Then("user enters data for the Thermal Conductivity field for the Second fluid")
	public void user_enters_data_for_the_Thermal_Conductivity_field_for_the_Second_fluid() {
		fluidrheologyPage.enterdataThermalConductivityfortheSecondfluid();
	}

	@Then("user enters data for the Thermal Conductivity field for the Third fluid")
	public void user_enters_data_for_the_Thermal_Conductivity_field_for_the_Third_fluid() {
		fluidrheologyPage.enterdataThermalConductivityfortheThirdfluid();
	}

	@Then("user enters data for the Thermal Conductivity field for the Fourth fluid")
	public void user_enters_data_for_the_Thermal_Conductivity_field_for_the_Fourth_fluid() {
		fluidrheologyPage.enterdataThermalConductivityfortheFourthfluid();
	}

	@Then("user enters data for the Specific Heat field")
	public void user_enters_data_for_the_Specific_Heat_field() {
		fluidrheologyPage.enterdataSpecificHeat();
	}

	@Then("user enters data for the Specific Heat field for the Second fluid")
	public void user_enters_data_for_the_Specific_Heat_field_for_the_Second_fluid() {
		fluidrheologyPage.enterdataSpecificHeatfortheSecondfluid();
	}

	@Then("user enters data for the Specific Heat field for the Third fluid")
	public void user_enters_data_for_the_Specific_Heat_field_for_the_Third_fluid() {
		fluidrheologyPage.enterdataSpecificHeatfortheThirdfluid();
	}

	@Then("user enters data for the Specific Heat field for the Fourth fluid")
	public void user_enters_data_for_the_Specific_Heat_field_for_the_Fourth_fluid() {
		fluidrheologyPage.enterdataSpecificHeatfortheFourthfluid();
	}

	@When("user clicks on the Chemicals tab")
	public void user_clicks_on_the_Chemicals_tab() {
		fluidrheologyPage.clickonchemicalstab();
	}

	@When("user verifies the chemial names form the table")
	public void user_verifies_the_chemial_names_form_the_table() {
		fluidrheologyPage.Verifychemicalnames();
	}

	@When("user verifies the type for the chemicals")
	public void user_verifies_the_type_for_the_chemicals() {
		fluidrheologyPage.Verifytypeforchemicalnames();
	}

	@When("user enters the Concentration for each chemical for first fluid")
	public void user_enters_the_Concentration_for_each_chemical_for_first_fluid() {
		fluidrheologyPage.Enterdataforchemconc();
	}

	@When("user enters the Concentration for each chemical for Second fluid")
	public void user_enters_the_Concentration_for_each_chemical_for_Second_fluid() {
		fluidrheologyPage.Enterdataforchemconc();
	}

	@When("user enters the Concentration for each chemical for Third fluid")
	public void user_enters_the_Concentration_for_each_chemical_for_Third_fluid() {
		fluidrheologyPage.Enterdataforchemconc();
	}

	@When("user enters the Concentration for each chemical for Fourth fluid")
	public void user_enters_the_Concentration_for_each_chemical_for_Fourth_fluid() {
		fluidrheologyPage.Enterdataforchemconc();
	}

	@Then("verify that data has been saved or not for the first Fluid under Chemicals tab")
	public void verify_that_data_has_been_saved_or_not_for_the_first_Fluid_under_Chemicals_tab() {
		fluidrheologyPage.Verifysaveddata();
	}

	@Then("verify that data has been saved or not for the Second Fluid under Chemicals tab")
	public void verify_that_data_has_been_saved_or_not_for_the_Second_Fluid_under_Chemicals_tab() {
		fluidrheologyPage.Verifysaveddata();
	}

	@Then("verify that data has been saved or not for the Third Fluid under Chemicals tab")
	public void verify_that_data_has_been_saved_or_not_for_the_Third_Fluid_under_Chemicals_tab() {
		fluidrheologyPage.Verifysaveddata();
	}

	@Then("verify that data has been saved or not for the Fourth Fluid under Chemicals tab")
	public void verify_that_data_has_been_saved_or_not_for_the_Fourth_Fluid_under_Chemicals_tab() {
		fluidrheologyPage.Verifysaveddata();
	}

	@Then("user enters data for the Fluid Density field")
	public void user_enters_data_for_the_Fluid_Density_field() {
		fluidrheologyPage.enterdataFluidDensity();
	}

	@Then("user enters data for the Fluid Density field for the Second fluid")
	public void user_enters_data_for_the_Fluid_Density_field_for_the_Second_fluid() {
		fluidrheologyPage.enterdataFluidDensityfortheSecondfluid();
	}

	@Then("user enters data for the Fluid Density field for the Third fluid")
	public void user_enters_data_for_the_Fluid_Density_field_for_the_Third_fluid() {
		fluidrheologyPage.enterdataFluidDensityfortheThirdfluid();
	}

	@Then("user enters data for the Fluid Density field for the Fourth fluid")
	public void user_enters_data_for_the_Fluid_Density_field_for_the_Fourth_fluid() {
		fluidrheologyPage.enterdataFluidDensityfortheFourthfluid();
	}

	@Then("verify that data has been saved for Apparent Viscosity Calculator section")
	public void verify_that_data_has_been_saved_or_not_for_Apparent_Viscosity_Calculator_section() {
		fluidrheologyPage.isDataSavedAppViscsection();
	}

	@And("the user verifies the default data for the Shear Rate field")
	public void the_user_verifies_the_default_data_for_the_shear_rate_field() {
		fluidrheologyPage.isDefaultDataForShearRateFieldCorrect();
	}

	@And("the user verifies the default data for the App Visc field")
	public void the_user_verifies_the_default_data_for_the_app_visc_field() {
		fluidrheologyPage.isDefaultDataForAppViscFieldCorrect();
	}

	@And("the user verifies the default data for the Temperature field")
	public void the_user_verifies_the_default_data_for_the_temperature_field() {
		fluidrheologyPage.isDefaultDataForTemperatureFieldCorrect();
	}

	@And("the user verifies that Use Reservoir Temperature check box is already selected")
	public void the_user_verifies_that_use_reservoir_temperature_check_box_is_already_selected() {
		fluidrheologyPage.isUseReservoirTemperatureCheckBoxSelected();
	}

	@When("the user unchecks Use Reservoir Temperature check box")
	public void the_user_unchecks_use_reservoir_temperature_check_box() {
		fluidrheologyPage.uncheckUseReservoirTemperatureCheckBox();
	}

	@Then("verify that temperature field is editable")
	public void verify_that_temperature_field_is_editable() {
		fluidrheologyPage.isTemperatureFieldEditable();
	}

	@When("the user enters data into time field")
	public void the_user_enters_data_into_time_field() {
		fluidrheologyPage.enterDataIntoTimeField();
	}

	@And("the user enters data into Shear Rate field")
	public void the_user_enters_data_into_shear_rate_field() {
		fluidrheologyPage.enterDataIntoShearRateField();
	}

	@And("the user enters data into Shear Rate field for recalculation")
	public void the_user_enters_data_into_shear_rate_field_for_recalculation() {
		fluidrheologyPage.enterDataIntoShearRateFieldrecalculation();
	}

	@And("the user enters data into time field for recalculation")
	public void the_user_enters_data_into_time_field_for_recalculation() {
		fluidrheologyPage.enterDataIntotimeFieldrecalculation();
	}

	@And("the user enters data in Temperature field")
	public void the_user_enters_data_in_temperature_field() {
		fluidrheologyPage.enterDataIntoTemperatureField();
	}

//    @When("the user clicks on the save button")
	@Then("verify that data has been saved")
	public void verify_that_data_has_been_saved() {
		fluidrheologyPage.isDataSaved();
	}

//    @When("the user enters data into time field")
//    @And("the user enters data into Shear Rate field")
	@When("the user clicks on the Recalculate button")
	public void the_user_clicks_on_the_recalculate_button() {
		fluidrheologyPage.clickElementOnRecalculateButton();
	}

	@Then("verify that App Visc value is changed after clicking on the Recalculate button")
	public void verify_that_app_visc_value_is_changed_after_clicking_on_the_Recalculate_button() {
		fluidrheologyPage.isAppViscValueChanged();
	}

	@And("verify the presence of Go Back button")
	public void verify_the_presence_of_go_back_button() {
		fluidrheologyPage.isGoBackButtonPresent();
	}

// @When("the user clicks on the Go Back button")
// public void the_user_clicks_on_the_go_back_button() {
// fluidrheologyPage.clickElementOnGoBackButton();
// }
	@Then("verify user is directed to the Material selection screen")
	public void verify_user_is_directed_to_the_material_selection_screen() {
		fluidrheologyPage.isOnMaterialSelectionScreen();
	}

	@Given("User navigates to the fluid rheology page")
	public void user_navigates_to_the_fluid_rheology_page() {
		fluidrheologyPage.navigateToFluidRheologyPage();
	}

	@When("User selects the fluid type as {string}")
	public void user_selects_the_fluid_type_as(String fluidType) {
		fluidrheologyPage.selectFluidType(fluidType);
	}

	@And("User enters the viscosity value as {string}")
	public void user_enters_the_viscosity_value_as(String viscosityValue) {
		fluidrheologyPage.enterViscosityValue(viscosityValue);
	}

	@And("User clickElements on the calculate button")
	public void user_clickElements_on_the_calculate_button() {
		fluidrheologyPage.clickElementCalculateButton();
	}

	@Then("User should see the calculated rheology results")
	public void user_should_see_the_calculated_rheology_results() {
		fluidrheologyPage.isRheologyResultsDisplayed();
	}

	@When("User resets the fluid rheology form")
	public void user_resets_the_fluid_rheology_form() {
		fluidrheologyPage.resetFluidRheologyForm();
	}

	@Then("User should see the form reset to default values")
	public void user_should_see_the_form_reset_to_default_values() {
		fluidrheologyPage.isFormResetToDefaultValues();
	}
}