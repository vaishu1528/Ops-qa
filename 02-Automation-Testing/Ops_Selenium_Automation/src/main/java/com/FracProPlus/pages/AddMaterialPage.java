
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

public class AddMaterialPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public AddMaterialPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "padFromHomeScreen")
	private WebElement padFromHomeScreen;

	@FindBy(id = "wellFromOverview")
	private WebElement wellFromOverview;

	@FindBy(xpath = "//*[text()=' Material Selection ']")
	private WebElement materialSelectionOption;

	@FindBy(xpath = "//*[text()='Proppant Selection']")
	private WebElement proppantSelectionTab;

	@FindBy(xpath = "//*[text()=' Add New Proppant to List ']")
	private WebElement addNewProppantToListButton;

	@FindBy(xpath = "(//tr[@role='row' and @aria-rowindex='2']//td[1])")
	private WebElement Proppant1;

	@FindBy(xpath = "(//tr[@role='row' and @aria-rowindex='3']//td[1])")
	private WebElement Proppant2;

	@FindBy(xpath = "(//tr[@role='row' and @aria-rowindex='4']//td[1])")
	private WebElement Proppant3;

	@FindBy(xpath = "(//tr[@role='row' and @aria-rowindex='5']//td[1])")
	private WebElement Proppant4;

	@FindBy(xpath = "(//*[@id='cell-0-0'])[2]")
	private WebElement Fluid1;

	@FindBy(xpath = "(//*[@id='cell-1-0'])[2]")
	private WebElement Fluid2;

	@FindBy(xpath = "(//*[@id='cell-2-0'])[2]")
	private WebElement Fluid3;

	@FindBy(xpath = "(//*[@id='cell-3-0'])[2]")
	private WebElement Fluid4;

	@FindBy(xpath = "//*[text()='Binary 30 65']")
	private WebElement Chemical1;

	@FindBy(xpath = "//*[text()='Binary 30 65']")
	private WebElement Chemical2;

	@FindBy(xpath = "//*[text()='Binary 30 65']")
	private WebElement Chemical3;

	@FindBy(xpath = "//*[text()='Binary 30 65']")
	private WebElement Chemical4;

	@FindBy(xpath = "//*[text()=' Add ']")
	private WebElement addButton;

	@FindBy(xpath = "//td[@id='cell-0-1']")
	private WebElement FluidType;

	@FindBy(xpath = "//*[@id='cell-1-1']")
	private WebElement FluidType2;

	@FindBy(xpath = "//*[@id='cell-2-1']")
	private WebElement FluidType3;

	@FindBy(xpath = "//*[@id='cell-3-1']]")
	private WebElement FluidType4;

	@FindBy(xpath = "//*[@id='toast-container']")
	private WebElement successToastMessage;

	@FindBy(id = "proppantList")
	private WebElement proppantList;

	@FindBy(xpath = "//*[text()='Fluid Selection']")
	private WebElement fluidSelectionTab;

	@FindBy(xpath = "//*[text()='Chemical Selection']")
	private WebElement ChemicalSelectionTab;

	@FindBy(xpath = "(//td[@tabindex='-1'])[1]")
	private WebElement chemicalName1;

	@FindBy(xpath = "//td[@id='cell-1-0']")
	private WebElement chemialName2;

	@FindBy(xpath = "(//td[@tabindex='-1'])[9]")
	private WebElement chemialName3;

	@FindBy(xpath = "(//td[@tabindex='-1'])[13]")
	private WebElement chemialName4;

	@FindBy(xpath = "(//td[@tabindex='-1'])[2]")
	private WebElement AdditiveChannel;

	@FindBy(xpath = "(//td[@tabindex='-1'])[6]")
	private WebElement AdditiveChannel2;

	@FindBy(xpath = "(//td[@tabindex='-1'])[10]")
	private WebElement AdditiveChannel3;

	@FindBy(xpath = "(//td[@tabindex='-1'])[14]")
	private WebElement AdditiveChannel4;

	@FindBy(xpath = "(//td[@tabindex='-1'])[3]")
	private WebElement UnitColumn1;

	@FindBy(xpath = "(//td[@tabindex='-1'])[7]")
	private WebElement UnitColumn2;

	@FindBy(xpath = "(//td[@tabindex='-1'])[11]")
	private WebElement UnitColumn3;

	@FindBy(xpath = "(//td[@tabindex='-1'])[15]")
	private WebElement UnitColumn4;

	@FindBy(xpath = "//td[@id='cell-0-3']")
	private WebElement TypeColumn1;

	@FindBy(xpath = "(//td[@tabindex='-1'])[8]")
	private WebElement TypeColumn2;

	@FindBy(xpath = "(//td[@tabindex='-1'])[12]")
	private WebElement TypeColumn3;

	@FindBy(xpath = "(//td[@tabindex='-1'])[16]")
	private WebElement TypeColumn4;

	@FindBy(xpath = "//button[text()=' Add New Fluid to List ']")
	private WebElement addNewFluidToListButton;

	@FindBy(xpath = "")
	private WebElement addNewChemicalToListButton;

	@FindBy(id = "fluidTable")
	private WebElement fluidTable;

	@FindBy(id = "fluidTable")
	private WebElement ChemicalTable;

	@FindBy(id = "fluidList")
	private WebElement fluidList;

	@FindBy(id = "fluidList")
	private WebElement ChemicalList;

	@FindBy(id = "proppantType")
	private WebElement proppantType;

	@FindBy(id = "proppantAmount")
	private WebElement proppantAmount;

	@FindBy(id = "fluidType")
	private WebElement fluidType;

	@FindBy(id = "fluidAmount")
	private WebElement fluidAmount;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButtonFluid;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButtonProppant;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButtonChemical;

	public void navigateAndClickPadFromHomeScreen() {
		try {
			elementUtils.clickElement(padFromHomeScreen);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementWellFromOverview() {
		try {
			elementUtils.clickElement(wellFromOverview);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementMaterialSelectionOption() {
		try {
			WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
			expandMenu.click();
			Thread.sleep(2000);
			elementUtils.clickElement(materialSelectionOption);
			Thread.sleep(2000);
			WebElement CollapseMenu = driver.findElement(By.xpath("//img[@tooltip='Collapse']"));
			CollapseMenu.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementProppantSelectionTab() {
		try {
			elementUtils.clickElement(proppantSelectionTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementAddNewProppantToListButton() {
		try {
			elementUtils.clickElement(addNewProppantToListButton);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectProppantFromTable() {
		try {
			Actions action = new Actions(driver);
			action.click(Proppant1).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectSecondProppantFromTable() {
		try {
			Actions action = new Actions(driver);
			action.click(Proppant2).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectThirdProppantFromTable() {
		try {
			Actions action = new Actions(driver);
			action.click(Proppant3).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFourthProppantFromTable() {
		try {
			Actions action = new Actions(driver);
			action.click(Proppant4).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementAddButton() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(addButton);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void clickElementAddButtonFirstFluid() {
	// try {
	// Thread.sleep(2000);
	// elementUtils.clickElement(addButton);
	// Thread.sleep(3000);
	// elementUtils.clickElement(FluidType);
	// Action act=new Action(driver);
	// WebElement
	// FT1=driver.findElement(By.xpath("//td[text()='"+ReadData.readdata("modifiedPropertiesField")+"']"));
	// FT1.click();
	// elementUtils.clickElement(saveButtonFluid);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	public void clickElementAddButtonFirstFluid() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(addButton);
			Thread.sleep(5000);

			// Locate FluidType element
			WebElement FluidType = driver.findElement(By.xpath("//td[@id='cell-0-1']"));

			// Perform double click on FluidType
			Actions actions = new Actions(driver);
			actions.doubleClick(FluidType).perform();
			Thread.sleep(2000);
			// Then locate the dynamic element from Excel data
			WebElement FT1 = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("modifiedPropertiesField") + "']"));
			Thread.sleep(2000);
			elementUtils.clickElement(FT1);
			Thread.sleep(2000);
			// Save button after action
			elementUtils.clickElement(saveButtonFluid);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementAddButtonSecondFluid() {
		try {
			Thread.sleep(3000);
			elementUtils.clickElement(addButton);
			Thread.sleep(6000);
			WebElement FluidType2 = driver
					.findElement(By.xpath("//td[@id='cell-1-1']"));
			Thread.sleep(2000);
			// Perform double click on FluidType
			Actions actions = new Actions(driver);
			actions.doubleClick(FluidType2).perform();
			Thread.sleep(2000);
			// Then locate the dynamic element from Excel data
			WebElement FT2 = driver
					.findElement(By.xpath("(//td[text()='" + ReadData.readdata("modifiedPropertiesField") + "'])[2]"));
			Thread.sleep(2000);
			elementUtils.clickElement(FT2);
			Thread.sleep(2000);
			// Save button after action
			elementUtils.clickElement(saveButtonFluid);

			// WebElement
			// FT2=driver.findElement(By.xpath("(//td[text()='"+ReadData.readdata("modifiedPropertiesField")+"'])[2]"));
			// FT2.click();
			// elementUtils.clickElement(saveButtonFluid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementAddButtonThirdFluid() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(addButton);
			Thread.sleep(5000);
			WebElement FluidType3 = driver
					.findElement(By.xpath("//td[@id='cell-2-1']"));
			// Perform double click on FluidType
			Actions actions = new Actions(driver);
			actions.doubleClick(FluidType3).perform();
			Thread.sleep(2000);
			// Then locate the dynamic element from Excel data
			WebElement FT3 = driver.findElement(By.xpath("//td[text()='acid']"));
			Thread.sleep(2000);
			elementUtils.clickElement(FT3);
			Thread.sleep(2000);
			// Save button after action
			elementUtils.clickElement(saveButtonFluid);
			// Thread.sleep(3000);
			// elementUtils.clickElement(FluidType3);
			// WebElement
			// FT3=driver.findElement(By.xpath("(//td[text()='"+ReadData.readdata("modifiedPropertiesField")+"'])[3]"));
			// FT3.click();
			// elementUtils.clickElement(saveButtonFluid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementAddButtonFourthFluid() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(addButton);
			Thread.sleep(2000);
			WebElement FluidType4 = driver
					.findElement(By.xpath("//td[@id='cell-3-1']"));
			// Perform double click on FluidType
			Actions actions = new Actions(driver);
			actions.doubleClick(FluidType4).perform();
			Thread.sleep(2000);
			// Then locate the dynamic element from Excel data
			// WebElement FT4 = driver.findElement(
			// By.xpath("//td[text()='"+ReadData.readdata("modifiedPropertiesField")+"'])[3]")
			// );

			WebElement FT4 = driver
					.findElement(By.xpath("(//td[text()='" + ReadData.readdata("modifiedPropertiesField") + "'])[3]"));
			Thread.sleep(1000);
			elementUtils.clickElement(FT4);
			Thread.sleep(1000);
			// Save button after action
			elementUtils.clickElement(saveButtonFluid);
			Thread.sleep(2000);
			// elementUtils.clickElement(FluidType4);
			// WebElement
			// FT4=driver.findElement(By.xpath("(//td[text()='"+ReadData.readdata("modifiedPropertiesField")+"'])[4]"));
			// FT4.click();
			// elementUtils.clickElement(saveButtonFluid);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isSuccessToastMessageDisplayed() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(successToastMessage);
			Assert.assertTrue(isElementDisplayed, "Success toast message is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isProppantAddedToList() {
		try {
			// Thread.sleep(5000); //td[text()='"+ReadData.readdata("Proppant1")+"']
			WebElement proppant1 = driver
					.findElement(By.xpath("//td[text() ='" + ReadData.readdata("Proppant1") + "']"));
			String Actualproppant1 = proppant1.getText();
			String ExpectedProppant1 = ReadData.readdata("Proppant1");
			Thread.sleep(2000);
			Assert.assertEquals(Actualproppant1, ExpectedProppant1, "Proppant is not added to the list!");

			WebElement proppant2 = driver
					.findElement(By.xpath("//td[text() ='" + ReadData.readdata("Proppant2") + "']"));
			String ActualProppant2 = proppant2.getText();
			String ExpectedProppant2 = ReadData.readdata("Proppant2");
			Assert.assertEquals(ActualProppant2, ExpectedProppant2, "Proppant is not added to the list!");

			WebElement proppant3 = driver
					.findElement(By.xpath("//td[text() ='" + ReadData.readdata("Proppant3") + "']"));
			String ActualProppant3 = proppant3.getText();
			String ExpectedProppant3 = ReadData.readdata("Proppant3");
			Assert.assertEquals(ActualProppant3, ExpectedProppant3, "Proppant is not added to the list!");

			WebElement proppant4 = driver
					.findElement(By.xpath("//td[text() ='" + ReadData.readdata("Proppant4") + "']"));
			String ActualProppant4 = proppant4.getText();
			String ExpectedProppant4 = ReadData.readdata("Proppant4");
			Assert.assertEquals(ActualProppant4, ExpectedProppant4, "Proppant is not added to the list!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementFluidSelectionTab() {
		try {
			elementUtils.clickElement(fluidSelectionTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementChemicalSelectionTab() {
		try {
			Thread.sleep(3000);
			elementUtils.clickElement(ChemicalSelectionTab);
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EntersChemicalName() {
		try {

			elementUtils.doubleClickElement(chemicalName1);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[1]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Chemical1"));
			Thread.sleep(2000);
			elementUtils.clickElement(ChemicalSelectionTab);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void rightClickAndInsertRowBelowFirst() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			Actions actions = new Actions(driver);

			// Step 1: Wait for the cell and right-click on it
			WebElement cell = wait.until(
					ExpectedConditions.elementToBeClickable(
							By.xpath("//td[@id='cell-0-0']")));
			actions.contextClick(cell).perform();

			// Step 2: Wait for context menu option and click it
			WebElement insertRowBelow = wait.until(
					ExpectedConditions.elementToBeClickable(
							By.xpath("//div[text()='Insert row below']")));
			insertRowBelow.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EnterssecondChemicalName() {
		try {
			// elementUtils.doubleClickElement(chemialName2);
			Actions act1 = new Actions(driver);
			act1.doubleClick(chemialName2).perform();
			Thread.sleep(2000);
			WebElement Textarea1 = driver.findElement(By.xpath("//textarea[@class='handsontableInput']"));
			elementUtils.clearAndSendKeys(Textarea1, ReadData.readdata("Chemical2"));
			Thread.sleep(2000);
			// elementUtils.clickElement(ChemicalSelectionTab);
			// Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EntersThirdChemicalName() {
		try {

			elementUtils.doubleClickElement(chemialName3);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[1]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Chemical3"));
			Thread.sleep(2000);
			// elementUtils.clickElement(ChemicalSelectionTab);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void EntersFourthChemicalName() {
		try {

			elementUtils.doubleClickElement(chemialName4);
			WebElement Textarea = driver.findElement(By.xpath("(//*[@class='handsontableInput'])[1]"));
			elementUtils.clearAndSendKeys(Textarea, ReadData.readdata("Chemical4"));
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectAdditiveRateChannel() {
		try {
			elementUtils.clickElement(AdditiveChannel);
			WebElement ARC = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("AdditiveChannel1") + "']"));
			ARC.click();
			Thread.sleep(2000);
			elementUtils.clickElement(ChemicalSelectionTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectsecondAdditiveRateChannel() {
		try {
			elementUtils.clickElement(AdditiveChannel2);
			WebElement ARC = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("AdditiveChannel2") + "']"));
			ARC.click();
			Thread.sleep(2000);
			elementUtils.clickElement(ChemicalSelectionTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectThirdAdditiveRateChannel() {
		try {
			elementUtils.clickElement(AdditiveChannel3);
			WebElement ARC = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("AdditiveChannel3") + "']"));
			ARC.click();
			Thread.sleep(2000);
			elementUtils.clickElement(ChemicalSelectionTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFourthAdditiveRateChannel() {
		try {
			elementUtils.clickElement(AdditiveChannel4);
			WebElement ARC = driver
					.findElement(By.xpath("//td[text()='" + ReadData.readdata("AdditiveChannel4") + "']"));
			ARC.click();
			Thread.sleep(2000);
			elementUtils.clickElement(ChemicalSelectionTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUnitColumn() {
		try {
			elementUtils.doubleClickElement(UnitColumn1);
			Thread.sleep(1000);
			WebElement UC = driver.findElement(By.xpath("//td[text()='" + ReadData.readdata("Unitcolumn1") + "']"));
			UC.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectSecondUnitColumn() {
		try {
			elementUtils.doubleClickElement(UnitColumn2);
			Thread.sleep(2000);
			WebElement UC = driver.findElement(By.xpath("//td[text()='" + ReadData.readdata("Unitcolumn2") + "']"));
			UC.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectThirdUnitColumn() {
		try {
			elementUtils.doubleClickElement(UnitColumn3);
			Thread.sleep(1000);
			WebElement UC1 = driver
					.findElement(By.xpath("(//td[text()='" + ReadData.readdata("Unitcolumn3") + "'])[2]"));
			Thread.sleep(1000);
			UC1.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFourthUnitColumn() {
		try {
			elementUtils.doubleClickElement(UnitColumn4);
			Thread.sleep(1000);
			WebElement UC2 = driver
					.findElement(By.xpath("(//td[text()='" + ReadData.readdata("Unitcolumn4") + "'])[2]"));
			Thread.sleep(1000);
			UC2.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectTypeColumn() {
		try {
			WebElement arrow = driver.findElement(By.xpath("(//div[@class='htAutocompleteArrow'])[3]"));
			elementUtils.clickElement(arrow);
			// elementUtils.doubleClickElement(TypeColumn1);
			Thread.sleep(1000);
			WebElement option = driver.findElement(By.xpath("//td[text()='abrasive']"));
			elementUtils.clickElement(option);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectSecondTypeColumn() {
		try {
			elementUtils.doubleClickElement(TypeColumn2);
			Thread.sleep(1000);
			WebElement TC = driver.findElement(By.xpath("//td[text()='" + ReadData.readdata("TypeColumn2") + "']"));
			TC.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectThirdTypeColumn() {
		try {
			elementUtils.doubleClickElement(TypeColumn3);
			Thread.sleep(1000);
			WebElement TC = driver.findElement(By.xpath("//td[text()='" + ReadData.readdata("TypeColumn3") + "']"));
			TC.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFourthTypeColumn() {
		try {
			elementUtils.doubleClickElement(TypeColumn4);
			for (int i = 0; i < 80; i++) {
				TypeColumn4.sendKeys(Keys.ARROW_UP);
				Thread.sleep(200); // small delay for stability
			}
			WebElement TC = driver.findElement(By.xpath("//td[text()='" + ReadData.readdata("TypeColumn4") + "']"));
			TC.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementAddNewFluidToListButton() {
		try {
			elementUtils.clickElement(addNewFluidToListButton);
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementAddNewChemicalToListButton() {
		try {
			elementUtils.clickElement(addNewChemicalToListButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFluidFromTable() {
		try {
			Actions action = new Actions(driver);
			action.click(Fluid1).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectSecondFluidFromTable() {
		try {
			elementUtils.clickElement(Fluid2);
			// Actions action = new Actions(driver);
			// action.click(Fluid2).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectThirdFluidFromTable() {
		try {
			Actions action = new Actions(driver);
			action.click(Fluid3).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFourthFluidFromTable() {
		try {
			Actions action = new Actions(driver);
			action.click(Fluid4).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectChemicalFromTable() {
		try {
			elementUtils.clickElement(ChemicalTable);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isFluidAddedToList() {
		try {
			Thread.sleep(4000);
			WebElement fluid1 = driver.findElement(By.xpath("//td[@id='cell-0-0']"));
			String ActualFluid1 = fluid1.getText();
			String ExpectedFluid1 = ReadData.readdata("Fluid1");
			Assert.assertEquals(ActualFluid1, ExpectedFluid1, "Fluid is not added to the list!");

			WebElement fluid2 = driver.findElement(By.xpath("//td[@id='cell-1-0']"));
			String ActualFluid2 = fluid2.getText();
			String ExpectedFluid2 = ReadData.readdata("Fluid2");
			Assert.assertEquals(ActualFluid2, ExpectedFluid2, "Fluid is not added to the list!");

			WebElement fluid3 = driver.findElement(By.xpath("//td[@id='cell-2-0']"));
			String ActualFluid3 = fluid3.getText();
			String ExpectedFluid3 = ReadData.readdata("Fluid3");
			Assert.assertEquals(ActualFluid3, ExpectedFluid3, "Fluid is not added to the list!");

			WebElement fluid4 = driver.findElement(By.xpath("//td[@id='cell-3-0']"));
			String ActualFluid4 = fluid4.getText();
			String ExpectedFluid4 = ReadData.readdata("Fluid4");
			Assert.assertEquals(ActualFluid4, ExpectedFluid4, "Fluid is not added to the list!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isChemicalAddedToList() {
		try {
			Thread.sleep(2000);
			WebElement Chemical1 = driver.findElement(By.xpath("//td[@id='cell-0-0']"));
			String ActualChemical1 = Chemical1.getAttribute("innerText").trim();
			String ExpectedChemical1 = ReadData.readdata("Chemical1");
			Assert.assertEquals(ActualChemical1, ExpectedChemical1, "Chemical is not added to the list!");

			// WebElement Chemical2 =
			// driver.findElement(By.xpath("(//td[@tabindex='-1'])[5]"));
			// String ActualChemical2 = Chemical2.getAttribute("innerText").trim();
			// String ExpectedChemical2 = ReadData.readdata("Chemical2");
			// Assert.assertEquals(ActualChemical2, ExpectedChemical2, "Proppant is not
			// added to the list!");
			//
			// WebElement Chemical3 =
			// driver.findElement(By.xpath("(//td[@tabindex='-1'])[9]"));
			// String ActualChemical3 = Chemical3.getAttribute("innerText").trim();
			// String ExpectedChemical3 = ReadData.readdata("Chemical3");
			// Assert.assertEquals(ActualChemical3, ExpectedChemical3, "Proppant is not
			// added to the list!");
			//
			// WebElement Chemical4 =
			// driver.findElement(By.xpath("(//td[@tabindex='-1'])[13]"));
			// String ActualChemical4 = Chemical4.getAttribute("innerText").trim();
			// String ExpectedChemical4 = ReadData.readdata("Chemical4");
			// Assert.assertEquals(ActualChemical4, ExpectedChemical4, "Proppant is not
			// added to the list!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToAddProppantAndFluidPage() {
		driver.get("https://fracproplus-uat.linqx.com:9443/");
	}

	public void selectProppantType() {
		try {
			elementUtils.clickElement(proppantType);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterProppantAmount() {
		try {
			elementUtils.clearAndSendKeys(proppantAmount, "1000");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFluidType() {
		try {
			elementUtils.clickElement(fluidType);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterFluidAmount() {
		try {
			elementUtils.clearAndSendKeys(fluidAmount, "500");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementSaveButton() {
		try {
			Thread.sleep(5000);
			elementUtils.clickElement(saveButtonChemical);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isProppantAndFluidDetailsSaved() {
		try {
			boolean isElementDisplayed = elementUtils.isElementDisplayed(successToastMessage);
			Assert.assertTrue(isElementDisplayed, "Proppant and Fluid details are not saved successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}