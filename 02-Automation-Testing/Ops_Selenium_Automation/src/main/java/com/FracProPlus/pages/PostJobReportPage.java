
package com.FracProPlus.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

public class PostJobReportPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public PostJobReportPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()=' Results']")
	private WebElement resultsModule;

	@FindBy(xpath = "//a[text()=' Report ']")
	private WebElement reportSubModule;

	@FindBy(xpath = "//h4[text()='Report']")
	private WebElement reportPageHeader;

	@FindBy(xpath = "//a[@id='PostJobData-link']")
	private WebElement postJobReportTab;

	@FindBy(xpath = "//input[@id='kickoffTvd']")
	private WebElement kickoffTVDField;

	@FindBy(xpath = "//input[@id='plugDepth']")
	private WebElement plugDepthField;

	@FindBy(xpath = "//input[@id='producedWater']")
	private WebElement producedWaterField;

	@FindBy(xpath = "//input[@id='pumpDownVolume']")
	private WebElement pumpdownVolumeField;

	@FindBy(xpath = "//input[@id='operatorMxPressure']")
	private WebElement operatorMaxPressureField;

	@FindBy(xpath = "//input[@id='pumpDownMaxPress']")
	private WebElement pumpdownMaxPressureField;

	@FindBy(xpath = "//label[@for='desAveragePressure']/parent::div/div/input")
	private WebElement designAvgTreatingPressureField;

	@FindBy(xpath = "//label[@for='desAvgFracGradient']/parent::div/div/input")
	private WebElement designAvgFracGradientField;

	@FindBy(xpath = "//label[@for='chargeWeight']/parent::div/div/input")
	private WebElement chargeWeightField;

	@FindBy(xpath = "//label[@for='pumpDownMaxRate']/parent::div/div/input")
	private WebElement pumpdownMaxRateField;

	@FindBy(xpath = "//label[@for='fieldGas']/parent::div/div/input")
	private WebElement fieldGasField;

	@FindBy(xpath = "//label[@for='cng']/parent::div/div/input")
	private WebElement cngField;

	@FindBy(xpath = "//label[@for='plugType']/parent::div/input")
	private WebElement plugTypeField;

	@FindBy(xpath = "//label[@for='bacteriaTreatmentMethod']/parent::div/ng-select")
	private WebElement BacteriaTreatmentMethodDropdown;

	@FindBy(xpath = "//ng-select[@id='bacteriaTreatmentMethod']")
	private WebElement bacteriaTreatmentMethodDropdown;

	@FindBy(xpath = "//label[@for='diesel']/parent::div/div/input")
	private WebElement dieselField;

	@FindBy(xpath = "//label[@for='chlorides']/parent::div/div/input")
	private WebElement chloridesField;

	@FindBy(xpath = "(//label[@for='padStageNumber']/parent::div/div/input)[1]")
	private WebElement padStageNoField1;

	@FindBy(xpath = "(//label[@for='padStageNumber']/parent::div/div/input)[2]")
	private WebElement padStageNoField2;

	@FindBy(xpath = "//label[@for='maxSurfacePressure']/parent::div/div/input")
	private WebElement overrideSurfaceMaxPressureField;

	@FindBy(xpath = "//label[@for='subPercent']/parent::div/input")
	private WebElement subPercentageField;

	@FindBy(xpath = "//label[@for='pumpStart']/parent::div/input")
	private WebElement pumpAtStartField;

	@FindBy(xpath = "//label[@for='pumpEnd']/parent::div/input")
	private WebElement pumpAtEndField;

	@FindBy(xpath = "(//ng-select[@id='select-plot'])[2]")
	private WebElement selectPlotField;

	@FindBy(xpath = "//button[text()='Clear Data']")
	private WebElement clearElementDataButton;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[text()=' Download WITSML Report ']")
	private WebElement downloadWITSMLReport;

	@FindBy(xpath = "//button[text()=' Download Word Report ']")
	private WebElement downloadWordReport;

	@FindBy(xpath = "//*[contains(text(),'Download ASCII Report')]")
	private WebElement downloadASCIIFileButton;

	public void verifyAfterClearData() {
		try {
			Thread.sleep(1000);
			Assert.assertEquals(kickoffTVDField.getAttribute("value"), "0",
					"Kickoff TVD field value mismatched after clear data");
			Assert.assertEquals(plugDepthField.getAttribute("value"), "0",
					"Plug depth field value mismatched after clear data");
			Assert.assertEquals(producedWaterField.getAttribute("value"), "0.0",
					"Produced Water field value mismatched after clear data");
			Assert.assertEquals(pumpdownVolumeField.getAttribute("value"), "0.0",
					"Pumpdown Volume field value mismatched after clear data");
			Assert.assertEquals(operatorMaxPressureField.getAttribute("value"), "0",
					"Operator's Max Pressure field value mismatched after clear data");
			Assert.assertEquals(pumpdownMaxPressureField.getAttribute("value"), "0",
					"Pumpdown Max Pressure field value mismatched after clear data");
			Assert.assertEquals(designAvgTreatingPressureField.getAttribute("value"), "0",
					"Design Avg. Treating Pressure field value mismatched after clear data");
			Assert.assertEquals(designAvgFracGradientField.getAttribute("value"), "0.000",
					"Design Avg. Frac Gradient field value mismatched after clear data");
			Assert.assertEquals(chargeWeightField.getAttribute("value"), "0.000",
					"Charge Weight field value mismatched after clear data");
			Assert.assertEquals(pumpdownMaxRateField.getAttribute("value"), "0",
					"Pumpdown Max Rate field value mismatched after clear data");
			Assert.assertEquals(fieldGasField.getAttribute("value"), "0",
					"Field Gas field value mismatched after clear data");
			Assert.assertEquals(cngField.getAttribute("value"), "0", "CNG field value mismatched after clear data");
			Assert.assertEquals(dieselField.getAttribute("value"), "0",
					"Diesel field value mismatched after clear data");
			Assert.assertEquals(chloridesField.getAttribute("value"), "0",
					"Chlorides field value mismatched after clear data");
			Assert.assertEquals(padStageNoField1.getAttribute("value"), "0",
					"padStageNoField1 value mismatched after clear data");
			Assert.assertEquals(padStageNoField2.getAttribute("value"), "0",
					"padStageNoField2 value mismatched after clear data");
			// Assert.assertEquals(overrideSurfaceMaxPressureField.getAttribute("value"),
			// ReadData.readdata("overridesurfacemaxpressureValue"),
			// "overrideSurfaceMaxPressure field value mismatched after clear data");
			Assert.assertEquals(subPercentageField.getAttribute("value"), "0",
					"Sub % field value mismatched after clear data");
			Assert.assertEquals(pumpAtStartField.getAttribute("value"), "0",
					"pumpAtStartField value mismatched after clear data");
			Assert.assertEquals(pumpAtEndField.getAttribute("value"), "0",
					"pumpAtEndField value mismatched after clear data");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUserIsOnReportPage() {
		try {
			Thread.sleep(2000);
			String actualTitle = reportPageHeader.getText();
			String expectedTitle = "Report";
			Assert.assertEquals(actualTitle, expectedTitle, "User is not on the Report Page!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void clickElementResultsModule() {
	// try {
	// Thread.sleep(2000);
	// elementUtils.clickElement(resultsModule);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void clickElementResultsModule() {
		try {
			WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
			expandMenu.click();
			Thread.sleep(4000);
			elementUtils.clickElement(resultsModule);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// Helper: centralized screenshot method (re-usable)
	private void takeDebugScreenshot(String namePrefix) {
		try {
			org.openqa.selenium.TakesScreenshot ts = (org.openqa.selenium.TakesScreenshot) driver;
			java.io.File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			String screenshotPath = "target/debug_" + namePrefix + "_" + System.currentTimeMillis() + ".png";
			org.apache.commons.io.FileUtils.copyFile(source, new java.io.File(screenshotPath));
			System.out.println("DEBUG - Screenshot saved: " + screenshotPath);
		} catch (Exception screenshotEx) {
			screenshotEx.printStackTrace();
		}
	}

	public void clickElementReportSubModule() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(reportSubModule);
			Thread.sleep(1000);
			WebElement CollapseMenu = driver.findElement(By.xpath("//img[@tooltip='Collapse']"));
			CollapseMenu.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementPostJobReportTab() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(postJobReportTab);
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterKickoffTVDData() {
		try {
			elementUtils.clearAndSendKeys(kickoffTVDField, ReadData.readdata("KickOffTVDValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPlugDepthData() {
		try {
			elementUtils.clearAndSendKeys(plugDepthField, ReadData.readdata("PlugDepthValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterProducedWaterData() {
		try {
			elementUtils.clearAndSendKeys(producedWaterField, ReadData.readdata("ProducedWaterValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPumpdownVolumeData() {
		try {
			elementUtils.clearAndSendKeys(pumpdownVolumeField, ReadData.readdata("PumpdownVolumeValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterOperatorMaxPressureData() {
		try {
			elementUtils.clearAndSendKeys(operatorMaxPressureField, ReadData.readdata("OperatormaxpressureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPumpdownMaxPressureData() {
		try {
			elementUtils.clearAndSendKeys(pumpdownMaxPressureField, ReadData.readdata("PumpdownMaxPressureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDesignAvgTreatingPressureData() {
		try {
			elementUtils.clearAndSendKeys(designAvgTreatingPressureField,
					ReadData.readdata("DesignavgtreatingpressureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDesignAvgFracGradientData() {
		try {
			elementUtils.clearAndSendKeys(designAvgFracGradientField, ReadData.readdata("DesignavgfracgradientValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterChargeWeightData() {
		try {
			elementUtils.clearAndSendKeys(chargeWeightField, ReadData.readdata("ChargeweightValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPumpdownMaxRateData() {
		try {
			elementUtils.clearAndSendKeys(pumpdownMaxRateField, ReadData.readdata("PumpdownmaxrateValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFieldGasData() {
		try {
			elementUtils.clearAndSendKeys(fieldGasField, ReadData.readdata("FieldGasValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterCNGData() {
		try {
			elementUtils.clearAndSendKeys(cngField, ReadData.readdata("CNG"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPlugTypeData() {
		try {
			elementUtils.clearAndSendKeys(plugTypeField, ReadData.readdata("plugtypeValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectBacteriaTreatmentMethod() {
		try {
			// Assert.assertEquals(driver
			// .findElement(By.xpath(
			// "//ng-select[@id='bacteriaTreatmentMethod']/descendant::span[text()='Bactericide']"))
			// .getText(), "Bactericide", "Default value of bacteria treatment methode is
			// mismatched !");
			elementUtils.clickElement(bacteriaTreatmentMethodDropdown);
			Actions actions = new Actions(driver);
			actions.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN)
					.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN)
					.sendKeys(org.openqa.selenium.Keys.ENTER)
					.perform();
			// elementUtils.selectOptionInDropdown(bacteriaTreatmentMethodDropdown,
			// ReadData.readdata("BacteriaTreatmentMethodDropdownOption"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDieselData() {
		try {
			elementUtils.clearAndSendKeys(dieselField, ReadData.readdata("dieselValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterChloridesData() {
		try {
			elementUtils.clearAndSendKeys(chloridesField, ReadData.readdata("chloridesValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPadStageNo() {
		try {
			elementUtils.clearAndSendKeys(padStageNoField1, ReadData.readdata("padstage1Value"));
			Thread.sleep(1000);
			elementUtils.clearAndSendKeys(padStageNoField2, ReadData.readdata("padstage2Value"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterOverrideSurfaceMaxPressureData() {
		try {
			elementUtils.clearAndSendKeys(overrideSurfaceMaxPressureField,
					ReadData.readdata("overridesurfacemaxpressureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySubPercentageFieldReadOnly() {
		try {
			elementUtils.checkFieldReadOnly(driver, By.xpath("//label[@for='subPercent']/parent::div/input"));
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void verifyPumpAtStartFieldReadOnly() {
		try {
			elementUtils.checkFieldReadOnly(driver, By.xpath("//label[@for='pumpStart']/parent::div/input"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPumpAtEndFieldReadOnly() {
		try {
			elementUtils.checkFieldReadOnly(driver, By.xpath("//label[@for='pumpEnd']/parent::div/input"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String roundOffAndConvertToString(double value) {
		int roundedValue = (int) Math.round(value); // Round to nearest integer
		return String.valueOf(roundedValue); // Convert to String
	}

	public void verifySubPercentage() {
		// Constants
		double GasBTU = 987260;
		double DieselEC = 137381;
		double fieldGas = 1000;
		double diesel = 500;
		// Calculation
		double temp = (1000 * GasBTU) + (diesel * DieselEC);
		double expectedSubPercentage = (temp > 0) ? (fieldGas * GasBTU) / temp * 100 : 0;
		String roundedString = roundOffAndConvertToString(expectedSubPercentage);

		// Locate the Sub% element
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement subPercentageElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//label[@for='subPercent']/parent::div/input"))); // Replace with
																										// actual
																										// locator

		// Get the displayed Sub% value
		String subPercentageText = subPercentageElement.getAttribute("value");

		// Assertion
		Assert.assertEquals(subPercentageText, roundedString, "Sub% value mismatch");
	}

	public void selectPlotOption() {
		try {
			elementUtils.clickElement(selectPlotField);
			Actions actions = new Actions(driver);
			actions.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN)
					.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN)
					.sendKeys(org.openqa.selenium.Keys.ENTER)
					.perform();
			// elementUtils.selectOptionInDropdown(selectPlotField,
			// ReadData.readdata("plotOption"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementClearDataButton() {
		try {
			elementUtils.clickElement(clearElementDataButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementSaveButton() {
		try {
			elementUtils.clickElement(saveButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyKickoffTVDData() {
		try {
			Thread.sleep(7000);
			Assert.assertEquals(kickoffTVDField.getAttribute("value"), "0",
					"Kickoff TVD data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPlugDepthData() {
		try {
			Assert.assertEquals(plugDepthField.getAttribute("value"), ReadData.readdata("PlugDepthValue"),
					"Plug Depth data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProducedWaterData() {
		try {
			Assert.assertEquals(producedWaterField.getAttribute("value"), ReadData.readdata("ProducedWaterValue"),
					"Produced Water data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPumpdownVolumeData() {
		try {
			Assert.assertEquals(pumpdownVolumeField.getAttribute("value"), ReadData.readdata("PumpdownVolumeValue"),
					"Pumpdown Volume data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOperatorMaxPressureData() {
		try {
			Assert.assertEquals(operatorMaxPressureField.getAttribute("value"),
					ReadData.readdata("OperatormaxpressureValue"), "Operator Max Pressure data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPumpdownMaxPressureData() {
		try {
			Assert.assertEquals(pumpdownMaxPressureField.getAttribute("value"),
					ReadData.readdata("PumpdownMaxPressureValue"), "Pumpdown Max Pressure data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDesignAvgTreatingPressureData() {
		try {
			Assert.assertEquals(designAvgTreatingPressureField.getAttribute("value"),
					ReadData.readdata("DesignavgtreatingpressureValue"),
					"Design Avg Treating Pressure data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDesignAvgFracGradientData() {
		try {
			Assert.assertEquals(designAvgFracGradientField.getAttribute("value"),
					ReadData.readdata("DesignavgfracgradientValue"), "Design Avg Frac Gradient data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyChargeWeightData() {
		try {
			Assert.assertEquals(chargeWeightField.getAttribute("value"), ReadData.readdata("ChargeweightValue"),
					"Charge Weight data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPumpdownMaxRateData() {
		try {
			Assert.assertEquals(pumpdownMaxRateField.getAttribute("value"), ReadData.readdata("PumpdownmaxrateValue"),
					"Pumpdown Max Rate data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFieldGasData() {
		try {
			Assert.assertEquals(fieldGasField.getAttribute("value"), ReadData.readdata("FieldGasValue"),
					"Field Gas data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCNGData() {
		try {
			Assert.assertEquals(cngField.getAttribute("value"), ReadData.readdata("CNG"), "CNG data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPlugTypeData() {
		try {
			Assert.assertEquals(plugTypeField.getAttribute("value"), ReadData.readdata("plugtypeValue"),
					"Plug Type data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBacteriaTreatmentMethod() {
		try {
			Assert.assertEquals(
					driver.findElement(By.xpath(
							"//label[@for='bacteriaTreatmentMethod']/parent::div/ng-select/descendant::span[text()='CleanStream']"))
							.getAttribute("innerText").trim(),
					ReadData.readdata("BacteriaTreatmentMethodDropdownOption"),
					"Default value of bacteria treatment methode is mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDieselData() {
		try {
			Assert.assertEquals(dieselField.getAttribute("value"), ReadData.readdata("dieselValue"),
					"Diesel data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyChloridesData() {
		try {
			Assert.assertEquals(chloridesField.getAttribute("value"), ReadData.readdata("chloridesValue"),
					"Chlorides data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPadStageNo() {
		try {
			Thread.sleep(2000);
			Assert.assertEquals(padStageNoField1.getAttribute("value"), ReadData.readdata("padstage1Value"),
					"Pad Stage No 1 data does not match!");
			Assert.assertEquals(padStageNoField2.getAttribute("value"), ReadData.readdata("padstage2Value"),
					"Pad Stage No 1 data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOverrideSurfaceMaxPressureData() {
		try {
			Assert.assertEquals(overrideSurfaceMaxPressureField.getAttribute("value"),
					ReadData.readdata("overridesurfacemaxpressureValue"),
					"Override Surface Max Pressure data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPumpAtStartData() {
		try {
			Assert.assertEquals(pumpAtStartField.getAttribute("value"), "0", "Pump at Start data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPumpAtEndData() {
		try {
			Assert.assertEquals(pumpAtEndField.getAttribute("value"), "0", "Pump at End data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementDownloadWITSMLReport() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(downloadWITSMLReport);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyReportDownloadSuccessMessage() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait until the toast message is visible
			WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[text()='Plots updated successfully!']")));

			// Assert the message text
			Assert.assertEquals(message.getText(), "Plots updated successfully!",
					"Plot successfully toast message mismatched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementDownloadWordReport() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(downloadWordReport);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementDownloadASCIIFileButton() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(downloadASCIIFileButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void refreshPage() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}