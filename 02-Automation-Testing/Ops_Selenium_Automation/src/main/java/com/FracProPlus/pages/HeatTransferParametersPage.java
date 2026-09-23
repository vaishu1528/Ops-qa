package com.FracProPlus.pages;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HeatTransferParametersPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public HeatTransferParametersPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=' Heat Transfer Parameters ']")
	private WebElement heatTransferParametersModule;

	@FindBy(xpath = "//h4[text()='Heat Transfer Parameters']")
	private WebElement pageHeader;

	@FindBy(xpath = "//label[text()='Use Fracture Center Depth']/parent::div/input")
	private WebElement useFractureCenterDepthCheckBox;

	@FindBy(xpath = "//label[text()='Offshore Well']/parent::div/input")
	private WebElement offshoreWellCheckBox;

	@FindBy(xpath = "//label[text()='Enter Temperature vs. Depth']/parent::div/input")
	private WebElement enterTemperatureVsDepthCheckBox;

	@FindBy(xpath = "//label[text()='Surface Fluid Temperature']")
	private WebElement surfaceFluidTemperature;

	@FindBy(xpath = "//label[text()='Surface Fluid Temperature']")
	private WebElement surfaceProppantTemperature;

	@FindBy(xpath = "//label[text()=' Surface N2 Temperature']")
	private WebElement surfaceN2Temperature;

	@FindBy(xpath = "//label[text()='Surface C02 Temperature']")
	private WebElement surfaceC02Temperature;

	@FindBy(xpath = "//label[text()='Surface Rock Temperature']")
	private WebElement surfaceRockTemperature;

	@FindBy(xpath = "//label[text()='Reservoir Temperature at Frac Center Depth']")
	private WebElement reservoirTemperatureAtFracCenterDepth;

	@FindBy(xpath = "//label[text()='Display Temperature at']")
	private WebElement displayTemperatureAt;

	@FindBy(xpath = "//label[text()='Fracture Heat Transfer Coefficient Multiplier']")
	private WebElement fractureHeatTransferCoefficientMultiplier;

	@FindBy(xpath = "//label[text()='Wellbore Heat Transfer Coefficient Multiplier']")
	private WebElement wellboreHeatTransferCoefficientMultiplier;

	@FindBy(xpath = "//label[text()='Surface Water Temperature']")
	private WebElement surfaceWaterTemperature;

	@FindBy(xpath = "//label[text()='Seabed Temperature']")
	private WebElement seabedTemperature;

	@FindBy(xpath = "//label[text()='Water Depth']")
	private WebElement waterDepth;

	@FindBy(xpath = "//label[text()='Sea Current']")
	private WebElement seaCurrent;

	@FindBy(xpath = "//label[text()='Ocean/Wellbore Heat Transfer Coefficient Multiplier']")
	private WebElement oceanOrWellboreHeatTransferCoefficientMultiplier;

	@FindBy(xpath = "(//*[@role='columnheader']/div[contains(text(),'Depth')])[1]")
	private WebElement depthTVD;

	@FindBy(xpath = "(//*[@role='columnheader']/div[contains(text(),'Temperature')])[1]")
	private WebElement temperature;

	@FindBy(xpath = "//input[@formcontrolname='SurfFluidTemp']")
	private WebElement surfaceFluidTemperatureField;

	@FindBy(xpath = "//input[@formcontrolname='SurfPropTemp']")
	private WebElement surfaceProppantTemperatureField;

	@FindBy(xpath = "//input[@formcontrolname='SurfN2Temp']")
	private WebElement surfaceN2TemperatureField;

	@FindBy(xpath = "//input[@formcontrolname='SurfCO2Temp']")
	private WebElement surfaceC02TemperatureField;

	@FindBy(xpath = "//input[@formcontrolname='SurfRockTemp']")
	private WebElement surfaceRockTemperatureField;

	@FindBy(xpath = "//input[@formcontrolname='ResTemp']")
	private WebElement reservoirTemperatureAtFracCenterDepthField;

	@FindBy(xpath = "//input[@formcontrolname='FracCenterDepth']")
	private WebElement displayTemperatureAtField;

	@FindBy(xpath = "//input[@formcontrolname='TempGaugeDepth']")
	private WebElement displayTemperatureAtField2;

	@FindBy(xpath = "//input[@formcontrolname='FracMult']")
	private WebElement fractureHeatTransferCoefficientMultiplierField;

	@FindBy(xpath = "//input[@formcontrolname='WbMult']")
	private WebElement wellboreHeatTransferCoefficientMultiplierField;

	@FindBy(xpath = "//input[@formcontrolname='SurfWaterTemp']")
	private WebElement surfaceWaterTemperatureField;

	@FindBy(xpath = "//input[@formcontrolname='seabedTemp']")
	private WebElement seabedTemperatureField;

	@FindBy(xpath = "//input[@formcontrolname='WaterDepth']")
	private WebElement waterDepthField;

	@FindBy(xpath = "//input[@formcontrolname='SeaCurrent']")
	private WebElement seaCurrentField;

	@FindBy(xpath = "//input[@formcontrolname='OceanMult']")
	private WebElement oceanOrWellboreHeatTransferCoefficientMultiplierField;

	@FindBy(xpath = "//tr[@aria-rowindex='2']/th/following-sibling::td[1]")
	private WebElement depthTVDField;

	@FindBy(xpath = "//tr[@aria-rowindex='2']/th/following-sibling::td[1]")
	private WebElement depthTVDField2;

	@FindBy(xpath = "//tr[@aria-rowindex='2']/th/following-sibling::td[2]")
	private WebElement temperatureField;

	@FindBy(xpath = "//tr[@aria-rowindex='2']/th/following-sibling::td[2]")
	private WebElement temperatureField2;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "heatTransferModel")
	private WebElement heatTransferModel;

	public void clickElementSaveButton() {
		elementUtils.clickElement(saveButton);
	}

	public void clickElementHeatTransferParametersModule() {
		try {
			WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
			expandMenu.click();
			Thread.sleep(2000);
			elementUtils.clickElement(heatTransferParametersModule);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isHeatTransferParametersPageHeaderDisplayed() {
		try {
			Assert.assertEquals(pageHeader.getText(), "Heat Transfer Parameters",
					"Heat Transfer Page header name is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isUseFractureCenterDepthCheckBoxPresent() {
		try {
			Assert.assertTrue(useFractureCenterDepthCheckBox.isSelected(),
					"Use Fracture Center Depth CheckBox is not present!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isOffshoreWellCheckBoxPresent() {
		try {
			Assert.assertTrue(offshoreWellCheckBox.isDisplayed(), "Offshore Well CheckBox is not present!");
			Assert.assertTrue(!offshoreWellCheckBox.isSelected(), "Offshore Well CheckBox is not enabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isEnterTemperatureVsDepthCheckBoxPresent() {
		try {
			Assert.assertTrue(enterTemperatureVsDepthCheckBox.isDisplayed(),
					"Enter Temperature vs Depth CheckBox is not present!");
			Assert.assertTrue(!enterTemperatureVsDepthCheckBox.isSelected(), "Offshore Well CheckBox is not enabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSurfaceFluidTemperatureDefaultValueDisplayed() {
		try {
			Assert.assertTrue(surfaceFluidTemperature.isDisplayed(),
					"Default value in Surface Fluid Temperature field is not displayed!");
			Assert.assertEquals(surfaceFluidTemperatureField.getAttribute("value"), "70.00",
					"Surface fluid temperature default value mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSurfaceProppantTemperatureDefaultValueDisplayed() {
		try {
			Assert.assertTrue(surfaceProppantTemperature.isDisplayed(),
					"Default value in Surface Proppant Temperature field is not displayed!");
			Assert.assertEquals(surfaceProppantTemperatureField.getAttribute("value"), "70.00",
					"Surface proppant temperature default value mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSurfaceN2TemperatureDefaultValueDisplayed() {
		try {
			Assert.assertTrue(surfaceN2Temperature.isDisplayed(),
					"Default value in Surface N2 Temperature field is not displayed!");
			Assert.assertEquals(surfaceN2TemperatureField.getAttribute("value"), "70.00",
					"Surface N2 Temperature default value mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSurfaceC02TemperatureDefaultValueDisplayed() {
		try {
			Assert.assertTrue(surfaceC02Temperature.isDisplayed(),
					"Default value in Surface C02 Temperature field is not displayed!");
			Assert.assertEquals(surfaceC02TemperatureField.getAttribute("value"), "70.00",
					"Default value in Surface C02 Temperature field is not matched!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSurfaceRockTemperatureDefaultValueDisplayed() {
		try {
			Assert.assertTrue(surfaceRockTemperature.isDisplayed(),
					"Default value in Surface Rock Temperature field is not displayed!");
			Assert.assertEquals(surfaceRockTemperatureField.getAttribute("value"), "70.00",
					"Default value in Surface Rock Temperature field is not matched!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isReservoirTemperatureAtFracCenterDepthDefaultValueDisplayed() {
		try {
			Assert.assertTrue(reservoirTemperatureAtFracCenterDepth.isDisplayed(),
					"Default value in Reservoir Temperature at Frac Center Depth field is not displayed!");
			Assert.assertEquals(reservoirTemperatureAtFracCenterDepthField.getAttribute("value"), "180",
					"Reservoir Temperature at Frac Center Depth default value mismatched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isDisplayTemperatureAtDefaultValueDisplayed() {
		try {
			Assert.assertTrue(displayTemperatureAt.isDisplayed(),
					"Default value in Display Temperature at field is not displayed!");
			boolean isFieldEdit = !displayTemperatureAtField.getAttribute("disabled").equals("true")
					&& !displayTemperatureAtField.getAttribute("readonly").equals("true");
			Assert.assertFalse(isFieldEdit, "Display Temperature at is enabled");
			Thread.sleep(4000);
			// Assert.assertEquals(displayTemperatureAtField.getAttribute("value"),
			// "11,000",
			// "Display Tempreture at default value is mismatched!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isFractureHeatTransferCoefficientMultiplierDefaultValueDisplayed() {
		try {
			Assert.assertTrue(fractureHeatTransferCoefficientMultiplier.isDisplayed(),
					"Default value in Fracture Heat Transfer Coefficient Multiplier field is not displayed!");
			Assert.assertEquals(fractureHeatTransferCoefficientMultiplierField.getAttribute("value"), "1.00",
					"Fracture Heat Transfer Coefficient Multiplier default value mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isWellboreHeatTransferCoefficientMultiplierDefaultValueDisplayed() {
		try {
			Assert.assertTrue(wellboreHeatTransferCoefficientMultiplier.isDisplayed(),
					"Default value in Wellbore Heat Transfer Coefficient Multiplier field is not displayed!");
			Assert.assertEquals(wellboreHeatTransferCoefficientMultiplierField.getAttribute("value"), "1.00",
					"Wellbore Heat Transfer Coefficient Multiplier default value mismatched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementOffshoreWellCheckBox() {
		try {
			Actions act1 = new Actions(driver);
			act1.scrollToElement(offshoreWellCheckBox).perform();
			Thread.sleep(2000);
			elementUtils.clickElement(offshoreWellCheckBox);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSurfaceWaterTemperatureDefaultValueDisplayed() {
		try {
			Assert.assertEquals(surfaceWaterTemperatureField.getAttribute("value"), "70.00",
					"Default value in Surface Water Temperature field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSeabedTemperatureDefaultValueDisplayed() {
		try {
			Assert.assertEquals(seabedTemperatureField.getAttribute("value"), "70.00",
					"Default value in Seabed Temperature field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isWaterDepthDefaultValueDisplayed() {
		try {
			Assert.assertEquals(waterDepthField.getAttribute("value"), "0",
					"Default value in Water Depth field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSeaCurrentDefaultValueDisplayed() {
		try {
			Assert.assertEquals(seaCurrentField.getAttribute("value"), "0.00",
					"Default value in Sea Current field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isOceanOrWellboreHeatTransferCoefficientMultiplierDefaultValueDisplayed() {
		try {
			Assert.assertEquals(oceanOrWellboreHeatTransferCoefficientMultiplierField.getAttribute("value"), "1.00",
					"Default value in Ocean or Wellbore Heat Transfer Coefficient Multiplier field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSurfaceRockTemperatureFieldReadOnly() {
		try {
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.scrollToElement(surfaceRockTemperatureField).perform();
			elementUtils.checkFieldNotReadOnly(driver, By.xpath("//input[@formcontrolname='SurfRockTemp']"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uncheckOffshoreWellCheckBox() {
		try {

			elementUtils.clickElement(offshoreWellCheckBox);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSurfaceRockTemperatureFieldEditable() {
		try {
			String readOnly = surfaceRockTemperatureField.getAttribute("readonly");
			Assert.assertNull(readOnly, "Surface Rock Temperature field is not editable!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementEnterTemperatureVsDepthCheckBox() {
		try {
			Actions act = new Actions(driver);
			act.scrollToElement(enterTemperatureVsDepthCheckBox).perform();
			Thread.sleep(2000);
			elementUtils.clickElement(enterTemperatureVsDepthCheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isDepthTVDTableHeaderDisplayed() {

		String actualheadername1 = depthTVD.getAttribute("innerHTML").replaceAll("<br>", " ").trim();
		System.out.println(actualheadername1);
		String expectedHeader1 = "Depth TVD   (ft)";
		Assert.assertEquals(actualheadername1, expectedHeader1, "Depth TVD table header is not displayed!");
	}

	public void isTemperatureTableHeaderDisplayed() {
		try {
			// Assert.assertTrue(elementUtils.isElementDisplayed(temperature),
			// "Temperature table header is not displayed!");
			//

			String actualheadername1 = temperature.getAttribute("innerHTML").replaceAll("<br>", " ").trim();
			System.out.println(actualheadername1);
			String expectedHeader1 = "Temperature   (°F)";
			Assert.assertEquals(actualheadername1, expectedHeader1, "Temperature table header is not displayed!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uncheckEnterTemperatureVsDepthCheckBox() {
		try {

			elementUtils.clickElement(enterTemperatureVsDepthCheckBox);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isUseFractureCenterDepthCheckBoxCheckedByDefault() {
		try {
			Assert.assertTrue(useFractureCenterDepthCheckBox.isSelected(),
					"Use Fracture Center Depth CheckBox is not checked by default!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isDisplayTemperatureAtFieldReadOnly() {
		try {
			Assert.assertFalse(elementUtils.isElementReadOnly(driver, displayTemperatureAtField),
					"Display Temperature at field is not read-only!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uncheckUseFractureCenterDepthCheckBox() {
		try {
			if (useFractureCenterDepthCheckBox.isSelected()) {
				elementUtils.clickElement(useFractureCenterDepthCheckBox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isDisplayTemperatureAtFieldEditable() {
		try {
			Thread.sleep(2000);
			String readOnly = displayTemperatureAtField2.getAttribute("readonly");
			Assert.assertNull(readOnly, "Display Temperature at field is not editable!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSurfaceFluidTemperatureValue() {
		try {
			elementUtils.clearAndSendKeys(surfaceFluidTemperatureField,
					ReadData.readdata("SurfaceFluidTemperatureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterSurfaceFluidTemperatureValue1() {
		try {
			elementUtils.clearAndSendKeys(surfaceFluidTemperatureField,
					"100");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSurfaceProppantTemperatureValue() {
		try {
			elementUtils.clearAndSendKeys(surfaceProppantTemperatureField,
					ReadData.readdata("SurfaceProppantTemperatureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSurfaceN2TemperatureValue() {
		try {
			elementUtils.clearAndSendKeys(surfaceN2TemperatureField, ReadData.readdata("SurfaceN2TemperatureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSurfaceC02TemperatureValue() {
		try {
			elementUtils.clearAndSendKeys(surfaceC02TemperatureField, ReadData.readdata("SurfaceC02TemperatureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSurfaceRockTemperatureValue() {
		try {
			Thread.sleep(5000);
			elementUtils.clearAndSendKeys(surfaceRockTemperatureField,
					ReadData.readdata("SurfaceRockTemperatureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterReservoirTemperatureAtFracCenterDepthValue() {
		try {
			elementUtils.clearAndSendKeys(reservoirTemperatureAtFracCenterDepthField,
					ReadData.readdata("ReservoirTemperatureatFracCenterDepthValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDisplayTemperatureAtValue() {
		try {
			elementUtils.clearAndSendKeys(displayTemperatureAtField2, ReadData.readdata("DisplayTemperatureatValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementUseFractureCenterDepthCheckBoxForEnable() {
		try {
			elementUtils.clickElement(useFractureCenterDepthCheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterWellboreHeatTransferCoefficientMultiplierValue() {
		try {
			elementUtils.clearAndSendKeys(wellboreHeatTransferCoefficientMultiplierField,
					ReadData.readdata("WellboreHeatTransferCoefficientMultiplierValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFractureHeatTransferCoefficientMultiplierValue() {
		try {
			elementUtils.clearAndSendKeys(fractureHeatTransferCoefficientMultiplierField,
					ReadData.readdata("FractureHeatTransferCoefficientMultiplierValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterWaterDepthValue() {
		try {
			elementUtils.clearAndSendKeys(waterDepthField, ReadData.readdata("WaterDepthValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSurfaceWaterTemperatureValue() {
		try {
			elementUtils.clearAndSendKeys(surfaceWaterTemperatureField,
					ReadData.readdata("SurfaceWaterTemperatureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSeabedTemperatureValue() {
		try {
			elementUtils.scrollToElement(driver, seabedTemperatureField);
			elementUtils.clearAndSendKeys(seabedTemperatureField, ReadData.readdata("SeabedTemperatureValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSeaCurrentValue() {
		try {
			elementUtils.clearAndSendKeys(seaCurrentField, ReadData.readdata("SeaCurrentValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterOceanOrWellboreHeatTransferCoefficientMultiplierValue() {
		try {
			elementUtils.scrollToElement(driver, oceanOrWellboreHeatTransferCoefficientMultiplierField);
			elementUtils.clearAndSendKeys(oceanOrWellboreHeatTransferCoefficientMultiplierField,
					ReadData.readdata("OceanorWellboreHeatTransferCoefficientMultiplierValue"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDepthTVDValue() {
		try {
			elementUtils.scrollToElement(driver, pageHeader);
			elementUtils.doubleClickElement(depthTVDField);
			WebElement textarea = driver.findElement(By.xpath("//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(textarea, ReadData.readdata("DepthTVDValue"));
			depthTVDField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterTemperatureValue() {
		try {
			elementUtils.doubleClickElement(temperatureField);
			WebElement textarea = driver.findElement(By.xpath("//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(textarea, ReadData.readdata("TempretureValue"));
			temperatureField.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewSurfaceFluidTemperatureValueDisplayed() {
		try {
			String newValue = surfaceFluidTemperatureField.getAttribute("value");
			Assert.assertEquals(newValue, ReadData.readdata("SurfaceFluidTemperatureValue"),
					"New value in Surface Fluid Temperature field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewSurfaceProppantTemperatureValueDisplayed() {
		try {
			String newValue2 = surfaceProppantTemperatureField.getAttribute("value");
			Assert.assertEquals(newValue2, ReadData.readdata("SurfaceProppantTemperatureValue"),
					"New value in Surface Proppant Temperature field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewSurfaceN2TemperatureValueDisplayed() {
		try {
			String newValue3 = surfaceN2TemperatureField.getAttribute("value");
			Assert.assertEquals(newValue3, ReadData.readdata("SurfaceN2TemperatureValue"),
					"New value in Surface N2 Temperature field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewSurfaceC02TemperatureValueDisplayed() {
		try {
			String newValue4 = surfaceC02TemperatureField.getAttribute("value");
			Assert.assertEquals(newValue4, ReadData.readdata("SurfaceC02TemperatureValue"),
					"New value in Surface C02 Temperature field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewSurfaceRockTemperatureValueDisplayed() {
		try {
			String newValue5 = surfaceRockTemperatureField.getAttribute("value");
			Assert.assertEquals(newValue5, ReadData.readdata("SurfaceRockTemperatureValue"),
					"New value in Surface Rock Temperature field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewReservoirTemperatureAtFracCenterDepthValueDisplayed() {
		try {
			String newValue6 = reservoirTemperatureAtFracCenterDepthField.getAttribute("value");
			Assert.assertEquals(newValue6, ReadData.readdata("ReservoirTemperatureatFracCenterDepthValue"),
					"New value in Reservoir Temperature at Frac Center Depth field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewDisplayTemperatureAtValueDisplayed() {
		try {
			String newValue7 = displayTemperatureAtField.getAttribute("value");
			Assert.assertEquals(newValue7, ReadData.readdata("DisplayTemperatureatValue"),
					"New value in Display Temperature at field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewFractureHeatTransferCoefficientMultiplierValueDisplayed() {
		try {
			String newValue8 = fractureHeatTransferCoefficientMultiplierField.getAttribute("value");
			Assert.assertEquals(newValue8, ReadData.readdata("FractureHeatTransferCoefficientMultiplierValue"),
					"New value in Fracture Heat Transfer Coefficient Multiplier field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewWellboreHeatTransferCoefficientMultiplierValueDisplayed() {
		try {
			String newValue9 = wellboreHeatTransferCoefficientMultiplierField.getAttribute("value");
			Assert.assertEquals(newValue9, ReadData.readdata("WellboreHeatTransferCoefficientMultiplierValue"),
					"New value in Fracture Heat Transfer Coefficient Multiplier field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewSeabedTemperaturefieldValueDisplayed() {
		try {
			String newValue10 = seabedTemperatureField.getAttribute("value");
			Assert.assertEquals(newValue10, ReadData.readdata("SeabedTemperatureValue"),
					"New value in Seabed Temperature field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewWaterDepthValueDisplayed() {
		try {
			String newValue11 = waterDepthField.getAttribute("value");
			Assert.assertEquals(newValue11, ReadData.readdata("WaterDepthValue"),
					"New value in Water depth field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewSerCurrentValueDisplayed() {
		try {
			String newValue12 = seaCurrentField.getAttribute("value");
			Assert.assertEquals(newValue12, ReadData.readdata("SeaCurrentValue"),
					"New value in sea current field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewOceanWellboreValueDisplayed() {
		try {
			String newValue13 = oceanOrWellboreHeatTransferCoefficientMultiplierField.getAttribute("value");
			Assert.assertEquals(newValue13, ReadData.readdata("OceanorWellboreHeatTransferCoefficientMultiplierValue"),
					"New value in ocean or wellbore heat transfet field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewDepthTVDValueDisplayed() {
		try {
			String newValue14 = depthTVDField2.getText();
			Assert.assertEquals(newValue14, ReadData.readdata("DepthTVDValue"),
					"New value in Depth TVD field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewTempratureValueDisplayed() {
		try {
			String newValue15 = temperatureField2.getText();
			Assert.assertEquals(newValue15, ReadData.readdata("TempretureValue"),
					"New value in Temperature field is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void rightClickElementTS() {
		try {
			Thread.sleep(1000);
			WebElement row = driver
					.findElement(By.xpath("(//span[text()='1'])[2]/ancestor::th/following-sibling::td[1]"));
			Actions action = new Actions(driver);
			action.contextClick(row).perform();
			WebElement insertNewRow = driver.findElement(By.xpath("//div[text()='Insert row below']"));
			insertNewRow.click();
			Thread.sleep(3000);
			WebElement row2 = driver
					.findElement(By.xpath("(//span[text()='2'])[1]/ancestor::th/following-sibling::td[1]"));
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

	public void refreshPage() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}