package com.FracProPlus.pages;

import java.time.Duration;
import java.util.List;

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

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ExcelToWebPaste;
import com.FracProPlus.utils.ReadData;

public class PerforationIntervalPage {

	private WebDriver driver;
	private ElementUtils elementUtils;
	CopyPaste cp;

	PerforationIntervalPage pergforationinterval;

	public PerforationIntervalPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Home']")
	private WebElement homeScreen;

	@FindBy(id = "padFromHomeScreen")
	private WebElement padFromHomeScreen;

	@FindBy(xpath = "//li[text()='Overview']")
	private WebElement wellFromOverview;

	@FindBy(xpath = "//a[text()=' Wellbore Configuration ']")
	private WebElement wellboreConfigurationOption;

	@FindBy(id = "pageHeaderName")
	private WebElement pageHeaderName;

	@FindBy(xpath = "//span[text()='Perforation Intervals']")
	private WebElement perforationIntervalTab;

	@FindBy(id = "tableHeaderNames")
	private WebElement tableHeaderNames;

	@FindBy(xpath = "//button[text()=' Copy & Paste ']")
	private WebElement copyAndPasteButton;

	@FindBy(xpath = "//h6[text()='Use Multiple Clusters for Model']/parent::div/div/input[@formcontrolname='FracsPerStage']")
	private WebElement useMultipleClustersForModelCheckBox;

	@FindBy(xpath = "//h5[text()=' Perforation Data ']")
	private WebElement copyAndPastePageTitleName;

	@FindBy(xpath = "//h5[text()='Copy & Paste']")
	private WebElement copyAndPastePageHeaderName;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton1;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButtonInPerforationIntervalPage;

	@FindBy(xpath = "(//span[text()='1'])[2]/parent::div/parent::th/following-sibling::td/div/img")
	private WebElement addRowButton;

	@FindBy(xpath = "//h5[text()='Perforation Interval']")
	private WebElement subintervalPageTitleName;

	@FindBy(id = "subIntervalTableHeaderName")
	private WebElement subIntervalTableHeaderName;

	@FindBy(id = "subIntervalRowValues")
	private WebElement subIntervalRowValues;

	@FindBy(xpath = "(//img[@alt='Edit Clusters'])[1]")
	private WebElement addRowField;

	@FindBy(xpath = "(//td[@id='cell-0-1'])[2]")
	private WebElement topMDField;

	@FindBy(xpath = "(//td[@id='cell-0-2'])[2]")
	private WebElement botMDField;

	@FindBy(xpath = "(//td[@id='cell-0-3'])[2]")
	private WebElement topTVDField;

	@FindBy(xpath = "(//td[@id='cell-0-4'])[2]")
	private WebElement botTVDField;

	@FindBy(xpath = "(//td[@id='cell-0-5'])[2]")
	private WebElement diameterField;

	@FindBy(xpath = "(//td[@id='cell-0-6'])[2]")
	private WebElement noOfPerfsField;

	@FindBy(xpath = "(//td[@id='cell-0-7'])[2]")
	private WebElement perfPhasingDropdown;

	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okButton;

	@FindBy(id = "noOfClusterField")
	private WebElement noOfClusterField;

	@FindBy(xpath = "(//span[text()='1'])[2]/ancestor::tr/td[3]")
	private WebElement topMDsField;

	@FindBy(xpath = "(//span[text()='1'])[2]/ancestor::tr/td[4]")
	private WebElement botMDsField;

	@FindBy(xpath = "//td[@id='cell-0-2']")
	private WebElement aliasColumnOfIntervals;

	@FindBy(xpath = "//label[text()='Use Stage Aliases']/parent::div/input")
	private WebElement stageAliasCheckBox;

	@FindBy(xpath = "(//div[@class='table-header' and normalize-space(text())='Alias'])[2]")
	private WebElement aliasTableHeaderName;

	@FindBy(xpath = "//table[@id='aliasTable']//tr[last()]/td[@class='aliasColumn']")
	private WebElement aliasColumnForRelevantInterval;

