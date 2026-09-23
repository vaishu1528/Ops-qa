package com.FracProPlus.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.SaveAndNextPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaveAndNextSteps {

	private SaveAndNextPage page;

	private SaveAndNextPage getPage() {
		if (page != null) {
			return page;
		}
		WebDriver activeDriver = DriverFactory.getDriver();
		if (activeDriver == null) {
			throw new IllegalStateException("DriverFactory.getDriver() returned null. Ensure hooks initialize the driver before step execution.");
		}
		page = new SaveAndNextPage(activeDriver);
		return page;
	}

	@When("Click on the well and treatment tab")
	public void click_on_the_well_and_treatment_tab() {
		System.out.println("[P17] Step: Click on the well and treatment tab");
		getPage().clickElementOnWellTreatmentOption2();
	}

	@And("enter data into any field in general information tab")
	public void enter_data_into_any_field_in_general_information_tab() {
		getPage().enterDataIntoAnyFieldInGeneralInformationTab();
	}

	@And("click on the comments tab")
	public void click_on_the_comments_tab() {
		System.out.println("[P17] Step: Click on the comments tab");
		getPage().clickCommentsTab();
	}

	@And("click on yes save button in save and next pop up ")
	public void click_on_yes_save_button_in_save_and_next_pop_up_with_trailing_space() {
		System.out.println("[P17] Step: Click on yes save button in save and next pop up (with trailing space)");
		getPage().clickYesSaveInSaveAndNextPopup();
	}

	@And("click on the general information tab")
	public void click_on_the_general_information_tab() {
		System.out.println("[P17] Step: Click on the general information tab");
		getPage().clickGeneralInformationTab();
	}

	@Then("Verify the saved data in general information tab")
	public void verify_the_saved_data_in_general_information_tab() {
		System.out.println("[P17] Step: Verify the saved data in general information tab");
		getPage().verifySavedDataInGeneralInformationTab();
	}

	@And("Click on the next button")
	public void click_on_the_next_button() {
		System.out.println("[P17] Step: Click on the next button");
		getPage().clickNextButton();
	
	}

	@And("click on the collapsed icon")
	public void click_on_the_collapsed_icon() {
		
		getPage().clickCollapseButton();
	}

	
	@Then("Verify the channel input for model page header name")
	public void verify_the_channel_input_for_model_page_header_name() {
		System.out.println("[P17] Step: Verify the channel input header name");
		getPage().verifyChannelInputForModelHeaderName();
	}

	@And("Select model input channel check box")
	public void select_model_input_channel_check_box() {
		System.out.println("[P17] Step: Select model input channel checkbox");
		getPage().selectModelInputChannelCheckBox();
	}

	@And("Click on the additive tab")
	public void click_on_the_additive_tab() {
		System.out.println("[P17] Step: Click on the additive tab");
		getPage().clickAdditiveTab();
	}
	
	@And("Click on the real time channel tab")
	public void Click_on_the_real_time_channel_tab() {
		System.out.println("[P17] Step: Click on the additive tab");
		getPage().clickrealTimeTab();
	}


	@And("Click on the directional survey tab ")
	public void click_on_the_directional_survey_tab_with_trailing_space() {
		System.out.println("[P17] Step: Click on directional survey tab (with trailing space)");
		getPage().clickDirectionalSurveyTab();
	}

	@And("click on yes save button in save and next pop up")
	public void click_on_yes_save_button_in_save_and_next_pop_up() {
		System.out.println("[P17] Step: Click on yes save button in save and next pop up");
		getPage().clickYesSaveInSaveAndNextPopup();
	}
	
	@And("click on the collapse button")
	public void click_on_the_collapse_button() {
		getPage().clickCollapseButton();
	}

	@Then("Verify the data in the drilled hole tab")
	public void verify_the_data_in_the_drilled_hole_tab() {
		System.out.println("[P17] Step: Verify drilled hole data");
		getPage().verifyDataInTheDrilledHoleTab();
	}

	@And("Click on the directional survey tab")
	public void click_on_the_directional_survey_tab_again() {
		System.out.println("[P17] Step: Click on directional survey tab (again)");
		getPage().clickDirectionalSurveyTab();
	}

	@Then("Verify the heat transfer parameters header page name")
	public void verify_the_heat_transfer_parameters_header_page_name() {
		System.out.println("[P17] Step: Verify heat transfer parameters header name");
		getPage().verifyHeatTransferParametersHeaderPageName();
	}

	@Then("Verify the reservoir parameters page header name")
	public void verify_the_reservoir_parameters_page_header_name() {
		System.out.println("[P17] Step: Verify reservoir parameters header name");
		getPage().verifyReservoirParametersHeaderPageName();
	}
	
	public void goBack(WebDriver driver) {
	    driver.navigate().back();
	}
	
	@Then("Verify the Surface Fluid Temperature field data after save")
	public void Verify_the_Surface_Fluid_Temperature_field_data_after_save() {
		getPage().VerifyHeatTransferSurfaceFluid();
	}

	@Then("Verify the material selection page header name")
	public void verify_the_material_selection_page_header_name() {
		System.out.println("[P17] Step: Verify material selection header name");
		getPage().verifyMaterialSelectionHeaderPageName();
	}

	@And("Click on the chemical selection tab")
	public void click_on_the_chemical_selection_tab() {
		System.out.println("[P17] Step: Click on the chemical selection tab");
		getPage().clickChemicalSelectionTab();
	}

	@And("Edit the data in actual treatment scheduled tab")
	public void edit_the_data_in_actual_treatment_scheduled_tab() {
		System.out.println("[P17] Step: Edit data in actual treatment scheduled tab");
		getPage().editDataInActualTreatmentScheduledTab();
	}

	@And("Click on the actual treatment schedule tab")
	public void click_on_the_actual_treatment_schedule_tab() {
		System.out.println("[P17] Step: Click on actual treatment schedule tab");
		getPage().clickActualTreatmentScheduleTab();
	}

	@Then("verify the saved data in actual treatment scheduled tab")
	public void verify_the_saved_data_in_actual_treatment_scheduled_tab() {
		System.out.println("[P17] Step: Verify saved data in actual treatment scheduled tab");
		getPage().verifySavedDataInActualTreatmentScheduledTab();
	}

	@And("Click on the treatment totals tab")
	public void click_on_the_treatment_totals_tab() {
		System.out.println("[P17] Step: Click on the treatment totals tab");
		getPage().clickTreatmentTotalsTab();
	}

	@Then("Verify the user navigate to plot screen")
	public void verify_the_user_navigate_to_plot_screen() {
		System.out.println("[P17] Step: Verify user navigated to plot screen");
		getPage().verifyUserNavigateToPlotScreen();
	}
}

