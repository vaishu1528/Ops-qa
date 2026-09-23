package com.FracProPlus.stepdefinitions;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.HeatTransferParametersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HeatTransferParameters extends DriverFactory {

	HeatTransferParametersPage heatTransferParametersPage = new HeatTransferParametersPage(driver);

	@When("the user clicks on the heat transfer parameters module")
	public void the_user_clicks_on_the_heat_transfer_parameters_module() {
		heatTransferParametersPage.clickElementHeatTransferParametersModule();
	}

	@Then("the page header of heat transfer parameters should be displayed")
	public void the_page_header_of_heat_transfer_parameters_should_be_displayed() {
		heatTransferParametersPage.isHeatTransferParametersPageHeaderDisplayed();
	}

	@Then("the Use Fracture center depth check box should be present")
	public void the_Use_Fracture_center_depth_check_box_should_be_present() {
		heatTransferParametersPage.isUseFractureCenterDepthCheckBoxPresent();
	}

	@Then("the Offshore Well check box should be present")
	public void the_Offshore_Well_check_box_should_be_present() {
		heatTransferParametersPage.isOffshoreWellCheckBoxPresent();
	}

	@Then("the Enter temperature vs Depth check box should be present")
	public void the_Enter_temperature_vs_Depth_check_box_should_be_present() {
		heatTransferParametersPage.isEnterTemperatureVsDepthCheckBoxPresent();
	}

	@Then("the default value in Surface Fluid Temperature field should be displayed")
	public void the_default_value_in_Surface_Fluid_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isSurfaceFluidTemperatureDefaultValueDisplayed();
	}

	@Then("the default value in Surface Proppant Temperature field should be displayed")
	public void the_default_value_in_Surface_Proppant_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isSurfaceProppantTemperatureDefaultValueDisplayed();
	}

	@Then("the default value in Surface N2 Temperature field should be displayed")
	public void the_default_value_in_Surface_N2_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isSurfaceN2TemperatureDefaultValueDisplayed();
	}

	@Then("the default value in Surface C02 Temperature field should be displayed")
	public void the_default_value_in_Surface_C02_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isSurfaceC02TemperatureDefaultValueDisplayed();
	}

	@Then("the default value in Surface Rock Temperature field should be displayed")
	public void the_default_value_in_Surface_Rock_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isSurfaceRockTemperatureDefaultValueDisplayed();
	}

	@Then("the default value in Reservoir Temperature at Frac Center Depth field should be displayed")
	public void the_default_value_in_Reservoir_Temperature_at_Frac_Center_Depth_field_should_be_displayed() {
		heatTransferParametersPage.isReservoirTemperatureAtFracCenterDepthDefaultValueDisplayed();
	}

	@Then("the default value in Display Temperature at field should be displayed")
	public void the_default_value_in_Display_Temperature_at_field_should_be_displayed() {
		heatTransferParametersPage.isDisplayTemperatureAtDefaultValueDisplayed();
	}

	@Then("the default value in Fracture Heat Transfer Coefficient Multiplier field should be displayed")
	public void the_default_value_in_Fracture_Heat_Transfer_Coefficient_Multiplier_field_should_be_displayed() {
		heatTransferParametersPage.isFractureHeatTransferCoefficientMultiplierDefaultValueDisplayed();
	}

	@Then("the default value in Wellbore Heat Transfer Coefficient Multiplier field should be displayed")
	public void the_default_value_in_Wellbore_Heat_Transfer_Coefficient_Multiplier_field_should_be_displayed() {
		heatTransferParametersPage.isWellboreHeatTransferCoefficientMultiplierDefaultValueDisplayed();
	}

	@When("the user clicks on the Offshore Well check box")
	public void the_user_clicks_on_the_Offshore_Well_check_box() {
		heatTransferParametersPage.clickElementOffshoreWellCheckBox();
	}

	@Then("the default value in Surface Water Temperature field should be displayed")
	public void the_default_value_in_Surface_Water_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isSurfaceWaterTemperatureDefaultValueDisplayed();
	}

	@Then("the default value in Seabed Temperature field should be displayed")
	public void the_default_value_in_Seabed_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isSeabedTemperatureDefaultValueDisplayed();
	}

	@Then("the default value in Water Depth field should be displayed")
	public void the_default_value_in_Water_Depth_field_should_be_displayed() {
		heatTransferParametersPage.isWaterDepthDefaultValueDisplayed();
	}

	@Then("the default value in Sea Current field should be displayed")
	public void the_default_value_in_Sea_Current_field_should_be_displayed() {
		heatTransferParametersPage.isSeaCurrentDefaultValueDisplayed();
	}

	@Then("the default value in Ocean or Wellbore Heat Transfer Coefficient Multiplier field should be displayed")
	public void the_default_value_in_Ocean_or_Wellbore_Heat_Transfer_Coefficient_Multiplier_field_should_be_displayed() {
		heatTransferParametersPage.isOceanOrWellboreHeatTransferCoefficientMultiplierDefaultValueDisplayed();
	}

	@Then("the Surface Rock Temperature field should be read only")
	public void the_Surface_Rock_Temperature_field_should_be_read_only() {
		heatTransferParametersPage.isSurfaceRockTemperatureFieldReadOnly();
	}

	@When("the user unchecks the Offshore Well check box")
	public void the_user_unchecks_the_Offshore_Well_check_box() {
		heatTransferParametersPage.uncheckOffshoreWellCheckBox();
	}

	@Then("the Surface Rock Temperature field should be editable")
	public void the_Surface_Rock_Temperature_field_should_be_editable() {
		heatTransferParametersPage.isSurfaceRockTemperatureFieldEditable();
	}

	@When("the user clicks on the Enter Temperature vs Depth check box")
	public void the_user_clicks_on_the_Enter_Temperature_vs_Depth_check_box() {
		heatTransferParametersPage.clickElementEnterTemperatureVsDepthCheckBox();
	}

	@Then("the table header name of Depth TVD field should be displayed")
	public void the_table_header_name_of_Depth_TVD_field_should_be_displayed() {
		heatTransferParametersPage.isDepthTVDTableHeaderDisplayed();
	}

	@Then("the table header name of Temperature field should be displayed")
	public void the_table_header_name_of_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isTemperatureTableHeaderDisplayed();
	}

	@When("the user unchecks the Enter Temperature vs Depth check box")
	public void the_user_unchecks_the_Enter_Temperature_vs_Depth_check_box() {
		heatTransferParametersPage.uncheckEnterTemperatureVsDepthCheckBox();
	}

	@Then("the Use Fracture Center Depth check box should be checked by default")
	public void the_Use_Fracture_Center_Depth_check_box_should_be_checked_by_default() {
		heatTransferParametersPage.isUseFractureCenterDepthCheckBoxCheckedByDefault();
	}

	@Then("the Display Temperature at field should be read only")
	public void the_Display_Temperature_at_field_should_be_read_only() {
		heatTransferParametersPage.isDisplayTemperatureAtFieldReadOnly();
	}

	@When("the user unchecks the Use Fracture Center Depth check box")
	public void the_user_unchecks_the_Use_Fracture_Center_Depth_check_box() {
		heatTransferParametersPage.uncheckUseFractureCenterDepthCheckBox();
	}

	@Then("the Display Temperature at field should be editable")
	public void the_Display_Temperature_at_field_should_be_editable() {
		heatTransferParametersPage.isDisplayTemperatureAtFieldEditable();
	}

	@When("the user enters the value into the Surface Fluid Temperature field")
	public void the_user_enters_the_value_into_the_Surface_Fluid_Temperature_field() {
		heatTransferParametersPage.enterSurfaceFluidTemperatureValue();
	}
	
	@When("the user enters the value into the Surface Fluid Temperature field for save and next")
	public void the_user_enters_the_value_into_the_Surface_Fluid_Temperature_fieldsn() {
		heatTransferParametersPage.enterSurfaceFluidTemperatureValue1();
	}


	@When("the user enters the value into the Surface Proppant Temperature field")
	public void the_user_enters_the_value_into_the_Surface_Proppant_Temperature_field() {
		heatTransferParametersPage.enterSurfaceProppantTemperatureValue();
	}

	@When("the user enters the value into the Surface N2 Temperature field")
	public void the_user_enters_the_value_into_the_Surface_N2_Temperature_field() {
		heatTransferParametersPage.enterSurfaceN2TemperatureValue();
	}

	@When("the user enters the value into the Surface C02 Temperature field")
	public void the_user_enters_the_value_into_the_Surface_C02_Temperature_field() {
		heatTransferParametersPage.enterSurfaceC02TemperatureValue();
	}

	@When("the user enters the value into the Surface Rock Temperature field")
	public void the_user_enters_the_value_into_the_Surface_Rock_Temperature_field() {
		heatTransferParametersPage.enterSurfaceRockTemperatureValue();
	}

	@When("the user enters the value into the Reservoir Temperature at Frac Center Depth field")
	public void the_user_enters_the_value_into_the_Reservoir_Temperature_at_Frac_Center_Depth_field() {
		heatTransferParametersPage.enterReservoirTemperatureAtFracCenterDepthValue();
	}

	@When("the user enters the value into the Display Temperature at field")
	public void the_user_enters_the_value_into_the_Display_Temperature_at_field() {
		heatTransferParametersPage.enterDisplayTemperatureAtValue();
	}

	@When("the user clicks the Use Fracture Center Depth check box for enable")
	public void the_user_clicks_the_Use_Fracture_Center_Depth_check_box_for_enable() {
		heatTransferParametersPage.clickElementUseFractureCenterDepthCheckBoxForEnable();
	}

	@When("the user enters the value into the Wellbore Heat Transfer Coefficient Multiplier field")
	public void the_user_enters_the_value_into_the_Wellbore_Heat_Transfer_Coefficient_Multiplier_field() {
		heatTransferParametersPage.enterWellboreHeatTransferCoefficientMultiplierValue();
	}

	@When("the user enters the value into the Fracture Heat Transfer Coefficient Multiplier field")
	public void the_user_enters_the_value_into_the_Fracture_Heat_Transfer_Coefficient_Multiplier_field() {
		heatTransferParametersPage.enterFractureHeatTransferCoefficientMultiplierValue();
	}

	@When("the user enters the value into the Water Depth field")
	public void the_user_enters_the_value_into_the_Water_Depth_field() {
		heatTransferParametersPage.enterWaterDepthValue();
	}

	@When("the user enters the value into the Surface Water Temperature field")
	public void the_user_enters_the_value_into_the_Surface_Water_Temperature_field() {
		heatTransferParametersPage.enterSurfaceWaterTemperatureValue();
	}

	@When("the user enters the value into the Seabed Temperature field")
	public void the_user_enters_the_value_into_the_Seabed_Temperature_field() {
		heatTransferParametersPage.enterSeabedTemperatureValue();
	}

	@When("the user enters the value into the Sea Current field")
	public void the_user_enters_the_value_into_the_Sea_Current_field() {
		heatTransferParametersPage.enterSeaCurrentValue();
	}

	@When("the user enters the value into the Ocean or Wellbore Heat Transfer Coefficient Multiplier field")
	public void the_user_enters_the_value_into_the_Ocean_or_Wellbore_Heat_Transfer_Coefficient_Multiplier_field() {
		heatTransferParametersPage.enterOceanOrWellboreHeatTransferCoefficientMultiplierValue();
	}

	@When("the user enters the value into the Depth TVD field")
	public void the_user_enters_the_value_into_the_Depth_TVD_field() {
		heatTransferParametersPage.enterDepthTVDValue();
	}

	@When("the user enters the value into the Temperature field")
	public void the_user_enters_the_value_into_the_Temperature_field() {
		heatTransferParametersPage.enterTemperatureValue();
	}

	@When("the user click on the save button")
	public void the_user_clicks_on_the_save_button() {
		heatTransferParametersPage.clickElementSaveButton();
	}

	@Then("the new entered value in Surface Fluid Temperature field should be displayed")
	public void the_new_entered_value_in_Surface_Fluid_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isNewSurfaceFluidTemperatureValueDisplayed();
	}

	@Then("the new entered value in Surface Proppant Temperature field should be displayed")
	public void the_new_entered_value_in_Surface_Proppant_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isNewSurfaceProppantTemperatureValueDisplayed();
	}

	@Then("the new entered value in Surface N2 Temperature field should be displayed")
	public void the_new_entered_value_in_Surface_N2_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isNewSurfaceN2TemperatureValueDisplayed();
	}

	@Then("the new entered value in Surface C02 Temperature field should be displayed")
	public void the_new_entered_value_in_Surface_C02_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isNewSurfaceC02TemperatureValueDisplayed();
	}

	@Then("the new entered value in Surface Rock Temperature field should be displayed")
	public void the_new_entered_value_in_Surface_Rock_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isNewSurfaceRockTemperatureValueDisplayed();
	}

	@Then("the new entered value in Reservoir Temperature at Frac Center Depth field should be displayed")
	public void the_new_entered_value_in_Reservoir_Temperature_at_Frac_Center_Depth_field_should_be_displayed() {
		heatTransferParametersPage.isNewReservoirTemperatureAtFracCenterDepthValueDisplayed();
	}

	@Then("the new entered value in Display Temperature at field should be displayed")
	public void the_new_entered_value_in_Display_Temperature_at_field_should_be_displayed() {
		heatTransferParametersPage.isNewDisplayTemperatureAtValueDisplayed();
	}

	@Then("the new entered value in Fracture Heat Transfer Coefficient Multiplier field should be displayed")
	public void the_new_entered_value_in_Fracture_Heat_Transfer_Coefficient_Multiplier_field_should_be_displayed() {
		heatTransferParametersPage.isNewFractureHeatTransferCoefficientMultiplierValueDisplayed();
	}

	@Then("the new entered value in Wellbore Heat Transfer Coefficient Multiplier field should be displayed")
	public void the_new_entered_value_in_Wellbore_Heat_Transfer_Coefficient_Multiplier_field_should_be_displayed() {
		heatTransferParametersPage.isNewWellboreHeatTransferCoefficientMultiplierValueDisplayed();
	}

	@Then("the new entered value in Surface Water Temperature field should be displayed")
	public void the_new_entered_value_in_Surface_Water_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isNewWellboreHeatTransferCoefficientMultiplierValueDisplayed();
	}

	@Then("the new entered value in Seabed Temperature field should be displayed")
	public void the_new_entered_value_in_Seabed_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isNewSeabedTemperaturefieldValueDisplayed();
	}

	@Then("the new entered value in Water Depth field should be displayed")
	public void the_new_entered_value_in_Water_Depth_field_should_be_displayed() {
		heatTransferParametersPage.isNewWaterDepthValueDisplayed();
	}

	@Then("the new entered value in Sea Current field should be displayed")
	public void the_new_entered_value_in_Sea_Current_field_should_be_displayed() {
		heatTransferParametersPage.isNewSerCurrentValueDisplayed();
	}

	@Then("the new entered value in Ocean or Wellbore Heat Transfer Coefficient Multiplier field should be displayed")
	public void the_new_entered_value_in_Ocean_or_Wellbore_Heat_Transfer_Coefficient_Multiplier_field_should_be_displayed() {
		heatTransferParametersPage.isNewOceanWellboreValueDisplayed();
	}

	@Then("the new entered value in Depth TVD field should be displayed")
	public void the_new_entered_value_in_Depth_TVD_field_should_be_displayed() {
		heatTransferParametersPage.isNewDepthTVDValueDisplayed();
	}

	@Then("the new entered value in Temperature field should be displayed")
	public void the_new_entered_value_in_Temperature_field_should_be_displayed() {
		heatTransferParametersPage.isNewTempratureValueDisplayed();
	}
}