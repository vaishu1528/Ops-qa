
package com.FracProPlus.pages;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

import static org.testng.Assert.assertEquals;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReservoirParametersPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	private String expectedErrorMessageforFractureHeight = "Fracture Height is required.";
	private String expectedErrorMessageforpayzoneHeight = "Payzone Height is required.";
	private String expectedErrorMessagefordepthToCenterOfPayField = "Depth to Center of Pay is required.";
	private String expectedErrorMessageforclosureStressInPayzoneField = "Closure Stress in Payzone is required.";
	private String expectedErrorMessageforFormationModulusField = "Formation Modulus is required.";
	private String expectedErrorMessageforformationPoissonsRatioField = "Formation Poisson's Ratio is required.";
	private String expectedErrorMessageforleakoffCoefficientField = "Leakoff Coefficient is required.";
	private String expectedErrorMessageforfractureToughnessField = "Fracture Toughness is required.";

	public ReservoirParametersPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='side-nav-link-ref active']/following::a[text()=' Reservoir Parameters ']")
	private WebElement reservoirParametersOption;

	@FindBy(xpath = "//h4[text()='Reservoir Parameters']")
	private WebElement pageHeader;

	@FindBy(xpath = "//*[@formcontrolname='FracHeight']")
	private WebElement FractureHeight;

	@FindBy(xpath = "//*[@formcontrolname='PayHeight']")
	private WebElement PayzoneHeight;

	@FindBy(xpath = "//*[@formcontrolname='CenterPay']")
	private WebElement DepthtoCenterofPay;

	@FindBy(xpath = "//*[@formcontrolname='Stress']")
	private WebElement ClosureStressinPayzone;

	@FindBy(xpath = "//*[@formcontrolname='Modulus']")
	private WebElement FormationModulus;

	@FindBy(xpath = "//*[@formcontrolname='Poissons']")
	private WebElement FormationPoissonsRatio;

	@FindBy(xpath = "//*[@formcontrolname='LeakoffCo']")
	private WebElement LeakoffCoefficient;

	@FindBy(xpath = "//*[@formcontrolname='Toughness']")
	private WebElement FractureToughness;

	@FindBy(xpath = "//input[@id='fractureHeight']")
	private WebElement fractureHeightField;

	@FindBy(xpath = "//input[@id='payzoneHeight']")
	private WebElement payzoneHeightField;

	@FindBy(xpath = "//input[@id='depthToCenterOfPay']")
	private WebElement depthToCenterOfPayField;

	@FindBy(xpath = "//input[@id='closureStress']")
	private WebElement closureStressInPayzoneField;

	@FindBy(xpath = "//input[@id='formationModulus']")
	private WebElement formationModulusField;

	@FindBy(xpath = "//input[@id='poissonRatio']")
	private WebElement formationPoissonsRatioField;

	@FindBy(xpath = "//input[@id='LeakoffCo']")
	private WebElement leakoffCoefficientField;

	@FindBy(xpath = "//*[@formcontrolname='Toughness']")
	private WebElement FractureToughnessField;

	@FindBy(xpath = "//input[@id='fractureToughness']")
	private WebElement fractureToughnessField;

	@FindBy(xpath = "//button[@id='saveAndNext']")
	private WebElement saveAndNextButton;

	@FindBy(xpath = "//*[@id='fluidPermeability']")
	private WebElement poreFluidPermeabilityField;

	@FindBy(xpath = "//input[@id='ResTemp']")
	private WebElement reservoirTemperatureField;

	@FindBy(xpath = "//input[@id='reservoirLithology']")
	private WebElement reservoirLithologyField;

	@FindBy(xpath = "//*[text()='Reservoir Lithology']/following::ng-select")
	private WebElement reservoirLithologyDropdown;

	@FindBy(xpath = "//*[text()='Reservoir Lithology']/following::ng-select/ng-dropdown-panel/div/div/div[2]")
	private WebElement Dropdownsecondoption;

	@FindBy(id = "reservoirParametersField")
	private WebElement reservoirParametersField;

	@FindBy(id = "padNavigation")
	private WebElement padNavigation;

	@FindBy(id = "wellOverview")
	private WebElement wellOverview;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[text()=' Next ']")
	private WebElement nextButton;

	@FindBy(id = "successToast")
	private WebElement successToast;

	@FindBy(id = "goToApplication")
	private WebElement goToApplication;

	public void clickElementReservoirParametersOption() {
		try {
			WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
			expandMenu.click();
			Thread.sleep(2000);
			elementUtils.clickElement(reservoirParametersOption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPageHeader() {
		try {
			String actualHeader = elementUtils.getElementText(pageHeader);
			String expectedHeader = "Reservoir Parameters";
			Assert.assertEquals(actualHeader, expectedHeader, "Page header does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDefaultData() {
		try {
			String actualFractureHeight = FractureHeight.getAttribute("value");
			String expectedFractureHeight = "100";
			Assert.assertEquals(actualFractureHeight, expectedFractureHeight, "Fracture Height does not match!");

			String actualPayzoneHeight = PayzoneHeight.getAttribute("value");
			String expectedPayzoneHeight = "100";
			Assert.assertEquals(actualPayzoneHeight, expectedPayzoneHeight, "Payzone Height does not match!");

			String actualDepthtoCenterofPay = DepthtoCenterofPay.getAttribute("value");
			String expectedDepthtoCenterofPay = "10,000";
			Assert.assertEquals(actualDepthtoCenterofPay, expectedDepthtoCenterofPay,
					"Depth to Center of Pay does not match!");

			String actualClosureStressinPayzone = ClosureStressinPayzone.getAttribute("value");
			String expectedClosureStressinPayzone = "5,000";
			Assert.assertEquals(actualClosureStressinPayzone, expectedClosureStressinPayzone,
					"Closure Stress in Payzone does not match!");

			String actualFormationModulus = FormationModulus.getAttribute("value");
			String expectedFormationModulus = "1.00e+6";
			Assert.assertEquals(actualFormationModulus, expectedFormationModulus, "Formation Modulus does not match!");

			String actualFormationPoissonsRatio = FormationPoissonsRatio.getAttribute("value");
			String expectedFormationPoissonsRatio = "0.250";
			Assert.assertEquals(actualFormationPoissonsRatio, expectedFormationPoissonsRatio,
					"Formation Poisson's Ratio does not match!");

			String actualLeakoffCoefficient = LeakoffCoefficient.getAttribute("value");
			String expectedLeakoffCoefficient = "0.00e+0";
			Assert.assertEquals(actualLeakoffCoefficient, expectedLeakoffCoefficient,
					"Leakoff Coefficient does not match!");

			String actualFractureToughness = FractureToughness.getAttribute("value");
			String expectedFractureToughness = "0.0";
			Assert.assertEquals(actualFractureToughness, expectedFractureToughness,
					"Fracture Toughness does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyWarningMessageforFractureHeightField() {

		try {
			WebElement CollapseMenu = driver.findElement(By.xpath("//img[@tooltip='Collapse']"));
			CollapseMenu.click();
			Thread.sleep(2000);
			elementUtils.clickElement(fractureHeightField);
			fractureHeightField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			fractureHeightField.sendKeys(Keys.BACK_SPACE);
			elementUtils.clickElement(payzoneHeightField);
			WebElement errorElement = driver.findElement(By.xpath("//*[text()=' Fracture Height is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessageforFractureHeight, "Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWarningMessageforPayzoneHeightField() {
		try {
			elementUtils.clickElement(payzoneHeightField);
			payzoneHeightField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			payzoneHeightField.sendKeys(Keys.BACK_SPACE);
			elementUtils.clickElement(pageHeader);
			WebElement errorElement = driver.findElement(By.xpath("//*[text()=' Payzone Height is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessageforpayzoneHeight, "Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyWarningMessageforDepthtoCenterofPayField() {
		try {
			elementUtils.clickElement(depthToCenterOfPayField);
			depthToCenterOfPayField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			depthToCenterOfPayField.sendKeys(Keys.BACK_SPACE);
			elementUtils.clickElement(pageHeader);
			WebElement errorElement = driver
					.findElement(By.xpath("//*[text()=' Depth to Center of Pay is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessagefordepthToCenterOfPayField,
					"Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyWarningMessageforClosureStressinPayzoneField() {
		try {
			elementUtils.clickElement(closureStressInPayzoneField);
			closureStressInPayzoneField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			closureStressInPayzoneField.sendKeys(Keys.BACK_SPACE);
			elementUtils.clickElement(pageHeader);
			WebElement errorElement = driver
					.findElement(By.xpath("//*[text()=' Closure Stress in Payzone is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessageforclosureStressInPayzoneField,
					"Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyWarningMessageforFormationModulusField() {
		try {
			elementUtils.clickElement(formationModulusField);
			formationModulusField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			formationModulusField.sendKeys(Keys.BACK_SPACE);
			elementUtils.clickElement(pageHeader);
			WebElement errorElement = driver.findElement(By.xpath("//*[text()=' Formation Modulus is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessageforFormationModulusField,
					"Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyWarningMessageforFormationPoissonsRatioField() {
		try {
			elementUtils.clickElement(formationPoissonsRatioField);
			formationPoissonsRatioField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			formationPoissonsRatioField.sendKeys(Keys.BACK_SPACE);
			elementUtils.clickElement(pageHeader);
			WebElement errorElement = driver.findElement(By.xpath("//*[contains(text(),'Ratio is required.')]"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessageforformationPoissonsRatioField,
					"Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyWarningMessageforLeakoffCoefficientField() {
		try {
			elementUtils.clickElement(leakoffCoefficientField);
			leakoffCoefficientField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			leakoffCoefficientField.sendKeys(Keys.BACK_SPACE);
			elementUtils.clickElement(pageHeader);
			WebElement errorElement = driver.findElement(By.xpath("//*[text()=' Leakoff Coefficient is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessageforleakoffCoefficientField,
					"Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyWarningMessageforFractureToughnessField() {
		try {
			elementUtils.clickElement(fractureToughnessField);
			fractureToughnessField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			fractureToughnessField.sendKeys(Keys.BACK_SPACE);
			elementUtils.clickElement(pageHeader);
			WebElement errorElement = driver.findElement(By.xpath("//*[text()=' Fracture Toughness is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessageforfractureToughnessField,
					"Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clearElementPayzoneHeightField() {
		try {
			elementUtils.clearElement(payzoneHeightField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearElementDepthToCenterOfPayField() {
		try {
			elementUtils.clearElement(depthToCenterOfPayField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearElementClosureStressInPayzoneField() {
		try {
			elementUtils.clearElement(closureStressInPayzoneField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearElementFormationModulusField() {
		try {
			elementUtils.clearElement(formationModulusField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearElementFormationPoissonsRatioField() {
		try {
			elementUtils.clearElement(formationPoissonsRatioField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearElementLeakoffCoefficientField() {
		try {
			elementUtils.clearElement(leakoffCoefficientField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearElementFractureToughnessField() {
		try {
			elementUtils.clearElement(fractureToughnessField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void performRefreshAction() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearElementAnyField() {
		try {
			elementUtils.clickElement(fractureHeightField);
			fractureHeightField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			fractureHeightField.sendKeys(Keys.BACK_SPACE);
			elementUtils.clickElement(payzoneHeightField);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void isSaveAndNextButtonEnabled() {
		try {
			boolean isEnabled = saveButton.isEnabled();
			Assert.assertFalse(isEnabled, "Save button should be disabled!");

			boolean isEnabled1 = nextButton.isEnabled();
			Assert.assertFalse(isEnabled1, "Save button should be disabled!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isPoreFluidPermeabilityFieldEditable() {
		try {
			boolean isEditable = poreFluidPermeabilityField.isEnabled();
			Assert.assertFalse(isEditable, "Pore Fluid Permeability field should be non-editable!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isReservoirTemperatureFieldEditable() {
		try {
			boolean isEditable = reservoirTemperatureField.isEnabled();
			Assert.assertFalse(isEditable, "Reservoir Temperature field should be non-editable!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFractureHeightField() {
		try {
			elementUtils.clearAndSendKeys(fractureHeightField, ReadData.readdata("HeightField"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoPayzoneHeightField() {
		try {
			elementUtils.clearAndSendKeys(payzoneHeightField, ReadData.readdata("payzoneHeight"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoDepthToCenterOfPayField() {
		try {
			elementUtils.clearAndSendKeys(depthToCenterOfPayField, ReadData.readdata("depthToCenterOfPay"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoClosureStressInPayzoneField() {
		try {
			elementUtils.clearAndSendKeys(closureStressInPayzoneField, ReadData.readdata("closureStressInPayzone"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFormationModulusField() {
		try {
			elementUtils.clearAndSendKeys(formationModulusField, ReadData.readdata("formationModulus"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFormationPoissonsRatioField() {
		try {
			elementUtils.clearAndSendKeys(formationPoissonsRatioField, ReadData.readdata("formationPoissonsRatio"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoLeakoffCoefficientField() {
		try {
			elementUtils.clearAndSendKeys(leakoffCoefficientField, ReadData.readdata("leakoffCoefficient"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFractureToughnessField() {
		try {
			elementUtils.clearAndSendKeys(FractureToughnessField, ReadData.readdata("FractureToughness"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectValueFromReservoirLithologyDropdown() {
		try {
			elementUtils.clickElement(reservoirLithologyDropdown);
			WebElement option = driver
					.findElement(By.xpath("//div[text()='" + ReadData.readdata("reservoirLithology") + "']"));
			elementUtils.clickElement(option);
			// elementUtils.selectOptionInNgSelect(reservoirLithologyDropdown,
			// ReadData.readdata("reservoirLithology"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDataSavedSuccessfully() {

		try {
			Thread.sleep(2000);
			driver.navigate().refresh();
			String actualValue = fractureHeightField.getAttribute("value");
			String expectedValue = ReadData.readdata("HeightField");
			Assert.assertEquals(actualValue, expectedValue, "Fracture Height is Not Matched!");

			String actualValue1 = payzoneHeightField.getAttribute("value");
			String expectedValue1 = ReadData.readdata("payzoneHeight");
			Assert.assertEquals(actualValue1, expectedValue1, "Payzone Height is Not Matched!");

			String actualValue3 = closureStressInPayzoneField.getAttribute("value");
			String expectedValue3 = ReadData.readdata("closureStressInPayzone");
			Assert.assertEquals(actualValue3, expectedValue3, "Closure Stress in Payzone is Not Matched!");

			String actualValue4 = formationModulusField.getAttribute("value");
			String expectedValue4 = ReadData.readdata("formationModulus");
			double expectedDouble = Double.parseDouble(expectedValue4);
			DecimalFormat scientificFormat = new DecimalFormat("0.00E0");
			String formattedExpectedValue = scientificFormat.format(expectedDouble);
			formattedExpectedValue = formattedExpectedValue.replace("E", "e+");
			Assert.assertEquals(actualValue4, formattedExpectedValue, "Formation Modulus is Not Matched!");

			String actualValue5 = formationPoissonsRatioField.getAttribute("value");
			String expectedValue5 = ReadData.readdata("formationPoissonsRatio");
			double expectedDouble5 = Double.parseDouble(expectedValue5);
			DecimalFormat decimalFormat = new DecimalFormat("0.000");
			String formattedExpectedValue5 = decimalFormat.format(expectedDouble5);
			Assert.assertEquals(actualValue5, formattedExpectedValue5, "Formation Poisson's Ratio is Not Matched!");

			String actualValue6 = leakoffCoefficientField.getAttribute("value");
			String expectedValue6 = ReadData.readdata("leakoffCoefficient");
			double expectedDouble1 = Double.parseDouble(expectedValue6);
			DecimalFormat scientificFormat1 = new DecimalFormat("0.00E0");
			String formattedExpectedValue1 = scientificFormat1.format(expectedDouble1);
			formattedExpectedValue1 = formattedExpectedValue1.replace("E", "e+");
			Assert.assertEquals(actualValue6, formattedExpectedValue1, "Leakoff Coefficient is Not Matched!");

			String actualValue7 = FractureToughnessField.getAttribute("value");
			String expectedValue7 = ReadData.readdata("FractureToughness");
			double expectedDouble7 = Double.parseDouble(expectedValue7);
			DecimalFormat decimalFormat7 = new DecimalFormat("0.0");
			String formattedExpectedValue7 = decimalFormat7.format(expectedDouble7);
			Assert.assertEquals(actualValue7, formattedExpectedValue7, "Fracture Toughness is Not Matched!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clearElementAnyFieldFromReservoirParametersScreen() {
		try {
			elementUtils.clearElement(reservoirParametersField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToPad() {
		try {
			elementUtils.clickElement(padNavigation);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementWellFromOverview() {
		try {
			elementUtils.clickElement(wellOverview);
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

	public void verifyDashboardPage() {
		try {
			String actualTitle = driver.getTitle();
			String expectedTitle = "Dashboard";
			Assert.assertEquals(actualTitle, expectedTitle, "Dashboard page title does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySuccessToastMessage() {
		try {
			String actualMessage = elementUtils.getElementText(successToast);
			String expectedMessage = "Operation successful";
			Assert.assertEquals(actualMessage, expectedMessage, "Success toast message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementGoToApplication() {
		try {
			elementUtils.clickElement(goToApplication);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}