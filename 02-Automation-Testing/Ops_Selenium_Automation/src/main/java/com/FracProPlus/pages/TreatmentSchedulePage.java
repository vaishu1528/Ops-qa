package com.FracProPlus.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.FracProPlus.utils.CommonUtils;
import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ExecelReader;
import com.FracProPlus.utils.ReadData;
import com.FracProPlus.utils.Waits;

public class TreatmentSchedulePage {
	private WebDriver driver;
	private ElementUtils elementUtils;

	public TreatmentSchedulePage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	// Table Header element

	@FindBy(xpath = "//a[text()=' Treatment Schedule ']")
	private WebElement treatmentScheduleSidebarOption;

	@FindBy(xpath = "//a[text()=' Design Treatment Schedule ']")
	private WebElement designtreatmentScheduletab;

	@FindBy(xpath = "//span[text()='Actual Treatment Schedule']")
	private WebElement actualtreatmentScheduletab;

	@FindBy(xpath = "//button[text()=' Edit Schedule ']")
	private WebElement editScheduleButton;

	@FindBy(xpath = "//button[text()=' Stop Editing Schedule ']")
	private WebElement stopScheduleButton;

	@FindBy(xpath = "//button[text()=' Stop Editing Schedule ']")
	private WebElement stopScheduleEditingButton;

	@FindBy(xpath = "//label[text()=' Treatment Type ']/parent::div/ng-select")
	private WebElement treatmentTypeDropdown;

	@FindBy(xpath = "//label[text()=' Prop Mode ']/parent::div/ng-select")
	private WebElement propModeDropdown;

