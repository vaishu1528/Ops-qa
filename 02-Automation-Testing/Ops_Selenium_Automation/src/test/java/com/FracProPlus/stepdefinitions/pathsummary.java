package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.PathsummaryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pathsummary extends DriverFactory {
	PathsummaryPage pathsummaryPage = new PathsummaryPage(driver);

//	@Then("the page header name should be verified")
//	public void the_page_header_name_should_be_verified() {
//		pathsummaryPage.verifyPageHeaderName();
//	}

	@When("the user clicks on the path summary tab")
	public void the_user_clicks_on_the_path_summary_tab() {
		pathsummaryPage.clickElementPathSummaryTab();
	}
	
	@When("verify the header names in the path summary tab")
	public void PathSummaryPageHeader() {
		pathsummaryPage.verifyTabHeaderNamesUnderPathSummaryTab();
	}
	
	@When("verify the first row table header data in path summary tab")
	public void firstRowPathSummary() {
		pathsummaryPage.verifyTabHeaderNamesUnderPathSummaryTab();
	}
	
	@When("verify the second row table header data in path summary tab")
	public void secondRowPathSummary() {
		pathsummaryPage.verifySecondRowValuesUnderPathSummaryTab();
	}
	
	@When("verify the third row table header data in path summary tab")
	public void thirdRowPathSummary() {
		pathsummaryPage.verifyThirdRowValuesUnderPathSummaryTab();
	}

	@Then("the table header under path summary tab should be verified")
	public void the_table_header_under_path_summary_tab_should_be_verified() throws InterruptedException {
		pathsummaryPage.verifyFirstRowValuesUnderPathSummaryTab();
	}

	@And("the values present in the table under path summary tab should be verified")
	public void the_values_present_in_the_table_under_path_summary_tab_should_be_verified() {
		pathsummaryPage.verifyValuesInTableUnderPathSummaryTab();
	}

	@And("the behavior of the row should be read only")
	public void the_behavior_of_the_row_should_be_read_only() {
		pathsummaryPage.verifyRowReadOnlyBehavior();
	}

	@And("the frac string volume field should be disabled")
	public void the_frac_string_volume_field_should_be_disabled() {
		pathsummaryPage.isFracStringVolumeFieldEnabled();
	}

	@When("the user clicks on the frac string partly full radio button")
	public void the_user_clicks_on_the_frac_string_partly_full_radio_button() {
		pathsummaryPage.clickElementFracStringPartlyFullRadioButton();
	}

	@Then("the frac string volume field should be enabled")
	public void the_frac_string_volume_field_should_be_enabled() {
		pathsummaryPage.isFracStringVolumeFieldEnabled();
	}

	@And("the field names present in bottom right card in path summary tab should be verified")
	public void the_field_names_present_in_bottom_right_card_in_path_summary_tab_should_be_verified() {
		pathsummaryPage.verifyFieldNamesInBottomRightCard();
	}

	@When("the user clicks on the frac string full radio button")
	public void the_user_clicks_on_the_frac_string_full_radio_button() {
		pathsummaryPage.clickElementFracStringFullRadioButton();
	}

	@Then("the frac string volume field should be read only")
	public void the_frac_string_volume_field_should_be_read_only() {
		pathsummaryPage.isFracStringVolumeFieldEnabled();
	}

	@When("the user clicks on the frac string partly full radio button again")
	public void the_user_clicks_on_the_frac_string_partly_full_radio_button_again() {
		pathsummaryPage.clickElementFracStringPartlyFullRadioButton();
	}

	@And("the user enters the data into the frac string volume field")
	public void the_user_enters_the_data_into_the_frac_string_volume_field() {
		pathsummaryPage.enterDataIntoFracStringVolumeField();
	}

	@And("the user enters the data into flush above top perf field")
	public void the_user_enters_the_data_into_flush_above_top_perf_field() {
		pathsummaryPage.enterDataIntoFlushAboveTopPerfField();
	}
	
	@When("the user clicks on the recalculate button")
	public void the_user_clicks_on_the_recalculate_button() {
		pathsummaryPage.clickElementRecalculateButton();
	}

	@Then("the user should remain on the same screen")
	public void the_user_should_remain_on_the_same_screen() {
		pathsummaryPage.verifyTableHeaderUnderPathSummaryTab();
	}

	@When("the user clicks on the Injection is down dropdown")
	public void the_user_clicks_on_the_injection_is_down_dropdown() {
		pathsummaryPage.clickElementInjectionIsDownDropdown();
	}

	@Then("the default value should be casing")
	public void the_default_value_should_be_casing() {
		pathsummaryPage.verifyDefaultValueIsCasing();
	}
	
	@Then("the total frac string volume field should be readonly")
	public void the_total_frac_string_volume_field_should_be_readonly() {
		pathsummaryPage.isTotalFracStringVolumeFieldEnabled();
	}
	
	@Then("the flush volume field should be readonly")
	public void the_flush_volume_field_should_be_readonly() {
		pathsummaryPage.isFlushVolumeFieldEnabled();
	}

	@Then("the Frac String Volume field should be readonly")
	public void the_Frac_String_Volume_field_should_be_readonly() {
		pathsummaryPage.isFracStringVolumeFieldEnabledInputField();
	}
	
	@When("the user selects tubing and annulus option from injection is down dropdown")
	public void the_user_selects_tubing_and_annulus_option_from_injection_is_down_dropdown() {
		pathsummaryPage.selectTubingAndAnnulusOption();
	}

	@Then("the two radio buttons common manifold and isolated should be enabled and user can click any one")
	public void the_two_radio_buttons_common_manifold_and_isolated_should_be_enabled_and_user_can_click_any_one() {
		pathsummaryPage.verifyCommonManifoldAndIsolatedRadioButtonsEnabled();
	}

	@And("the use bottom hole check box should be enabled by default")
	public void the_use_bottom_hole_check_box_should_be_enabled_by_default() {
		pathsummaryPage.verifyUseBottomHoleCheckBoxEnabledByDefault();
	}

	@And("the MD for well transit time field should be read only if the use bottom hole check box is checked")
	public void the_md_for_well_transit_time_field_should_be_read_only_if_the_use_bottom_hole_check_box_is_checked() {
		pathsummaryPage.isMDForWellTransitTimeFieldEnabled();
	}

	@When("the user unchecks the use bottom hole check box")
	public void the_user_unchecks_the_use_bottom_hole_check_box() {
		pathsummaryPage.uncheckUseBottomHoleCheckBox();
	}

	@Then("the MD for well transit time field should be enabled only if the use bottom hole check box is unchecked and user should enter the value on it")
	public void the_md_for_well_transit_time_field_should_be_enabled_only_if_the_use_bottom_hole_check_box_is_unchecked_and_user_should_enter_the_value_on_it() {
		pathsummaryPage.enterValueMDForWellTransitTimeField();
	}

	@Then("the new entered data in all the fields should persist")
	public void the_new_entered_data_in_all_the_fields_should_persist() {
		pathsummaryPage.verifyNewEnteredDataPersists();
	}
}