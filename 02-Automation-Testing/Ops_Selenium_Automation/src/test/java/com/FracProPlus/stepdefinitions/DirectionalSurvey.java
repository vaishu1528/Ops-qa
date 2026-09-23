package com.FracProPlus.stepdefinitions;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.DirectionalSurveyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DirectionalSurvey extends DriverFactory {
	DirectionalSurveyPage directionalSurveyPage = new DirectionalSurveyPage(driver);


	@When("the user clicks on the directional survey tab")
	public void the_user_clicks_on_the_directional_survey_tab() {
		directionalSurveyPage.clickElementOnDirectionalSurveyTab();
	}


	@Then("the options present in specify dropdown should be verified")
	public void the_options_present_in_specify_dropdown_should_be_verified() {
		directionalSurveyPage.verifySpecifyDropdownOptions();
	}

	@When("the user selects north south east west and TVD option from the specify dropdown")
	public void the_user_selects_north_south_east_west_and_TVD_option_from_the_specify_dropdown() {
		directionalSurveyPage.selectNorthSouthEastWestTVDOption();
	}

//	@Then("the table header names for the option should be verified")
//	public void the_table_header_names_for_the_option_should_be_verified() throws InterruptedException {
//		directionalSurveyPage.verifyTableHeaderNamesForOption();
//	}

	@Then("Verify the md inclination azimuth tvd Ns and Ew header name in directional survey tab")
	public void Verify_the_md_inclination_azimuth_tvd_Ns_and_Ew_header_name_in_directional_survey_tab() throws InterruptedException  {
		directionalSurveyPage.verifyTableHeaderNamesForHeaderOption();
	}
	
	@When("the user selects MD and Inclination and Azimuth option from specify dropdown")
	public void the_user_selects_MD_and_Inclination_and_Azimuth_option_from_specify_dropdown() {
		directionalSurveyPage.selectMDInclinationAzimuthOption();
	}

	@Then("the table header names for the MD and Inclination and Azimuth option should be verified")
	public void the_table_header_names_for_the_MD_and_Inclination_and_Azimuth_option_should_be_verified() throws InterruptedException {
		directionalSurveyPage.verifyTableHeaderNamesForMDInclinationAzimuthOption();
	}

	@When("the user selects MD and TVD and Azimuth option from specify dropdown")
	public void the_user_selects_MD_and_TVD_and_Azimuth_option_from_specify_dropdown() {
		directionalSurveyPage.selectMDTVDAndAzimuthOption();
	}

	@Then("the table header names for the MD and TVD and Azimuth option should be verified")
	public void the_table_header_names_for_the_MD_and_TVD_and_Azimuth_option_should_be_verified() throws InterruptedException {
		directionalSurveyPage.verifyTableHeaderNamesForMDTVDAndAzimuthOption();
	}

	@And("the user enters the data into north south field for first row")
	public void the_user_enters_the_data_into_north_south_field_for_first_row() {
		directionalSurveyPage.enterDataIntoNorthSouthField();
	}

	@And("the user enters the data into east west field for first row")
	public void the_user_enters_the_data_into_east_west_field_for_first_row() {
		directionalSurveyPage.enterDataIntoEastWestField();
	}

	@And("the user enters the data into TVD field for first row")
	public void the_user_enters_the_data_into_TVD_field_for_first_row() {
		directionalSurveyPage.enterDataIntoTVDField();
	}

	@When("the user selects MD and inclination and azimuth option from specify dropdown")
	public void the_user_selects_MD_and_inclination_and_azimuth_option_from_specify_dropdown() {
		directionalSurveyPage.selectMDInclinationAzimuthOption();
	}

	@When("user copy and paste the data from excel to the MD Inclination Azimuth column")
	public void user_copy_and_paste_the_data_from_excel_to_the_MD_Inclination_Azimuth_column() {
		directionalSurveyPage.PastingDataToColumnRowWiseMdInclination();
	}
	
	@When("user copy and paste the data from excel to the TVD NS and EW column")
	public void user_copy_and_paste_the_data_from_excel_to_the_TVD_NS_and_EW_column() {
		directionalSurveyPage.PastingDataToColumnRowWiseNsEw();
	}
	
	
	@And("the user enters the data into MD field for first row")
	public void the_user_enters_the_data_into_MD_field_for_first_row() {
		directionalSurveyPage.enterDataIntoMDField();
	}

	@And("the user enters the data into Inclination field for first row")
	public void the_user_enters_the_data_into_Inclination_field_for_first_row() {
		directionalSurveyPage.enterDataIntoInclinationField();
	}

	@And("the user enters the data into Azimuth field for first row")
	public void the_user_enters_the_data_into_Azimuth_field_for_first_row() {
		directionalSurveyPage.enterDataIntoAzimuthField();
	}

	@When("the user clicks on save button")
	public void the_user_clicks_on_save_button() {
		directionalSurveyPage.clickElementOnSaveButton();
	}

	@Then("the value into MD field for first row should be verified")
	public void the_value_into_MD_field_for_first_row_should_be_verified() {
		directionalSurveyPage.verifyMDFieldValue();
	}

	@And("the value into inclination field for first row should be verified")
	public void the_value_into_inclination_field_for_first_row_should_be_verified() {
		directionalSurveyPage.verifyInclinationFieldValue();
	}

	@And("the value into Azimuth field for first row should be verified")
	public void the_value_into_Azimuth_field_for_first_row_should_be_verified() {
		directionalSurveyPage.verifyAzimuthFieldValue();
	}

	@And("the value into north south field for first row should be verified")
	public void the_value_into_north_south_field_for_first_row_should_be_verified() {
		directionalSurveyPage.verifyNorthSouthFieldValue();
	}

	@And("the value into east west field for first row should be verified")
	public void the_value_into_east_west_field_for_first_row_should_be_verified() {
		directionalSurveyPage.verifyEastWestFieldValue();
	}

	@And("the value into TVD field for first row should be verified")
	public void the_value_into_TVD_field_for_first_row_should_be_verified() {
		directionalSurveyPage.verifyTVDFieldValue();
	}
	
	@Given("User opens the Directional Survey Application")
	public void user_opens_the_directional_survey_application() {
		driver = DriverFactory.getDriver();
	}

	@When("User enters valid survey data {string} into the survey field")
	public void user_enters_valid_survey_data_into_the_survey_field(String surveyData) {
	//	directionalSurveyPage.enterSurveyData(surveyData);
	}

	@And("User clickElements on the Submit button")
	public void user_clickElements_on_the_submit_button() {
	//	directionalSurveyPage.clickElementSubmitButton();
	}

	@Then("User should see the survey results displayed")
	public void user_should_see_the_survey_results_displayed() {
	//	directionalSurveyPage.isSurveyResultDisplayed();
	}

	@Given("User navigates to the Directional Survey home page")
	public void user_navigates_to_the_directional_survey_home_page() {
	//	directionalSurveyPage.navigateToHomePage();
	}

	@When("User selects the survey type {string}")
	public void user_selects_the_survey_type(String surveyType) {
		//directionalSurveyPage.selectSurveyType(surveyType);
	}

	@And("User clickElements on the Calculate button")
	public void user_clickElements_on_the_calculate_button() {
	//	directionalSurveyPage.clickElementCalculateButton();
	}

	@Then("User should see the calculated survey results")
	public void user_should_see_the_calculated_survey_results() {
		//directionalSurveyPage.isCalculatedResultDisplayed();
	}
}