package com.FracProPlus.stepdefinitions;

import org.testng.Assert;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.MaterialUsagePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaterialUsage extends DriverFactory {

	MaterialUsagePage materialusage = new MaterialUsagePage(driver);

	@When("the user clicks on the material usage module")
	public void the_user_clicks_on_the_material_usage_module() {
		materialusage.clickElementMaterialUsageModule();
	}

	@Then("Verify the chemical table header names")
	public void verify_the_chemical_table_header_names() {
		materialusage.verifyChemicalHeaderNames();
	}

	@Then("Verify the proppant table header names")
	public void verify_the_proppant_table_header_names() {
		materialusage.verifyProppantHeaderNames();
	}

	@Then("Verify the acid table header names")
	public void verify_the_acid_table_header_names() {
		materialusage.verifyAcidHeaderNames();
	}

	@When("user enter the design total value into the chemical table")
	public void userEnterChemicalDesignTotal() {
		materialusage.enterChemicalDesignTotal("10.00");
	}

	@When("user enter the metered total value into the chemical table")
	public void userEnterChemicalMeteredTotal() throws InterruptedException {
		materialusage.enterChemicalMeteredTotal("15.00");
	}

	@When("user enter the Actual total value into the chemical table")
	public void userEnterChemicalActualTotal() throws InterruptedException {
		materialusage.enterChemicalActualTotal("30.00");
	}

	@When("user enter the design total value into the proppant table")
	public void userEnterProppantDesignTotal() throws InterruptedException {
		materialusage.enterProppantDesignTotal("25.00");
	}

	@When("user enter the metered total value into the proppant table")
	public void userEnterProppantMeteredTotal() throws InterruptedException {
		materialusage.enterProppantMeteredTotal("35.00");
	}

	@When("user enter the Actual total value into the proppant table")
	public void userEnterProppantActualTotal() throws InterruptedException {
		materialusage.enterProppantActualTotal("45.00");
	}

	@When("user enter the design total value into the acid table")
	public void userEnterDesignTotalAcid() throws InterruptedException {
		materialusage.enterAcidDesignTotal("50.00");
	}

	@When("user enter the Actual Total total value into the acid table")
	public void userActualTotalAcid()  throws InterruptedException{
		materialusage.enterAcidActualTotal("100.00");
	}

	@When("user enter the acid name into the acid name table")
	public void userEnterAcidName() throws InterruptedException {
		materialusage.enterAcidName("Acid1");
	}

	@When("user enter the clean total value into the field")
	public void userEnterCleanTotal() {
		materialusage.enterCleanTotal("120.0");
	}

	@When("user select the plot option from select plot field")
	public void userSelectPlotOption() throws InterruptedException {
		materialusage.selectPlotOption();
	}

	@Then("Verify the presence of display PRC Plot button in material usage page")
	public void verifyDisplayPRCPlotButton() {
		Assert.assertTrue(materialusage.isPRCPlotButtonDisplayed(),
				"PRC Plot button is not displayed on material usage page!");
	}

	@When("the user clicks on the Save button to save the data")
	public void userClickSaveButton() {
		materialusage.clickSaveButton();
	}

	@When("the user click on the clear design button")
	public void userClickClearDesignButton() {
		materialusage.clickClearDesignButton();
	}

	@When("the user click on the clear metered button")
	public void userClickClearMeteredButton() {
		materialusage.clickClearMeteredButton();
	}

	@When("the user click on the clear actuals button")
	public void userClickClearActualsButton() {
		materialusage.clickClearActualsButton();
	}

	@Then("verify the data should be cleared for design total field both for chemical and proppant table")
	public void verifyDesignTotalCleared() {
		Assert.assertTrue(materialusage.isChemicalDesignCleared(), "Chemical design field not cleared!");
		Assert.assertTrue(materialusage.isProppantDesignCleared(), "Proppant design field not cleared!");
	}

	@Then("verify the data should be cleared for actual total field both for chemical and proppant table")
	public void verifyActualTotalCleared() {
		Assert.assertTrue(materialusage.isChemicalActualCleared(), "Chemical actual field not cleared!");
		Assert.assertTrue(materialusage.isProppantActualCleared(), "Proppant actual field not cleared!");
	}

	@Then("verify the data should be cleared for metered total field both for chemical and proppant table")
	public void verifyMeteredTotalCleared() {
		Assert.assertTrue(materialusage.isChemicalMeteredCleared(), "Chemical metered field not cleared!");
		Assert.assertTrue(materialusage.isProppantMeteredCleared(), "Proppant metered field not cleared!");
	}
}