package com.FracProPlus.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.FracProPlus.utils.CommonUtils;
import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

public class EditProppantDataPage {
	private WebDriver driver;
	private ElementUtils elementUtils;

	public EditProppantDataPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	// Xpath for WebElement

	@FindBy(xpath = "//td[text()='100 mesh']/following-sibling::td/div/img[@title='Edit']")
	private WebElement editProppantIcon;

	@FindBy(xpath = "//label[text()='Proppant Name']/parent::div/ng-select")
	private WebElement proppantNameDropdown;

	@FindBy(xpath = "//input[@id='descr']")
	private WebElement descriptionInputfield;

	@FindBy(xpath = "//input[@id='vendor']")
	private WebElement vendorInputField;

	@FindBy(xpath = "//input[@id='system']")
	private WebElement systemInputField;

	@FindBy(xpath = "//input[@id='mesh']")
	private WebElement meshSizeInputField;

	@FindBy(xpath = "//label[text()='Source']/parent::div/ng-select")
	private WebElement sourceDropdown;

	@FindBy(xpath = "//label[text()='Proppant Type']/parent::div/ng-select")
	private WebElement propType;

	@FindBy(xpath = "//label[text()='Proppant Coating']/parent::div/ng-select")
	private WebElement PropCoat;

	@FindBy(xpath = "//label[text()='Source']")
	private WebElement sourceDropdownname;

	@FindBy(xpath = "//label[text()='Proppant Type']")
	private WebElement propTypename;

	@FindBy(xpath = "//label[text()='Proppant Coating']")
	private WebElement PropCoatname;

	@FindBy(xpath = "//input[@id='cost']")
	private WebElement costInputField;

	@FindBy(xpath = "//input[@id='bulkdens']")
	private WebElement bulkDensityInputField;

	@FindBy(xpath = "//input[@id='por']")
	private WebElement packedPorosityInputField;

	@FindBy(xpath = "//input[@id='sg']")
	private WebElement specificGravityInputField;

	@FindBy(xpath = "//input[@id='turba']")
	private WebElement turbulenceCoeffALowStressInputField;

	@FindBy(xpath = "//input[@id='turbb']")
	private WebElement turbulenceCoeffBLowStressInputField;

	@FindBy(xpath = "//input[@id='turbahigh']")
	private WebElement turbulenceCoeffAHighStressInputField;

	@FindBy(xpath = "//input[@id='turbbhigh']")
	private WebElement turbulenceCoeffBHighStressInputField;

	@FindBy(xpath = "//input[@id='stress']")
	private WebElement thresholdStressInputField;

	@FindBy(xpath = "//input[@id='diam']")
	private WebElement diameterInputField;

	@FindBy(xpath = "//input[@id='width']")
	private WebElement widthAt2PSFInputField;

	@FindBy(xpath = "//input[@id='corra']")
	private WebElement widthCorrectionAInputField;

	@FindBy(xpath = "//input[@id='corrb']")
	private WebElement widthCorrectionBInputField;

	@FindBy(xpath = "//input[@id='exp']")
	private WebElement stressCycleExponentInputField;

	@FindBy(xpath = "//label[text()='Proppant Type']/parent::div/ng-select")
	private WebElement proppantTypeDropdown;

	@FindBy(xpath = "//label[text()='Proppant Coating']/parent::div/ng-select")
	private WebElement proppantCoatingDropdown;

	@FindBy(xpath = "//input[@id='ResTemp']")
	private WebElement proppantPermDisplayedatInputField;

	@FindBy(xpath = "//input[@id='PropConc']")
	private WebElement proppantPermDisplayedAndInputField;

	@FindBy(xpath = "//input[@id='measdate']")
	private WebElement dateOfMeasurementInputField;

	@FindBy(xpath = "//textarea[@id='comments']")
	private WebElement commentsTextAreaField;

	@FindBy(xpath = "//label[text()='Independent Lab Verification']")
	private WebElement independentLabVerificationCheckbox;

	@FindBy(xpath = "//button[text()=' Recalculate ']")
	private WebElement recalculateButton;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[text()=' Go Back ']")
	private WebElement goBackButton;

	@FindBy(xpath = "//button[text()='No, Discard']")
	private WebElement noDiscardButtonOnGoBackPopUp;

	@FindBy(xpath = "//button[text()='Yes, Save']")
	private WebElement yesSaveButtonOnGoBackPopUp;

	// Table header Column Element