	@FindBy(xpath = "(//th[div[contains(text(),'Step Type')]])[8]")
	private WebElement stepTypeHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'Flow Rate')]])[8]")
	private WebElement flowRateHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'Flow Rate')]])[4]")
	private WebElement flowRate1Header;

	@FindBy(xpath = "(//th[div[contains(text(),'Flow Rate 2')]])[2]")
	private WebElement flowRate2Header;

	@FindBy(xpath = "(//th[div[contains(text(),'Prop Conc ')]])[2]")
	private WebElement propConcHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'Prop Conc ')]])[3]")
	private WebElement propConc1Header;

	@FindBy(xpath = "(//th[div[contains(text(),'Prop Conc ')]])[3]")
	private WebElement propConc1HeaderN2;

	@FindBy(xpath = "(//th[div[contains(text(),'Prop Conc 2')]])[3]")
	private WebElement propConc2HeaderN2;

	@FindBy(xpath = "(//th[div[contains(text(),'Prop Conc 2')]])[2]")
	private WebElement propConc2Header;

	@FindBy(xpath = "(//th[div[contains(text(),'Clean Vol')]])[4]")
	private WebElement cleanVolHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'Step Length')]])[4]")
	private WebElement stepLengthHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'Fluid Type')]])[4]")
	private WebElement fluidTypeHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'Proppant Type')]])[4]")
	private WebElement proppantTypeHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'Cumul Time')]])[4]")
	private WebElement cumulTimeHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'N2 Rate 1')]])[2]")
	private WebElement n2Rate1Header;

	@FindBy(xpath = "(//th[div[contains(text(),'N2 Rate 2')]])[2]")
	private WebElement n2RateHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'N2 Rate 2')]])[2]")
	private WebElement n2Rate2Header;

	@FindBy(xpath = "(//th[div[contains(text(),'Btm Prop Conc 1')]])[2]")
	private WebElement btmPropConc1Header;

	@FindBy(xpath = "//div[@class='ht_clone_top handsontable']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//table[@role='presentation']//thead[@role='rowgroup']//tr[@role='row']//th[@role='columnheader']//div[@role='presentation']//span[@role='presentation'][normalize-space()='Btm Prop Conc (ppg)']")
	private WebElement btmPropConcHeader;

	@FindBy(xpath = "(//span[text()='Btm Prop Conc 2 (ppg)'])[2]")
	private WebElement btmPropConc2Header;

	@FindBy(xpath = "(//span[text()='Btm Slurry Foam Rate (bpm)'])[2]")
	private WebElement btmSlurryFoamRateHeader;

	@FindBy(xpath = "(//span[text()='Btm N2 Qual (%)'])[2]")
	private WebElement btmN2Qual;

	@FindBy(xpath = "(//span[text()='Btm Clean Foam Volume (gal)'])[2]")
	private WebElement btmCleanFoamVolume;

	@FindBy(xpath = "(//span[text()='CO2 Rate (bpm)'])[2]")
	private WebElement co2RateHeader;

	@FindBy(xpath = "(//th[div[contains(text(),'CO2 Rate 1')]])[2]")
	private WebElement co2Rate1Header;

	@FindBy(xpath = "(//span[text()='CO2 Rate 2 (bpm)'])[2]")
	private WebElement co2Rate2Header;

	@FindBy(xpath = "(//span[text()='Btm CO2 Qual (%)'])[2]")
	private WebElement btmCo2Qual;

	@FindBy(xpath = "//h5[text()='  Schedule Based on Conditions ']")
	private WebElement scheduledBasedOnConditionsHeader;

	@FindBy(xpath = "//h5[text()=' Estimate Treating Conditions ']")
	private WebElement estimateTreatingConditionsHeader;

	@FindBy(xpath = "//h4[text()=' CO2 Properties']")
	private WebElement co2PropertiesHeader;

	// First row element

	@FindBy(xpath = "(//td[@id='cell-0-1'])[4]")
	private WebElement stepTypeFirstRowElement;

	@FindBy(xpath = "(//td[@id='cell-0-2'])[2]")
	private WebElement stepAliasFirstRowElement;

	@FindBy(xpath = "(//td[@id='cell-0-2'])[4]")
	private WebElement stepAliasFirstRowElementAfterSave;

	@FindBy(xpath = "(//td[@id='cell-0-5'])[2]")
	private WebElement flowRateFirstRowElement;
	
	@FindBy(xpath = "(//td[@id='cell-0-5'])[1]")
	private WebElement flowRateFirstRowElement1;

	@FindBy(xpath = "(//td[@id='cell-0-5'])[2]")
	private WebElement flowRateFirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-5'])[2]")
	private WebElement flowRate1FirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-3'])[1]")
	private WebElement flowRate2FirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-3'])[2]")
	private WebElement flowRate2FirstRowElementAfterStepAliasAfterSave;

	@FindBy(xpath = "(//td[@id='cell-0-7'])[2]")
	private WebElement propConcEnteredValue;

	@FindBy(xpath = "(//td[@id='cell-0-7'])[2]")
	private WebElement propConcFirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-7'])[2]")
	private WebElement propConc1FirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-8'])[1]")
	private WebElement propConc2FirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-8'])[2]")
	private WebElement propConc2FirstRowElementAfterStepAliasAfterSave;

	@FindBy(xpath = "(//td[@id='cell-0-13'])[2]")
	private WebElement cleanVolValue;

	@FindBy(xpath = "(//td[@id='cell-0-13'])[2]")
	private WebElement cleanVolFirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-0'])[4]")
	private WebElement stepFirstLengthValue;

	@FindBy(xpath = "(//td[@id='cell-0-0'])[4]")
	private WebElement stepLengthFirstRowElementAfterStepAlias;

	@FindBy(xpath = "//tabset/div/tab[2]/div/app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[1]/td[6]")
	private WebElement fluidTypeSelectedValue;

	@FindBy(xpath = "(//td[@id='cell-0-3'])[2]")
	private WebElement fluidTypeFirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-4'])[2]")
	private WebElement proppantTypeSelectedValue;

	@FindBy(xpath = "(//td[@id='cell-0-4'])[2]")
	private WebElement proppantTypeFirstRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-0-4'])[2]")
	private WebElement proppantTypeFirstRowElementAfterStepAlias1;

	@FindBy(xpath = "//td[text()='100 mesh']")
	private WebElement proppantTypeFirstRowElementAfterStepAlias2;

	@FindBy(xpath = "//tabset/div/tab[2]/div/app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[1]/td[8]")
	private WebElement cumulTimeValue;

	@FindBy(xpath = "(//td[@id='cell-0-20'])[2]")
	private WebElement cumulTimeFirstRowElementAfterStepAlias;

	// First Row Element when treatment type is N2 & CO2 and Prop mode is ramped and
	// step alias is enabled

	@FindBy(xpath = "(//td[@id='cell-0-9'])[1]")
	private WebElement n2Rate1;

	@FindBy(xpath = "(//td[@id='cell-0-9'])[2]")
	private WebElement n2Rate1AfterSave;

	@FindBy(xpath = "(//td[@id='cell-0-10'])[1]")
	private WebElement n2Rate2;

	@FindBy(xpath = "(//td[@id='cell-0-10'])[2]")
	private WebElement n2Rate2AfterSave;

	@FindBy(xpath = "(//td[@id='cell-0-11'])[1]")
	private WebElement co2Rate1;

	@FindBy(xpath = "(//td[@id='cell-0-11'])[2]")
	private WebElement co2Rate1AfterSave;

	@FindBy(xpath = "(//td[@id='cell-0-12'])[1]")
	private WebElement co2Rate2;

	@FindBy(xpath = "(//td[@id='cell-0-12'])[2]")
	private WebElement co2Rate2AfterSave;

	@FindBy(xpath = "(//td[@id='cell-0-13'])[2]")
	private WebElement cleanVolElementAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-0'])[4]")
	private WebElement stepLengthElementAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-14'])[1]")
	private WebElement btmPropConc1;

	@FindBy(xpath = "(//td[@id='cell-0-14'])[2]")
	private WebElement btmPropConc1As;

	@FindBy(xpath = "(//td[@id='cell-0-15'])[1]")
	private WebElement btmPropConc2;

	@FindBy(xpath = "(//td[@id='cell-0-15'])[2]")
	private WebElement btmPropConc2As;

	@FindBy(xpath = "(//td[@id='cell-0-16'])[1]")
	private WebElement btmSlurryFoamRate;

	@FindBy(xpath = "(//td[@id='cell-0-16'])[2]")
	private WebElement btmSlurryFoamRateAs;

	@FindBy(xpath = "(//td[@id='cell-0-17'])[1]")
	private WebElement btmN2QualCell;

	@FindBy(xpath = "(//td[@id='cell-0-17'])[2]")
	private WebElement btmN2QualCellAs;

	@FindBy(xpath = "(//td[@id='cell-0-18'])[1]")
	private WebElement btmCo2QualCell;

	@FindBy(xpath = "(//td[@id='cell-0-18'])[2]")
	private WebElement btmCo2QualCellAs;

	@FindBy(xpath = "(//td[@id='cell-0-19'])[1]")
	private WebElement btmCleanFoamVolumeCell;

	@FindBy(xpath = "(//td[@id='cell-0-19'])[2]")
	private WebElement btmCleanFoamVolumeCellAs;

	@FindBy(xpath = "(//td[@id='cell-0-3'])[2]")
	private WebElement fluidTypeAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-4'])[2]")
	private WebElement proppantTypeAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-21'])[1]")
	private WebElement cumulTimeAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-21])[1]")
	private WebElement cumulTimeAfterN2Co2RampedAs;

	@FindBy(xpath = "(//td[@id='cell-0-22'])[1]")
	private WebElement stepSluryAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-23'])[1]")
	private WebElement cumulGelAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-20'])[2]")
	private WebElement stepPropAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-24'])[1]")
	private WebElement cumulPropAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-25'])[1]")
	private WebElement cleanRateAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-26'])[1]")
	private WebElement cumulSlurryAfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-27'])[1]")
	private WebElement stepN2AfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-28'])[1]")
	private WebElement cumulN2AfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-29'])[1]")
	private WebElement stepCO2AfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-30'])[1]")
	private WebElement cumulCO2AfterN2Co2Ramped;

	@FindBy(xpath = "(//td[@id='cell-0-9'])[1]")
	private WebElement n2Rate;

	@FindBy(xpath = "(//td[@id='cell-0-11'])[1]")
	private WebElement co2Rate;

	@FindBy(xpath = "(//td[@id='cell-0-14'])[2]")
	private WebElement btmPropConc;

	// Second Row Cell element

	@FindBy(xpath = "(//td[@id='cell-1-1'])[2]")
	private WebElement stepTypeSecondRowElement;

	@FindBy(xpath = "(//td[@id='cell-1-5'])[1]")
	private WebElement flowRateSecondRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-1-7'])[1]")
	private WebElement propConcSecondRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-1-4'])[1]")
	private WebElement proppantTypeSecondRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-1-13'])[1]")
	private WebElement cleanVolSecondRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-1-3'])[1]")
	private WebElement fluidTypeSecondRowElementAfterStepAlias;

	@FindBy(xpath = "(//td[@id='cell-1-0'])[1]")
	private WebElement stepLengthSecondRowElementAfterStepAlias;

	// Common Field element

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[2]")
	private WebElement selectCustomColumn;

	@FindBy(xpath = "//input[@id='foamPressureInput']")
	private WebElement estimatedFoamPressure;

	@FindBy(xpath = "//input[@id='foamTempInput']")
	private WebElement estimatedFoamTemperature;

	@FindBy(xpath = "//input[@id='inFracture']")
	private WebElement inFracture;

	@FindBy(xpath = "//input[@id='meteringPressure']")
	private WebElement meteringPressure;

	@FindBy(xpath = "//input[@id='meteringTemperature']")
	private WebElement meteringTemperature;

	@FindBy(xpath = "//input[@id='PulseLen']")
	private WebElement pulseDuration;

	@FindBy(xpath = "//button[text()='  Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//label[text()='Quality']")
	private WebElement qualityOptionHeader;

	@FindBy(xpath = "//label[text()='Quality']/parent::div/ng-select")
	private WebElement qualityOptionDropdown;

	@FindBy(xpath = "//span[text()='Conventional Quality']")
	private WebElement qualityOptionDropdown2;

	@FindBy(xpath = "//input[@id='foamPressureInput']")
	private WebElement estimatedFoamPressureInput;

	@FindBy(xpath = "//input[@id='foamTempInput']")
	private WebElement estimatedFoamTemperatureInput;

	@FindBy(xpath = "//input[@id='meteringPressure']")
	private WebElement meteringPressureInput;

	@FindBy(xpath = "//input[@id='meteringTemperature']")
	private WebElement meteringTemperatureInput;

	@FindBy(xpath = "//input[@id='flowMeterDensity']")
	private WebElement densityAtFlowMeterInput;

	@FindBy(xpath = "//label[text()=' Pulsed Proppant ']/parent::div/input")
	private WebElement pulsedProppantCheckbox;

	@FindBy(xpath = "//input[@formcontrolname='PulseLen']")
	private WebElement pulseDurationInputField;

	@FindBy(xpath = "//input[@id='includeAliases']")
	private WebElement includeAliasesCheckbox;

	@FindBy(xpath = "(//th[div[contains(text(),'Step Alias')]])[4]")
	private WebElement stepAliasHeader;

	@FindBy(xpath = "//label[text()=' Volume from Time ']/parent::div/input")
	private WebElement volumeFromTimeOption;

	@FindBy(xpath = "//label[text()=' Time from Volume ']/parent::div/input")
	private WebElement timeFromVolumeOption;

	public WebElement getStepType() {
		return driver.findElement(
				By.xpath("((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[1]"));
	}

	public WebElement getFlowRate() {
		return driver.findElement(
				By.xpath("((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[2]"));
	}

	public WebElement getPropConc() {
		return driver.findElement(
				By.xpath("((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[3]"));
	}

	public WebElement getCleanVol() {
		return driver.findElement(
				By.xpath("((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[4]"));
	}

	public WebElement getFluidType() {
		return driver.findElement(
				By.xpath("((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[7]"));
	}

	public WebElement getProppantType() {
		return driver.findElement(
				By.xpath("((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[8]"));
	}

	public void pageRefresh() {
		try {
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void verifyDefaultDropdownSelection(WebElement dropdownElement) {
		try {
			Select dropdown = new Select(dropdownElement);
			WebElement selectedOption = dropdown.getFirstSelectedOption();
			Assert.assertEquals(dropdown.getOptions().indexOf(selectedOption), 0, "Default option is not at index 0");
		} catch (Exception e) {
			Assert.fail("Dropdown verification failed", e);
		}
	}

	public void verifyDefaultDropdownTreatmentType() {
		try {
			Assert.assertEquals(treatmentTypeDropdown.getAttribute("innerText").trim(), "No Foam",
					"Default option of treatment type dropdown is incorrect");
		} catch (Exception e) {
			Assert.fail("Dropdown verification failed", e);
		}
	}

	public void verifyDefaultDropdownPropMode() {
		try {
			Assert.assertEquals(propModeDropdown.getAttribute("innerText").trim(), "Staged",
					"Default option of prop mode dropdown is incorrect");
		} catch (Exception e) {
			Assert.fail("Dropdown verification failed", e);
		}
	}

	public void clickElementOnTreatmentScheduleSidebarOption() {
		try {
			Thread.sleep(4000);
			WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
			elementUtils.clickElement(expandMenu);
			Thread.sleep(2000);
			elementUtils.clickElement(treatmentScheduleSidebarOption);
			Thread.sleep(2000);
			WebElement CollapseMenu = driver.findElement(By.xpath("//img[@tooltip='Collapse']"));
			elementUtils.clickElement(CollapseMenu);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnDesigntreatmentScheduleTab() {
		try {
			elementUtils.clickElement(designtreatmentScheduletab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnActualtreatmentScheduleTab() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(actualtreatmentScheduletab);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPageTitle(String expectedTitle) {
		try {
			String actualTitle = driver.getTitle();
			// System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnEditScheduleButton() {
		try {
			Thread.sleep(1000);
			CommonUtils.scrollToBottom(driver);
			elementUtils.clickElement(editScheduleButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnStopScheduleEditingButton() {
		try {
			// CommonUtils.scrollToBottom(driver);
			Thread.sleep(2000);
			elementUtils.clickElement(stopScheduleEditingButton);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyIsElementDisplayed(WebElement element) {
		try {
			Assert.assertTrue(element.isDisplayed(), "Element is not displayed");
		} catch (Exception e) {
			Assert.fail("Element is not found or not accessible", e);
		}
	}

	public void verifyIsStopScheduleEditingButtonDisplayed() {
		verifyIsElementDisplayed(stopScheduleEditingButton);
	}

	public void verifyTreatmentTypeDefaultOptionIsNofoam() {
		verifyDefaultDropdownSelection(treatmentTypeDropdown);
	}

	public void verifyPropModeDefaultOptionIsStaged() {
		verifyDefaultDropdownSelection(propModeDropdown);
	}

	public void verifyTableHeaderOnDesignWhenTreatmenttypeNofoamPropmodeStaged() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(stepTypeHeader.isDisplayed(), "Step Type column header is not displayed!");
			Assert.assertTrue(flowRateHeader.isDisplayed(), "Flow Rate column header is not displayed!");
			Assert.assertTrue(propConcHeader.isDisplayed(), "Prop Conc column header is not displayed!");
			Assert.assertTrue(cleanVolHeader.isDisplayed(), "Clean Vol column header is not displayed!");
			Assert.assertTrue(stepLengthHeader.isDisplayed(), "Step Length column header is not displayed!");
			Assert.assertTrue(fluidTypeHeader.isDisplayed(), "Fluid Type column header is not displayed!");
			Assert.assertTrue(proppantTypeHeader.isDisplayed(), "Proppant Type column header is not displayed!");
			// Assert.assertTrue(cumulTimeHeader.isDisplayed(), "Cumul Time column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTableHeaderOnDesignWhenTreatmenttypeNofoamPropmodeRamped() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(stepTypeHeader.isDisplayed(), "Step Type column header is not displayed!");
			Assert.assertTrue(flowRate1Header.isDisplayed(), "Flow Rate 1 column header is not displayed!");
			// Assert.assertTrue(flowRate2Header.isDisplayed(), "Flow Rate 2 column header
			// is not displayed!");
			Assert.assertTrue(propConc1Header.isDisplayed(), "Prop Conc 1 column header is not displayed!");
			// Assert.assertTrue(propConc2Header.isDisplayed(), "Prop Conc 2 column header
			// is not displayed!");
			Assert.assertTrue(cleanVolHeader.isDisplayed(), "Clean Vol column header is not displayed!");
			Assert.assertTrue(stepLengthHeader.isDisplayed(), "Step Length column header is not displayed!");
			Assert.assertTrue(fluidTypeHeader.isDisplayed(), "Fluid Type column header is not displayed!");
			Assert.assertTrue(proppantTypeHeader.isDisplayed(), "Proppant Type column header is not displayed!");
			// Assert.assertTrue(cumulTimeHeader.isDisplayed(), "Cumul Time column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTableHeaderOnDesignWhenTreatmenttypeN2PropmodeRamped() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(stepTypeHeader.isDisplayed(), "Step Type column header is not displayed!");
			Assert.assertTrue(flowRate1Header.isDisplayed(), "Flow Rate 1 column header is not displayed!");
			Assert.assertTrue(flowRate2Header.isDisplayed(), "Flow Rate 2 column header is not displayed!");
			Assert.assertTrue(propConc1Header.isDisplayed(), "Prop Conc 1 column header is not displayed!");
			// Assert.assertTrue(propConc2Header.isDisplayed(), "Prop Conc 2 column header
			// is not displayed!");
			Assert.assertTrue(n2Rate1Header.isDisplayed(), "N2 Rate 1 column header is not displayed!");
			// Assert.assertTrue(n2Rate2Header.isDisplayed(), "N2 Rate 2 column header is
			// not displayed!");
			Assert.assertTrue(cleanVolHeader.isDisplayed(), "Clean Vol column header is not displayed!");
			Assert.assertTrue(stepLengthHeader.isDisplayed(), "Step Length column header is not displayed!");
			Assert.assertTrue(btmPropConc1Header.isDisplayed(), "Btm Prop Conc 1 column header is not displayed!");
			// Assert.assertTrue(btmPropConc2Header.isDisplayed(), "Btm Prop Conc 2 column
			// header is not displayed!");
			// Assert.assertTrue(btmSlurryFoamRateHeader.isDisplayed(), "Btm slurry foam
			// rate column header is not displayed!");
			// Assert.assertTrue(btmN2Qual.isDisplayed(), "Btm N2 qual column header is not
			// displayed!");
			// Assert.assertTrue(btmCleanFoamVolume.isDisplayed(), "Btm clean foam volume
			// column header is not displayed!");
			// Assert.assertTrue(fluidTypeHeader.isDisplayed(), "Fluid Type column header is
			// not displayed!");
			// Assert.assertTrue(proppantTypeHeader.isDisplayed(), "Proppant Type column
			// header is not displayed!");
			// Assert.assertTrue(cumulTimeHeader.isDisplayed(), "Cumul Time column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTableHeaderOnDesignWhenTreatmenttypeN2PropmodeRampedN2() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(stepTypeHeader.isDisplayed(), "Step Type column header is not displayed!");
			Assert.assertTrue(flowRate1Header.isDisplayed(), "Flow Rate 1 column header is not displayed!");
			Assert.assertTrue(flowRate2Header.isDisplayed(), "Flow Rate 2 column header is not displayed!");
			Assert.assertTrue(propConc1HeaderN2.isDisplayed(), "Prop Conc 1 column header is not displayed!");
			// Assert.assertTrue(propConc2HeaderN2.isDisplayed(), "Prop Conc 2 column header
			// is not displayed!");
			Assert.assertTrue(n2Rate1Header.isDisplayed(), "N2 Rate 1 column header is not displayed!");
			Assert.assertTrue(n2Rate2Header.isDisplayed(), "N2 Rate 2 column header is not displayed!");
			Assert.assertTrue(cleanVolHeader.isDisplayed(), "Clean Vol column header is not displayed!");
			Assert.assertTrue(stepLengthHeader.isDisplayed(), "Step Length column header is not displayed!");
			Assert.assertTrue(btmPropConc1Header.isDisplayed(), "Btm Prop Conc 1 column header is not displayed!");
			// Assert.assertTrue(btmPropConc2Header.isDisplayed(), "Btm Prop Conc 2 column
			// header is not displayed!");
			// Assert.assertTrue(btmSlurryFoamRateHeader.isDisplayed(), "Btm slurry foam
			// rate column header is not displayed!");
			// Assert.assertTrue(btmN2Qual.isDisplayed(), "Btm N2 qual column header is not
			// displayed!");
			// Assert.assertTrue(btmCleanFoamVolume.isDisplayed(), "Btm clean foam volume
			// column header is not displayed!");
			// Assert.assertTrue(fluidTypeHeader.isDisplayed(), "Fluid Type column header is
			// not displayed!");
			// Assert.assertTrue(proppantTypeHeader.isDisplayed(), "Proppant Type column
			// header is not displayed!");
			// Assert.assertTrue(cumulTimeHeader.isDisplayed(), "Cumul Time column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTableHeaderOnDesignWhenTreatmenttypeN2PropmodeStaged() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(stepTypeHeader.isDisplayed(), "Step Type column header is not displayed!");
			Assert.assertTrue(flowRateHeader.isDisplayed(), "Flow Rate column header is not displayed!");
			// Assert.assertTrue(propConcHeader.isDisplayed(), "Prop Conc column header is
			// not displayed!");
			// Assert.assertTrue(n2RateHeader.isDisplayed(), "N2 Rate column header is not
			// displayed!");
			Assert.assertTrue(cleanVolHeader.isDisplayed(), "Clean Vol column header is not displayed!");
			Assert.assertTrue(stepLengthHeader.isDisplayed(), "Step Length column header is not displayed!");
			// Assert.assertTrue(btmPropConcHeader.isDisplayed(), "Btm Prop Conc column
			// header is not displayed!");
			// Assert.assertTrue(btmSlurryFoamRateHeader.isDisplayed(), "Btm slurry foam
			// rate column header is not displayed!");
			// Assert.assertTrue(btmN2Qual.isDisplayed(), "Btm N2 qual column header is not
			// displayed!");
			// Assert.assertTrue(btmCleanFoamVolume.isDisplayed(), "Btm clean foam volume
			// column header is not displayed!");
			// Assert.assertTrue(fluidTypeHeader.isDisplayed(), "Fluid Type column header is
			// not displayed!");
			// Assert.assertTrue(proppantTypeHeader.isDisplayed(), "Proppant Type column
			// header is not displayed!");
			// Assert.assertTrue(cumulTimeHeader.isDisplayed(), "Cumul Time column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTableHeaderOnDesignWhenTreatmenttypeCO2PropmodeStaged() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(stepTypeHeader.isDisplayed(), "Step Type column header is not displayed!");
			Assert.assertTrue(flowRateHeader.isDisplayed(), "Flow Rate column header is not displayed!");
			// Assert.assertTrue(propConcHeader.isDisplayed(), "Prop Conc column header is
			// not displayed!");
			// Assert.assertTrue(co2RateHeader.isDisplayed(), "CO2 Rate column header is not
			// displayed!");
			Assert.assertTrue(cleanVolHeader.isDisplayed(), "Clean Vol column header is not displayed!");
			Assert.assertTrue(stepLengthHeader.isDisplayed(), "Step Length column header is not displayed!");
			// Assert.assertTrue(btmPropConcHeader.isDisplayed(), "Btm Prop Conc column
			// header is not displayed!");
			// Assert.assertTrue(btmSlurryFoamRateHeader.isDisplayed(), "Btm slurry foam
			// rate column header is not displayed!");
			// Assert.assertTrue(btmCo2Qual.isDisplayed(), "Btm CO2 qual column header is
			// not displayed!");
			// Assert.assertTrue(btmCleanFoamVolume.isDisplayed(), "Btm clean foam volume
			// column header is not displayed!");
			// Assert.assertTrue(fluidTypeHeader.isDisplayed(), "Fluid Type column header is
			// not displayed!");
			// Assert.assertTrue(proppantTypeHeader.isDisplayed(), "Proppant Type column
			// header is not displayed!");
			// Assert.assertTrue(cumulTimeHeader.isDisplayed(), "Cumul Time column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTableHeaderOnDesignWhenTreatmenttypeCO2PropmodeRamped() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(stepTypeHeader.isDisplayed(), "Step Type column header is not displayed!");
			Assert.assertTrue(flowRate1Header.isDisplayed(), "Flow Rate 1 column header is not displayed!");
			// Assert.assertTrue(flowRate2Header.isDisplayed(), "Flow Rate 2 column header
			// is not displayed!");
			Assert.assertTrue(propConc1Header.isDisplayed(), "Prop Conc 1 column header is not displayed!");
			// Assert.assertTrue(propConc2Header.isDisplayed(), "Prop Conc 2 column header
			// is not displayed!");
			Assert.assertTrue(co2Rate1Header.isDisplayed(), "CO2 Rate 1 column header is not displayed!");
			// Assert.assertTrue(co2Rate2Header.isDisplayed(), "CO2 Rate 2 column header is
			// not displayed!");
			Assert.assertTrue(cleanVolHeader.isDisplayed(), "Clean Vol column header is not displayed!");
			Assert.assertTrue(stepLengthHeader.isDisplayed(), "Step Length column header is not displayed!");
			Assert.assertTrue(btmPropConc1Header.isDisplayed(), "Btm Prop Conc 1 column header is not displayed!");
			// Assert.assertTrue(btmPropConc2Header.isDisplayed(), "Btm Prop Conc 2 column
			// header is not displayed!");
			// Assert.assertTrue(btmSlurryFoamRateHeader.isDisplayed(), "Btm slurry foam
			// rate column header is not displayed!");
			// Assert.assertTrue(btmCo2Qual.isDisplayed(), "Btm CO2 qual column header is
			// not displayed!");
			// Assert.assertTrue(btmCleanFoamVolume.isDisplayed(), "Btm clean foam volume
			// column header is not displayed!");
			// Assert.assertTrue(fluidTypeHeader.isDisplayed(), "Fluid Type column header is
			// not displayed!");
			// Assert.assertTrue(proppantTypeHeader.isDisplayed(), "Proppant Type column
			// header is not displayed!");
			// Assert.assertTrue(cumulTimeHeader.isDisplayed(), "Cumul Time column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTableHeaderOnDesignWhenTreatmenttypeN2AndCO2PropmodeRamped() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(stepTypeHeader.isDisplayed(), "Step Type column header is not displayed!");
			Assert.assertTrue(flowRate1Header.isDisplayed(), "Flow Rate 1 column header is not displayed!");
			// Assert.assertTrue(flowRate2Header.isDisplayed(), "Flow Rate 2 column header
			// is not displayed!");
			Assert.assertTrue(propConc1Header.isDisplayed(), "Prop Conc 1 column header is not displayed!");
			// Assert.assertTrue(propConc2Header.isDisplayed(), "Prop Conc 2 column header
			// is not displayed!");
			Assert.assertTrue(n2Rate1Header.isDisplayed(), "N2 Rate 1 column header is not displayed!");
			// Assert.assertTrue(n2Rate2Header.isDisplayed(), "N2 Rate 2 column header is
			// not displayed!");
			Assert.assertTrue(co2Rate1Header.isDisplayed(), "CO2 Rate 1 column header is not displayed!");
			// Assert.assertTrue(co2Rate2Header.isDisplayed(), "CO2 Rate 2 column header is
			// not displayed!");
			Assert.assertTrue(cleanVolHeader.isDisplayed(), "Clean Vol column header is not displayed!");
			// Assert.assertTrue(stepLengthHeader.isDisplayed(), "Step Length column header
			// is not displayed!");
			// Assert.assertTrue(btmPropConc1Header.isDisplayed(), "Btm Prop Conc 1 column
			// header is not displayed!");
			// Assert.assertTrue(btmPropConc2Header.isDisplayed(), "Btm Prop Conc 2 column
			// header is not displayed!");
			// Assert.assertTrue(btmSlurryFoamRateHeader.isDisplayed(), "Btm slurry foam
			// rate column header is not displayed!");
			// Assert.assertTrue(btmN2Qual.isDisplayed(), "Btm N2 qual column header is not
			// displayed!");
			// Assert.assertTrue(btmCo2Qual.isDisplayed(), "Btm CO2 qual column header is
			// not displayed!");
			// Assert.assertTrue(btmCleanFoamVolume.isDisplayed(), "Btm clean foam volume
			// column header is not displayed!");
			// Assert.assertTrue(fluidTypeHeader.isDisplayed(), "Fluid Type column header is
			// not displayed!");
			// Assert.assertTrue(proppantTypeHeader.isDisplayed(), "Proppant Type column
			// header is not displayed!");
			// Assert.assertTrue(cumulTimeHeader.isDisplayed(), "Cumul Time column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTableHeaderOnDesignWhenTreatmenttypeN2AndCO2PropmodeStaged() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(stepTypeHeader.isDisplayed(), "Step Type column header is not displayed!");
			Assert.assertTrue(flowRateHeader.isDisplayed(), "Flow Rate column header is not displayed!");
			// Assert.assertTrue(propConcHeader.isDisplayed(), "Prop Conc column header is
			// not displayed!");
			// Assert.assertTrue(n2RateHeader.isDisplayed(), "N2 Rate column header is not
			// displayed!");
			// Assert.assertTrue(co2RateHeader.isDisplayed(), "CO2 Rate column header is not
			// displayed!");
			Assert.assertTrue(cleanVolHeader.isDisplayed(), "Clean Vol column header is not displayed!");
			Assert.assertTrue(stepLengthHeader.isDisplayed(), "Step Length column header is not displayed!");
			// Assert.assertTrue(btmPropConcHeader.isDisplayed(), "Btm Prop Conc column
			// header is not displayed!");
			// Assert.assertTrue(btmSlurryFoamRateHeader.isDisplayed(), "Btm slurry foam
			// rate column header is not displayed!");
			// Assert.assertTrue(btmN2Qual.isDisplayed(), "Btm N2 qual column header is not
			// displayed!");
			// Assert.assertTrue(btmCo2Qual.isDisplayed(), "Btm CO2 qual column header is
			// not displayed!");
			// Assert.assertTrue(btmCleanFoamVolume.isDisplayed(), "Btm clean foam volume
			// column header is not displayed!");
			// Assert.assertTrue(fluidTypeHeader.isDisplayed(), "Fluid Type column header is
			// not displayed!");
			// Assert.assertTrue(proppantTypeHeader.isDisplayed(), "Proppant Type column
			// header is not displayed!");
			// Assert.assertTrue(cumulTimeHeader.isDisplayed(), "Cumul Time column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifystepTypeSelectedValue(String expectedStepTypeValue) {
		try {
			CommonUtils.scrollToTop(driver);
			Thread.sleep(1000);
			String actualDefaultValue = stepTypeFirstRowElement.getText().trim().replace("▼", "").trim();
			Assert.assertEquals(actualDefaultValue, expectedStepTypeValue, "Step type value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyflowRateEnteredValue(String expectedflowRateValue) {
		try {

			String actualDefaultValue = flowRateFirstRowElement.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRateValue, "Entered flow rate value does not match!");
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

	public void verifyPropConcEnteredValue(String expectedflowRateValue) {
		try {

			String actualDefaultValue = propConcEnteredValue.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRateValue, "Entered prop conc value does not match!");
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

	public void verifyCleanVolEnteredValue(String expectedflowRateValue) {
		try {

			String actualDefaultValue = cleanVolValue.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRateValue, "Entered Clean vol value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepLengthEnteredValue(String expectedStepLengthValue) {
		try {

			String actualDefaultValue = stepFirstLengthValue.getText();
			Assert.assertEquals(actualDefaultValue, expectedStepLengthValue,
					"Entered step length value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantTypeFieldIsReadOnlyIfBlank() {
		elementUtils.verifyCellIsReadOnly(proppantTypeSelectedValue);
	}

	public void verifyFluidTypeSelectedOption(String expectedFluidTypeOption) {
		try {

			String actualDefaultValue = fluidTypeSelectedValue.getText();
			Assert.assertEquals(actualDefaultValue, expectedFluidTypeOption,
					"Selected fluid type option does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFluidTypeSelectedOptionForFirstRow() {
		try {
			Thread.sleep(1000);
			String expectedFluidTypeOption = ReadData.readdata("Fluid1");
			String actualDefaultValue = fluidTypeFirstRowElementAfterStepAlias.getText().trim().replace("▼", "").trim();
			Assert.assertEquals(actualDefaultValue, expectedFluidTypeOption,
					"Selected fluid type option does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantTypeSelectedOption(String expectedProppantTypeOption) {
		try {

			String actualDefaultValue = proppantTypeSelectedValue.getText().trim().replace("▼", "").trim();
			Assert.assertEquals(actualDefaultValue, expectedProppantTypeOption,
					"Selected proppant type option does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantTypeSelectedOptionForFirstRow() {
		try {
			Thread.sleep(1000);
			String expectedProppantTypeOption = ReadData.readdata("Proppant1");
			String actualDefaultValue = proppantTypeFirstRowElementAfterStepAlias.getText().trim().replace("▼", "")
					.trim();
			Assert.assertEquals(actualDefaultValue, expectedProppantTypeOption,
					"Selected proppant type option does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectStagedOptionFromPropModeDropdown() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(propModeDropdown);
			Thread.sleep(1000);
			WebElement staged = driver.findElement(By.xpath("//div[text()=' Staged ']"));
			elementUtils.clickElement(staged);
			Thread.sleep(1000);
			// elementUtils.selectOptionInDropdown(propModeDropdown,"Staged");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectRampedOptionFromPropModeDropdown() {
		try {
			// CommonUtils.scrollToBottom(driver);
			Thread.sleep(1000);
			elementUtils.clickElement(propModeDropdown);
			Thread.sleep(1000);
			WebElement ramped = driver.findElement(By.xpath("//div[text()=' Ramped ']"));
			elementUtils.clickElement(ramped);
			Thread.sleep(1000);
			// elementUtils.selectOptionInDropdown(propModeDropdown,"Ramped");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectOptionFromTreatmentTypeDropdownN2() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(treatmentTypeDropdown);
			Thread.sleep(1000);
			WebElement N2 = driver.findElement(By.xpath("//div[text()=' N2 ']"));
			elementUtils.clickElement(N2);
			Thread.sleep(1000);
			// elementUtils.selectOptionInDropdown(treatmentTypeDropdown,treatmentTypeOption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectOptionFromTreatmentTypeDropdownNoFoam() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(treatmentTypeDropdown);
			Thread.sleep(1000);
			WebElement NF = driver.findElement(By.xpath("//div[text()=' No Foam ']"));
			elementUtils.clickElement(NF);
			Thread.sleep(1000);
			// elementUtils.selectOptionInDropdown(treatmentTypeDropdown,treatmentTypeOption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectOptionFromTreatmentTypeDropdownCo2() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(treatmentTypeDropdown);
			Thread.sleep(1000);
			WebElement Co2 = driver.findElement(By.xpath("//div[text()=' CO2 ']"));
			elementUtils.clickElement(Co2);
			Thread.sleep(1000);
			// elementUtils.selectOptionInDropdown(treatmentTypeDropdown,treatmentTypeOption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectOptionFromTreatmentTypeDropdownN2Co2() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(treatmentTypeDropdown);
			Thread.sleep(1000);
			WebElement N2CO2 = driver.findElement(By.xpath("//div[text()=' N2 & CO2 ']"));
			elementUtils.clickElement(N2CO2);
			Thread.sleep(1000);
			// elementUtils.selectOptionInDropdown(treatmentTypeDropdown,treatmentTypeOption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyIsScheduledBasedOnConditionsHeaderDisplayed() {
		try {
			Thread.sleep(1000);
			Assert.assertTrue(scheduledBasedOnConditionsHeader.isDisplayed(),
					"Scheduled Based On Conditions header is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyIsEstimateTreatingConditionsHeaderDisplayed() {
		try {
			Assert.assertTrue(estimateTreatingConditionsHeader.isDisplayed(),
					"Estimate Treating Conditions header is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyIsCo2PropertiesHeaderDisplayed() {
		try {
			Assert.assertTrue(co2PropertiesHeader.isDisplayed(), "CO2 Properties header is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyIsQualityOptionHeaderDisplayedAndDefaultDropdownOption() {
		try {
			Assert.assertTrue(qualityOptionHeader.isDisplayed(), "Quality option header is not displayed!");
			Thread.sleep(1000);
			// verifyDefaultDropdownSelection(qualityOptionDropdown);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyEstimatedFoamPressureInputValue(String expectedEstimatedFoamPressureValue) {
		try {

			String actualEstimatedFoamPressureValue = estimatedFoamPressureInput.getAttribute("value").replace(",", "");
			Assert.assertEquals(actualEstimatedFoamPressureValue, expectedEstimatedFoamPressureValue,
					"Estimated Foam Pressure Input Value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyEstimatedFoamTemperatureInputValue(String expectedEstimatedFoamTemperatureValue) {
		try {

			String actualEstimatedFoamTemperatureValue = estimatedFoamTemperatureInput.getAttribute("value")
					.replace(",", "");
			Assert.assertEquals(actualEstimatedFoamTemperatureValue, expectedEstimatedFoamTemperatureValue,
					"Estimated Foam Temperature Input Value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMeteringPressureInputValue(String expectedMeteringPressureValue) {
		try {

			String actualMeteringPressureValue = meteringPressureInput.getAttribute("value").replace(",", "");
			Assert.assertEquals(actualMeteringPressureValue, expectedMeteringPressureValue,
					"Metering Pressure Input Value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMeteringTemperatureInputValue(String expectedEstimatedFoamTemperatureValue) {
		try {

			String actualEstimatedFoamTemperatureValue = meteringTemperatureInput.getAttribute("value").replace(",",
					"");
			Assert.assertEquals(actualEstimatedFoamTemperatureValue, expectedEstimatedFoamTemperatureValue,
					"Metering Temperature Input Value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void verifyDensityatFlowMeterInputValue(String
	// expectedDensityatFlowMeterValue) {
	// try {
	// Thread.sleep(1000);
	// String actualDensityatFlowMeterValue =
	// densityAtFlowMeterInput.getAttribute("value").replace(",", "");
	// Assert.assertEquals(actualDensityatFlowMeterValue,
	// expectedDensityatFlowMeterValue, "Density at FlowMeter Input Value does not
	// match!");
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void verifyDensityAtFlowMeterValue(Double expectedDensity) {
		try {
			Thread.sleep(1000);

			// Get actual value from UI
			String actualValueFromUI = densityAtFlowMeterInput.getAttribute("value").replace(",", "").trim();

			// Convert both to BigDecimal
			BigDecimal actualValue = new BigDecimal(actualValueFromUI);
			BigDecimal expectedValue = BigDecimal.valueOf(expectedDensity);

			// Compare numerically (ignores scale: 0.95 == 0.950)
			Assert.assertTrue(actualValue.compareTo(expectedValue) == 0,
					"Density at Flow Meter mismatch! Expected: " + expectedValue + " but Found: " + actualValue);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Failed to verify Density at Flow Meter value due to exception");
		}
	}

	public void verifyIsPulsedProppantCheckboxUncheckedBydefaultAndPulseDurationInputFieldReadableOnly() {
		try {
			boolean isChecked = elementUtils.isCheckboxChecked(pulsedProppantCheckbox);
			Assert.assertTrue(!isChecked, "Pulsed Proppant Checkbox should be unchecked, but it is not.");
			boolean isDisabled = "true".equals(pulseDurationInputField.getAttribute("disabled"));
			Assert.assertTrue(isDisabled, "pulse Duration Input Field should be disabled but it is not.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkedPulsedProppantcheckbox() {
		try {
			pulsedProppantCheckbox.click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyIsPulseDurationInputFieldEditable() {
		try {
			boolean isDisabled = "true".equals(pulseDurationInputField.getAttribute("disabled"));
			Assert.assertTrue(!isDisabled, "pulse Duration Input Field should be editable but it is not.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectIncludeStepAliasesCheckbox() {
		try {
			boolean isChecked = elementUtils.isCheckboxChecked(includeAliasesCheckbox);
			if (!isChecked) {
				elementUtils.clickElement(includeAliasesCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyIsStepAliasHeaderDisplayed() {
		try {
			Thread.sleep(1000);
			String expectedFieldText = "Step Alias";
			String actualFieldText = stepAliasHeader.getText();
			// Assert.assertEquals(actualFieldText, expectedFieldText, "Step Alias column
			// header does not displayedf!");
			// Assert.assertTrue(stepAliasHeader.isDisplayed(), "Step alias column header is
			// not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectOptionInStepTypeFieldForFirstRow() {
		try {
			elementUtils.doubleClickElement(stepTypeFirstRowElement);
			Thread.sleep(2000);
			for (int i = 0; i < 7; i++) {
				stepTypeFirstRowElement.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(300); // Small wait to ensure UI responds (optional)
			}
			WebElement stepTypeDropValue = driver.findElement(
					By.xpath("//td[text()='" + ReadData.readdata("StepTypeDropdownValueDesignFirstRow") + "']"));
			stepTypeDropValue.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoStepAliasFieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(stepAliasFirstRowElement);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[2]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("StepAliasValueDesignFirstRow"));
			stepAliasFirstRowElement.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFlowRateFieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(flowRateFirstRowElement);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FlowRateValueDesignFirstRow"));
			flowRateFirstRowElement.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterDataIntoFlowRateFieldForFirstRowsaveandnext() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(flowRateFirstRowElement1);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, "6.30");
			flowRateFirstRowElement1.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoPropConcFieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(propConcFirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("PropConcValueDesignFirstRow"));
			propConcFirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoCleanVolFieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(cleanVolFirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[3]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("CleanVolValueDesignFirstRow"));
			cleanVolFirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoStepLengthFieldForFirstRow() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(stepLengthFirstRowElementAfterStepAlias);
			WebElement Textarea2 = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_left ht_clone_inline_start']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea2, ReadData.readdata("StepLengthValueDesignFirstRow"));
			stepLengthFirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterUpdatedDataIntoFlowRateFieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(flowRateFirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_left ht_clone_inline_start']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FlowRateUpdatedValueDesignFirstRow"));
			flowRateFirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterUpdatedDataIntoPropConcFieldForFirstRow() {
		try {
			// Thread.sleep(1000);
			elementUtils.doubleClickElement(propConcFirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_left ht_clone_inline_start']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("PropConcUpdatedValueDesignFirstRow"));
			propConcFirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void enterDataIntoFlowRate2FieldForFirstRow() {
	// try {
	// Thread.sleep(2000);
	// elementUtils.doubleClickElement(flowRate2FirstRowElementAfterStepAlias);
	// WebElement Textarea12 =
	// driver.findElement(By.xpath("//textarea[@class='handsontableInput']"));
	// elementUtils.clearAndSendKeys(Textarea12,
	// ReadData.readdata("FlowRateUpdatedValueDesignFirstRow"));
	// flowRateFirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void enterDataIntoFlowRate2FieldForFirstRow() {
		try {
			// Double click the FlowRate2 cell
			elementUtils.doubleClickElement(flowRate2FirstRowElementAfterStepAlias);

			// Explicit wait for Handsontable editor to appear and become visible
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			By editorLocator = By.xpath("//textarea[@class='handsontableInput']");

			WebElement editor = wait.until(ExpectedConditions.visibilityOfElementLocated(editorLocator));

			// Clear and send keys directly to the editor
			editor.clear();
			editor.sendKeys(ReadData.readdata("FlowRateUpdatedValueDesignFirstRow"));

			// Confirm edit (ENTER on the editor itself)
			editor.sendKeys(Keys.ENTER);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFlowRate1FieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(flowRate1FirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_left ht_clone_inline_start']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow"));
			flowRate1FirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFlowRate1FieldForFirstRow1() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(flowRate1FirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FlowRate1UpdatedValueDesignFirstRow"));
			flowRate1FirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDifferentValueIntoFlowRate2FieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(flowRate2FirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_left ht_clone_inline_start']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FlowRate2ValueDesignFirstRow"));
			flowRate2FirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSecondValueIntoFlowRate2FieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(flowRate2FirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_left ht_clone_inline_start']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FlowRate2UpdatedValue2DesignFirstRow"));
			flowRateFirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectOptionInProppantTypeFieldForFirstRow() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Relocate the element fresh every time before using
			WebElement cellToClick1 = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@id='cell-0-13'])[2]")));

			// Click on the cell
			Thread.sleep(2000);
			cellToClick1.click();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_LEFT).perform();
			action.sendKeys(Keys.ARROW_LEFT).perform();
			action.sendKeys(Keys.ARROW_LEFT).perform();
			action.sendKeys(Keys.ARROW_LEFT).perform();

			elementUtils.doubleClickElement(proppantTypeFirstRowElementAfterStepAlias1);
			Thread.sleep(2000);
			for (int i = 0; i < 3; i++) {
				proppantTypeFirstRowElementAfterStepAlias1.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(300); // Small wait to ensure UI responds (optional)
			}
			WebElement stepTypeDropValue1 = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("Proppant2") + "']"));
			stepTypeDropValue1.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterValueIntoPropConc2FieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(propConc2FirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[3]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("PropConc2ValueDesignFirstRow"));
			propConc2FirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepLengthCalculation() {
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double CalculateCleanRateCalculationForRow(String prop_sgStr) {
		try {
			String flowRateStr = ReadData.readdata("FlowRateValueDesignFirstRow");
			String propConcStr = ReadData.readdata("PropConcValueDesignFirstRow");
			double flowRate = Double.parseDouble(flowRateStr);
			double propConc = Double.parseDouble(propConcStr);
			double prop_sg = Double.parseDouble(prop_sgStr);
			double cleanRate;
			double rho = prop_sg * 8.345404; // Calculate rho
			cleanRate = flowRate / (1 + (propConc / rho));
			return cleanRate;
		} catch (NumberFormatException e) {
			System.err.println("Error: Invalid number format. Please check the input values.");
		} catch (Exception e) {
			System.err.println("Error: An unexpected issue occurred.");
			e.printStackTrace();
		}
		return -1.0; // Returning a default value in case of an error
	}

	public double CalculateCleanRate2CalculationForRow(String prop_sgStr) {
		try {
			String flowRate2Str = ReadData.readdata("FlowRateValueDesignFirstRow");
			String propConc2Str = ReadData.readdata("PropConcValueDesignFirstRow");
			double flowRate = Double.parseDouble(flowRate2Str);
			double propConc = Double.parseDouble(propConc2Str);
			double prop_sg = Double.parseDouble(prop_sgStr);
			double cleanRate2;
			double rho = prop_sg * 8.345404; // Calculate rho
			cleanRate2 = flowRate / (1 + (propConc / rho));
			return cleanRate2;
		} catch (NumberFormatException e) {
			System.err.println("Error: Invalid number format. Please check the input values.");
		} catch (Exception e) {
			System.err.println("Error: An unexpected issue occurred.");
			e.printStackTrace();
		}
		return -1.0; // Returning a default value in case of an error
	}

	public void verifyCalculatedStepLengthValueForFirstRow(String expectedStepLengthValue) {
		try {
			Thread.sleep(1000);
			String actualDefaultValue = stepLengthFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedStepLengthValue,
					"Calculated step length value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCalculatedStepLengthValueIfFlowRate2PresentForFirstRow(String expectedStepLengthValue) {
		try {

			String actualDefaultValue = stepLengthFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedStepLengthValue,
					"Calculated step length value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCalculatedStepLengthValueIfFlowRate2PresentForFirstRow1(String expectedStepLengthValue) {
		try {

			String actualDefaultValue = stepLengthFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedStepLengthValue,
					"Calculated step length value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCalculatedCleanVolValueForFirstRow(String expectedCleanVolValue) {
		try {

			String actualDefaultValue = cleanVolFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedCleanVolValue,
					"Calculated Clean Vol value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCalculatedCleanVolValueForFirstRow2(String expectedCleanVolValue) {
		try {
			Thread.sleep(2000);
			String actualDefaultValue = cleanVolFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedCleanVolValue,
					"Calculated Clean Vol value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void verifyCalculatedCleanVolValueForFirstRow2(String
	// expectedCleanVolValue) {
	// try {
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//
	// // Wait until text updates to expected value
	// wait.until(ExpectedConditions.textToBePresentInElement(
	// cleanVolFirstRowElementAfterStepAlias,
	// expectedCleanVolValue
	// ));
	//
	// String actualDefaultValue =
	// cleanVolFirstRowElementAfterStepAlias.getText().trim();
	//
	// Assert.assertEquals(
	// actualDefaultValue,
	// expectedCleanVolValue,
	// "Calculated Clean Vol value does not match!"
	// );
	//
	// } catch (TimeoutException e) {
	// Assert.fail("Clean Vol value did not update to expected value: " +
	// expectedCleanVolValue);
	// } catch (Exception e) {
	// e.printStackTrace();
	// Assert.fail("Exception while verifying Calculated Clean Vol value");
	// }
	// }

	public void verifyCalculatedCleanVolValueForFirstRow3(String expectedCleanVolValue) {
		try {
			Thread.sleep(1000);
			String actualDefaultValue = cleanVolFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedCleanVolValue,
					"Calculated Clean Vol value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCalculatedCleanVolValueForFirstRow4(String expectedCleanVolValue) {
		try {
			Thread.sleep(1000);
			String actualDefaultValue = cleanVolFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedCleanVolValue,
					"Calculated Clean Vol value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCalculatedCumulTimeValueInMinSecForFirstRow(String expectedCumulTimeValue) {
		try {

			String actualDefaultValue = cumulTimeFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedCumulTimeValue,
					"Calculated cumul Time in min sec value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectVolumeFromTimeCalculateOption() {
		try {
			Thread.sleep(1000);
			CommonUtils.scrollToBottom(driver);
			elementUtils.clickElement(volumeFromTimeOption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectTimeFromVolumeCalculateOption() {
		try {
			Thread.sleep(1000);
			CommonUtils.scrollToBottom(driver);
			elementUtils.clickElement(timeFromVolumeOption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCleanVolFieldIsReadOnlyWhenVolumeFromTimeIsSelected() {
		try {
			WebElement cleanVol = driver.findElement(By.xpath("(//td[@id='cell-0-10'])[1]"));
			elementUtils.verifyCellIsReadOnly(cleanVol);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepLengthFieldIsEditableWhenVolumeFromTimeIsSelected() {
		try {
			elementUtils.verifyCellIsEditable(stepLengthFirstRowElementAfterStepAlias);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepLengthFieldIsReadOnlyWhenVolumeFromTimeIsSelected() {
		try {
			elementUtils.verifyCellIsReadOnly(stepLengthFirstRowElementAfterStepAlias);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCleanVolFieldIsEditableWhenVolumeFromTimeIsSelected() {
		try {
			elementUtils.verifyCellIsEditable(cleanVolFirstRowElementAfterStepAlias);
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

	public void verifyflowRate2ValueAfterSave(String expectedflowRate1Value) {
		try {
			Thread.sleep(1000);
			String actualDefaultValue = flowRate2FirstRowElementAfterStepAliasAfterSave.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"flow rate 2 value does not match flow rate 1!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPropConc1Value(String expectedflowRate1Value) {
		try {
			Thread.sleep(2000);
			String actualDefaultValue = propConc1FirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"Entered prop conc 1 value does not match!");
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

	public void verifyPropConc2ValueAfterSave(String expectedflowRate1Value) {
		try {

			String actualDefaultValue = propConc2FirstRowElementAfterStepAliasAfterSave.getText();
			Assert.assertEquals(actualDefaultValue, expectedflowRate1Value,
					"flow rate 2 value does not match flow rate 1!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCalculatedCleanVolValueWhenForFirstRow(String expectedCleanVolValue) {
		try {

			String actualDefaultValue = cleanVolFirstRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedCleanVolValue,
					"Calculated Clean Vol value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterUpdatedDataIntoPropConc1FieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(propConc1FirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("PropConcValueDesignFirstRow"));
			propConc1FirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterUpdatedDataIntoPropConc2FieldForFirstRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(propConc2FirstRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("PropConc2ValueDesignFirstRow"));
			propConc2FirstRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectOptionInFluidTrypeFieldForSecondRow() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(fluidTypeFirstRowElementAfterStepAlias);
			Thread.sleep(2000);
			WebElement stepTypeDropValue2 = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("Fluid2") + "']"));
			stepTypeDropValue2.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Data Entry for Second Row

	// public void SelectOptionInStepTypeFieldForSecondRow() {
	// try {
	// elementUtils.doubleClickElement(stepTypeSecondRowElement);
	// Thread.sleep(2000);
	// CommonUtils.scrollToBottom(driver);
	// WebElement
	// stepTypeDropValue=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata(StepTypeDropdownValueDesignSecondRow)+"']"));
	// stepTypeDropValue.click();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void SelectOptionInStepTypeFieldForSecondRowCirc() {
		try {
			elementUtils.doubleClickElement(stepTypeSecondRowElement);
			Thread.sleep(2000);
			for (int i = 0; i < 12; i++) {
				stepTypeFirstRowElement.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(300); // Small wait to ensure UI responds (optional)
			}
			WebElement circ = driver.findElement(
					By.xpath("//td[text()='" + ReadData.readdata("StepTypeDropdownValueDesignSecondRow") + "']"));
			circ.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectOptionInStepTypeFieldForSecondRowFlowBack() {
		try {
			elementUtils.doubleClickElement(stepTypeSecondRowElement);
			Thread.sleep(2000);
			for (int i = 0; i < 13; i++) {
				stepTypeFirstRowElement.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(300); // Small wait to ensure UI responds (optional)
			}
			WebElement circ = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("StepTypeOptionFlowback") + "']"));
			circ.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectOptionInStepTypeFieldForSecondRowMainFrac() {
		try {
			elementUtils.doubleClickElement(stepTypeSecondRowElement);
			Thread.sleep(2000);
			for (int i = 0; i < 9; i++) {
				stepTypeFirstRowElement.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(300); // Small wait to ensure UI responds (optional)
			}
			WebElement mainfrac = driver.findElement(
					By.xpath("//td[text()='" + ReadData.readdata("StepTypeOptionPropMainfracacid") + "']"));
			mainfrac.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectOptionInStepTypeFieldForSecondRowSepTest() {
		try {
			elementUtils.doubleClickElement(stepTypeSecondRowElement);
			Thread.sleep(2000);
			for (int i = 0; i < 5; i++) {
				stepTypeFirstRowElement.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(300); // Small wait to ensure UI responds (optional)
			}
			WebElement septest = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("StepTypeOptionStepRatetest") + "']"));
			septest.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectOptionInStepTypeFieldForSecondRowPropSlug() {
		try {
			elementUtils.doubleClickElement(stepTypeSecondRowElement);
			Thread.sleep(2000);
			for (int i = 0; i < 5; i++) {
				stepTypeFirstRowElement.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(300); // Small wait to ensure UI responds (optional)
			}
			WebElement ps = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("StepTypeOptionPropSlug") + "']"));
			ps.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectOptionInStepTypeFieldForSecondRowShutIn() {
		try {
			elementUtils.doubleClickElement(stepTypeSecondRowElement);
			Thread.sleep(2000);
			for (int i = 0; i < 12; i++) {
				stepTypeFirstRowElement.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(300); // Small wait to ensure UI responds (optional)
			}
			WebElement shut = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("StepTypeOptionShutIn") + "']"));
			shut.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectOptionInStepTypeFieldForSecondRowShutInFlow() {
		try {
			elementUtils.doubleClickElement(stepTypeSecondRowElement);
			Thread.sleep(2000);
			for (int i = 0; i < 14; i++) {
				stepTypeFirstRowElement.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(300); // Small wait to ensure UI responds (optional)
			}
			WebElement shutflow = driver.findElement(By.xpath("//td[@aria-posinset='14']"));
			shutflow.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectFlowbackOptionInStepTypeFieldForSecondRow() {
		try {
			elementUtils.doubleClickElement(stepTypeSecondRowElement);
			Thread.sleep(2000);
			WebElement stepTypeDropValue = driver
					.findElement(By.xpath("(//td[text()='" + ReadData.readdata("StepTypeOptionFlowback") + "'])[2]"));
			CommonUtils.scrollToBottom(driver);
			Thread.sleep(1000);
			stepTypeDropValue.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFlowRateFieldForSecondRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(flowRateSecondRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FlowRateValueDesignSecondRow"));
			flowRateSecondRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoPropConcFieldForSecondRow() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(propConcSecondRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_left ht_clone_inline_start']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("PropConcValueDesignSecondRow"));
			propConcSecondRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantTypeSelectedOptionForSecondRow() {
		try {
			String expectedProppantTypeOption = ReadData.readdata("Proppant2");
			String actualDefaultValue = proppantTypeSecondRowElementAfterStepAlias.getText().trim().replace("▼", "")
					.trim();
			Assert.assertEquals(actualDefaultValue, expectedProppantTypeOption,
					"Selected proppant type option does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCalculatedCleanVolValueForSecondRow(String expectedCleanVolValue) {
		try {

			String actualDefaultValue = cleanVolSecondRowElementAfterStepAlias.getText();
			Assert.assertEquals(actualDefaultValue, expectedCleanVolValue,
					"Calculated Clean Vol value for second row does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFluidTypeSelectedOptionForSecondRow() {
		try {
			String expectedFluidTypeOption = ReadData.readdata("Fluid2");
			String actualDefaultValue = fluidTypeSecondRowElementAfterStepAlias.getText().trim().replace("▼", "")
					.trim();
			Assert.assertEquals(actualDefaultValue, expectedFluidTypeOption,
					"Selected fluid type option does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFlowRateAndCleanVolResetToZeroforSecondRow() {
		try {
			Thread.sleep(1000);
			Assert.assertEquals(flowRateSecondRowElementAfterStepAlias.getText(), "0.00",
					"Flow rate value does not Set to 0!");
			Assert.assertEquals(cleanVolSecondRowElementAfterStepAlias.getText(), "0",
					"Clean Vol value does not Set to 0!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFlowRateResetToOneforSecondRow() {
		try {
			Assert.assertEquals(flowRateSecondRowElementAfterStepAlias.getText(), "1.00",
					"Flow rate value does not Set to 1!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFluidTypeSelectedToShutInAndOnlyReadForSecondRow() {
		try {
			Assert.assertEquals(fluidTypeSecondRowElementAfterStepAlias.getText().trim().replace("▼", "").trim(),
					"Shut-in", "Selected fluid type option does not set to shut-in!");
			elementUtils.verifyCellIsReadOnly(fluidTypeSecondRowElementAfterStepAlias);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFluidTypeSelectedToFlowbackAndOnlyReadForSecondRow() {
		try {
			Assert.assertEquals(fluidTypeSecondRowElementAfterStepAlias.getText().trim().replace("▼", "").trim(),
					"Flowback", "Selected fluid type option does not set to shut-in!");
			elementUtils.verifyCellIsReadOnly(fluidTypeSecondRowElementAfterStepAlias);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoStepLengthFieldForSecondRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(stepLengthSecondRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_left ht_clone_inline_start']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("StepLengthValueDesignSecondRow"));
			stepLengthSecondRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClearandSetZeroToCleanVolFieldForSecondRow() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(cleanVolSecondRowElementAfterStepAlias);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, "0");
			cleanVolSecondRowElementAfterStepAlias.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepLengthFieldIsEditableWhenVolumeFromTimeIsSelectedForSecondRow() {
		try {
			elementUtils.verifyCellIsEditable(stepLengthSecondRowElementAfterStepAlias);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifystepTypeSelectedValueForFirstRow(String expectedStepTypeValue) {
		try {

			String actualDefaultValue = stepTypeFirstRowElement.getText().trim().replace("▼", "").trim();
			Assert.assertEquals(actualDefaultValue, expectedStepTypeValue, "Step type value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifystepTypeSelectedValueForSecond(String expectedStepTypeValue) {
		try {

			String actualDefaultValue = stepTypeSecondRowElement.getText().trim().replace("▼", "").trim();
			Assert.assertEquals(actualDefaultValue, expectedStepTypeValue, "Step type value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String convertToNegative(String input) {
		try {
			double number = Double.parseDouble(input); // Convert string to double
			return "-" + Math.abs(number); // Ensure the output is negative and return as string
		} catch (NumberFormatException e) {
			return "Invalid input"; // Handle non-numeric inputs
		}
	}

	public void verifyFlowRateAndCleanVolResetToNegativeforSecondRow(String expectedCleanVol) {
		try {
			Thread.sleep(1000);
			Assert.assertEquals(flowRateSecondRowElementAfterStepAlias.getText(),
					convertToNegative(ReadData.readdata("FlowRateValueDesignSecondRow")),
					"Flow rate value does not change to negative!");
			Assert.assertEquals(cleanVolSecondRowElementAfterStepAlias.getText(), expectedCleanVol,
					"Clean Vol value does not change to negative!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void SelectOptionInSelectCustomColumnsForSecondRow() {
	// try {
	// selectCustomColumn.click();
	// Thread.sleep(2000);
	// WebElement
	// selectAllOptionValue=driver.findElement(By.xpath("(//div[text()='Select
	// All']/parent::li/input)[2]"));
	// selectAllOptionValue.click();
	// Thread.sleep(2000);
	// selectCustomColumn.click();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	//

	public void SelectOptionInSelectCustomColumnsForSecondRow() {
		try {
			// Open the custom column dropdown
			selectCustomColumn.click();
			Thread.sleep(3000);

			// Wait until the Select All checkbox is present
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement selectAllOptionValue = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("(//div[text()='Select All']/parent::li/input)[2]")));

			// Scroll into view just in case
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectAllOptionValue);

			// Use JavaScript click to avoid interception
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectAllOptionValue);

			Thread.sleep(2000);

			// Close the dropdown again
			selectCustomColumn.click();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to select 'Select All' option: " + e.getMessage());
		}
	}

	public void UnSelectAllOptionInSelectCustomColumns() {
		try {
			selectCustomColumn.click();
			Thread.sleep(1000);
			WebElement UnselectAllOptionValue = driver.findElement(By.xpath("(//div[text()='UnSelect All'])[2]"));
			UnselectAllOptionValue.click();
			selectCustomColumn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Data updation into common fields

	public void enterDataIntoEstimatedFoamPressureInputField() {
		try {
			// CommonUtils.scrollToBottom(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath("//button[text()='  Save ']"));
			js.executeScript("arguments[0].scrollIntoView(true);", element);

			// elementUtils.clearElement(estimatedFoamPressure);
			estimatedFoamPressure.clear();
			Thread.sleep(2000);
			estimatedFoamPressure.click();
			estimatedFoamPressure.sendKeys(ReadData.readdata("EstimatedFoamPressure"));
			// elementUtils.clearAndSendKeys(estimatedFoamPressure,
			// ReadData.readdata("EstimatedFoamPressure"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoEstimatedFoamTemperatureInputField() {
		try {
			CommonUtils.scrollToBottom(driver);
			Thread.sleep(1000);
			elementUtils.clearAndSendKeys(estimatedFoamTemperature, ReadData.readdata("EstimatedFoamTemperature"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoMeteringPressureInputField() {
		try {
			CommonUtils.scrollToBottom(driver);
			Thread.sleep(1000);
			elementUtils.clearAndSendKeys(meteringPressure, ReadData.readdata("MeteringPressure"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoMeteringTemperatureInputField() {
		try {
			CommonUtils.scrollToBottom(driver);
			Thread.sleep(1000);
			elementUtils.clearAndSendKeys(meteringTemperature, ReadData.readdata("MeteringTemperature"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoPulseDurationInputField() {
		try {
			boolean isDisabled = "true".equals(pulseDurationInputField.getAttribute("disabled"));
			if (!isDisabled) {
				elementUtils.clearAndSendKeys(pulseDuration, ReadData.readdata("PulseDuration"));
			} else {
				pulsedProppantCheckbox.click();
				Thread.sleep(1000);
				elementUtils.clearAndSendKeys(pulseDuration, ReadData.readdata("PulseDuration"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnInFractureOption() {
		try {
			CommonUtils.scrollToBottom(driver);
			Thread.sleep(1000);
			elementUtils.clickElement(inFracture);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectQualityOptionInDropdown(String QualityOptionName) {
		try {
			CommonUtils.scrollToBottom(driver);
			elementUtils.clickElement(qualityOptionDropdown);
			Thread.sleep(1000);
			WebElement constant = driver.findElement(By.xpath("//span[text()=' Constant Internal Phase ']"));
			elementUtils.clickElement(constant);
			Thread.sleep(1000);
			// elementUtils.selectOptionInDropdown(qualityOptionDropdown,
			// QualityOptionName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void selectQualityOptionInDropdownQuality() {
	// try {
	// CommonUtils.scrollToBottom(driver);
	// elementUtils.clickElement(qualityOptionDropdown);
	// WebElement constant1 = driver.findElement(By.xpath("//div[text()=' Constant
	// Internal Phase ']"));
	// Waits.waitForClickable(driver, constant1).click();
	//
	//// elementUtils.clickElement(constant);
	//// elementUtils.selectOptionInDropdown(qualityOptionDropdown,
	// QualityOptionName);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void selectQualityOptionInDropdownQuality() {
		try {
			// Scroll dropdown into view
			WebElement dropdown = qualityOptionDropdown;
			((JavascriptExecutor) driver)
					.executeScript("arguments[0].scrollIntoView(true);", dropdown);

			// Try normal click first
			try {
				Waits.waitForClickable(driver, dropdown).click();
			} catch (Exception e) {
				// Fallback to JS click
				((JavascriptExecutor) driver)
						.executeScript("arguments[0].click();", dropdown);
			}

			// Locate Constant option
			WebElement constantOption = driver.findElement(
					By.xpath("//div[normalize-space()='Constant Internal Phase']"));

			// Wait until visible
			Waits.waitForVisibility(driver, constantOption);

			// Try normal click
			try {
				constantOption.click();
			} catch (Exception e) {
				// JS click fallback
				((JavascriptExecutor) driver)
						.executeScript("arguments[0].click();", constantOption);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to select Quality Option: Constant Internal Phase");
		}
	}

	public void verifyPulseDurationInputFieldValue(String expectedEstimatedFoamTemperatureValue) {
		try {

			String actualEstimatedFoamTemperatureValue = pulseDuration.getAttribute("value").replace(",", "");
			Assert.assertEquals(actualEstimatedFoamTemperatureValue, expectedEstimatedFoamTemperatureValue,
					"Pulse Duration Input Field Value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySelecetedQualityOptionDropdown(String expectedQualityOptionName) {
		try {
			CommonUtils.scrollToBottom(driver);

			elementUtils.isOptionSelected(qualityOptionDropdown, expectedQualityOptionName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySelecetedQualityOptionDropdownCIP() {
		try {
			CommonUtils.scrollToBottom(driver);
			Assert.assertEquals(qualityOptionDropdown.getAttribute("innerText").trim(), "Conventional Quality",
					"Quality dropdown option name is mismatched");
			// elementUtils.isOptionSelected(qualityOptionDropdown,
			// expectedQualityOptionName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementSaveButton() {
		try {
			CommonUtils.scrollToBottom(driver);
			Waits.waitForClickable(driver, saveButton).click();
			// elementUtils.clickElement(saveButton);
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Verification after saving the data

	public void verifySelecetedTreatmentTypeOptionDropdown(String expectedOptionName) {
		try {
			Assert.assertEquals(treatmentTypeDropdown.getAttribute("innerText").trim(), "N2 & CO2",
					"Treatment type bydefault dropdown value mismatched");
			// elementUtils.isOptionSelected(treatmentTypeDropdown, expectedOptionName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySelecetedTreatmentTypeOptionDropdownTreatmentType() {
		try {
			Assert.assertEquals(treatmentTypeDropdown.getAttribute("innerText").trim(), "N2 & CO2",
					"Treatment type bydefault dropdown value mismatched");
			// elementUtils.isOptionSelected(treatmentTypeDropdown, expectedOptionName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySelecetedPropmodeOptionDropdown(String expectedOptionName) {
		try {

			elementUtils.isOptionSelected(propModeDropdown, expectedOptionName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySelecetedPropmodeOptionDropdownRamped() {
		try {
			Assert.assertEquals(propModeDropdown.getAttribute("innerText").trim(), "Ramped",
					"Prop mode type bydefault dropdown value mismatched");
			// elementUtils.isOptionSelected(propModeDropdown, expectedOptionName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Enter data for first row when treatment type is N2 & CO2 and Prop mode is
	// ramped and step alias is enabled

	public void enterDataIntoN2Rate1FieldForFirstRow(String n2Rate1Value) {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(n2Rate1);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata(n2Rate1Value));
			n2Rate1.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoN2Rate2FieldForFirstRow(String n2Rate2Value) {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(n2Rate2);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata(n2Rate2Value));
			n2Rate2.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoCO2Rate1FieldForFirstRow(String co2Rate1Value) {
		try {
			Thread.sleep(1000);
			co2Rate1.click();
			for (int i = 0; i < 3; i++) {
				co2Rate1.sendKeys(Keys.ARROW_RIGHT);
			}
			Thread.sleep(1000);
			elementUtils.doubleClickElement(co2Rate1);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_left ht_clone_inline_start']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata(co2Rate1Value));
			co2Rate1.sendKeys(Keys.ENTER);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoCO2Rate2FieldForFirstRow(String co2Rate2Value) {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(co2Rate2);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata(co2Rate2Value));
			co2Rate2.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoBtmPropConc1FieldForFirstRow(String btmPropConc1Data) {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(btmPropConc1);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata(btmPropConc1Data));
			btmPropConc1.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoBtmPropConc2FieldForFirstRow(String btmPropConc2Data) {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(btmPropConc2);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata(btmPropConc2Data));
			btmPropConc2.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoBtmSlurryFoamRateFieldForFirstRow(String btmSlurryFoamRateValue) {
		try {
			btmSlurryFoamRate.click();
			for (int i = 0; i < 5; i++) {
				btmSlurryFoamRate.sendKeys(Keys.ARROW_RIGHT);
			}
			Thread.sleep(1000);
			elementUtils.doubleClickElement(btmSlurryFoamRate);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata(btmSlurryFoamRateValue));
			btmSlurryFoamRate.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoBtmN2QualRateFieldForFirstRow(String btmN2QualRateValue) {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(btmN2QualCell);
			WebElement Textarea = driver.findElement(By.xpath(
					"//div[@class='handsontableInputHolder ht_clone_master']//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata(btmN2QualRateValue));
			btmN2QualCell.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void enterDataIntoBtmCO2QualRateFieldForFirstRow(String
	// btmCO2QualRateValue) {
	// try {
	// Thread.sleep(1000);
	// elementUtils.doubleClickElement(btmCo2QualCell);
	// Thread.sleep(1000);
	// WebElement Textarea =
	// driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[2]"));
	// elementUtils.clearAndSendKeys(Textarea,
	// ReadData.readdata(btmCO2QualRateValue));
	// btmCo2QualCell.sendKeys(Keys.ENTER);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void enterDataIntoBtmCO2QualRateFieldForFirstRow(String btmCO2QualRateValue) {
		try {
			Thread.sleep(1000);
			// WebElement cellToClick =
			// driver.findElement(By.xpath("(//th[div[contains(text(),'Btm Prop Conc
			// 2')]])[2]"));
			//
			// // Click on the cell
			// Thread.sleep(2000);
			// cellToClick.click();
			// Actions action = new Actions(driver);
			// action.sendKeys(Keys.ARROW_RIGHT).perform();
			// action.sendKeys(Keys.ARROW_RIGHT).perform();
			// action.sendKeys(Keys.ARROW_RIGHT).perform();
			// action.sendKeys(Keys.ARROW_RIGHT).perform();
			// action.sendKeys(Keys.ARROW_RIGHT).perform();
			// action.sendKeys(Keys.ARROW_RIGHT).perform();
			// action.sendKeys(Keys.ARROW_RIGHT).perform();
			elementUtils.doubleClickElement(btmCo2QualCell);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Wait for ANY active textarea input to appear
			WebElement textarea = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//textarea[@class='handsontableInput'])[3]")));
			elementUtils.clearAndSendKeys(textarea, ReadData.readdata(btmCO2QualRateValue));
			textarea.sendKeys(Keys.ENTER); // send enter to the editor itself
			// or btmCo2QualCell.sendKeys(Keys.ENTER); if grid expects it
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void enterDataIntoBtmCleanFoamVolumeFieldForFirstRow(String
	// btmCleanFoamVolumeInput) {
	// try {
	// Thread.sleep(2000);
	// elementUtils.doubleClickElement(btmCleanFoamVolumeCell);
	// Thread.sleep(1000);
	// WebElement Textarea =
	// driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[2]"));
	// elementUtils.clearAndSendKeys(Textarea,
	// ReadData.readdata(btmCleanFoamVolumeInput));
	// btmCleanFoamVolumeCell.sendKeys(Keys.ENTER);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void enterDataIntoBtmCleanFoamVolumeFieldForFirstRow(String btmCleanFoamVolumeInput) {
		try {
			// Double click on the target cell to activate editor
			elementUtils.doubleClickElement(btmCleanFoamVolumeCell);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait until the editor textarea is visible
			WebElement textarea = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//textarea[@class='handsontableInput'])[3]")));

			// Clear and enter the value from test data
			elementUtils.clearAndSendKeys(textarea, ReadData.readdata(btmCleanFoamVolumeInput));

			// Confirm with ENTER (on the editor)
			textarea.sendKeys(Keys.ENTER);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Verification of enter input field data when treatment type is N2 & CO2 and
	// Prop mode is ramped and step alias is enabled

	public void verifyEnteredStepAliasCellValueFirstRow(String expectedValue) {
		try {
			Thread.sleep(2000);
			String actualDefaultValue = stepAliasFirstRowElementAfterSave.getAttribute("innerText").trim();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Entered step alias value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyN2Rate1CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = n2Rate1AfterSave.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered N2 Rate 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyN2Rate2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = n2Rate2AfterSave.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered N2 Rate 2 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCO2Rate1CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = co2Rate1AfterSave.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered CO2 Rate 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCO2Rate2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = co2Rate2AfterSave.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered CO2 Rate 2 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCleanVolCellValueForFirstRow(String expectedValue) {
		try {
			Thread.sleep(1000);
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
			String actualDefaultValue = btmPropConc1As.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm Prop Conc 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmPropConc1CellValueForFirstRowAfterSave(String expectedValue1) {
		try {
			String actualDefaultValue1 = btmPropConc1As.getText();
			Assert.assertEquals(actualDefaultValue1, expectedValue1, "Entered Btm Prop Conc 1 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmPropConc2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmPropConc2As.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm Prop Conc 2 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmSlurryFoamRateCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmSlurryFoamRateAs.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm Slurry Foam Rate value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmN2QualRateCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmN2QualCellAs.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm N2 Qual value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmCO2QualRateCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmCo2QualCellAs.getText();
			Assert.assertEquals(actualDefaultValue, ReadData.readdata(expectedValue),
					"Entered Btm CO2 Qual value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBtmCleanFoamVolumeCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = btmCleanFoamVolumeCellAs.getText();
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

	public void verifyCumulTimeCellValueForFirstRow(String expectedValue) {
		try {
			Thread.sleep(3000);
			String actualDefaultValue = cumulTimeAfterN2Co2RampedAs.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Cumul Time value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepSlurryCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = stepSluryAfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Step Slurry value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCumulGelCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = cumulGelAfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Cumul gel value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepPropCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = stepPropAfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Step prop value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCumulPropCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = cumulPropAfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Cumul prop value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCleanRateCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = cleanRateAfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Clean Rate value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCumulSlurryCellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = cumulSlurryAfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Cumul Slurryvalue does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepN2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = stepN2AfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Step N2value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCumulN2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = cumulN2AfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Cumul N2 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStepCO2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = stepCO2AfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "Step CO2 value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCumulCO2CellValueForFirstRow(String expectedValue) {
		try {

			String actualDefaultValue = cumulCO2AfterN2Co2Ramped.getText();
			Assert.assertEquals(actualDefaultValue, expectedValue, "value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ShiftRightwardInHandsontable() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

			// Relocate the element fresh every time before using
			WebElement cellToClick = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@id='cell-0-10'])[2]")));

			// Click on the cell
			Thread.sleep(2000);
			cellToClick.click();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyN2RateCellValueForFirstRow(String expectedValue) {
		try {
			Thread.sleep(1000);
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

	public void pasteDataToColumnAsNumeric(String sheetName, String columnHeader, WebElement element,
			boolean performClick) throws Exception {
		try {
			Actions actions = new Actions(driver);
			ExecelReader exl = new ExecelReader();
			List<String> excelData = exl.getExcelDataWithColumn(sheetName, columnHeader);

			if (excelData.isEmpty()) {
				System.out.println("No data found in the specified column.");
				return;
			}

			if (performClick) { // Only click if performClick is true
				actions.click(element).perform();
				Thread.sleep(5000);
			}

			// Copy data to clipboard
			StringSelection stringSelection = new StringSelection(String.join("\n", excelData));
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			// Ensure element is interactable
			if (element.isDisplayed() && element.isEnabled()) {
				Robot robot = new Robot();
				robot.delay(300);

				// Press CTRL + V
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);

				// Press ENTER to confirm the input
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

				// System.out.println("Data pasted successfully using keyboard actions.");
			} else {
				System.out.println("Element is not interactable");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value = arguments[1];", element, excelData.get(0));
			}
		} catch (Exception e) {
			System.out.println("Error while pasting data: " + e.getMessage());
		}
	}

	public void PastingDataToColumnWise() {
		try {
			Thread.sleep(2000);
			pasteDataToColumnAsNumeric("Sheet1", "Step Type", getStepType(), false);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}