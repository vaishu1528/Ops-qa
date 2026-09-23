package com.FracProPlus.stepdefinitions;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.EditProppantDataPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class EditProppantData extends DriverFactory {
	EditProppantDataPage ProppantDataPage = new EditProppantDataPage(driver);

	
	@When("the user click on the Edit Proppant icon for first proppant")
	public void the_user_click_on_the_edit_proppant_icon_for_first_proppant() {
		ProppantDataPage.clickElementOnFirstEditProppant();
	}

	@Then("verify default option for proppant name dropdown")
	public void verify_default_option_for_proppant_name_dropdown() {
		ProppantDataPage.verifyProppantNameSelectedOption();
	}

	@Then("verify Description field value and also verify description field should be read only")
	public void verify_description_field_value_and_also_verify_description_field_should_be_read_only() {
		ProppantDataPage.verifyDescriptionFieldValueAndIsDescriptionFieldReadable("100 Sand Sand - Other");
	}

	@Then("verify the default value of vendor field")
	public void verify_the_default_value_of_vendor_field() {
		ProppantDataPage.verifyVendorFieldValue("Other");
	}

	@Then("verify the default value of system field")
	public void verify_the_default_value_of_system_field() {
		ProppantDataPage.verifySystemFieldValue("Sand");
	}

	@Then("verify the default value of mesh size field")
	public void verify_the_default_value_of_mesh_size_field() {
		ProppantDataPage.verifyMeshSizeFieldValue("100/100");
	}

	@Then("verift default selected option for source dropdown")
	public void verift_default_selected_option_for_source_dropdown() {
		ProppantDataPage.verifySourceSelectedOption();
	}

	@Then("verify default option for proppant type dropdown")
	public void verify_default_option_for_proppant_type_dropdown() {
		ProppantDataPage.verifyProppantTypeSelectedOption();
	}

	@Then("verify default option for proppant coating dropdown")
	public void verify_default_option_for_proppant_coating_dropdown() {
		ProppantDataPage.verifyProppantCoatingSelectedOption();
	}

	@Then("verify default value for Proppant Perm Displayed at field")
	public void verify_default_value_for_proppant_perm_displayed_at_field() {
		ProppantDataPage.verifyProppantPermDisplayedAtFieldValue("180");
	}

	@Then("verify Proppant Perm Displayed at field is read only")
	public void verify_proppant_perm_displayed_at_field_is_read_only() {
		ProppantDataPage.verifyIsProppantPermDisplayedAtFieldReadable();
	}

	@Then("verify Proppant perm and field is read only")
	public void verify_proppant_perm_and_field_is_read_only() {
		ProppantDataPage.verifyIsProppantPermDisplayedAndFieldReadable();
	}

	@Then("verify default value for Perm Displayed and field")
	public void verify_default_value_for_perm_displayed_and_field() {
		ProppantDataPage.verifyProppantPermDisplayedAndFieldValue("2.0");
	}

	@Then("verify all the table header name must be visible")
	public void verify_all_the_table_header_name_must_be_visible() {
		ProppantDataPage.verifyIsAllTableHeaderColumnPresent();
	}

	@Then("verify that the Source dropdown should display all available options")
	public void verify_all_available_options_must_be_displayed_for_source_dropdown() throws InterruptedException {
		ProppantDataPage.getAllSourceDropdownOptions();
		ProppantDataPage.clickOtherDetails();
	}

	@Then("verify that the proppant type dropdown should display all available options")
	public void verify_all_available_options_must_be_displayed_for_proppant_type_dropdown() throws InterruptedException {
		ProppantDataPage.verifyProppantTypeDropdownOptions();
	}

	@Then("verify that the proppant coating dropdown should display all available options")
	public void verify_all_available_options_must_be_displayed_for_proppant_coating_dropdown() throws InterruptedException {
		ProppantDataPage.verifyProppantCoatingOptions();
	}

	@Then("verify packed porosity field must be read only")
	public void verify_packed_porosity_field_must_be_read_only() {
		ProppantDataPage.verifyPackedPorosityFieldReadable();
	}

	@Then("verify all column are read only except column2")
	public void verify_all_column_are_read_only_except_column2() {
		ProppantDataPage.verifyAllColumnFieldReadableExceptSecondColumn();
	}

	@Then("verify only column2 is editable")
	public void verify_only_column_is_editable() {
		ProppantDataPage.verifySecondColumnFieldEditable();
	}

	@Then("verify that Column1 displays numbers incremented by 2000 starting from 0 to 20000")
	public void verify_that_column_displays_numbers_incremented_by_starting_from_to() {
		ProppantDataPage.verifyColumn1DisplaysNumbersIncrementedBy2000StartingFrom0To20000();
	}

	@Then("verify the default value of all columns in table for first row")
	public void verify_the_default_value_of_all_columns_in_table_for_first_row() {

	}

	@Then("verify Independent Lab Verification checkbox should be unchecked by-default")
	public void verify_independent_lab_verification_checkbox_should_be_unchecked_by_default() {

	}

	@When("the user update the value of vendor input field")
	public void the_user_update_the_value_of_vendor_input_field() {

	}

	@When("the user update the value of System input field")
	public void the_user_update_the_value_of_system_input_field() {

	}

	@When("the user update the value of Mesh Size input field")
	public void the_user_update_the_value_of_mesh_size_input_field() {

	}

	
	@When("the user select option web site from source dropdown")
	public void the_user_select_option_web_site_from_source_dropdown() {

	}

	@When("the user enter the valid value into the cost input field")
	public void the_user_enter_the_valid_value_into_the_cost_input_field() {

	}

	@When("the user enter valid value into the bulk density input field")
	public void the_user_enter_valid_value_into_the_bulk_density_input_field() {

	}

	@Then("verify the recalculated Specific Gravity using formula")
	public void verify_the_recalculated_specific_gravity_using_formula() {

	}

	@When("the user enter the value as zero into the bulk density field")
	public void the_user_enter_the_value_as_zero_into_the_bulk_density_field() {

	}

	@Then("verify Specific Gravity is set to zero")
	public void verify_specific_gravity_is_set_to_zero() {

	}

	@When("the user enter valid value into the specific gravity")
	public void the_user_enter_valid_value_into_the_specific_gravity() {

	}

	@Then("verify recalculated Packed Porosity using formula")
	public void verify_recalculated_packed_porosity_using_formula() {

	}

	@When("the user update the value of Turbulence Coeff a Low Stress input field")
	public void the_user_update_the_value_of_turbulence_coeff_a_low_stress_input_field() {

	}

	@When("the user update the value of Turbulence Coeff b Low Stress input field")
	public void the_user_update_the_value_of_turbulence_coeff_b_low_stress_input_field() {

	}

	@When("the user update the value of Turbulence Coeff a High Stress input field")
	public void the_user_update_the_value_of_turbulence_coeff_a_high_stress_input_field() {

	}

	@When("the user update the value of Turbulence Coeff b High Stress input field")
	public void the_user_update_the_value_of_turbulence_coeff_b_high_stress_input_field() {

	}

	@When("the user update the value of Threshold Stress input field")
	public void the_user_update_the_value_of_threshold_stress_input_field() {

	}

	@When("the user update the value of Diameter input field")
	public void the_user_update_the_value_of_diameter_input_field() {

	}

	@When("the user update the value of Width at2 PSF input field")
	public void the_user_update_the_value_of_width_at2_psf_input_field() {

	}

	@When("the user update the value of Width Correction a input field")
	public void the_user_update_the_value_of_width_correction_a_input_field() {

	}

	@When("the user update the value of Width Correction b input field") 
	public void the_user_update_the_value_of_width_correction_b_input_field() {
	}

	@When("the user update the value of Stress Cycle Exponent input field")
	public void the_user_update_the_value_of_stress_cycle_exponent_input_field() {
	}

	@When("the user select option ceramic from source dropdown")
	public void the_user_select_option_ceramic_from_source_dropdown() {
	}

	@When("the user select option ceramic from Proppant Type dropdown")
	public void the_user_select_option_ceramic_from_proppant_type_dropdown() {
	}

	@When("the user select option ceramic from Proppant Coating dropdown")
	public void the_user_select_option_ceramic_from_proppant_coating_dropdown() {
	}

	@When("the user update the value of proppant permeability field")
	public void the_user_update_the_value_of_proppant_permeability_field() {
	}

	@When("the user update the data into the comment fields")
	public void the_user_update_the_data_into_the_comment_fields() {
	}

	@Then("verify proppant name field value should be persistant")
	public void verify_proppant_name_field_value_should_be_persistant() {
	}

	@Then("verify Description field value should be persistant")
	public void verify_description_field_value_should_be_persistant() {
	}

	@Then("verify the updated data for vendor field")
	public void verify_the_updated_data_for_vendor_field() {
	}

	@Then("verify the updated data for System field")
	public void verify_the_updated_data_for_system_field() {
	}

	@Then("verify the updated data for Mesh Size field")
	public void verify_the_updated_data_for_mesh_size_field() {
	}

	@Then("verify the updated dropdown option for source dropdown")
	public void verify_the_updated_dropdown_option_for_source_dropdown() {
	}

	@Then("verify the updated data for Cost field")
	public void verify_the_updated_data_for_cost_field() {
	}

	@Then("verify the updated data for Bulk Density field")
	public void verify_the_updated_data_for_bulk_density_field() {
	}

	@Then("verify the updated data for Packed Porosity field")
	public void verify_the_updated_data_for_packed_porosity_field() {
	}

	@Then("verify the updated data for pecific Gravity field")
	public void verify_the_updated_data_for_pecific_gravity_field() {
	}

	@Then("verify the updated data for Turbulence Coeff a Low Stress field")
	public void verify_the_updated_data_for_turbulence_coeff_a_low_stress_field() {
	}

	@Then("verify the updated data for Turbulence Coeff b Low Stress field")
	public void verify_the_updated_data_for_turbulence_coeff_b_low_stress_field() {
	}

	@Then("verify the updated data for Turbulence Coeff a High Stress field")
	public void verify_the_updated_data_for_turbulence_coeff_a_high_stress_field() {
	}

	@Then("verify the updated data for Turbulence Coeff b High Stress field")
	public void verify_the_updated_data_for_turbulence_coeff_b_high_stress_field() {
	}

	@Then("verify the updated data for Threshold Stress field")
	public void verify_the_updated_data_for_threshold_stress_field() {
	}

	@Then("verify the updated data for Diameter field")
	public void verify_the_updated_data_for_diameter_field() {
	}

	@Then("verify the updated data for Width at2 PSF field")
	public void verify_the_updated_data_for_width_at2_psf_field() {
	}

	@Then("verify the updated data for Width Correction a field")
	public void verify_the_updated_data_for_width_correction_a_field() {
	}

	@Then("verify the updated data for Width Correction b field")
	public void verify_the_updated_data_for_width_correction_b_field() {
	}

	@Then("verify the updated data for Stress Cycle Exponent field")
	public void verify_the_updated_data_for_stress_cycle_exponent_field() {
	}

	@Then("verify the updated dropdown option for Proppant Type dropdown")
	public void verify_the_updated_dropdown_option_for_proppant_type_dropdown() {
	}

	@Then("verify the updated dropdown option for Proppant Coating dropdown")
	public void verify_the_updated_dropdown_option_for_proppant_coating_dropdown() {
	}

	@Then("verify the updated value of all columns in table for first row except second column")
	public void verify_the_updated_value_of_all_columns_in_table_for_first_row_except_second_column() {
	}

	@Then("verify the updated value of second columns in table for first row")
	public void verify_the_updated_value_of_second_columns_in_table_for_first_row() {
	}

	@Then("verify the updated data for Comments field")
	public void verify_the_updated_data_for_comments_field() {
	}

	@When("the click on the recalculate button")
	public void the_click_on_the_recalculate_button() {
	}

	@Then("verify the Proppant Perm Displayed at field data should be persistant")
	public void verify_the_proppant_perm_displayed_at_field_data_should_be_persistant() {
	}

	@Then("verify the Proppant Perm Displayed and field data should be persistant")
	public void verify_the_proppant_perm_displayed_and_field_data_should_be_persistant() {
	}

	@When("the user checked the Independent Lab Verification checkbox")
	public void the_user_checked_the_independent_lab_verification_checkbox() {
	}










}