package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.TreatmentScheduledTotalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreatmentScheduledTotal extends DriverFactory {
	TreatmentScheduledTotalPage treatmentScheduledTotalPage = new TreatmentScheduledTotalPage(driver);

	@Given("the user clicks on the treatment scheduled module")
	public void the_user_clicks_on_the_treatment_scheduled_module() {
		treatmentScheduledTotalPage.clickElementTreatmentScheduledModule();
	}

	@When("the user clicks on the treatment total tab")
	public void the_user_clicks_on_the_treatment_total_tab() {
		treatmentScheduledTotalPage.clickElementTreatmentTotalTab();
	}

	@Then("verify the presence of Design scheduled radio button")
	public void verify_the_presence_of_design_scheduled_radio_button() {
		treatmentScheduledTotalPage.isDesignScheduledRadioButtonPresent();
	}

	@Then("verify the presence of Actual Data radio button")
	public void verify_the_presence_of_actual_data_radio_button() {
		treatmentScheduledTotalPage.isActualDataRadioButtonPresent();
	}

	@Then("verify the presence of Totals for header")
	public void verify_the_presence_of_totals_for_header() {
		treatmentScheduledTotalPage.isTotalsForHeaderPresent();
	}

	@Then("verify the presence of Totals split by header name")
	public void verify_the_presence_of_totals_split_by_header_name() {
		treatmentScheduledTotalPage.isTotalsSplitByHeaderNamePresent();
	}

	@Then("verify the presence of Materials radio button")
	public void verify_the_presence_of_materials_radio_button() {
		treatmentScheduledTotalPage.isMaterialsRadioButtonPresent();
	}

	@Then("verify the presence of Injection radio button")
	public void verify_the_presence_of_injection_radio_button() {
		treatmentScheduledTotalPage.isInjectionRadioButtonPresent();
	}

	@Then("verify the bydefault behavior of Include storage units check box")
	public void verify_the_bydefault_behavior_of_include_storage_units_check_box() {
		treatmentScheduledTotalPage.isIncludeStorageUnitsCheckBoxDefault();
	}

	@Then("verify the bydefault behavior of Include Wb Vol in Pad check box")
	public void verify_the_bydefault_behavior_of_include_wb_vol_in_pad_check_box() {
		treatmentScheduledTotalPage.isIncludeWbVolInPadCheckBoxDefault();
	}

	@Then("verify the bydefault behavior of Include Cost check box")
	public void verify_the_bydefault_behavior_of_include_cost_check_box() {
		treatmentScheduledTotalPage.isIncludeCostCheckBoxDefault();
	}

	@When("the user clicks on the materials check box")
	public void the_user_clicks_on_the_materials_check_box() {
		treatmentScheduledTotalPage.clickElementMaterialsCheckBox();
	}

	@Then("verify the table header name under proppant and fluid")
	public void verify_the_table_header_name_under_proppant_and_fluid() {
		treatmentScheduledTotalPage.verifyTableHeaderNameUnderProppantAndFluidPresent();
	}

	@When("the user clicks on the injection check box")
	public void the_user_clicks_on_the_injection_check_box() {
		treatmentScheduledTotalPage.clickElementInjectionCheckBox();
	}

	@Then("verify the header names under proppant and fluid table")
	public void verify_the_header_names_under_proppant_and_fluid_table() {
		treatmentScheduledTotalPage.isHeaderNamesUnderProppantAndFluidTablePresent();
	}

	@When("the user clicks on the Include Storage Units check box as active")
	public void the_user_clicks_on_the_include_storage_units_check_box_as_active() {
		treatmentScheduledTotalPage.clickElementIncludeStorageUnitsCheckBoxAsActive();
	}

	@Then("verify the Fluid Tank VOI and Incl Tank Bottoms and prop Sack Wt and N2 Storage VOI and C02 Storage VOI field should be editable")
	public void verify_the_fluid_tank_voi_and_incl_tank_bottoms_and_prop_sack_wt_and_n2_storage_voi_and_c02_storage_voi_field_should_be_editable() {
		treatmentScheduledTotalPage.areStorageUnitsFieldsEditable();
	}

	@When("the user clicks on the Include Storage Units check box as inactive")
	public void the_user_clicks_on_the_include_storage_units_check_box_as_inactive() {
		treatmentScheduledTotalPage.clickElementIncludeStorageUnitsCheckBoxAsInactive();
	}

	@Then("verify the Fluid Tank VOI and Incl Tank Bottoms and prop Sack Wt and N2 Storage VOI and C02 Storage VOI field should be read only")
	public void verify_the_fluid_tank_voi_and_incl_tank_bottoms_and_prop_sack_wt_and_n2_storage_voi_and_c02_storage_voi_field_should_be_read_only() {
		treatmentScheduledTotalPage.areStorageUnitsFieldsReadOnly();
	}

	@When("the user clicks on the materials check box again")
	public void the_user_clicks_on_the_materials_check_box_again() {
		treatmentScheduledTotalPage.clickElementMaterialsCheckBox();
	}

	@And("the user clicks on the Include Storage Units check box as active again")
	public void the_user_clicks_on_the_include_storage_units_check_box_as_active_again() {
		treatmentScheduledTotalPage.clickElementIncludeStorageUnitsCheckBoxAsActive();
	}

	@Then("verify the table header name under proppant and fluid section")
	public void verify_the_table_header_name_under_proppant_and_fluid_section() {
		treatmentScheduledTotalPage.isHeaderNamesUnderProppantAndFluidTablePresent2();
	}

	@And("verify the table header name under additional items section")
	public void verify_the_table_header_name_under_additional_items_section() {
		treatmentScheduledTotalPage.isTableHeaderNameUnderAdditionalItemsSectionPresent();
	}
	
	@And("User verify the table header name under additional items section")
	public void User_verify_the_table_header_name_under_additional_items_section() {
		treatmentScheduledTotalPage.isTableHeaderNameUnderAdditionalItemsSectionPresent2();
	}

	@When("the user clicks on the Include Storage Units check box as inactive again")
	public void the_user_clicks_on_the_include_storage_units_check_box_as_inactive_again() {
		treatmentScheduledTotalPage.clickElementIncludeStorageUnitsCheckBoxAsInactive();
	}

	@Then("verify the table header name under proppant and fluid section again")
	public void verify_the_table_header_name_under_proppant_and_fluid_section_again() {
		treatmentScheduledTotalPage.isTableHeaderNameUnderProppantAndFluidSectionPresent();
	}

	@And("verify the table header name under additional items section again")
	public void verify_the_table_header_name_under_additional_items_section_again() {
		treatmentScheduledTotalPage.isTableHeaderNameUnderAdditionalItemsSectionPresent();
	}

	@When("the user clicks on the Include Cost to make it as active")
	public void the_user_clicks_on_the_include_cost_to_make_it_as_active() {
		treatmentScheduledTotalPage.clickElementIncludeCostCheckBoxAsActive();
	}

	@Then("verify the Material Cost Subtotal field should be visible")
	public void verify_the_material_cost_subtotal_field_should_be_visible() {
		treatmentScheduledTotalPage.isMaterialCostSubtotalFieldVisible();
	}

	@When("the user clicks on the Include Cost to make it as inactive")
	public void the_user_clicks_on_the_include_cost_to_make_it_as_inactive() {
		treatmentScheduledTotalPage.clickElementIncludeCostCheckBoxAsInactive();
	}

	@Then("verify the Material Cost Subtotal field should not be visible")
	public void verify_the_material_cost_subtotal_field_should_not_be_visible() {
		treatmentScheduledTotalPage.isMaterialCostSubtotalFieldInVisible();
	}

	@When("the user clicks on the Include Cost to make it as active again")
	public void the_user_clicks_on_the_include_cost_to_make_it_as_active_again() {
		treatmentScheduledTotalPage.clickElementIncludeCostCheckBoxAsActive();
	}

	@Then("verify that unit Cost S and Discount and Cost S should be visible under proppant and fluid and additional items section")
	public void verify_that_unit_cost_s_and_discount_and_cost_s_should_be_visible_under_proppant_and_fluid_and_additional_items_section() {
		treatmentScheduledTotalPage.areCostFieldsVisibleUnderProppantAndFluidAndAdditionalItemsSection();
	}

	@And("verify the Total cost field should be visible")
	public void verify_the_total_cost_field_should_be_visible() {
		treatmentScheduledTotalPage.isTotalCostFieldVisible();
	}

	@When("the user clicks on the Include Cost to make it as inactive again")
	public void the_user_clicks_on_the_include_cost_to_make_it_as_inactive_again() {
		treatmentScheduledTotalPage.clickElementIncludeCostCheckBoxAsInactive();
	}

	@Then("verify that unit Cost S and Discount and Cost S should not be visible under proppant and fluid and additional items section")
	public void verify_that_unit_cost_s_and_discount_and_cost_s_should_not_be_visible_under_proppant_and_fluid_and_additional_items_section() {
		treatmentScheduledTotalPage.areCostFieldsVisibleUnderProppantAndFluidAndAdditionalItemsSectionInVisible();
	}

	@Then("verify the checkboxes and radio buttons and dropdowns will persist after saving")
	public void verify_the_checkboxes_and_radio_buttons_and_dropdowns_will_persist_after_saving() {
		treatmentScheduledTotalPage.areCheckboxesRadioButtonsAndDropdownsPersistAfterSaving();
	}
}