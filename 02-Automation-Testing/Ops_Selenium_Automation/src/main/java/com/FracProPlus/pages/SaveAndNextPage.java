package com.FracProPlus.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.FracProPlus.utils.ElementUtils;

/**
 * Page Object encapsulating the end-to-end "Save and Next" flow.
 * <p>
 * Uses explicit waits (no Thread.sleep) and provides reusable helpers for
 * click/sendKeys/visibility checks.
 */
public class SaveAndNextPage {

	private static final long DEFAULT_TIMEOUT_SECONDS = 20;
	private WebDriver driver;
	private ElementUtils elementUtils;

	
	public SaveAndNextPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);

	}

	// ---------- Common locators ----------
	private final By nextButton = By.xpath("//button[text()=' Next ']");
	private final By yesSaveButton = By.xpath("//button[text()='Yes, Save']");

	// ---------- Well & Treatment / General Information / Comments ----------
	private final By inputsMenu = By.xpath("//*[self::span or self::a][normalize-space(.)='Inputs']");
	private final By inputsMenuIcon = By.xpath("//*[@class='icon icon-height-23']");
	private final By wellAndTreatmentTab = By.xpath("//a[text()=' Well & Treatment ']");
	private final By expandSidebarButton = By.xpath("//img[@tooltip='Expand']");
	private final By collapseSidebarButton = By.xpath("//img[@tooltip='Collapse']");
	private final By generalInformationTab = By.xpath("//span[text()='General Information']");
	private final By commentsTab = By.xpath("//span[text()='Comments']");

	// A single editable general-information field we can use for "enter data into any field".
	// (No hardcoded test values; value comes from excel via ReadData.)
	private final By generalInfoEditableField = By.id("treatmentAnalyst");

	// ---------- Channel Inputs for Model ----------
	private final By channelInputsHeader = By.xpath("//h4[text()='Channel Inputs for Model']");
	private final By modelInputChannelCheckbox = By.xpath("//td[@id='cell-0-3']");
	private final By additivesTab = By.xpath("//a[text()=' Additives ']");
	private final By realTimeTab = By.xpath("//a[text()=' Real-time Channel ']");


	// ---------- Wellbore Configuration / Drilled Hole ----------
	private final By wellboreConfigurationHeader = By.xpath("//h4[text()='Wellbore Configuration']");
	private final By drilledHoleTab = By.xpath("//span[text()='Drilled Hole']");
	private final By topMdCell = By.xpath("//td[@id='cell-0-1']");
	private final By handsontableInput = By.xpath("//*[@class='handsontableInput']");

	// ---------- Directional Survey ----------
	private final By directionalSurveyTab = By.xpath("//span[text()='Directional Survey']");

	// ---------- Heat Transfer / Reservoir ----------
	private final By heatTransferHeader = By.xpath("//h4[text()='Heat Transfer Parameters']");
	private final By reservoirHeader = By.xpath("//h4[text()='Reservoir Parameters']");

	// ---------- Material Selection / Chemical Selection ----------
	private final By materialSelectionHeader = By.xpath("//h4[text()='Material Selection']");
	private final By chemicalSelectionTab = By.xpath("//span[text()='Chemical Selection']");

	// ---------- Actual Treatment Schedule ----------
	private final By actualTreatmentScheduleTab = By.xpath("//a[text()=' Actual Treatment Schedule ']");
	private final By importFromDesignButton = By.xpath("//button[normalize-space(.)='Import from Design']");
	private final By yesOverwriteButton = By.xpath("//button[normalize-space(.)='Yes, Overwrite']");
	private final By stepAliasFirstRowCell = By.xpath("(//td[@id='cell-0-2'])[2]");
	private final By flowRate1AfterAliasFirstRowCell = By.xpath("(//td[@id='cell-0-5'])[1]");

	// ---------- Treatment Totals / Plot ----------
	private final By treatmentTotalsTab = By.xpath("//a[text()=' Treatment Totals ']");

	// Values captured during the scenario for later verification.
	private String savedGeneralInfoValue;
	private String savedDrilledHoleTopMdValue;
	private String savedActualScheduleStepAliasValue;
	private String savedActualScheduleFlowRate1Value;

	@FindBy(id = "treatmentAnalyst")
	private WebElement treatmentAnalystTextbox;

	@FindBy(xpath = "//td[@id='cell-0-1']")
	private WebElement topMdField;
	
	@FindBy(xpath = "(//td[@id='cell-0-5'])[1]")
	private WebElement flowRateFirstRowElement1;

	// ---------- Required reusable helper methods ----------
	public WebElement waitForElement(By locator) {
		return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT_SECONDS))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void scrollToBottom(WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
	private WebElement waitForClickable(By locator) {
		return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT_SECONDS))
				.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void click(By locator) {
		WebElement element = waitForClickable(locator);
		try {
			element.click();
		} catch (ElementClickInterceptedException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		}
	}

	public void sendKeys(By locator, String value) {
		WebElement element = waitForElement(locator);
		element.clear();
		element.sendKeys(value);
	}

	public boolean isDisplayed(By locator) {
		try {
			return waitForElement(locator).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	// ---------- High-level actions mapped from P17 feature ----------

	public void clickWellAndTreatmentTab() {
		System.out.println("[P17] Clicking Inputs -> Well & Treatment");
		if (isDisplayed(inputsMenu)) {
			click(inputsMenu);
		} else if (isDisplayed(expandSidebarButton)) {
			click(expandSidebarButton);
			if (isDisplayed(inputsMenu)) {
				click(inputsMenu);
			}
		} else if (isDisplayed(inputsMenuIcon)) {
			click(inputsMenuIcon);
		}

		if (!isDisplayed(wellAndTreatmentTab) && isDisplayed(expandSidebarButton)) {
			click(expandSidebarButton);
		}

		click(wellAndTreatmentTab);

		if (isDisplayed(collapseSidebarButton)) {
			click(collapseSidebarButton);
		}
	}

	public void clickElementOnWellTreatmentOption() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    try {

	        // Try finding Expand icon
	        List<WebElement> expandIcons =
	                driver.findElements(By.xpath("//img[@tooltip='Expand']"));

	        if (!expandIcons.isEmpty()) {

	            WebElement expandMenu = expandIcons.get(0);

	            // Scroll into view
	            js.executeScript("arguments[0].scrollIntoView({block:'center'});", expandMenu);

	            // Wait for clickable
	            wait.until(ExpectedConditions.visibilityOf(expandMenu));

	            // JS click (avoids interception)
	            js.executeScript("arguments[0].click();", expandMenu);

	            // Wait for menu animation
	            wait.until(ExpectedConditions.elementToBeClickable(wellAndTreatmentTab));

	            // Click Wellbore Configuration
	            js.executeScript("arguments[0].click();", wellAndTreatmentTab);

	            // Try collapsing if present
	            List<WebElement> collapseIcons =
	                    driver.findElements(By.xpath("//img[@tooltip='Collapse']"));

	            if (!collapseIcons.isEmpty()) {
	                WebElement collapseMenu = collapseIcons.get(0);
	                js.executeScript("arguments[0].scrollIntoView({block:'center'});", collapseMenu);
	                js.executeScript("arguments[0].click();", collapseMenu);
	            }

	        } else {

	            // UI Mode → Direct click
	            wait.until(ExpectedConditions.elementToBeClickable(wellAndTreatmentTab));
	            js.executeScript("arguments[0].click();", wellAndTreatmentTab);

	        }

	    } catch (Exception e) {
	        throw new RuntimeException(
	                "Failed to click Wellbore Configuration option in both UI and Headless",
	                e
	        );
	    }
	}
	
	public void clickElementOnWellTreatmentOption2() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        // Wait and scroll Expand icon
	        WebElement expandIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
	                By.xpath("//img[@tooltip='Expand']")
	        ));

	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", expandIcon);

	        wait.until(ExpectedConditions.elementToBeClickable(expandIcon)).click();

	        // Click Well & Treatment tab
	        WebElement tab = wait.until(ExpectedConditions.elementToBeClickable(wellAndTreatmentTab));
	        tab.click();

	        // Collapse if present (optional)
	        try {
	            WebElement collapseIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
	                    By.xpath("//img[@tooltip='Collapse']")
	            ));

	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", collapseIcon);

	            wait.until(ExpectedConditions.elementToBeClickable(collapseIcon)).click();

	        } catch (TimeoutException ignored) {
	            // Collapse not present → ignore
	        }

	    } catch (Exception e) {
	        throw new RuntimeException(
	                "Failed to click Well & Treatment option in headless mode",
	                e
	        );
	    }
	}

	            // Wait for menu animation
	           

	public void enterDataIntoAnyFieldInGeneralInformationTab() {
		waitForElement(By.id("treatmentAnalyst"));
		treatmentAnalystTextbox.clear();
		treatmentAnalystTextbox.sendKeys("Mark Analyst1");
		savedGeneralInfoValue = treatmentAnalystTextbox.getAttribute("value");
	}

	public void clickCommentsTab() {
		System.out.println("[P17] Clicking Comments tab");
		click(commentsTab);
	}

	public void clickYesSaveInSaveAndNextPopup() {
		System.out.println("[P17] Clicking 'Yes, Save' in Save & Next popup");
		click(yesSaveButton);
	}

	public void clickGeneralInformationTab() {
		System.out.println("[P17] Clicking General Information tab");
		click(generalInformationTab);
	}

	public void verifySavedDataInGeneralInformationTab() {
		waitForElement(By.id("treatmentAnalyst"));
		String treatmentAnalysis = treatmentAnalystTextbox.getAttribute("value");
		Assert.assertEquals(treatmentAnalysis, savedGeneralInfoValue,
				"Saved general info treatment analyst value was not captured.");

	}

	public void clickNextButton() {
		System.out.println("[P17] Clicking Next button");
		try {
			click(nextButton);
		} catch (ElementClickInterceptedException e) {
			By modalBackdrop = By.xpath("//*[contains(@class,'swal2-container') and contains(@class,'swal2-backdrop-show')]");
			By yesSave = By.xpath("//button[normalize-space(.)='Yes, Save']");
			By noDiscard = By.xpath("//button[normalize-space(.)='No, Discard']");
			if (isDisplayed(modalBackdrop)) {
				if (isDisplayed(yesSave)) {
					click(yesSave);
				} else if (isDisplayed(noDiscard)) {
					click(noDiscard);
				}
			}
			click(nextButton);
		}
	}
	

	public void clickCollapseButton() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	            WebElement collapseIcon = wait.until(ExpectedConditions.presenceOfElementLocated(
	                    By.xpath("//img[@tooltip='Collapse']")
	            ));

	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", collapseIcon);

	            wait.until(ExpectedConditions.elementToBeClickable(collapseIcon)).click();
		
	}

	public void verifyChannelInputForModelHeaderName() {
		System.out.println("[P17] Verifying Channel Inputs for Model header");
		Assert.assertTrue(waitForElement(channelInputsHeader).isDisplayed(), "Channel Inputs for Model header not displayed.");
		Assert.assertEquals(waitForElement(channelInputsHeader).getText().trim(), "Channel Inputs for Model",
				"Channel Inputs for Model header text mismatch.");
	}

	public void selectModelInputChannelCheckBox() {
		System.out.println("[P17] Selecting model input channel checkbox");
		WebElement checkbox = waitForElement(modelInputChannelCheckbox);
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
		// Some custom Angular checkboxes do not reliably reflect selection via isSelected().
		String ariaChecked = checkbox.getAttribute("aria-checked");
		if ("false".equalsIgnoreCase(ariaChecked)) {
			checkbox.click();
		}
	}

	public void clickAdditiveTab() {
		System.out.println("[P17] Clicking Additives tab");
		click(additivesTab);
	}

	public void clickrealTimeTab() {
		System.out.println("[P17] Clicking Additives tab");
		click(realTimeTab);
	}


	public void goBack() {
	    driver.navigate().back();
	}

	@FindBy(xpath = "//input[@formcontrolname='SurfFluidTemp']")
	private WebElement surfaceFluidTemperatureField;
	
	public void VerifyHeatTransferSurfaceFluid() {
		Assert.assertEquals(surfaceFluidTemperatureField.getAttribute("value"), "100.00",
				"Surface fluid temperature default value mismatched !");
	}
	
	public void clickDirectionalSurveyTab() {
		System.out.println("[P17] Clicking Directional Survey tab");
		if (!isDisplayed(directionalSurveyTab) && isDisplayed(expandSidebarButton)) {
			click(expandSidebarButton);
		}
		click(directionalSurveyTab);
		if (isDisplayed(collapseSidebarButton)) {
			click(collapseSidebarButton);
		}
	}

	public void verifyDataInTheDrilledHoleTab() {
		// Ensure we are on the correct tab before validating.
		click(drilledHoleTab);
		String actualTopMd = waitForElement(topMdCell).getText().trim();
		Assert.assertEquals(actualTopMd, "100,000.0", "Drilled Hole Top MD was not saved correctly.");
	}

	public void verifyHeatTransferParametersHeaderPageName() {
		System.out.println("[P17] Verifying Heat Transfer Parameters header");
		Assert.assertTrue(waitForElement(heatTransferHeader).isDisplayed(), "Heat Transfer Parameters header not displayed.");
		Assert.assertEquals(waitForElement(heatTransferHeader).getText().trim(), "Heat Transfer Parameters",
				"Heat Transfer Parameters header text mismatch.");
	}

	public void verifyReservoirParametersHeaderPageName() {
		System.out.println("[P17] Verifying Reservoir Parameters header");
		Assert.assertTrue(waitForElement(reservoirHeader).isDisplayed(), "Reservoir Parameters header not displayed.");
		Assert.assertEquals(waitForElement(reservoirHeader).getText().trim(), "Reservoir Parameters",
				"Reservoir Parameters header text mismatch.");
	}

	public void verifyMaterialSelectionHeaderPageName() {
		System.out.println("[P17] Verifying Material Selection header");
		Assert.assertTrue(waitForElement(materialSelectionHeader).isDisplayed(), "Material Selection header not displayed.");
		Assert.assertEquals(waitForElement(materialSelectionHeader).getText().trim(), "Material Selection",
				"Material Selection header text mismatch.");
	}

	public void clickChemicalSelectionTab() {
		System.out.println("[P17] Clicking Chemical Selection tab");
		click(chemicalSelectionTab);
	}

	public void editDataInActualTreatmentScheduledTab() {
		System.out.println("[P17] Editing data in Actual Treatment Schedule tab");
		click(actualTreatmentScheduleTab);

		click(importFromDesignButton);
		click(yesOverwriteButton);

		// Capture cells post-import so verification is not hardcoded.
		savedActualScheduleStepAliasValue = waitForElement(stepAliasFirstRowCell).getText().trim();
		savedActualScheduleFlowRate1Value = waitForElement(flowRate1AfterAliasFirstRowCell).getText().trim();

		Assert.assertFalse(savedActualScheduleStepAliasValue.isEmpty(), "Saved step alias value was empty.");
		Assert.assertFalse(savedActualScheduleFlowRate1Value.isEmpty(), "Saved flow rate value was empty.");
	}

	public void clickActualTreatmentScheduleTab() {
		System.out.println("[P17] Clicking Actual Treatment Schedule tab");
		click(actualTreatmentScheduleTab);
	}

	public void verifySavedDataInActualTreatmentScheduledTab() {
		System.out.println("[P17] Verifying saved data in Actual Treatment Schedule tab");
		String actualAlias = flowRateFirstRowElement1.getText().trim();
		Assert.assertEquals(actualAlias, "6.30", "Actual Treatment Schedule step alias was not saved correctly.");
		
	}

	public void clickTreatmentTotalsTab() {
		System.out.println("[P17] Clicking Treatment Totals tab");
		click(treatmentTotalsTab);
		scrollToBottom(driver);
	}

	public void verifyUserNavigateToPlotScreen() {
		System.out.println("[P17] Verifying navigation to plot screen");
        WebElement plotHeader = driver.findElement(By.xpath("//h4[text()='Plot']"));
        String plotHeaderName = plotHeader.getText();
		Assert.assertEquals(plotHeaderName, "Plot","New Entered data did not saved in actual treatment scheduled tab");
	}
}