	@FindBy(xpath = "(//span[text()='Effective Stress on Prop (psi)'])[2]")
	private WebElement effectiveStressonPropColumnHeader;

	@FindBy(xpath = "(//span[text()='Proppant Permeability (D)'])[2]")
	private WebElement proppantPermeabilityColumnHeader;

	@FindBy(xpath = "(//span[text()='Perm at Reservoir Temp (D)'])[2]")
	private WebElement permatReservoirTempColumnHeader;

	@FindBy(xpath = "(//span[text()='Avg. Width for 2 lb/ft² (in)'])[2]")
	private WebElement avgWidthfor2ColumnHeader;

	@FindBy(xpath = "(//span[text()='Avg Width after Embedment for 2 Ib/ft² (in)'])[2]")
	private WebElement avgWidthafterEmbedmentfor2ColumnHeader;

	@FindBy(xpath = "(//span[text()='Conductivity after Embedment for 2 Ib/ft² (mD ft)'])[2]")
	private WebElement conductivityafterEmbedmentfor2ColumnHeader;

	@FindBy(xpath = "(//span[text()='Beta Factor (atm-s²/g)'])[2]")
	private WebElement betaFactorColumnHeader;

	// First Row Element in Handson table

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[1]/td[1]")
	private WebElement effectiveStressonPropFirstRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[2]/td[1]")
	private WebElement effectiveStressonPropSecondRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[3]/td[1]")
	private WebElement effectiveStressonPropThirdRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[4]/td[1]")
	private WebElement effectiveStressonPropFourthRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[5]/td[1]")
	private WebElement effectiveStressonPropFifthRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[6]/td[1]")
	private WebElement effectiveStressonPropSixthRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[7]/td[1]")
	private WebElement effectiveStressonPropSeventhRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[8]/td[1]")
	private WebElement effectiveStressonPropEightRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[9]/td[1]")
	private WebElement effectiveStressonPropNinthRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[10]/td[1]")
	private WebElement effectiveStressonPropTenthRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[11]/td[1]")
	private WebElement effectiveStressonPropEleventhRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[1]/td[2]")
	private WebElement proppantPermeabilityFirstRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[1]/td[3]")
	private WebElement permatReservoirTempFirstRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[1]/td[4]")
	private WebElement avgWidthfor2FirstRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[1]/td[5]")
	private WebElement avgWidthafterEmbedmentfor2FirstRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[1]/td[6]")
	private WebElement conductivityafterEmbedmentfor2FirstRow;

	@FindBy(xpath = "//app-reusable-spreadsheet/div/hot-table/div/div[1]/div/div/div/table/tbody/tr[1]/td[7]")
	private WebElement betaFactorFirstRow;

