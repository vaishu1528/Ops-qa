
package com.FracProPlus.pages;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChannelInputPage {

	private WebDriver driver;
	private ElementUtils elementUtils;
	private Actions actions;

	public ChannelInputPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=' Channel Inputs for Model ']")
	private WebElement channelInputsForModelButton;

	@FindBy(xpath = "//*[contains(text(),'Additives')]")
	private WebElement clickElementAdditivesTab;

	@FindBy(xpath = "//*[@id='cell-0-2']")
	private WebElement selectRealTimeChannelForTreatingPressure;

	@FindBy(xpath = "//*[@id='cell-1-2']")
	private WebElement selectRealTimeChannelForBottomholePressure;

	@FindBy(xpath = "//*[@id='cell-2-2']")
	private WebElement selectRealTimeChannelForDeadStringPressure;

	@FindBy(xpath = "//td[@id='cell-0-0']")
	private WebElement selectAdditiveRateChannel;

	@FindBy(xpath = "((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[2]")
	private WebElement selectKeyRateChannel;

	@FindBy(xpath = "((//span[@class='rowHeader'])[1]/parent::div/parent::th/following-sibling::td)[3]")
	private WebElement selectAdditiveSetChannel;

	@FindBy(xpath = "//*[text()='Channel Inputs for Model']")
	private WebElement pageHeaderName;

	@FindBy(xpath = "(//*[@id='handOnTableId']//tr[1])[1]")
	private WebElement channelInputsTableHeaderNames;

	@FindBy(xpath = "//td[@id='cell-0-2']")
	private WebElement realTimeChannelSectionEmptyData;

	@FindBy(xpath = "//*[contains(text(),'Channel Options')]")
	private WebElement channelOptionsSection;

	@FindBy(xpath = "//*[text()=' Measured Depth to Bottom Hole Gauge ']")
	private WebElement MeasuredDepthUnitField;

	@FindBy(xpath = "//*[text()=' Dead String SG ']")
	private WebElement DeadStringSGField;

	@FindBy(xpath = "//*[@class='input-group-text']")
	private WebElement MeasuredDepthUnit;

	@FindBy(xpath = "//*[@id='cell-9-1']")
	private WebElement NoInputChannelUnit;

	@FindBy(xpath = "//*[contains(text(),'Observed Net Pressure Calculation')]")
	private WebElement ObservedNetPressureCalculation;

	@FindBy(xpath = "//*[@formcontrolname='ObsNetPress']//following::input[@id='surfaceTreatingPressure']")
	private WebElement FromSurfaceTreatingPressureOption;

	@FindBy(xpath = "//*[@formcontrolname='ObsNetPress']//following::input[@id='bottomHolePressure']")
	private WebElement FromBottomHolePressure;

	@FindBy(xpath = "//*[@formcontrolname='ObsNetPress']//following::input[@id='deadStringPressure']")
	private WebElement FromDeadStringPressure;

	@FindBy(xpath = "//*[@formcontrolname='UserDefChans']")
	private WebElement useUserDefinedChannelsCheckbox;

	@FindBy(xpath = "//*[@formcontrolname='UseStepNum']")
	private WebElement UseStepNumberChanneltoAutoStep;

	@FindBy(xpath = "//*[@formcontrolname='UseStepTot']")
	private WebElement UseStepTotalsChanneltoAutoStep;

	@FindBy(xpath = "//*[@formcontrolname='AutoFluidProp']")
	private WebElement AutoFluidandProppantSelection;

	@FindBy(xpath = "//*[text()=' Inputs']")
	private WebElement inputsoption;

	@FindBy(xpath = "//*[contains(text(),'Action Required')]")
	private WebElement ActionRequiredpopup;

	@FindBy(xpath = "//*[contains(text(),'Yes, Create')]")
	private WebElement YesButton;

	@FindBy(xpath = "//*[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[text()=' Next ']")
	private WebElement nextButton;

	@FindBy(xpath = "//*[@formcontrolname='SmoothNum']")
	private WebElement smoothingNumberOfPointsField;

	@FindBy(xpath = "//*[@id='UserDefChansAdditive']")
	private WebElement useUserDefinedChannelsCheckboxadd;

	@FindBy(xpath = "//*[@formcontrolname='SmoothNum']")
	private WebElement smoothingNumberOfPointsFieldAT;

	@FindBy(xpath = "//*[@formcontrolname='NumFlow']")
	private WebElement numberOfFlowmetersField;

	@FindBy(xpath = "//*[@formcontrolname='NumDens']")
	private WebElement numberOfDensometersField;

	@FindBy(xpath = "//*[@class='nav-item']//a[contains(text(),'Channel Inputs')]")
	private WebElement channelInputsTab;

	@FindBy(xpath = "//*[@id='cell-9-2']")
	private WebElement ClickUserDefinedChannelsDropdownSelection;

	@FindBy(xpath = "//*[@id='cell-12-2']")
	private WebElement TableElement;

	@FindBy(xpath = "//select[@id='userDefinedChannelsDropdown']")
	private WebElement userDefinedChannelsDropdown;

	@FindBy(xpath = "//*[contains(text(),'Measured Data')]")
	private WebElement measuredDataButton;

	@FindBy(xpath = "//*[@formcontrolname='BtmGaugeMD']")
	private WebElement MeasuredDepthField;

	@FindBy(xpath = "//*[@formcontrolname='DeadStringSG']")
	private WebElement DeadStringSGFielddata;

	@FindBy(xpath = "(//*[@id='cell-0-0'])[1]")
	private WebElement channelNameFieldForFirstRow;

	@FindBy(xpath = "//*[@id='cell-1-0']")
	private WebElement channelNameFieldForSecondRow;

	@FindBy(xpath = "//*[@id='cell-2-0']")
	private WebElement channelNameFieldForThirdRow;

	@FindBy(xpath = "//*[@id='cell-3-0']")
	private WebElement channelNameFieldForFourthRow;

	@FindBy(xpath = "//*[@id='cell-4-0']")
	private WebElement channelNameFieldForFifthRow;

	@FindBy(xpath = "//*[@id='cell-5-0']")
	private WebElement channelNameFieldForSixthRow;

	@FindBy(xpath = "//*[@id='cell-6-0']")
	private WebElement channelNameFieldForSeventhRow;

	@FindBy(xpath = "//*[@id='cell-0-0']")
	private WebElement FirstChannelName;

	@FindBy(xpath = "//*[@id='cell-1-0']")
	private WebElement SecondChannelName;

	@FindBy(xpath = "//*[@id='cell-2-0']")
	private WebElement ThirdChannelName;

	@FindBy(xpath = "//*[@id='cell-3-0']")
	private WebElement FourthChannelName;

	@FindBy(xpath = "//*[@id='cell-4-0']")
	private WebElement FifthChannelName;

	@FindBy(xpath = "//*[@id='cell-5-0']")
	private WebElement SixthChannelName;

	@FindBy(xpath = "//*[@id='cell-6-0']")
	private WebElement SeventhChannelName;

	@FindBy(xpath = "//*[@id='cell-0-1']")
	private WebElement UnitTypeSelection;

	@FindBy(xpath = "//*[@id='cell-1-1']")
	private WebElement UnitTypeSelectionSecondRow;

	@FindBy(xpath = "//*[@id='cell-2-1']")
	private WebElement UnitTypeSelectionThirdRow;

	@FindBy(xpath = "//*[@id='cell-3-1']")
	private WebElement UnitTypeSelectionFourthRow;

	@FindBy(xpath = "//*[@id='cell-4-1']")
	private WebElement UnitTypeSelectionFifthRow;

	@FindBy(xpath = "//*[@id='cell-5-1']")
	private WebElement UnitTypeSelectionSixthRow;

	@FindBy(xpath = "//*[@id='cell-6-1']")
	private WebElement UnitTypeSelectionSeventhRow;

	@FindBy(xpath = "//*[@id='cell-0-2']")
	private WebElement UnitAutoSelectedFirstRow;

	@FindBy(xpath = "//*[@id='cell-1-2']")
	private WebElement UnitAutoSelectedSecondRow;

	@FindBy(xpath = "//*[@id='cell-2-2']")
	private WebElement UnitAutoSelectedThirdRow;

	@FindBy(xpath = "//*[@id='cell-3-2']")
	private WebElement UnitAutoSelectedFourthRow;

	@FindBy(xpath = "//*[@id='cell-4-2']")
	private WebElement UnitAutoSelectedFifthRow;

	@FindBy(xpath = "//*[@id='cell-5-2']")
	private WebElement UnitAutoSelectedSixthRow;

	@FindBy(xpath = "//*[@id='cell-6-2']")
	private WebElement UnitAutoSelectedSeventhRow;

	@FindBy(xpath = "//*[@id='cell-0-3']")
	private WebElement EnterFormulaFirstRow;

	@FindBy(xpath = "//*[@id='cell-1-3']")
	private WebElement EnterFormulaSecondRow;

	@FindBy(xpath = "//*[@id='cell-2-3']")
	private WebElement EnterFormulaThirdRow;

	@FindBy(xpath = "//*[@id='cell-3-3']")
	private WebElement EnterFormulaFourthRow;

	@FindBy(xpath = "//*[@id='cell-4-3']")
	private WebElement EnterFormulaFifthRow;

	@FindBy(xpath = "//*[@id='cell-5-3']")
	private WebElement EnterFormulaSixthRow;

	@FindBy(xpath = "//*[@id='cell-6-3']")
	private WebElement EnterFormulaSeventhRow;

	@FindBy(xpath = "//*[text()='Save & Validate']")
	private WebElement SaveandValidateButton;

	@FindBy(xpath = "//*[@id='toast-container']")
	private WebElement successToastMessage;

	@FindBy(xpath = "//*[contains(@class,'toast-close-button')]")
	private WebElement crossbuttontToastMessage;

	@FindBy(xpath = "//div[@id='channelListPageTitle']")
	private WebElement channelListPageTitle;

	@FindBy(xpath = "//*[contains(@class,'bg-danger')]")
	private WebElement errorMessage;

	@FindBy(id = "wellFromOverview")
	private WebElement wellFromOverview;

	@FindBy(id = "padNavigation")
	private WebElement padNavigation;

	@FindBy(id = "goToApplication")
	private WebElement goToApplication;

	@FindBy(id = "dashboardPage")
	private WebElement dashboardPage;

	@FindBy(xpath = "//*[@class='handsontableInput']")
	private WebElement Innerdropdown;

	@FindBy(xpath = "//*[contains(text(),'Utilities')]")
	private WebElement utilityTab;

	@FindBy(xpath = "(//*[contains(text(),'User-defined Channels')])[1]")
	private WebElement userDefinedChannelOption;

	@FindBy(xpath = "//*[contains(text(),'User-defined Channels')]//parent::div")
	private WebElement pageHeader;

	@FindBy(xpath = "//div[@class='pad-name']")
	private WebElement padName;

	@FindBy(xpath = "//div[@class='well-name']")
	private WebElement wellName;

	@FindBy(xpath = "//div[@id='successToastMessage']")
	private WebElement SuccessToastMessage;

	@FindBy(xpath = "//div[@class='modal-content']")
	private WebElement channelPopup;

	@FindBy(xpath = "//*[@formcontrolname='channelType']")
	private WebElement ChannelsTypeDropdown;

	@FindBy(xpath = "//*[contains(text(),'Real-time Channels')]")
	private WebElement ClickRealTimeChannelsDropdownSelection;

	@FindBy(xpath = "//*[@formcontrolname='channelName']")
	private WebElement ChannelNameDropdown;

	@FindBy(xpath = "//*[contains(text(),'Casing Pressure #1')]")
	private WebElement ClickChannelNameOption;

	@FindBy(xpath = "//*[@formcontrolname='channelType']")
	private WebElement FromChannelTypeDropdown;

	@FindBy(xpath = "//*[contains(text(),'Confirm Action')]")
	private WebElement confirmPopup;

	@FindBy(xpath = "//*[@alt='Delete']//parent::div//parent::td[@id='cell-0-4']")
	private WebElement DeleteButton;

	@FindBy(xpath = "//*[contains(text(),'Yes, Delete')]")
	private WebElement yesDeleteButton;

	@FindBy(xpath = "//*[contains(text(),'No')]")
	private WebElement noDeleteButton;

	@FindBy(xpath = "//*[@class='btn-close mt-2']")
	private WebElement CrossIcon;

	@FindBy(xpath = "//*[@class='btn-close']")
	private WebElement CrossIconPopup;

	@FindBy(xpath = "//*[text()='Insert']")
	private WebElement insertButton;

	@FindBy(xpath = "(//*[contains(text(),'Cancel')])[2]")
	private WebElement cancelButton;

	@FindBy(xpath = "//*[contains(@class,'cdk-drag')]")
	private WebElement scientificCalculator;

	@FindBy(xpath = "//*[contains(@class,'cdk-drag')]")
	private WebElement OnScreen;

	@FindBy(xpath = "//div[@class='calculator']")
	private WebElement SixthColumnFormula;

	@FindBy(xpath = "//*[contains(text(),'Insert Channel Name')]")
	private WebElement InsertChannelNamebutton;

	@FindBy(xpath = "//*[@id='cell-0-0']")
	private WebElement AdditiveRateChannelCell;

	@FindBy(xpath = "//*[@id='cell-0-1']")
	private WebElement KeyRateChannelCell;

	@FindBy(xpath = "//*[@id='cell-0-2']")
	private WebElement AdditiveSetPointChannelCell;

	public void clickElementChannelInputsForModel() {
		try {
//			Thread.sleep(3000);
//			WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
//			expandMenu.click();
			Thread.sleep(2000);
			elementUtils.clickElement(channelInputsForModelButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPageHeaderName() {
		try {
			String actualName = elementUtils.getElementText(pageHeaderName);
			String expectedName = "Channel Inputs for Model";
			Assert.assertEquals(actualName, expectedName, "Page header name does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//    public void verifyChannelInputsTableHeaderNames() {
//        try {
//
//            WebElement header1 = driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Model Input Channels'])[2]"));
//			String actualheadername1 = header1.getText();
//			String expectedHeader1 = "Model Input Channels";
//			Assert.assertEquals(actualheadername1, expectedHeader1, "Model Input Channels Table header does not match!");
//
//			WebElement header2 = driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Unit'])[2]"));
//			String actualheadername2 = header2.getText();
//			String expectedHeader2 = "Unit";
//			Assert.assertEquals(actualheadername2, expectedHeader2, "Unit Table header does not match!");
//
//			WebElement header3 = driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Real-Time Channel Names'])[2]"));
//			String actualheadername3 = header3.getText();
//			String expectedHeader3 = "Real-Time Channel Names";
//			Assert.assertEquals(actualheadername3, expectedHeader3, "Real-Time Channel Names Table header does not match!");
//
//			WebElement header4 = driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Smooth'])[2]"));
//			String actualheadername4 = header4.getText();
//			String expectedHeader4 = "Smooth";
//			Assert.assertEquals(actualheadername4, expectedHeader4, "Smooth Table header does not match!");
//            
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

	public void verifyChannelInputsTableHeaderNames() {
		try {
			String[] expectedHeaders = { "Model Input Channels", "Unit", "Real-Time Channel Names",

			};

			for (String expectedHeader : expectedHeaders) {
				WebElement header = driver
						.findElement(By.xpath(" (//table[@role='presentation']//th[@scope='col']/div[contains(text(),'"
								+ expectedHeader + "')])[1]")

						);
				String actualHeader = header.getAttribute("innerHTML").trim();
				Assert.assertEquals(actualHeader, expectedHeader, expectedHeader + " Table header does not match!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyRealTimeChannelSectionEmptyData() {
		try {
			String actualData = elementUtils.getElementText(realTimeChannelSectionEmptyData).trim();
			String expectedData = "▼\n-".trim();
			Assert.assertEquals(actualData.replaceAll("\\s+", ""), expectedData.replaceAll("\\s+", ""),
					"Real-Time Channel section is not empty!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyChannelOptionsSectionVisible() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(channelOptionsSection);
			Assert.assertTrue(isVisible, "Channel Options section is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMeasuredDepthFieldAppears() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(MeasuredDepthUnitField);
			Assert.assertTrue(isVisible, "Measured Depth to Bottom Hole Gauge field is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDeadStringSGFieldAppears() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(DeadStringSGField);
			Assert.assertTrue(isVisible, "Dead String SG Field is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMeasuredDepthUnit() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(MeasuredDepthUnit);
			Assert.assertTrue(isVisible, "Measured Depth to Bottom Hole Gauge field is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAllOptionsSelectableInChannelOptionsSection() {
		try {

			elementUtils.clickElement(UseStepNumberChanneltoAutoStep);
			boolean isSelected = UseStepNumberChanneltoAutoStep.isSelected();
			Assert.assertTrue(isSelected, "Options in Channel Options section are not selectable!");

			elementUtils.clickElement(UseStepTotalsChanneltoAutoStep);
			boolean isSelected1 = UseStepTotalsChanneltoAutoStep.isSelected();
			Assert.assertTrue(isSelected1, "Options in Channel Options section are not selectable!");

			elementUtils.clickElement(AutoFluidandProppantSelection);
			boolean isSelected2 = AutoFluidandProppantSelection.isSelected();
			Assert.assertTrue(isSelected2, "Options in Channel Options section are not selectable!");

//			elementUtils.clickElement(useUserDefinedChannelsCheckbox);
			boolean isSelected3 = useUserDefinedChannelsCheckbox.isSelected();
			Assert.assertTrue(isSelected3, "Options in Channel Options section are not selectable!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUseUserDefinedChannelsCheckbox() {
		try {
			elementUtils.clickElement(useUserDefinedChannelsCheckbox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyRedirectionToUserDefinedChannels() {

		try {
			Thread.sleep(2000);
			String actualUrl = driver.getCurrentUrl();

			// Extract wellId dynamically from the actual URL
			String wellId = actualUrl.replaceAll(".*wellId=([0-9]+).*", "$1");

			// Construct the expected URL with the dynamic wellId
			String expectedUrl = "https://agileui-uat.walkingtree.tech:9444/utilities/user-defined-channels?wellId="
					+ wellId + "&modalInputTab=true";

			// Verify redirection
			Assert.assertEquals(actualUrl, expectedUrl, "Redirection to User-Defined Channels failed!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyRedirectionToChannelInputs() {
		try {
			String actualUrl = driver.getCurrentUrl();

			// Extract wellId dynamically from the actual URL
			String wellId = actualUrl.replaceAll(".*wellId=([0-9]+).*", "$1");

			// Construct expected URL dynamically
			String expectedUrl = "https://agileui-uat.walkingtree.tech:9444/well-pad/channel-input-model?wellId="
					+ wellId;

			// Verify redirection
			Assert.assertEquals(actualUrl, expectedUrl, "Redirection to Channel Input Model failed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementInputs() {
		try {
			elementUtils.clickElement(inputsoption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isActionRequiredpoupdisplayed() {
		try {
			elementUtils.isElementDisplayed(ActionRequiredpopup);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickonYesbutton() {
		try {
			elementUtils.clickElement(YesButton);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUserDefinedChannelsCheckboxChecked() {
		try {
			boolean isSelected = useUserDefinedChannelsCheckbox.isSelected();
			Assert.assertTrue(isSelected, "Options in Channel Options section are not selected!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUserDefinedChannelsCheckboxunChecked() {
		try {
			boolean isSelected = useUserDefinedChannelsCheckbox.isSelected();
			Assert.assertFalse(isSelected, "Expected checkbox to be unchecked, but it is checked.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementChannelInputsForModelAgain() {
		try {
			elementUtils.clickElement(channelInputsForModelButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementAdditivesTab() {
		try {
			elementUtils.clickElement(clickElementAdditivesTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectRealTimeChannelForBottomholePressure() {
		try {

			Thread.sleep(2000);
			elementUtils.doubleClickElement(selectRealTimeChannelForBottomholePressure);
			Thread.sleep(2000);
			Innerdropdown.sendKeys(Keys.BACK_SPACE);
			WebElement RTchannel9 = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("RTChannelNameBP") + "']"));
			RTchannel9.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectRealTimeChannelForDeadStringPressure() {
		try {

			Thread.sleep(2000);
			elementUtils.doubleClickElement(selectRealTimeChannelForDeadStringPressure);
			Thread.sleep(2000);
			Innerdropdown.sendKeys(Keys.BACK_SPACE);
			String Channelname = ReadData.readdata("RTChannelNameDSP");
			elementUtils.clearAndSendKeys(Innerdropdown, Channelname);
			WebElement RTchannel9 = driver
					.findElement(By.xpath("//strong[text()='" + ReadData.readdata("RTChannelNameDSP") + "']"));
			RTchannel9.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectAdditiveRateChannel() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(selectAdditiveRateChannel);
			Thread.sleep(2000);
			WebElement RTchannel9 = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("RTChannelNameTP") + "']"));
			RTchannel9.click();

//            elementUtils.selectOptionInDropdown(selectAdditiveRateChannel, ReadData.readdata("RTChannelNameTP") );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectKeyRateChannel() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(selectKeyRateChannel);
			Thread.sleep(2000);
			WebElement RTchannel9 = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("RTChannelNameBP") + "']"));
			RTchannel9.click();

//            elementUtils.selectOptionInDropdown(selectKeyRateChannel, ReadData.readdata("RTChannelNameTP") );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectAdditiveSetChannel() {
		try {

			Thread.sleep(2000);
			elementUtils.doubleClickElement(selectAdditiveSetChannel);
			Thread.sleep(2000);
			WebElement RTchannel9 = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("RTChannelNameDSP") + "']"));
			RTchannel9.click();

//            elementUtils.selectOptionInDropdown(selectAdditiveSetChannel, ReadData.readdata("RTChannelNameTP") );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectRealTimeChannelForTreatingPressure() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(selectRealTimeChannelForTreatingPressure);
			Thread.sleep(2000);
			Innerdropdown.sendKeys(Keys.BACK_SPACE);
			WebElement RTchannel9 = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("RTChannelNameTP") + "']"));
			RTchannel9.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unselectRealTimeChannelForBottomholePressure() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(selectRealTimeChannelForBottomholePressure);
			Innerdropdown.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Innerdropdown.sendKeys(Keys.chord(Keys.BACK_SPACE));
			elementUtils.clickElement(pageHeaderName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySurfaceTreatingPressureAutoSelected() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(FromSurfaceTreatingPressureOption);
			Assert.assertTrue(isVisible, "Observed Net Pressure Calculation section is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBottomholePressureAutoSelected() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(FromBottomHolePressure);
			Assert.assertTrue(isVisible, "Observed Net Pressure Calculation section is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDeadStringPressureAutoSelected() {
		try {
			boolean isSelected = elementUtils.isElementDisplayed(FromDeadStringPressure);
			Assert.assertTrue(isSelected, "Observed Net Pressure Calculation section is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyObservedNetPressureCalculationSectionVisible() {
		try {
			boolean isVisible = elementUtils.isElementDisplayed(ObservedNetPressureCalculation);
			Assert.assertTrue(isVisible, "Observed Net Pressure Calculation section is not visible!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoSmoothingNumberOfPointsField() {
		try {
			elementUtils.clearAndSendKeys(smoothingNumberOfPointsField, ReadData.readdata("SmoothingNumber"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoSmoothingNumberForAdditiveTab() {
		try {
			elementUtils.clearAndSendKeys(smoothingNumberOfPointsFieldAT, ReadData.readdata("SmoothingNumber1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoNumberOfFlowmetersField() {
		try {
			elementUtils.clearAndSendKeys(numberOfFlowmetersField, ReadData.readdata("NumberOfFlowmeters"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoNumberOfDensometersField() {
		try {
			elementUtils.clearAndSendKeys(numberOfDensometersField, ReadData.readdata("NumberOfDensometers"));
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

	public void verifySuccessToastMessage() {
		try {
			String actualMessage = elementUtils.getElementText(successToastMessage);
			String expectedMessage = "Data saved successfully!";
			Assert.assertEquals(actualMessage, expectedMessage, "Success toast message does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyEnteredDataSaved() {
		try {
			String actualData = smoothingNumberOfPointsField.getAttribute("value");
			String expectedData = ReadData.readdata("SmoothingNumber");
			Assert.assertEquals(actualData, expectedData, "Entered data is not saved!");

			String actualData1 = numberOfFlowmetersField.getAttribute("value");
			String expectedData1 = ReadData.readdata("NumberOfFlowmeters");
			Assert.assertEquals(actualData1, expectedData1, "Entered data is not saved!");

			String actualData2 = numberOfDensometersField.getAttribute("value");
			String expectedData2 = ReadData.readdata("NumberOfDensometers");
			Assert.assertEquals(actualData2, expectedData2, "Entered data is not saved!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyEnteredDataSavedAdditivetab() {
		try {

			Assert.assertEquals(smoothingNumberOfPointsField.getAttribute("value"),
					ReadData.readdata("SmoothingNumber1"), "Entered data is not saved!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementNextButton() {
		try {
			elementUtils.clickElement(nextButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUseUserDefinedChannelsCheckboxSelected() {
		try {
			Thread.sleep(3000);
			boolean isSelected = useUserDefinedChannelsCheckboxadd.isSelected();
			Assert.assertTrue(isSelected, "Use User-defined Channels checkbox is not selected!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySmoothingNumberOfPointsFieldValue() {
		try {
			String actualValue = smoothingNumberOfPointsField.getAttribute("value");
			elementUtils.clickElement(channelInputsTab);
			String expectedValue = smoothingNumberOfPointsField.getAttribute("value");
			Assert.assertEquals(actualValue, expectedValue, "Smoothing number of Points field value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementChannelInputsTab() {
		try {
			elementUtils.clickElement(channelInputsTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickUserDefinedChannelsDropdownSelection() {
		try {
			elementUtils.clickElement(ClickUserDefinedChannelsDropdownSelection);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUserDefinedChannelsDropdownSelection() {
		try {
			elementUtils.doubleClickElement(ClickUserDefinedChannelsDropdownSelection);
			Thread.sleep(3000);
			Innerdropdown.sendKeys(Keys.BACK_SPACE);
			String Channelname = ReadData.readdata("ChannelName");
			elementUtils.clearAndSendKeys(Innerdropdown, Channelname);
			WebElement UDCDS = driver
					.findElement(By.xpath("//strong[text()='" + ReadData.readdata("ChannelName") + "']"));
			UDCDS.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySelectedChannelSaved() {
		try {
			String actualSelectedOption = userDefinedChannelsDropdown.getAttribute("value");
			String expectedSelectedOption = ReadData.readdata("ChannelName");
			Assert.assertEquals(actualSelectedOption, expectedSelectedOption, "Selected channel is not saved!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementMeasuredDataButton() {
		try {
			elementUtils.clickElement(measuredDataButton);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyRedirectionToMeasuredDataScreen() {
		try {
			Thread.sleep(3000);
//            String actualUrl = driver.getCurrentUrl();
//            String expectedUrl = "https://fracproplusqa.walkingtree.tech:9443/plots?wellId=13518&plotId=0";
//            Assert.assertEquals(actualUrl, expectedUrl, "Redirection to Measured Data screen failed!");

			String actualUrl = driver.getCurrentUrl();

			// Extract wellId dynamically from the actual URL
			String wellId = actualUrl.replaceAll(".*wellId=([0-9]+).*", "$1");

			// Construct the expected URL with the dynamic wellId
			String expectedUrl = "https://agileui-uat.walkingtree.tech:9444/plots?wellId=" + wellId + "&plotId=0";

			// Verify redirection
			Assert.assertEquals(actualUrl, expectedUrl, "Redirection to User-Defined Channels failed!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNoInputChannelUnitForModel() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(NoInputChannelUnit);
			String Inputchannel = elementUtils.getElementText(NoInputChannelUnit);
			System.out.println(Inputchannel);
			Assert.assertFalse(isElementDisplayed, "Input Channel Unit is present for the model!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyInputChannelUnitForModel() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(NoInputChannelUnit);
			Assert.assertTrue(isElementDisplayed, "Input Channel Unit is not displayed for the model!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterChannelName() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(channelNameFieldForFirstRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("ChannelName"));
			channelNameFieldForFirstRow.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterMeasuredDepthData() {
		try {
			elementUtils.clearAndSendKeys(MeasuredDepthField, ReadData.readdata("MeasuredDepthData"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDeadStringSG() {
		try {
			elementUtils.clearAndSendKeys(DeadStringSGFielddata, ReadData.readdata("DeadStringSGData"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUnitType() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(UnitTypeSelection);
			WebElement Unittype = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("UnitTypeOption") + "']"));
			Unittype.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUnitAutoSelected() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(UnitAutoSelectedFirstRow);
			Assert.assertTrue(isElementDisplayed, "Unit is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFormula() {
		try {
			elementUtils.doubleClickElement(EnterFormulaFirstRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Formula"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickSaveAndValidate() {
		try {
			elementUtils.clickElement(SaveandValidateButton);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectUnitRateBPM() {
		try {

			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public void isChannelNameDisplayed(String channelName) {
//		try {
//			String actualChannelName = elementUtils.getElementText(channelNameField);
//			Assert.assertEquals(actualChannelName, channelName, "Channel name is not displayed in the channel list!");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public void navigateToChannelListPage() {
		try {
			driver.navigate().to("https://fracproplus-uat.linqx.com:9443/channelList");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		try {
			return driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void clickElementSaveButtonAgain() {
		try {
			elementUtils.clickElement(saveButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getErrorMessage() {
		try {
			return elementUtils.getElementText(errorMessage);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void clickElementWellFromOverview() {
		try {
			elementUtils.clickElement(wellFromOverview);
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

	public void clickElementGoToApplication() {
		try {
			elementUtils.clickElement(goToApplication);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDashboardPage() {
		try {
			boolean isDisplayed = elementUtils.isElementDisplayed(dashboardPage);
			Assert.assertTrue(isDisplayed, "Dashboard page is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMeasuredDepthDataSaved() {
		try {
			Thread.sleep(2000);
			String actualValue = MeasuredDepthField.getAttribute("value");
			String expectedValue = ReadData.readdata("MeasuredDepthData");
			Assert.assertEquals(actualValue, expectedValue, "Measured Data is Not Matched!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAdditiveTapDataSaved() {
		try {
			Thread.sleep(2000);
//  			String actualData = elementUtils.getElementText(selectAdditiveRateChannel).trim();
//            String expectedData = ReadData.readdata("RTChannelNameTP").trim();  
//            Assert.assertEquals(actualData.replaceAll("\\s+", ""), 
//                                expectedData.replaceAll("\\s+", ""), 
//                                "Data is Not Matched!");

			Thread.sleep(2000);
			String actualData = elementUtils.getElementText(selectAdditiveRateChannel).trim();
			actualData = actualData.replaceAll("[^\\w#]", ""); // Remove non-word characters except #

			String expectedData = ReadData.readdata("SecondChannelName").trim();
			expectedData = expectedData.replaceAll("[^\\w#]", ""); // Ensure uniform formatting

			Assert.assertEquals(actualData, expectedData, "Data is Not Matched!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDeadStringSGDataSaved() {
		try {
			Thread.sleep(2000);
//			String actualValue = DeadStringSGFielddata.getAttribute("innerText");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String actualValue = (String) js.executeScript("return arguments[0].value;", DeadStringSGFielddata);
			System.out.println("JS Value: " + actualValue);
			String expectedValue = ReadData.readdata("DeadStringSGData");
			Assert.assertEquals(actualValue, expectedValue, "Dead String SG Data is Not Matched!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickUtilityTab() {
		try {
			elementUtils.clickElement(utilityTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickUserDefinedChannelOption() {
		try {
			elementUtils.clickElement(userDefinedChannelOption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPageHeaderNameUDC() {
		try {
			elementUtils.isElementDisplayed(pageHeader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPadName() {
		try {
			WebElement padname = driver
					.findElement(By.xpath("//span[starts-with(text(), '" + ReadData.readdata("Padname") + "')]"));
			padname.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWellName() {
		try {
			WebElement wellName = driver
					.findElement(By.xpath("//span[starts-with(text(), '" + ReadData.readdata("WellName") + "')]"));
			elementUtils.isElementDisplayed(wellName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterChannelNameInFirstRow() {
		try {
			elementUtils.doubleClickElement(channelNameFieldForFirstRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FirstChannelName"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterChannelNameInSecondRow() {
		try {
			elementUtils.doubleClickElement(channelNameFieldForSecondRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("SecondChannelName"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUnitTypeInFirstRow() {
		try {
			elementUtils.doubleClickElement(UnitTypeSelection);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[2]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("UnitTypeRSA"));
			WebElement Unittype = driver
					.findElement(By.xpath("//strong[text()='" + ReadData.readdata("UnitTypeRSA") + "']"));
			Unittype.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAutoSelectedUnitInFirstRow() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(UnitAutoSelectedSecondRow);
			Assert.assertTrue(isElementDisplayed, "Unit is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFormulaInFirstRow() {
		try {
			elementUtils.doubleClickElement(EnterFormulaFirstRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Formula"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUpdatedToastMessage() {
		try {
			elementUtils.isElementDisplayed(successToastMessage);
			Thread.sleep(1000);
			elementUtils.clickElement(crossbuttontToastMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFirstUserDefinedChannel() {
		try {
			Assert.assertEquals(FirstChannelName.getText(), ReadData.readdata("FirstChannelName"),
					"First Channel Name is not Matched!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUnitTypeInSecondRow() {
		try {
			elementUtils.doubleClickElement(UnitTypeSelectionSecondRow);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[2]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("UnitTypeRLA"));
			WebElement Unittype = driver
					.findElement(By.xpath("//strong[text()='" + ReadData.readdata("UnitTypeRLA") + "']"));
			Unittype.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAutoSelectedUnitInSecondRow() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(UnitAutoSelectedSecondRow);
			Assert.assertTrue(isElementDisplayed, "Unit is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFormulaInSecondRow() {
		try {
			elementUtils.doubleClickElement(EnterFormulaSecondRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Formula"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifySecondUserDefinedChannel() {
		try {
			Assert.assertEquals(SecondChannelName.getText(), ReadData.readdata("SecondChannelName"),
					"Second Channel Name is not Matched!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterChannelNameInThirdRow() {
		try {
			elementUtils.doubleClickElement(channelNameFieldForThirdRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("ThirdChannelName"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUnitTypeInThirdRow() {
		try {
			elementUtils.doubleClickElement(UnitTypeSelectionThirdRow);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[2]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("UnitTypeRCO2"));
			WebElement Unittype = driver
					.findElement(By.xpath("//strong[text()='" + ReadData.readdata("UnitTypeRCO2") + "']"));
			Unittype.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAutoSelectedUnitInThirdRow() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(UnitAutoSelectedThirdRow);
			Assert.assertTrue(isElementDisplayed, "Unit is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFormulaInThirdRow() {
		try {
			elementUtils.doubleClickElement(EnterFormulaThirdRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Formula"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyThirdUserDefinedChannel() {
		try {
			Assert.assertEquals(ThirdChannelName.getText(), ReadData.readdata("ThirdChannelName"),
					"Second Channel Name is not Matched!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void enterChannelNameInFourthRow() {
		try {
			elementUtils.doubleClickElement(channelNameFieldForFourthRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FourthChannelName"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUnitTypeInFourthRow() {
		try {
			elementUtils.doubleClickElement(UnitTypeSelectionFourthRow);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[2]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("UnitTypeSlurry"));
			WebElement Unittype = driver
					.findElement(By.xpath("//strong[text()='" + ReadData.readdata("UnitTypeSlurry") + "']"));
			Unittype.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAutoSelectedUnitInFourthRow() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(UnitAutoSelectedFourthRow);
			Assert.assertTrue(isElementDisplayed, "Unit is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFormulaInFourthRow() {
		try {
			elementUtils.doubleClickElement(EnterFormulaFourthRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Formula"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFourthUserDefinedChannel() {
		try {
			Assert.assertEquals(FourthChannelName.getText(), ReadData.readdata("FourthChannelName"),
					"Second Channel Name is not Matched!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterChannelNameInFifthRow() {
		try {
			elementUtils.doubleClickElement(channelNameFieldForFifthRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FifthChannelName"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUnitTypeInFifthRow() {
		try {
			elementUtils.doubleClickElement(UnitTypeSelectionFifthRow);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[2]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("UnitTypeAdditiveVolume"));
			WebElement Unittype = driver
					.findElement(By.xpath("//strong[text()='" + ReadData.readdata("UnitTypeAdditiveVolume") + "']"));
			Unittype.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAutoSelectedUnitInFifthRow() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(UnitAutoSelectedFifthRow);
			Assert.assertTrue(isElementDisplayed, "Unit is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFormulaInFifthRow() {
		try {
			elementUtils.doubleClickElement(EnterFormulaFifthRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Formula"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFifthUserDefinedChannel() {
		try {
			Assert.assertEquals(FifthChannelName.getText(), ReadData.readdata("FifthChannelName"),
					"Second Channel Name is not Matched!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterChannelNameInSixthRow() {
		try {
			elementUtils.doubleClickElement(channelNameFieldForSixthRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("SixthChannelName"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUnitTypeInSixthRow() {
		try {
			elementUtils.doubleClickElement(UnitTypeSelectionSixthRow);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[2]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("UnitTypeOption"));
			WebElement Unittype = driver
					.findElement(By.xpath("//strong[text()='" + ReadData.readdata("UnitTypeOption") + "']"));
			Unittype.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUnitAutoSelectedInSixthRow() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(UnitAutoSelectedSixthRow);
			Assert.assertTrue(isElementDisplayed, "Unit is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFormulaInSixthRow() {
		try {
			elementUtils.doubleClickElement(EnterFormulaSixthRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Formula"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySixthUserDefinedChannel() {
		try {
			Assert.assertEquals(SixthChannelName.getText(), ReadData.readdata("SixthChannelName"),
					"Second Channel Name is not Matched!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteChannelInfirstRow() {
		try {
			elementUtils.clickElement(DeleteButton);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyConfirmPopup() {
		try {
			elementUtils.isElementDisplayed(confirmPopup);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void confirmDelete() {
		try {
			elementUtils.clickElement(yesDeleteButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyScientificCalculatorDraggable() {
		try {
			elementUtils.isElementDisplayed(scientificCalculator);
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", scientificCalculator);
			actions.clickAndHold(scientificCalculator) // Click and hold on the source element
					.pause(3000) // Optional: Pause to allow time to visually see the drag
					.moveToElement(OnScreen) // Move to the target element
					.pause(3000) // Optional: Pause to allow time to visually see the drag
					.release(OnScreen) // Release the hold on the target element
					.build() // Build the action chain
					.perform(); // Execute the action
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickFormulaInputInSixthRow() {
		try {
			elementUtils.doubleClickElement(EnterFormulaSixthRow);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickInsertChannelFromCalculator() {
		try {
			elementUtils.clickElement(InsertChannelNamebutton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyChannelPopupAppears() {
		elementUtils.isElementDisplayed(channelPopup);
	}

	public void selectChannelType() {
		elementUtils.clickElement(ChannelsTypeDropdown);
		elementUtils.selectFromNgSelect(ClickRealTimeChannelsDropdownSelection, FromChannelTypeDropdown);
		elementUtils.clickElement(channelPopup);
	}

	public void selectChannelName() {
		try {
			elementUtils.clickElement(ChannelNameDropdown);
			elementUtils.selectFromNgSelect(ClickChannelNameOption, ChannelNameDropdown);
			Thread.sleep(2000);
			elementUtils.clickElement(channelPopup);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickInsertButton() {
		elementUtils.clickElement(insertButton);
	}

	public void verifyInsertedChannelInFormula() {
		try {
			WebElement formulaCell = driver.findElement(By.xpath("//*[@id='cell-5-3']"));
			String formulaText = formulaCell.getText().trim();
			if (!formulaText.isEmpty()) {
				System.out.println("✅ Formula is populated: " + formulaText);
			} else {
				System.out.println("❌ Formula column is empty. Expected formula value.");
				throw new AssertionError("Formula should be populated but was empty.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterChannelNameInSeventhRow() {
		elementUtils.doubleClickElement(channelNameFieldForSeventhRow);
		WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
		elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("SeventhChannelName"));
	}

	public void selectUnitTypeInSeventhRow() {
		elementUtils.doubleClickElement(UnitTypeSelectionSeventhRow);
		WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[2]"));
		elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("UnitTypeOption"));
		WebElement Unittype = driver
				.findElement(By.xpath("//strong[text()='" + ReadData.readdata("UnitTypeOption") + "']"));
		Unittype.click();
	}

	public void verifyUnitAutoSelectedInSeventhRow() {
		boolean isElementDisplayed = elementUtils.isElementDisplayed(UnitAutoSelectedSeventhRow);
		Assert.assertTrue(isElementDisplayed, "Unit is not displayed!");
	}

	public void enterInvalidFormulaInSeventhRow() {
		elementUtils.doubleClickElement(EnterFormulaSeventhRow);
		WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
		elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("InvalidFormula"));
	}

	public void verifyFormulaErrorMessage() {
		try {
			String messageText = errorMessage.getText().trim();
			System.out.println("✅ Error message displayed: " + messageText);

			if (messageText.isEmpty()) {
				throw new AssertionError("❌ Expected an error message, but none was displayed.");
			}

		} catch (Exception e) {
			System.out.println("❌ Error message not found. Validation failed.");
			throw e;
		}
	}

//	    public void verifyUnitVisibilityInColumnAdditiveRateChannel() {
//	    	try {
//	    		
//	    		 boolean foundChannel1 = false;
//		         boolean foundChannel2 = false;
//	    		  // Step 1: Open the dropdown by double-clicking the target cell
//	            elementUtils.doubleClickElement(AdditiveRateChannelCell);
//
//	            // Step 2: Enter search keyword into the dropdown input
//	            WebElement textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
//	            elementUtils.clearAndSendKeys(textarea, ReadData.readdata("FirstChannelName"));
//
//	            // Step 3: Read expected channel names
//	            String expectedChannelName1 = ReadData.readdata("FirstChannelName");
//	            try {
//	                WebElement channelOption1 = driver.findElement(By.xpath("//*[contains(@class,'listbox')]//parent::tbody"));
//	                foundChannel1 = channelOption1.isDisplayed();
//	            } catch (NoSuchElementException e) {
//	                System.out.println("❌ Channel not found: " + expectedChannelName1);
//	            }
//	            elementUtils.doubleClickElement(AdditiveRateChannelCell);
//
//	            // Step 2: Enter search keyword into the dropdown input
//	            
//	            elementUtils.clearAndSendKeys(textarea, ReadData.readdata("FirstChannelName"));
//	            
//	            String expectedChannelName2 = ReadData.readdata("SecondChannelName");
//
//	            try {
//	                WebElement channelOption2 = driver.findElement(By.xpath("//*[contains(@class,'listbox')]//parent::tbody"));
//	                foundChannel2 = channelOption2.isDisplayed();
//	            } catch (NoSuchElementException e) {
//	                System.out.println("❌ Channel not found: " + expectedChannelName2);
//	            }
//
//	            // Step 5: Assert both are found
//	            if (foundChannel1 && foundChannel2) {
//	                System.out.println("✅ Both expected channels are visible in the dropdown.");
//	            } else {
//	                throw new AssertionError("One or both expected channels not found in the dropdown.");
//	            }
//
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	    }

	public void verifyUnitVisibilityInColumnAdditiveRateChannel() {
		try {

			boolean foundChannel1 = false;
			boolean foundChannel2 = false;
			// Step 1: Open the dropdown by double-clicking the target cell
			elementUtils.doubleClickElement(AdditiveRateChannelCell);

			// Step 2: Enter search keyword into the dropdown input
			WebElement textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(textarea, ReadData.readdata("FirstChannelName"));

			// Step 3: Read expected channel names
			String expectedChannelName1 = ReadData.readdata("FirstChannelName");
			try {
				WebElement channelOption1 = driver
						.findElement(By.xpath("//*[contains(@class,'listbox')]//parent::tbody"));
				foundChannel1 = channelOption1.isDisplayed();
			} catch (NoSuchElementException e) {
				System.out.println("❌ Channel not found: " + expectedChannelName1);
			}
			elementUtils.doubleClickElement(AdditiveRateChannelCell);

			// Step 2: Enter search keyword into the dropdown input

			elementUtils.clearAndSendKeys(textarea, ReadData.readdata("SecondChannelName"));

			String expectedChannelName2 = ReadData.readdata("SecondChannelName");

			try {
				WebElement channelOption2 = driver
						.findElement(By.xpath("//*[contains(@class,'listbox')]//parent::tbody"));
				foundChannel2 = channelOption2.isDisplayed();
			} catch (NoSuchElementException e) {
				System.out.println("❌ Channel not found: " + expectedChannelName2);
			}

			// Step 5: Assert both are found
			if (foundChannel1 && foundChannel2) {
				System.out.println("✅ Both expected channels are visible in the dropdown.");
			} else {
				throw new AssertionError("One or both expected channels not found in the dropdown.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUnitVisibilityInColumnKeyRate() {
		try {

			boolean foundChannel1 = false;
			boolean foundChannel2 = false;
			// Step 1: Open the dropdown by double-clicking the target cell
			elementUtils.doubleClickElement(KeyRateChannelCell);

			// Step 2: Enter search keyword into the dropdown input
			WebElement textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(textarea, ReadData.readdata("ThirdChannelName"));

			// Step 3: Read expected channel names
			String expectedChannelName1 = ReadData.readdata("ThirdChannelName");
			try {
				WebElement channelOption1 = driver
						.findElement(By.xpath("//*[contains(@class,'listbox')]//parent::tbody"));
				foundChannel1 = channelOption1.isDisplayed();
			} catch (NoSuchElementException e) {
				System.out.println("❌ Channel not found: " + expectedChannelName1);
			}
			elementUtils.doubleClickElement(KeyRateChannelCell);

			// Step 2: Enter search keyword into the dropdown input

			elementUtils.clearAndSendKeys(textarea, ReadData.readdata("FourthChannelName"));

			String expectedChannelName2 = ReadData.readdata("FourthChannelName");

			try {
				WebElement channelOption2 = driver
						.findElement(By.xpath("//*[contains(@class,'listbox')]//parent::tbody"));
				foundChannel2 = channelOption2.isDisplayed();
			} catch (NoSuchElementException e) {
				System.out.println("❌ Channel not found: " + expectedChannelName2);
			}

			// Step 5: Assert both are found
			if (foundChannel1 && foundChannel2) {
				System.out.println("✅ Both expected channels are visible in the dropdown.");
			} else {
				throw new AssertionError("One or both expected channels not found in the dropdown.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUnitVisibilityInColumnAddtiveSetPoint() {
		try {

			boolean foundChannel1 = false;

			// Step 1: Open the dropdown by double-clicking the target cell
			elementUtils.doubleClickElement(AdditiveSetPointChannelCell);

			// Step 2: Enter search keyword into the dropdown input
			WebElement textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(textarea, ReadData.readdata("FifthChannelName"));

			// Step 3: Read expected channel names
			String expectedChannelName1 = ReadData.readdata("FirstChannelName");
			try {
				WebElement channelOption1 = driver
						.findElement(By.xpath("//*[contains(@class,'listbox')]//parent::tbody"));
				foundChannel1 = channelOption1.isDisplayed();
			} catch (NoSuchElementException e) {
				System.out.println("❌ Channel not found: " + expectedChannelName1);
			}

			// Step 5: Assert both are found
			if (foundChannel1) {
				System.out.println("✅ Channel is visible in the dropdown.");
			} else {
				throw new AssertionError("expected Channel is not found in the dropdown.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickCancelButtonOnChannelPopup() {
		elementUtils.clickElement(cancelButton);
	}

	public void verifyChannelNotInsertedInFormula() {
		try {
			WebElement formulaCell = driver.findElement(By.xpath("//*[@id='cell-5-3']"));
			String formulaText = formulaCell.getText().trim();
			if (formulaText.isEmpty()) {
				System.out.println("✅ Formula column is empty as expected.");
			} else {
				System.out.println("❌ Formula column has unexpected value: " + formulaText);
				// Optionally throw assertion here:
				throw new AssertionError("Formula column should be empty, but found: " + formulaText);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickCloseIconOnChannelPopup() {
		elementUtils.clickElement(CrossIconPopup);
	}

	public void clickNoButtonOnConfirmPopup() {
		elementUtils.clickElement(noDeleteButton);
	}

	public void verifyChannelNotDeletedInSixthRow() {

	}

	public void clickCloseIconOnConfirmPopup() {
		elementUtils.clickElement(CrossIcon);
	}

	// General reusable methods
	public void enterChannelNameInRow(int row, String name) {
		// Implementation to locate input by row and enter name
	}

	public void selectUnitTypeInRow(int row, String unitType) {
		// Select appropriate unit type in given row
	}

	public void verifyAutoSelectedUnitInRow(int row, String expectedUnit) {
		// Verify correct unit auto-selected
	}

	public void verifyChannelInRow(int row) {
		// Verify channel was added in the given row
	}

	public void enterFormulaInRow(int row, String formula) {
		// Enter formula for specific row
	}

}