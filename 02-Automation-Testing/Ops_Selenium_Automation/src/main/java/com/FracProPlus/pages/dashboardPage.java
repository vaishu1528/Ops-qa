package com.FracProPlus.pages;

import com.FracProPlus.utils.CommonUtils;
import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class dashboardPage {

	private WebDriver driver;
	private ElementUtils elementUtils;
	private Actions actions;

	public dashboardPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()=' Welcome Vaibhav, ']")
	private WebElement userName;

	@FindBy(xpath = "//*[text()='FracPro Live +']")
	private WebElement fracProLiveCard;

	@FindBy(xpath = "//*[text()='XOPS']")
	private WebElement xopsCard;

	@FindBy(xpath = "//*[text()='Go To Application ']")
	private WebElement goToApplicationButton;

	@FindBy(id = "page-header-notifications-dropdown")
	private WebElement bellIcon;

	@FindBy(xpath = "//*[@id='page-header-user-dropdown']")
	private WebElement profileIcon;

	@FindBy(id = "searchBox")
	private WebElement searchBox;

	@FindBy(xpath = "//h6[text()='Personal Information']")
	private WebElement PageHeaderProfile;

	@FindBy(xpath = "//*[@formcontrolname='firstName']")
	private WebElement Firstname;

	@FindBy(xpath = "//*[@formcontrolname='lastName']")
	private WebElement Lastname;

	@FindBy(xpath = "//*[@formcontrolname='email']")
	private WebElement Email;

	@FindBy(xpath = "//*[text()=' Save ']")
	private WebElement SaveButton;

	@FindBy(xpath = "//*[@formcontrolname='company']")
	private WebElement CompanyName;

	@FindBy(xpath = "(//*[@id='page-header-user-dropdown'])[2]")
	private WebElement ProfileIconName;

	@FindBy(xpath = "//*[@class='fw-bold fs-5']")
	private WebElement DashboardName;

	@FindBy(id = "laborHyperlink")
	private WebElement laborHyperlink;

	@FindBy(id = "dashboardLink")
	private WebElement dashboardLink;

	@FindBy(xpath = "//img[@alt='zoom-out']")
	private WebElement zoomOutButton;

	@FindBy(xpath = "//div[@title='1 well(s) from pad(s): pad test 43 ']")
	private WebElement mapWithPadMarkers;

	@FindBy(xpath = "//h5[text()='Favorite Pads']")
	private WebElement favoritePadsList;

	@FindBy(xpath = "//*[@id='toast-container']")
	private WebElement ToastMessageContainer;

	@FindBy(xpath = "//*[text()='New Pad ']")
	private WebElement NewPadButtonUnderPadsSection;

	@FindBy(xpath = "//div[@class='panel-collapse collapse in show']//div[@class='p-0']")
	private WebElement wellsList;

	@FindBy(xpath = "//div[@title='1 well(s) from pad(s): pad test 43 ']")
	private WebElement padMarker;

	@FindBy(xpath = "padDetails")
	private WebElement padDetails;

	@FindBy(xpath = "//div[@id='favDropZone']")
	private WebElement favoritePadsSection;

	@FindBy(xpath = "//*[@tooltip='New Well']")
	private WebElement plusIcon;

	@FindBy(xpath = "//*[text()='General Information']")
	private WebElement generalInfoPage;

	@FindBy(xpath = "(//*[contains(text(),'+ New Well')])[2]")
	private WebElement AddNewWellButton;

	@FindBy(xpath = "//*[@id = 'prospect']")
	private WebElement FieldName;

	@FindBy(xpath = "//*[@id = 'wellName']")
	private WebElement wellNameTextbox;

	@FindBy(xpath = "//*[@id = 'wellAPI']")
	private WebElement wellAPITexbox;

	@FindBy(xpath = "//*[@id='padName']")
	private WebElement padNameField;

	@FindBy(xpath = "newPadButton")
	private WebElement newPadButton;

	@FindBy(xpath = "padFormSubmit")
	private WebElement submitPadForm;

	@FindBy(xpath = ".pad-list")
	private WebElement padList;

	@FindBy(xpath = "//*[text()=' Expand All ']")
	private WebElement expandAllButton;

	@FindBy(xpath = "//*[text()=' Collapse All ']")
	private WebElement collapseAllButton;

	@FindBy(xpath = "//img[@tooltip='Filters']")
	private WebElement filterIcon;

	@FindBy(xpath = "//form[contains(@class,'home-filter')]")
	private WebElement filterOptions;

	@FindBy(xpath = "//*[@id='Live']")
	private WebElement filterTypeAll;

	@FindBy(xpath = "//*[@class='ng-input']")
	private WebElement timeFilterThreeMonths;

	public void isUserNameVisible() {
		try {
			CommonUtils.dismissChromePasswordPopup();
			boolean isVisible = elementUtils.isElementDisplayed(userName);
			Assert.assertTrue(isVisible, "User name is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ExploreDigiSolution() {
		try {
			Thread.sleep(1000);
			WebElement header = driver.findElement(By.xpath("//h1[text()='Explore Our Digital Solutions']"));
			Assert.assertEquals(header.getAttribute("innerText").trim(), "Explore Our Digital Solutions",
					"Explore Our Digital Solutions is incorrect");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void basicFunctionalityHeaderName() {
		try {
			Thread.sleep(1000);
			WebElement headerbasic = driver.findElement(By.xpath(
					"//p[text()=' From basic functionality to advanced features, we have the right solution for you. ']"));
			Assert.assertEquals(headerbasic.getAttribute("innerText").trim(),
					"From basic functionality to advanced features, we have the right solution for you.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyLinqxLogo() {
		try {
			Thread.sleep(1000);
			WebElement logo = driver.findElement(By.xpath("//img[@alt='linqx-logo']"));

			// Check if logo is displayed
			Assert.assertTrue(logo.isDisplayed(), "Linqx logo is NOT displayed!");

			// Additional check: src attribute should contain 'linqx-logo'
			String srcValue = logo.getAttribute("src");
			Assert.assertTrue(srcValue.contains("linqx-logo"), "Logo src does not match expected!");

			System.out.println("✅ Linqx logo verification passed.");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("❌ Linqx logo verification failed: " + e.getMessage());
		}
	}

	public void simulationTab() {
		try {
			Thread.sleep(1000);
			WebElement simulBtn = driver.findElement(By.xpath("//span[text()='Stimulation']"));
			Assert.assertEquals(simulBtn.getAttribute("innerText").trim(), "Stimulation", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void wellconstuctiontab() {
		try {
			Thread.sleep(1000);
			WebElement wellconst = driver.findElement(By.xpath("//span[text()='Well Construction']"));
			elementUtils.clickElement(wellconst);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementsimulationTab() {
		try {
			Thread.sleep(1000);
			WebElement simulBtn = driver.findElement(By.xpath("//span[text()='Stimulation']"));
			elementUtils.clickElement(simulBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isFracProLiveCardVisible() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(fracProLiveCard);
			Assert.assertTrue(isVisible, "FracPro Live + card is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isXOPSCardVisible() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(xopsCard);
			Assert.assertTrue(isVisible, "XOPS card is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementGoToApplicationButton() {
		try {
			elementUtils.clickElement(goToApplicationButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isDirectedToFracProLiveApplication() {
		try {
			elementUtils.clickElement(goToApplicationButton);
			Thread.sleep(8000);
			String currentUrl = driver.getCurrentUrl();
			Assert.assertEquals(currentUrl, "https://liveplus-uat.linqx.io/well-pad/homepage",
					"User is not directed to the FracPro Live + application!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isBellIconVisible() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(bellIcon);
			Assert.assertTrue(isVisible, "Bell icon is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isProfileIconVisible() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(profileIcon);
			Assert.assertTrue(isVisible, "Profile icon is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterProductIntoSearchBox(String validProductText) {
		try {
			elementUtils.clearAndSendKeys(searchBox, validProductText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Verifypagetitle() {
		try {
			Thread.sleep(1000);
			Assert.assertEquals(PageHeaderProfile.getAttribute("innerText").trim(), "Personal Information",
					"Page header title does not match in profile screen!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyFirstname() {
		try {
			Assert.assertEquals(Firstname.getAttribute("value"), "vaibhav",
					"Firstname is not matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyLastname() {
		try {
			Assert.assertEquals(Lastname.getAttribute("value"), ReadData.readdata("LastName"),
					"Firstname is not matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyEmail() {
		try {
			Assert.assertEquals(Email.getAttribute("value"), ReadData.readdata("Email"), "Firstname is not matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyCompanyName() {
		try {
			Assert.assertEquals(CompanyName.getAttribute("value"), ReadData.readdata("NameCompany"),
					"Firstname is not matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EnterFirstName() {
		try {
			elementUtils.clickElement(Firstname);
			elementUtils.clearAndSendKeys(Firstname, ReadData.readdata("NewFirstname"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EnterLastName() {
		try {
			elementUtils.clickElement(Lastname);
			elementUtils.clearAndSendKeys(Lastname, ReadData.readdata("NewLastname"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EnterEmail() {
		try {
			elementUtils.clickElement(Email);
			elementUtils.clearAndSendKeys(Email, ReadData.readdata("NewEmail"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Clickonsavebutton() {
		try {
			elementUtils.clickElement(SaveButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyDatasavedinprofile() {
		try {
			Assert.assertEquals(Firstname.getAttribute("value"), ReadData.readdata("NewFirstname"),
					"First Name is not Matched");
			Assert.assertEquals(Lastname.getAttribute("value"), ReadData.readdata("NewLastname"),
					"Last Name is not Matched");
			Assert.assertEquals(Email.getAttribute("value"), ReadData.readdata("Email"), "Email is not Matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyProfilenamechanges() {
		try {
			Assert.assertEquals(ProfileIconName.getAttribute("innerText").trim(), ReadData.readdata("NewFirstname"),
					"Name on the profile icon is not changed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyDashboardname() {
		try {
			Assert.assertEquals(elementUtils.getElementText(DashboardName).replace("Welcome ", "").replace(",", ""),
					ReadData.readdata("Firstname"), "Name on the profile icon is not changed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void MapPanningAndClickOnPad() {
		try {
			elementUtils.clickElement(zoomOutButton);
			Thread.sleep(1000);
			// Locate the map element
			WebElement map = driver.findElement(By.xpath("//div[@class='map-container']"));

			// Create Actions instance
			Actions actions = new Actions(driver);

			// Smooth pan right
			for (int i = 0; i < 50; i++) {
				actions.moveToElement(map).clickAndHold().moveByOffset(-450, 0) // move right (drag left)
						.release().perform();
				Thread.sleep(50); // delay between small moves
				if (checkAndClickMarker())
					return;
			}

			// Smooth pan down
			for (int i = 0; i < 5; i++) {
				actions.moveToElement(map).clickAndHold().moveByOffset(0, -300) // move down (drag up)
						.release().perform();
				Thread.sleep(50);
				if (checkAndClickMarker())
					return;
			}
			// Smooth pan right
			for (int i = 0; i < 50; i++) {
				actions.moveToElement(map).clickAndHold().moveByOffset(-450, 0) // move right (drag left)
						.release().perform();
				Thread.sleep(50); // delay between small moves
				if (checkAndClickMarker())
					return;
			}

			// Smooth pan down
			for (int i = 0; i < 5; i++) {
				actions.moveToElement(map).clickAndHold().moveByOffset(0, -300) // move down (drag up)
						.release().perform();
				Thread.sleep(50);
				if (checkAndClickMarker())
					return;
			}

			// Smooth pan left
			for (int i = 0; i < 50; i++) {
				actions.moveToElement(map).clickAndHold().moveByOffset(400, 0) // move left (drag right)
						.release().perform();
				Thread.sleep(50);
				if (checkAndClickMarker())
					return;
			}

			// Smooth pan up
			for (int i = 0; i < 30; i++) {
				actions.moveToElement(map).clickAndHold().moveByOffset(0, 300) // move up (drag down)
						.release().perform();
				Thread.sleep(50);
				if (checkAndClickMarker())
					return;
			}
			// Smooth pan right
			for (int i = 0; i < 40; i++) {
				actions.moveToElement(map).clickAndHold().moveByOffset(-450, 0) // move right (drag left)
						.release().perform();
				Thread.sleep(50); // delay between small moves
				if (checkAndClickMarker())
					return;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Helper to check and click marker
	boolean checkAndClickMarker() {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			// Step 1: Read the unique pad name from Excel
			String filePath = "FracproPlusData/FracproData.xlsx";
			fis = new FileInputStream(filePath);
			workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(1);
			String uniquePadName = cell.getStringCellValue();

			// Step 2: Try to locate the marker with panning if needed
			WebElement map = driver.findElement(By.xpath("//div[@class='map-container']"));
			Actions actions = new Actions(driver);

			int panAttempts = 50; // max pan steps before giving up

			for (int i = 0; i < panAttempts; i++) {
				try {
					WebElement marker = driver
							.findElement(By.xpath("//div[contains(@aria-label,'" + uniquePadName + "')]"));

					if (marker.isDisplayed()) {
						System.out.println("Marker found and visible: " + uniquePadName);
						marker.click();
						return true;
					}
				} catch (NoSuchElementException e) {
					// Marker not found yet, pan a bit and try again
					actions.moveToElement(map).clickAndHold().moveByOffset(-200, 0) // slight right pan
							.release().perform();
					Thread.sleep(100);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (workbook != null)
					workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Marker not found after panning.");
		return false;
	}

	public void isMapWithPadMarkersVisible() {
		try {

			FileInputStream fis = null;
			Workbook workbook = null;

			// Step 1: Read the unique pad name from the Excel
			String filePath = "FracproPlusData/FracproData.xlsx";
			fis = new FileInputStream(filePath);
			workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(1);
			String uniquePadName = cell.getStringCellValue();

			// Step 2: Build a dynamic locator using the pad name
			By PadMarkers = By.xpath("//div[contains(@aria-label,'" + uniquePadName + "')]");
			WebElement MapwithPadMarker = driver.findElement(PadMarkers);

			Assert.assertTrue(elementUtils.isElementDisplayed(MapwithPadMarker),
					"Map with pad markers is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void isFavoritePadsListVisible() {
		try {
			Assert.assertTrue(elementUtils.isElementDisplayed(favoritePadsList), "Favorite Pads list is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnAnyPadGroupDropdown() {
		try {
			// Click on the filter option
			WebElement filterButton = driver.findElement(By.xpath("//*[contains(@class,'plot-icon')]"));
			filterButton.click();

			// Select the "All" radio button
			WebElement allRadioButton = driver.findElement(By.xpath("//*[@id='All']"));
			allRadioButton.click();

			WebElement PadNamefromlist = driver
					.findElement(By.xpath("//span[starts-with(text(), '" + ReadData.readdata("Padname") + "')]"));
			elementUtils.clickElement(PadNamefromlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void areWellsListedUnderSelectedPad() {
		try {

			Assert.assertTrue(elementUtils.isElementDisplayed(wellsList),
					"Wells are not listed under the selected pad!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isDetailedPadInformationDisplayed() {
		try {

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

	public void dragPadToFavoritePads() {
		try {
			WebElement draggablePad = driver.findElement(By.xpath(
					"//span[starts-with(text(), '" + ReadData.readdata("Padname") + "')]"));
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", draggablePad);
			actions.clickAndHold(draggablePad) // Click and hold on the source element
					.pause(3000) // Optional: Pause to allow time to visually see the drag
					.moveToElement(favoritePadsSection) // Move to the target element
					.pause(3000) // Optional: Pause to allow time to visually see the drag
					.release(favoritePadsSection) // Release the hold on the target element
					.build() // Build the action chain
					.perform(); // Execute the action
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isPadPresentInFavoritePads() {
		try {
			Thread.sleep(1000);
			WebElement PadAddedintoFavoritePadsList = driver
					.findElement(By.xpath("//*[text()='Favorite Pads']/following::div/span[starts-with(text(),'"
							+ ReadData.readdata("Padname") + "')]"));
			Assert.assertTrue(elementUtils.isElementDisplayed(PadAddedintoFavoritePadsList),
					"Pad is not present in the Favorite Pads list!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewPadPresentInPadsSection() {
		try {

			Assert.assertTrue(elementUtils.isElementDisplayed(NewPadButtonUnderPadsSection),
					"Pad is not present in the Favorite Pads list!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isExpandAllbuttonPresentInPadsSection() {
		try {

			Assert.assertTrue(elementUtils.isElementDisplayed(expandAllButton),
					"Pad is not present in the Favorite Pads list!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isCollapseAllbuttonPresentInPadsSection() {
		try {

			Assert.assertTrue(elementUtils.isElementDisplayed(collapseAllButton),
					"Pad is not present in the Favorite Pads list!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isPadAddedToastMessageDisplayed() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(ToastMessageContainer);
			Assert.assertTrue(isElementDisplayed, "Success toast message is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isPadRemovedToastMessageDisplayed() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(ToastMessageContainer);
			Assert.assertTrue(isElementDisplayed, "Success toast message is not displayed!");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnStarIconFromFavoritePads() {
		try {
			Thread.sleep(1000);
			WebElement starIcon = driver
					.findElement(By.xpath(
							"//span[starts-with(text(),'" + ReadData.readdata("Padname") + "')]/following::i[1]"));
			elementUtils.clickElement(starIcon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isPadRemovedFromFavoriteList() {
		try {
			WebElement RemovedpadfromFavoritePadsList = driver
					.findElement(By.xpath("//*[text()='Favorite Pads']/following::div/span[text()='"
							+ ReadData.readdata("Padname") + " (1)']"));
			boolean isVisible = !elementUtils.isElementDisplayed(RemovedpadfromFavoritePadsList);
			Assert.assertTrue(isVisible, "Pad is still present in the Favorite Pads list!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickStarIconForPad() {
		try {
			// // Click on the filter option
			// WebElement filterButton =
			// driver.findElement(By.xpath("//*[contains(@class,'plot-icon')]"));
			// filterButton.click();
			//
			// // Select the "All" radio button
			// WebElement allRadioButton = driver.findElement(By.xpath("//*[@id='All']"));
			// allRadioButton.click();
			Thread.sleep(2000);
			WebElement starIcon = driver
					.findElement(By.xpath(
							"//span[starts-with(text(),'" + ReadData.readdata("Padname") + "')]//following::i[1]"));
			elementUtils.clickElement(starIcon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickPlusIconForPad() {
		try {

			WebElement plusIcon = driver.findElement(By.xpath(
					"//*[text()='" + ReadData.readdata("Padname") + " (1)']/following::i[@tooltip='New Well'][1]"));
			elementUtils.clickElement(plusIcon);
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isRedirectedToGeneralInformationPage() {
		try {
			Assert.assertTrue(elementUtils.isElementDisplayed(generalInfoPage),
					"User is not redirected to the General Information page!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isPadNameFieldPreFilled() {
		try {

			Assert.assertEquals(padNameField.getAttribute("value"), ReadData.readdata("Padname"),
					"Pad Name is not Matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isAddNewWellButtonVisible() {
		try {
			WebElement AddNewWellButton = driver.findElement(
					By.xpath("//*[contains(text(),'" + ReadData.readdata("Padname") + "')]//following::button[1]"));
			Assert.assertTrue(elementUtils.isElementDisplayed(AddNewWellButton), "Add New Well Button is not visible");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickonpad() {
		try {
			WebElement PadName = driver.findElement(By.xpath(
					"//span[starts-with(text(), '" + ReadData.readdata("Padname") + "')]"));
			elementUtils.clickElement(PadName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickonAddNewWellButton() {
		try {
			WebElement AddNewWellButton = driver.findElement(
					By.xpath("//*[contains(text(),'" + ReadData.readdata("Padname") + "')]//following::button[1]"));
			elementUtils.clickElement(AddNewWellButton);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void FillTheRequiredDetails() {
		try {
			// Field Name
			String baseFieldName = "FracproTestAutomationField";
			int randomNum = new Random().nextInt(1000);
			String uniqueFieldName = baseFieldName + randomNum;
			elementUtils.clearAndSendKeys(FieldName, uniqueFieldName);

			// Well Name
			String baseWelldName = "FracproTestAutomationWell";
			int randomNum1 = new Random().nextInt(1000);
			String uniqueWellName = baseWelldName + randomNum1;
			elementUtils.clearAndSendKeys(wellNameTextbox, uniqueWellName);

			// Well API
			Random rand = new Random();

			String part1 = String.format("%02d", rand.nextInt(100)); // 2 digits
			String part2 = String.format("%03d", rand.nextInt(1000)); // 3 digits
			String part3 = String.format("%05d", rand.nextInt(100000)); // 5 digits
			String part4 = String.format("%02d", rand.nextInt(100)); // 2 digits
			String part5 = String.format("%02d", rand.nextInt(100)); // 2 digits

			String randomWellAPI = part1 + "-" + part2 + "-" + part3 + "-" + part4 + "-" + part5;

			elementUtils.clearAndSendKeys(wellAPITexbox, randomWellAPI);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyWellName() {
		try {
			WebElement WellName = driver.findElement(By.xpath("//*[text()=' Well: ']/span"));
			String ExpectedWellName = WellName.getText();
			Assert.assertEquals(wellNameTextbox.getAttribute("value"), ExpectedWellName, "Well Name is not Matched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickNewPadButton() {
		try {
			elementUtils.clickElement(NewPadButtonUnderPadsSection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNavigatedToGeneralInformationPage() {
		isRedirectedToGeneralInformationPage(); // Reuse logic
	}

	public void fillRequiredPadDetailsAndSubmit() {
		try {
			elementUtils.clearAndSendKeys(padNameField, "Test Pad");
			elementUtils.clickElement(submitPadForm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewPadVisibleInPadList() {
		try {
			Assert.assertTrue(elementUtils.isElementDisplayed(padList), "New pad is not visible in the pad list!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickExpandAllButton() {
		try {
			elementUtils.clickElement(expandAllButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void areAllPadGroupsExpanded() {
		try {
			Assert.assertTrue(elementUtils.areElementsExpanded("//*[contains(@class,'list-group')]"),
					"Not all pad groups are expanded!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickCollapseAllButton() {
		try {
			elementUtils.clickElement(collapseAllButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void areAllPadGroupsCollapsed() {
		try {
			Assert.assertTrue(elementUtils.areElementsCollapsed("//*[contains(@class,'list-group')]"),
					"Not all pad groups are collapsed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickFilterIcon() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(filterIcon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void areFilterOptionsDisplayed() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(elementUtils.isElementDisplayed(filterOptions), "Filter options are not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isAllOptionSelectedByDefault() {
		try {
			Assert.assertTrue(elementUtils.isElementSelected(filterTypeAll), "Add option is not selected by default!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isThreeMonthsOptionSelectedByDefault() {
		try {
			Assert.assertTrue(elementUtils.isElementDisplayed(timeFilterThreeMonths),
					"Three months option is not selected by default!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EnterFirstName1() {
		try {
			elementUtils.clickElement(Firstname);
			elementUtils.clearAndSendKeys(Firstname, ReadData.readdata("FirstName"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EnterLastName1() {
		try {
			elementUtils.clickElement(Lastname);
			elementUtils.clearAndSendKeys(Lastname, ReadData.readdata("LastName"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyResetComputeResourceButton() {
		try {
			Thread.sleep(2000);
			WebElement reset = driver.findElement(By.xpath("//button[text()=' Reset Compute Resources ']"));
			elementUtils.clickElement(reset);
			Thread.sleep(1000);
			Assert.assertEquals(driver.findElement(By.xpath(
					"//p[text()='All calculations would be aborted and need to be restarted. Are you sure you want to continue?']"))
					.getAttribute("innerText").trim(),
					"All calculations would be aborted and need to be restarted. Are you sure you want to continue?",
					"Confirmation message is not displaying after clicking on reset compute resource button");
			WebElement NoBtn = driver.findElement(By.xpath("(//button[text()='No'])[1]"));
			elementUtils.clickElement(NoBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}