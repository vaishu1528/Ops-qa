package com.FracProPlus.stepdefinitions;

import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.ChannelInputPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChannelInput extends DriverFactory {
	ChannelInputPage channelInputPage = new ChannelInputPage(driver);

	@When("the user clicks on the Channel Inputs for Model option")
	public void the_user_clicks_on_the_Channel_Inputs_for_Model_option() {
		channelInputPage.clickElementChannelInputsForModel();
	}

	@Then("the page header name should be verified")
	public void the_page_header_name_should_be_verified() {
		channelInputPage.verifyPageHeaderName();
	}

	@And("the Channel Inputs table header names should be verified")
	public void the_Channel_Inputs_table_header_names_should_be_verified() {
		channelInputPage.verifyChannelInputsTableHeaderNames();
	}

	@And("the Real-Time Channel section should display empty data")
	public void the_Real_Time_Channel_section_should_display_empty_data() {
		channelInputPage.verifyRealTimeChannelSectionEmptyData();
	}

	@And("the Channel Options section should be visible")
	public void the_Channel_Options_section_should_be_visible() {
		channelInputPage.verifyChannelOptionsSectionVisible();
	}

	@And("all options in the Channel Options section should be selectable")
	public void all_options_in_the_Channel_Options_section_should_be_selectable() {
		channelInputPage.verifyAllOptionsSelectableInChannelOptionsSection();
	}

	@And("the user enters Channel Name into the channel name input box")
	public void the_user_enters_channel_name_into_the_channel_name_input_box() {
		channelInputPage.enterChannelName();
	}

	@And("the user select Unit types form the Unit types dropdown")
	public void the_user_selects_unit_types_from_the_unit_types_dropdown() {
		channelInputPage.selectUnitType();
	}

	@Then("the user verifies the in the units column the unit is auto selcted when user select the unit type")
	public void the_user_verifies_unit_auto_selection() {
		channelInputPage.verifyUnitAutoSelected();
	}

	@And("the user enters the foumula under the formula input box")
	public void the_user_enters_the_formula_under_the_formula_input_box() {
		channelInputPage.enterFormula();
	}

	@And("the user clicks the save and validate button")
	public void the_user_clicks_the_save_and_validate_button() {
		channelInputPage.clickSaveAndValidate();
	}

	@And("the user select Unit Rate bpm types form the Unit types dropdown in first row")
	public void the_user_select_Unit_Rate() {
		channelInputPage.SelectUnitRateBPM();
	}

	@Then("user verifies that user is redirected to the Channel Inputs for Model screen")
	public void the_user_verifies_redirection_to_channel_inputs_screen() {
		channelInputPage.verifyRedirectionToChannelInputs();
	}

	@Then("user verifies that checkbox of the Use User-defined Channels in Input Channel Selection is checked")
	public void the_user_verifies_checkbox_checked() {
		channelInputPage.verifyUserDefinedChannelsCheckboxChecked();
	}
	@Then("user verifies that checkbox of the Use User-defined Channels in Input Channel Selection is unchecked")
	public void the_user_verifies_checkbox_unchecked() {
		channelInputPage.verifyUserDefinedChannelsCheckboxunChecked();
	}

	@When("the user Selects Additive Rate Channel from the dropdown")
	public void the_user_Selects_Additive_Rate_Channel_from_the_dropdown() {
		channelInputPage.selectAdditiveRateChannel();
	}

	@When("the user selects Key Rate from dropdown")
	public void the_user_selects_Key_Rate_from_dropdown() {
		channelInputPage.selectKeyRateChannel();
	}

	@When("the user selects Additive Set Point from dropdown")
	public void the_user_selects_Additive_Set_Point_from_dropdown() {
		channelInputPage.selectAdditiveSetChannel();
	}

	@When("the user select the Real-Time Channel Names for Treating Pressure")
	public void the_user_selects_real_time_channel_names_for_treating_pressure() {
		channelInputPage.selectRealTimeChannelForTreatingPressure();
	}

	@When("the user unselects the the Real-Time Channel Names for Bottomhole Pressure")
	public void the_user_unselects_Real_time_channel_names_for_Bottomhole_pressure() {
		channelInputPage.unselectRealTimeChannelForBottomholePressure();
	}

	@Then("the user verifies the under the Observed Net Pressure Calculation section From Surface Treating Pressure option is auto selected")
	public void the_user_verifies_surface_treating_pressure_auto_selected() {
		channelInputPage.verifySurfaceTreatingPressureAutoSelected();
	}

	@When("The user select the Real-Time Channel Names for Bottomhole Pressure")
	public void the_user_selects_real_time_channel_names_for_bottomhole_pressure() {
		channelInputPage.selectRealTimeChannelForBottomholePressure();
	}

	@Then("the user verifies the under the Observed Net Pressure Calculation section From Bottom Hole Pressure is auto selected")
	public void the_user_verifies_bottomhole_pressure_auto_selected() {
		channelInputPage.verifyBottomholePressureAutoSelected();
	}

	@Then("the user verifies the Measured Depth to Bottom Hole Gauge field is appers")
	public void the_user_verifies_measured_depth_field_appears() {
		channelInputPage.verifyMeasuredDepthFieldAppears();
	}

	@Then("the user verifies the unit of the Measured Depth to Bottom Hole Gauge")
	public void the_user_verifies_unit_of_measured_depth_field() {
		channelInputPage.verifyMeasuredDepthUnit();
	}

	@And("The user enters data into Measured Depth to Bottom Hole Gauge input field")
	public void the_user_enters_data_into_measured_depth_input_field() {
		channelInputPage.enterMeasuredDepthData();
	}

	@Then("the user verifies that the data has been saved for the Measured Depth to Bottom Hole Gauge")
	public void the_user_verifies_measured_depth_data_saved() {
		channelInputPage.verifyMeasuredDepthDataSaved();
	}

	@Then("the user verifies that the data has been saved for Additives Tab")
	public void the_user_verifies_that_the_data_has_been_saved_for_Additives_Tab() {
		channelInputPage.verifyAdditiveTapDataSaved();
	}

	@And("The user enters data into Dead String SG input field")
	public void the_user_enters_data_into_dead_string_sg_input_field() {
		channelInputPage.enterDeadStringSG();
	}

	@When("The user select the Real-Time Channel Names for Dead String Pressure")
	public void the_user_selects_real_time_channel_names_for_dead_string_pressure() {
		channelInputPage.selectRealTimeChannelForDeadStringPressure();
	}

	@Then("the user verifies the under the Observed Net Pressure Calculation section From Dead String Pressure is auto selected")
	public void the_user_verifies_dead_string_pressure_auto_selected() {
		channelInputPage.verifyDeadStringPressureAutoSelected();
	}

	@Then("the user verifies the Dead String SG field is appers")
	public void the_user_verifies_dead_string_sg_field_appears() {
		channelInputPage.verifyDeadStringSGFieldAppears();
	}

	@Then("the user verifies that the data has been saved for Dead String SG")
	public void the_user_verifies_dead_string_sg_data_saved() {
		channelInputPage.verifyDeadStringSGDataSaved();
	}

	@When("the user selects the checkbox Use User-defined Channels in Input Channel Selection from Channel Options section")
	public void the_user_selects_the_checkbox_Use_User_defined_Channels_in_Input_Channel_Selection_from_Channel_Options_section() {
		channelInputPage.selectUseUserDefinedChannelsCheckbox();
	}

	@Then("selecting the Use User-defined Channels checkbox should redirect the user to User-Defined Channels under the Utility section")
	public void selecting_the_Use_User_defined_Channels_checkbox_should_redirect_the_user_to_User_Defined_Channels_under_the_Utility_section() {
		channelInputPage.verifyRedirectionToUserDefinedChannels();

	}

	@When("the user clicks on the Inputs")
	public void the_user_clicks_on_the_Inputs() {
		channelInputPage.clickElementInputs();
	}

	@When("the user get the Action required popup")
	public void the_user_get_the_Action_required_popup() {
		channelInputPage.isActionRequiredpoupdisplayed();
	}

	@When("the user select yes create option from Action required popup")
	public void the_user_select_yes_create_option_from_Action_required_popup() {
		channelInputPage.clickonYesbutton();
	}

	@And("the user clicks on Channel Inputs for Model again")
	public void the_user_clicks_on_Channel_Inputs_for_Model_again() {
		channelInputPage.clickElementChannelInputsForModelAgain();
	}

	@And("the user Clicks on Additives Tab")
	public void the_user_Clicks_on_Additives_Tab() {
		channelInputPage.clickElementAdditivesTab();
	}

	@Then("the Observed Net Pressure Calculation section should be visible")
	public void the_Observed_Net_Pressure_Calculation_section_should_be_visible() {
		channelInputPage.verifyObservedNetPressureCalculationSectionVisible();
	}

	@When("the user enters data into the Smoothing number of Points field")
	public void the_user_enters_data_into_the_Smoothing_number_of_Points_field() {
		channelInputPage.enterDataIntoSmoothingNumberOfPointsField();
	}

	@When("the user enters data into the Smoothing number of Points field for Additive tab")
	public void the_user_enters_data_into_the_Smoothing_number_of_Points_field_for_Additive_tab() {
		channelInputPage.enterDataIntoSmoothingNumberForAdditiveTab();
	}

	@And("the user enters data into the number of Flowmeters field")
	public void the_user_enters_data_into_the_number_of_Flowmeters_field() {
		channelInputPage.enterDataIntoNumberOfFlowmetersField();
	}

	@And("the user enters data into the number of Densometers field")
	public void the_user_enters_data_into_the_number_of_Densometers_field() {
		channelInputPage.enterDataIntoNumberOfDensometersField();
	}

	@And("the user clicks the Save button")
	public void the_user_clicks_the_Save_button() {
		channelInputPage.clickElementSaveButton();
	}

	@Then("a success toast message should appear")
	public void a_success_toast_message_should_appear() {
		channelInputPage.verifySuccessToastMessage();
	}

	@And("the user verifies that entered data under Parameters section should be saved")
	public void the_entered_data_should_be_saved() {
		channelInputPage.verifyEnteredDataSaved();
	}

	@And("the user verifies that entered data should be saved for Additive Tab")
	public void the_entered_data_should_be_saved_Additive_tab() {
		channelInputPage.verifyEnteredDataSavedAdditivetab();
	}

	@When("the user clicks the Next button")
	public void the_user_clicks_the_Next_button() {
		channelInputPage.clickElementNextButton();
	}

	@Then("the Use User-defined Channels in Input Channel Selection checkbox should remain selected")
	public void the_Use_User_defined_Channels_in_Input_Channel_Selection_checkbox_should_remain_selected() {
		channelInputPage.verifyUseUserDefinedChannelsCheckboxSelected();
	}

	@And("the Smoothing number of Points field value should match the previously saved data")
	public void the_Smoothing_number_of_Points_field_value_should_match_the_previously_saved_data() {
		channelInputPage.verifySmoothingNumberOfPointsFieldValue();
	}

	@When("the user clicks on the Channel Inputs tab")
	public void the_user_clicks_on_the_Channel_Inputs_tab() {
		channelInputPage.clickElementChannelInputsTab();
	}

	@Then("the user clicks on dropdown in the Real-Time Channel Names column for Additional Display Channel one")
	public void the_user_clicks_on_dropdown_in_the_Real_Time_Channel_Names_column_for_Additional_Display_Channel_one() {
		channelInputPage.ClickUserDefinedChannelsDropdownSelection();
	}

	@Then("the user should be able to select User-defined Channels from the dropdown in the Real-Time Channel Names column for Additional Display Channel one")
	public void the_user_should_be_able_to_select_User_defined_Channels_from_the_dropdown_in_the_Real_Time_Channel_Names_column_for_Additional_Display_Channel_one() {
		channelInputPage.verifyUserDefinedChannelsDropdownSelection();
	}

	@Then("the selected channel for Additional Display Channel one should be saved")
	public void the_selected_channel_for_Additional_Display_Channel_one_should_be_saved() {
		channelInputPage.verifySelectedChannelSaved();
	}

	@When("the user clicks on the Measured Data button")
	public void the_user_clicks_on_the_Measured_Data_button() {
		channelInputPage.clickElementMeasuredDataButton();
	}

	@Then("the user should be directed to the Measured Data screen under Plots")
	public void the_user_should_be_directed_to_the_Measured_Data_screen_under_Plots() {
		channelInputPage.verifyRedirectionToMeasuredDataScreen();
	}

	@And("if no channel is selected for Additional Display Channel one then the corresponding Input Channel Unit should not be present for the same model")
	public void if_no_channel_is_selected_for_Additional_Display_Channel_1_then_the_corresponding_Input_Channel_Unit_should_not_be_present_for_the_same_model() {
		channelInputPage.verifyNoInputChannelUnitForModel();
	}

	@And("if Additional Display Channel one is selected then the corresponding Input Channel Unit for the same model must be displayed")
	public void if_Additional_Display_Channel_one_is_selected_then_the_corresponding_Input_Channel_Unit_for_the_same_model_must_be_displayed() {
		channelInputPage.verifyInputChannelUnitForModel();
	}

	@Given("User opens the Channel Input Application")
	public void user_opens_the_channel_input_application() {
		driver = DriverFactory.getDriver();
	}

	@And("User clickElements on Save button")
	public void user_clickElements_on_save_button() {
		channelInputPage.clickElementSaveButton();
	}

//	@Then("User should see the channel name {string} displayed in the channel list")
//	public void user_should_see_the_channel_name_displayed_in_the_channel_list(String channelName) {
//		channelInputPage.isChannelNameDisplayed(channelName);
//	}

	@When("User navigates to the Channel List page")
	public void user_navigates_to_the_channel_list_page() {
		channelInputPage.navigateToChannelListPage();
	}

	@Then("User should see the Channel List page title {string}")
	public void user_should_see_the_channel_list_page_title(String pageTitle) {
		Assert.assertEquals(channelInputPage.getPageTitle(), pageTitle);
	}

	@When("the user click on the utility tab")
	public void the_user_clicks_on_the_utility_tab() {
		channelInputPage.clickUtilityTab();
	}

	@And("then user click on the user-define Channel option")
	public void the_user_clicks_on_the_user_define_Channel_option() {
		channelInputPage.clickUserDefinedChannelOption();
	}

	@Then("user verifies the page header name")
	public void the_user_verifies_the_page_header_name() {
		channelInputPage.verifyPageHeaderNameUDC();
	}

	@And("the user verifies pad name from upper left corner")
	public void the_user_verifies_pad_name_from_upper_left_corner() {
		channelInputPage.verifyPadName();
	}

	@And("the user verifies Well name from upper left corner")
	public void the_user_verifies_Well_name_from_upper_left_corner() {
		channelInputPage.verifyWellName();
	}

	@When("the user enters Channel Name into the channel name input box in first row")
	public void the_user_enters_Channel_Name_into_first_row() {
		channelInputPage.enterChannelNameInFirstRow();
	}

	@And("the user select Unit types Rate Solid Additive from the Unit types dropdown in first row")
	public void the_user_selects_Rate_Solid_Additive_in_first_row() {
		channelInputPage.selectUnitTypeInFirstRow();
	}

	@Then("the user verifies in the units column the unit is auto selcted and its lbm per min for first row")
	public void the_user_verifies_lbm_per_min_in_first_row() {
		channelInputPage.verifyAutoSelectedUnitInFirstRow();
	}

	@And("the user enters foumula under the formula input box for first row")
	public void the_user_enters_formula_in_first_row() {
		channelInputPage.enterFormulaInFirstRow();
	}

	@Then("the user verifies that the user is getting the updated toast message")
	public void the_user_verifies_updated_toast_message() {
		channelInputPage.verifyUpdatedToastMessage();
	}

	@Then("the user verifies that the newly added First User Define Channel")
	public void the_user_verifies_first_user_defined_channel() {
		channelInputPage.verifyFirstUserDefinedChannel();
	}

	@When("the user enters Channel Name into the channel name input box in Second row")
	public void the_user_enters_Channel_Name_into_second_row() {
		channelInputPage.enterChannelNameInSecondRow();
	}

	@And("the user select Unit types Rate Liquid Additive from the Unit types dropdown in Second row")
	public void the_user_selects_Rate_Liquid_Additive_in_second_row() {
		channelInputPage.selectUnitTypeInSecondRow();
	}

	@Then("the user verifies in the units column the unit is auto selcted and its gal per min for Second row")
	public void the_user_verifies_gal_per_min_in_second_row() {
		channelInputPage.verifyAutoSelectedUnitInSecondRow();
	}

	@And("the user enters foumula under the formula input box for Second row")
	public void the_user_enters_formula_in_second_row() {
		channelInputPage.enterFormulaInSecondRow();
	}

	@Then("the user verifies that the newly added Second User Define Channel")
	public void the_user_verifies_second_user_defined_channel() {
		channelInputPage.verifySecondUserDefinedChannel();
	}

// Repeat the same pattern for rows 3 to 7 with respective values:

	@When("the user enters Channel Name into the channel name input box in Third row")
	public void the_user_enters_Channel_Name_into_third_row() {
		channelInputPage.enterChannelNameInThirdRow();
	}

	@And("the user select Unit types Rate CO2 from the Unit types dropdown in Third row")
	public void the_user_selects_Rate_CO2_in_third_row() {
		channelInputPage.selectUnitTypeInThirdRow();
	}

	@Then("the user verifies in the units column the unit is auto selcted and its bpm for Third row")
	public void the_user_verifies_bpm_in_third_row() {
		channelInputPage.verifyAutoSelectedUnitInThirdRow();
	}

	@And("the user enters foumula under the formula input box for Third row")
	public void the_user_enters_formula_in_third_row() {
		channelInputPage.enterFormulaInThirdRow();
	}

	@Then("the user verifies that the newly added Third User Define Channel")
	public void the_user_verifies_third_user_defined_channel() {
		channelInputPage.verifyThirdUserDefinedChannel();
	}

// Fourth Row
	@When("the user enters Channel Name into the channel name input box in Fourth row")
	public void the_user_enters_Channel_Name_into_fourth_row() {
		channelInputPage.enterChannelNameInFourthRow();
	}

	@And("the user select Unit types Rate Slurry per clean from the Unit types dropdown in Fourth row")
	public void the_user_selects_Rate_Slurry_per_clean_in_fourth_row() {
		channelInputPage.selectUnitTypeInFourthRow();
	}

	@Then("the user verifies in the units column the unit is auto selcted and its bpm for Fourth row")
	public void the_user_verifies_bpm_in_fourth_row() {
		channelInputPage.verifyAutoSelectedUnitInFourthRow();
	}

	@And("the user enters foumula under the formula input box for Fourth row")
	public void the_user_enters_formula_in_fourth_row() {
		channelInputPage.enterFormulaInFourthRow();
	}

	@Then("the user verifies that the newly added Fourth User Define Channel")
	public void the_user_verifies_fourth_user_defined_channel() {
		channelInputPage.verifyFourthUserDefinedChannel();
	}

// Fifth Row
	@When("the user enters Channel Name into the channel name input box in Fifth row")
	public void the_user_enters_Channel_Name_into_fifth_row() {
		channelInputPage.enterChannelNameInFifthRow();
	}

	@And("the user select Unit types Additive Volume concentration from the Unit types dropdown in Fifth row")
	public void the_user_selects_Additive_Volume_concentration_in_fifth_row() {
		channelInputPage.selectUnitTypeInFifthRow();
	}

	@Then("the user verifies in the units column the unit is auto selcted and its gal per Mgal for Fifth row")
	public void the_user_verifies_gal_per_mgal_in_fifth_row() {
		channelInputPage.verifyAutoSelectedUnitInFifthRow();
	}

	@And("the user enters foumula under the formula input box for Fifth row")
	public void the_user_enters_formula_in_fifth_row() {
		channelInputPage.enterFormulaInFifthRow();
	}

	@Then("the user verifies that the newly added Fifth user define channel")
	public void the_user_verifies_fifth_user_defined_channel() {
		channelInputPage.verifyFifthUserDefinedChannel();
	}

// Sixth Row (including delete & scientific calculator actions)
	@When("the user enters Channel Name into the channel name input box in Sixth row")
	public void the_user_enters_Channel_Name_into_sixth_row() {
		channelInputPage.enterChannelNameInSixthRow();
	}

	@And("the user select Unit types form the Unit types dropdown in Sixth row")
	public void the_user_selects_unit_type_in_sixth_row() {
		channelInputPage.selectUnitTypeInSixthRow();
	}

	@Then("the user verifies in the units column the unit is auto selcted when user select the unit type for Sixth row")
	public void the_user_verifies_unit_auto_selected_in_sixth_row() {
		channelInputPage.verifyUnitAutoSelectedInSixthRow();
	}

	@And("the user enters foumula under the formula input box for Sixth row")
	public void the_user_enters_formula_in_sixth_row() {
		channelInputPage.enterFormulaInSixthRow();
	}

	@Then("the user verifies that the newly added first user define channel")
	public void the_user_verifies_newly_added_first_udc_again() {
		channelInputPage.verifySixthUserDefinedChannel();
	}

	@And("the user delete the channel from first row")
	public void the_user_deletes_channel_in_sixth_row() {
		channelInputPage.deleteChannelInfirstRow();
	}

	@Then("the user get the Confirm Action popup")
	public void the_user_gets_confirm_action_popup() {
		channelInputPage.verifyConfirmPopup();
	}

	@And("the user select Yes delete option from Confirm Action popup")
	public void the_user_confirms_deletion() {
		channelInputPage.confirmDelete();
	}

	@And("the user verifies that user can drag the scientific calculator")
	public void the_user_verifies_scientific_calculator_draggable() {
		channelInputPage.verifyScientificCalculatorDraggable();
	}

	@And("user click on the formula input in sixth row")
	public void the_user_clicks_formula_input_in_sixth_row() {
		channelInputPage.clickFormulaInputInSixthRow();
	}

	@And("the user click on the Insert Channel Name from scientific calculator")
	public void the_user_clicks_insert_channel_name_from_calculator() {
		channelInputPage.clickInsertChannelFromCalculator();
	}

	@Then("user verifies that channel popup appers")
	public void the_user_verifies_channel_popup() {
		channelInputPage.verifyChannelPopupAppears();
	}

	@And("user selects channel type from channel type dropdown")
	public void the_user_selects_channel_type() {
		channelInputPage.selectChannelType();
	}

	@And("the user selects channel name from channel name dropdown")
	public void the_user_selects_channel_name() {
		channelInputPage.selectChannelName();
	}

	@And("the user click on the Insert button")
	public void the_user_clicks_insert_button() {
		channelInputPage.clickInsertButton();
	}

	@Then("user verifies that selected channel displayed in formula column")
	public void the_user_verifies_inserted_channel_in_formula() {
		channelInputPage.verifyInsertedChannelInFormula();
	}

// Seventh Row with error
	@When("the user enters Channel Name into the channel name input box in Seventh row")
	public void the_user_enters_Channel_Name_into_seventh_row() {
		channelInputPage.enterChannelNameInSeventhRow();
	}

	@And("the user select Unit types form the Unit types dropdown in Seventh row")
	public void the_user_selects_unit_type_in_seventh_row() {
		channelInputPage.selectUnitTypeInSeventhRow();
	}

	@Then("the user verifies in the units column the unit is auto selcted when user select the unit type for Seventh row")
	public void the_user_verifies_unit_auto_selected_in_seventh_row() {
		channelInputPage.verifyUnitAutoSelectedInSeventhRow();
	}

	@And("the user enters wrong foumula under the formula input box for Seventh row")
	public void the_user_enters_wrong_formula_in_seventh_row() {
		channelInputPage.enterInvalidFormulaInSeventhRow();
	}

	@Then("the user verifies that user is getting error massage")
	public void the_user_verifies_error_message() {
		channelInputPage.verifyFormulaErrorMessage();
	}

// Verifying column display rules
	@Then("the user verifies that Rate Solid Additive and Rate Liquid Additive displayed only in Additive Rate Channel column")
	public void the_user_verifies_rate_solid_additive_column() {
		channelInputPage.verifyUnitVisibilityInColumnAdditiveRateChannel();
	}

//	@And("the user verifies that Rate Liquid Additive option displayed only in Additive Rate Channel column")
//	public void the_user_verifies_rate_liquid_additive_column() {
//		channelInputPage.verifyUnitVisibilityInColumn();
//	}

	@And("the user verifies that Rate CO2 and Rate Slurry per clean option displayed only in Key Rate column")
	public void the_user_verifies_rate_co2_column() {
		channelInputPage.verifyUnitVisibilityInColumnKeyRate();
	}

//	@And("the user verifies that Rate Slurry per clean option displayed only in Key Rate column")
//	public void the_user_verifies_rate_slurry_column() {
//		channelInputPage.verifyUnitVisibilityInColumn();
//	}

	@And("the user verifies that Additive Volume concentration option displayed only in Additive Set Point column")
	public void the_user_verifies_additive_volume_concentration_column() {
		channelInputPage.verifyUnitVisibilityInColumnAddtiveSetPoint();
	}

	@And("the user clicks on the Cancel button")
	public void the_user_clicks_on_the_Cancel_button() {
		channelInputPage.clickCancelButtonOnChannelPopup();
	}

	@Then("the user verifies that selected channel is not added under Fourmula column")
	public void the_user_verifies_channel_not_added_under_formula_column() {
		channelInputPage.verifyChannelNotInsertedInFormula();
	}

	@And("the user clicks on the cross icon from the Channels popup")
	public void the_user_clicks_on_the_cross_icon_from_the_Channels_popup() {
		channelInputPage.clickCloseIconOnChannelPopup();
	}

	@And("the user clicks on the No button")
	public void the_user_clicks_on_the_No_button() {
		channelInputPage.clickNoButtonOnConfirmPopup();
	}

	@Then("the user verifies channel is not gets deleted from first row")
	public void the_user_verifies_channel_not_deleted_from_sixth_row() {
		channelInputPage.verifyChannelNotDeletedInSixthRow();
	}

	@And("the user clicks on the cross icon from Confirm Action popup")
	public void the_user_clicks_on_the_cross_icon_from_Confirm_Action_popup() {
		channelInputPage.clickCloseIconOnConfirmPopup();
	}
	
}