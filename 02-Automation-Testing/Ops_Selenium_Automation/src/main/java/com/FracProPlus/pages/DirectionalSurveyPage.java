package com.FracProPlus.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ExcelToWebPaste;
import com.FracProPlus.utils.ReadData;

public class DirectionalSurveyPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public DirectionalSurveyPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Directional Survey']")
	private WebElement directionalSurveyTab;

	@FindBy(xpath = "//label[text()='Specify']/parent::div/ng-select")
	private WebElement specifyDropdown;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//select[@formcontrolname='TrajEditMode']/option[text()='MD, Inclination, Azimuth']")
	private WebElement MDIncAzisurveyTypeDropdown;

	@FindBy(xpath = "//select[@formcontrolname='TrajEditMode']/option[text()='N-S, E-W, TVD']")
	private WebElement NSEWTVDsurveyTypeDropdown;

	@FindBy(xpath = "//select[@formcontrolname='TrajEditMode']/option[text()='MD, TVD, Azimuth ']")
	private WebElement MDTVDAzisurveyTypeDropdown;

	@FindBy(xpath = "(//td[@id='cell-0-5'])[1]")
	private WebElement field6;

	@FindBy(xpath = "(//td[@id='cell-0-4'])[1]")
	private WebElement field5;

	@FindBy(xpath = "(//td[@id='cell-0-3'])[1]")
	private WebElement field4;

	@FindBy(xpath = "(//td[@id='cell-0-0'])[1]")
	private WebElement field1;

	@FindBy(xpath = "(//td[@id='cell-0-1'])[1]")
	private WebElement field2;

	@FindBy(xpath = "(//td[@id='cell-0-2'])[1]")
	private WebElement field3;

	public void clickElementOnDirectionalSurveyTab() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(directionalSurveyTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnSpecifyDropdown() {
		try {
			elementUtils.clickElement(specifyDropdown);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private By dropdownLocator = By.xpath("//select[@formcontrolname='TrajEditMode']");

	// Method to verify the dropdown options
	public void verifyDropdownOptions(WebDriver driver, List<String> expectedOptions) {
		// Locate the dropdown element
		WebElement dropdownElement = driver.findElement(dropdownLocator);

		// Create a Select object to interact with the dropdown
		Select dropdown = new Select(dropdownElement);

		// Get all the options present in the dropdown
		List<WebElement> options = dropdown.getOptions();

		// Check if the number of options matches the expected number
		if (options.size() != expectedOptions.size()) {
			System.out.println("Dropdown options count does not match the expected count.");
			return;
		}

		// Verify each option in the dropdown
		for (int i = 0; i < options.size(); i++) {
			String actualOption = options.get(i).getText();
			String expectedOption = expectedOptions.get(i);

			// Compare the actual and expected option
			if (!actualOption.equals(expectedOption)) {
				System.out.println("Option mismatch at index " + i + ": Expected - " + expectedOption + ", Found - "
						+ actualOption);
			} else {
				System.out.println("  Option " + i + " verified: " + actualOption);
			}
		}
	}

	public void verifySpecifyDropdownOptions() {
		List<String> expectedOptions = Arrays.asList("MD, Inclination, Azimuth", "N-S, E-W, TVD", "MD, TVD, Azimuth");
		verifyDropdownOptions(driver, expectedOptions);

	}

	public void selectNorthSouthEastWestTVDOption() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(specifyDropdown);
			Thread.sleep(1000);
			WebElement option1 = driver.findElement(By.xpath("//div[text()='N-S, E-W, TVD']"));
			elementUtils.clickElement(option1);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTableHeaderNamesForHeaderOption() throws InterruptedException {
		Thread.sleep(2000);
		WebElement tableHeaderNS = driver
				.findElement(By.xpath("(//th[@role='columnheader']//div[normalize-space()='N-S (ft)'])[2]"));

		String actualName = tableHeaderNS.getText().replace("\n", " ").trim();
		Assert.assertEquals(actualName, "N-S (ft)", "Header name N-S does not matched !");

	
		WebElement tableHeaderEW = driver
				.findElement(By.xpath("(//th[@role='columnheader']//div[normalize-space()='E-W (ft)'])[2]"));
		String actualNameEW = tableHeaderEW.getText().replace("\n", " ").trim();
		Assert.assertEquals(actualNameEW, "E-W (ft)", "Header name E-W does not matched !");

	
		WebElement tableHeaderTVD = driver
				.findElement(By.xpath("(//th[@role='columnheader']//div[normalize-space()='TVD (ft)'])[2]"));
		String actualNameTVD = tableHeaderTVD.getText().replace("\n", " ").trim();
		String expectedNameTVD = "TVD (ft)";
		Assert.assertEquals(actualNameTVD, expectedNameTVD, "Header name TVD does not matched !");

		
		WebElement tableHeaderMD = driver
				.findElement(By.xpath("(//th[@role='columnheader']//div[normalize-space()='MD (ft)'])[2]"));
		String actualNameMD = tableHeaderMD.getText().replace("\n", " ").trim();
		String expectedNameMD = "MD (ft)";
		Assert.assertEquals(actualNameMD, expectedNameMD, "Header name MD does not matched !");


		WebElement tableHeaderINC = driver.findElement(
				By.xpath("(//th[@role='columnheader']//div[normalize-space()='Inclination (deg)'])[2]"));
		String actualNameINC = tableHeaderINC.getText().replace("\n", " ").trim();
		String expectedNameINC = "Inclination (deg)";
		Assert.assertEquals(actualNameINC, expectedNameINC, "Header name INC does not matched !");

	
		WebElement tableHeaderAZ = driver
				.findElement(By.xpath("(//th[@role='columnheader']//div[normalize-space()='Azimuth (deg)'])[2]"));
		String actualNameAZ = tableHeaderAZ.getText().replace("\n", " ").trim();
		String expectedNameAZ = "Azimuth (deg)";
		Assert.assertEquals(actualNameAZ, expectedNameAZ, "Header name AZ does not matched !");

	}

	public void selectMDInclinationAzimuthOption() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(specifyDropdown);
			Thread.sleep(1000);
			WebElement option2 = driver.findElement(By.xpath("//div[text()='MD, Inclination, Azimuth']"));
			elementUtils.clickElement(option2);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void PastingDataToColumnRowWiseMdInclination() {
		ExcelToWebPaste excelPaster = new ExcelToWebPaste(driver);
		try {
			Thread.sleep(1000);
			String filePath1 = "FracproPlusData/MdInclination.xlsx";
			By cellLocator1 = By.xpath("(//td[@id='cell-0-0'])[2]");
			excelPaster.copyExcelDataToClipboard(filePath1);
			Thread.sleep(3000);
//			excelPaster.pasteDataIntoCell(cellLocator);
			excelPaster.pasteDataIntoCellBySendKey(cellLocator1);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void PastingDataToColumnRowWiseNsEw() {
		ExcelToWebPaste excelPaster = new ExcelToWebPaste(driver);
		try {
			Thread.sleep(1000);
			String filePath2 = "FracproPlusData/NsEwTvd.xlsx";
			By cellLocator2 = By.xpath("(//td[@id='cell-0-0'])[2]");
			excelPaster.copyExcelDataToClipboard(filePath2);
			Thread.sleep(3000);
//			excelPaster.pasteDataIntoCell(cellLocator);
			excelPaster.pasteDataIntoCellBySendKey(cellLocator2);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTableHeaderNamesForMDInclinationAzimuthOption() throws InterruptedException {
		Thread.sleep(2000);

		WebElement tableHeaderNS = driver.findElement(By.xpath("(//span[text()='N-S (ft)'])[2]"));
		String actualName = tableHeaderNS.getText();
		String expectedName = "N-S (ft)";
		Assert.assertEquals(actualName, expectedName, "Header name N-S does not matched !");

		WebElement tableHeaderEW = driver.findElement(By.xpath("(//span[text()='E-W (ft)'])[2]"));
		String actualNameEW = tableHeaderEW.getText();
		String expectedNameEW = "E-W (ft)";
		Assert.assertEquals(actualNameEW, expectedNameEW, "Header name E-W does not matched !");

		WebElement tableHeaderTVD = driver.findElement(By.xpath("(//span[text()='TVD (ft)'])[2]"));
		String actualNameTVD = tableHeaderTVD.getText();
		String expectedNameTVD = "TVD (ft)";
		Assert.assertEquals(actualNameTVD, expectedNameTVD, "Header name TVD does not matched !");

		WebElement tableHeaderMD = driver.findElement(By.xpath("(//span[text()='MD (ft)'])[2]"));
		String actualNameMD = tableHeaderMD.getText();
		String expectedNameMD = "MD (ft)";
		Assert.assertEquals(actualNameMD, expectedNameMD, "Header name MD does not matched !");

		WebElement tableHeaderINC = driver.findElement(By.xpath("(//span[text()='Inclination (deg)'])[2]"));
		String actualNameINC = tableHeaderINC.getText();
		String expectedNameINC = "Inclination (deg)";
		Assert.assertEquals(actualNameINC, expectedNameINC, "Header name INC does not matched !");

		WebElement tableHeaderAZ = driver.findElement(By.xpath("(//span[text()='Azimuth (deg)'])[2]"));
		String actualNameAZ = tableHeaderAZ.getText();
		String expectedNameAZ = "Azimuth (deg)";
		Assert.assertEquals(actualNameAZ, expectedNameAZ, "Header name AZ does not matched !");
	}

	public void selectMDTVDAndAzimuthOption() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(specifyDropdown);
			Thread.sleep(1000);
			WebElement option3 = driver.findElement(By.xpath("//div[text()='MD, TVD, Azimuth ']"));
			elementUtils.clickElement(option3);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTableHeaderNamesForMDTVDAndAzimuthOption() throws InterruptedException {
		Thread.sleep(2000);

		WebElement tableHeaderNS = driver.findElement(By.xpath("(//span[text()='N-S (ft)'])[2]"));
		String actualName = tableHeaderNS.getText();
		String expectedName = "N-S (ft)";
		Assert.assertEquals(actualName, expectedName, "Header name N-S does not matched !");

		WebElement tableHeaderEW = driver.findElement(By.xpath("(//span[text()='E-W (ft)'])[2]"));
		String actualNameEW = tableHeaderEW.getText();
		String expectedNameEW = "E-W (ft)";
		Assert.assertEquals(actualNameEW, expectedNameEW, "Header name E-W does not matched !");

		WebElement tableHeaderTVD = driver.findElement(By.xpath("(//span[text()='TVD (ft)'])[2]"));
		String actualNameTVD = tableHeaderTVD.getText();
		String expectedNameTVD = "TVD (ft)";
		Assert.assertEquals(actualNameTVD, expectedNameTVD, "Header name TVD does not matched !");

		WebElement tableHeaderMD = driver.findElement(By.xpath("(//span[text()='MD (ft)'])[2]"));
		String actualNameMD = tableHeaderMD.getText();
		String expectedNameMD = "MD (ft)";
		Assert.assertEquals(actualNameMD, expectedNameMD, "Header name MD does not matched !");

		WebElement tableHeaderINC = driver.findElement(By.xpath("(//span[text()='Inclination (deg)'])[2]"));
		String actualNameINC = tableHeaderINC.getText();
		String expectedNameINC = "Inclination (deg)";
		Assert.assertEquals(actualNameINC, expectedNameINC, "Header name INC does not matched !");

		WebElement tableHeaderAZ = driver.findElement(By.xpath("(//span[text()='Azimuth (deg)'])[2]"));
		String actualNameAZ = tableHeaderAZ.getText();
		String expectedNameAZ = "Azimuth (deg)";
		Assert.assertEquals(actualNameAZ, expectedNameAZ, "Header name AZ does not matched !");
	}

	public void enterDataIntoNorthSouthField() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(field1);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("NorthSouthFieldValue"));
			field1.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoEastWestField() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(field2);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("EastWestFieldValue"));
			field2.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoTVDField() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(field3);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("TVDFieldValue"));
			field3.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoMDField() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(field1);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("MDFieldValue"));
			field1.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoInclinationField() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(field2);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("InclinationFieldValue"));
			field2.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoAzimuthField() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(field3);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("AzimuthFieldValue"));
			field3.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnSaveButton() {
		try {
			elementUtils.clickElement(saveButton);
			Thread.sleep(8000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMDFieldValue() {
		try {
			String actualValue = field1.getText();
			String expectedValue = ReadData.readdata("MDFieldValue");
			Assert.assertEquals(actualValue, expectedValue, "MD field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyInclinationFieldValue() {
		try {
			String actualValue = field2.getText();
			String expectedValue = ReadData.readdata("InclinationFieldValue");
			Assert.assertEquals(actualValue, expectedValue, "Inclination field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAzimuthFieldValue() {
		try {
			String actualValue = field3.getText();
			String expectedValue = ReadData.readdata("AzimuthFieldValue");
			Assert.assertEquals(actualValue, expectedValue, "Azimuth field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNorthSouthFieldValue() {
		try {
			String actualValue = field4.getText();
			String expectedValue = ReadData.readdata("NorthSouthFieldValue");
			Assert.assertEquals(actualValue, expectedValue, "North South field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyEastWestFieldValue() {
		try {
			String actualValue = field5.getText();
			String expectedValue = ReadData.readdata("EastWestFieldValue");
			Assert.assertEquals(actualValue, expectedValue, "East West field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTVDFieldValue() {
		try {
			String actualValue = field6.getText();
			String expectedValue = ReadData.readdata("TVDFieldValue");
			Assert.assertEquals(actualValue, expectedValue, "TVD field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public void selectSurveyType(String surveyType) {
//		try {
//			elementUtils.clickElement(surveyTypeDropdown);
//			// Implement selection logic for survey type
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}