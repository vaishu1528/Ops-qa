package com.FracProPlus.stepdefinitions;

import com.FracProPlus.utils.CommonUtils;
import com.FracProPlus.utils.ElementUtils;
import org.testng.Assert;
import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.CreatePadAndWellPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePadAndWell extends DriverFactory {
	CreatePadAndWellPage createPadAndWellPage = new CreatePadAndWellPage(driver);

	@Given("the user is on the Dashboard Page")
	public void the_user_is_on_the_Dashboard_Page() {
		createPadAndWellPage.navigateToDashboardPage();
	}

	@Then("the title should be displayed correctly")
	public void the_title_should_be_displayed_correctly() {
		createPadAndWellPage.isTitleDisplayedCorrectly();
	}
	@Then("user verifies the FracPro Core+ card is displayed")
	public void verify_fracpro_core_plus_card_displayed() {
	    createPadAndWellPage.isFracProCorePlusCardDisplayed();
	}

	@Then("user verifies the FracPro Live+ card is displayed")
	public void verify_fracpro_live_plus_card_displayed() {
	    createPadAndWellPage.isFracProLivePlusCardDisplayed();
	}

	@Then("user verifies the FracPro AI card is displayed")
	public void verify_fracpro_ai_card_displayed() {
	    createPadAndWellPage.isFracProAICardDisplayed();
	}

	@Then("user verifies the XOPS card is displayed")
	public void verify_xops_card_displayed() {
	    createPadAndWellPage.isXOPSCardDisplayed();
	}

	@Then("user verifies the FracPro Live X card is displayed")
	public void verify_fracpro_live_x_card_displayed() {
	    createPadAndWellPage.isFracProLiveXCardDisplayed();
	}

	@Then("user verifies the StimPro card is displayed")
	public void verify_stimpro_card_displayed() {
	    createPadAndWellPage.isStimProCardDisplayed();
	}

	@Then("User click on Continue button from the Fracpro live plus card")
	public void click_continue_from_fracpro_live_plus_card() {
	    createPadAndWellPage.clickFracProLiveContinueButton();
	}


	@And("the user click on the go to application under the FracPro Live card")
	public void the_user_click_on_the_go_to_application_under_the_FracPro_Live_card() {
//		CommonUtils.dismissChromePasswordPopup();
		createPadAndWellPage.clickongotoapplication();
	}

	@And("the user click on the all button")
	public void the_user_click_on_the_all_button() {
		createPadAndWellPage.clickonalloption();
	}

	@And("user clicks on the Add New Pad button")
	public void user_clicks_on_the_Add_New_Pad_button() {
		createPadAndWellPage.clickonaddnewpadbutton();
	}

	@Then("User verifies that after clicking out side the pad name textbox user is getting the error massage")
	public void user_verifies_that_after_clicking_out_side_the_pad_name_textbox_user_is_getting_the_error_massage() {
		createPadAndWellPage.VerifyPadNameError();
	}

	@Then("User verifies that after clicking out side the Field Name textbox user is getting the error massage")
	public void user_verifies_that_after_clicking_out_side_the_Field_Name_textbox_user_is_getting_the_error_massage() {
		createPadAndWellPage.VerifyFieldNameError();
	}

	@Then("User verifies that after clicking out side the Well Name textbox user is getting the error massage")
	public void user_verifies_that_after_clicking_out_side_the_Well_Name_textbox_user_is_getting_the_error_massage() {
		createPadAndWellPage.VerifyWellNameError();
	}

	@Then("User verifies that after clicking out side the Well API textbox user is getting the error massage")
	public void user_verifies_that_after_clicking_out_side_the_Well_API_textbox_user_is_getting_the_error_massage() {
		createPadAndWellPage.VerifyWellAPIError();
	}

	@Then("Verify error message when API length is invalid")
	public void verify_error_message_when_API_length_is_invalid() {
		createPadAndWellPage.VerifyWellAPIlengthError();
	}

	@When("user enters Pad Name under the Pad Name testbox")
	public void user_enters_Pad_Name_under_the_Pad_Name_testbox() {
		createPadAndWellPage.EnterPadname();
	}

	@Then("user enters Field Name under the Field Name testbox")
	public void user_enters_Field_Name_under_the_Field_Name_testbox() {
		createPadAndWellPage.EnterFieldname();
	}

	@And("user enters Well Name under the Well Name testbox")
	public void user_enters_Well_Name_under_the_Well_Name_testbox() {
		createPadAndWellPage.enterWellName();
	}

	@And("user enters Well API under the Well API testbox")
	public void user_enters_Well_API_under_the_Well_API_testbox() {
		createPadAndWellPage.enterWellAPI();
	}

	@And("user selects dropdown value from the Company Name dropdown")
	public void user_selects_dropdown_value_from_the_Company_Name_dropdown() {
		createPadAndWellPage.selectCompanyName();
	}

	@And("user enters Company Representative under the Company Representative testbox")
	public void user_enters_Company_Representative_under_the_Company_Representative_testbox() {
		createPadAndWellPage.enterCompanyRepresentative();
	}

	@And("user enters Service Company Rep under the Service Company Rep testbox")
	public void user_enters_Service_Company_Rep_under_the_Service_Company_Rep_testbox() {
		createPadAndWellPage.enterServiceCompanyRep();
	}

	@And("user selects dropdown value from the Service Company Name dropdown")
	public void user_selects_dropdown_value_from_the_Service_Company_Name_dropdown() {
		createPadAndWellPage.selectServiceCompanyName();
	}

	@And("user enters Treatment Analyst under the Treatment Analyst testbox")
	public void user_enters_Treatment_Analyst_under_the_Treatment_Analyst_testbox() {
		createPadAndWellPage.enterTreatmentAnalyst();
	}

	@And("user enters Latitude under the Latitude testbox")
	public void user_enters_Latitude_under_the_Latitude_testbox() {
		createPadAndWellPage.enterLatitude();
	}
	
	@And("user need to click on the location tab")
	public void user_need_to_click_on_the_location_tab() {
		createPadAndWellPage.clickonlocation();
	}
	
	@And("user need to click on the Additional Info tab")
	public void user_need_to_click_on_the_Additional_Info_tab() {
		createPadAndWellPage.clickonAdditionalInfotab();
	}

	@And("user enters Longtitude under the Longtitude testbox")
	public void user_enters_Longtitude_under_the_Langtitude_testbox() {
		createPadAndWellPage.enterLongitude();
	}

	@And("user enters Elevation under the Elevation testbox")
	public void user_enters_Elevation_under_the_Elevation_testbox() {
		createPadAndWellPage.enterElevation();
	}

	@And("user enters KB under the KB testbox")
	public void user_enters_KB_under_the_KB_testbox() {
		createPadAndWellPage.enterKB();
	}

	@And("user enters Zipper Group under the Zipper Group testbox")
	public void user_enters_Zipper_Group_under_the_Zipper_Group_testbox() {
		createPadAndWellPage.enterZipperGroup();
	}

	@And("user enters Landing Point under the Landing Point testbox")
	public void user_enters_Landing_Point_under_the_Landing_Point_testbox() {
		createPadAndWellPage.enterLandingPoint();
	}

	@And("user enters Fleet under the Fleet testbox")
	public void user_enters_Fleet_under_the_Fleet_testbox() {
		createPadAndWellPage.enterFleet();
	}

	@And("user enters Well Tag under the Well Tag testbox")
	public void user_enters_Well_Tag_under_the_Well_Tag_testbox() {
		createPadAndWellPage.enterWellTag();
	}

	@And("user enters AFE under the AFE testbox")
	public void user_enters_AFE_under_the_AFE_testbox() {
		createPadAndWellPage.enterAFE();
	}

	@And("user clicks on the Save button")
	public void user_clicks_on_the_Save_button() {
		createPadAndWellPage.clickSaveButton();
	}
	
	@And("user verifies the Pad name and Well Name for top left corner")
	public void user_verifies_the_Pad_name_and_Well_Name_for_top_left_corner() {
		createPadAndWellPage.VerifyPadandwellname();
	}
	
	@And("the user verifies that the user is getting the Saved toast message")
	public void the_user_verifies_that_the_user_is_getting_the_Saved_toast_message() {
		createPadAndWellPage.isSavedToastMessageDisplayed();
	}

	@And("user click Fracpro Plus icon")
	public void user_click_Fracpro_Plus_icon() {
		createPadAndWellPage.clickLogo();
	}
	
	@And("user click Fracpro Plus icon again")
	public void user_click_Fracpro_Plus_icon_again() {
		createPadAndWellPage.clickLogo2();
	}
	
	@And("user click Fracpro Plus icon for Well and Treatment screen")
	public void user_click_Fracpro_Plus_icon_for_Well_and_Treatment_screen() {
		createPadAndWellPage.clickFracproplusiconWellandTretment();
	}

	@Then("user verifies that saved pad added under the pad list on the home page")
	public void user_verifies_that_saved_pad_added_under_the_pad_list_on_the_home_page() {
		createPadAndWellPage.verifythePadName();

	}
	
	
	@Then("user find the pad from search bar")
	public void user_find_the_pad_from_search_bar() {
		createPadAndWellPage.SearchPadBySearchbar();

	}
	
}
