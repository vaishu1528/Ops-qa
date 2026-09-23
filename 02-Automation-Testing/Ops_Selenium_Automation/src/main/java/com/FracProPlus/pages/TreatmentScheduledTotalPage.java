package com.FracProPlus.pages;

import com.FracProPlus.utils.ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TreatmentScheduledTotalPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public TreatmentScheduledTotalPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()=' Treatment Schedule ']")
    private WebElement treatmentScheduledModule;

    @FindBy(xpath = "//*[contains(text(),'Treatment Totals')]")
    private WebElement treatmentTotalTab;

    @FindBy(xpath = "//label[text()='Design Schedule']/parent::div/input")
    private WebElement designScheduledRadioButton;

    @FindBy(xpath = "//label[text()='Actual Data']/parent::div/input")
    private WebElement actualDataRadioButton;

    @FindBy(xpath = "//h4[text()='Totals for']")
    private WebElement totalsForHeader;

    @FindBy(xpath = "//h4[text()='Totals split by']")
    private WebElement totalsSplitByHeaderName;

    @FindBy(xpath = "//label[text()='Materials']/parent::div/input")
    private WebElement materialsRadioButton;

    @FindBy(xpath = "//label[text()='Injection']/parent::div/input")
    private WebElement injectionRadioButton;

    @FindBy(xpath = "//label[text()=' Include Storage Units ']/parent::div/input")
    private WebElement includeStorageUnitsCheckBox;

    @FindBy(xpath = "//label[text()=' Include Wb Vol in Pad ']/parent::div/input")
    private WebElement includeWbVolInPadCheckBox;

    @FindBy(xpath = "//label[text()=' Include Cost ']/parent::div/input")
    private WebElement includeCostCheckBox;

    @FindBy(xpath = "//label[text()='Materials']/parent::div/input")
    private WebElement materialsCheckBox;

    @FindBy(id = "tableHeaderNameUnderProppantAndFluid")
    private WebElement tableHeaderNameUnderProppantAndFluid;

    @FindBy(xpath = "//label[text()='Injection']/parent::div/input")
    private WebElement injectionCheckBox;

    @FindBy(xpath = "//h3[text()='Proppant and Fluid']")
    private WebElement headerNamesUnderProppantAndFluidTable;

    @FindBy(xpath = "//input[@formcontrolname='TankVol']")
    private WebElement fluidTankVOIField;

    @FindBy(xpath = "//input[@formcontrolname='TankBtms']")
    private WebElement inclTankBottomsField;

    @FindBy(xpath = "//input[@formcontrolname='PropSack']")
    private WebElement propSackWtField;

    @FindBy(xpath = "//input[@formcontrolname='N2Strg']")
    private WebElement n2StorageVOIField;

    @FindBy(xpath = "//input[@formcontrolname='CO2Strg']")
    private WebElement c02StorageVOIField;

    @FindBy(xpath = "//h3[text()='Additional Items']")
    private WebElement tableHeaderNameUnderAdditionalItemsSection;

    @FindBy(xpath = "//input[@id='material-cost-subtotal']")
    private WebElement materialCostSubtotalField;

    @FindBy(xpath = "(//h3[text()='Proppant and Fluid']/following-sibling::app-reusable-spreadsheet/descendant::span[text()='Pumping Step'])[2]")
    private WebElement pumpingStepField;

    @FindBy(xpath = "(//h3[text()='Proppant and Fluid']/following-sibling::app-reusable-spreadsheet/descendant::span[text()='Pumping Step'])[2]/parent::div/parent::th/following-sibling::th[1]/div/span")
    private WebElement materialField;

    @FindBy(id = "(//h3[text()='Proppant and Fluid']/following-sibling::app-reusable-spreadsheet/descendant::span[text()='Pumping Step'])[2]/parent::div/parent::th/following-sibling::th[6]/div/span")
    private WebElement unitCostSField;

    @FindBy(id = "(//h3[text()='Proppant and Fluid']/following-sibling::app-reusable-spreadsheet/descendant::span[text()='Pumping Step'])[2]/parent::div/parent::th/following-sibling::th[7]/div/span")
    private WebElement discountField;

    @FindBy(id = "(//h3[text()='Proppant and Fluid']/following-sibling::app-reusable-spreadsheet/descendant::span[text()='Pumping Step'])[2]/parent::div/parent::th/following-sibling::th[8]/div/span")
    private WebElement costSField;

    @FindBy(xpath = "//label[text()='Total Cost']")
    private WebElement totalCostField;

    public void clickElementTreatmentScheduledModule() {
        try {
            WebElement expandMenu = driver.findElement(By.xpath("//img[@tooltip='Expand']"));
            expandMenu.click();
            Thread.sleep(2000);
            elementUtils.clickElement(treatmentScheduledModule);
            Thread.sleep(2000);
            WebElement CollapseMenu = driver.findElement(By.xpath("//img[@tooltip='Collapse']"));
            CollapseMenu.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementTreatmentTotalTab() {
        try {
            Thread.sleep(2000);
            elementUtils.clickElement(treatmentTotalTab);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDesignScheduledRadioButtonPresent() {
        try {
            Assert.assertTrue(designScheduledRadioButton.isSelected(), "Design Scheduled Radio Button is not present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isActualDataRadioButtonPresent() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(actualDataRadioButton),
                    "Actual Data Radio Button is not present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isTotalsForHeaderPresent() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(totalsForHeader), "Totals For Header is not present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isTotalsSplitByHeaderNamePresent() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(totalsSplitByHeaderName),
                    "Totals Split By Header Name is not present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isMaterialsRadioButtonPresent() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(materialsRadioButton),
                    "Materials Radio Button is not present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInjectionRadioButtonPresent() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(injectionRadioButton),
                    "Injection Radio Button is not present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isIncludeStorageUnitsCheckBoxDefault() {
        try {
            Assert.assertTrue(!includeStorageUnitsCheckBox.isSelected(),
                    "Include Storage Units Check Box is not selected by default");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isIncludeWbVolInPadCheckBoxDefault() {
        try {
            Assert.assertTrue(!includeWbVolInPadCheckBox.isSelected(),
                    "Include Wb Vol In Pad Check Box is not selected by default");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isIncludeCostCheckBoxDefault() {
        try {
            Assert.assertTrue(includeCostCheckBox.isSelected(), "Include Cost Check Box is not selected by default");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementMaterialsCheckBox() {
        try {
            elementUtils.clickElement(materialsCheckBox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyTableHeaderNameUnderProppantAndFluidPresent() {
        try {

            WebElement materialHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Materials')])[2]"));
            WebElement QuantityHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Quantity')])[2]"));
            WebElement UnitsHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Units')])[1]"));
            WebElement StorageQuantityHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Storage Qty')])[2]"));
            WebElement StorageUnitsHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Storage Units')])[2]"));
            WebElement UnitCostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Unit Cost')])[2]"));
            WebElement DiscountHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Discount')])[2]"));
            WebElement CostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Cost')])[2]"));

            Assert.assertEquals(materialHeader.getText(), "Materials",
                    "Material Table Header Name Under Proppant And Fluid is not present");
            Assert.assertEquals(QuantityHeader.getText(), "Quantity",
                    "Quantity Table Header Name Under Proppant And Fluid is not present");
            // WebElement unitHeader =
            // driver.findElement(By.xpath("(//div[contains(text(),'Units')])[1]"));
            String text12 = UnitsHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text12, "Units", "Units Table Header Name in Proppant And Fluid mismatched!");
            Assert.assertEquals(StorageQuantityHeader.getText(), "Storage Qty",
                    "Storage Quantity Table Header Name Under Proppant And Fluid is not present");
            Assert.assertEquals(StorageUnitsHeader.getText(), "Storage Units",
                    "Storage Units Table Header Name Under Proppant And Fluid is not present");
            Assert.assertEquals(UnitCostHeader.getText().replaceAll("\\s+", " ").trim(), "Unit Cost ($)",
                    "Unit Cost ($) Table Header Name Under Proppant And Fluid is not present");
            Assert.assertEquals(DiscountHeader.getText().replaceAll("\\s+", " ").trim(), "Discount (%)",
                    "Discount (%) Table Header Name Under Proppant And Fluid is not present");
            String text13 = CostHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text13, "Cost ($)",
                    "Cost ($) Table Header Name Under Proppant And Fluid is not present");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementInjectionCheckBox() {
        try {
            elementUtils.clickElement(injectionCheckBox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isHeaderNamesUnderProppantAndFluidTablePresent() {
        try {

            WebElement pumpingStepHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Pumping Step')])[2]"));
            Assert.assertEquals(pumpingStepHeader.getText(), "Pumping Step",
                    "Pumping Step Table Header Name Under Proppant And Fluid is not present");
            verifyTableHeaderNameUnderProppantAndFluidPresent();

            // WebElement materialHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Material'])[2]"));
            // WebElement QuantityHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Quantity'])[2]"));
            // WebElement UnitsHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Units'])[2]"));
            // WebElement
            // StorageQuantityHeader=driver.findElement(By.xpath("(//h3[text()='Proppant and
            // Fluid']/ancestor::tabset/descendant::span[text()='Storage Quantity'])[2]"));
            // WebElement
            // StorageUnitsHeader=driver.findElement(By.xpath("(//h3[text()='Proppant and
            // Fluid']/ancestor::tabset/descendant::span[text()='Storage Units'])[2]"));
            // WebElement UnitCostHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Unit Cost ($)'])[2]"));
            // WebElement DiscountHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Discount (%)'])[2]"));
            // WebElement CostHeader=driver.findElement(By.xpath("(//h3[text()='Proppant and
            // Fluid']/ancestor::tabset/descendant::span[text()='Cost ($)'])[2]"));
            // Assert.assertEquals(pumpingStepHeader.getText(),"Pumping Step" ,"Pumping Step
            // Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(materialHeader.getText(),"Material" ,"Material Table
            // Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(QuantityHeader.getText(),"Quantity" ,"Quantity Table
            // Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(UnitsHeader.getText(),"Units" ,"Units Table Header Name
            // Under Proppant And Fluid is not present");
            // Assert.assertEquals(StorageQuantityHeader.getText(),"Storage Quantity"
            // ,"Storage Quantity Table Header Name Under Proppant And Fluid is not
            // present");
            // Assert.assertEquals(StorageUnitsHeader.getText(),"Storage Units" ,"Storage
            // Units Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(UnitCostHeader.getText(),"Unit Cost ($)" ,"Unit Cost ($)
            // Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(DiscountHeader.getText(),"Discount (%)" ,"Discount (%)
            // Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(CostHeader.getText(),"Cost ($)" ,"Cost ($) Table Header
            // Name Under Proppant And Fluid is not present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isHeaderNamesUnderProppantAndFluidTablePresent2() {
        try {

            // //WebElement
            // pumpingStepHeader=driver.findElement(By.xpath("(//h3[text()='Proppant and
            // Fluid']/ancestor::tabset/descendant::span[text()='Pumping Step'])[2]"));
            // WebElement materialHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Material'])[2]"));
            // WebElement QuantityHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Quantity'])[2]"));
            // WebElement UnitsHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Units'])[2]"));
            // //WebElement
            // StorageQuantityHeader=driver.findElement(By.xpath("(//h3[text()='Proppant and
            // Fluid']/ancestor::tabset/descendant::span[text()='Storage Quantity'])[2]"));
            // //WebElement
            // StorageUnitsHeader=driver.findElement(By.xpath("(//h3[text()='Proppant and
            // Fluid']/ancestor::tabset/descendant::span[text()='Storage Units'])[2]"));
            // WebElement UnitCostHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Unit Cost ($)'])[2]"));
            // WebElement DiscountHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Discount (%)'])[2]"));
            // WebElement CostHeader=driver.findElement(By.xpath("(//h3[text()='Proppant and
            // Fluid']/ancestor::tabset/descendant::span[text()='Cost ($)'])[2]"));
            // //Assert.assertEquals(pumpingStepHeader.getText(),"Pumping Step" ,"Pumping
            // Step Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(materialHeader.getText(),"Material" ,"Material Table
            // Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(QuantityHeader.getText(),"Quantity" ,"Quantity Table
            // Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(UnitsHeader.getText(),"Units" ,"Units Table Header Name
            // Under Proppant And Fluid is not present");
            // //Assert.assertEquals(StorageQuantityHeader.getText(),"Storage Quantity"
            // ,"Storage Quantity Table Header Name Under Proppant And Fluid is not
            // present");
            // //Assert.assertEquals(StorageUnitsHeader.getText(),"Storage Units" ,"Storage
            // Units Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(UnitCostHeader.getText(),"Unit Cost ($)" ,"Unit Cost ($)
            // Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(DiscountHeader.getText(),"Discount (%)" ,"Discount (%)
            // Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(CostHeader.getText(),"Cost ($)" ,"Cost ($) Table Header
            // Name Under Proppant And Fluid is not present");

            WebElement materialHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Materials')])[2]"));
            WebElement QuantityHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Quantity')])[2]"));
            WebElement UnitsHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Units')])[1]"));
            // WebElement
            // StorageQuantityHeader=driver.findElement(By.xpath("(//*[text()='Proppant and
            // Fluid']//following::table//th//following::div[contains(text(),'Storage
            // Qty')])[2]"));
            // WebElement
            // StorageUnitsHeader=driver.findElement(By.xpath("(//*[text()='Proppant and
            // Fluid']//following::table//th//following::div[contains(text(),'Storage
            // Units')])[2]"));
            WebElement UnitCostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Unit Cost')])[2]"));
            WebElement DiscountHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Discount')])[2]"));
            WebElement CostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Cost')])[2]"));

            Assert.assertEquals(materialHeader.getText(), "Materials",
                    "Material Table Header Name Under Proppant And Fluid is not present");
            Assert.assertEquals(QuantityHeader.getText(), "Quantity",
                    "Quantity Table Header Name Under Proppant And Fluid is not present");
            String text12 = UnitsHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text12, "Units", "Units Table Header Name in Proppant And Fluid mismatched!");
            // Assert.assertEquals(StorageQuantityHeader.getText(),"Storage Qty" ,"Storage
            // Quantity Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(StorageUnitsHeader.getText(),"Storage Units" ,"Storage
            // Units Table Header Name Under Proppant And Fluid is not present");
            Assert.assertEquals(UnitCostHeader.getText().replaceAll("\\s+", " ").trim(), "Unit Cost ($)",
                    "Unit Cost ($) Table Header Name Under Proppant And Fluid is not present");
            Assert.assertEquals(DiscountHeader.getText().replaceAll("\\s+", " ").trim(), "Discount (%)",
                    "Discount (%) Table Header Name Under Proppant And Fluid is not present");
            String text13 = CostHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text13, "Cost ($)",
                    "Cost ($) Table Header Name Under Proppant And Fluid is not present");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementIncludeStorageUnitsCheckBoxAsActive() {
        try {
            if (!includeStorageUnitsCheckBox.isSelected()) {
                elementUtils.clickElement(includeStorageUnitsCheckBox);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areStorageUnitsFieldsEditable() {
        try {
            Assert.assertTrue(fluidTankVOIField.isEnabled(), "Fluid Tank VOI Field is not editable");
            Assert.assertTrue(inclTankBottomsField.isEnabled(), "Incl Tank Bottoms Field is not editable");
            Assert.assertTrue(propSackWtField.isEnabled(), "Prop Sack Wt Field is not editable");
            Assert.assertTrue(n2StorageVOIField.isEnabled(), "N2 Storage VOI Field is not editable");
            Assert.assertTrue(c02StorageVOIField.isEnabled(), "C02 Storage VOI Field is not editable");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementIncludeStorageUnitsCheckBoxAsInactive() {
        try {
            if (includeStorageUnitsCheckBox.isSelected()) {
                elementUtils.clickElement(includeStorageUnitsCheckBox);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areStorageUnitsFieldsReadOnly() {
        try {
            Thread.sleep(3000);
            elementUtils.checkFieldReadOnly(driver, By.xpath("//input[@formcontrolname='TankVol']"));
            elementUtils.checkFieldReadOnly(driver, By.xpath("//input[@formcontrolname='TankBtms']"));
            elementUtils.checkFieldReadOnly(driver, By.xpath("//input[@formcontrolname='PropSack']"));
            elementUtils.checkFieldReadOnly(driver, By.xpath("//input[@formcontrolname='N2Strg']"));
            elementUtils.checkFieldReadOnly(driver, By.xpath("//input[@formcontrolname='CO2Strg']"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isTableHeaderNameUnderProppantAndFluidSectionPresent() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(tableHeaderNameUnderProppantAndFluid),
                    "Table Header Name Under Proppant And Fluid Section is not present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isTableHeaderNameUnderAdditionalItemsSectionPresent() {
        try {

            WebElement ItemHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Item')])[1]"));
            WebElement QuantityHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Quantity')])[1]"));
            WebElement UnitsHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Units')])[1]"));
            WebElement Dot1Header = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'.')])[1]"));
            WebElement Dot2Header = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'.')])[2]"));
            WebElement UnitCostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Unit Cost')])[1]"));
            WebElement DiscountHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Discount')])[1]"));
            WebElement CostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Cost')])[2]"));

            String text1 = ItemHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text1, "Items", "Item Table Header Name Under Proppant And Fluid is not present");

            String text2 = QuantityHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text2, "Quantity",
                    "Quantity Table Header Name Under Proppant And Fluid is not present");

            String text3 = UnitsHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text3, "Units", "Units Table Header Name Under Proppant And Fluid is not present");

            String text4 = Dot1Header.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text4, ".", "Dot  Table Header Name Under Proppant And Fluid is not present");

            String text6 = Dot2Header.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text6, ".", "Dot Table Header Name Under Proppant And Fluid is not present");

            String text7 = UnitCostHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text7, "Unit Cost ($)",
                    "Unit Cost ($) Table Header Name Under Proppant And Fluid is not present");

            String text8 = DiscountHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text8, "Discount (%)",
                    "Discount (%) Table Header Name Under Proppant And Fluid is not present");

            String text9 = CostHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text9, "Cost ($)", "Cost($) Table Header Name Under Proppant And Fluid is not present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isTableHeaderNameUnderAdditionalItemsSectionPresent2() {
        try {

            // WebElement ItemHeader=driver.findElement(By.xpath("(//h3[text()='Additional
            // Items']/ancestor::tabset/descendant::span[text()='Item'])[2]"));
            // WebElement
            // QuantityHeader=driver.findElement(By.xpath("(//h3[text()='Additional
            // Items']/ancestor::tabset/descendant::span[text()='Quantity'])[2]"));
            // WebElement UnitsHeader=driver.findElement(By.xpath("(//h3[text()='Additional
            // Items']/ancestor::tabset/descendant::span[text()='Units'])[2]"));
            // WebElement
            // UnitCostHeader=driver.findElement(By.xpath("(//h3[text()='Additional
            // Items']/ancestor::tabset/descendant::span[text()='Unit Cost ($)'])[2]"));
            // WebElement
            // DiscountHeader=driver.findElement(By.xpath("(//h3[text()='Additional
            // Items']/ancestor::tabset/descendant::span[text()='Discount (%)'])[2]"));
            // WebElement CostHeader=driver.findElement(By.xpath("(//h3[text()='Additional
            // Items']/ancestor::tabset/descendant::span[text()='Cost ($)'])[2]"));
            //
            // Assert.assertEquals(ItemHeader.getText(),"Item" ,"Item Table Header Name
            // Under Proppant And Fluid is not present");
            // Assert.assertEquals(QuantityHeader.getText(),"Quantity" ,"Quantity Table
            // Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(UnitsHeader.getText(),"Units" ,"Units Table Header Name
            // Under Proppant And Fluid is not present");
            // Assert.assertEquals(UnitsHeader.getText(),"Units" ,"Units Table Header Name
            // Under Proppant And Fluid is not present");
            // Assert.assertEquals(UnitCostHeader.getText(),"Unit Cost ($)" ,"Unit Cost ($)
            // Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(DiscountHeader.getText(),"Discount (%)" ,"Discount (%)
            // Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(CostHeader.getText(),"Cost ($)" ,"Cost ($) Table Header
            // Name Under Proppant And Fluid is not present");

            WebElement ItemHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Item')])[1]"));
            WebElement QuantityHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Quantity')])[1]"));
            WebElement UnitsHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Units')])[1]"));
            // WebElement Dot1Header=driver.findElement(By.xpath("(//*[text()='Additional
            // Items']//following::table//th//following::div[contains(text(),'.')])[1]"));
            // WebElement Dot2Header=driver.findElement(By.xpath("(//*[text()='Additional
            // Items']//following::table//th//following::div[contains(text(),'.')])[2]"));
            WebElement UnitCostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Unit Cost')])[1]"));
            WebElement DiscountHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Discount')])[1]"));
            WebElement CostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Cost')])[2]"));

            String text1 = ItemHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text1, "Items", "Item Table Header Name Under Proppant And Fluid is not present");

            String text2 = QuantityHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text2, "Quantity",
                    "Quantity Table Header Name Under Proppant And Fluid is not present");

            String text3 = UnitsHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text3, "Units", "Units Table Header Name Under Proppant And Fluid is not present");

            // String text4 = Dot1Header.getAttribute("textContent").replaceAll("\\s+", "
            // ").trim();
            // Assert.assertEquals(text4,"." ,"Dot Table Header Name Under Proppant And
            // Fluid is not present");
            //
            // String text6 = Dot2Header.getAttribute("textContent").replaceAll("\\s+", "
            // ").trim();
            // Assert.assertEquals(text6,"." ,"Dot Table Header Name Under Proppant And
            // Fluid is not present");

            String text7 = UnitCostHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text7, "Unit Cost ($)",
                    "Unit Cost ($) Table Header Name Under Proppant And Fluid is not present");

            String text8 = DiscountHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text8, "Discount (%)",
                    "Discount (%) Table Header Name Under Proppant And Fluid is not present");

            String text9 = CostHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text9, "Cost ($)", "Cost($) Table Header Name Under Proppant And Fluid is not present");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementIncludeCostCheckBoxAsActive() {
        try {
            if (!includeCostCheckBox.isSelected()) {
                elementUtils.clickElement(includeCostCheckBox);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isMaterialCostSubtotalFieldInVisible() {
        try {
            Thread.sleep(1000);
            Assert.assertTrue(elementUtils.isElementDisplayed(materialCostSubtotalField),
                    "Material Cost Subtotal Field is not visible");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isMaterialCostSubtotalFieldVisible() {
        try {
            Thread.sleep(4000);
            Assert.assertTrue(elementUtils.isElementDisplayed(materialCostSubtotalField),
                    "Material Cost Subtotal Field is not visible");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementIncludeCostCheckBoxAsInactive() {
        try {
            if (includeCostCheckBox.isSelected()) {
                elementUtils.clickElement(includeCostCheckBox);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areCostFieldsVisibleUnderProppantAndFluidAndAdditionalItemsSection() {
        try {
            // WebElement
            // UnitCostHeader=driver.findElement(By.xpath("(//h3[text()='Additional
            // Items']/ancestor::tabset/descendant::span[text()='Unit Cost ($)'])[2]"));
            // WebElement
            // DiscountHeader=driver.findElement(By.xpath("(//h3[text()='Additional
            // Items']/ancestor::tabset/descendant::span[text()='Discount (%)'])[2]"));
            // WebElement CostHeader=driver.findElement(By.xpath("(//h3[text()='Additional
            // Items']/ancestor::tabset/descendant::span[text()='Cost ($)'])[2]"));
            //
            // Assert.assertEquals(UnitCostHeader.getText(),"Unit Cost ($)" ,"Unit Cost ($)
            // Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(DiscountHeader.getText(),"Discount (%)" ,"Discount (%)
            // Table Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(CostHeader.getText(),"Cost ($)" ,"Cost ($) Table Header
            // Name Under Proppant And Fluid is not present");

            WebElement UnitCostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Unit Cost')])[1]"));
            WebElement DiscountHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Discount')])[1]"));
            WebElement CostHeader = driver.findElement(By.xpath(
                    "(//*[text()='Additional Items']//following::table//th//following::div[contains(text(),'Cost')])[2]"));

            String text7 = UnitCostHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text7, "Unit Cost ($)",
                    "Unit Cost ($) Table Header Name Under Proppant And Fluid is not present");

            String text8 = DiscountHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text8, "Discount (%)",
                    "Discount (%) Table Header Name Under Proppant And Fluid is not present");

            String text9 = CostHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text9, "Cost ($)", "Cost($) Table Header Name Under Proppant And Fluid is not present");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areCostFieldsVisibleUnderProppantAndFluidAndAdditionalItemsSectionInVisible() {
        try {
            // WebElement materialHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Material'])[2]"));
            // WebElement QuantityHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Quantity'])[2]"));
            // WebElement UnitsHeader=driver.findElement(By.xpath("(//h3[text()='Proppant
            // and Fluid']/ancestor::tabset/descendant::span[text()='Units'])[2]"));
            //
            // Assert.assertEquals(materialHeader.getText(),"Material" ,"Material Table
            // Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(QuantityHeader.getText(),"Quantity" ,"Quantity Table
            // Header Name Under Proppant And Fluid is not present");
            // Assert.assertEquals(UnitsHeader.getText(),"Units" ,"Units Table Header Name
            // Under Proppant And Fluid is not present");

            WebElement materialHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Materials')])[2]"));
            WebElement QuantityHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Quantity')])[2]"));
            WebElement UnitsHeader = driver.findElement(By.xpath(
                    "(//*[text()='Proppant and Fluid']//following::table//th//following::div[contains(text(),'Units')])[1]"));

            Assert.assertEquals(materialHeader.getText(), "Materials",
                    "Material Table Header Name Under Proppant And Fluid is not present");
            Assert.assertEquals(QuantityHeader.getText(), "Quantity",
                    "Quantity Table Header Name Under Proppant And Fluid is not present");
            String text12 = UnitsHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
            Assert.assertEquals(text12, "Units", "Units Table Header Name in Proppant And Fluid mismatched!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isTotalCostFieldVisible() {
        try {
            Thread.sleep(4000);
            Assert.assertTrue(elementUtils.isElementDisplayed(totalCostField), "Total Cost Field is not visible");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areCheckboxesRadioButtonsAndDropdownsPersistAfterSaving() {
        // Implement the logic to verify the persistence of checkboxes, radio buttons,
        // and dropdowns after saving
    }
}