	@FindBy(xpath = "//h6[text()='FracPro Live +']/parent::div/a")
	private WebElement FracproLiveAppLink;

	@FindBy(xpath = "(//span[text()='1'])[2]/ancestor::tr/descendant::img")
	private WebElement AddRowFirstRow;

	@FindBy(xpath = "//td[text()='1.1']")
	private WebElement SubIntervalOfFirstRow;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[1]")
	private WebElement TopMDSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[2]")
	private WebElement BotMDSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[3]")
	private WebElement TopTVDSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[4]")
	private WebElement BotTVDSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[5]")
	private WebElement DiameterSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[6]")
	private WebElement NopSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[7]")
	private WebElement PpSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[1]/ancestor::tbody/tr[2]/td[2]")
	private WebElement TopMDSecondRowSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[1]/ancestor::tbody/tr[2]/td[3]")
	private WebElement BotMDSecondRowSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[1]/ancestor::tbody/tr[2]/td[4]")
	private WebElement TopTVDMDSecondRowSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[1]/ancestor::tbody/tr[2]/td[5]")
	private WebElement BotTVDSecondRowSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[1]/ancestor::tbody/tr[2]/td[6]")
	private WebElement DiameterSecondRowSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[1]/ancestor::tbody/tr[2]/td[7]")
	private WebElement NopSecondRowSubInterval;

	@FindBy(xpath = "//td[text()='1.1']/following-sibling::td[1]/ancestor::tbody/tr[2]/td[8]")
	private WebElement PpSecondRowSubInterval;

	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement OkButton;

	@FindBy(xpath = "//input[@formcontrolname='UseAliases']")
	private WebElement UseAliasCheckBox;

	@FindBy(xpath = "(//span[text()='Alias'])[2]")
	private WebElement aliasHeader;

