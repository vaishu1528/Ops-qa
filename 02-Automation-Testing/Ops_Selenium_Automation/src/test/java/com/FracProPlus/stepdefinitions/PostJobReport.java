package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.PostJobReportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostJobReport extends DriverFactory {
	PostJobReportPage postJobReportPage = new PostJobReportPage(driver);

	@Given("the user is on the Report Page")
	public void the_user_is_on_the_report_page() {
		postJobReportPage.verifyUserIsOnReportPage();
	}

	@Given("the user clicks on the results module")
	public void the_user_clicks_on_the_results_module() {
		postJobReportPage.clickElementResultsModule();
	}

	@And("the user clicks on the report sub module")
	public void the_user_clicks_on_the_report_sub_module() {
		postJobReportPage.clickElementReportSubModule();
	}

	@Then("the user verifies the report page header name")
	public void the_user_verifies_the_report_page_header_name() {
		postJobReportPage.verifyUserIsOnReportPage();
	}

	@When("the user clicks on the post job report tab")
	public void the_user_clicks_on_the_post_job_report_tab() {
		postJobReportPage.clickElementPostJobReportTab();
	}

	@And("the user enters the data into the kickoff TVD field")
	public void the_user_enters_the_data_into_the_kickoff_tvd_field() {
		postJobReportPage.enterKickoffTVDData();
	}

	@And("the user enters the data into the Plug Depth field")
	public void the_user_enters_the_data_into_the_plug_depth_field() {
		postJobReportPage.enterPlugDepthData();
	}

	@And("the user enters the data into the Produced Water field")
	public void the_user_enters_the_data_into_the_produced_water_field() {
		postJobReportPage.enterProducedWaterData();
	}

	@And("the user enters the data into the Pumpdown Volume field")
	public void the_user_enters_the_data_into_the_pumpdown_volume_field() {
		postJobReportPage.enterPumpdownVolumeData();
	}

	@And("the user enters the data into the Operator max pressure field")
	public void the_user_enters_the_data_into_the_operator_max_pressure_field() {
		postJobReportPage.enterOperatorMaxPressureData();
	}

	@And("the user enters the data into the Pumpdown Max Pressure field")
	public void the_user_enters_the_data_into_the_pumpdown_max_pressure_field() {
		postJobReportPage.enterPumpdownMaxPressureData();
	}

	@And("the user enters the data into the Design avg treating pressure field")
	public void the_user_enters_the_data_into_the_design_avg_treating_pressure_field() {
		postJobReportPage.enterDesignAvgTreatingPressureData();
	}

	@And("the user enters the data into the Design avg frac gradient field")
	public void the_user_enters_the_data_into_the_design_avg_frac_gradient_field() {
		postJobReportPage.enterDesignAvgFracGradientData();
	}

	@And("the user enters the data into the Charge weight field")
	public void the_user_enters_the_data_into_the_charge_weight_field() {
		postJobReportPage.enterChargeWeightData();
	}

	@And("the user enters the data into the Pumpdown max rate field")
	public void the_user_enters_the_data_into_the_pumpdown_max_rate_field() {
		postJobReportPage.enterPumpdownMaxRateData();
	}

	@And("the user enters the data into the Field Gas field")
	public void the_user_enters_the_data_into_the_field_gas_field() {
		postJobReportPage.enterFieldGasData();
	}

	@And("the user enters the data into the CNG field")
	public void the_user_enters_the_data_into_the_cng_field() {
		postJobReportPage.enterCNGData();
	}

	@And("the user enters the data into the plug type field")
	public void the_user_enters_the_data_into_the_plug_type_field() {
		postJobReportPage.enterPlugTypeData();
	}

	@And("the user selects the option from Bacteria treatment method dropdown")
	public void the_user_selects_the_option_from_bacteria_treatment_method_dropdown() {
		postJobReportPage.selectBacteriaTreatmentMethod();
	}

	@And("the user enters the data into the diesel field")
	public void the_user_enters_the_data_into_the_diesel_field() {
		postJobReportPage.enterDieselData();
	}

	@And("the user enters the data into the chlorides field")
	public void the_user_enters_the_data_into_the_chlorides_field() {
		postJobReportPage.enterChloridesData();
	}

	@And("the user enters the number into the pad stage no field")
	public void the_user_enters_the_number_into_the_pad_stage_no_field() {
		postJobReportPage.enterPadStageNo();
	}

	@And("the user enters the data into the override surface max pressure field")
	public void the_user_enters_the_data_into_the_override_surface_max_pressure_field() {
		postJobReportPage.enterOverrideSurfaceMaxPressureData();
	}

	@Then("the user verifies the sub percentage field should be read only")
	public void the_user_verifies_the_sub_percentage_field_should_be_read_only() {
		postJobReportPage.verifySubPercentageFieldReadOnly();
	}

	@And("the user verifies the pump at start field should be read only")
	public void the_user_verifies_the_pump_at_start_field_should_be_read_only() {
		postJobReportPage.verifyPumpAtStartFieldReadOnly();
	}

	@And("the user verifies the pump at end field should be read only")
	public void the_user_verifies_the_pump_at_end_field_should_be_read_only() {
		postJobReportPage.verifyPumpAtEndFieldReadOnly();
	}

	@And("the user verifies the value in the sub percentage field")
	public void the_user_verifies_the_value_in_the_sub_percentage_field() {
		postJobReportPage.verifySubPercentage();
	}

	@When("the user selects an option from select plot dropdown")
	public void the_user_selects_an_option_from_select_plot_dropdown() {
		postJobReportPage.selectPlotOption();
	}

	@And("the user clicks on the clearElement data button to clearElement the data from all fields")
	public void the_user_clicks_on_the_clearElement_data_button_to_clearElement_the_data_from_all_fields() {
		postJobReportPage.clickElementClearDataButton();
	}

	@When("the user clicks on the Save button to save data")
	public void the_user_clicks_on_the_save_button_to_save_data() {
		postJobReportPage.clickElementSaveButton();
	}

	@Then("the user verifies the data in the kickoff TVD field")
	public void the_user_verifies_the_data_in_the_kickoff_tvd_field() {
		postJobReportPage.verifyKickoffTVDData();
	}

	@And("the user verifies the data in the Plug Depth field")
	public void the_user_verifies_the_data_in_the_plug_depth_field() {
		postJobReportPage.verifyPlugDepthData();
	}

	@And("the user verifies the data in the Produced Water field")
	public void the_user_verifies_the_data_in_the_produced_water_field() {
		postJobReportPage.verifyProducedWaterData();
	}

	@And("the user verifies the data in the Pumpdown Volume field")
	public void the_user_verifies_the_data_in_the_pumpdown_volume_field() {
		postJobReportPage.verifyPumpdownVolumeData();
	}

	@And("the user verifies the data in the Operator max pressure field")
	public void the_user_verifies_the_data_in_the_operator_max_pressure_field() {
		postJobReportPage.verifyOperatorMaxPressureData();
	}

	@And("the user verifies the data in the Pumpdown Max Pressure field")
	public void the_user_verifies_the_data_in_the_pumpdown_max_pressure_field() {
		postJobReportPage.verifyPumpdownMaxPressureData();
	}

	@And("the user verifies the data in the Design avg treating pressure field")
	public void the_user_verifies_the_data_in_the_design_avg_treating_pressure_field() {
		postJobReportPage.verifyDesignAvgTreatingPressureData();
	}

	@And("the user verifies the data in the Design avg frac gradient field")
	public void the_user_verifies_the_data_in_the_design_avg_frac_gradient_field() {
		postJobReportPage.verifyDesignAvgFracGradientData();
	}

	@And("the user verifies the data in the Charge weight field")
	public void the_user_verifies_the_data_in_the_charge_weight_field() {
		postJobReportPage.verifyChargeWeightData();
	}

	@And("the user verifies the data in the Pumpdown max rate field")
	public void the_user_verifies_the_data_in_the_pumpdown_max_rate_field() {
		postJobReportPage.verifyPumpdownMaxRateData();
	}

	@And("the user verifies the data in the Field Gas field")
	public void the_user_verifies_the_data_in_the_field_gas_field() {
		postJobReportPage.verifyFieldGasData();
	}

	@And("the user verifies the data in the CNG field")
	public void the_user_verifies_the_data_in_the_cng_field() {
		postJobReportPage.verifyCNGData();
	}

	@And("the user verifies the data in the plug type field")
	public void the_user_verifies_the_data_in_the_plug_type_field() {
		postJobReportPage.verifyPlugTypeData();
	}

	@And("the user verifies the option from Bacteria treatment method dropdown")
	public void the_user_verifies_the_option_from_bacteria_treatment_method_dropdown() {
		postJobReportPage.verifyBacteriaTreatmentMethod();
	}

	@And("the user verifies the data in the diesel field")
	public void the_user_verifies_the_data_in_the_diesel_field() {
		postJobReportPage.verifyDieselData();
	}

	@And("the user verifies the data in the chlorides field")
	public void the_user_verifies_the_data_in_the_chlorides_field() {
		postJobReportPage.verifyChloridesData();
	}

	@And("the user verifies the number in the pad stage no field")
	public void the_user_verifies_the_number_in_the_pad_stage_no_field() {
		postJobReportPage.verifyPadStageNo();
	}

	@And("the user verifies the data in the override surface max pressure field")
	public void the_user_verifies_the_data_in_the_override_surface_max_pressure_field() {
		postJobReportPage.verifyOverrideSurfaceMaxPressureData();
	}

	@And("the user verifies the data in the pump at start field")
	public void the_user_verifies_the_data_in_the_pump_at_start_field() {
		postJobReportPage.verifyPumpAtStartData();
	}

	@And("the user verifies the data in the pump at end field")
	public void the_user_verifies_the_data_in_the_pump_at_end_field() {
		postJobReportPage.verifyPumpAtEndData();
	}

	@When("the user clicks on the download WITSML Report")
	public void the_user_clicks_on_the_download_witsml_report() {
		postJobReportPage.clickElementDownloadWITSMLReport();
	}

	@Then("the user verifies the report download successfully message")
	public void the_user_verifies_the_report_download_successfully_message() {
		postJobReportPage.verifyReportDownloadSuccessMessage();
	}

	@When("the user clicks on the download word Report")
	public void the_user_clicks_on_the_download_word_report() {
		postJobReportPage.clickElementDownloadWordReport();
	}

	@When("the user clicks on the download ASCII file button")
	public void the_user_clicks_on_the_download_ascii_file_button() {
		postJobReportPage.clickElementDownloadASCIIFileButton();
	}

	@When("the user clickElements on the clearElement data button to clearElement the data from all fields")
	public void the_user_clickElements_on_the_clearElement_data_button_to_clearElement_the_data_from_all_fields() {
		postJobReportPage.clickElementClearDataButton();
	}

	@Then("the user clicks on the clear data button to clear the data from all fields")
	public void the_user_clicks_on_the_clear_data_button_to_clear_the_data_from_all_fields() {
		postJobReportPage.clickElementClearDataButton();
	}

	@Then("the user verifies all field data after clicking clear data button")
	public void the_user_verifies_all_field_data_after_clicking_clear_data_button() {
		postJobReportPage.verifyAfterClearData();
	}

}