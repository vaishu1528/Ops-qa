
package com.FracProPlus.pages;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class fluidrheologyPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public fluidrheologyPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "materialSelectionModule")
    private WebElement materialSelectionModule;

    @FindBy(xpath = "fluidSelectionTab")
    private WebElement fluidSelectionTab;

    @FindBy(xpath = "pageTitle")
    private WebElement pageTitle;
    
    @FindBy(xpath = "//*[text()='Fluid Data']")
    private WebElement pageheader;

    @FindBy(xpath = "//*[text()='Fluid Rheology']")
    private WebElement fluidRheologyTab;
    
    @FindBy(xpath = "//*[text()='Close']")
    private WebElement closebutton;

    @FindBy(xpath = "selectedFluidName")
    private WebElement selectedFluidName;

    @FindBy(xpath = "fluidDescription")
    private WebElement fluidDescription;

    @FindBy(xpath = "(//*[text()='Vendor']//following::input[@id='vendor'])[1]")
    private WebElement vendorField;

    @FindBy(xpath = "(//*[text()='System']//following::input[@id='system'])[1]")
    private WebElement systemField;

    @FindBy(xpath = "(//*[text()='Modified Properties']//following::input[@id='modifiedProperties'])[1]")
    private WebElement modifiedPropertiesField;

    @FindBy(xpath = "(//td[@id='cell-0-0'])[3]")
    private WebElement timeColumn;

    @FindBy(xpath = "//*[text()='Error']")
    private WebElement errorPopup;

    @FindBy(xpath = "(//td[@id='cell-0-1'])[3]")
    private WebElement nColumn;

    @FindBy(xpath = "(//td[@id='cell-0-2'])[3]")
    private WebElement kColumn;

    @FindBy(xpath = "saveButton")
    private WebElement saveButton;
    
    @FindBy(xpath = "//*[text()='Fluid Thermal Properties']")
    private WebElement FluidThermalPropertiestab;
    
    @FindBy(xpath = "//*[text()='Chemicals']")
    private WebElement chemicalstab;
    
    @FindBy(xpath = "((//table[@class='htCore'])[19]/tbody/tr[1]/td)[1]")
    private WebElement firstchimicalfromtable;
    
    @FindBy(xpath = "((//table[@class='htCore'])[19]/tbody/tr[2]/td)[1]")
    private WebElement SecondChimicalfromtable;
    
    @FindBy(xpath = "((//table[@class='htCore'])[19]/tbody/tr[3]/td)[1]")
    private WebElement Thirdchemicalfromtable;
    
    @FindBy(xpath = "((//table[@class='htCore'])[19]/tbody/tr[1]/td)[4]")
    private WebElement typeoneforfirstchimicalfromtable;
    
    @FindBy(xpath = "((//table[@class='htCore'])[19]/tbody/tr[2]/td)[4]")
    private WebElement typetwoforSecondChimicalfromtable;
    
    @FindBy(xpath = "((//table[@class='htCore'])[19]/tbody/tr[3]/td)[4]")
    private WebElement typethreeThirdchemicalfromtable;
    
    @FindBy(xpath = "((//table[@class='htCore'])[19]/tbody/tr[1]/td)[2]")
    private WebElement FirstchemicalConc;
    
    @FindBy(xpath = "((//table[@class='htCore'])[19]/tbody/tr[2]/td)[2]")
    private WebElement SecondchemicalConc;
    
    @FindBy(xpath = "((//table[@class='htCore'])[19]/tbody/tr[3]/td)[2]")
    private WebElement ThirdchemicalConc;
    
    @FindBy(xpath = "//*[@formcontrolname='ThermCond']")
    private WebElement ThermalConductivity;
    
    @FindBy(xpath = "//*[@formcontrolname='SpecHeat']")
    private WebElement SpecificHeat;
    
    @FindBy(xpath = "//*[@formcontrolname='Density']")
    private WebElement FluidDensity;
    

    @FindBy(xpath = "//*[@formcontrolname='ShearRate']")
    private WebElement shearRateField;

    @FindBy(xpath = "//*[@formcontrolname='appvisc']")
    private WebElement appViscField;

    @FindBy(xpath = "//*[@formcontrolname='ResTemp']")
    private WebElement temperatureField;
    
    @FindBy(xpath = "//*[@formcontrolname='Temp']")
    private WebElement temperatureeditableField;
    
    @FindBy(xpath = "//*[@formcontrolname='appvisc']")
    private WebElement initialAppViscValue;
    
    @FindBy(xpath = "//*[@formcontrolname='appvisc']")
    private WebElement updatedAppViscValue;
    
    @FindBy(xpath = "//*[@formcontrolname='Time']")
    private WebElement TimeField;

    @FindBy(xpath = "//*[@id='UseResTemp']")
    private WebElement useReservoirTemperatureCheckBox;

    @FindBy(xpath = "//*[text()=' Recalculate ']")
    private WebElement recalculateButton;

    @FindBy(xpath = "goBackButton")
    private WebElement goBackButton;

    @FindBy(xpath = "fluidTypeDropdown")
    private WebElement fluidTypeDropdown;

    @FindBy(xpath = "viscosityValueField")
    private WebElement viscosityValueField;

    @FindBy(xpath = "calculateButton")
    private WebElement calculateButton;

    @FindBy(xpath = "rheologyResults")
    private WebElement rheologyResults;

    @FindBy(xpath = "resetButton")
    private WebElement resetButton;

    @FindBy(xpath = "editButton")
    private WebElement editButton;

    public void clickElementOnMaterialSelectionModule() {
        try {
            elementUtils.clickElement(materialSelectionModule);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isOnFluidSelectionTab() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(fluidSelectionTab), "Fluid Selection Tab is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isPageTitleCorrect() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "XOPS";
            Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementOnFluidRheologyTab() {
        try {
            elementUtils.clickElement(fluidRheologyTab);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickclosebutton() {
        try {
            elementUtils.clickElement(closebutton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void isFluidNameCorrect() {
        try {
            String actualFluidName = elementUtils.getElementText(selectedFluidName);
            String expectedFluidName = "Expected Fluid Name"; // Replace with actual expected value
            Assert.assertEquals(actualFluidName, expectedFluidName, "Fluid name does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDescriptionCorrect() {
        try {
            String actualDescription = elementUtils.getElementText(fluidDescription);
            String expectedDescription = "Expected Description"; // Replace with actual expected value
            Assert.assertEquals(actualDescription, expectedDescription, "Description does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isVendorFieldDataCorrect() {
        try {
            
            Assert.assertEquals(vendorField.getAttribute("value"), ReadData.readdata("vendorField"), "Fluid Vendor is not Matched");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isSystemFieldDataCorrect() {
        try {
            
            Assert.assertEquals(systemField.getAttribute("value"), ReadData.readdata("systemField"), "Fluid System is not Matched");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isModifiedPropertiesFieldDataCorrect() {
        try {
           
            Assert.assertEquals(modifiedPropertiesField.getAttribute("value"), ReadData.readdata("modifiedPropertiesField"), "Fluid Modified Properties is not Matched");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMoreThanThreeDigitsIntoTimeColumn() {
        try {
            
            elementUtils.doubleClickElement(timeColumn);
       	    WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
            elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("timeColumnmorethanthreedigit"));
            elementUtils.clickElement(pageheader);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isErrorPopupDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(errorPopup), "Error popup is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

    public void enterLessThanThreeDigitsIntoTimeColumn() {
        try {
        	elementUtils.doubleClickElement(timeColumn);
       	    WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
            elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("timeColumnlessthanthreedigit"));
            elementUtils.clickElement(pageheader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMoreThanThreeDigitsIntoNColumn() {
        try {
        	elementUtils.doubleClickElement(nColumn);
       	    WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
            elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("nColumnmorethanthreedigit"));
            elementUtils.clickElement(pageheader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterLessThanThreeDigitsIntoNColumn() {
        try {
        	elementUtils.doubleClickElement(nColumn);
       	    WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
            elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("nColumnlessthanthreedigit"));
            elementUtils.clickElement(pageheader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDataIntoKColumn() {
        try {
        	elementUtils.doubleClickElement(kColumn);
       	    WebElement Textarea = driver.findElement(By.xpath("//*[@class='handsontableInput']"));
            elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("kColumn"));
            elementUtils.clickElement(pageheader);
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
    
    public void clickonFluidThermalPropertiestab() {
        try {
           elementUtils.clickElement(FluidThermalPropertiestab);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clickonchemicalstab() {
        try {
           elementUtils.clickElement(chemicalstab);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void Verifychemicalnames() {
        try {
        	 Assert.assertEquals(elementUtils.getElementText(firstchimicalfromtable), ReadData.readdata("Chemical1"), "first Chemial name is not matched");
//        	 Assert.assertEquals(elementUtils.getElementText(SecondChimicalfromtable), ReadData.readdata("Chemical2"), "Second Chemial name is not matched");
//        	 Assert.assertEquals(elementUtils.getElementText(Thirdchemicalfromtable), ReadData.readdata("Chemical3"), "Third Chemial name is not matched");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void Verifytypeforchemicalnames() {
        try {
        	 Assert.assertEquals(elementUtils.getElementText(typeoneforfirstchimicalfromtable), ReadData.readdata("TypeColumn1"), "Type is not matched for First Fluid");
        	 Assert.assertEquals(elementUtils.getElementText(typetwoforSecondChimicalfromtable),ReadData.readdata("TypeColumn2"), "Type is not matched for Second Fluid");
        	 Assert.assertEquals(elementUtils.getElementText(typethreeThirdchemicalfromtable), ReadData.readdata("TypeColumn3"), "Type is not matched for Third Fluid");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void Enterdataforchemconc() {
        try {
        
            elementUtils.doubleClickElement(FirstchemicalConc);
            WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[1]"));
        	elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("FirstchemicalConc"));
        	elementUtils.clickElement(pageheader);
        	
        	elementUtils.doubleClickElement(SecondchemicalConc);
        	WebElement Textarea1 = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[1]"));
        	elementUtils.clearAndSendKeys(Textarea1, ReadData.readdata("SecondchemicalConc"));
        	elementUtils.clickElement(pageheader);
        	
        	elementUtils.doubleClickElement(ThirdchemicalConc);
        	WebElement Textarea2 = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[1]"));
        	elementUtils.clearAndSendKeys(Textarea2, ReadData.readdata("ThirdchemicalConc"));
        	elementUtils.clickElement(pageheader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    public void Verifysaveddata() {
//        try {
//        	String ConcFirstChemical = ReadData.readdata("FirstchemicalConc");
//    		double expectedDouble = Double.parseDouble(ConcFirstChemical);
//    	    DecimalFormat decimalFormat = new DecimalFormat("0.00"); 
//    	    String formattedConcFirstChemical = decimalFormat.format(expectedDouble);
//    	    
//    	    String ConcSecondChemical = ReadData.readdata("SecondchemicalConc");
//    		double expectedDouble1 = Double.parseDouble(ConcSecondChemical);
//    	    DecimalFormat decimalFormat1 = new DecimalFormat("0.00"); 
//    	    String formattedConcSecondChemical = decimalFormat1.format(expectedDouble1);
//        	
//    	    String ConcThirdChemical = ReadData.readdata("ThirdchemicalConc");
//    		double expectedDouble2 = Double.parseDouble(ConcThirdChemical);
//    	    DecimalFormat decimalFormat2 = new DecimalFormat("0.00"); 
//    	    String formattedConcThirdChemical = decimalFormat2.format(expectedDouble2);
//        
//        	 Assert.assertEquals(elementUtils.getElementText(FirstchemicalConc), formattedConcFirstChemical, "Concentration of first chemical not matched");
//        	 Assert.assertEquals(elementUtils.getElementText(SecondchemicalConc), formattedConcSecondChemical, "Concentration of Second chemical not matched");
//        	 Assert.assertEquals(elementUtils.getElementText(ThirdchemicalConc), formattedConcThirdChemical, "Concentration of Third chemical not matched");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void Verifysaveddata() {
         try {
        String[] d = {
            new java.text.DecimalFormat("0.00").format(Double.parseDouble(ReadData.readdata("FirstchemicalConc"))),
//            new java.text.DecimalFormat("0.00").format(Double.parseDouble(ReadData.readdata("SecondchemicalConc"))),
//            new java.text.DecimalFormat("0.00").format(Double.parseDouble(ReadData.readdata("ThirdchemicalConc")))
        };
        WebElement[] e = { FirstchemicalConc, SecondchemicalConc, ThirdchemicalConc };
        for (int i = 0; i < 1; i++) Assert.assertEquals(elementUtils.getElementText(e[i]), d[i], "e" + i);
    } catch (Exception  e) { 
    	e.printStackTrace(); }
    }
    
    public void defaultdataforThermalPropertiessection() {
        try {
        	 Assert.assertEquals(ThermalConductivity.getAttribute("value"), ReadData.readdata("defaulThermalConductivity"), "Deafult data of Thermal Conductivity is not Matched");
        	 Assert.assertEquals(SpecificHeat.getAttribute("value"), ReadData.readdata("defaulSpecificHeat"), "Deafult data of Specific Heat is not Matched");
        	 Assert.assertEquals(FluidDensity.getAttribute("value"), ReadData.readdata("defaulFluidDensity"), "Deafult data of Fluid Density is not Matched");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void dataverificationforfirstfluid() {
        try {
        	 Assert.assertEquals(ThermalConductivity.getAttribute("value"), ReadData.readdata("ThermalConductivity"), "Deafult data of Thermal Conductivity is not Matched");
        	 Assert.assertEquals(SpecificHeat.getAttribute("value"), ReadData.readdata("SpecificHeat"), "Deafult data of Specific Heat is not Matched");
        	 Assert.assertEquals(FluidDensity.getAttribute("value"), ReadData.readdata("FluidDensity"), "Deafult data of Fluid Density is not Matched");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void dataverificationforSecondfluid() {
        try {
        	 Assert.assertEquals(ThermalConductivity.getAttribute("value"), ReadData.readdata("SecondThermalConductivity"), "Deafult data of Thermal Conductivity is not Matched");
        	 Assert.assertEquals(SpecificHeat.getAttribute("value"), ReadData.readdata("SecondSpecificHeat"), "Deafult data of Specific Heat is not Matched");
        	 Assert.assertEquals(FluidDensity.getAttribute("value"), ReadData.readdata("SecondFluidDensity"), "Deafult data of Fluid Density is not Matched");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void dataverificationforThirdfluid() {
        try {
        	 Assert.assertEquals(ThermalConductivity.getAttribute("value"), ReadData.readdata("ThirdThermalConductivity"), "Deafult data of Thermal Conductivity is not Matched");
        	 Assert.assertEquals(SpecificHeat.getAttribute("value"), ReadData.readdata("ThirdfSpecificHeat"), "Deafult data of Specific Heat is not Matched");
        	 Assert.assertEquals(FluidDensity.getAttribute("value"), ReadData.readdata("ThirdFluidDensity"), "Deafult data of Fluid Density is not Matched");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void dataverificationforFourthfluid() {
        try {
        	 Assert.assertEquals(ThermalConductivity.getAttribute("value"), ReadData.readdata("FourthThermalConductivity"), "Deafult data of Thermal Conductivity is not Matched");
        	 Assert.assertEquals(SpecificHeat.getAttribute("value"), ReadData.readdata("FourthfSpecificHeat"), "Deafult data of Specific Heat is not Matched");
        	 Assert.assertEquals(FluidDensity.getAttribute("value"), ReadData.readdata("FourthFluidDensity"), "Deafult data of Fluid Density is not Matched");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void isDataSaved() {
        try {
        	
        	String expectedValuetimeColumn = ReadData.readdata("timeColumnlessthanthreedigit");
    		double expectedDouble = Double.parseDouble(expectedValuetimeColumn);
    	    DecimalFormat decimalFormat = new DecimalFormat("000.0"); 
    	    String formattedExpectedValuetimeColumn = decimalFormat.format(expectedDouble);
    	    
    	    String expectedValuenColumn = ReadData.readdata("nColumnlessthanthreedigit");
    		double expectedDouble2 = Double.parseDouble(expectedValuenColumn);
    	    DecimalFormat decimalFormat1 = new DecimalFormat("000.000"); 
    	    String formattedExpectedValuenColumn = decimalFormat1.format(expectedDouble2);
    	    
    	    String expectedValuekColumn = ReadData.readdata("kColumn");
    		double expectedDouble3 = Double.parseDouble(expectedValuekColumn);
    		DecimalFormat scientificFormat = new DecimalFormat("0.00E0");
    		String formattedExpectedValuekColumn = scientificFormat.format(expectedDouble3).replace("E", "e+");
    	
        	  Assert.assertEquals(elementUtils.getElementText(timeColumn), formattedExpectedValuetimeColumn, "Data for Time Column does not match!");
        	  Assert.assertEquals(elementUtils.getElementText(nColumn), formattedExpectedValuenColumn, "Data for n Column does not match!");
        	  Assert.assertEquals(elementUtils.getElementText(kColumn), formattedExpectedValuekColumn, "Data for k Column does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void isDataSavedAppViscsection() {
        try {
        	  Assert.assertEquals(TimeField.getAttribute("value"), ReadData.readdata("TimeField"), "Data for Time Field does not match!");
        	  Assert.assertEquals(shearRateField.getAttribute("value"), ReadData.readdata("ShearRate"), "Data for Shear Rate Field does not match!");
        	  Assert.assertEquals(temperatureeditableField.getAttribute("value"), ReadData.readdata("temperature"), "Data for Temperature Field does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDefaultDataForShearRateFieldCorrect() {
        try {
        	
            Assert.assertEquals(shearRateField.getAttribute("value"), ReadData.readdata("DeafultShearRate"), "Default Data for Shear Rate field does not match!");
            
        } catch (Exception e) {
      
            e.printStackTrace();
        }
    }

    public void isDefaultDataForAppViscFieldCorrect() {
        try {
        	
            Assert.assertEquals(appViscField.getAttribute("value"), ReadData.readdata("DefaultAppVisc"), "Default Data for App Visc field does not match!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDefaultDataForTemperatureFieldCorrect() {
        try {
        	
            Assert.assertEquals(temperatureField.getAttribute("value"), ReadData.readdata("Defaulttemperature"), "Default Data for temperature field does not match!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUseReservoirTemperatureCheckBoxSelected() {
        try {
            Assert.assertTrue(useReservoirTemperatureCheckBox.isSelected(), "Use Reservoir Temperature check box is not selected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void uncheckUseReservoirTemperatureCheckBox() {
        try {
            if (useReservoirTemperatureCheckBox.isSelected()) {
                elementUtils.clickElement(useReservoirTemperatureCheckBox);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isTemperatureFieldEditable() {
        try {
        	temperatureeditableField.clear();
            elementUtils.clearAndSendKeys(temperatureeditableField, ReadData.readdata("temperature"));
            Assert.assertEquals(temperatureeditableField.getAttribute("value"), ReadData.readdata("temperature"), "Temperature field is not editable!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void enterdataThermalConductivity() {
        try {
            elementUtils.clearAndSendKeys(ThermalConductivity, ReadData.readdata("ThermalConductivity"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterdataThermalConductivityfortheSecondfluid() {
        try {
            elementUtils.clearAndSendKeys(ThermalConductivity, ReadData.readdata("SecondThermalConductivity"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterdataThermalConductivityfortheThirdfluid() {
        try {
            elementUtils.clearAndSendKeys(ThermalConductivity, ReadData.readdata("ThirdThermalConductivity"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterdataThermalConductivityfortheFourthfluid() {
        try {
            elementUtils.clearAndSendKeys(ThermalConductivity, ReadData.readdata("FourthThermalConductivity"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void enterdataSpecificHeatfortheSecondfluid() {
        try {
            elementUtils.clearAndSendKeys(SpecificHeat, ReadData.readdata("SecondSpecificHeat"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void enterdataSpecificHeatfortheThirdfluid() {
        try {
            elementUtils.clearAndSendKeys(SpecificHeat, ReadData.readdata("ThirdfSpecificHeat"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void enterdataSpecificHeatfortheFourthfluid() {
        try {
            elementUtils.clearAndSendKeys(SpecificHeat, ReadData.readdata("FourthfSpecificHeat"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void enterdataSpecificHeat() {
        try {
            elementUtils.clearAndSendKeys(SpecificHeat, ReadData.readdata("SpecificHeat"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterdataFluidDensity() {
        try {
            elementUtils.clearAndSendKeys(FluidDensity, ReadData.readdata("FluidDensity"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterdataFluidDensityfortheSecondfluid() {
        try {
            elementUtils.clearAndSendKeys(FluidDensity, ReadData.readdata("SecondFluidDensity"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterdataFluidDensityfortheThirdfluid() {
        try {
            elementUtils.clearAndSendKeys(FluidDensity, ReadData.readdata("ThirdFluidDensity"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void enterdataFluidDensityfortheFourthfluid() {
        try {
            elementUtils.clearAndSendKeys(FluidDensity, ReadData.readdata("FourthFluidDensity"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDataIntoTimeField() {
        try {
            elementUtils.clearAndSendKeys(TimeField, ReadData.readdata("TimeField"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void enterDataIntotimeFieldrecalculation() {
        try {
            elementUtils.clearAndSendKeys(TimeField, ReadData.readdata("TimeField1"));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDataIntoShearRateField() {
        try {
        	elementUtils.clickElement(shearRateField);
            elementUtils.clearAndSendKeys(shearRateField, ReadData.readdata("ShearRate"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void enterDataIntoShearRateFieldrecalculation() {
        try {
        	elementUtils.clickElement(shearRateField);
            elementUtils.clearAndSendKeys(shearRateField, ReadData.readdata("ShearRate1"));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void enterDataIntoTemperatureField() {
        try {
        	elementUtils.clickElement(temperatureeditableField);
            elementUtils.clearAndSendKeys(temperatureeditableField,ReadData.readdata("temperature"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementOnRecalculateButton() {
        try {
            elementUtils.clickElement(recalculateButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isAppViscValueChanged() {
        try {
        	
        	String initialViscosity = initialAppViscValue.getAttribute("value");
        	Thread.sleep(2000);
        	elementUtils.clickElement(recalculateButton);
        	Thread.sleep(2000);
        	Assert.assertNotEquals(initialViscosity, updatedAppViscValue.getAttribute("value"), "App Visc Field Value is not Changed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isGoBackButtonPresent() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(goBackButton), "Go Back button is not present!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isOnMaterialSelectionScreen() {
        try {
            // Implement logic to verify user is directed to the Material selection screen
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToFluidRheologyPage() {
        try {
            driver.get("https://fracproplus-uat.linqx.com:9443/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectFluidType(String fluidType) {
        try {
            elementUtils.selectOptionInDropdown(fluidTypeDropdown, fluidType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterViscosityValue(String viscosityValue) {
        try {
            elementUtils.clearAndSendKeys(viscosityValueField, viscosityValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementCalculateButton() {
        try {
            elementUtils.clickElement(calculateButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRheologyResultsDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(rheologyResults), "Rheology results are not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetFluidRheologyForm() {
        try {
            elementUtils.clickElement(resetButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFormResetToDefaultValues() {
        try {
            // Implement logic to verify form is reset to default values
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementOnGoBackButton() {
        try {
            elementUtils.clickElement(goBackButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementOnEditButton() {
        try {
            elementUtils.clickElement(editButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Page Factory methods for the provided step methods

//@FindBy(xpath = "//a[@href='/material-selection']")
//private WebElement materialSelectionModuleLink;
//
//public void navigateToMaterialSelectionModule() {
//    try {
//        ElementUtils elementUtils = new ElementUtils();
//        elementUtils.clickElement(materialSelectionModuleLink);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }

