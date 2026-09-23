package com.FracProPlus.stepdefinitions;


import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.ReservoirParametersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class reservoirparameters extends DriverFactory {
ReservoirParametersPage reservoirParametersPage = new ReservoirParametersPage(driver);
// @Given("the user is on the Dashboard Page")
// public void the_user_is_on_the_Dashboard_Page() {
// reservoirParametersPage.verifyDashboardPage();
// }
// @When("the user click on the go to application under the FracPro Live card")
// public void the_user_click_on_the_go_to_application_under_the_FracPro_Live_card() {
// reservoirParametersPage.clickElementGoToApplication();
// }
// @And("Navigate and click on the pad from the home screen")
// public void navigate_and_click_on_the_pad_from_the_home_screen() {
// reservoirParametersPage.navigateToPad();
// }
// @And("Click on the well from overview")
// public void click_on_the_well_from_overview() {
// reservoirParametersPage.clickElementWellFromOverview();
// }
@When("the user clicks on the Reservoir Parameters option under the input tab")
public void the_user_clicks_on_the_Reservoir_Parameters_option_under_the_input_tab() {
reservoirParametersPage.clickElementReservoirParametersOption();
}
@Then("the page header should be Reservoir Parameters")
public void the_page_header_should_be_Reservoir_Parameters() {
reservoirParametersPage.verifyPageHeader();
}
@Then("the user should see default data for all the fields")
public void the_user_should_see_default_data_for_all_the_fields() {
reservoirParametersPage.verifyDefaultData();
}
@When("the user verifies the warning message for the Fracture Height field by clearing its value and clicking outside the field")
public void the_user_verifies_the_warning_message_for_the_Fracture_Height_field_by_clearing_its_value_and_clicking_outside_the_field(){
reservoirParametersPage.verifyWarningMessageforFractureHeightField();
}
@When("the user verifies the warning message for the Payzone Height field by clearing its value and clicking outside the field")
public void the_user_verifies_the_warning_message_for_the_Payzone_Height_field_by_clearing_its_value_and_clicking_outside_the_field() {
reservoirParametersPage.verifyWarningMessageforPayzoneHeightField();
}
@When("the user verifies the warning message for the Depth to Center of Pay field by clearing its value and clicking outside the field")
public void the_user_verifies_the_warning_message_for_the_Depth_to_Center_of_Pay_field_by_clearing_its_value_and_clicking_outside_the_field() {
reservoirParametersPage.verifyWarningMessageforDepthtoCenterofPayField();
}
@When("the user verifies the warning message for the Closure Stress in Payzone field by clearing its value and clicking outside the field")
public void the_user_verifies_the_warning_message_for_the_Closure_Stress_in_Payzone_field_by_clearing_its_value_and_clicking_outside_the_field() {
reservoirParametersPage.verifyWarningMessageforClosureStressinPayzoneField();
}
@When("the user verifies the warning message for the Formation Modulus field by clearing its value and clicking outside the field")
public void the_user_verifies_the_warning_message_for_the_Formation_Modulus_field_by_clearing_its_value_and_clicking_outside_the_field() {
reservoirParametersPage.verifyWarningMessageforFormationModulusField();
}
@When("the user verifies the warning message for the Formation Poissons Ratio field by clearing its value and clicking outside the field")
public void the_user_verifies_the_warning_message_for_the_Formation_Poissons_Ratio_field_by_clearing_its_value_and_clicking_outside_the_field() {
reservoirParametersPage.verifyWarningMessageforFormationPoissonsRatioField();
}
@When("the user verifies the warning message for the Leakoff Coefficient field by clearing its value and clicking outside the field")
public void the_user_verifies_the_warning_message_for_the_Leakoff_Coefficient_field_by_clearing_its_value_and_clicking_outside_the_field() {
reservoirParametersPage.verifyWarningMessageforLeakoffCoefficientField();
}
@When("the user verifies the warning message for the Fracture Toughness field by clearing its value and clicking outside the field")
public void the_user_verifies_the_warning_message_for_the_Fracture_Toughness_field_by_clearing_its_value_and_clicking_outside_the_field() {
reservoirParametersPage.verifyWarningMessageforFractureToughnessField();
}

@When("the user performs the refresh action")
public void the_user_performs_the_refresh_action() {
reservoirParametersPage.performRefreshAction();
}
@Then("the default data should appear in all the fields")
public void the_default_data_should_appear_in_all_the_fields() {
reservoirParametersPage.verifyDefaultData();
}
@When("the user clears any field from the Reservoir Parameters screen")
public void the_user_clearElements_any_field_from_the_Reservoir_Parameters_screen() {
reservoirParametersPage.clearElementAnyField();
}
@Then("the save and next button should be disabled")
public void the_save_and_next_button_should_be_disabled() {
reservoirParametersPage.isSaveAndNextButtonEnabled();
}
@Then("the Pore Fluid Permeability field should be non-editable")
public void the_Pore_Fluid_Permeability_field_should_be_non_editable() {
reservoirParametersPage.isPoreFluidPermeabilityFieldEditable();
}
@And("the Reservoir Temperature field should be non-editable")
public void the_Reservoir_Temperature_field_should_be_non_editable() {
reservoirParametersPage.isReservoirTemperatureFieldEditable();
}
@When("the user enters data into the Fracture Height Field")
public void the_user_enters_data_into_the_Fracture_Height_Field() {
reservoirParametersPage.enterDataIntoFractureHeightField();
}
@When("the user enters data into the Payzone Height Field")
public void the_user_enters_data_into_the_Payzone_Height_Field() {
reservoirParametersPage.enterDataIntoPayzoneHeightField();
}
@When("the user enters data into the Depth to Center of Pay Field")
public void the_user_enters_data_into_the_Depth_to_Center_of_Pay_Field() {
reservoirParametersPage.enterDataIntoDepthToCenterOfPayField();
}
@When("the user enters data into the Closure Stress in Payzone Field")
public void the_user_enters_data_into_the_Closure_Stress_in_Payzone_Field() {
reservoirParametersPage.enterDataIntoClosureStressInPayzoneField();
}
@When("the user enters data into the Formation Modulus Field")
public void the_user_enters_data_into_the_Formation_Modulus_Field() {
reservoirParametersPage.enterDataIntoFormationModulusField();
}
@When("the user enters data into the Formation Poissons Ratio Field")
public void the_user_enters_data_into_the_Formation_Poissons_Ratio_Field() {
reservoirParametersPage.enterDataIntoFormationPoissonsRatioField();
}
@When("the user enters data into the Leakoff Coefficient Field")
public void the_user_enters_data_into_the_Leakoff_Coefficient_Field() {
reservoirParametersPage.enterDataIntoLeakoffCoefficientField();
}

@When("the user enters data into the Fracture Toughness Field")
public void the_user_enters_data_into_the_Fracture_Toughness_Field() {
reservoirParametersPage.enterDataIntoFractureToughnessField();
}

@When("the user selects a value from the Reservoir Lithology dropdown")
public void the_user_selects_a_value_from_the_Reservoir_Lithology_dropdown() {
reservoirParametersPage.selectValueFromReservoirLithologyDropdown();
}
 @When("the user clicks on the save button for Reservoir Parameters screen")
 public void the_user_clicks_on_the_save_button() {
 reservoirParametersPage.clickElementSaveButton();
 }
@Then("the data should be saved successfully")
public void the_data_should_be_saved_successfully() {
reservoirParametersPage.verifyDataSavedSuccessfully();
}

@And("the user clear the depth to center of pay field")
public void the_user_clearElements_the_depth_to_center_of_pay_field() {
reservoirParametersPage.clearElementDepthToCenterOfPayField();
}
@And("the user clear the payzone height field")
public void the_user_clearElements_the_payzone_height_field() {
reservoirParametersPage.clearElementPayzoneHeightField();
}
@And("the user clear any field from the reservoir parameters screen")
public void the_user_clearElements_any_field_from_the_reservoir_parameters_screen() {
reservoirParametersPage.clearElementAnyFieldFromReservoirParametersScreen();
}
@And("the user clear the formation poissons ratio field")
public void the_user_clearElements_the_formation_poissons_ratio_field() {
reservoirParametersPage.clearElementFormationPoissonsRatioField();
}
@And("the user clear the formation modulus field")
public void the_user_clearElements_the_formation_modulus_field() {
reservoirParametersPage.clearElementFormationModulusField();
}
@And("the user clear the fracture toughness field")
public void the_user_clearElements_the_fracture_toughness_field() {
reservoirParametersPage.clearElementFractureToughnessField();
}
@And("the user clear the closure stress in payzone field")
public void the_user_clearElements_the_closure_stress_in_payzone_field() {
reservoirParametersPage.clearElementClosureStressInPayzoneField();
}
@And("the user clear the leakoff coefficient field")
public void the_user_clearElements_the_leakoff_coefficient_field() {
reservoirParametersPage.clearElementLeakoffCoefficientField();
}

}