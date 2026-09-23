
package com.FracProPlus.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

public class EditFluidPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public EditFluidPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "materialSelectionModule")
    private WebElement materialSelectionModule;

    @FindBy(xpath = "//*[text()='Fluid Selection']")
    private WebElement fluidSelectionTab;

    @FindBy(xpath = "//td[@id='cell-0-0']/parent::tr/td[3]/div/img[@alt='Edit']")
    private WebElement editButton1;

    @FindBy(xpath = "//td[@id='cell-1-0']/parent::tr/td[3]/div/img[@alt='Edit']")
    private WebElement editButton2;
    
    @FindBy(xpath = "//td[@id='cell-2-0']/parent::tr/td[3]/div/img[@alt='Edit']")
    private WebElement editButton3;
    
    @FindBy(xpath = "//td[@id='cell-3-0']/parent::tr/td[3]/div/img[@alt='Edit']")
    private WebElement editButton4;
    
    @FindBy(xpath = "//*[text()='Fluid Data']")
    private WebElement pageheader;

    @FindBy(xpath = "(//label[text()='Fluid Name']/parent::div/ng-select/descendant::div[text()=' Binary 30 65 '])[1]")
    private WebElement fluidName;

    @FindBy(xpath = "(//*[text()='Description']//following::input[@id='description'])[1]")
    private WebElement fluidDescription;
    
    @FindBy(xpath = "//input[@formcontrolname='vendor']")
    private WebElement vendorField;
    
    @FindBy(xpath = "(//*[text()='Modified Properties']//following::input[@id='modifiedProperties'])[1]")
    private WebElement modifiedPropertiesField;
    
    @FindBy(xpath = "(//*[text()='System']//following::input[@id='system'])[1]")
    private WebElement systemField;

    @FindBy(xpath = "((//*[text()='Fluid Name'])[1]//following::select[@formcontrolname='name'])[1]")
    private WebElement fluidDropdown;

    @FindBy(xpath = "changedDescription")
    private WebElement changedDescription;

    @FindBy(xpath = "//*[@id='radio1']")
    private WebElement useMultiplierRadioButton;

    @FindBy(xpath = "//*[@formcontrolname='WbFricMult']")
    private WebElement frictionMultiplierField;

    @FindBy(xpath = "//*[text()=' Save ']")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id='toast-container']")
    private WebElement updatedToastMessage;

    @FindBy(xpath = "((//span[@class='rowHeader'])[5]/parent::div/parent::th/following-sibling::td)[2]")
    private WebElement tableColumns;

    @FindBy(xpath = "//*[@id='radio2']")
    private WebElement setIndividualValuesRadioButton;

    @FindBy(xpath = "(//td[@id='cell-0-0'])[2]")
    private WebElement qBpmColumn;

    @FindBy(xpath = "(//td[@id='cell-0-1'])[2]")
    private WebElement pPsiColumn;

    @FindBy(xpath = "//*[text()=' Go Back ']")
    private WebElement goBackButton;

    @FindBy(xpath = "//h4[text()='Material Selection']")
    private WebElement materialSelectionScreen;

    @FindBy(xpath = "fluidEditPage")
    private WebElement fluidEditPage;

    @FindBy(xpath = "fluidType")
    private WebElement fluidType;

    @FindBy(xpath = "fluidDensity")
    private WebElement fluidDensity;

    @FindBy(xpath = "fluidSavedConfirmation")
    private WebElement fluidSavedConfirmation;

    @FindBy(xpath = "invalidFluidNameError")
    private WebElement invalidFluidNameError;

    @FindBy(xpath = "invalidFluidDensityError")
    private WebElement invalidFluidDensityError;

    public void navigateToMaterialSelectionModule() {
        try {
            driver.get("https://fracproplus-uat.linqx.com:9443/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementMaterialSelectionModule() {
        try {
            elementUtils.clickElement(materialSelectionModule);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFluidSelectionTabDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(fluidSelectionTab), "Fluid Selection Tab is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementEditButton() {
        try {
            elementUtils.clickElement(editButton1);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clickElementEditButton2() {
        try {
            elementUtils.clickElement(editButton2);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clickElementEditButton3() {
        try {
            elementUtils.clickElement(editButton3);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clickElementEditButton4() {
        try {
            elementUtils.clickElement(editButton4);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isPageTitleDisplayed() {
        try {
           
            Assert.assertEquals(elementUtils.getElementText(pageheader), "Fluid Data", "Page header title does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
   

    public void isFluidNameDisplayed() {
        try {
            Assert.assertEquals(elementUtils.getElementText(fluidName), ReadData.readdata("Fluid1"), "Fluid Name is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFluidDescriptionDisplayed() {
        try {
        	Thread.sleep(4000);
            Assert.assertEquals(fluidDescription.getAttribute("value"), "65% Binary BJFoam with 30# Gel", "Fluid Description is not Matched");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void isFluidvendorfieldDisplayedforsecondfluid() {
        try {
        	 Assert.assertEquals(vendorField.getAttribute("value"), ReadData.readdata("vendorField"), "Fluid Vendor is not Matched");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void isFluidvendorfieldDisplayedforThirdfluid() {
        try {
       	 Assert.assertEquals(vendorField.getAttribute("value"), ReadData.readdata("vendorField"), "Fluid Vendor is not Matched");

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    
    
    public void isFluidvendorfieldDisplayedforFourthfluid() {
        try {
       	 Assert.assertEquals(vendorField.getAttribute("value"), ReadData.readdata("vendorField"), "Fluid Vendor is not Matched");

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    
    public void isModifiedPropertiesfieldDisplayedforSecondfluid() {
        try {
           
            Assert.assertEquals(modifiedPropertiesField.getAttribute("value"), ReadData.readdata("modifiedPropertiesField"), "Fluid Modified Properties is not Matched");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void issystemfieldDisplayedforSecondfluid() {
        try {
            
            Assert.assertEquals(systemField.getAttribute("value"), ReadData.readdata("systemField"), "Fluid System is not Matched");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void issystemfieldDisplayedforThirdfluid() {
        try {
            
            Assert.assertEquals(systemField.getAttribute("value"), ReadData.readdata("systemField"), "Fluid System is not Matched");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void issystemfieldDisplayedforFourthfluid() {
        try {
            
            Assert.assertEquals(systemField.getAttribute("value"), ReadData.readdata("systemField"), "Fluid System is not Matched");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void isModifiedPropertiesfieldDisplayedforThirdfluid() {
        try {
           
            Assert.assertEquals(modifiedPropertiesField.getAttribute("value"), ReadData.readdata("modifiedPropertiesField"), "Fluid Modified Properties is not Matched");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void isModifiedPropertiesfieldDisplayedforFourthfluid() {
        try {
           
            Assert.assertEquals(modifiedPropertiesField.getAttribute("value"), ReadData.readdata("modifiedPropertiesField"), "Fluid Modified Properties is not Matched");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void selectSecondFluid() {
        try {
            elementUtils.clickElement(fluidDropdown);
            elementUtils.selectOptionInDropdown(fluidDropdown, ReadData.readdata("Fluid2"));
            elementUtils.clickElement(pageheader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     public void selectthirdFluid() {
         try {
             elementUtils.clickElement(fluidDropdown);
             elementUtils.selectOptionInDropdown(fluidDropdown, ReadData.readdata("Fluid3"));
             elementUtils.clickElement(pageheader);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
     public void selectfourthFluid() {
         try {
             elementUtils.clickElement(fluidDropdown);
             elementUtils.selectOptionInDropdown(fluidDropdown, ReadData.readdata("Fluid4"));
             elementUtils.clickElement(pageheader);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }

    public void selectDifferentFluid() {
        try {
            elementUtils.clickElement(fluidDropdown);
            elementUtils.selectOptionInDropdown(fluidDropdown, ReadData.readdata("Fluid2"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isChangedDescriptionDisplayedforsecondfluid() {
        try {
        	Thread.sleep(2000);
            Assert.assertEquals(fluidDescription.getAttribute("value"),"70% Binary BJFoam with 30# Gel", "Changed Description is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void isChangedDescriptionDisplayedforthirdfluid() {
        try {
        	Thread.sleep(2000);
            Assert.assertEquals(fluidDescription.getAttribute("value"),"75% Binary BJFoam with 30# Gel", "Changed Description is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void isChangedDescriptionDisplayedforfourthfluid() {
        try {
        	Thread.sleep(2000);
            Assert.assertEquals(fluidDescription.getAttribute("value"),"65% Binary BJFoam with 40# Gel", "Changed Description is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUseMultiplierRadioButtonDisplayed() {
        try {
        	Thread.sleep(3000);
            Assert.assertTrue(elementUtils.isElementDisplayed(useMultiplierRadioButton), "Use Multiplier Radio Button is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUseMultiplierRadioButtonSelected() {
        try {
            Assert.assertTrue(useMultiplierRadioButton.isSelected(), "Use Multiplier Radio Button is not selected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFrictionMultiplierFieldVisible() {
        try {
           	Thread.sleep(3000);
            Assert.assertTrue(elementUtils.isElementDisplayed(frictionMultiplierField), "Friction Multiplier Field is not visible");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFrictionMultiplierFieldEditable() {
        try {
            frictionMultiplierField.clear();
            elementUtils.clearAndSendKeys(frictionMultiplierField, ReadData.readdata("frictionMultiplierField"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDataIntoFrictionMultiplierInputBox() {
        try {
            elementUtils.clearAndSendKeys(frictionMultiplierField,ReadData.readdata("frictionMultiplierField"));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterDataIntoFrictionMultiplierInputBoxsecondFluid() {
        try {
            elementUtils.clearAndSendKeys(frictionMultiplierField,ReadData.readdata("frictionMultiplierField2"));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void enterDataIntoFrictionMultiplierInputBoxthirdFluid() {
        try {
            elementUtils.clearAndSendKeys(frictionMultiplierField,ReadData.readdata("frictionMultiplierField3"));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void enterDataIntoFrictionMultiplierInputBoxfourthFluid() {
        try {
            elementUtils.clearAndSendKeys(frictionMultiplierField,ReadData.readdata("frictionMultiplierField4"));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUpdatedToastMessageDisplayed() {
        try {
           	Thread.sleep(3000);
            Assert.assertTrue(elementUtils.isElementDisplayed(updatedToastMessage), "Updated Toast Message is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areTableColumnsNotEditable() {
        try {
            Assert.assertFalse(tableColumns.isEnabled(), "Table Columns are editable");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSetIndividualValuesRadioButtonDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(setIndividualValuesRadioButton), "Set Individual Values Radio Button is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSetIndividualValuesRadioButton() {
        try {
        	Thread.sleep(2000);
            elementUtils.clickElement(setIndividualValuesRadioButton);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void isFrictionMultiplierFieldnonEditable() {
        try {
//        	elementUtils.checkFieldReadOnly(driver, frictionMultiplierField);
        	
        	Assert.assertFalse(elementUtils.isElementReadOnly(driver,frictionMultiplierField),
					"Display Temperature at field is not read-only!");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areTableColumnsEditable() {
        try {
            Assert.assertTrue(tableColumns.isEnabled(), "Table Columns are not editable");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void enterDataUnderQbpmColumnforsecondfluid() {
//        try {
//        	elementUtils.doubleClickElement(qBpmColumn);
//       	    WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
//            elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("qBpmColumn2"));
//            elementUtils.clickElement(pageheader);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void enterDataUnderQbpmColumnforsecondfluid() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Scroll into view
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", qBpmColumn);

            // Click cell
            wait.until(ExpectedConditions.elementToBeClickable(qBpmColumn)).click();

            // Force focus
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].focus();", qBpmColumn);

            // Activate editor
            qBpmColumn.sendKeys(Keys.ENTER);

            // Wait for Handsontable textarea
            WebElement textarea = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("textarea.handsontableInput")
                    )
            );

            // Enter second fluid value
            textarea.clear();
            textarea.sendKeys(ReadData.readdata("qBpmColumn2"));

            // Commit
            textarea.sendKeys(Keys.ENTER);

            // Click outside
            elementUtils.clickElement(pageheader);

        } catch (Exception e) {
            throw new RuntimeException("Failed to enter QBPM second fluid value in headless mode", e);
        }
    }

    
    
//    public void enterDataUnderQbpmColumnforthirdfluid() {
//        try {
//        	elementUtils.doubleClickElement(qBpmColumn);
//       	    WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
//            elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("qBpmColumn3"));
//            elementUtils.clickElement(pageheader);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void enterDataUnderQbpmColumnforthirdfluid() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Scroll into view
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", qBpmColumn);

            // Click cell
            wait.until(ExpectedConditions.elementToBeClickable(qBpmColumn)).click();

            // Force focus
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].focus();", qBpmColumn);

            // Activate editor
            qBpmColumn.sendKeys(Keys.ENTER);

            // Wait for Handsontable textarea
            WebElement textarea = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("textarea.handsontableInput")
                    )
            );

            // Enter third fluid value
            textarea.clear();
            textarea.sendKeys(ReadData.readdata("qBpmColumn3"));

            // Commit
            textarea.sendKeys(Keys.ENTER);

            // Click outside
            elementUtils.clickElement(pageheader);

        } catch (Exception e) {
            throw new RuntimeException("Failed to enter QBPM third fluid value in headless mode", e);
        }
    }

    
    
//    public void enterDataUnderQbpmColumnforfourthfluid() {
//        try {
//        	elementUtils.doubleClickElement(qBpmColumn);
//       	    WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
//            elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("qBpmColumn4"));
//            elementUtils.clickElement(pageheader);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    
    public void enterDataUnderQbpmColumnforfourthfluid() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Scroll into view
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", qBpmColumn);

            // Click cell
            wait.until(ExpectedConditions.elementToBeClickable(qBpmColumn)).click();

            // Force focus
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].focus();", qBpmColumn);

            // Activate editor
            qBpmColumn.sendKeys(Keys.ENTER);

            // Wait for Handsontable textarea
            WebElement textarea = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("textarea.handsontableInput")
                    )
            );

            // Enter fourth fluid value
            textarea.clear();
            textarea.sendKeys(ReadData.readdata("qBpmColumn4"));

            // Commit
            textarea.sendKeys(Keys.ENTER);

            // Click outside
            elementUtils.clickElement(pageheader);

        } catch (Exception e) {
            throw new RuntimeException("Failed to enter QBPM fourth fluid value in headless mode", e);
        }
    }

    
//    public void enterDataUnderQbpmColumn() {
//        try {
//        	elementUtils.doubleClickElement(qBpmColumn);
//        	Thread.sleep(3000);
//       	    WebElement Textarea = driver.findElement(By.xpath("//textarea[@class='handsontableInput']"));
//            elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("qBpmColumn"));
//            elementUtils.clickElement(pageheader);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void enterDataUnderQbpmColumn() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Scroll into view (important for headless)
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", qBpmColumn);

            // Click instead of double click
            wait.until(ExpectedConditions.elementToBeClickable(qBpmColumn)).click();

            // Force focus using JS
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].focus();", qBpmColumn);

            // Press ENTER to activate editor
            qBpmColumn.sendKeys(Keys.ENTER);

            // Wait for Handsontable editor
            WebElement textarea = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("textarea.handsontableInput")
                    )
            );

            textarea.clear();
            textarea.sendKeys(ReadData.readdata("qBpmColumn"));

            // Commit value
            textarea.sendKeys(Keys.ENTER);

            // Click outside
            elementUtils.clickElement(pageheader);

        } catch (Exception e) {
            throw new RuntimeException("Failed to enter QBPM value in headless mode", e);
        }
    }

    

//    public void enterDataUnderPpsiColumn() {
//        try {
//		     elementUtils.doubleClickElement(pPsiColumn);
//		 	Thread.sleep(3000);
//        	 WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
//             elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("pPsiColumn"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void enterDataUnderPpsiColumn() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Scroll into view (important for headless)
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", pPsiColumn);

            // Click instead of double click
            wait.until(ExpectedConditions.elementToBeClickable(pPsiColumn)).click();

            // Force focus
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].focus();", pPsiColumn);

            // Activate editor
            pPsiColumn.sendKeys(Keys.ENTER);

            // Wait for Handsontable editor
            WebElement textarea = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("textarea.handsontableInput")
                    )
            );

            textarea.clear();
            textarea.sendKeys(ReadData.readdata("pPsiColumn"));

            // Commit value
            textarea.sendKeys(Keys.ENTER);

            // Click outside to save
            elementUtils.clickElement(pageheader);

        } catch (Exception e) {
            throw new RuntimeException("Failed to enter PPSI value in headless mode", e);
        }
    }


//    public void enterDataUnderPpsiColumnforsecondfluid() {
//        try {
//		     elementUtils.doubleClickElement(pPsiColumn);
//        	 WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
//             elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("pPsiColumn2"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void enterDataUnderPpsiColumnforsecondfluid() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Scroll into view
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", pPsiColumn);

            // Click cell
            wait.until(ExpectedConditions.elementToBeClickable(pPsiColumn)).click();

            // Force focus
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].focus();", pPsiColumn);

            // Activate editor
            pPsiColumn.sendKeys(Keys.ENTER);

            // Wait for Handsontable textarea
            WebElement textarea = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("textarea.handsontableInput")
                    )
            );

            // Enter second fluid PPSI value
            textarea.clear();
            textarea.sendKeys(ReadData.readdata("pPsiColumn2"));

            // Commit
            textarea.sendKeys(Keys.ENTER);

            // Click outside
            elementUtils.clickElement(pageheader);

        } catch (Exception e) {
            throw new RuntimeException("Failed to enter PPSI second fluid value in headless mode", e);
        }
    }

    
//    public void enterDataUnderPpsiColumnforthirdfluid() {
//        try {
//		     elementUtils.doubleClickElement(pPsiColumn);
//        	 WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
//             elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("pPsiColumn3"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void enterDataUnderPpsiColumnforthirdfluid() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Scroll into view
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", pPsiColumn);

            // Click cell
            wait.until(ExpectedConditions.elementToBeClickable(pPsiColumn)).click();

            // Force focus
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].focus();", pPsiColumn);

            // Activate editor
            pPsiColumn.sendKeys(Keys.ENTER);

            // Wait for Handsontable textarea
            WebElement textarea = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("textarea.handsontableInput")
                    )
            );

            // Enter third fluid PPSI value
            textarea.clear();
            textarea.sendKeys(ReadData.readdata("pPsiColumn3"));

            // Commit
            textarea.sendKeys(Keys.ENTER);

            // Click outside
            elementUtils.clickElement(pageheader);

        } catch (Exception e) {
            throw new RuntimeException("Failed to enter PPSI third fluid value in headless mode", e);
        }
    }

//    
//    public void enterDataUnderPpsiColumnforfourthfluid() {
//        try {
//		     elementUtils.doubleClickElement(pPsiColumn);
//        	 WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
//             elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("pPsiColumn4"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void enterDataUnderPpsiColumnforfourthfluid() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Scroll into view
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollIntoView(true);", pPsiColumn);

            // Click cell
            wait.until(ExpectedConditions.elementToBeClickable(pPsiColumn)).click();

            // Force focus
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].focus();", pPsiColumn);

            // Activate editor
            pPsiColumn.sendKeys(Keys.ENTER);

            // Wait for Handsontable textarea
            WebElement textarea = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("textarea.handsontableInput")
                    )
            );

            // Enter fourth fluid PPSI value
            textarea.clear();
            textarea.sendKeys(ReadData.readdata("pPsiColumn4"));

            // Commit
            textarea.sendKeys(Keys.ENTER);

            // Click outside
            elementUtils.clickElement(pageheader);

        } catch (Exception e) {
            throw new RuntimeException("Failed to enter PPSI fourth fluid value in headless mode", e);
        }
    }

    
    public void isSaveButtonEnabled() {
        try {
            Assert.assertTrue(saveButton.isEnabled(), "Save Button is not enabled");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isGoBackButtonDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(goBackButton), "Go Back Button is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementGoBackButton() {
        try {
            elementUtils.clickElement(goBackButton);
            Thread.sleep(2000);
            elementUtils.clickElement(goBackButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isMaterialSelectionScreenDisplayed() {
        try {
            Assert.assertEquals(materialSelectionScreen.getText(),"Material Selection", "Material Selection Screen is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToFluidEditPage() {
        try {
            driver.get("https://fracproplus-uat.linqx.com:9443/fluidEditPage");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterFluidName(String fluidName) {
        try {
            elementUtils.clearAndSendKeys(this.fluidName, fluidName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectFluidType(String fluidType) {
        try {
            elementUtils.clickElement(this.fluidType);
            elementUtils.selectOptionInDropdown(this.fluidType, fluidType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterFluidDensity(String fluidDensity) {
        try {
            elementUtils.clearAndSendKeys(this.fluidDensity, fluidDensity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFluidSavedConfirmationDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(fluidSavedConfirmation), "Fluid Saved Confirmation is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInvalidFluidNameErrorDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(invalidFluidNameError), "Invalid Fluid Name Error is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInvalidFluidDensityErrorDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(invalidFluidDensityError), "Invalid Fluid Density Error is not displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}