package com.FracProPlus.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class DrilledHolePage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public DrilledHolePage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Drilled Hole']")
	private WebElement drilledHoleTab;

	@FindBy(xpath = "//button[text()='No, Discard']")
	private WebElement NoDiscard;

	@FindBy(xpath = "//button[text()='Yes, Save']")
	private WebElement yesSave;

	@FindBy(xpath = "//button[text()=' Next ']")
	private WebElement NextButton;

	@FindBy(xpath = "//select[@formcontrolname='compute']")
	private WebElement computeDropdown;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[4]")
	private WebElement openHoleDropdown;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[5]")
	private WebElement botDiamField;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[6]")
	private WebElement effectiveDiamField;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[1]")
	private WebElement lengthField;

	@FindBy(xpath = "//td[@id='cell-0-1']")
	private WebElement topMdField;

	@FindBy(xpath = "//td[@id='cell-0-2']")
	private WebElement botMdField;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "(//span[text()='1'])[2]/parent::div/parent::th/parent::tr")
	private WebElement firstRowTable;

	@FindBy(xpath = "//a[text()=' Wellbore Configuration ']")
	private WebElement wellboreConfigOption;

	@FindBy(xpath = "//h4[text()=' Wellbore Configuration ']")
	private WebElement pageHeader;

	@FindBy(xpath = "//span[text()='Drilled Hole']")
	private WebElement drilledHoleTableHeaders;

	@FindBy(xpath = "//h1[text()='Home']")
	private WebElement homeScreen;

	@FindBy(id = "padNavigation")
	private WebElement padNavigation;

	@FindBy(xpath = "//li[text()='Overview']")
	private WebElement wellFromOverview;

	@FindBy(xpath = "((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[2]")
	private WebElement topMDInputField;

	@FindBy(xpath = "((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[3]")
	private WebElement botMDInputField;

	public void clickElementOnDrilledHoleTab() {
		try {
			elementUtils.clickElement(drilledHoleTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickNoDiscardButton() {
		try {
			elementUtils.clickElement(NoDiscard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickYesSaveButton() {
		try {
			elementUtils.clickElement(yesSave);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickNextButton() {
		try {
			elementUtils.clickElement(NextButton);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUnsavedChangesPopup() {
		try {
			Thread.sleep(1000);
			String actionrequired = driver.findElement(By.xpath("//h2[text()='Confirm Action']")).getText();
			String expectedValue = "Confirm Action";
			Assert.assertEquals(actionrequired, expectedValue, "Unsaved changes popup not displayed");
			String actionrequired1 = driver.findElement(By.xpath("//p[text()='You have unsaved changes.']")).getText();
			String normalized = actionrequired1.replaceAll("\\r?\\n", " ").trim();
			String expectedValue1 = "You have unsaved changes. Would you like to save them before leaving?";
			Assert.assertEquals(normalized, expectedValue1,
					"Would you like to save them before leaving? message not displayed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectOptionFromComputeDropdown() {
		try {
			WebElement computeDropdown = driver.findElement(
					By.xpath("//label[text()=' Compute ']/parent::div/ng-select[@formcontrolname='compute']"));
			elementUtils.clickElement(computeDropdown);
			Thread.sleep(2000);
			WebElement TopMd = driver.findElement(By.xpath("//div[text()=' Top MD ']"));
			elementUtils.clickElement(TopMd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectOptionFromComputeDropdown2() {
		try {
			Thread.sleep(2000);
			WebElement computeDropdown = driver.findElement(
					By.xpath("//label[text()=' Compute ']/parent::div/ng-select[@formcontrolname='compute']"));
			elementUtils.clickElement(computeDropdown);
			Thread.sleep(2000);
			WebElement length = driver.findElement(By.xpath("//div[text()=' Length ']"));
			elementUtils.clickElement(length);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOpenHoleDropdownDefaultOption() {
		try {
			WebElement byDefaultValue = driver
					.findElement(By.xpath("//td[@id='cell-0-3']"));
			String actualOption = byDefaultValue.getText().trim().replace("▼", "").trim();
			String expectedOption = "Open Hole";
			Assert.assertEquals(actualOption, expectedOption, "Default option for open hole does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueInBotDiamField() {
		try {
			WebElement BitDiam = driver
					.findElement(By.xpath("//td[@id='cell-0-4']"));
			String actualValue = BitDiam.getText();
			String expectedValue = "10.000";
			Assert.assertEquals(actualValue, expectedValue, "Value in bot diam field does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueInEffectiveDiamField() {
		try {
			WebElement Effective = driver
					.findElement(By.xpath("//td[@id='cell-0-5']"));
			String actualValue = Effective.getText();
			String expectedValue = "10.000";
			Assert.assertEquals(actualValue, expectedValue, "Value in effective diam field does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pageRefresh() {
		try {
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueInLengthField() {
		try {
			WebElement length = driver
					.findElement(By.xpath("(//td[@id='cell-0-0'])[1]"));
			String actualValue = length.getText();
			String expectedValue = ReadData.readdata("DrilledHoleLength");
			Assert.assertEquals(actualValue, expectedValue, "Value in length field does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueInTopMDField() {
		try {
			WebElement TopMD = driver
					.findElement(By.xpath("//td[@id='cell-0-1']"));
			String actualValue = TopMD.getText();
			String expectedValue = ReadData.readdata("DrilledHoleTopMD");
			Assert.assertEquals(actualValue, expectedValue, "Value in Top MD field does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueInBotMDField() {
		try {
			WebElement BotMD = driver
					.findElement(By.xpath("//td[@id='cell-0-2']"));
			String actualValue = BotMD.getText();
			String expectedValue = ReadData.readdata("DrilledHoleTopMD");
			Assert.assertEquals(actualValue, expectedValue, "Value in Bot MD field does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueInBotMDFieldForFirstRow() {
		try {
			WebElement BotMD = driver
					.findElement(By.xpath("//td[@id='cell-0-2']"));
			String actualValue = BotMD.getText();
			String expectedValue = ReadData.readdata("DrilledHoleBotMD");
			Assert.assertEquals(actualValue, expectedValue, "Value in Bot MD field does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValuesInFirstRowTable() {
		try {
			String actualValue = elementUtils.getElementText(firstRowTable);
			String expectedValue = "expectedValue";
			Assert.assertEquals(actualValue, expectedValue, "Values in first row table do not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoTopMdFieldDrilledHoleTab() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(topMdField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("DrilledHoleTopMD"));
			topMdField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterDataIntoTopMdFieldDrilledHoleTabForSn() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(topMdField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, "100000");
			topMdField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBotMdFieldAutoUpdated() {
		try {
			Thread.sleep(2000);
			String actualValue = botMdField.getText();
			String expectedValue = ReadData.readdata("DrilledHoleTopMD");
			Assert.assertEquals(actualValue, expectedValue, "Bot MD field is not auto-updated from Top MD");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataLessThanTopMdIntoBotMdField() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(botMdField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("DHoleBotMDLess"));
			botMdField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyErrorMessage() {
		try {
			Thread.sleep(2000);
			WebElement errorMessage = driver
					.findElement(By.xpath("//p[text()=' Top MD cannot be greater than Bottom MD! ']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.textToBePresentInElement(errorMessage,
					"Top MD cannot be greater than Bottom MD!"));
			String actualMessage = errorMessage.getText();
			String expectedMessage = "Top MD cannot be greater than Bottom MD!";
			Assert.assertEquals(actualMessage, expectedMessage,
					"Error message Top MD cannot be greater than Bottom MD! does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySaveButtonDisabled() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(saveButton));
			boolean isEnabled = saveButton.isEnabled();
			Assert.assertFalse(isEnabled, "Save button is not disabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataGreaterThanTopMdIntoBotMdField() {
		try {
			Actions act = new Actions(driver);
			act.scrollToElement(botMdField).perform();
			elementUtils.doubleClickElement(botMdField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("DrilledHoleBotMD"));
			botMdField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySucessfulMessage() {
		try {
			WebElement Success = driver
					.findElement(By.xpath("//div[text()=' Wellbore configuration saved successfully ']"));
			String actualValue = Success.getText();
			String expectedValue = "Wellbore configuration saved successfully";
			Assert.assertEquals(actualValue, expectedValue, "Sucessful message does not match after data saved!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySaveButtonEnabled() {
		try {
			boolean isDesabled = !saveButton.isEnabled();
			Assert.assertTrue(isDesabled, "Save button is not disabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySaveButtonEnabled2() {
		try {
			boolean isEnabled = saveButton.isEnabled();
			Assert.assertTrue(isEnabled, "Save button is not enabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnWellboreConfigurationOption() {
		try {
			elementUtils.clickElement(wellboreConfigOption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPageHeaderName() {
		try {
			String actualHeader = elementUtils.getElementText(pageHeader);
			String expectedHeader = "Expected Page Header";
			Assert.assertEquals(actualHeader, expectedHeader, "Page header does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void refreshPage() {
		try {
			// elementUtils.clickElement(refreshButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDrilledHoleTableHeaderNames() {
		try {
			Thread.sleep(2000);

			// WebElement
			// lengthheader0=driver.findElement(By.xpath("(//span[text()='#'])[1]"));
			// String actualheadername0=lengthheader0.getText();
			// String expectedHeader0 = "#";
			// Assert.assertEquals(actualheadername0, expectedHeader0, "Length Table page
			// header does not match!");

			WebElement lengthheader = driver
					.findElement(By.xpath("(//th[@aria-colindex='2']/div[contains(text(),'Length')])[1]"));
			String actualheadername1 = lengthheader.getAttribute("innerHTML").replaceAll("<br>", " ").trim();
			System.out.println(actualheadername1);
			String expectedHeader1 = "Length   (ft)";
			Assert.assertEquals(actualheadername1, expectedHeader1, "Length Table page header does not match!");

			WebElement header3 = driver
					.findElement(By.xpath("(//th[@aria-colindex='3']/div[contains(text(),'Top MD')])[1]"));
			String actualheadername3 = header3.getAttribute("innerHTML").replaceAll("<br>", " ").trim();
			System.out.println(actualheadername3);
			String expectedHeader3 = "Top MD   (ft)";
			Assert.assertEquals(actualheadername3, expectedHeader3, "Top MD Table page header does not match!");

			WebElement header4 = driver
					.findElement(By.xpath("(//th[@aria-colindex='4']/div[contains(text(),'Bot MD')])[1]"));
			String actualheadername4 = header4.getAttribute("innerHTML").replaceAll("<br>", " ").trim();
			System.out.println(actualheadername4);
			String expectedHeader4 = "Bot MD   (ft)";
			Assert.assertEquals(actualheadername4, expectedHeader4, "Bot MD Table page header does not match!");

			WebElement header5 = driver
					.findElement(By.xpath("(//th[@aria-colindex='5']/div[contains(text(),'Open Hole')])[1]"));
			String actualheadername5 = header5.getAttribute("innerHTML").replaceAll("<br>", " ").trim();
			System.out.println(actualheadername5);
			String expectedHeader5 = "Open Hole";
			Assert.assertEquals(actualheadername5, expectedHeader5, "Open hole Table page header does not match!");

			WebElement header6 = driver
					.findElement(By.xpath("(//th[@aria-colindex='6']/div[contains(text(),'Bit Diam')])[1]"));
			String actualheadername6 = header6.getAttribute("innerHTML").replaceAll("<br>", " ").trim();
			System.out.println(actualheadername6);
			String expectedHeader6 = "Bit Diam   (in)";
			Assert.assertEquals(actualheadername6, expectedHeader6, "Bit Diam Table page header does not match!");

			WebElement header7 = driver
					.findElement(By.xpath("(//th[@aria-colindex='7']/div[contains(text(),'Effective Diam')])[1]"));
			String actualheadername7 = header7.getAttribute("innerHTML").replaceAll("<br>", " ").trim();
			System.out.println(actualheadername7);
			String expectedHeader7 = "Effective Diam   (in)";
			Assert.assertEquals(actualheadername7, expectedHeader7, "Effective Diam Table page header does not match!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnSaveButton() {
		try {
			elementUtils.clickElement(saveButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void rightClickElement() {
		try {
			WebElement row = driver
					.findElement(By.xpath("//td[@id='cell-0-2']"));
			Actions action = new Actions(driver);
			action.contextClick(row).perform();
			WebElement insertNewRow = driver.findElement(By.xpath("//div[text()='Insert row below']"));
			insertNewRow.click();
			Thread.sleep(3000);
			WebElement row2 = driver
					.findElement(By.xpath("//td[@id='cell-1-2']"));
			action.contextClick(row2).perform();
			WebElement removeRow = driver.findElement(By.xpath("//div[text()='Remove row']"));
			removeRow.click();
			Thread.sleep(3000);
			action.contextClick(row).perform();
			WebElement insertNewRowAbove = driver.findElement(By.xpath("//div[text()='Insert row above']"));
			insertNewRowAbove.click();
			Thread.sleep(3000);
			action.contextClick(row).perform();
			WebElement removeRow1 = driver.findElement(By.xpath("//div[text()='Remove row']"));
			removeRow1.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUserIsOnHomeScreen() {
		try {
			boolean isDisplayed = elementUtils.isElementDisplayed(homeScreen);
			Assert.assertTrue(isDisplayed, "User is not on the home screen!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateAndClickOnPad() {
		try {
			elementUtils.clickElement(padNavigation);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnWellFromOverview() {
		try {
			elementUtils.clickElement(wellFromOverview);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSaveButtonEnabled() {
		try {
			boolean isEnabled = saveButton.isEnabled();
			Assert.assertTrue(isEnabled, "Save button is not enabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}