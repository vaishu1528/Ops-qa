package com.FracProPlus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

public class SurfaceLineAndTubingPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public SurfaceLineAndTubingPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Home']")
	private WebElement homeScreen;
	
	@FindBy(xpath = "//*[text()='FracPro Live +']/parent::div/a")
	private WebElement GoToLiveApplication;
	
	@FindBy(id = "pad")
	private WebElement pad;

	@FindBy(xpath = "//td[@id='cell-1-0']")
    private WebElement lengthFieldForSecondRow;
	
	@FindBy(xpath = "//td[@id='cell-0-1']")
    private WebElement topMdField;
    
    @FindBy(xpath = "//td[@id='cell-1-1']")
    private WebElement topMdFieldForSecondRow;

    @FindBy(xpath = "//td[@id='cell-0-2']")
    private WebElement botMdField;
    
    @FindBy(xpath = "//td[@id='cell-1-2']")
    private WebElement botMdFieldForSecondRow;

    @FindBy(xpath = "//button[text()=' Save ']")
    private WebElement saveButton;

    @FindBy(xpath = "//p[text()=' Top MD cannot be greater than Bottom MD! ']")
    private WebElement errorMessage;

    @FindBy(xpath = "//td[@id='cell-0-1']")
    private WebElement casingField;

    @FindBy(xpath = "//td[@id='cell-0-7']")
    private WebElement gradeField;

    @FindBy(xpath = "//td[@id='cell-0-4']")
    private WebElement odFieldDropdown;
    
    @FindBy(xpath = "//td[@id='cell-1-4']")
    private WebElement odFieldDropdownForSecondRow;

    @FindBy(xpath = "//td[@id='cell-0-5']")
    private WebElement weightFieldDropdown;
    
    @FindBy(xpath = "//td[@id='cell-1-5']")
    private WebElement weightFieldDropdownForSecondRow;

    @FindBy(xpath = "//td[@id='cell-0-6']")
    private WebElement idField;
    
    @FindBy(xpath = "//td[@id='cell-1-6']")
    private WebElement idFieldForSecondRow;

    @FindBy(xpath = "//td[@id='cell-0-0']")
    private WebElement lengthFieldFirstRow;
    
    @FindBy(xpath = "//td[@id='cell-1-0']")
    private WebElement lengthFieldSecondRow;

    @FindBy(xpath = "(//select[@class='form-select ng-untouched ng-pristine ng-valid'])[1]")
    private WebElement injectionIsDownDropdown;
    
	@FindBy(xpath = "//*[text()=' Wellbore Configuration ']")
	private WebElement wellboreConfiguration;

	@FindBy(xpath = "//h4[text()=' Wellbore Configuration ']")
	private WebElement pageHeader;

	@FindBy(xpath = "//*[text()='Surface Line/Tubing']")
	private WebElement surfaceLineAndTubingTab;

	@FindBy(xpath = "//h4[text()=' Wellbore Configuration ']")
	private WebElement tablePageHeader;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[2]")
	private WebElement topMDInputField;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[3]")
	private WebElement botMDInputField;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[4]")
	private WebElement surfLineAndTubingDefaultValue;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[5]")
	private WebElement odInputField;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[6]")
	private WebElement weightInputField;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[7]")
	private WebElement idInputField;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[1]")
	private WebElement lengthField;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[4]")
	private WebElement surfLineDropdown;

	@FindBy(xpath = "(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='1'])[1]/ancestor::th/following-sibling::td[5]")
	private WebElement odDropdownField;

	@FindBy(xpath = "//div[text()='Insert row above']")
	private WebElement insertRowBelow;

	@FindBy(xpath = "//div[text()='Insert row above']")
	private WebElement insertRowAbove;

	@FindBy(xpath = "//div[text()='Remove row']")
	private WebElement removeRow;
	

	@FindBy(xpath = "//label[text()=' Compute ']/parent::div/ng-select")
	private WebElement computeDropdown;

	public void verifyUserIsOnHomeScreen() {
		try {
			elementUtils.clickElement(GoToLiveApplication);
			Thread.sleep(3000);
			driver.getTitle();
			//Assert.assertTrue(elementUtils.isElementDisplayed(homeScreen), "User is not on Home Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateAndClickOnPad() {
		try {
			WebElement pad= driver.findElement(By.xpath("//*[text()='"+ReadData.readdata("Padname")+"']"));
			Actions act=new Actions(driver);
			act.scrollToElement(pad).perform();
			elementUtils.clickElement(pad);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void navigateAndClickOnWell() {
		try {
			WebElement wname=driver.findElement(By.xpath("//Span[text()='"+ReadData.readdata("WellName")+"']"));
			elementUtils.clickElement(wname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnWellFromOverview() {
		try {
			WebElement clickwellOverview= driver.findElement(By.xpath("//*[text()=' "+ReadData.readdata("WellName")+" ']"));
			elementUtils.clickElement(clickwellOverview);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnWellboreConfigurationOption() {
		try {
			elementUtils.clickElement(wellboreConfiguration);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPageHeaderName() {
		try {
			String actualHeader = elementUtils.getElementText(pageHeader);
			String expectedHeader = "Wellbore Configuration";
			Assert.assertEquals(actualHeader, expectedHeader, "Page header name does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOnSurfaceLineAndTubingTab() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(surfaceLineAndTubingTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTablePageHeader() {
		try {
			Thread.sleep(2000);
			
			WebElement lengthheader=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Length (ft)'])[2]"));
			String actualheadername1=lengthheader.getText();
			String expectedHeader1 = "Length (ft)";
			Assert.assertEquals(actualheadername1, expectedHeader1, "Length Table page header does not match!");
			
			WebElement header3=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Top MD (ft)'])[2]"));
			String actualheadername3=header3.getText();
			String expectedHeader3 = "Top MD (ft)";
			Assert.assertEquals(actualheadername3, expectedHeader3, "Top MD Table page header does not match!");
			
			WebElement header4=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Bot MD (ft)'])[2]"));
			String actualheadername4=header4.getText();
			String expectedHeader4 = "Bot MD (ft)";
			Assert.assertEquals(actualheadername4, expectedHeader4, "Bot MD Table page header does not match!");
			
			WebElement header5=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Surf Line/Tubing'])[2]"));
			String actualheadername5=header5.getText();
			String expectedHeader5 = "Surf Line/Tubing";
			Assert.assertEquals(actualheadername5, expectedHeader5, "Surf Line/Tubing Table page header does not match!");
			
			WebElement header6=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='OD(in)'])[2]"));
			String actualheadername6=header6.getText();
			String expectedHeader6 = "OD(in)";
			Assert.assertEquals(actualheadername6, expectedHeader6, "OD Table page header does not match!");
			
			WebElement header7=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Weight (lb/ft)'])[2]"));
			String actualheadername7=header7.getText();
			String expectedHeader7 = "Weight (lb/ft)";
			Assert.assertEquals(actualheadername7, expectedHeader7, "Weight Table page header does not match!");
			
			WebElement header8=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='ID (in)'])[2]"));
			String actualheadername8=header8.getText();
			String expectedHeader8 = "ID (in)";
			Assert.assertEquals(actualheadername8, expectedHeader8, "ID Table page header does not match!");
			
			WebElement header9=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Grade'])[2]"));
			String actualheadername9=header9.getText();
			String expectedHeader9 = "Grade";
			Assert.assertEquals(actualheadername9, expectedHeader9, "Grade Table page header does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoTopMDInputField() {
		try {
			elementUtils.doubleClickElement(topMdField);
        	WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("TopMDValueSurfAndTubing"));
			botMdField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyBotMdFieldAutoUpdatedInSurfAndTubing() {
        try {
        	Thread.sleep(2000);
			String actualValue = botMdField.getText();
			String expectedValue = ReadData.readdata("TopMDValueSurfAndTubing");
			Assert.assertEquals(actualValue, expectedValue, "Bot MD field is not auto-updated from Top MD");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public void verifylessBotMdFieldAutoUpdatedInSurfAndTubing() {
        try {
        	Thread.sleep(2000);
			elementUtils.doubleClickElement(botMdField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("SLTBotMDLess"));
			botMdField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
	
	public void enterDataLessThanTopMdIntoBotMdFieldFor() {
        try {
        	Thread.sleep(2000);
			elementUtils.doubleClickElement(botMdField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("CasingBotMDLess"));
			botMdField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public void enterDataIntoBotMDInputField() {
		try {
			elementUtils.doubleClickElement(botMdField);
			WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("BotMDValueSurfAndTubing"));
			botMdField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySurfLineAndTubingDefaultValue() {
		try {
			
			WebElement byDefaultValueSLT = driver
					.findElement(By.xpath("//td[@id='cell-0-3']"));
			String actualOption5 = byDefaultValueSLT.getText().trim().replace("▼", "").trim();
			String expectedOption5 = "Tubing";
			Assert.assertEquals(actualOption5, expectedOption5, "Default option for Surf line / tubing does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifySurfLineAndTubingDefaultValueForSecondRow() {
		try {
			
			WebElement byDefaultValueSLT2 = driver
					.findElement(By.xpath("//td[@id='cell-1-3']"));
			String actualOption5 = byDefaultValueSLT2.getText().trim().replace("▼", "").trim();
			String expectedOption5 = ReadData.readdata("SurfLineAndTubingDropValue");
			Assert.assertEquals(actualOption5, expectedOption5, "Default option for Surf line / tubing does not match for surface line!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectValueFromOdInputField() {
		try {
//			   elementUtils.clickElement(odFieldDropdown);
			   Actions actions = new Actions(driver);
		        actions.doubleClick(odFieldDropdown).perform();
			Thread.sleep(2000);
            WebElement OD2=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("ODDropodownSurfLineAndTubing")+"']"));
            OD2.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectValueFromWeightInputField() {
		try {
			 Actions actions = new Actions(driver);
		        actions.doubleClick(weightFieldDropdown).perform();
//			 elementUtils.clickElement(weightFieldDropdown);
			 Thread.sleep(1000);
             WebElement Weight1=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("WeightDropdownSurfLineAndTubing")+"']"));
             Weight1.click();
             
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValuesOfIDInputField() {
		try {
			
			WebElement IdfieldSLT=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("IDDropdownValueForSurfLineAndTubing")+"']"));
            String actualValue7 = IdfieldSLT.getText();;
            String expectedValue7 = ReadData.readdata("IDDropdownValueForSurfLineAndTubing");
            Assert.assertEquals(actualValue7, expectedValue7, "ID field value does not match!");
            
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyByDefaultValueOfGradeField() {
		try {
			String actualValue = elementUtils.getElementText(gradeField);
			String expectedValue = "Expected Grade Value";
			Assert.assertEquals(actualValue, expectedValue, "Grade field default value does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueOfLengthField() {
		try {
			WebElement SLTLengthFirstRow=driver.findElement(By.xpath("//td[@id='cell-0-0']"));
            String actualValue2 = SLTLengthFirstRow.getText();
            String expectedValue2 = ReadData.readdata("LengthValueSurfAndTubing");
            Assert.assertEquals(actualValue2, expectedValue2, "Length field value of first row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyValueOfLengthFieldForSecondRow() {
		try {
			WebElement SLTLengthSecondRow=driver.findElement(By.xpath("//td[@id='cell-1-0']"));
            String actualValue2 = SLTLengthSecondRow.getText();
            String expectedValue2 = ReadData.readdata("LengthValueSurfAndTubingSecondRow");
            Assert.assertEquals(actualValue2, expectedValue2, "Length field value of second row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyValueOfTopMDFieldForfirstRow() {
		try {
			WebElement SLTTopMDFirstRow=driver.findElement(By.xpath("//td[@id='cell-0-1']"));
            String actualValue2 = SLTTopMDFirstRow.getText();
            String expectedValue2 = ReadData.readdata("TopMDValueSurfAndTubing");
            Assert.assertEquals(actualValue2, expectedValue2, "Top MD field value of first row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyValueOfTopMDFieldForSecondRow() {
		try {
			WebElement SLTTopMDSecondRow=driver.findElement(By.xpath("//td[@id='cell-1-1']"));
            String actualValue2 = SLTTopMDSecondRow.getText();
            String expectedValue2 = ReadData.readdata("TopMDValueSurfAndTubingSecondRowINC");
            Assert.assertEquals(actualValue2, expectedValue2, "Top MD field value of second row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyValueOfBotMDFieldForfirstRow() {
		try {
			WebElement SLTBotMDFirstRow=driver.findElement(By.xpath("//td[@id='cell-0-2']"));
            String actualValue3 = SLTBotMDFirstRow.getText();
            String expectedValue3 = ReadData.readdata("BotMDValueSurfAndTubing");
            Assert.assertEquals(actualValue3, expectedValue3, "Bot MD field value of first row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyValueOfODFieldForfirstRow() {
		try {
			WebElement SLTODFirstRow=driver.findElement(By.xpath("//td[@id='cell-0-4']"));
            String actualValue3 = SLTODFirstRow.getText().trim().replace("▼", "").trim();
            String expectedValue3 = ReadData.readdata("ODDropodownSurfLineAndTubing");
            Assert.assertEquals(actualValue3, expectedValue3, "OD field value of first row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyValueOfODFieldForSecondRow() {
		try {
			WebElement SLTODSecondRow=driver.findElement(By.xpath("//td[@id='cell-1-4']"));
            String actualValue3 = SLTODSecondRow.getText().trim().replace("▼", "").trim();
            String expectedValue3 = ReadData.readdata("ODValueSLTSecondRow");
            Assert.assertEquals(actualValue3, expectedValue3, "OD field value of second row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyValueOfWeightFieldForfirstRow() {
		try {
			WebElement SLTWeightFirstRow=driver.findElement(By.xpath("//td[@id='cell-0-5']"));
            String actualValue7 = SLTWeightFirstRow.getText().trim().replace("▼", "").trim();
            String expectedValue7 = ReadData.readdata("WeightDropdownSurfLineAndTubing");
            Assert.assertEquals(actualValue7, expectedValue7, "Weight field value of first row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyValueOfWeightFieldForSecondRow() {
		try {
			WebElement SLTWeightSecondRow=driver.findElement(By.xpath("//td[@id='cell-1-5']"));
            String actualValue7 = SLTWeightSecondRow.getText().trim().replace("▼", "").trim();
            String expectedValue7 = ReadData.readdata("weightFieldDropdownForSecondRow");
            Assert.assertEquals(actualValue7, expectedValue7, "Weight field value of second row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyValueOfIDFieldForfirstRow() {
		try {
			WebElement SLTIDFirstRow=driver.findElement(By.xpath("//td[@id='cell-0-6']"));
            String actualValue3 = SLTIDFirstRow.getText();
            String expectedValue3 = ReadData.readdata("IDDropdownValueForSurfLineAndTubing");
            Assert.assertEquals(actualValue3, expectedValue3, "ID field value of first row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyValueOfIDFieldForSecondRow() {
		try {
			WebElement SLTIDSecondRow=driver.findElement(By.xpath("//td[@id='cell-1-6']"));
            String actualValue3 = SLTIDSecondRow.getText();
            String expectedValue3 = ReadData.readdata("IDValueSLTSecondRow");
            Assert.assertEquals(actualValue3, expectedValue3, "ID field value of second row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 public void verifyDefaultSelectionOptionInGradeField() {
	        try {
	        	WebElement byDefaultValueGrade = driver
						.findElement(By.xpath("//td[@id='cell-0-7']"));
				String actualOption = byDefaultValueGrade.getText().trim().replace("▼", "").trim();
				String expectedOption = "Unspec";
				Assert.assertEquals(actualOption, expectedOption, "Default option for Grade does not match!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public void verifyDefaultSelectionOptionInGradeFieldforSLT() {
	        try {
	        	WebElement byDefaultValueGradeForSecondRow = driver
						.findElement(By.xpath("//td[@id='cell-1-7']"));
				String actualOption = byDefaultValueGradeForSecondRow.getText().trim().replace("▼", "").trim();
				String expectedOption = ReadData.readdata("SLTGradeDropDownValueSecondRow");
				Assert.assertEquals(actualOption, expectedOption, "Default option for grade does not match!");
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

	public void userEnterValueIntoTopMDInputField() {
		try {
			elementUtils.doubleClickElement(topMdFieldForSecondRow);
        	WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("TopMDValueSurfAndTubingSecondRow"));
			botMdField.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			WebElement SLTTopMDSecondRow=driver.findElement(By.xpath("//td[@id='cell-1-1']"));
            String actualValue2 = SLTTopMDSecondRow.getText();
            String expectedValue2 = ReadData.readdata("TopMDValueSurfAndTubingSecondRow");
            Assert.assertEquals(actualValue2, expectedValue2, "Top MD field value of second row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void userEnterValueIntoLengthInputField() {
		try {
			Thread.sleep(2000);
			elementUtils.doubleClickElement(lengthFieldForSecondRow);
        	WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("LengthValueSurfAndTubingSecondRow"));
			botMdField.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			WebElement SLTLengthSecondRow=driver.findElement(By.xpath("//td[@id='cell-1-0']"));
            String actualValue2 = SLTLengthSecondRow.getText();
            String expectedValue2 = ReadData.readdata("LengthValueSurfAndTubingSecondRow");
            Assert.assertEquals(actualValue2, expectedValue2, "Length field value of second row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userEnterValueIntoBotMDInputField() {
		try {
			WebElement SLTBotMDFirstRow=driver.findElement(By.xpath("//td[@id='cell-1-2']"));
            String actualValue3 = SLTBotMDFirstRow.getText();
            String expectedValue3 = ReadData.readdata("BotMDValueSurfAndTubingSecondRow");
            Assert.assertEquals(actualValue3, expectedValue3, "Bot MD field value of second row does not match for surf line and tubing tab!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectOptionFromComputeDropdown() {
		try {
			Actions act = new Actions(driver);
			act.scrollToElement(computeDropdown).perform();
			elementUtils.clickElement(computeDropdown);
			Thread.sleep(2000);
			WebElement top=driver.findElement(By.xpath("//div[text()=' Top MD ']"));
			elementUtils.clickElement(top);
//			elementUtils.selectOptionInDropdown(computeDropdown, "Top MD");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAllValuesOfSurfLineAndTubingDropdown() {
		try {
			WebElement byDefaultValueSLT = driver
					.findElement(By.xpath("//td[@id='cell-1-3']"));
			String actualOptionSLT = byDefaultValueSLT.getText().trim().replace("▼", "").trim();
			String expectedOptionSLT = ReadData.readdata("SurfLineAndTubingDropValue");
			Assert.assertEquals(actualOptionSLT, expectedOptionSLT, "Default option for casing does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userSelectValueFromSurfLineDropdown() {
		try {
			elementUtils.clickElement(surfLineDropdown);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAllValuesOfODDropdownField() {
		try {
			Thread.sleep(2000);
			 Actions actions = new Actions(driver);
		        actions.doubleClick(odFieldDropdownForSecondRow).perform();
//        	elementUtils.clickElement(odFieldDropdownForSecondRow);
        	WebElement Textarea1 = driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[2]"));
        	elementUtils.clearAndSendKeys(Textarea1, ReadData.readdata("ODValueSLTSecondRow"));
			odFieldDropdownForSecondRow.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userSelectValueFromOdInputField() {
		try {
			elementUtils.clickElement(odInputField);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userSelectValueFromWeightInputField() {
		try {
			Thread.sleep(2000);
			Actions actions = new Actions(driver);
	        actions.doubleClick(weightFieldDropdownForSecondRow).perform();
//        	elementUtils.clickElement(weightFieldDropdownForSecondRow);
        	WebElement Textarea1 = driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[2]"));
        	elementUtils.clearAndSendKeys(Textarea1, ReadData.readdata("weightFieldDropdownForSecondRow"));
        	weightFieldDropdownForSecondRow.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userEnterValueIntoIDInputField() {
		try {
			Thread.sleep(2000);
        	elementUtils.doubleClickElement(idFieldForSecondRow);
        	WebElement Textarea6 = driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[1]"));
        	elementUtils.clearAndSendKeys(Textarea6, ReadData.readdata("IDValueSLTSecondRow"));
        	idFieldForSecondRow.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectValueFromGradeFieldDropdown() {
		try {
			WebElement byDefaultValueGradeForSecondRow = driver
					.findElement(By.xpath("//td[@id='cell-1-7']"));
        	elementUtils.doubleClickElement(byDefaultValueGradeForSecondRow);
        	Thread.sleep(2000);
        	WebElement CasingDropValue=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("SLTGradeDropDownValueSecondRow")+"']")); 
        	CasingDropValue.click();
        	Thread.sleep(1000);
			String actualOption = byDefaultValueGradeForSecondRow.getText().trim().replace("▼", "").trim();
			String expectedOption = ReadData.readdata("SLTGradeDropDownValueSecondRow");
			Assert.assertEquals(actualOption, expectedOption, "Default option for grade does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userPerformRightClickActionOnTable() {
		try {
			// Implement logic to perform right click action on the table
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectInsertRowBelowOption() {
		try {
			elementUtils.clickElement(insertRowBelow);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userClickOnInsertRowAboveOption() {
		try {
			elementUtils.clickElement(insertRowAbove);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void userSelectRemoveRowOption() {
		try {
			elementUtils.clickElement(removeRow);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoTopMDAndBotMDField() {
		try {
			elementUtils.clearAndSendKeys(topMDInputField, "Top MD Data");
			elementUtils.clearAndSendKeys(botMDInputField, "Bot MD Data");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAutomaticallyNewAddedRow() {
		try {
			// Implement logic to verify the automatically new added row
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
}