	public void clickElementOnFirstEditProppant() {
		try {
			WebElement editProppantIcon = driver.findElement(By.xpath("//td[text()='" + ReadData.readdata("Proppant1")
					+ "']/parent::tr/th/following-sibling::td[3]/div/img[@alt='Edit']"));
			elementUtils.clickElement(editProppantIcon);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantNameSelectedOption() {
		try {
			// CommonUtils.DropdownSelectedOptionVerification(proppantNameDropdown, 0,
			// "Selected proppant option does not match");
			Assert.assertEquals(proppantNameDropdown.getAttribute("innerText").trim(), "100 mesh",
					"Bydefault first  proppant name is incorrect");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDescriptionFieldValueAndIsDescriptionFieldReadable(String expectedValue) {
		try {
			Assert.assertEquals(descriptionInputfield.getAttribute("value"), expectedValue,
					"Description field value does not match!");
			boolean isDisabled = "true".equals(descriptionInputfield.getAttribute("disabled"));
			Assert.assertTrue(isDisabled, "Description Field should be disabled but it is not.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyVendorFieldValue(String expectedValue) {
		try {
			Assert.assertEquals(vendorInputField.getAttribute("value"), expectedValue,
					"Vendor field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySystemFieldValue(String expectedValue) {
		try {
			Assert.assertEquals(systemInputField.getAttribute("value"), expectedValue,
					"System field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMeshSizeFieldValue(String expectedValue) {
		try {
			Assert.assertEquals(meshSizeInputField.getAttribute("value"), expectedValue,
					"Mesh Size field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySourceSelectedOption() {
		try {
			// CommonUtils.DropdownSelectedOptionVerification(sourceDropdown,
			// dropdownIndexNo, "Selected source Dropdown option does not match");
			Assert.assertEquals(sourceDropdown.getAttribute("innerText").trim(), "Unknown",
					"Bydefault source dropdown name is incorrect");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantTypeSelectedOption() {
		try {
			// CommonUtils.DropdownSelectedOptionVerification(sourceDropdown,
			// dropdownIndexNo, "Selected Proppant type Dropdown option does not match");
			Assert.assertEquals(propType.getAttribute("innerText").trim(), "Sand",
					"Bydefault proppant type dropdown name is incorrect");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantCoatingSelectedOption() {
		try {
			// CommonUtils.DropdownSelectedOptionVerification(sourceDropdown,
			// dropdownIndexNo, "Selected Proppant Coating Dropdown option does not match");
			Assert.assertEquals(PropCoat.getAttribute("innerText").trim(), "None",
					"Bydefault Proppant coating dropdown name is incorrect");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyIsProppantPermDisplayedAtFieldReadable() {
		try {
			boolean isDisabled = "true".equals(proppantPermDisplayedatInputField.getAttribute("disabled"));
			Assert.assertTrue(isDisabled, "Proppant Perm displayed at Field should be disabled but it is not.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyIsProppantPermDisplayedAndFieldReadable() {
		try {
			boolean isDisabled = "true".equals(proppantPermDisplayedAndInputField.getAttribute("disabled"));
			Assert.assertTrue(isDisabled, "Proppant Perm displayed and Field should be disabled but it is not.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantPermDisplayedAtFieldValue(String expectedValue) {
		try {
			Assert.assertEquals(proppantPermDisplayedatInputField.getAttribute("value"), expectedValue,
					"Proppant Perm Displayed At field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantPermDisplayedAndFieldValue(String expectedValue) {
		try {
			Assert.assertEquals(proppantPermDisplayedAndInputField.getAttribute("value"), expectedValue,
					"Proppant Perm Displayed And field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyIsAllTableHeaderColumnPresent() {
		try {
			Thread.sleep(1000);
			CommonUtils.scrollToBottom(driver);
			Thread.sleep(1000);
			Assert.assertTrue(effectiveStressonPropColumnHeader.isDisplayed(),
					"Effective Stress on Prop column header is not displayed!");
			Assert.assertTrue(proppantPermeabilityColumnHeader.isDisplayed(),
					"proppant Permeability column header is not displayed!");
			Assert.assertTrue(permatReservoirTempColumnHeader.isDisplayed(),
					"permat Reservoir Temp column header is not displayed!");
			Assert.assertTrue(avgWidthfor2ColumnHeader.isDisplayed(), "avgWidthfor2 column header is not displayed!");
			Assert.assertTrue(avgWidthafterEmbedmentfor2ColumnHeader.isDisplayed(),
					"avgWidthafterEmbedmentfor2 column header is not displayed!");
			Thread.sleep(1000);
			avgWidthafterEmbedmentfor2ColumnHeader.click();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			action.sendKeys(Keys.ARROW_RIGHT).perform();
			Thread.sleep(1000);
			Assert.assertTrue(conductivityafterEmbedmentfor2ColumnHeader.isDisplayed(),
					"conductivityafterEmbedmentfor2 column header is not displayed!");
			Assert.assertTrue(betaFactorColumnHeader.isDisplayed(), "beta Factor column header is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifySourceDropdownOptions() {
		try {
			Thread.sleep(1000);
			CommonUtils.scrollToTop(driver);
			Thread.sleep(1000);
			List<String> expected = List.of("Unknown", "Web Site", "Vendor's Documentation",
					"Compiled from Various Sources", "Stim-Lab 6.0", "Stim-Lab 1999", "Generic", "Halliburton DLL");
			elementUtils.verifyDropdownOptions(sourceDropdown, expected, "Source Dropdown option count mismatch");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<String> getAllSourceDropdownOptions() throws InterruptedException {

		// Click to expand dropdown
		elementUtils.clickElement(sourceDropdown);
		Thread.sleep(1000);

		// Locate all options
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']"));

		// Extract text from each option
		List<String> optionTexts = new ArrayList<>();
		for (WebElement option : options) {
			String text = option.getText().trim();
			optionTexts.add(text);
			System.out.println("Dropdown option: " + text); // Print each option
		}

		// ✅ Assertion - expected list
		List<String> expectedOptions = Arrays.asList("Unknown", "Web Site", "Vendor's Documentation",
				"Compiled from Various Sources", "Stim-Lab 6.0", "Stim-Lab 1999", "Generic", "Halliburton DLL");
		Assert.assertEquals(optionTexts, expectedOptions, "Dropdown options do not match!");
		elementUtils.clickElement(sourceDropdownname);
		return optionTexts;

	}

	// public void verifyProppantTypeDropdownOptions() {
	// try {
	// Thread.sleep(1000);
	// CommonUtils.scrollToTop(driver);
	// Thread.sleep(1000);
	// List<String> expected = List.of("Undefined", "Sand", "Ceramic", "Low Density
	// Ceramic", "Medium Density Ceramic", "High Density Ceramic", "Resin Coated
	// Sand", "Resin Coated Low Density Ceramic", "Resin Coated Medium Density
	// Ceramic", "Resin Coated High Density Ceramic" );
	// elementUtils.verifyDropdownOptions(proppantTypeDropdown, expected, "Proppant
	// Coating Dropdown option count mismatch");
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void clickOtherDetails() {
		try {
			WebElement otherdetails = driver
					.findElement(By.xpath("//span[text()='Details']/parent::div/following-sibling::i"));
			elementUtils.clickElement(otherdetails);
			Thread.sleep(2000);
			elementUtils.clickElement(otherdetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<String> verifyProppantTypeDropdownOptions() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", propTypename);

		// Click to expand dropdown
		elementUtils.clickElement(proppantTypeDropdown);
		Thread.sleep(1000);

		// Locate all options
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']"));

		// Extract text from each option
		List<String> optionTexts1 = new ArrayList<>();
		for (WebElement option : options) {
			String text = option.getText().trim();
			optionTexts1.add(text);
			System.out.println("Dropdown option: " + text); // Print each option
		}

		// ✅ Assertion - expected list
		List<String> expectedOptions1 = Arrays.asList("Undefined", "Sand", "Ceramic", "Low Density Ceramic",
				"Medium Density Ceramic", "High Density Ceramic", "Resin Coated Sand",
				"Resin Coated Low Density Ceramic", "Resin Coated Medium Density Ceramic",
				"Resin Coated High Density Ceramic");
		Assert.assertEquals(optionTexts1, expectedOptions1, "Dropdown options do not match!");
		elementUtils.clickElement(propTypename);
		return optionTexts1;
	}
	// public List<String> verifyProppantTypeDropdownOptions() throws
	// InterruptedException {
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight",
	// proppantTypeDropdown);
	// // Click to expand dropdown
	// elementUtils.clickElement(proppantTypeDropdown);
	// Thread.sleep(1000);
	//
	// // Locate dropdown panel
	// WebElement dropdownPanel =
	// driver.findElement(By.xpath("//div[@role='listbox']"));
	//
	// // Scroll until all options are loaded
	// List<WebElement> options;
	// int previousCount = 0;
	// int maxTries = 10;
	// while (maxTries-- > 0) {
	// options = driver.findElements(By.xpath("//div[@role='option']"));
	// if (options.size() == previousCount) {
	// break; // no new items loaded
	// }
	// previousCount = options.size();
	//
	// // Scroll to the last option
	// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop =
	// arguments[0].scrollHeight", dropdownPanel);
	// Thread.sleep(500);
	// }
	//
	// // Now fetch all options
	// options = driver.findElements(By.xpath("//div[@role='option']"));
	// List<String> optionTexts = new ArrayList<>();
	// for (WebElement option : options) {
	// String text = option.getText().trim();
	// optionTexts.add(text);
	// System.out.println("Dropdown option: " + text);
	// }
	//
	// // ✅ Assertion - expected list
	// List<String> expectedOptions = Arrays.asList(
	// "Undefined" ,"Sand","Ceramic","Low Density Ceramic","Medium Density Ceramic",
	// "High Density Ceramic","Resin Coated Sand","Resin Coated Low Density
	// Ceramic",
	// "Resin Coated Medium Density Ceramic","Resin Coated High Density Ceramic"
	// );
	// Assert.assertEquals(optionTexts, expectedOptions, "Dropdown options do not
	// match!");
	//
	// return optionTexts;
	// }

	// public void verifyProppantCoatingOptions() {
	// try {
	// Thread.sleep(1000);
	// CommonUtils.scrollToTop(driver);
	// Thread.sleep(1000);
	// List<String> expected = List.of("None", "Precured", "Curable");
	// elementUtils.verifyDropdownOptions(proppantCoatingDropdown, expected,
	// "ProppantType Dropdown option count mismatch");
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public List<String> verifyProppantCoatingOptions() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", PropCoatname);

		// Click to expand dropdown
		elementUtils.clickElement(proppantCoatingDropdown);
		Thread.sleep(1000);

		// Locate all options
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']"));

		// Extract text from each option
		List<String> optionTexts1 = new ArrayList<>();
		for (WebElement option : options) {
			String text = option.getText().trim();
			optionTexts1.add(text);
			System.out.println("Dropdown option: " + text); // Print each option
		}

		// ✅ Assertion - expected list
		List<String> expectedOptions1 = Arrays.asList("None", "Precured", "Curable");
		Assert.assertEquals(optionTexts1, expectedOptions1, "Dropdown options do not match!");
		elementUtils.clickElement(proppantCoatingDropdown);
		return optionTexts1;
	}

	public void verifyPackedPorosityFieldReadable() {
		try {
			boolean isDisabled = "true".equals(packedPorosityInputField.getAttribute("disabled"));
			Assert.assertTrue(isDisabled, "Packed Porosity Field should be disabled but it is not.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAllColumnFieldReadableExceptSecondColumn() {
		try {
			WebElement proppantPermeability = driver.findElement(By.xpath(
					"//span[text()=' Proppant Permeability Vs. Effective Stress ']/parent::div/following-sibling::i"));
			elementUtils.clickElement(proppantPermeability);
			Thread.sleep(2000);
			elementUtils.verifyCellIsReadOnly(effectiveStressonPropFirstRow);
			elementUtils.verifyCellIsReadOnly(permatReservoirTempFirstRow);
			elementUtils.verifyCellIsReadOnly(avgWidthfor2FirstRow);
			elementUtils.verifyCellIsReadOnly(avgWidthafterEmbedmentfor2FirstRow);
			elementUtils.verifyCellIsReadOnly(conductivityafterEmbedmentfor2FirstRow);
			elementUtils.verifyCellIsReadOnly(betaFactorFirstRow);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySecondColumnFieldEditable() {
		try {
			elementUtils.verifyCellIsEditable(proppantPermeabilityFirstRow);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyColumn1DisplaysNumbersIncrementedBy2000StartingFrom0To20000() {
		try {
			Assert.assertEquals(effectiveStressonPropFirstRow.getText(), "0",
					"Effective Stress on Prop for First Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropSecondRow.getText(), "2000",
					"Effective Stress on Prop for Second Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropThirdRow.getText(), "4000",
					"Effective Stress on Prop for Third Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropFourthRow.getText(), "6000",
					"Effective Stress on Prop for Fourth Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropFifthRow.getText(), "8000",
					"Effective Stress on Prop for Fifth Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropSixthRow.getText(), "10000",
					"Effective Stress on Prop for Sixth Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropSeventhRow.getText(), "12000",
					"Effective Stress on Prop for Seventh Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropEightRow.getText(), "14000",
					"Effective Stress on Prop for Eight Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropNinthRow.getText(), "16000",
					"Effective Stress on Prop for Ninth Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropTenthRow.getText(), "18000",
					"Effective Stress on Prop for Tenth Row field value does not match!");
			Assert.assertEquals(effectiveStressonPropEleventhRow.getText(), "20000",
					"Effective Stress on Prop for Eleventh Row field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDefaultValueOfAllColumnsForFirstRow() {
		try {
			Assert.assertEquals(effectiveStressonPropFirstRow.getText(), "0.000",
					"Effective Stress on Prop for First Row field value does not match!");
			Assert.assertEquals(proppantPermeabilityFirstRow.getText(), "2,000.000",
					"Effective Stress on Prop for First Row field value does not match!");
			Assert.assertEquals(permatReservoirTempFirstRow.getText(), "4,000.000",
					"Effective Stress on Prop for First Row field value does not match!");
			Assert.assertEquals(avgWidthfor2FirstRow.getText(), "6,000.000",
					"Effective Stress on Prop for First Row field value does not match!");
			Assert.assertEquals(avgWidthafterEmbedmentfor2FirstRow.getText(), "8,000.000",
					"Effective Stress on Prop for First Row field value does not match!");
			Assert.assertEquals(conductivityafterEmbedmentfor2FirstRow.getText(), "10,000.000",
					"Effective Stress on Prop for First Row field value does not match!");
			Assert.assertEquals(betaFactorFirstRow.getText(), "12,000.000",
					"Effective Stress on Prop for First Row field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
