package com.FracProPlus.stepdefinitions;

import org.testng.Assert;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.TreatmentScheduleActualPage;
import com.FracProPlus.pages.TreatmentSchedulePage;
import com.FracProPlus.utils.CommonUtils;
import com.FracProPlus.utils.ReadData;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreatmentSchedule extends DriverFactory {
	TreatmentSchedulePage treatmentSchedulePage = new TreatmentSchedulePage(driver);
	TreatmentScheduleActualPage treatmentScheduleActualPage = new TreatmentScheduleActualPage(driver);

	@Given("the user clicks on the treatment schedule sidebar option")
	public void the_user_clicks_on_the_treatment_schedule_sidebar_option() {
		treatmentSchedulePage.clickElementOnTreatmentScheduleSidebarOption();
	}

	@Given("the user click on the design treatment schedule tab")
	public void the_user_click_on_the_design_treatment_schedule_tab() {
		treatmentSchedulePage.clickElementOnDesigntreatmentScheduleTab();
	}

	@Then("Verify design treatment schedule page title")
	public void verify_design_treatment_schedule_page_title() {
		treatmentSchedulePage.verifyPageTitle("Live+");
	}

	@Then("the user click on the edit schedule button")
	public void the_user_click_on_the_edit_schedule_button() {
		treatmentSchedulePage.clickElementOnEditScheduleButton();
	}

	@Then("verify Stop Schedule editing button should be displayed")
	public void verify_stop_schedule_editing_button_should_be_displayed() {
		CommonUtils.scrollToBottom(driver);
		treatmentSchedulePage.verifyIsStopScheduleEditingButtonDisplayed();
	}

	@Then("Verify treatment type should be no foam")
	public void verify_treatment_type_should_be_no_foam() {
		treatmentSchedulePage.verifyDefaultDropdownTreatmentType();
	}

	@Then("verify prop mode should be staged")
	public void verify_prop_mode_should_be_staged() {
		treatmentSchedulePage.verifyDefaultDropdownPropMode();
	}

	@Then("verify the treatment schedule header name when treatment type is no foam and prop mode is staged")
	public void verify_the_treatment_schedule_header_name_when_treatment_type_is_no_foam_and_prop_mode_is_staged() {
		treatmentSchedulePage.verifyTableHeaderOnDesignWhenTreatmenttypeNofoamPropmodeStaged();
	}

	@Then("Verify step type dropdown bydefault option for first row")
	public void Verify_step_type_dropdown_bydefault_option_for_first_row() {
		treatmentSchedulePage.verifystepTypeSelectedValue("---");
	}

	@Then("Verify flow rate field value must be zero for default row")
	public void verify_flow_rate_field_value_must_be_zero_for_default_row() {
		treatmentSchedulePage.verifyflowRateEnteredValue("0.00");
	}

	@Then("Verify prop conc field value must be zero for default row")
	public void verify_prop_conc_field_value_must_be_zero_for_default_row() {
		treatmentSchedulePage.verifyPropConcEnteredValue("0.00");
	}

	@Then("Verify Clean vol field value must be zero for default row")
	public void verify_clean_vol_field_value_must_be_zero_for_default_row() {
		treatmentSchedulePage.verifyCleanVolEnteredValue("0");
	}

	@Then("Verify step length field value must be zero for default row")
	public void verify_step_length_field_value_must_be_zero_for_default_row() {
		treatmentSchedulePage.verifyStepLengthEnteredValue("0.00");
	}

	@Then("verify Proppant type field value must be blank and read only for default row")
	public void verify_proppant_type_field_value_must_be_blank_and_read_only_for_default_row() {
		treatmentSchedulePage.verifyProppantTypeSelectedOption("");
		treatmentSchedulePage.verifyProppantTypeFieldIsReadOnlyIfBlank();
	}

	@When("the user paste the data copied data from the excel as column wise")
	public void the_user_paste_the_data_copied_data_from_the_excel_as_column_wise() throws Exception {
		treatmentSchedulePage.clickElementOnActualtreatmentScheduleTab();

	}

	@When("the user click and select ramped option from the Prop mode dropdown")
	public void the_user_click_and_select_ramped_option_from_the_prop_mode_dropdown() {
		treatmentSchedulePage.selectRampedOptionFromPropModeDropdown();
	}

	@Then("verify the treatment schedule header name when treatment type is no foam and prop mode is ramped")
	public void verify_the_treatment_schedule_header_name_when_treatment_type_is_no_foam_and_prop_mode_is_ramped() {
		treatmentSchedulePage.verifyTableHeaderOnDesignWhenTreatmenttypeNofoamPropmodeRamped();
	}

	@When("the user click and select N2 option from treatment type info")
	public void the_user_click_and_select_n2_option_from_treatment_type_info() {
		treatmentSchedulePage.selectOptionFromTreatmentTypeDropdownN2();
	}

	@Then("verify the treatment schedule header name when treatment type is N2 and prop mode is ramped")
	public void verify_the_treatment_schedule_header_name_when_treatment_type_is_n2_and_prop_mode_is_ramped() {
		treatmentSchedulePage.verifyTableHeaderOnDesignWhenTreatmenttypeN2PropmodeRampedN2();
	}

	@Then("verify scheduled based on conditions options should be displayed")
	public void verify_scheduled_based_on_conditions_options_should_be_displayed() {
		treatmentSchedulePage.verifyIsScheduledBasedOnConditionsHeaderDisplayed();
	}

	@Then("verify estimate treating conditions options should be displayed")
	public void verify_estimate_treating_conditions_options_should_be_displayed() {
		treatmentSchedulePage.verifyIsEstimateTreatingConditionsHeaderDisplayed();
	}

	@Then("verify CO2 Properties options should be displayed")
	public void verify_co2_properties_options_should_be_displayed() {
		treatmentSchedulePage.verifyIsCo2PropertiesHeaderDisplayed();
	}

	@Then("verify Quality option should be displayed and default option should be conventional quality")
	public void verify_quality_option_should_be_displayed_and_default_option_should_be_conventional_quality() {
		treatmentSchedulePage.verifyIsQualityOptionHeaderDisplayedAndDefaultDropdownOption();
	}

	@Then("verify default value must be {double} for estimated foam pressure")
	public void verify_default_value_must_be_for_estimated_foam_pressure(Double double1) {
		treatmentSchedulePage.verifyEstimatedFoamPressureInputValue("5000");
	}

	@Then("verify default value must be {int} for estimated foam temperature")
	public void verify_default_value_must_be_for_estimated_foam_temperature(Integer int1) {
		treatmentSchedulePage.verifyEstimatedFoamTemperatureInputValue("180");
	}

	@Then("verify metering pressure default field value must be {int}")
	public void verify_metering_pressure_default_field_value_must_be(Integer int1) {
		treatmentSchedulePage.verifyMeteringPressureInputValue("910");
	}

	@Then("verify metering temperature default field value must be {int}")
	public void verify_metering_temperature_default_field_value_must_be(Integer int1) {
		treatmentSchedulePage.verifyMeteringTemperatureInputValue("32");
	}

	@Then("verify density at flow meter default field value must be {double}")
	public void verify_density_at_flow_meter_default_field_value_must_be(Double expectedDensity) {
	    treatmentSchedulePage.verifyDensityAtFlowMeterValue(expectedDensity);
	}

	@Then("verify Pulse Duration field should be read only and pulse proppant should be unchecked by default")
	public void verify_pulse_duration_field_should_be_read_only_and_pulse_proppant_should_be_unchecked_by_default() {
		treatmentSchedulePage.verifyIsPulsedProppantCheckboxUncheckedBydefaultAndPulseDurationInputFieldReadableOnly();
	}

	@When("the user checked the Pulsed Proppant checkbox")
	public void the_user_checked_the_pulsed_proppant_checkbox() {
		treatmentSchedulePage.checkedPulsedProppantcheckbox();
	}

	@Then("verify Pulse Duration field should be editable")
	public void verify_pulse_duration_field_should_be_editable() {
		treatmentSchedulePage.verifyIsPulseDurationInputFieldEditable();
	}

	@When("the user click and select staged option from the Prop mode dropdown")
	public void the_user_click_and_select_staged_option_from_the_prop_mode_dropdown() {
		treatmentSchedulePage.selectStagedOptionFromPropModeDropdown();
	}

	@Then("verify the treatment schedule header name when treatment type is N2 and prop mode is staged")
	public void verify_the_treatment_schedule_header_name_when_treatment_type_is_n2_and_prop_mode_is_staged() {
		treatmentSchedulePage.verifyTableHeaderOnDesignWhenTreatmenttypeN2PropmodeStaged();
	}

	@When("the user click and select CO2 option from treatment type info")
	public void the_user_click_and_select_co2_option_from_treatment_type_info() {
		treatmentSchedulePage.selectOptionFromTreatmentTypeDropdownCo2();
	}

	@Then("verify the treatment schedule header name when treatment type is CO2 and prop mode is staged")
	public void verify_the_treatment_schedule_header_name_when_treatment_type_is_co2_and_prop_mode_is_staged() {
		treatmentSchedulePage.verifyTableHeaderOnDesignWhenTreatmenttypeCO2PropmodeStaged();
	}

	@Then("verify the treatment schedule header name when treatment type is CO2 and prop mode is ramped")
	public void verify_the_treatment_schedule_header_name_when_treatment_type_is_co2_and_prop_mode_is_ramped() {
		treatmentSchedulePage.verifyTableHeaderOnDesignWhenTreatmenttypeCO2PropmodeRamped();
	}

	@When("the user click and select N2 & CO2 option from treatment type info")
	public void the_user_click_and_select_n2_co2_option_from_treatment_type_info() {
		treatmentSchedulePage.selectOptionFromTreatmentTypeDropdownN2Co2();
	}

	@Then("verify the treatment schedule header name when treatment type is N2 & CO2 and prop mode is ramped")
	public void verify_the_treatment_schedule_header_name_when_treatment_type_is_n2_co2_and_prop_mode_is_ramped() {
		treatmentSchedulePage.verifyTableHeaderOnDesignWhenTreatmenttypeN2AndCO2PropmodeRamped();
	}

	@Then("verify the treatment schedule header name when treatment type is N2 & CO2 and prop mode is staged")
	public void verify_the_treatment_schedule_header_name_when_treatment_type_is_n2_co2_and_prop_mode_is_staged() {
		treatmentSchedulePage.verifyTableHeaderOnDesignWhenTreatmenttypeN2AndCO2PropmodeStaged();
	}

	@When("the user click and select option from treatment type info is no foam")
	public void the_user_click_and_select_option_from_treatment_type_info_is_no_foam() {
		treatmentSchedulePage.selectOptionFromTreatmentTypeDropdownNoFoam();
	}

	@When("the user click on the Include step Aliases checkbox")
	public void the_user_click_on_the_include_step_aliases_checkbox() {
		treatmentSchedulePage.SelectIncludeStepAliasesCheckbox();
	}

	@Then("Verify step alias column must be displayed in the header")
	public void verify_step_alias_column_must_be_displayed_in_the_header() {
		treatmentSchedulePage.verifyIsStepAliasHeaderDisplayed();
	}

	@When("the user click and select an option from step type dropdown for first row")
	public void the_user_click_and_select_an_option_from_step_type_dropdown_for_first_row() {
		treatmentSchedulePage.SelectOptionInStepTypeFieldForFirstRow();
	}

	@When("the user enter the valid value into step alias input field for first row")
	public void the_user_enter_the_valid_value_into_step_alias_input_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoStepAliasFieldForFirstRow();
	}

	@Then("verify the first fluid type in the drop down is selected in the Fluid type for first row")
	public void verify_the_first_fluid_type_in_the_drop_down_is_selected_in_the_fluid_type_for_first_row() {
		treatmentSchedulePage.verifyFluidTypeSelectedOptionForFirstRow();
	}

	@When("the user enter valid value into flow rate column for first row")
	public void the_user_enter_valid_value_into_flow_rate_column_for_first_row() {
		treatmentSchedulePage.enterDataIntoFlowRateFieldForFirstRow();
	}
	
	@When("the user enter valid value into flow rate column for first row for save and next")
	public void the_user_enter_valid_value_into_flow_rate_column_for_first_rowsn() {
		treatmentSchedulePage.enterDataIntoFlowRateFieldForFirstRowsaveandnext();
	}

	@When("the user enter valid value into prop conc column for first row")
	public void the_user_enter_valid_value_into_prop_conc_column_for_first_row() {
		treatmentSchedulePage.enterDataIntoPropConcFieldForFirstRow();
	}

	@Then("verify the first option from the Proppant Type dropdown is selected by default")
	public void verify_the_first_option_from_the_proppant_type_dropdown_is_selected_by_default() {
		treatmentSchedulePage.verifyProppantTypeSelectedOptionForFirstRow();
	}

	@When("the user enter valid value into clean vol column for first row")
	public void the_user_enter_valid_value_into_clean_vol_column_for_first_row() {
		treatmentSchedulePage.enterDataIntoCleanVolFieldForFirstRow();
	}

	@When("the user click on the volume from time option")
	public void the_user_click_on_the_option() {
		treatmentSchedulePage.SelectVolumeFromTimeCalculateOption();
	}

	@Then("step length field must be editable and clean volume must be read only")
	public void step_length_field_must_be_editable_and_clean_volume_must_be_read_only() {
//		treatmentSchedulePage.verifyCleanVolFieldIsReadOnlyWhenVolumeFromTimeIsSelected();
		treatmentSchedulePage.verifyStepLengthFieldIsEditableWhenVolumeFromTimeIsSelected();
	}

	@When("the user enter valid value into step length column for first row")
	public void the_user_enter_valid_value_into_step_length_column_for_first_row() {
		treatmentSchedulePage.enterDataIntoStepLengthFieldForFirstRow();
	}

	@Then("verify the calculated value of step length for first row")
	public void verify_the_calculated_value_of_step_length_for_first_row() {
		treatmentSchedulePage.verifyCalculatedStepLengthValueForFirstRow("0.90");
	}

	@Then("verify the calculated value of step length when flow rate is updated for first row")
	public void verify_the_calculated_value_of_step_length_when_flow_rate_is_updated_for_first_row() {
		treatmentSchedulePage.verifyCalculatedStepLengthValueForFirstRow("4.23");
	}

	@Then("verify the calculated value of clean vol for first row")
	public void verify_the_calculated_value_of_clean_vol_for_first_row() {
		treatmentSchedulePage.verifyCalculatedCleanVolValueForFirstRow("524");
	}

	@Then("verify the calculated value of clean vol when flow rate is updated for first row")
	public void verify_the_calculated_value_of_clean_vol_when_flow_rate_is_updated_for_first_row() {
		treatmentSchedulePage.verifyCalculatedCleanVolValueForFirstRow2("524");
	}

	@Then("verify the cumul time field value in min:sec for first row")
	public void verify_the_cumul_time_field_value_in_min_sec_for_first_row() {
		treatmentSchedulePage.verifyCalculatedCumulTimeValueInMinSecForFirstRow("4:14");
	}

	@When("the user update the value of flow rate input field for first row")
	public void the_user_update_the_value_of_flow_rate_input_field_for_first_row() {
		treatmentSchedulePage.enterUpdatedDataIntoFlowRateFieldForFirstRow();
	}

	@Then("verify the updated calculation step length field value for first row")
	public void verify_the_updated_calculation_step_length_field_value_for_first_row() {

	}

	@When("the user update the prop conc field value for first row")
	public void the_user_update_the_prop_conc_field_value_for_first_row() {
		treatmentSchedulePage.enterUpdatedDataIntoPropConcFieldForFirstRow();
	}

	@Then("verify updated step length field value after updating the prop conc input field for first row")
	public void verify_updated_step_length_field_value_after_updating_the_prop_conc_input_field_for_first_row() {
		treatmentSchedulePage.verifyCalculatedStepLengthValueForFirstRow("4.23");
	}

	@Then("verify updated clean vol field value after updating the prop conc input field for first row")
	public void verify_updated_clean_vol_field_value_after_updating_the_prop_conc_input_field_for_first_row() {
		treatmentSchedulePage.verifyCalculatedCleanVolValueForFirstRow3("524");
	}

	@When("the user update the proppant type dropdown option")
	public void the_user_update_the_proppant_type_dropdown_option() {
		treatmentSchedulePage.SelectOptionInProppantTypeFieldForFirstRow();
	}

	@Then("verify updated clean vol field value after updating the proppant type input field for first row")
	public void verify_updated_clean_vol_field_value_after_updating_the_proppant_type_input_field_for_first_row() {
		treatmentSchedulePage.verifyCalculatedCleanVolValueForFirstRow4("537");
	}

	@Then("verify Flow Rate {int} Matching Flow Rate Value for first row")
	public void verify_flow_rate_matching_flow_rate_value_for_first_row(Integer int1) throws InterruptedException {
		Thread.sleep(2000);
		treatmentSchedulePage.verifyflowRate1Value(ReadData.readdata("FlowRateUpdatedValueDesignFirstRow"));
	}

	@Then("verify Prop Conc {int} Matching Prop Conc {int} Value for first row")
	public void verify_prop_conc_matching_prop_conc_value_for_first_row(Integer int1, Integer int2) {
		treatmentSchedulePage.verifyPropConc1Value("4.21");
	}

	@When("the user checked the 'time from volume'option")
	public void the_user_checked_the_time_from_volume_option() {
		treatmentSchedulePage.SelectTimeFromVolumeCalculateOption();
	}

	@Then("clean volume field must be read only and step length must be enabled")
	public void clean_volume_field_must_be_read_only_and_step_length_must_be_enabled() {
		treatmentSchedulePage.verifyStepLengthFieldIsReadOnlyWhenVolumeFromTimeIsSelected();
		treatmentSchedulePage.verifyCleanVolFieldIsEditableWhenVolumeFromTimeIsSelected();
	}

	@When("the user enter the same value into Flow Rate {int} field as entered in Flow Rate {int}")
	public void the_user_enter_the_same_value_into_flow_rate_field_as_entered_in_flow_rate(Integer int1, Integer int2) {
		treatmentSchedulePage.enterDataIntoFlowRate2FieldForFirstRow();
	}

	@Then("verify updated step length field value when flow rate {int} and flow rate {int} are equal for first row")
	public void verify_updated_step_length_field_value_when_flow_rate_and_flow_rate_are_equal_for_first_row(
			Integer int1, Integer int2) {
		treatmentSchedulePage.verifyCalculatedStepLengthValueIfFlowRate2PresentForFirstRow("4.23");
	}

	@When("the user enter the different value into Flow Rate {int} field as entered in Flow Rate {int}")
	public void the_user_enter_the_different_value_into_flow_rate_field_as_entered_in_flow_rate(Integer int1,
			Integer int2) {
		treatmentSchedulePage.enterDifferentValueIntoFlowRate2FieldForFirstRow();
	}

	@Then("verify updated step length field value when Flow Rate {int} and Flow Rate {int} are different for first row")
	public void verify_updated_step_length_field_value_when_flow_rate_and_flow_rate_are_different_for_first_row(
			Integer int1, Integer int2) {
		treatmentSchedulePage.verifyCalculatedStepLengthValueIfFlowRate2PresentForFirstRow("4.23");
	}

	@When("the user enter valid value into the Prop Conc {int} input field")
	public void the_user_enter_valid_value_into_the_prop_conc_input_field(Integer int1) {
		treatmentSchedulePage.enterValueIntoPropConc2FieldForFirstRow();
	}

	@Then("verify updated step length field value when Prop Conc {int} input field is updated")
	public void verify_updated_step_length_field_value_when_prop_conc_input_field_is_updated(Integer int1) throws InterruptedException {
		Thread.sleep(2000);
		treatmentSchedulePage.verifyCalculatedStepLengthValueIfFlowRate2PresentForFirstRow("3.99");
	}
	
	@Then("verify updated step length field value when Prop Conc {int} input field is updated1")
	public void verify_updated_step_length_field_value_when_prop_conc_input_field_is_updated1(Integer int1) {
		treatmentSchedulePage.verifyCalculatedStepLengthValueIfFlowRate2PresentForFirstRow("3.99");
	}

	@Then("verify calculated clean Vol when calculate is selected as volume from time")
	public void verify_calculated_clean_vol_when_calculate_is_selected_as_volume_from_time() throws InterruptedException {
		Thread.sleep(1000);
		treatmentSchedulePage.verifyCalculatedCleanVolValueWhenForFirstRow("538");
	}

	@When("the user update the value into the clean vol input field")
	public void the_user_update_the_value_into_the_clean_vol_input_field() {

	}

	@Then("verify updated step length field value when clean vol input field is updated")
	public void verify_updated_step_length_field_value_when_clean_vol_input_field_is_updated() {

	}

	@When("the user checked the volume from time option")
	public void the_user_checked_the_volume_from_time_option() {

	}

	@Then("verify clean vol field should be read only and also verify calculation")
	public void verify_clean_vol_field_should_be_read_only_and_also_verify_calculation() {

	}


	@Then("verify updated Clean Vol field value when Flow Rate {int} input field is updated")
	public void verify_updated_clean_vol_field_value_when_flow_rate_input_field_is_updated(Integer int1) {
		treatmentSchedulePage.verifyCalculatedCleanVolValueWhenForFirstRow("538");
	}

	@When("the user update the value into the Prop Conc {int} input field")
	public void the_user_update_the_value_into_the_prop_conc_input_field(Integer int1) {
		treatmentSchedulePage.enterUpdatedDataIntoPropConc1FieldForFirstRow();
	}

	@Then("verify updated Clean Vol field value when Prop Conc {int} input field is updated")
	public void verify_updated_clean_vol_field_value_when_prop_conc_input_field_is_updated(Integer int1) throws InterruptedException {
		Thread.sleep(2000);
		treatmentSchedulePage.verifyCalculatedCleanVolValueWhenForFirstRow("538");
	}

	@When("the user update the value into the Prop Conc second input field")
	public void the_user_update_the_value_into_the_prop_conc_second_input_field() {
		treatmentSchedulePage.enterUpdatedDataIntoPropConc2FieldForFirstRow();
	}

	@Then("verify updated Clean Vol field value when Prop Conc second input field is updated")
	public void verify_updated_clean_vol_field_value_when_prop_conc_second_input_field_is_updated() {
		treatmentSchedulePage.verifyCalculatedCleanVolValueWhenForFirstRow("538");
	}

	@When("the user update the value into the Step Length input field")
	public void the_user_update_the_value_into_the_step_length_input_field() {

	}

	@Then("verify updated Clean Vol field value when Step Length input field is updated")
	public void verify_updated_clean_vol_field_value_when_step_length_input_field_is_updated() {

	}

	@When("the user update the proppant option as {int}")
	public void the_user_update_the_proppant_option_as(Integer int1) {

	}

	@Then("verify updated Clean Vol field value when proppant option is updated")
	public void verify_updated_clean_vol_field_value_when_proppant_option_is_updated() {

	}

	@Then("verify Prop Conc value must match the Prop Conc {int} value")
	public void verify_prop_conc_value_must_match_the_prop_conc_value(Integer int1) {
		treatmentSchedulePage.verifyPropConcEnteredValueForFirstRow(ReadData.readdata("PropConcValueDesignFirstRow"));
	}

	@Then("verify Flow Rate {int} and Flow Rate {int} field value must be same")
	public void verify_flow_rate_and_flow_rate_field_value_must_be_same(Integer int1, Integer int2) {
		treatmentSchedulePage.verifyflowRate1Value(ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow"));
		treatmentSchedulePage.verifyflowRate2Value(ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow"));
	}

	@Then("verify Prop Conc {int} and Prop Conc {int} field value must be same")
	public void verify_prop_conc_and_prop_conc_field_value_must_be_same(Integer int1, Integer int2) throws InterruptedException {
		Thread.sleep(2000);
		treatmentSchedulePage.verifyPropConc1Value(ReadData.readdata("PropConcValueDesignFirstRow"));
		treatmentSchedulePage.verifyPropConc2Value(ReadData.readdata("PropConcValueDesignFirstRow"));
	}

	@When("the user click and select {string} option from step type dropdown")
	public void the_user_click_and_select_option_from_step_type_dropdown(String string) {
		treatmentSchedulePage.SelectOptionInStepTypeFieldForSecondRowCirc();
	}
	
	@Then("{string} field is set to the previous row's fluid type for second row")
	public void field_is_set_to_the_previous_row_s_fluid_type_for_second_row(String string) {
		treatmentSchedulePage.verifyFluidTypeSelectedOptionForSecondRow();
	}

	@When("the user enter valid value into Flow Rate field for second row")
	public void the_user_enter_valid_value_into_flow_rate_field_for_second_row() {
		treatmentSchedulePage.enterDataIntoFlowRateFieldForSecondRow();
	}


	@Then("Verify Clean Volume Calculation When Treat Type is Zero, Clean Vol is Zero, and Calculation Method is Time from Volume")
	public void verify_clean_volume_calculation_when_treat_type_is_zero_clean_vol_is_zero_and_calculation_method_is_time_from_volume() {
		treatmentSchedulePage.verifyCalculatedCleanVolValueForSecondRow("0");
	}
	
	@And("the user click and select second option from the fluid type dropdown")
	public void the_user_click_and_select_second_option_from_the_fluid_type_dropdown() {
		treatmentSchedulePage.SelectOptionInFluidTrypeFieldForSecondRow();
	}

	@And("the user click and select {string} option from step type dropdown for second row")
	public void userSelectsOptionFromDropdown(String option) {
		treatmentSchedulePage.SelectOptionInStepTypeFieldForSecondRowShutIn();
	}

	@And("the user clicks and select {string} option from step type dropdown for second row")
	public void userSelectsAnOptionFromDropdown(String option) {
		treatmentSchedulePage.SelectOptionInStepTypeFieldForSecondRowShutInFlow();
	}

	@And("the user click and select Flowback option from step type dropdown for second row")
	public void userSelectsOptionFlowbackFromDropdown() {
		treatmentSchedulePage.SelectOptionInStepTypeFieldForSecondRowFlowBack();
	}

	@Then("verify Flow Rate and Clean Vol Reset to 0 for second row")
	public void verifyFlowRateAndCleanVolReset() {
		treatmentSchedulePage.verifyFlowRateAndCleanVolResetToZeroforSecondRow();
	}

	@And("verify {string} field is set to {string} and read-only for second row")
	public void verifyFluidTypeField(String field, String expectedValue) {
		treatmentSchedulePage.verifyFluidTypeSelectedToShutInAndOnlyReadForSecondRow();
	}

	@When("the user enter valid value into the step length field for second row")
	public void the_user_enter_valid_value_into_the_step_length_field_for_second_row() {
		treatmentSchedulePage.enterDataIntoStepLengthFieldForSecondRow();
	}

	@When("the user reset clean volume field as zero for second row")
	public void the_user_reset_clean_volume_field_as_zero_for_second_row() {
		treatmentSchedulePage.ClearandSetZeroToCleanVolFieldForSecondRow();
	}

	@Then("verify the Step Length must be editable for second row but read only for first row")
	public void verifyStepLengthEditability() {
		treatmentSchedulePage.verifyStepLengthFieldIsEditableWhenVolumeFromTimeIsSelectedForSecondRow();
		treatmentSchedulePage.verifyStepLengthFieldIsReadOnlyWhenVolumeFromTimeIsSelected();
	}

	@When("the user enters the Flow Rate greater than zero")
	public void the_user_enters_the_Flow_Rate_greater_than_zero() {
		treatmentSchedulePage.enterDataIntoFlowRateFieldForSecondRow();
	}

	@When("verify Fluid Type field is set to Flowback and read-only for second row")
	public void verify_Fluid_Type_field_is_set_to_Flowback_and_read_only_for_second_row() {
		treatmentSchedulePage.verifyFluidTypeSelectedToFlowbackAndOnlyReadForSecondRow();
	}

	@When("the user change the step type dropdown option from Flowback to Prop slug for second row")
	public void the_user_change_the_step_type_dropdown_option_from_Flowback_to_Prop_slug_for_second_row() {
		treatmentSchedulePage.SelectOptionInStepTypeFieldForSecondRowPropSlug();
	}

	@Then("verify the value of Flow Rate is set to one")
	public void verify_the_value_of_Flow_Rate_is_set_to_one() {
		treatmentSchedulePage.verifyFlowRateResetToOneforSecondRow();
	}

	@And("the user change the step type dropdown option from Shut-in to Main frac acid for second row")
	public void the_user_change_the_step_type_dropdown_option_from_Shut_in_to_Main_frac_acid_for_second_row() {
		treatmentSchedulePage.SelectOptionInStepTypeFieldForSecondRowMainFrac();
	}

	@And("the user change the step type dropdown option from Shutin wflowpulses to Steprate test for second row")
	public void the_user_change_the_step_type_dropdown_option_from_Shut_inwflowpulses_to_Steprate_test_for_second_row() {
		treatmentSchedulePage.SelectOptionInStepTypeFieldForSecondRowSepTest();
	}

	@When("the user click and checked the {string} option into select Custom Columns and click again")
	public void the_user_click_checked_the_option_into_select_custom_columns_and_click_again(String string) {
		treatmentSchedulePage.SelectOptionInSelectCustomColumnsForSecondRow();
	}

	@When("the user click and checked the unselect option into select Custom Columns and click again")
	public void the_user_click_checked_the_unselect_option_into_select_custom_columns_and_click_again() {
		treatmentSchedulePage.UnSelectAllOptionInSelectCustomColumns();
	}

	@When("the user update the value into the Estimated Foam Pressure input field")
	public void the_user_update_the_value_into_the_estimated_foam_pressure_input_field() {
		treatmentSchedulePage.enterDataIntoEstimatedFoamPressureInputField();
	}

	@When("the user update the value into the Estimated Foam Temperature input field")
	public void the_user_update_the_value_into_the_estimated_foam_temperature_input_field() {
		treatmentSchedulePage.enterDataIntoEstimatedFoamTemperatureInputField();
	}

	@When("the user mark the {string} option from Schedule Based on Conditions")
	public void the_user_mark_the_option_from_schedule_based_on_conditions(String string) {
		treatmentSchedulePage.clickElementOnInFractureOption();
	}

	@When("the user update the value into the Metering Pressure input field")
	public void the_user_update_the_value_into_the_metering_pressure_input_field() {
		treatmentSchedulePage.enterDataIntoMeteringPressureInputField();
	}

	@When("the user update the value into the Metering Temperature input field")
	public void the_user_update_the_value_into_the_metering_temperature_input_field() {
		treatmentSchedulePage.enterDataIntoMeteringTemperatureInputField();
	}

	@When("the user update the value into the Pulse Duration input field")
	public void the_user_update_the_value_into_the_pulse_duration_input_field() {
		treatmentSchedulePage.enterDataIntoPulseDurationInputField();
	}

	@When("the user select the Constant Internal Phase option from Quality option dropdown")
	public void the_user_select_the_Constant_Internal_Phase_option_from_Quality_option_dropdown() {
		treatmentSchedulePage.selectQualityOptionInDropdownQuality();
	}

	@When("the user click on the Save button")
	public void the_user_click_on_the_save_button() {
		treatmentSchedulePage.clickElementSaveButton();
	}

	@When("the user click on the Stop Schedule Editing button")
	public void the_user_click_on_the_Stop_Schedule_Editing_button() {
		treatmentSchedulePage.clickElementOnStopScheduleEditingButton();
	}

	@When("the user click on the Actual Treatment Schedule tab")
	public void the_user_click_on_the_actual_treatment_schedule_tab() {

	}

	@Then("Verify updated value of Estimated Foam Pressure input field")
	public void verify_updated_value_of_estimated_foam_pressure_input_field() {
		treatmentSchedulePage.verifyEstimatedFoamPressureInputValue(ReadData.readdata("EstimatedFoamPressure"));
	}

	@Then("Verify updated value of Estimated Foam Temperature input field")
	public void verify_updated_value_of_estimated_foam_temperature_input_field() {
		treatmentSchedulePage.verifyEstimatedFoamTemperatureInputValue(ReadData.readdata("EstimatedFoamTemperature"));
	}

	@Then("verify Constant Internal Phase option must be checked")
	public void verify_Constant_Internal_Phase_option_must_be_checked() {
		treatmentSchedulePage.verifySelecetedQualityOptionDropdownCIP();
	}

	@Then("Verify updated value of Metering Pressure input field")
	public void verify_updated_value_of_metering_pressure_input_field() {
		treatmentSchedulePage.verifyMeteringPressureInputValue(ReadData.readdata("MeteringPressure"));
	}

	@Then("Verify updated value of Metering Temperature input field")
	public void verify_updated_value_of_metering_temperature_input_field() {
		treatmentSchedulePage.verifyMeteringTemperatureInputValue(ReadData.readdata("MeteringTemperature"));
	}

	@Then("Verify updated value of Pulse Duration input field")
	public void verify_updated_value_of_pulse_duration_input_field() {
		treatmentSchedulePage.verifyPulseDurationInputFieldValue(ReadData.readdata("pulseDuration"));
	}
	
	@Then("Verify updated value of Pulse Duration input field in actual tab")
	public void verify_updated_value_of_pulse_duration_input_field_in_actual_tab() {
		treatmentSchedulePage.verifyPulseDurationInputFieldValue("10");
	}

	@Then("verify step Alias column must be displayed")
	public void verify_step_alias_column_must_be_displayed() {

	}

	@Then("verify N2 & CO2 option must be selected")
	public void verify_N2_CO2_option_must_be_selected() {
		treatmentSchedulePage.verifySelecetedTreatmentTypeOptionDropdownTreatmentType();
	}

	@Then("verify ramped option must be selected")
	public void verify_ramped_option_must_be_selected() {
		treatmentSchedulePage.verifySelecetedPropmodeOptionDropdownRamped();
	}

	@Then("wait for four seconds")
	public void verifywait() throws InterruptedException {
		Thread.sleep(3000);
	}

	@Then("the user enter valid data into N2 Rate1 field for first row")
	public void the_user_enter_valid_data_into_n2_rate1_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoN2Rate1FieldForFirstRow("N2Rate1DesignFirstRow");
	}

	@Then("the user enter valid data into N2 Rate2 field for first row")
	public void the_user_enter_valid_data_into_n2_rate2_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoN2Rate2FieldForFirstRow("N2Rate2DesignFirstRow");
	}

	@Then("the user enter valid data into CO2 Rate1 field for first row")
	public void the_user_enter_valid_data_into_co2_rate1_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoCO2Rate1FieldForFirstRow("CO2Rate1DesignFirstRow");
	}

	@Then("the user enter valid data into CO2 Rate2 field for first row")
	public void the_user_enter_valid_data_into_co2_rate2_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoCO2Rate2FieldForFirstRow("CO2Rate2DesignFirstRow");
	}

	@Then("the user enter valid data into Btm prop Conc1 field for first row")
	public void the_user_enter_valid_data_into_btm_prop_conc1_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoBtmPropConc1FieldForFirstRow("BtmPropConc1DesignFirstRow");
	}

	@Then("the user enter valid data into Btm prop Conc2 field for first row")
	public void the_user_enter_valid_data_into_btm_prop_conc2_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoBtmPropConc2FieldForFirstRow("BtmPropConc2DesignFirstRow");
	}

	

	@Then("the user enter valid data into Btm N2 qual field for first row")
	public void the_user_enter_valid_data_into_btm_n2_qual_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoBtmN2QualRateFieldForFirstRow("BtmN2QualDesignFirstRow");
	}

	@Then("the user enter valid data into Btm CO2 qual field for first row")
	public void the_user_enter_valid_data_into_btm_co2_qual_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoBtmCO2QualRateFieldForFirstRow("BtmCO2QualDesignFirstRow");
	}

	@Then("the user enter valid data into Btm clean foam Volume field for first row")
	public void the_user_enter_valid_data_into_btm_clean_foam_volume_field_for_first_row() {
		treatmentSchedulePage.enterDataIntoBtmCleanFoamVolumeFieldForFirstRow("BtmCleanFoamVolumeDesignFirstRow");
	}

	@Then("verify step Type Selected Value For first row on design tab")
	public void verify_step_type_selected_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifystepTypeSelectedValue("Main frac flush");
	}

	@Then("verify step Alias value must be persistant for first row")
	public void verify_step_alias_value_must_be_persistant_for_first_row() {
		treatmentSchedulePage
				.verifyEnteredStepAliasCellValueFirstRow("3.27");
	}

	@Then("verify flow rate1 Value For first row on design tab")
	public void verify_flow_rate1_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyflowRate1Value(ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow1"));
	}

	@Then("verify flow rate2 Value For first row on design tab")
	public void verify_flow_rate2_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyflowRate2Value(ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow"));
	}

	@Then("verify flow rate2 Value For first row on design tab after save")
	public void verify_flow_rate2_value_for_first_row_on_design_tab_after_save() {
		treatmentSchedulePage.verifyflowRate2ValueAfterSave(ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow"));
	}
	
	@Then("verify prop conc1 Value For first row on design tab")
	public void verify_prop_conc1_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyPropConc1Value(ReadData.readdata("PropConcValueDesignFirstRow"));
	}

	@Then("verify prop conc2 Value For first row on design tab")
	public void verify_prop_conc2_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyPropConc2Value(ReadData.readdata("PropConcValueDesignFirstRow"));
	}
	
	@Then("verify prop conc2 Value For first row on design tab after save")
	public void verify_prop_conc2_value_for_first_row_on_design_tab_after_save() {
		treatmentSchedulePage.verifyPropConc2ValueAfterSave(ReadData.readdata("PropConcValueDesignFirstRow"));
	}

	@Then("verify N2Rate1 Value For first row on design tab")
	public void verify_n2rate1_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyN2Rate1CellValueForFirstRow("0.0");
	}

	@Then("verify N2Rate2 Value For first row on design tab")
	public void verify_n2rate2_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyN2Rate2CellValueForFirstRow("N2Rate2DesignFirstRow");
	}

	@Then("verify CO2Rate1 Value For first row on design tab")
	public void verify_co2rate1_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCO2Rate1CellValueForFirstRow("CO2Rate1DesignFirstRow");
	}

	@Then("verify CO2Rate2 Value For first row on design tab")
	public void verify_co2rate2_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCO2Rate2CellValueForFirstRow("CO2Rate2DesignFirstRow");
	}

	@Then("verify clean Vol Value For first row on design tab")
	public void verify_clean_vol_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCleanVolCellValueForFirstRow("507");
	}

	@Then("verify step length Value For first row on design tab")
	public void verify_step_length_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyStepLengthCellValueForFirstRow("3.99");
	}

	@Then("verify btm prop Conc1 Value For first row on design tab")
	public void verify_btm_prop_conc1_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyBtmPropConc1CellValueForFirstRow("BtmPropConc1DesignFirstRow");
	}
	
	@Then("verify btm prop Conc1 Value For first row on design tab after save")
	public void verify_btm_prop_conc1_value_for_first_row_on_design_tab_after_save() {
		treatmentSchedulePage.verifyBtmPropConc1CellValueForFirstRowAfterSave("2.12");
	}

	@Then("verify btm prop Conc2 Value For first row on design tab")
	public void verify_btm_prop_conc2_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyBtmPropConc2CellValueForFirstRow("BtmPropConc2DesignFirstRow");
	}

	@Then("verify btm slurry foam rate Value For first row on design tab")
	public void verify_btm_slurry_foam_rate_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyBtmSlurryFoamRateCellValueForFirstRow("BtmSlurryFoamRateDesignFirstRow");
	}

	@Then("verify btm N2 Qual Value For first row on design tab")
	public void verify_btm_n2_qual_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyBtmN2QualRateCellValueForFirstRow("BtmN2QualDesignFirstRow");
	}

	@Then("verify btm CO2 Qual Value For first row on design tab")
	public void verify_btm_co2_qual_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyBtmCO2QualRateCellValueForFirstRow("BtmCO2QualDesignFirstRow");
	}

	@Then("verify btm Clean foam volume Value For first row on design tab")
	public void verify_btm_clean_foam_volume_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyBtmCleanFoamVolumeCellValueForFirstRow("BtmCleanFoamVolumeDesignFirstRow");
	}

	@Then("verify selected fluid type Value For first row on design tab")
	public void verify_selected_fluid_type_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyFluidTypeCellValueForFirstRow("Fluid1");
	}

	@Then("verify selected proppant type Value For first row on design tab")
	public void verify_selected_proppant_type_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyProppantTypeCellValueForFirstRow("Proppant2");
	}

	@Then("verify calculated cumul time field Value For first row on design tab")
	public void verify_calculated_cumul_time_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCumulTimeCellValueForFirstRow("4:04");
	}

	@Then("verify calculated step slurry field Value For first row on design tab")
	public void verify_calculated_step_slurry_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyStepSlurryCellValueForFirstRow("16.57");
	}

	@Then("verify calculated cumul gel field Value For first row on design tab")
	public void verify_calculated_cumul_gel_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCumulGelCellValueForFirstRow("15,202.00");
	}

	@Then("verify calculated step prop field Value For first row on design tab")
	public void verify_calculated_step_prop_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyStepPropCellValueForFirstRow("28.19");
	}
	
	@Then("verify calculated step prop field Value For first row on design tab after save")
	public void verify_calculated_step_prop_field_value_for_first_row_on_design_tab_after_save() {
		treatmentSchedulePage.verifyStepPropCellValueForFirstRow("64,000.42");
	}

	@Then("verify calculated cumul prop field Value For first row on design tab")
	public void verify_calculated_cumul_prop_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCumulPropCellValueForFirstRow("64.00");
	}

	@Then("verify calculated clean rate field Value For first row on design tab")
	public void verify_calculated_clean_rate_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCleanRateCellValueForFirstRow("81.50");
	}

	@Then("verify calculated cumul slurry field Value For first row on design tab")
	public void verify_calculated_cumul_slurry_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCumulSlurryCellValueForFirstRow("16.57");
	}

	@Then("verify calculated step N2 field Value For first row on design tab")
	public void verify_calculated_step_n2_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyStepN2CellValueForFirstRow("38.64");
	}

	@Then("verify calculated Cumul N2 field Value For first row on design tab")
	public void verify_calculated_cumul_n2_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCumulN2CellValueForFirstRow("38.64");
	}

	@Then("verify calculated step CO2 field Value For first row on design tab")
	public void verify_calculated_step_co2_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyStepCO2CellValueForFirstRow("8.07");
	}
	
	@Then("verify calculated step CO2 field Value For first row on design tab after save")
	public void verify_calculated_step_co2_field_value_for_first_row_on_design_tab_after_save() {
		treatmentSchedulePage.verifyStepCO2CellValueForFirstRow("8.07");
	}

	@Then("verify calculated Cumul CO2 field Value For first row on design tab")
	public void verify_calculated_cumul_co2_field_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCumulCO2CellValueForFirstRow("8.07");
	}
	
	@Then("verify calculated Cumul CO2 field Value For first row on design tab after save")
	public void verify_calculated_cumul_co2_field_value_for_first_row_on_design_tab_after_save() {
		treatmentSchedulePage.verifyCumulCO2CellValueForFirstRow("8.07");
	}

	@Then("verify flow rate Value For first row on design tab")
	public void verify_flow_rate_value_for_first_row_on_design_tab() {
		treatmentSchedulePage
				.verifyflowRateEnteredValueForFirstRow(ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow"));
	}

	@Then("verify prop conc Value For first row on design tab")
	public void verify_prop_conc_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyPropConcEnteredValueForFirstRow(ReadData.readdata("PropConcValueDesignFirstRow"));
	}

	@Then("verify N2Rate Value For first row on design tab")
	public void verify_n2rate_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyN2RateCellValueForFirstRow("N2Rate1DesignFirstRow");
	}

	@Then("verify CO2Rate Value For first row on design tab")
	public void verify_co2rate_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyCO2RateCellValueForFirstRow("CO2Rate1DesignFirstRow");
	}

	@Then("verify btm prop Conc Value For first row on design tab")
	public void verify_btm_prop_conc_value_for_first_row_on_design_tab() {
		treatmentSchedulePage.verifyBtmPropConcCellValueForFirstRow("BtmPropConc2DesignFirstRow");
	}

	@And("the user refresh the page")
	public void the_use_refresh_the_Page() {
		treatmentSchedulePage.pageRefresh();
	}

	@And("scroll To Extreme right in the handsontable")
	public void test() {
		treatmentSchedulePage.ShiftRightwardInHandsontable();
	}

	@And("the user click on the copy design to actual schedule button")
	public void copyDesignToActualSchedule() {
		treatmentScheduleActualPage.clickElementOnCopyDesignToActualSchedule();
	}

	@And("the user click on the yes button on confirmation pop up")
	public void yesButtonOnConfirmationPopUp() {
		treatmentScheduleActualPage.clickElementOnYesButtonOnConfirmationActualSchedule();
	}
	

	@And("the user click on the X button on confirmation pop up")
	public void xButtonOnConfirmationPopUp() {
		treatmentScheduleActualPage.clickElementOnXButton();
	}
	
	
	@And("click on the actual treatment scheduled button")
	public void click_on_the_actual_treatment_scheduled_button() {
		treatmentScheduleActualPage.clickElementOnActualTreatmentScheduled();
	}
	
	// Actual page verification

	@Then("verify step Type Selected Value For first row on actual tab")
	public void verify_step_type_selected_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifystepTypeSelectedValue("Main frac flush");
	}

	@Then("verify step Alias value must be persistant for first row on actual page")
	public void verify_step_alias_value_must_be_persistant_for_first_row_on_actual_page() {
		treatmentScheduleActualPage.verifyEnteredStepAliasCellValueFirstRow(ReadData.readdata("StepAliasValueDesignFirstRow"));
	}

	@Then("verify flow rate1 Value For first row on actual tab")
	public void verify_flow_rate1_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyflowRate1Value1("3.60");
	}

	@Then("verify flow rate2 Value For first row on actual tab")
	public void verify_flow_rate2_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyflowRate2Value(ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow"));
	}

	@Then("verify prop conc1 Value For first row on actual tab")
	public void verify_prop_conc1_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyPropConc1Value1(ReadData.readdata("PropConcValueDesignFirstRow"));
	}

	@Then("verify prop conc2 Value For first row on actual tab")
	public void verify_prop_conc2_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyPropConc2Value1(ReadData.readdata("PropConcValueDesignFirstRow"));
	}

	@Then("verify N2Rate1 Value For first row on actual tab")
	public void verify_n2rate1_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyN2Rate1CellValueForFirstRow("N2Rate1DesignFirstRow");
	}

	@Then("verify N2Rate2 Value For first row on actual tab")
	public void verify_n2rate2_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyN2Rate2CellValueForFirstRow("N2Rate2DesignFirstRow");
	}

	@Then("verify CO2Rate1 Value For first row on actual tab")
	public void verify_co2rate1_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyCO2Rate1CellValueForFirstRow("CO2Rate1DesignFirstRow");
	}

	@Then("verify CO2Rate2 Value For first row on actual tab")
	public void verify_co2rate2_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyCO2Rate2CellValueForFirstRow("CO2Rate2DesignFirstRow");
	}

	@Then("verify clean Vol Value For first row on actual tab")
	public void verify_clean_vol_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyCleanVolCellValueForFirstRow("507");
	}

	@Then("verify step length Value For first row on actual tab")
	public void verify_step_length_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyStepLengthCellValueForFirstRow("3.99");
	}

	@Then("verify btm prop Conc1 Value For first row on actual tab")
	public void verify_btm_prop_conc1_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyBtmPropConc1CellValueForFirstRow("BtmPropConc1DesignFirstRow");
	}
	
	@Then("verify btm prop Conc1 Value For first row on actual tab after save")
	public void verify_btm_prop_conc1_value_for_first_row_on_actual_tab_after_save() {
		treatmentScheduleActualPage.verifyBtmPropConc1CellValueForFirstRow1("2.12");
	}

	@Then("verify btm prop Conc2 Value For first row on actual tab")
	public void verify_btm_prop_conc2_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyBtmPropConc2CellValueForFirstRow("BtmPropConc2DesignFirstRow");
	}

	@Then("verify btm slurry foam rate Value For first row on actual tab")
	public void verify_btm_slurry_foam_rate_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyBtmSlurryFoamRateCellValueForFirstRow("BtmSlurryFoamRateDesignFirstRow");
	}

	@Then("verify btm N2 Qual Value For first row on actual tab")
	public void verify_btm_n2_qual_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyBtmN2QualRateCellValueForFirstRow("BtmN2QualDesignFirstRow");
	}

	@Then("verify btm CO2 Qual Value For first row on actual tab")
	public void verify_btm_co2_qual_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyBtmCO2QualRateCellValueForFirstRow("BtmCO2QualDesignFirstRow");
	}

	@Then("verify btm Clean foam volume Value For first row on actual tab")
	public void verify_btm_clean_foam_volume_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyBtmCleanFoamVolumeCellValueForFirstRow("BtmCleanFoamVolumeDesignFirstRow");
	}

	@Then("verify selected fluid type Value For first row on actual tab")
	public void verify_selected_fluid_type_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyFluidTypeCellValueForFirstRow("Fluid1");
	}

	@Then("verify selected proppant type Value For first row on actual tab")
	public void verify_selected_proppant_type_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyProppantTypeCellValueForFirstRow("Proppant2");
	}

	@Then("verify flow rate Value For first row on actual tab")
	    public void verify_flow_rate_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyflowRateEnteredValueForFirstRow(ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow"));
     }
	
	@Then("verify prop conc Value For first row on actual tab")
	public void verify_prop_conc_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyPropConcEnteredValueForFirstRow(ReadData.readdata("PropConcValueDesignFirstRow"));
	}
	
	@Then("verify N2Rate Value For first row on actual tab")
	public void verify_n2rate_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyN2RateCellValueForFirstRow("N2Rate1DesignFirstRow");
	}

	@Then("verify CO2Rate Value For first row on actual tab")
	public void verify_co2rate_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyCO2RateCellValueForFirstRow("CO2Rate1DesignFirstRow");
	}

	@Then("verify btm prop Conc Value For first row on actual tab")
	public void verify_btm_prop_conc_value_for_first_row_on_actual_tab() {
		treatmentScheduleActualPage.verifyBtmPropConcCellValueForFirstRow("BtmPropConc2DesignFirstRow");
	}
	

	
	@And("verify the presence of copy to button on treatment scheduled screen")
	public void verify_the_presence_of_copy_to_button_on_treatment_scheduled_screen() {
		treatmentScheduleActualPage.verifyCopyToButtonDisplayed();
	}

	
	@And("verify the presence of step length field and its data with units in the total section")
	public void verify_the_presence_of_step_length_field_and_its_data_with_units_in_the_total_section() {
		treatmentScheduleActualPage.verifyStepLengthTotalValue("8.22");
		treatmentScheduleActualPage.verifyStepLengthTotalUnit("min");
	}
	
	
	@And("verify the presence of clean volume field and its data with units in the total section")
	public void verify_the_presence_of_clean_volume_field_and_its_data_with_units_in_the_total_section() {
		treatmentScheduleActualPage.verifyCleanVolumeTotalValue("685");
		treatmentScheduleActualPage.verifyCleanVolumeTotalUnit("gal");
	}
	
	@And("verify the presence of step proppant field and its data with units in the total section")
	public void verify_the_presence_of_step_proppant_field_and_its_data_with_units_in_the_total_section() {
		treatmentScheduleActualPage.verifyStepProppantTotalValue("2,134.47");
		treatmentScheduleActualPage.verifyStepProppantTotalUnit("lbs");
	}
	
	@And("User click on the copy to button")
	public void user_click_on_the_copy_to_button() {
		treatmentScheduleActualPage.clickCopyToButton();
	}

	@And("user verify the copy option pop up")
	public void user_verify_the_copy_option_pop_up() {
		treatmentScheduleActualPage.verifyCopyOptionPopupDisplayed();
	}
	
	@And("verify the copy into all stages and copy into group message")
	public void verify_the_copy_into_all_stages_and_copy_into_group_message() {
		treatmentScheduleActualPage.verifyCopyIntoAllStagesMessage();
		treatmentScheduleActualPage.verifyCopyIntoGroupMessage();
	}
	
	@And("user verify the auto populate flush volume in copy option pop up")
	public void user_verify_the_auto_populate_flush_volume_in_copy_option_pop_up() {
		treatmentScheduleActualPage.verifyFlushVolumeAutoPopulated();
	}
	
	@And("verify the presence of ok and cancel button in copy option pop up")
	public void verify_the_presence_of_ok_and_cancel_button_in_copy_option_pop_up() {
		treatmentScheduleActualPage.verifyOkButtonDisplayed();
		treatmentScheduleActualPage.verifyCancelButtonDisplayed();
	}
	
	
}