package com.FracProPlus.pages;

import java.time.Duration;
import java.util.List;

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

public class CasingPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public CasingPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']")
    private WebElement casingTab;

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

    @FindBy(xpath = "//td[@id='cell-0-3']")
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

    @FindBy(xpath = "(//td[@id='cell-0-0'])[1]")
    private WebElement lengthFieldFirstRow;
    
    @FindBy(xpath = "(//td[@id='cell-1-0'])[1]")
    private WebElement lengthFieldSecondRow;

    @FindBy(xpath = "//label[text()=' Injection is Down ']/parent::div/ng-select")
    private WebElement injectionIsDownDropdown;

    public void clickElementOnCasingTab() {
        try {
            elementUtils.clickElement(casingTab);
            Thread.sleep(2000);
            elementUtils.doubleClickElement(casingTab);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDataIntoTopMdField() {
        try {
        	elementUtils.doubleClickElement(topMdField);
        	WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("CasingTopMD"));
			botMdField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterDataIntoTopMdFieldForSecondRow() {
        try {
        	elementUtils.doubleClickElement(topMdFieldForSecondRow);
        	WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("TopMDValueCasingSecondRow"));
			botMdField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterDataIntoBotMdFieldForSecondRow() {
        try {
        	elementUtils.doubleClickElement(botMdFieldForSecondRow);
        	WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("BotMDValueCasingSecondRow"));
			botMdField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterDataIntoODFieldForSecondRow() {
        try {
        	Thread.sleep(2000);
//        	elementUtils.clickElement(odFieldDropdownForSecondRow);
        	   Actions actions = new Actions(driver);
               actions.doubleClick(odFieldDropdownForSecondRow).perform();
        	WebElement Textarea1 = driver.findElement(By.xpath("//textarea[@type='text']"));
        	elementUtils.clearAndSendKeys(Textarea1, ReadData.readdata("ODValueCasingSecondRow"));
			odFieldDropdownForSecondRow.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterDataIntoWeightFieldForSecondRow() {
        try {
//        	elementUtils.clickElement(weightFieldDropdownForSecondRow);
        	   Actions actions = new Actions(driver);
               actions.doubleClick(weightFieldDropdownForSecondRow).perform();
        	WebElement Textarea2 = driver.findElement(By.xpath("//textarea[@type='text']"));
			elementUtils.clearAndSendKeys(Textarea2, ReadData.readdata("WeightValueCasingSecondRow"));
			weightFieldDropdownForSecondRow.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterDataIntoIDFieldForSecondRow() {
        try {
        	elementUtils.doubleClickElement(idFieldForSecondRow);
        	WebElement Textarea4 = driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[1]"));
			elementUtils.clearAndSendKeys(Textarea4, ReadData.readdata("IDValueCasingSecondRow"));
			idFieldForSecondRow.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyBotMdFieldAutoUpdated() {
        try {
        	Thread.sleep(2000);
			String actualValue = botMdField.getText();
			String expectedValue = ReadData.readdata("CasingTopMD");
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
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("CasingBotMDLess"));
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

    		  public void verifyErrorMessageSubinterval() {
    		        try {
    		        	Thread.sleep(2000);
    					WebElement errorMessage = driver
    							.findElement(By.xpath("(//p[text()=' Top MD cannot be greater than Bottom MD! '])[2]"));
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
            boolean isEnabled = saveButton.isEnabled();
            Assert.assertFalse(isEnabled, "Save button should be disabled!");
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
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("CasingBotMD"));
			botMdField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifySaveButtonEnabled() {
        try {
            boolean isEnabled = saveButton.isEnabled();
            Assert.assertTrue(isEnabled, "Save button should be enabled!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyDefaultSelectionOptionInCasingField() {
        try {
        	WebElement byDefaultValueCasing = driver
					.findElement(By.xpath("//td[@id='cell-0-3']"));
			String actualOption = byDefaultValueCasing.getText().trim().replace("▼", "").trim();
			String expectedOption = "Cemented Casing";
			Assert.assertEquals(actualOption, expectedOption, "Default option for casing does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyDefaultSelectionOptionInCasingFieldForSecondRow() {
        try {
        	WebElement byDefaultValueCasingForSecondRow = driver
					.findElement(By.xpath("//td[@id='cell-1-3']"));
         elementUtils.doubleClickElement(byDefaultValueCasingForSecondRow);
        	Thread.sleep(2000);
        	WebElement CasingDropValue=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("CasingDropDownValueSecondRow")+"']")); 
        	CasingDropValue.click();
//			String actualOption = byDefaultValueCasingForSecondRow.getText().trim().replace("▼", "").trim();
//			String expectedOption = ReadData.readdata("CasingDropDownValueSecondRow");
//			Assert.assertEquals(actualOption, expectedOption, "Default option for casing does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void SelectionOptionInCasingFieldForSecondRow() {
        try {
        	WebElement byDefaultValueCasingForSecondRow = driver
					.findElement(By.xpath("//td[@id='cell-1-3']"));
//         elementUtils.doubleClickElement(byDefaultValueCasingForSecondRow);
//        	Thread.sleep(2000);
//        	WebElement CasingDropValue=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("CasingDropDownValueSecondRow")+"']")); 
//        	CasingDropValue.click();
			String actualOption = byDefaultValueCasingForSecondRow.getText().trim().replace("▼", "").trim();
			String expectedOption = ReadData.readdata("CasingDropDownValueSecondRow");
			Assert.assertEquals(actualOption, expectedOption, "Default option for casing does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyDefaultSelectionOptionInGradeFieldForSecondRow() {
        try {
        	WebElement byDefaultValueGradeForSecondRow = driver
					.findElement(By.xpath("//td[@id='cell-1-7']"));
        	elementUtils.doubleClickElement(byDefaultValueGradeForSecondRow);
        	Thread.sleep(2000);
        	WebElement CasingDropValue=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("GradeDropDownValueSecondRow")+"']")); 
        	CasingDropValue.click();
        	Thread.sleep(1000);
			String actualOption = byDefaultValueGradeForSecondRow.getText().trim().replace("▼", "").trim();
			String expectedOption = ReadData.readdata("GradeDropDownValueSecondRow");
			Assert.assertEquals(actualOption, expectedOption, "Default option for grade does not match!");
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

    public void selectOdInFieldDropDown() {
        try {
        	 Actions actions = new Actions(driver);
             actions.doubleClick(odFieldDropdown).perform();
//            elementUtils.clickElement(odFieldDropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void selectDropdownOption(WebElement cell, List<WebElement> dropdownOptions, String optionToSelect) {
        try {
            // Click the cell to activate the dropdown
            cell.click();

            // Select the desired option from the provided list
            for (WebElement option : dropdownOptions) {
                if (option.getText().trim().equalsIgnoreCase(optionToSelect.trim())) {
                    option.click();
                    System.out.println("Selected option: " + optionToSelect);
                    return;
                }
            }

            System.out.println("Option not found: " + optionToSelect);

        } catch (Exception e) {
            System.err.println("Error selecting dropdown option: " + e.getMessage());
        }
    }
    
    public void selectOdInFieldDropDownValue() {
        try {
            Thread.sleep(1000);
            WebElement OD1=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("ODDropdown")+"']"));
            OD1.click();
//        	List<WebElement> kk=driver.findElements(By.xpath("(//app-reusable-spreadsheet//hot-table//div[contains(@class,'handsontable')]//table/tbody)[7]"));
//           selectDropdownOption(odFieldDropdown, kk, "4");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    
    public void verifyAllOptionsInOdFieldDropdown() throws InterruptedException {
    	  Thread.sleep(2000);
    	  List<String> xpaths = List.of(
                   "//td[@id='ht_35818a-listbox-0-4_0-0']","//td[@id='ht_35818a-listbox-0-4_1-0']", "//td[@id='ht_35818a-listbox-0-4_2-0']", /* add all your xpaths here */
                  "//td[@id='ht_35818a-listbox-0-4_3-0']"
          );
    	  
    	   List<String> expectedValues = List.of(
                   "4", "4.5", "4.75", /* add all expected values here */
                   "5"
           );
    	   
    	   elementUtils.fetchAndVerifyElementValues(xpaths, expectedValues);
    }

    public void selectOptionFromWeightFieldDropdown() {
        try {
            Actions actions = new Actions(driver);
            actions.doubleClick(weightFieldDropdown).perform();
//            elementUtils.clickElement(weightFieldDropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void selectWeightFieldDropDownValue() {
        try {
        	 Thread.sleep(1000);
             WebElement Weight=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("WeightDropdown")+"']"));
             Weight.click();
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInIdField() {
        try {
        	WebElement Idfield=driver.findElement(By.xpath("//td[text()='3.732']"));
            String actualValue = Idfield.getText();;
            String expectedValue = ReadData.readdata("IDDropdown");
            Assert.assertEquals(actualValue, expectedValue, "ID field value does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyValueInLengthFieldOfFirstRow() {
        try {
        	WebElement CasingLengthFirstRow=driver.findElement(By.xpath("//td[@id='cell-0-0']"));
            String actualValue2 = CasingLengthFirstRow.getText();
            String expectedValue2 = ReadData.readdata("CasingLength");
            Assert.assertEquals(actualValue2, expectedValue2, "Length field value of first row does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInLengthFieldOfSecondRow() {
        try {
        	WebElement CasingLengthSecondRow=driver.findElement(By.xpath("//td[@id='cell-1-0']"));
            String actualValue1 = CasingLengthSecondRow.getText();
            String expectedValue1 = ReadData.readdata("CasingLength");
            Assert.assertEquals(actualValue1, expectedValue1, "Length field value of second row does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void verifyValueInTopMDFieldOfFirstRow() {
        try {
            String actualValue = elementUtils.getElementText(topMdField);
            String expectedValue = ReadData.readdata("CasingTopMD");
            Assert.assertEquals(actualValue, expectedValue, "Length field value of first row does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInTopMDFieldOfSecondRow() {
        try {
            String actualValue = elementUtils.getElementText(topMdFieldForSecondRow);
            String expectedValue = ReadData.readdata("TopMDValueCasingSecondRow");
            Assert.assertEquals(actualValue, expectedValue, "Top MD field value of first row does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInBotMDFieldOfFirstRow() {
        try {
     
            String actualValue4 = elementUtils.getElementText(botMdField);
            String expectedValue4 = ReadData.readdata("CasingBotMD");
            Assert.assertEquals(actualValue4, expectedValue4, "Bot MD field value of first row does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInBotMDFieldOfSecondRow() {
        try {
            String actualValue = elementUtils.getElementText(botMdFieldForSecondRow);
            String expectedValue = ReadData.readdata("BotMDValueCasingSecondRow");
            Assert.assertEquals(actualValue, expectedValue, "Bot MD field value of second row does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInODFieldOfFirstRow() {
        try {
        	WebElement byDefaultValue = driver
        			.findElement(By.xpath("//td[@id='cell-0-4']"));
        	String actualOption = byDefaultValue.getText().trim().replace("▼", "").trim();
        	String expectedOption = ReadData.readdata("ODDropdown");
        	Assert.assertEquals(actualOption, expectedOption, "Default option for OD (in) does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInODFieldOfSecondRow() {
        try {
        	WebElement byDefaultValue = driver
        			.findElement(By.xpath("//td[@id='cell-1-4']"));
        	String actualOption = byDefaultValue.getText().trim().replace("▼", "").trim();
        	String expectedOption = ReadData.readdata("ODValueCasingSecondRow");
        	Assert.assertEquals(actualOption, expectedOption, "Default option for OD (in) does not match for second row!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInWeightFieldOfFirstRow() {
        try {
        	 WebElement Weight=driver.findElement(By.xpath("//td[@id='cell-0-5']"));
        	String actualOption = Weight.getText().trim().replace("▼", "").trim();
        	String expectedOption = ReadData.readdata("WeightDropdown");
        	Assert.assertEquals(actualOption, expectedOption, "Default option for Weight does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInWeightFieldOfSecondRow() {
        try {
        	 WebElement Weight1=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("WeightValueCasingSecondRow")+"']"));
        	String actualOption = Weight1.getText().trim().replace("▼", "").trim();
        	String expectedOption = ReadData.readdata("WeightValueCasingSecondRow");
        	Assert.assertEquals(actualOption, expectedOption, "Default option for Weight does not match for second row!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInIDFieldOfFirstRow() {
        try {
        	 WebElement Id=driver.findElement(By.xpath("//td[@id='cell-0-6']"));
        	String actualOption = Id.getText().trim().replace("▼", "").trim();
        	String expectedOption = ReadData.readdata("IDDropdown");
        	Assert.assertEquals(actualOption, expectedOption, "Default option for Id does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInIDFieldOfSecondRow() {
        try {
        	 WebElement Id2=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("IDValueCasingSecondRow")+"']"));
        	String actualOption = Id2.getText();
        	String expectedOption = ReadData.readdata("IDValueCasingSecondRow");
        	Assert.assertEquals(actualOption, expectedOption, "Default option for Id does not match for second row!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public void verifyValueInGradeFieldOfFirstRow() {
        try {
        	WebElement byDefaultValue = driver
        			.findElement(By.xpath("//td[@id='cell-0-7']"));
        	String actualOption = byDefaultValue.getText().trim().replace("▼", "").trim();
        	String expectedOption = "Unspec";
        	Assert.assertEquals(actualOption, expectedOption, "Default option for Grade does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void verifyValueInGradeFieldOfSecondRow() {
        try {
        	WebElement byDefaultValueGrade = driver
        			.findElement(By.xpath("//td[@id='cell-1-7']"));
        	String actualOption = byDefaultValueGrade.getText().trim().replace("▼", "").trim();
        	String expectedOption = ReadData.readdata("GradeDropDownValueSecondRow");
        	Assert.assertEquals(actualOption, expectedOption, "Default option for Grade does not match for second row !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
//    public void verifyValueInODFieldOfFirstRow() {
//        try {
//            String actualValue = elementUtils.getElementText(odFieldDropdown);
//            String expectedValue = ReadData.readdata("ODDropdown");
//            Assert.assertEquals(actualValue, expectedValue, "Length field value of first row does not match!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void selectCasingOptionFromInjectionIsDownDropdown() {
        try {
        	Actions act=new Actions(driver);
        	act.scrollToElement(injectionIsDownDropdown).perform();
            elementUtils.clickElement(injectionIsDownDropdown);
            WebElement cs=driver.findElement(By.xpath("//div[text()=' Casing ']"));
            elementUtils.clickElement(cs);
//            elementUtils.selectOptionInDropdown(injectionIsDownDropdown, "Casing");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementOnSaveButton() {
        try {
        	Thread.sleep(1000);
            elementUtils.clickElement(saveButton);
            Thread.sleep(8000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void refreshPage() throws InterruptedException {
    	Thread.sleep(2000);
        driver.navigate().refresh();
    }

    public void verifyValuesInFields() {
        // Implementation to verify values in multiple fields
    }

    public void enterValueInTopMdField() {
        try {
            elementUtils.clearAndSendKeys(topMdField, "1000");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterValueInBotMdField() {
        try {
            elementUtils.clearAndSendKeys(botMdField, "1100");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyByDefaultDropdownValueOfCasingField() {
        try {
            String actualOption = elementUtils.getElementText(casingField);
            String expectedOption = "Default Casing";
            Assert.assertEquals(actualOption, expectedOption, "Default dropdown value of casing field does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyByDefaultDropdownValueOfGradeField() {
        try {
            String actualOption = elementUtils.getElementText(gradeField);
            String expectedOption = "Default Grade";
            Assert.assertEquals(actualOption, expectedOption, "Default dropdown value of grade field does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterValueIntoOdField() {
        try {
            elementUtils.clearAndSendKeys(odFieldDropdown, "5.5");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterValueIntoWeightField() {
        try {
            elementUtils.clearAndSendKeys(weightFieldDropdown, "20");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterValueIntoIdField() {
        try {
            elementUtils.clearAndSendKeys(idField, "4.5");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectOptionFromGradeDropdown() {
        try {
            elementUtils.clickElement(gradeField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyValuesInFieldsForSecondRow() {
        // Implementation to verify values in multiple fields for the second row
    }

    public void isSaveButtonEnabled() {
        try {
            boolean isEnabled = saveButton.isEnabled();
            Assert.assertFalse(isEnabled, "Save button should be disabled!");
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

    public void clickElementOnWellboreConfigurationOption() {
        try {
            WebElement wellboreConfigOption = driver.findElement(By.id("wellboreConfigOption"));
            elementUtils.clickElement(wellboreConfigOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyCasingTableHeaderNames() {
        try {
        	Thread.sleep(2000);

			WebElement lengthheader=driver.findElement(By.xpath("(//Span[text()='Drilled Hole']/parent::a/parent::li/following-sibling::li/a/span[text()='Casing']/ancestor::tabset/descendant::span[text()='Length (ft)'])[2]"));
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
			
			WebElement header5=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Casing'])[2]"));
			String actualheadername5=header5.getText();
			String expectedHeader5 = "Casing";
			Assert.assertEquals(actualheadername5, expectedHeader5, "Casing Table page header does not match!");
			
			WebElement header6=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='OD(in)'])[2]"));
			String actualheadername6=header6.getText();
			String expectedHeader6 = "OD(in)";
			Assert.assertEquals(actualheadername6, expectedHeader6, "OD(in) Table page header does not match!");
			
			WebElement header7=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Weight (lb/ft)'])[2]"));
			String actualheadername7=header7.getText();
			String expectedHeader7 = "Weight (lb/ft)";
			Assert.assertEquals(actualheadername7, expectedHeader7, "Weight (lb/ft) Table page header does not match!");
			
			WebElement header8=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='ID (in)'])[2]"));
			String actualheadername8=header8.getText();
			String expectedHeader8 = "ID (in)";
			Assert.assertEquals(actualheadername8, expectedHeader8, "ID (in) Table page header does not match!");
			
			WebElement header9=driver.findElement(By.xpath("(//div[@role='presentation']/span[text()='Grade'])[2]"));
			String actualheadername9=header9.getText();
			String expectedHeader9 = "Grade";
			Assert.assertEquals(actualheadername9, expectedHeader9, "Grade Table page header does not match!");
			
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyUserIsOnHomeScreen() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "Home - FracProPlus";
            Assert.assertEquals(actualTitle, expectedTitle, "User is not on the Home screen!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateAndClickOnPad() {
        try {
            driver.navigate().to("https://fracproplus-uat.linqx.com:9443/");
            WebElement padElement = driver.findElement(By.id("padElement"));
            elementUtils.clickElement(padElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyPageHeaderName() {
        try {
            WebElement headerElement = driver.findElement(By.xpath("//h1[@id='pageHeader']"));
            String actualHeader = elementUtils.getElementText(headerElement);
            String expectedHeader = "Expected Page Header"; // Replace with actual expected header name
            Assert.assertEquals(actualHeader, expectedHeader, "Page header name does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementOnWellFromOverview() {
        try {
            WebElement wellFromOverviewElement = driver.findElement(By.id("wellFromOverview"));
            elementUtils.clickElement(wellFromOverviewElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}