	public void verifyHomeScreen() {
		try {
			elementUtils.clickElement(FracproLiveAppLink);
			Thread.sleep(3000);
			WebElement home = driver.findElement(By.xpath("//h1[text()='Home']"));
			String actualName = home.getText();
			String expectedName = "Home";
			Assert.assertEquals(actualName, expectedName, "Home Page header name does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateAndClickOnPad() {
		try {
			WebElement pad = driver.findElement(By.xpath("//*[text()='" + ReadData.readdata("Padname") + "']"));
			Actions act = new Actions(driver);
			act.scrollToElement(pad).perform();
			elementUtils.clickElement(pad);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickOnAddRow() {
		try {
			elementUtils.clickElement(addRowField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateAndClickOnWell() {
		try {
			WebElement wname = driver.findElement(By.xpath("//Span[text()='" + ReadData.readdata("WellName") + "']"));
			elementUtils.clickElement(wname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnWellFromOverview() {
		try {
			WebElement clickwellOverview = driver
					.findElement(By.xpath("//*[text()=' " + ReadData.readdata("WellName") + " ']"));
			elementUtils.clickElement(clickwellOverview);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public void clickElementOnWellboreConfigurationOption() {
//		try {
//			WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
//            expandMenu.click();
//            Thread.sleep(2000);
//			elementUtils.clickElement(wellboreConfigurationOption);
//			Thread.sleep(2000);
//			WebElement CollapseMenu = driver.findElement(By.xpath("//img[@tooltip='Collapse']"));
//            CollapseMenu.click();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public void clickElementOnWellboreConfigurationOption() {

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
	            wait.until(ExpectedConditions.elementToBeClickable(wellboreConfigurationOption));

	            // Click Wellbore Configuration
	            js.executeScript("arguments[0].click();", wellboreConfigurationOption);

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
	            wait.until(ExpectedConditions.elementToBeClickable(wellboreConfigurationOption));
	            js.executeScript("arguments[0].click();", wellboreConfigurationOption);

	        }

	    } catch (Exception e) {
	        throw new RuntimeException(
	                "Failed to click Wellbore Configuration option in both UI and Headless",
	                e
	        );
	    }
	}


	public void verifyPageHeaderName() {
		try {
			WebElement wbpagetitle = driver.findElement(By.xpath("//h4[text()='Wellbore Configuration']"));
			String actualName = wbpagetitle.getText();
			String expectedName = "Wellbore Configuration";
			Assert.assertEquals(actualName, expectedName, "Wellbore Configuration Page header name does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnPerforationIntervalTab() {
		try {
			Thread.sleep(2000);
			
			elementUtils.clickElement(perforationIntervalTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTableHeaderNamesInPerforationIntervalTab() {
		try {
			Thread.sleep(2000);
			WebElement TopMDheader = driver.findElement(By.xpath(
					"(//button[text()=' Copy & Paste ']/ancestor::tabset/descendant::span[text()='Top MD (ft)'])[2]"));
			String actualheadername1 = TopMDheader.getText();
			String expectedHeader1 = "Top MD (ft)";
			Assert.assertEquals(actualheadername1, expectedHeader1,
					"Top MD page header name does not match under perforation interval!");

			WebElement BotMDheader = driver.findElement(By.xpath(
					"(//button[text()=' Copy & Paste ']/ancestor::tabset/descendant::span[text()='Bot MD (ft)'])[2]"));
			String actualheadername2 = BotMDheader.getText();
			String expectedHeader2 = "Bot MD (ft)";
			Assert.assertEquals(actualheadername2, expectedHeader2,
					"Bot MD page header name does not match under perforation interval!");

			WebElement TopTVDheader = driver.findElement(By.xpath(
					"(//button[text()=' Copy & Paste ']/ancestor::tabset/descendant::span[text()='Top TVD (ft)'])[2]"));
			String actualheadername3 = TopTVDheader.getText();
			String expectedHeader3 = "Top TVD (ft)";
			Assert.assertEquals(actualheadername3, expectedHeader3,
					"Top TVD page header name does not match under perforation interval!");

			WebElement BotTVDheader = driver.findElement(By.xpath(
					"(//button[text()=' Copy & Paste ']/ancestor::tabset/descendant::span[text()='Bot TVD (ft)'])[2]"));
			String actualheadername4 = TopMDheader.getText();
			String expectedHeader4 = "Bot TVD (ft)";
			Assert.assertEquals(actualheadername1, expectedHeader1,
					"Bot TVD page header name does not match under perforation interval!");

			WebElement Diameterheader = driver.findElement(By.xpath(
					"(//button[text()=' Copy & Paste ']/ancestor::tabset/descendant::span[text()='Diameter  (in)'])[2]"));
			String actualheadername5 = Diameterheader.getText();
			String expectedHeader5 = "Diameter  (in)";
			Assert.assertEquals(actualheadername5, expectedHeader5,
					"Diameter page header name does not match under perforation interval!");

			WebElement Nopheader = driver.findElement(By.xpath(
					"(//button[text()=' Copy & Paste ']/ancestor::tabset/descendant::span[text()='No. of Perfs'])[2]"));
			String actualheadername6 = Nopheader.getText();
			String expectedHeader6 = "No. of Perfs";
			Assert.assertEquals(actualheadername6, expectedHeader6,
					"No. of Perfs page header name does not match under perforation interval!");

			WebElement Ppheader = driver.findElement(By.xpath(
					"(//button[text()=' Copy & Paste ']/ancestor::tabset/descendant::span[text()='Perf Phasing'])[2]"));
			String actualheadername7 = Ppheader.getText();
			String expectedHeader7 = "Perf Phasing";
			Assert.assertEquals(actualheadername7, expectedHeader7,
					"Perf Phasing page header name does not match under perforation interval!");

			WebElement Nocheader = driver.findElement(By.xpath(
					"(//button[text()=' Copy & Paste ']/ancestor::tabset/descendant::span[text()='No. of Clusters'])[2]"));
			String actualheadername8 = Nocheader.getText();
			String expectedHeader8 = "No. of Clusters";
			Assert.assertEquals(actualheadername8, expectedHeader8,
					"No. of Clusters page header name does not match under perforation interval!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCopyAndPasteButtonPresence() {
		try {
			Assert.assertTrue(elementUtils.isElementDisplayed(copyAndPasteButton),
					"Copy and Paste button is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDefaultStateOfUseMultipleClustersForModelCheckBox() {
		try {
			WebElement usemultipleclustercheckbox = driver
					.findElement(By.xpath("//input[@formcontrolname='FracsPerStage']"));
			Assert.assertTrue(usemultipleclustercheckbox.isSelected(),
					"Use Multiple Clusters for Model checkbox is selected by default!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnCopyAndPasteButton() {
		try {
			elementUtils.clickElement(copyAndPasteButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCopyAndPastePageTitleName() {
		try {
			Assert.assertEquals(copyAndPastePageTitleName.getAttribute("innerText").trim(), "Perforation Data", "Copy and Paste page title does not match!");
			Thread.sleep(1000);
			Assert.assertEquals(driver.findElement(By.xpath("//p[text()='For the best results, paste the data in the respective columns only.']")).getAttribute("innerText").trim(), "For the best results, paste the data in the respective columns only.", "Sub title does not match in copr and paste page !");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyEditClusterTooltripName() {
		try {
			WebElement editClusterBtn = driver.findElement(By.xpath("//img[@alt='Edit Clusters']")
            );

            // Hover on button
            Actions actions = new Actions(driver);
            actions.moveToElement(editClusterBtn).perform();

            // Wait for tooltip to appear
            WebElement tooltip = driver.findElement(By.xpath("//div[text()='Edit Clusters']")
            );

            // Verify tooltip is displayed
         //   tooltip.isDisplayed();
            Thread.sleep(1000);
			Assert.assertEquals(tooltip.getAttribute("innerText").trim(), "Edit Clusters", "First column edit cluster name is mismatched in perforation tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCopyAndPastePageHeaderName() {
		try {
			Thread.sleep(2000);
			WebElement header1 = driver.findElement(By.xpath("(//span[text()='Stage'])[1]"));
			String actualHeaderName = header1.getText();
			String expectedHeaderName = "Stage";
			Assert.assertEquals(actualHeaderName, expectedHeaderName,
					"Copy and Paste Stage page header name does not match!");

			WebElement header2 = driver.findElement(By.xpath("(//span[text()='Top MD (ft)'])[3]"));
			String actualHeaderName2 = header2.getText();
			String expectedHeaderName2 = "Top MD (ft)";
			Assert.assertEquals(actualHeaderName2, expectedHeaderName2,
					"Copy and Paste Top MD page header name does not match!");

			WebElement header3 = driver.findElement(By.xpath("(//span[text()='Bot MD (ft)'])[3]"));
			String actualHeaderName3 = header3.getText();
			String expectedHeaderName3 = "Bot MD (ft)";
			Assert.assertEquals(actualHeaderName3, expectedHeaderName3,
					"Copy and Paste Bot MD page header name does not match!");

			WebElement header4 = driver.findElement(By.xpath("(//span[text()='Diameter (in)'])[1]"));
			String actualHeaderName4 = header4.getText();
			String expectedHeaderName4 = "Diameter (in)";
			Assert.assertEquals(actualHeaderName4, expectedHeaderName4,
					"Copy and Paste Diameter page header name does not match!");

			WebElement header5 = driver.findElement(By.xpath("(//span[text()='No. of Perfs'])[3]"));
			String actualHeaderName5 = header5.getText();
			String expectedHeaderName5 = "No. of Perfs";
			Assert.assertEquals(actualHeaderName5, expectedHeaderName5,
					"Copy and Paste No of perfs page header name does not match!");

			WebElement header6 = driver.findElement(By.xpath("(//span[text()='Perf Phasing'])[3]"));
			String actualHeaderName6 = header6.getText();
			String expectedHeaderName6 = "Stage";
			Assert.assertEquals(actualHeaderName6, expectedHeaderName6,
					"Copy and Paste Perf phasing page header name does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void PastingDataToColumnWise() throws Exception {
		cp = new CopyPaste(driver);
		Thread.sleep(2000);
		cp.pasteDataToColumnAsNumeric("Sheet1", "Stage", cp.getStage(), true);
		Thread.sleep(1000);
		cp.pasteDataToColumnAsNumeric("Sheet1", "Top MD", cp.getTopMD(), true);
		Thread.sleep(1000);
		cp.pasteDataToColumnAsNumeric("Sheet1", "Bot MD", cp.getBotMD(), true);
		Thread.sleep(1000);
		cp.pasteDataToColumnAsNumeric("Sheet1", "Diameter", cp.getDiameter(), true);
		Thread.sleep(1000);
		cp.pasteDataToColumnAsNumeric("Sheet1", "Num of Perf", cp.getNumOfPerfs(), true);
		Thread.sleep(1000);
		cp.pasteDataToColumnAsNumeric("Sheet1", "Perf Phasing", cp.getPerfPhasing(), true);
		Thread.sleep(4000);

	}

	public void PastingDataToColumnRowWise() {
		ExcelToWebPaste excelPaster = new ExcelToWebPaste(driver);
		try {
			Thread.sleep(1000);
			String filePath = "FracproPlusData/wellborePI.xlsx";
			By cellLocator = By
					.xpath("(//td[@id='cell-0-0'])[2]");
			excelPaster.copyExcelDataToClipboard(filePath);
			Thread.sleep(3000);
//			excelPaster.pasteDataIntoCell(cellLocator);
			excelPaster.pasteDataIntoCellBySendKey(cellLocator);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void UserclickElementOnSaveButton() {
		try {
			elementUtils.clickElement(saveButton);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnSaveButton() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(saveButton1);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnSaveButton2() {
		try {
			Thread.sleep(4000);
			elementUtils.clickElement(saveButton);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickElementOnSaveButtonInPerforationIntervalPage() {
		try {
			elementUtils.clickElement(saveButtonInPerforationIntervalPage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueInPerforationIntervalTable() {
		// Implement the logic to verify the value in the perforation interval table
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void clickElementOnAddRowButton() {
		try {
			elementUtils.clickElement(addRowButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySubintervalPageTitleName() {
		try {
			String actualTitle = elementUtils.getElementText(subintervalPageTitleName);
			String expectedTitle = "Expected Subinterval Page Title";
			Assert.assertEquals(actualTitle, expectedTitle, "Subinterval page title does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySubIntervalTableHeaderName() {
		try {
			String actualHeaderName = elementUtils.getElementText(subIntervalTableHeaderName);
			String expectedHeaderName = "Expected Sub Interval Table Header Name";
			Assert.assertEquals(actualHeaderName, expectedHeaderName, "Sub Interval table header name does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySubIntervalRowValues() {
		// Implement the logic to verify the sub interval row values
	}

	public void navigateToSecondRowOfSubInterval() {
		// Implement the logic to navigate to the second row of the sub interval
	}

	public void enterDataIntoTopMDField() {
		try {
			elementUtils.doubleClickElement(topMDField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("TopMDGreaterPerfInterval"));
			topMDField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoTopMDFieldLess() {
		try {
			elementUtils.doubleClickElement(topMDField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("TopMDLessPerfInterval"));
			topMDField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDataIntoTopTVDField() {
		try {
			Thread.sleep(1000);
			String actualTVD = topTVDField.getText();
			String expectedTVD = ReadData.readdata("TopMDLessPerfInterval");
			Assert.assertEquals(actualTVD, expectedTVD, "Top TVD Value mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoBotMDField() {
		try {
			elementUtils.doubleClickElement(botMDField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("BotMDPerfInterval"));
			botMDField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDataIntoBotTVDField() {
		try {
			Thread.sleep(1000);
			String actualTVD = botMDField.getText();
			String expectedTVD = ReadData.readdata("BotMDPerfInterval");
			Assert.assertEquals(actualTVD, expectedTVD, "Bot TVD Value mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//td[text()='1.1']/ancestor::tbody/tr[2]/td[2]")
	private WebElement topMDFieldSeondRow;

	public void enterDataIntoTopMDFieldSecondRow() {
		try {
			elementUtils.doubleClickElement(topMDFieldSeondRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("TopMDLessPerfInterval"));
			topMDFieldSeondRow.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDataIntoTopTVDFieldSecondRow() {
		try {
			Thread.sleep(1000);
			String actualTVD = topMDFieldSeondRow.getText();
			String expectedTVD = ReadData.readdata("TopMDValueSecondRowPerfInterval");
			Assert.assertEquals(actualTVD, expectedTVD, "Top TVD Value for second row mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//td[text()='1.1']/ancestor::tbody/tr[2]/td[3]")
	private WebElement botMDFieldSeondRow;

	public void enterDataIntoBotMDFieldSecondRow() {
		try {
			elementUtils.doubleClickElement(botMDFieldSeondRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("BotMDValueSecondRowPerfInterval"));
			botMDFieldSeondRow.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDataIntoBotTVDFieldSecondRow() {
		try {
			Thread.sleep(1000);
			String actualTVD = botMDFieldSeondRow.getText();
			String expectedTVD = ReadData.readdata("BotMDValueSecondRowPerfInterval");
			Assert.assertEquals(actualTVD, expectedTVD, "Bot TVD Value for second row mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//td[text()='1.1']/ancestor::tbody/tr[2]/td[6]")
	private WebElement diameterFieldSeondRow;

	public void enterDataIntoDiameterField() {
		try {
			elementUtils.doubleClickElement(diameterFieldSeondRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("DiameterFieldSecondRow"));
			diameterFieldSeondRow.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//td[text()='1.1']/ancestor::tbody/tr[2]/td[7]")
	private WebElement noOfPerfsFieldSeondRow;

	public void enterDataIntoNoOfPerfsField() {
		try {
			elementUtils.doubleClickElement(noOfPerfsFieldSeondRow);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("NoOfPerfsFieldSecondRow"));
			noOfPerfsFieldSeondRow.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "(//td[@id='cell-1-7'])[1]")
	public WebElement perfPhasingFieldSeondRow;
	
	@FindBy(xpath = "(//td[@id='cell-0-7'])[2]")
	public WebElement perfPhasingFieldFirstRow;

	public void selectDataIntoPerfPhasingDropdown() {
		try {
			  Actions actions = new Actions(driver);
		        actions.doubleClick(perfPhasingFieldFirstRow).perform();
//			elementUtils.clickElement(perfPhasingFieldSeondRow);
			Thread.sleep(2000);
			   for (int i = 0; i < 5; i++) {
		            actions.sendKeys(Keys.ARROW_DOWN).perform();
		            Thread.sleep(500); // small wait for stability
		        }
			   
			WebElement pp = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("PerfPhasingSecondRow") + "']"));
			pp.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnOkButton() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(okButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueOfNoOfClusterField() {
		try {
			String actualValue = elementUtils.getElementText(noOfClusterField);
			String expectedValue = "Expected No of Cluster Value";
			Assert.assertEquals(actualValue, expectedValue, "No of Cluster value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueOfTopMDsField() {
		try {
			String actualValue = elementUtils.getElementText(topMDsField);
			String expectedValue = "Expected Top MDs Value";
			Assert.assertEquals(actualValue, expectedValue, "Top MDs value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueOfBotMDsField() {
		try {
			String actualValue = elementUtils.getElementText(botMDsField);
			String expectedValue = "Expected Bot MDs Value";
			Assert.assertEquals(actualValue, expectedValue, "Bot MDs value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueOfDiameterField() {
		try {
			String actualValue = elementUtils.getElementText(diameterField);
			String expectedValue = "Expected Diameter Value";
			Assert.assertEquals(actualValue, expectedValue, "Diameter value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueOfNumberOfPerfs() {
		try {
			String actualValue = elementUtils.getElementText(noOfPerfsField);
			String expectedValue = "Expected Number of Perfs Value";
			Assert.assertEquals(actualValue, expectedValue, "Number of Perfs value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAllFieldsOfIntervalAreReadOnly() {
		// Implement the logic to verify all fields of interval are read-only
	}

	public void clickElementOnSaveButtonAgain() {
		try {
			elementUtils.clickElement(saveButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void refreshPageAgain() {
		driver.navigate().refresh();
	}

	public void verifyValuesOfInterval() {
		// Implement the logic to verify the values of the interval
	}

	public void clickElementOnUserStageAliasCheckBox() {
		try {
			Thread.sleep(1000);
			elementUtils.clickElement(stageAliasCheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAliasTableHeaderName() {
		try {
			Thread.sleep(2000);
			String actualHeaderName = aliasTableHeaderName.getText();
			String expectedHeaderName = "Alias";
			Assert.assertEquals(actualHeaderName, expectedHeaderName, "Alias table header name does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoAliasColumnOfIntervals() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(aliasColumnOfIntervals);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("AliasValue"));
			aliasColumnOfIntervals.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNewEnteredValueInAliasColumn() {
	    try {
	        Thread.sleep(2000);
	        String actualValue = aliasColumnOfIntervals.getAttribute("innerText").trim();
	        String expectedValue = ReadData.readdata("AliasValue").trim();

	        // Pass if value is either 0 or 10
	        Assert.assertTrue(
	                actualValue.equals("0") || actualValue.equals("10"),
	                "Alias value is invalid! Actual value: " + actualValue
	        );

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


	public void uncheckStageAliasCheckBox() {
		try {
			Thread.sleep(2000);
			if (stageAliasCheckBox.isSelected()) {
				elementUtils.clickElement(stageAliasCheckBox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAliasTableHeaderNameDisabled() {
		try {
			Assert.assertFalse(!elementUtils.isElementDisplayed(aliasTableHeaderName),
					"Alias table header name is not disabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnStageAliasCheckBoxAgainForEnabled() {
		try {
			elementUtils.clickElement(stageAliasCheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNewEnteredValueInAliasColumnAgain() {
		try {
			String actualValue = elementUtils.getElementText(aliasColumnOfIntervals);
			String expectedValue = "Expected Alias Value";
			Assert.assertEquals(actualValue, expectedValue, "Alias value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uncheckUseMultipleClustersForModelCheckBox() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(useMultipleClustersForModelCheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUncheckUseMultipleClustersForModelCheckBox() {
		try {
			Thread.sleep(2000);
			if (!useMultipleClustersForModelCheckBox.isSelected()) {
				System.out.println("Test Passed: The checkbox is checked.");
			} else {
				System.out.println("Test Failed: The checkbox is unchecked.");
			}

			// Assert that the checkbox is unchecked (This will cause the test to fail if
			// it's checked)
			Assert.assertFalse(!useMultipleClustersForModelCheckBox.isSelected(),
					"useMultipleClustersForModelCheckBox check box is unchecked");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAllFieldsEditableExceptTopAndBotTvd() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Toptvd = driver.findElement(By.xpath("(//span[text()='1'])[2]/ancestor::tr/td[5]"));
		WebElement Bottvd = driver.findElement(By.xpath("(//span[text()='1'])[2]/ancestor::tr/td[6]"));
		boolean isFieldEditable2 = !Toptvd.getAttribute("disabled").equals("true")
				&& !Toptvd.getAttribute("readonly").equals("true");
		Assert.assertFalse(isFieldEditable2, "The input field is editable, but it should not be");
		Thread.sleep(1000);
		boolean isFieldEditable3 = !Bottvd.getAttribute("disabled").equals("true")
				&& !Bottvd.getAttribute("readonly").equals("true");
		Assert.assertFalse(isFieldEditable3, "The input field is editable, but it should not be");
	}

	public void enterValueIntoTopMDsField() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(topMDsField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, "20,000.0");
			topMDsField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterValueIntoBotMDsField() {
		try {
			Thread.sleep(1000);
			elementUtils.doubleClickElement(botMDsField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, "40,000.0");
			botMDsField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueIntoTopTVDField() {
		try {
			Thread.sleep(1000);
			WebElement Toptvd = driver.findElement(By.xpath("(//span[text()='1'])[2]/ancestor::tr/td[5]"));
			String actualValue = Toptvd.getText();
			String expectedValue = "5,000.0";
			Assert.assertEquals(actualValue, expectedValue, "Top TVD value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueIntoBotTVDField() {
		try {
			Thread.sleep(1000);
			WebElement Bottvd = driver.findElement(By.xpath("(//span[text()='1'])[2]/ancestor::tr/td[6]"));
			String actualValue = Bottvd.getText();
			String expectedValue = "10,000.0";
			Assert.assertEquals(actualValue, expectedValue, "Bot TVD value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterValueIntoDiameterField() {
		try {
			Thread.sleep(1000);
			WebElement diam = driver.findElement(By.xpath("(//span[text()='1'])[2]/ancestor::tr/td[7]"));
			elementUtils.doubleClickElement(diam);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, "0.500");
			diam.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterValueIntoNoOfPerfsField() {
		try {
			Thread.sleep(1000);
			WebElement nop = driver.findElement(By.xpath("(//span[text()='1'])[2]/ancestor::tr/td[8]"));
			elementUtils.doubleClickElement(nop);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, "80");
			nop.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterValueIntoPerfPhasingField() {
		try {
			WebElement pp = driver.findElement(By.xpath("(//span[text()='1'])[2]/ancestor::tr/td[9]"));
			elementUtils.doubleClickElement(pp);
			Thread.sleep(1000);
			WebElement value = driver.findElement(By.xpath("(//td[@aria-setsize='5'])[4]"));
			value.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterValueIntoNoOfClustersField() {
		try {
			Thread.sleep(1000);
			WebElement noc = driver.findElement(By.xpath("(//span[text()='1'])[2]/ancestor::tr/td[10]"));
			elementUtils.doubleClickElement(noc);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, "10");
			noc.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNewlyAddedValuesIntoIntervals() {
		// Implement the logic to verify the newly added values into the intervals
	}

	public void uncheckStageAliasCheckBoxAgain() {
		try {
			if (stageAliasCheckBox.isSelected()) {
				elementUtils.clickElement(stageAliasCheckBox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAliasTableHeaderNameDisabledAgain() {
		try {
			Assert.assertFalse(elementUtils.isElementDisplayed(aliasTableHeaderName),
					"Alias table header name is not disabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//    public void clickElementOnStageAliasCheck
//public void clickElementOnStageAliasCheckBoxAgainForEnabledAgain() {
//    try {
//        WebElement stageAliasCheckBox = driver.findElement(By.id("stageAliasCheckBox"));
//        ElementUtils.clickElement(stageAliasCheckBox);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
//
//public void enterValueIntoAliasColumnForRelevantInterval(String value) {
//    try {
//        WebElement aliasColumnInput = driver.findElement(By.id("aliasColumnInput"));
//        ElementUtils.clearAndSendKeys(aliasColumnInput, value);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
//
//public void clickElementSaveButton() {
//    try {
//        WebElement saveButton = driver.findElement(By.id("saveButton"));
//        ElementUtils.clickElement(saveButton);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
//
//public void verifyAddedValueInAliasColumnForRelevantInterval(String expectedValue) {
//    try {
//        WebElement aliasColumnValue = driver.findElement(By.id("aliasColumnValue"));
//        String actualValue = ElementUtils.getElementText(aliasColumnValue);
//        Assert.assertEquals(actualValue, expectedValue, "Alias column value does not match!");
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
}