
package com.FracProPlus.pages;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.FracProPlus.utils.CommonUtils;
import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

public class CreatePadAndWellPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	private String expectedErrorMessageforpadname = "Pad Name is required.";
	private String expectedErrorMessagefieldname = "Field Name is required.";
	private String expectedErrorMessagewellname = "Well Name is required.";
	private String expectedErrorMessagewellapi = "Well API is required.";
	private String expectedErrorMessagewellapilength = "Well API length must be 10 or 14.";

	Random random = new Random();
	long randomLong = 1 + (long) (random.nextDouble() * 9_999_999_999L);
	String randomNumber = String.format("%010d", randomLong);

	public CreatePadAndWellPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[text()='FracPro Live +']/parent::div/a")
	private WebElement Gotoapplication;

	@FindBy(xpath = "//h5[text()='FracPro Live+']/parent::div/parent::div/following-sibling::div/a")
	private WebElement ContinueButton;

	@FindBy(xpath = "//h5[contains(text(),'Core+')]")
	private WebElement FracProCorePlusCard;

	@FindBy(xpath = "//h5[contains(text(),'Live+')]")
	private WebElement FracProLivePlusCard;

	@FindBy(xpath = "//h5[contains(text(),'StimPro')]")
	private WebElement StimProCard;

	@FindBy(xpath = "//h5[contains(text(),'Live X')]")
	private WebElement FracProLiveXCard;

	@FindBy(xpath = "//h5[contains(text(),'XOPS')]")
	private WebElement XOPSCard;

	@FindBy(xpath = "(//h5[text()='FracPro AI'])[2]")
	private WebElement FracProAICard;

	@FindBy(xpath = "//*[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//*[text()=' All ']")
	private WebElement Alloption;

	@FindBy(xpath = "//*[text()='New Pad ']")
	private WebElement AddNewPad;

	@FindBy(xpath = "//*text()='Add Well']")
	private WebElement AddNewWell;

	@FindBy(xpath = "//*[@id='padName']")
	private WebElement NewPadName;

	@FindBy(xpath = "//*[text()='General Information']")
	private WebElement General;

	@FindBy(xpath = "//*[text()=' Pad Name is required. ']")
	private By errorMessagePadname;

	@FindBy(id = "prospect")
	private WebElement FieldName;

	@FindBy(id = "wellName")
	private WebElement wellNameTextbox;

	@FindBy(id = "wellAPI")
	private WebElement wellAPITexbox;

	@FindBy(id = "operatorCompany")
	private WebElement companyNameDropdown;

	@FindBy(id = "compRepresentative")
	private WebElement companyRepresentativeTextbox;

	@FindBy(id = "supervisor")
	private WebElement serviceCompanyRepTextbox;

	@FindBy(id = "serviceCompany")
	private WebElement serviceCompanyDropdown;

	@FindBy(id = "treatmentAnalyst")
	private WebElement treatmentAnalystTextbox;

	@FindBy(id = "latitude")
	private WebElement latitudeTextbox;

	@FindBy(xpath = "//*[text()='Location']")
	private WebElement LocationTab;

	@FindBy(xpath = "//*[text()='Additional Info']")
	private WebElement AdditionalInfotab;

	@FindBy(id = "longitude")
	private WebElement longitudeTextbox;

	@FindBy(id = "elevation")
	private WebElement elevationTextbox;

	@FindBy(id = "kellyBushing")
	private WebElement kbTextbox;

	@FindBy(id = "zipperGroup")
	private WebElement zipperGroupTextbox;

	@FindBy(id = "landingPoint")
	private WebElement landingPointTextbox;

	@FindBy(id = "fleet")
	private WebElement fleetTextbox;

	@FindBy(id = "tag")
	private WebElement wellTagTextbox;

	@FindBy(id = "afe")
	private WebElement afeTextbox;

	@FindBy(xpath = "//*[@id='toast-container']")
	private WebElement SavedToastMessage;

	@FindBy(xpath = "//*[@id='toast-container']")
	private WebElement SavedpopupMessage;

	@FindBy(xpath = "//*[@src='assets/images/logo.svg']")
	private WebElement Fracproplusicon;

	@FindBy(xpath = "//*[contains(@class,'form-control search-input')]")
	private WebElement SearchPad;

	@FindBy(xpath = "//*[@routerlink='/well-pad/homepage']")
	private WebElement FracproplusiconWellandTreatment;

	public void navigateToDashboardPage() {
		try {
			CommonUtils.dismissChromePasswordPopup();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isTitleDisplayedCorrectly() {
		try {
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			String expectedTitle = "Live+";
			Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isFracProCorePlusCardDisplayed() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Verify FracPro Core+ card is displayed
			wait.until(ExpectedConditions.visibilityOf(FracProCorePlusCard));
			Assert.assertEquals(
					FracProCorePlusCard.getAttribute("innerText").trim(),
					"FracPro Core+",
					"FracProCorePlus Card is not displayed");

			// Locate Contact Sales button (safer XPath)
			By contactSalesLocator = By
					.xpath("//h5[text()='FracPro Core+']/ancestor::div[contains(@class,'card')]//button");
			WebElement contactSales = wait.until(ExpectedConditions.elementToBeClickable(contactSalesLocator));

			// Scroll to the button in case it's out of view (headless fix)
			js.executeScript("arguments[0].scrollIntoView(true);", contactSales);
			elementUtils.clickElement(contactSales);

			// Verify popup title
			WebElement fracpro = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='FracPro Core+']")));
			Assert.assertEquals(fracpro.getText().trim(), "FracPro Core+",
					"FracProCorePlus Card is not displayed in contact sales button");

			// Click Yes button
			WebElement yesBtn = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Yes ']")));
			elementUtils.clickElement(yesBtn);

			// Verify Thank you message
			WebElement thankYouMessage = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//h4[text()='Thanks for showing your interest.']")));
			Assert.assertEquals(
					thankYouMessage.getText().trim(),
					"Thanks for showing your interest.",
					"Thanks for showing your interest message is not displayed in contact sales button");

			// Click Ok button
			WebElement okBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Ok ']")));
			elementUtils.clickElement(okBtn);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception in verifying FracProCorePlusCard flow: " + e.getMessage());
		}
	}

	public void isFracProLivePlusCardDisplayed() {
		try {
			Thread.sleep(2000);
			Assert.assertEquals(FracProLivePlusCard.getAttribute("innerText").trim(), "FracPro Live+",
					"FracProCorePlus Card is not displayed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isFracProAICardDisplayed() {
		try {
			Assert.assertTrue(elementUtils.isElementDisplayed(FracProAICard), "FracProAI Card is not displayed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isXOPSCardDisplayed() {
		try {
			Thread.sleep(2000);
			Assert.assertEquals(XOPSCard.getAttribute("innerText").trim(), "XOPS", "XOPS Card is not displayed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isFracProLiveXCardDisplayed() {
		try {
			Assert.assertEquals(FracProLiveXCard.getAttribute("innerText").trim(), "FracPro Live X",
					"FracPro Live X Card is not displayed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isStimProCardDisplayed() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Verify StimPro card is displayed
			wait.until(ExpectedConditions.visibilityOf(StimProCard));
			Assert.assertEquals(
					StimProCard.getAttribute("innerText").trim(),
					"StimPro",
					"StimPro Card is not displayed");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception in verifying StimProCard flow: " + e.getMessage());
		}
	}

	public void clickongotoapplication() {
		try {
			// CommonUtils.dismissChromePasswordPopup();
			elementUtils.clickElement(Gotoapplication);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickContinueFromFracProLivePlusCard() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(ContinueButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickFracProLiveContinueButton() {
		try {
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Locator for Continue button inside FracPro Live+
			By continueBtnLocator = By.xpath("//h5[text()='FracPro Live+']/ancestor::div[contains(@class,'card')]//a");

			// Wait for element to be present
			WebElement continueBtn = wait.until(ExpectedConditions.presenceOfElementLocated(continueBtnLocator));

			// Scroll into view
			js.executeScript("arguments[0].scrollIntoView({block: 'center'});", continueBtn);

			// Click using JavaScript
			js.executeScript("arguments[0].click();", continueBtn);

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Failed to click on FracPro Live+ Continue button: " + e.getMessage());
		}
	}

	public void clickonalloption() {
		try {
			elementUtils.clickElement(Alloption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickonaddnewpadbutton() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(AddNewPad);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickonaddnewWellbutton() {
		try {
			elementUtils.clickElement(AddNewWell);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EnterPadname() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Workbook workbook = null;
		try {
			String filePath = "FracproPlusData/FracproData.xlsx";
			fis = new FileInputStream(filePath);
			workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(1);

			String basePadName = cell.getStringCellValue().replaceAll("\\d*$", "");
			int randomNum = new Random().nextInt(1000);
			String uniquePadName = basePadName + randomNum;

			// Send pad name to your field
			elementUtils.clearAndSendKeys(NewPadName, uniquePadName);

			// Update the Excel cell with the unique pad name
			cell.setCellValue(uniquePadName);

			// Write changes back to Excel
			fos = new FileOutputStream(filePath);
			workbook.write(fos);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (workbook != null)
					workbook.close();
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	public void EnterFieldname() {
		try {
			elementUtils.clearAndSendKeys(FieldName, "TestAutomation");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterWellName() {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		Workbook workbook = null;

		try {
			Thread.sleep(1000);
			String filePath = "FracproPlusData/FracproData.xlsx";
			fis = new FileInputStream(filePath);
			workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("Sheet1"); // or the actual sheet name
			Row row = sheet.getRow(2); // Update row index if PadName is in a different row
			Cell cell = row.getCell(1); // Update column index if PadName is in a different column

			String baseWellName = cell.getStringCellValue().replaceAll("\\d*$", "");
			;
			int randomNum = new Random().nextInt(1000);
			String uniqueWellName = baseWellName + randomNum;

			elementUtils.clearAndSendKeys(wellNameTextbox, uniqueWellName);

			// Update the Excel cell with the unique Well name
			cell.setCellValue(uniqueWellName);

			// Write changes back to Excel
			fos = new FileOutputStream(filePath);
			workbook.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterWellAPI() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Workbook workbook = null;
		try {
			Thread.sleep(1000);
			String filePath = "FracproPlusData/FracproData.xlsx";
			fis = new FileInputStream(filePath);
			workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("Sheet1"); // or the actual sheet name
			Row row = sheet.getRow(3); // Update row index if PadName is in a different row
			Cell cell = row.getCell(1); // Update column index if PadName is in a different column

			Random rand = new Random();

			String part1 = String.format("%02d", rand.nextInt(100)); // 2 digits
			String part2 = String.format("%03d", rand.nextInt(1000)); // 3 digits
			String part3 = String.format("%05d", rand.nextInt(100000)); // 5 digits
			String part4 = String.format("%02d", rand.nextInt(100)); // 2 digits
			String part5 = String.format("%02d", rand.nextInt(100)); // 2 digits

			String randomWellAPI = part1 + "-" + part2 + "-" + part3 + "-" + part4 + "-" + part5;

			elementUtils.clearAndSendKeys(wellAPITexbox, randomWellAPI);
			// Update the Excel cell with the unique Well name
			cell.setCellValue(randomWellAPI);

			// Write changes back to Excel
			fos = new FileOutputStream(filePath);
			workbook.write(fos);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectCompanyName() {
		try {
			Thread.sleep(1000);
			WebElement companyNameDropdown = driver.findElement(
					By.xpath("//label[text()=' Company Name ']/parent::div/ng-select[@id='operatorCompany']"));
			elementUtils.clickElement(companyNameDropdown);
			Thread.sleep(1000);
			WebElement companyNameDropdownoption = driver.findElement(By.xpath("//div[text()='QA Operator']"));
			elementUtils.clickElement(companyNameDropdownoption);
			// elementUtils.selectOptionInNgSelect(companyNameDropdown,
			// ReadData.readdata("CompanyName"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterCompanyRepresentative() {
		try {
			elementUtils.clearAndSendKeys(companyRepresentativeTextbox, ReadData.readdata("CompanyRepresentative"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterServiceCompanyRep() {
		try {
			elementUtils.clearAndSendKeys(serviceCompanyRepTextbox, ReadData.readdata("ServiceCompanyRep"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectServiceCompanyName() {
		try {
			Thread.sleep(1000);
			WebElement servicecompanyNameDropdown = driver.findElement(
					By.xpath("//label[text()=' Service Company Name ']/parent::div/ng-select[@id='serviceCompany']"));
			elementUtils.clickElement(servicecompanyNameDropdown);
			Thread.sleep(1000);
			WebElement servicecompanyNameDropdownoption = driver.findElement(By.xpath("//div[text()='QA service']"));
			elementUtils.clickElement(servicecompanyNameDropdownoption);
			// elementUtils.selectOptionInNgSelect(serviceCompanyDropdown,
			// ReadData.readdata("ServiceCompanyName"));

		} catch (Exception e) {
			e.printStackTrace();
			;
		}
	}

	public void enterTreatmentAnalyst() {
		try {
			elementUtils.clearAndSendKeys(treatmentAnalystTextbox, "Mark Analyst");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterLatitude() {
		try {
			Random random = new Random();
			// Generate random latitude between -90 and 90
			double latitude = -90 + (180 * random.nextDouble());
			String latitudeStr = String.format("%.6f", latitude); // Format to 6 decimal places
			elementUtils.clearAndSendKeys(latitudeTextbox, latitudeStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterLongitude() {
		try {
			Random random = new Random();
			// Generate random longitude between -180 and 180
			double longitude = -180 + (360 * random.nextDouble());
			String longitudeStr = String.format("%.6f", longitude); // Format to 6 decimal places
			elementUtils.clearAndSendKeys(longitudeTextbox, longitudeStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickonlocation() {
		try {
			elementUtils.clickElement(LocationTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickonAdditionalInfotab() {
		try {
			elementUtils.clickElement(AdditionalInfotab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterElevation() {
		try {
			elementUtils.clearAndSendKeys(elevationTextbox, "500");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterKB() {
		try {
			elementUtils.clearAndSendKeys(kbTextbox, "1234");
			Thread.sleep(2000);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterZipperGroup() {
		try {
			elementUtils.clearAndSendKeys(zipperGroupTextbox, "Zipper-1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterLandingPoint() {
		try {
			elementUtils.clearAndSendKeys(landingPointTextbox, "Landing-1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFleet() {
		try {
			elementUtils.clearAndSendKeys(fleetTextbox, "Fleet-1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterWellTag() {

		Random random = new Random();

		// Generate three random components
		int part1 = random.nextInt(99) + 1;
		int part2 = random.nextInt(1000);
		int part3 = random.nextInt(100000);

		// Format the parts to match "49-012-28737"
		String formattedRandomNumber = String.format("%02d-%03d-%05d", part1, part2, part3);
		try {
			elementUtils.clearAndSendKeys(wellTagTextbox, formattedRandomNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterAFE() {
		try {
			elementUtils.clearAndSendKeys(afeTextbox, "AFE-456");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickSaveButton() {
		try {
			elementUtils.clickElement(saveButton);
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyPadandwellname() {
		try {
			Thread.sleep(2000);
			// driver.navigate().refresh();
			Thread.sleep(5000);
			WebElement PadName = driver
					.findElement(By.xpath("//*[text()=' Pad: ']/span[text()='" + ReadData.readdata("Padname") + "']"));
			WebElement WellName = driver.findElement(
					By.xpath("//*[text()=' Well: ']/span[text()='" + ReadData.readdata("WellName") + "']"));
			Assert.assertEquals(PadName.getText(), ReadData.readdata("Padname"), "Pad Name does not match!");
			Assert.assertEquals(WellName.getText(), ReadData.readdata("WellName"), "Well Name does not match!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSavedToastMessageDisplayed() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement toastElement = wait.until(ExpectedConditions.visibilityOf(SavedToastMessage));
			Assert.assertTrue(toastElement.isDisplayed(), "Saved toast message is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickFracproplusicon() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(Fracproplusicon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickLogo() {
		try {
			WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
			expandMenu.click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Locate the logo element
			By logoLocator = By.xpath("//*[@src='assets/images/logo.svg']");
			WebElement logo = wait.until(ExpectedConditions.presenceOfElementLocated(logoLocator));

			// Scroll into view (important for headless mode)
			js.executeScript("arguments[0].scrollIntoView({block: 'center'});", logo);

			// Click using JavaScript
			js.executeScript("arguments[0].click();", logo);

			System.out.println("Logo clicked successfully.");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Failed to click on the logo: " + e.getMessage());
		}
	}

	public void clickLogo2() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Locate the logo element
			By logoLocator = By.xpath("//*[@src='assets/images/logo.svg']");
			WebElement logo = wait.until(ExpectedConditions.presenceOfElementLocated(logoLocator));

			// Scroll into view (important for headless mode)
			js.executeScript("arguments[0].scrollIntoView({block: 'center'});", logo);

			// Click using JavaScript
			js.executeScript("arguments[0].click();", logo);

			System.out.println("Logo clicked successfully.");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Failed to click on the logo: " + e.getMessage());
		}
	}

	public void clickFracproplusiconWellandTretment() {
		try {
			elementUtils.clickElement(FracproplusiconWellandTreatment);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean verifythePadName() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Click on the filter option
			By filterBtnLocator = By.xpath("//*[contains(@class,'plot-icon')]");
			WebElement filterButton = wait.until(ExpectedConditions.elementToBeClickable(filterBtnLocator));
			js.executeScript("arguments[0].scrollIntoView({block: 'center'});", filterButton);
			js.executeScript("arguments[0].click();", filterButton);

			// Select the "All" radio button
			By allRadioBtnLocator = By.xpath("//*[@id='All']");
			WebElement allRadioButton = wait.until(ExpectedConditions.elementToBeClickable(allRadioBtnLocator));
			js.executeScript("arguments[0].click();", allRadioButton);

			// Select "All" in the time dropdown
			By timeDropdownLocator = By.xpath("//*[@class='ng-input']");
			WebElement timeDropdown = wait.until(ExpectedConditions.elementToBeClickable(timeDropdownLocator));
			elementUtils.selectOptionInNgSelect(timeDropdown, "All");

			// Read expected Pad Name
			String padName = ReadData.readdata("Padname");

			// Verify pad with matching name is present
			By padLocator = By.xpath("//*[text()='Pads']/following::div/span[contains(text(),'" + padName + "')]");
			WebElement matchingPad = wait.until(ExpectedConditions.visibilityOfElementLocated(padLocator));

			return matchingPad.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Failed while verifying the Pad Name: " + e.getMessage());
		}
		return false;
	}

	public boolean SearchPadBySearchbar() {
		try {

			WebElement searchBar = driver.findElement(By.xpath("//*[contains(@class,'form-control search-input')]")); // Adjust
																														// locator
			String Padname = ReadData.readdata("Padname");
			elementUtils.clearAndSendKeys(searchBar, Padname);

			String padName = ReadData.readdata("Padname");
			WebElement matchingPad = driver
					.findElement(By.xpath("//span[starts-with(text(),'" + padName + "')]"));
			return matchingPad != null;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void VerifyPadNameError() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(NewPadName);
			elementUtils.clickElement(General);
			WebElement errorElement = driver.findElement(By.xpath("//*[text()=' Pad Name is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessageforpadname, "Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyFieldNameError() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(FieldName);
			elementUtils.clickElement(General);
			WebElement errorElement = driver.findElement(By.xpath("//*[text()=' Field Name is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessagefieldname, "Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyWellNameError() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(wellNameTextbox);
			elementUtils.clickElement(General);
			WebElement errorElement = driver.findElement(By.xpath("//*[text()=' Well Name is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessagewellname, "Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyWellAPIError() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(wellAPITexbox);
			elementUtils.clickElement(General);
			WebElement errorElement = driver.findElement(By.xpath("//*[text()=' Well API is required. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessagewellapi, "Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyWellAPIlengthError() {
		try {
			Thread.sleep(1000);
			Random random = new Random();
			int randomInt = random.nextInt(999999999) + 1;
			String Randomnumber = String.valueOf(randomInt);
			elementUtils.clearAndSendKeys(wellAPITexbox, Randomnumber);
			WebElement errorElement = driver
					.findElement(By.xpath(" //*[text()=' Well API length must be 10 or 14. ']"));
			String actualErrorMessage = errorElement.getText();
			assertEquals(actualErrorMessage, expectedErrorMessagewellapilength, "Error message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
