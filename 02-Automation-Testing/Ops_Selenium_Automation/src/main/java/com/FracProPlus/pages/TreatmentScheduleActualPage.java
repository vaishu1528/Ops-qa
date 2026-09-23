package com.FracProPlus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.FracProPlus.utils.CommonUtils;
import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;
import com.FracProPlus.utils.Waits;

public class TreatmentScheduleActualPage {
	private WebDriver driver;
	private ElementUtils elementUtils;

	public TreatmentScheduleActualPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()=' Import from Design ']")
	private WebElement copyDesignToActualScheduleElement;

	@FindBy(xpath = "//button[text()=' Yes, Overwrite ']")
	private WebElement yesButtonOnConfirmation;

	@FindBy(xpath = "//a[text()=' Actual Treatment Schedule ']")
	private WebElement actualTreatmentScheduledBtn;

	// First row element when prop mode is ramped and

	@FindBy(xpath = "(//td[@id='cell-0-0'])[2]")
	private WebElement stepTypeFirstRowElement;

	@FindBy(xpath = "(//td[@id='cell-0-1'])[2]")
	private WebElement stepTypeFirstRowElement1;

	@FindBy(xpath = "(//td[@id='cell-0-1'])[2]")
	private WebElement stepAliasFirstRowElement;

	@FindBy(xpath = "(//td[@id='cell-0-2'])[2]")
	private WebElement flowRate1FirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-5'])[1]")
	private WebElement flowRate1FirstRowElementAfterStepAlias1;

	@FindBy(xpath = "(//td[@id='cell-0-3'])[1]")
	private WebElement flowRate2FirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-4'])[1]")
	private WebElement propConc1FirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-5'])[1]")
	private WebElement propConc2FirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-7'])[1]")
	private WebElement propConc1FirstRowElementAfterStepAlias1;

	@FindBy(xpath = "(//td[@id='cell-0-8'])[1]")
	private WebElement propConc2FirstRowElementAfterStepAlias1;

	@FindBy(xpath = "(//td[@id='cell-0-9'])[1]")
	private WebElement n2Rate1;

	@FindBy(xpath = "(//td[@id='cell-0-10'])[1]")
	private WebElement n2Rate2;

	@FindBy(xpath = "(//td[@id='cell-0-11'])[1]")
	private WebElement co2Rate1;

	@FindBy(xpath = "(//td[@id='cell-0-12'])[1]")
	private WebElement co2Rate2;

	@FindBy(xpath = "(//td[@id='cell-0-13'])[1]")
	private WebElement cleanVolElementAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-0'])[2]")
	private WebElement stepLengthElementAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-14'])[1]")
	private WebElement btmPropConc1;

	@FindBy(xpath = "(//td[@id='cell-0-15'])[1]")
	private WebElement btmPropConc2;

	@FindBy(xpath = "(//td[@id='cell-0-16'])[1]")
	private WebElement btmSlurryFoamRate;

	@FindBy(xpath = "(//td[@id='cell-0-17'])[1]")
	private WebElement btmN2QualCell;

	@FindBy(xpath = "(//td[@id='cell-0-18'])[1]")
	private WebElement btmCo2QualCell;

	@FindBy(xpath = "(//td[@id='cell-0-19'])[1]")
	private WebElement btmCleanFoamVolumeCell;

	@FindBy(xpath = "(//td[@id='cell-0-3'])[1]")
	private WebElement fluidTypeAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-4'])[1]")
	private WebElement proppantTypeAfterN2Co2Ramped;

	// prop mode is staged and treatment type is N2&Co2

	@FindBy(xpath = "(//td[@id='cell-0-2'])[2]")
	private WebElement flowRateFirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-4'])[1]")
	private WebElement propConcFirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-6'])[1]")
	private WebElement n2Rate;

	@FindBy(xpath = "(//td[@id='cell-0-8'])[1]")
	private WebElement co2Rate;

	@FindBy(xpath = "(//td[@id='cell-0-12'])[1]")
	private WebElement btmPropConc;

	public void clickElementOnCopyDesignToActualSchedule() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(copyDesignToActualScheduleElement);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnYesButtonOnConfirmationActualSchedule() {
		try {
			elementUtils.clickElement(yesButtonOnConfirmation);
			Thread.sleep(15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnXButton() {
		try {
			elementUtils.clickElement(driver.findElement(XButton));
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickElementOnActualTreatmentScheduled() {
		try {
			elementUtils.clickElement(actualTreatmentScheduledBtn);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// First row cell data verification after importing the data from design

	public void verifystepTypeSelectedValue(String expectedStepTypeValue) {
		try {
			CommonUtils.scrollToTop(driver);
			Thread.sleep(1000);
			String actualDefaultValue = stepTypeFirstRowElement1.getText().trim().replace("▼", "").trim();
			Assert.assertEquals(actualDefaultValue, expectedStepTypeValue, "Step type value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyEnteredStepAliasCellValueFirstRow(String expectedValue) {
		try {
			String actualDefaultValue = Waits.waitForVisibility(driver, stepAliasFirstRowElement).getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Entered step alias value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyflowRate1Value(String expectedflowRate1Value) {
		try {

			String actualDefaultValue = flowRate1FirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"Entered flow rate 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyflowRate1Value1(String expectedflowRate1Value) {
		try {

			String actualDefaultValue = flowRate1FirstRowElementAfterStepAlias1.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"Entered flow rate 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyflowRate2Value(String expectedflowRate1Value) {
		try {
			Thread.sleep(1000);
			String actualDefaultValue = flowRate2FirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"flow rate 2 value does not match flow rate 1!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPropConc1Value(String expectedflowRate1Value) {
		try {

			String actualDefaultValue = propConc1FirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"Entered flow rate 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPropConc2Value(String expectedflowRate1Value) {
		try {

			String actualDefaultValue = propConc2FirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"flow rate 2 value does not match flow rate 1!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPropConc1Value1(String expectedflowRate1Value) {
		try {

			String actualDefaultValue = propConc1FirstRowElementAfterStepAlias1.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"Entered flow rate 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPropConc2Value1(String expectedflowRate1Value) {
		try {

			String actualDefaultValue = propConc2FirstRowElementAfterStepAlias1.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"flow rate 2 value does not match flow rate 1!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyN2Rate1CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = n2Rate1.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered N2 Rate 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyN2Rate2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = n2Rate2.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered N2 Rate 2 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCO2Rate1CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = co2Rate1.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered CO2 Rate 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCO2Rate2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = co2Rate2.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered CO2 Rate 2 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCleanVolCellValueForFirstRow(String expectedValue) {
		try {
			Thread.sleep(2000);
			String actualDefaultValue = cleanVolElementAfterN2Co2Ramped.getText().replace(",", "");
			Assert.assertEquals(actualDefaultValue, expectedValue, "Entered clean Vol value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepLengthCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = stepLengthElementAfterN2Co2Ramped.getText().replace(",", "");
			Assert.assertEquals(actualDefaultValue, expectedValue, "Entered Step length value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmPropConc1CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmPropConc1.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm Prop Conc 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmPropConc1CellValueForFirstRow1(String expectedValue) {
		try {

			String actualDefaultValue = btmPropConc1.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Entered Btm Prop Conc 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmPropConc2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmPropConc2.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm Prop Conc 2 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmSlurryFoamRateCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmSlurryFoamRate.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm Slurry Foam Rate value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmN2QualRateCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmN2QualCell.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm N2 Qual value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmCO2QualRateCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmCo2QualCell.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm CO2 Qual value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmCleanFoamVolumeCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmCleanFoamVolumeCell.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm Clean Foam Volume value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFluidTypeCellValueForFirstRow(String expectedValue) {
		try {
			Thread.sleep(1000);
			String actualDefaultValue = fluidTypeAfterN2Co2Ramped.getText().trim().replace("▼", "").trim();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Selected fluid type option does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantTypeCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = proppantTypeAfterN2Co2Ramped.getText().trim().replace("▼", "").trim();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Selected proppant type value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyflowRateEnteredValueForFirstRow(String expectedflowRateValue) {
		try {

			String actualDefaultValue = flowRateFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRateValue, "Entered flow rate value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPropConcEnteredValueForFirstRow(String expectedflowRateValue) {
		try {

			String actualDefaultValue = propConcFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRateValue, "Entered prop conc value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyN2RateCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = n2Rate.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered N2 Rate value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCO2RateCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = co2Rate.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered CO2 Rate value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmPropConcCellValueForFirstRow(String expectedValue) {
		try {
			Thread.sleep(1000);
			String actualDefaultValue = btmPropConc.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm Prop Conc value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// ================================
	// Treatment Schedule - Total Section
	// ================================

	public static By stepLengthTotalValue =
	        By.xpath("(//div[text()='Step length'])[1]/parent::div/descendant::input");

	public static By stepLengthTotalUnit =
	        By.xpath("(//div[text()='Step length'])[1]/parent::div/descendant::div[text()='min']");

	public static By cleanVolumeTotalValue =
	        By.xpath("(//div[text()='Clean Vol'])[1]/parent::div/descendant::input");

	public static By cleanVolumeTotalUnit =
	        By.xpath("(//div[text()='Clean Vol'])[1]/parent::div/descendant::div[text()='gal']");

	public static By stepProppantTotalValue =
	        By.xpath("(//div[text()='Step Prop'])[2]/parent::div/descendant::input");

	public static By stepProppantTotalUnit =
	        By.xpath("(//div[text()='Step Prop'])[2]/parent::div/descendant::div[text()='lbs']");

	// ================================
	// Treatment Schedule - Copy To Button
	// ================================

	public static By copyToButton =
	        By.xpath("//button[text()=' Copy To ']");

	// ================================
	// Copy Option Popup
	// ================================

	public static By copyOptionPopup =
	        By.xpath("//h5[text()='Copy Options']");

	public static By copyIntoAllStagesMsg =
	        By.xpath("//label[contains(text(),'Copy into all stages')]");

	public static By copyIntoGroupMsg =
	        By.xpath("//label[contains(text(),'Copy into group')]");

	public static By flushVolumeField =
	        By.xpath("//label[text()=' Auto-Populate flush Volume with Wellbore Volume ']");

	// ================================
	// Popup Buttons
	// ================================

	public static By okButton =
	        By.xpath("//button[text()=' Ok ']");

	public static By cancelButton =
	        By.xpath("//button[text()=' Cancel ']");

	public static By yesButton =
	        By.xpath("//button[normalize-space()='Yes']");
	
	public static By XButton =
	        By.xpath("//button[@aria-label='Close']");
	
	public void clickCopyToButton() {
		try {
			driver.findElement(copyToButton).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCopyToButtonDisplayed() {
		try {
			Assert.assertTrue(driver.findElement(copyToButton).isDisplayed(),
					"Copy To button is not displayed on Treatment Schedule screen!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepLengthTotalValue(String expectedValue) {
		try {
			String actualValue = driver.findElement(stepLengthTotalValue).getAttribute("value");
			Assert.assertEquals(actualValue, expectedValue,
					"Step Length total value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepLengthTotalUnit(String expectedUnit) {
		try {
			String actualUnit = driver.findElement(stepLengthTotalUnit).getText();
			Assert.assertEquals(actualUnit, expectedUnit,
					"Step Length unit does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCleanVolumeTotalValue(String expectedValue) {
		try {
			String actualValue = driver.findElement(cleanVolumeTotalValue).getAttribute("value");
			Assert.assertEquals(actualValue, expectedValue,
					"Clean Volume total value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCleanVolumeTotalUnit(String expectedUnit) {
		try {
			String actualUnit = driver.findElement(cleanVolumeTotalUnit).getText();
			Assert.assertEquals(actualUnit, expectedUnit,
					"Clean Volume unit does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepProppantTotalValue(String expectedValue) {
		try {
			String actualValue = driver.findElement(stepProppantTotalValue).getAttribute("value");
			Assert.assertEquals(actualValue, expectedValue,
					"Step Proppant total value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepProppantTotalUnit(String expectedUnit) {
		try {
			String actualUnit = driver.findElement(stepProppantTotalUnit).getText();
			Assert.assertEquals(actualUnit, expectedUnit,
					"Step Proppant unit does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCopyOptionPopupDisplayed() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(driver.findElement(copyOptionPopup).isDisplayed(),
					"Copy option popup is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCopyIntoAllStagesMessage() {
		try {
			Assert.assertTrue(driver.findElement(copyIntoAllStagesMsg).isDisplayed(),
					"Copy Into All Stages message not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCopyIntoGroupMessage() {
		try {
			Assert.assertTrue(driver.findElement(copyIntoGroupMsg).isDisplayed(),
					"Copy Into Group message not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFlushVolumeAutoPopulated() {
		try {
			String actualValue = driver.findElement(flushVolumeField).getText();
			Assert.assertEquals(actualValue, "Auto-Populate flush Volume with Wellbore Volume",
					"Flush Volume is not auto populated!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOkButtonDisplayed() {
		try {
			Assert.assertTrue(driver.findElement(okButton).isDisplayed(),
					"OK button not displayed in Copy popup!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCancelButtonDisplayed() {
		try {
			Assert.assertTrue(driver.findElement(cancelButton).isDisplayed(),
					"Cancel button not displayed in Copy popup!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickYesOnConfirmationPopup() {
		try {
			driver.findElement(yesButton).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
