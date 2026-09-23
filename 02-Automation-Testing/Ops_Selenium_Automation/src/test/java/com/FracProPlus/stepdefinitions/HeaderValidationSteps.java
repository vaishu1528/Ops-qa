//package com.FracProPlus.stepdefinitions;
//import io.cucumber.java.en.*;
//import static org.junit.Assert.*;
//
//import com.fracproplus.pages.*;
//import org.openqa.selenium.WebDriver;
//
//
//public class HeaderValidationSteps {
//	
//	
//	
//
//	
//	
//
//	    WebDriver driver = Hooks.driver; // Assuming WebDriver is initialized in Hooks
//	    LoginPage loginPage = new LoginPage(driver);
//	    DashboardPage dashboardPage = new DashboardPage(driver);
//	    LivePlusAppPage livePlusAppPage = new LivePlusAppPage(driver);
//	    InputScreenPage inputScreenPage = new InputScreenPage(driver);
//	    PadWellPage padWellPage = new PadWellPage(driver);
//	    VersionControlPage versionControlPage = new VersionControlPage(driver);
//	    PlotPage plotPage = new PlotPage(driver);
//	    ReportsPage reportsPage = new ReportsPage(driver);
//	    UserDefinedChannelPage udcPage = new UserDefinedChannelPage(driver);
//
//	    String updatedPadName, updatedWellName, updatedVersion, updatedStage;
//
//	    @Given("the user logs into the application")
//	    public void the_user_logs_into_the_application() {
//	        loginPage.loginWithValidCredentials();
//	    }
//
//	    @And("the user clicks on the Live+ application card")
//	    public void the_user_clicks_on_the_Live_plus_application_card() {
//	        dashboardPage.clickLivePlusCard();
//	    }
//
//	    @And("the user selects a well from the list")
//	    public void the_user_selects_a_well_from_the_list() {
//	        livePlusAppPage.selectFirstWell();
//	    }
//
//	    @When("the user navigates to any input screen from the side menu")
//	    public void the_user_navigates_to_any_input_screen_from_side_menu() {
//	        dashboardPage.navigateToInputScreen();
//	    }
//
//	    @Then("the respective screen should be displayed")
//	    public void the_respective_screen_should_be_displayed() {
//	        assertTrue(inputScreenPage.isInputScreenDisplayed());
//	    }
//
//	    @When("the user navigates to any input screen")
//	    public void the_user_navigates_to_any_input_screen() {
//	        dashboardPage.navigateToInputScreen();
//	    }
//
//	    @Then("the current Pad name should be displayed in the header")
//	    public void the_current_pad_name_should_be_displayed_in_the_header() {
//	        assertNotNull(inputScreenPage.getPadNameFromHeader());
//	    }
//
//	    @When("the user changes the Pad name from the Pad and Well screen")
//	    public void the_user_changes_pad_name() {
//	        dashboardPage.navigateToPadWellScreen();
//	        updatedPadName = padWellPage.changePadName();
//	    }
//
//	    @Then("the updated Pad name should reflect in the header")
//	    public void the_updated_pad_name_should_reflect_in_header() {
//	        assertEquals(updatedPadName, inputScreenPage.getPadNameFromHeader());
//	    }
//
//	    @Then("the current Well name should be displayed in the header")
//	    public void the_current_well_name_should_be_displayed() {
//	        assertNotNull(inputScreenPage.getWellNameFromHeader());
//	    }
//
//	    @When("the user changes the Well name from the Pad and Well screen")
//	    public void the_user_changes_well_name() {
//	        dashboardPage.navigateToPadWellScreen();
//	        updatedWellName = padWellPage.changeWellName();
//	    }
//
//	    @Then("the updated Well name should reflect in the header")
//	    public void the_updated_well_name_should_reflect_in_header() {
//	        assertEquals(updatedWellName, inputScreenPage.getWellNameFromHeader());
//	    }
//
//	    @Then("the current Version name should be displayed in the header")
//	    public void the_current_version_name_should_be_displayed() {
//	        assertNotNull(inputScreenPage.getVersionNameFromHeader());
//	    }
//
//	    @When("the user changes the Version from the Version screen")
//	    public void the_user_changes_version() {
//	        dashboardPage.navigateToVersionScreen();
//	        updatedVersion = versionControlPage.changeVersionName();
//	    }
//
//	    @Then("the updated Version name should reflect in the header")
//	    public void the_updated_version_name_should_reflect_in_header() {
//	        assertEquals(updatedVersion, inputScreenPage.getVersionNameFromHeader());
//	    }
//
//	    @Then("the current Stage name should be displayed in the header")
//	    public void the_current_stage_name_should_be_displayed() {
//	        assertNotNull(inputScreenPage.getStageNameFromHeader());
//	    }
//
//	    @When("the user changes the Stage from the Version screen")
//	    public void the_user_changes_stage() {
//	        dashboardPage.navigateToVersionScreen();
//	        updatedStage = versionControlPage.changeStageName();
//	    }
//
//	    @Then("the updated Stage name should reflect in the header")
//	    public void the_updated_stage_name_should_reflect_in_header() {
//	        assertEquals(updatedStage, inputScreenPage.getStageNameFromHeader());
//	    }
//
//	    @And("the user revisits the screen")
//	    public void the_user_revisits_the_screen() {
//	        dashboardPage.navigateToDashboard();
//	        dashboardPage.navigateToInputScreen();
//	    }
//
//	    @Then("the updated Stage name should persist")
//	    public void the_updated_stage_name_should_persist() {
//	        assertEquals(updatedStage, inputScreenPage.getStageNameFromHeader());
//	    }
//
//	    // Scenario Outline dynamic steps
//	    @When("the user navigates to the {string} screen")
//	    public void the_user_navigates_to_screen(String screen) {
//	        dashboardPage.navigateToScreen(screen);
//	    }
//
//	    @When("the user changes the Pad from the {string}")
//	    public void the_user_changes_pad_from(String source) {
//	        dashboardPage.navigateToScreen(source);
//	        updatedPadName = padWellPage.changePadName();
//	    }
//
//	    @When("the user changes the Well from the {string}")
//	    public void the_user_changes_well_from(String source) {
//	        dashboardPage.navigateToScreen(source);
//	        updatedWellName = padWellPage.changeWellName();
//	    }
//
//	    @When("the user changes the Version from the {string}")
//	    public void the_user_changes_version_from(String source) {
//	        dashboardPage.navigateToScreen(source);
//	        updatedVersion = versionControlPage.changeVersionName();
//	    }
//
//	    @When("the user changes the Stage from the {string}")
//	    public void the_user_changes_stage_from(String source) {
//	        dashboardPage.navigateToScreen(source);
//	        updatedStage = versionControlPage.changeStageName();
//	    }
//
//	    @Then("the updated Pad name should persist")
//	    public void the_updated_pad_name_should_persist() {
//	        assertEquals(updatedPadName, dashboardPage.getCurrentPadName());
//	    }
//
//	    @Then("the updated Well name should persist")
//	    public void the_updated_well_name_should_persist() {
//	        assertEquals(updatedWellName, dashboardPage.getCurrentWellName());
//	    }
//
//	    @Then("the updated Version name should persist")
//	    public void the_updated_version_name_should_persist() {
//	        assertEquals(updatedVersion, dashboardPage.getCurrentVersionName());
//	    }
//
//	    @Then("the updated Stage name should persist")
//	    public void the_updated_stage_name_should_persist() {
//	        assertEquals(updatedStage, dashboardPage.getCurrentStageName());
//	    }
//	}
//
//
