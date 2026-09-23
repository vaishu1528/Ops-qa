package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.AddMaterialPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMaterial extends DriverFactory {

	AddMaterialPage AddMaterialPage = new AddMaterialPage(driver);

	@Given("the user is on the Home Screen")
//public void the_user_is_on_the_Home_Screen() {
//driver = DriverFactory.getDriver();
//}
//@Given("the user navigates and clicks on the pad from the home screen")
//public void the_user_navigates_and_clicks_on_the_pad_from_the_home_screen() {
//AddMaterialPage.navigateAndClickPadFromHomeScreen();
//}
//@When("the user clicks on the well from overview")
//public void the_user_clicks_on_the_well_from_overview() {
//AddMaterialPage.clickElementWellFromOverview();
//}

	@And("the user clicks on Material selection option")
	public void the_user_clicks_on_Material_selection_option() {
		AddMaterialPage.clickElementMaterialSelectionOption();
	}

	@And("the user clicks on the Proppant selection tab")
	public void the_user_clicks_on_the_Proppant_selection_tab() {
		AddMaterialPage.clickElementProppantSelectionTab();
	}

	@And("the user clicks on the Add New Proppant to List button")
	public void the_user_clicks_on_the_Add_New_Proppant_to_List_button() {
		AddMaterialPage.clickElementAddNewProppantToListButton();
	}

	@And("the user selects the first proppant from the table")
	public void the_user_selects_the_first_proppant_from_the_table() {
		AddMaterialPage.selectProppantFromTable();
	}

	@And("the user selects the Second proppant from the table")
	public void the_user_selects_the_Second_proppant_from_the_table() {
		AddMaterialPage.selectSecondProppantFromTable();
	}

	@And("the user selects the Third proppant from the table")
	public void the_user_selects_the_Third_proppant_from_the_table() {
		AddMaterialPage.selectThirdProppantFromTable();
	}

	@And("the user selects the Fourth proppant from the table")
	public void the_user_selects_the_Fourth_proppant_from_the_table() {
		AddMaterialPage.selectFourthProppantFromTable();
	}

	@And("the user clicks on the add button")
	public void the_user_clicks_on_the_add_button() {
		AddMaterialPage.clickElementAddButton();
	}

	@And("the user clicks on the add button First Fluid")
	public void the_user_clicks_on_the_add_button_First_Fluid() {
		AddMaterialPage.clickElementAddButtonFirstFluid();
	}

	@And("the user clicks on the add button Second Fluid")
	public void the_user_clicks_on_the_add_button_Second_Fluid() {
		AddMaterialPage.clickElementAddButtonSecondFluid();
	}

	@And("the user clicks on the add button Third Fluid")
	public void the_user_clicks_on_the_add_button_Third_Fluid() {
		AddMaterialPage.clickElementAddButtonThirdFluid();
	}

	@And("the user clicks on the add button Fourth Fluid")
	public void the_user_clicks_on_the_add_button_Fourth_Fluid() {
		AddMaterialPage.clickElementAddButtonFourthFluid();
	}

	@Then("the user verifies that the user is getting the success toast message")
	public void the_user_verifies_that_the_user_is_getting_the_success_toast_message() {
		AddMaterialPage.isSuccessToastMessageDisplayed();
	}

	@And("the user verifies that selected proppant is added to the list or not")
	public void the_user_verifies_that_selected_proppant_is_added_to_the_list_or_not() {
		AddMaterialPage.isProppantAddedToList();
	}

	@When("the user clicks on the fluid selection tab")
	public void the_user_clicks_on_the_fluid_selection_tab() {
		AddMaterialPage.clickElementFluidSelectionTab();
	}

	@When("the user clicks on the Chemical selection tab")
	public void the_user_clicks_on_the_Chemical_selection_tab() {
		AddMaterialPage.clickElementChemicalSelectionTab();
	}

	@And("the user enters the Chemical name in Chemical Name column")
	public void the_user_enters_the_Chemical_name_in_Chemical_Name_column() {
		AddMaterialPage.EntersChemicalName();
	}

	@And("the user enters second Chemical name in Chemical Name column")
	public void the_user_enters_second_Chemical_name_in_Chemical_Name_column() {
//		AddMaterialPage.rightClickAndInsertRowBelowFirst();
		AddMaterialPage.EnterssecondChemicalName();
	}

	@And("the user enters Third Chemical name in Chemical Name column")
	public void the_user_enters_Third_Chemical_name_in_Chemical_Name_column() {
		AddMaterialPage.EntersThirdChemicalName();
	}

	@And("the user enters Fourth Chemical name in Chemical Name column")
	public void the_user_enters_Fourth_Chemical_name_in_Chemical_Name_column() {
		AddMaterialPage.EntersFourthChemicalName();
	}

	@And("the user selects the Channel from Additive Rate Channel column")
	public void the_user_selects_the_Channel_from_Additive_Rate_Channel_column() {
		AddMaterialPage.selectAdditiveRateChannel();
	}

	@And("the user selects the second Channel from Additive Rate Channel column")
	public void the_user_selects_the_second_Channel_from_Additive_Rate_Channel_column() {
		AddMaterialPage.selectsecondAdditiveRateChannel();
	}

	@And("the user selects the Third Channel from Additive Rate Channel column")
	public void the_user_selects_the_Third_Channel_from_Additive_Rate_Channel_column() {
		AddMaterialPage.selectThirdAdditiveRateChannel();
	}

	@And("the user selects the Fourth Channel from Additive Rate Channel column")
	public void the_user_selects_the_Fourth_Channel_from_Additive_Rate_Channel_column() {
		AddMaterialPage.selectFourthAdditiveRateChannel();
	}

	@And("the user selectes unit from the unit column")
	public void the_user_selectes_unit_form_the_unit_column() {
		AddMaterialPage.selectUnitColumn();
	}

	@And("the user selectes unit For Second Chemical from the unit column")
	public void the_user_selectes_For_Second_Chemical_unit_form_the_unit_column() {
		AddMaterialPage.selectSecondUnitColumn();
	}

	@And("the user selectes unit For Third Chemical from the unit column")
	public void the_user_selectes_unit_For_Third_Chemical_form_the_unit_column() {
		AddMaterialPage.selectThirdUnitColumn();
	}

	@And("the user selectes unit For Fourth Chemical from the unit column")
	public void the_user_selectes_unit_For_Fourth_Chemical_form_the_unit_column() {
		AddMaterialPage.selectFourthUnitColumn();
	}

	@And("the user selects type from the type column")
	public void the_user_selects_type_from_the_type_column() {
		AddMaterialPage.selectTypeColumn();
	}

	@And("the user selects second type from the type column")
	public void the_user_selects_second_type_from_the_type_column() {
		AddMaterialPage.selectSecondTypeColumn();
	}

	@And("the user selects Third type from the type column")
	public void the_user_selects_Third_type_from_the_type_column() {
		AddMaterialPage.selectThirdTypeColumn();
	}

	@And("the user selects Fourth type from the type column")
	public void the_user_selects_Fourth_type_from_the_type_column() {
		AddMaterialPage.selectFourthTypeColumn();
	}

	@And("the user clicks on the add new fluid to list button")
	public void the_user_clicks_on_the_add_new_fluid_to_list_button() {
		AddMaterialPage.clickElementAddNewFluidToListButton();
	}

	@And("the user clicks on the add new Chemical to list button")
	public void the_user_clicks_on_the_add_new_Chemical_to_list_button() {
		AddMaterialPage.clickElementAddNewChemicalToListButton();
	}

	@And("the user selects the fluid from the table")
	public void the_user_selects_the_fluid_from_the_table() {
		AddMaterialPage.selectFluidFromTable();
	}

	@And("the user selects the Second fluid from the table")
	public void the_user_selects_the_Second_fluid_from_the_table() {
		AddMaterialPage.selectSecondFluidFromTable();
	}

	@And("the user selects the Third fluid from the table")
	public void the_user_selects_the_Third_fluid_from_the_table() {
		AddMaterialPage.selectThirdFluidFromTable();
	}

	@And("the user selects the Fourth fluid from the table")
	public void the_user_selects_the_Fourth_fluid_from_the_table() {
		AddMaterialPage.selectFourthFluidFromTable();
	}

	@And("the user selects the Chemical from the table")
	public void the_user_selects_the_Chemical_from_the_table() {
		AddMaterialPage.selectChemicalFromTable();
	}

	@Then("the user verifies that selected fluid is added to the list or not")
	public void the_user_verifies_that_selected_fluid_is_added_to_the_list_or_not() {
		AddMaterialPage.isFluidAddedToList();
	}

	@Then("the user verifies that selected Chemical is added to the list or not")
	public void the_user_verifies_that_selected_Chemical_is_added_to_the_list_or_not() {
		AddMaterialPage.isChemicalAddedToList();
	}

	@Given("User is on the Add Proppant and Fluid page")
	public void user_is_on_the_add_proppant_and_fluid_page() {
		AddMaterialPage.navigateToAddProppantAndFluidPage();
	}

	@When("User selects a proppant type")
	public void user_selects_a_proppant_type() {
		AddMaterialPage.selectProppantType();
	}

	@And("User enters the proppant amount")
	public void user_enters_the_proppant_amount() {
		AddMaterialPage.enterProppantAmount();
	}

	@And("User selects a fluid type")
	public void user_selects_a_fluid_type() {
		AddMaterialPage.selectFluidType();
	}

	@And("User enters the fluid amount")
	public void user_enters_the_fluid_amount() {
		AddMaterialPage.enterFluidAmount();
	}

	@And("the user clicks on the save button for add material screen")
	public void user_clickElements_on_the_save_button() {
		AddMaterialPage.clickElementSaveButton();
	}

	@Then("The proppant and fluid details should be saved successfully")
	public void the_proppant_and_fluid_details_should_be_saved_successfully() {
		AddMaterialPage.isProppantAndFluidDetailsSaved();
	}
}