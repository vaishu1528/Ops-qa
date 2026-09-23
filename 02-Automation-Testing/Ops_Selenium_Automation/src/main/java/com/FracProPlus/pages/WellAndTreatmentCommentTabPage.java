package com.FracProPlus.pages;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WellAndTreatmentCommentTabPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public WellAndTreatmentCommentTabPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath = "//*[text()='\"+ReadData.readdata(\"Padname\")+\"']")
	// private WebElement Pad;

	// @FindBy(xpath = "//Span[text()='\"+ReadData.readdata(\"WellName\")+\"']")
	// private WebElement Wellname;

	// @FindBy(xpath = "//*[text()=' \"+ReadData.readdata(\"WellName\")+\" ']")
	// private WebElement clickwellOverview;

	@FindBy(xpath = "//*[text()='Comments']")
	private WebElement commentTab;

	@FindBy(xpath = "//*[text()=' Well & Treatment ']")
	private WebElement WellandTreatment;

	@FindBy(xpath = "//*[@class='icon-circle name-alignment']")
	private WebElement ProfileIcon;

	@FindBy(xpath = "//*[@id='page-header-notifications-dropdown']")
	private WebElement BellIcon;

	@FindBy(xpath = "//*[@class='text-reset notification-item custom-pointer']")
	private WebElement Notification;

	@FindBy(xpath = "//*[text()='My Profile']")
	private WebElement MyProfileOption;

	@FindBy(xpath = "//*[text()='Insert row below']")
	private WebElement Insertrowoption;

	@FindBy(xpath = "//tr[@aria-rowindex='4']/th/following-sibling::td[2]")
	private WebElement jobTimeColumn;

	@FindBy(xpath = "//td[@id='cell-0-1']")
	private WebElement jobTimeColumn1;

	@FindBy(xpath = "//tr[@aria-rowindex='4']/th/following-sibling::td[2]")
	private WebElement jobTimeColumn21;

	@FindBy(xpath = "//*[@id='cell-2-1']")
	private WebElement jobTimeColumnnewRow;

	@FindBy(xpath = "//*[@id='cell-2-0']")
	private WebElement Datecolumn;

	@FindBy(xpath = "(//span[@class='rowHeader'])[2]/parent::div/parent::th/following::tr[1]/td[2]")
	private WebElement Timecolumn;

	@FindBy(xpath = "//*[@id='cell-2-2']")
	private WebElement commetscolumn;

	@FindBy(xpath = "//tr[@aria-rowindex='5']/th/following-sibling::td[2]")
	private WebElement jobTimeColumnFourthRow;

	@FindBy(xpath = "//*[@id='cell-2-2']")
	private WebElement commentscolumnrownew;

	@FindBy(xpath = "(//span[@class='rowHeader'])[1]/parent::div/parent::th/following::tr[1]/td[3]")
	private WebElement EnteredtimeElement;

	@FindBy(xpath = "//*[@id='cell-0-0']")
	private WebElement DefaultTimeElement;

	@FindBy(xpath = "//*[@id='cell-1-0']")
	private WebElement updatedTimeElement;

	@FindBy(xpath = "//*[@id='toast-container']")
	private WebElement ToastMassage;

	@FindBy(xpath = "//*[@id='cell-1-2']")
	private WebElement commentscolumn;

	@FindBy(xpath = "(//span[@class='rowHeader'])[2]/parent::div/parent::th/following::tr[1]/td[3]")
	private WebElement commentscolumnthird;

	@FindBy(xpath = "//tr[@aria-rowindex='5']/th/following-sibling::td[3]")
	private WebElement commentscolumnfourth;

	@FindBy(xpath = "//*[text()=' Next ']")
	private WebElement NextButton;

	@FindBy(xpath = "//*[text()=' Channel Inputs for Model ']")
	private WebElement ChannelInputOption;

	@FindBy(xpath = "//h2[text()='Confirm Action']")
	private WebElement ExecpetedUnsavedchangepop;

	@FindBy(xpath = "//*[text()='No, Discard']")
	private WebElement returnToSaveButton;

	@FindBy(xpath = "//*[text()='General Information']")
	private WebElement generalInfoTab;

	@FindBy(xpath = "//*[@class='nav-item']//ancestor::a[contains(text(),'Channel Inputs')]")
	private WebElement ChannelInputsforModel;

	@FindBy(xpath = "//*[@id='page-topbar']//ancestor::h4")
	private WebElement ProfileScreen;

	@FindBy(xpath = "//*[@routerlink='/well-pad/homepage']")
	private WebElement Homescreen;

	@FindBy(xpath = "//*[text()='Proceed without saving']")
	private WebElement proceedWithoutSaving;

	@FindBy(xpath = "//*[text()=' Channel Inputs for Model ']")
	private WebElement sideMenuOption;

	@FindBy(xpath = "//*[text()='NewUIWell']")
	private WebElement wellNameTopRight;

	// public void navigateAndClickOnPad() {
	// try {
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	// Thread.sleep(1000);
	// WebElement Pad=
	// driver.findElement(By.xpath("//*[text()='"+ReadData.readdata("Padname")+"
	// (1)']"));
	// Actions act=new Actions(driver);
	// act.scrollToElement(Pad).perform();
	// elementUtils.clickElement(Pad);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public static By padname = By.xpath("//span[starts-with(text(), '" + ReadData.readdata("Padname") + "')]");

	public void navigateAndClickOnPad() {
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			Thread.sleep(4000);

			// Click on the filter option
			WebElement filterButton = driver.findElement(By.xpath("//*[contains(@class,'plot-icon')]"));
			Thread.sleep(3000);
			elementUtils.clickElement(filterButton);
			// Select the "All" radio button
			WebElement allRadioButton = driver.findElement(By.xpath("//*[@id='All']"));
			allRadioButton.click();
			Thread.sleep(2000);

			// Select "All" in the time dropdown
			WebElement timeDropdown = driver.findElement(By.xpath("//*[@class='ng-input']"));
			elementUtils.clickElement(timeDropdown);
			Thread.sleep(2000);
			WebElement Alldropdown = driver.findElement(By.xpath("//div[text()=' All ']"));
			elementUtils.clickElement(Alldropdown);

			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Pad or Well']"));
			search.sendKeys(ReadData.readdata("padname"));
			WebElement Pad = driver.findElement(padname);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// public static By padname = By.xpath("//span[starts-with(text(), '" +
	// ReadData.readdata("Padname") + "')]");
	// public static By radioAll = By.id("radio_all"); // Update this locator as
	// needed
	// public static By timeDropdown = By.id("time_dropdown"); // Update this
	// locator
	// public static By allTimeOption = By.xpath("//option[text()='All']"); //
	// Update based on actual dropdown structure
	//
	// public void navigateAndClickOnPad() {
	// try {
	// Thread.sleep(2000);
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	// Thread.sleep(1000);
	//
	// // Try to find and click the Pad
	// WebElement pad = null;
	// try {
	// pad = driver.findElement(padname);
	// } catch (NoSuchElementException e) {
	// // Pad not found, proceed to adjust filters
	// }
	//
	// if (pad != null) {
	// Actions act = new Actions(driver);
	// act.scrollToElement(pad).perform();
	// elementUtils.clickElement(pad);
	// } else {
	// // Select 'All' in the radio button
	// WebElement radioAllBtn = driver.findElement(radioAll);
	// if (!radioAllBtn.isSelected()) {
	// radioAllBtn.click();
	// }
	//
	// // Select 'All' in the time dropdown
	// WebElement dropdown = driver.findElement(timeDropdown);
	// Select select = new Select(dropdown);
	// select.selectByVisibleText("All");
	//
	// // Wait for page/data to refresh (adjust timeout as needed)
	// Thread.sleep(2000);
	//
	// // Retry finding and clicking on the Pad
	// pad = driver.findElement(padname);
	// Actions act = new Actions(driver);
	// act.scrollToElement(pad).perform();
	// elementUtils.clickElement(pad);
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void navigateAndClickOnWell() {
		try {
			WebElement padname1 = driver
					.findElement(By.xpath("//span[starts-with(text(), '" + ReadData.readdata("Padname") + "')]"));
			System.out.println(padname1.getText() + " Pad clicked successfully.");
			elementUtils.clickElement(padname1);
			Thread.sleep(2000);
			WebElement Wellname = driver
					.findElement(By.xpath("//Span[text()='" + ReadData.readdata("WellName") + "']"));
			System.out.println("Well element found " + Wellname.getText());
			elementUtils.clickElement(Wellname);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void navigateAndClickOnWell() {
	//
	//
	// String wellNameText = ReadData.readdata("WellName");
	// String xpath = "//span[text()='" + wellNameText + "']";
	//
	// int maxRetries = 5;
	// int retry = 0;
	// WebElement wellNameElement = null;
	//
	// while (retry < maxRetries) {
	// try {
	// WebElement padname1 = driver.findElement(By.xpath("//span[starts-with(text(),
	// '" + ReadData.readdata("Padname") + "')]"));
	// System.out.println(padname1.getText() + " Pad clicked successfully.");
	// elementUtils.clickElement(padname1);
	// wellNameElement = driver.findElement(By.xpath(xpath));
	// System.out.println("Well element found: " + wellNameElement.getText());
	// break; // Exit loop when found
	// } catch (Exception e) {
	// retry++;
	// System.out.println("Attempt " + retry + ": Well element not found.
	// Retrying...");
	//
	// if (retry == maxRetries) {
	// throw new RuntimeException("Failed to find WellName after " + maxRetries + "
	// attempts");
	// }
	//
	// try {
	// Thread.sleep(1000); // Wait 1 second before retry
	// } catch (InterruptedException ie) {
	// Thread.currentThread().interrupt();
	// }
	// }
	// }
	//
	// // Only click if element is found
	// elementUtils.clickElement(wellNameElement);
	// System.out.println("Click triggered on: " + wellNameElement.getText());
	// }

	public void clickElementOnWellFromOverview() {
		try {
			WebElement clickwellOverview = driver
					.findElement(By.xpath("//*[text()=' " + ReadData.readdata("WellName") + " ']"));
			elementUtils.clickElement(clickwellOverview);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Verify Page Title
	public void verifyPageTitle() {
		String expectedTitle = "Live+"; // Update this with the actual title
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle, "Page title does not match!");
	}

	// Verify Well Name
	public void verifyWellName() {

		String actualWellName = elementUtils.getElementText(wellNameTopRight);
		String expectedWellName = ReadData.readdata("WellName");
		Assert.assertEquals(actualWellName, expectedWellName, "Well name does not match!");

	}

	// Click on Comment Tab
	public void clickCommentTab() throws InterruptedException {
		Thread.sleep(2000);
		elementUtils.clickElement(commentTab);
	}

	public void clickWellandTreatment() throws InterruptedException {
		WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
		expandMenu.click();
		Thread.sleep(1000);
		elementUtils.clickElement(WellandTreatment);
		Thread.sleep(1000);
		WebElement CollapseMenu = driver.findElement(By.xpath("//img[@tooltip='Collapse']"));
		CollapseMenu.click();
	}

	public void clickWellandTreatment1() throws InterruptedException {
		Thread.sleep(1000);
		elementUtils.clickElement(WellandTreatment);
		Thread.sleep(1000);
	}

	public void ClickProfilrIcon() {
		elementUtils.clickElement(ProfileIcon);
	}

	public void ClickBellIcon() {
		elementUtils.clickElement(BellIcon);
	}

	public void Clicknotification() {
		elementUtils.clickElement(Notification);
	}

	public void ClickMyProfileOption() {
		elementUtils.clickElement(MyProfileOption);
	}

	public void UserDirectsToDashboardPage() {
		String actualtitle = driver.getTitle();
		String expectedtitle = "LINQX - FracPro";
		assertEquals(actualtitle, expectedtitle,
				"Title was not matched user is not redirected to the General information page");

	}

	// Enter Job Time
	public void enterJobTime() {

		elementUtils.doubleClickElement(jobTimeColumn);
		WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
		elementUtils.clearAndSendKeys(Textarea, "10");
		elementUtils.clickElement(commentTab);

	}

	// Enter Job Time Third Row
	public void enterJobTimeFourthdRow() {

		elementUtils.doubleClickElement(jobTimeColumnFourthRow);
		WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
		elementUtils.clearAndSendKeys(Textarea, "30");
		elementUtils.clickElement(commentTab);

	}

	public void enterJobTimenewRow() {

		elementUtils.doubleClickElement(jobTimeColumnnewRow);
		WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
		elementUtils.clearAndSendKeys(Textarea, "20");
		elementUtils.clickElement(commentTab);

	}

	public void validateTimeAdded() {
		try {
			// Get raw strings
			String enteredTimeStr = jobTimeColumn.getText().trim(); // e.g., 45:00 or 00:45:00
			String defaultDateTimeStr = DefaultTimeElement.getText().trim(); // e.g., 2025-04-15 23:30:00
			String actualDateTimeStr = updatedTimeElement.getText().trim(); // e.g., 2025-04-16 00:15:00

			// Extract only time part (assumes space separates date and time)
			String defaultTimeStr = defaultDateTimeStr.split(" ")[1];
			String actualJobTimeStr = actualDateTimeStr.split(" ")[1];

			// Define time format
			DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

			// Convert entered time to HH:mm:ss format
			String convertedEnteredTimeStr = convertToHHMMSS(enteredTimeStr);

			// Parse times
			LocalTime enteredTime = LocalTime.parse(convertedEnteredTimeStr, timeFormatter);
			LocalTime defaultTime = LocalTime.parse(defaultTimeStr, timeFormatter);
			LocalTime actualJobTime = LocalTime.parse(actualJobTimeStr, timeFormatter);

			// Convert to durations
			Duration enteredDuration = Duration.ofHours(enteredTime.getHour()).plusMinutes(enteredTime.getMinute())
					.plusSeconds(enteredTime.getSecond());

			Duration defaultDuration = Duration.ofHours(defaultTime.getHour()).plusMinutes(defaultTime.getMinute())
					.plusSeconds(defaultTime.getSecond());

			// Add durations and wrap around 24h
			long secondsInDay = 24 * 60 * 60;
			long totalSeconds = (defaultDuration.plus(enteredDuration)).getSeconds() % secondsInDay;
			LocalTime expectedJobTime = LocalTime.ofSecondOfDay(totalSeconds);

			System.out.println(actualJobTime);
			System.out.println(expectedJobTime);
			// Validate
			Assert.assertEquals(actualJobTime, expectedJobTime, "Job time does not match expected value!");

		} catch (Exception e) {
			throw new RuntimeException("Error validating time: " + e.getMessage());
		}
	}

	// Helper: converts mm:ss to HH:mm:ss
	private String convertToHHMMSS(String timeStr) {
		if (timeStr.length() == 5 && timeStr.charAt(2) == ':') {
			return "00:" + timeStr;
		}
		return timeStr; // Already in HH:mm:ss
	}

	// // Click Save Button
	// public void clickSaveButton() {
	// driver.findElement(saveButton).click();
	// }

	// Verify Updated Toast Message
	public void verifyUpdatedToastMessage() {

		String expectedToastPopup = "×\nUPDATED ✓\nData updated successfully".trim();
		String actualToastPopup = elementUtils.getElementText(ToastMassage).trim();

		// Normalize multiple spaces, newlines, or carriage returns
		expectedToastPopup = expectedToastPopup.replaceAll("\\s+", " ");
		actualToastPopup = actualToastPopup.replaceAll("\\s+", " ");

		assertEquals(actualToastPopup, expectedToastPopup, "Toast message was not Matching");
	}

	public void newrowaddition() {
		Actions action = new Actions(driver);
		action.contextClick(jobTimeColumn).perform();
		elementUtils.clickElement(Insertrowoption);

	}

	public void newrowaddition1() {
		Actions action = new Actions(driver);
		action.contextClick(jobTimeColumn1).perform();
		elementUtils.clickElement(Insertrowoption);

	}

	public void newrowaddition21() {
		Actions action = new Actions(driver);
		action.contextClick(jobTimeColumn21).perform();
		elementUtils.clickElement(Insertrowoption);

	}

	// Enter Comments
	public void enterComments() {
		elementUtils.doubleClickElement(commentscolumn);
		WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
		elementUtils.clearAndSendKeys(Textarea, "This is a test comment");
		elementUtils.clickElement(jobTimeColumn);

	}

	public void enterCommentsforthRow() {
		elementUtils.doubleClickElement(commentscolumnfourth);
		WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
		elementUtils.clearAndSendKeys(Textarea, "This is a test comment");
		elementUtils.clickElement(jobTimeColumn);

	}

	public void enterCommentsnewRow() {
		elementUtils.doubleClickElement(commentscolumnrownew);
		WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
		elementUtils.clearAndSendKeys(Textarea, "This is a test comment");
		elementUtils.clickElement(jobTimeColumn);

	}

	public void NewDataInNewRow() throws InterruptedException {
		Thread.sleep(5000);
		String actualJTadded = "20:00";
		String expectedJTadded = elementUtils.getElementText(jobTimeColumnnewRow);
		assertEquals(actualJTadded, expectedJTadded, "Data is not matched in new row");

	}

	public void RefreshAction() {
		try {
			driver.navigate().refresh();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void DataVerifitionAfterRefresh() {
		// Date & Time
		String actualDateadded = "08/29/2025, 11:58:22";
		String expectedDateadded = elementUtils.getElementText(Datecolumn);
		assertEquals(actualDateadded, expectedDateadded, "Data is not matched in new row");

		// Comments
		String actualcommentsadded = "This is a test comment";
		String expectedcommentsadded = elementUtils.getElementText(commetscolumn);
		assertEquals(actualcommentsadded, expectedcommentsadded, "Data is not matched in new row");
	}

	// Click Next Button
	public void clickNextButton() {
		elementUtils.clickElement(NextButton);
	}

	public void ClickChannelinputs() throws InterruptedException {
		WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
		expandMenu.click();
		Thread.sleep(1000);
		elementUtils.clickElement(ChannelInputOption);
		Thread.sleep(2000);

	}

	// Verify Unsaved Changes Popup
	public void verifyUnsavedChangesPopup() {

		elementUtils.isElementDisplayed(ExecpetedUnsavedchangepop);
	}

	// Click Return to Save Button
	public void clickReturnToSaveButton() {

		elementUtils.clickElement(returnToSaveButton);
	}

	// Verify Redirection to Comments Page
	public void verifyRedirectionTogeneralinformationtab() {
		elementUtils.isElementDisplayed(generalInfoTab);
	}

	public void verifyRedirectionToChannelInputsforModel() throws InterruptedException {
		elementUtils.isElementDisplayed(ChannelInputsforModel);
		Thread.sleep(2000);
		WebElement CollapseMenu = driver.findElement(By.xpath("//img[@tooltip='Collapse']"));
		CollapseMenu.click();
	}

	public void verifyRedirectionToProfilescreen() {
		elementUtils.isElementDisplayed(ProfileScreen);
	}

	public void verifyRedirectionToHomescreen() {
		elementUtils.isElementDisplayed(Homescreen);
	}

	// Click General Information Tab
	public void clickGeneralInformationTab() {
		elementUtils.clickElement(generalInfoTab);
	}

	// Click Proceed Without Saving
	public void clickProceedWithoutSaving() {

		elementUtils.clickElement(proceedWithoutSaving);
	}

	public void DirectionToGeneralInforation() {
		String actualtitle = driver.getTitle();
		String expectedtitle = "LINQX - FracPro";
		assertEquals(actualtitle, expectedtitle,
				"Title was not matched user is not redirected to the General information page");

	}

	// Verify Data Not Saved
	public void verifyDataNotSaved() {
		String expectedData = "";
		String actualData = "";
		assertEquals(actualData, expectedData, "Data was not saved!");
	}

	// Click Side Menu Option
	public void clickSideMenuOption() {

		elementUtils.clickElement(sideMenuOption);
	}

}
