package com.FracProPlus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.FracProPlus.utils.ElementUtils;

public class MaterialUsagePage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public MaterialUsagePage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	By materialUsageModule = By.xpath("//span[text()='Material Usage']");
	By displayPRCplotButton = By.xpath("//button[text()=' Display PRC Plot ']");
	By clearDesignBtn = By.xpath("//button[text()=' Clear Design ']");
	By clearMeteredBtn = By.xpath("//button[text()=' Clear Metered ']");
	By clearActualsBtn = By.xpath("//button[text()=' Clear Actuals ']");
	By clearTotalField = By.xpath("//label[text()='Clean totals']/parent::div/div/input");
	By selectPlotDropdown = By.xpath(
			"(//label[text()='Select Plot'])[1]/parent::div/ng-select/div/div/div/following-sibling::div/following-sibling::div/input");

	public void clickElementMaterialUsageModule() {
		try {
			Thread.sleep(2000);
			WebElement materialUsage = driver.findElement(By.xpath("//a[text()=' Material Usage ']"));
			elementUtils.clickElement(materialUsage);
		} catch (Exception z) {
			z.printStackTrace();
		}
	}

//	public void verifyChemicalH4eaderNames() {
//		try {
//		Thread.sleep(1000);
//		Assert.assertEquals(driver.findElement(By.xpath("(//span[text()='Chemical Name'])[2]")).getText(), "Chemical Name","Chemical header name mismatched");
//		Assert.assertEquals(driver.findElement(By.xpath("(//span[text()='Design Totals'])[2]")).getText(), "Design Totals","Design Totals name mismatched");
//		Assert.assertEquals(driver.findElement(By.xpath("(//span[text()='Metered Totals'])[2]")).getText(), "Metered Totals","Metered Totals name mismatched");
//		Assert.assertEquals(driver.findElement(By.xpath("(//span[text()='Actual Totals'])[2]")).getText(), "Actual Totals","Actual Totals name mismatched");
//		Assert.assertEquals(driver.findElement(By.xpath("(//span[text()='As Pumped'])[2]")).getText(), "As Pumped","As Pumped name mismatched");
//		Assert.assertEquals(driver.findElement(By.xpath("(//span[text()='Unit'])[2]")).getText(), "Unit","unit name mismatched");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public void verifyChemicalHeaderNames() {
		try {
			Thread.sleep(1000); // You can adjust this if needed, but avoid using Thread.sleep in production
								// code
			String[] x = { "Chemical Name", "Design Totals", "Metered Totals", "Actual Totals", "As Pumped", "Unit" };
			String[] y = { "Chemical header name mismatched", "Design Totals name mismatched",
					"Metered Totals name mismatched", "Actual Totals name mismatched", "As Pumped name mismatched",
					"unit name mismatched" };

			for (int i = 0; i < x.length; i++) {
				// Updated XPath targeting the th elements containing the header text
				String z = "(//div[contains(text(),'" + x[i] + "')])[2]";
				Assert.assertEquals(driver.findElement(By.xpath(z)).getText(), x[i], y[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProppantHeaderNames() {
		try {
			String[] x = { "Proppant Name", "Design Totals (lbs)", "Metered Totals (lbs)", "Actual Totals (lbs)" };
			String[] y = { "Proppant header name mismatched", "Design Totals(lbs) name mismatched",
					"Metered Totals(lbs) name mismatched", "Actual Totals(lbs) name mismatched" };

			for (int i = 0; i < x.length; i++) {
				// Updated XPath targeting the div elements containing the header text
				String z = "(//div[contains(text(),'" + x[i] + "')])[2]";
				Assert.assertEquals(driver.findElement(By.xpath(z)).getText(), x[i], y[i]);
			}
		} catch (Exception z) {
			z.printStackTrace();
		}
	}

	public void verifyAcidHeaderNames() {
		try {
			String[] h = { "Acid Name", "Design Total (gal)", "Actual Total (gal)" };
			String[] m = { "Acid Name header name mismatched", "Design Total(gal) name mismatched",
					"Actual Total(gal) name mismatched" };

			for (int i = 0; i < h.length; i++) {
				String x = "(//div[contains(text(),'" + h[i] + "')])[2]";
				Assert.assertEquals(driver.findElement(By.xpath(x)).getText(), h[i], m[i]);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private By chemicalDesignTotalField = By.xpath("(//td[@id='cell-0-1'])[2]");
	private By chemicalMeteredTotalField = By.xpath("(//td[@id='cell-0-2'])[1]");
	private By chemicalActualTotalField = By.xpath("(//td[@id='cell-0-3'])[1]");

	private By proppantDesignTotalField = By.xpath("(//td[@id='cell-0-1'])[3]");
	private By proppantMeteredTotalField = By.xpath("(//td[@id='cell-0-2'])[2]");
	private By proppantActualTotalField = By.xpath("(//td[@id='cell-0-3'])[2]");

	private By acidNameField = By.xpath("(//td[@id='cell-0-0'])[4]");
	private By acidDesignTotalField = By.xpath("(//td[@id='cell-0-1'])[4]");
	private By acidActualTotalField = By.xpath("(//td[@id='cell-0-2'])[3]");

	private By cleanTotalField = By.xpath("//input[@formcontrolname='cleanTotal']");
	private By displayPRCPlotButton = By.xpath("//button[text()=' Display PRC Plot ']");

	private By saveButton = By.xpath("//button[text()=' Save ']");
	private By clearDesignButton = By.xpath("//button[text()=' Clear Design ']");
	private By clearMeteredButton = By.xpath("//button[text()=' Clear Metered ']");
	private By clearActualsButton = By.xpath("//button[text()=' Clear Actuals ']");

	// ===== Actions =====
	public void enterChemicalDesignTotal(String value) {
		elementUtils.doubleClickElement(driver.findElement(chemicalDesignTotalField));
		WebElement hansdson=driver.findElement(By.xpath("//textarea[@class='handsontableInput']"));
		hansdson.clear();
		hansdson.sendKeys(value);
	}

	public void enterChemicalMeteredTotal(String value)throws InterruptedException {
		elementUtils.doubleClickElement(driver.findElement(chemicalMeteredTotalField));
		Thread.sleep(2000);
		WebElement hansdson=driver.findElement(By.xpath("//textarea[@class='handsontableInput']"));
		hansdson.clear();
		hansdson.sendKeys(value);
	}

	public void enterChemicalActualTotal(String value)throws InterruptedException {
		elementUtils.doubleClickElement(driver.findElement(chemicalActualTotalField));
		Thread.sleep(2000);
		WebElement hansdson=driver.findElement(By.xpath("//textarea[@class='handsontableInput']"));
		hansdson.clear();
		hansdson.sendKeys(value);
	}

	public void enterProppantDesignTotal(String value) throws InterruptedException{
		elementUtils.doubleClickElement(driver.findElement(proppantDesignTotalField));
		Thread.sleep(2000);
		WebElement hansdson=driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[2]"));
		hansdson.clear();
		hansdson.sendKeys(value);
	
	}

	public void enterProppantMeteredTotal(String value)throws InterruptedException {
		elementUtils.doubleClickElement(driver.findElement(proppantMeteredTotalField));
		Thread.sleep(2000);
		WebElement hansdson=driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[2]"));
		hansdson.clear();
		hansdson.sendKeys(value);
	}

	public void enterProppantActualTotal(String value)throws InterruptedException {
		elementUtils.doubleClickElement(driver.findElement(proppantActualTotalField));
		Thread.sleep(2000);
		WebElement hansdson=driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[2]"));
		hansdson.clear();
		hansdson.sendKeys(value);
	}

	public void enterAcidActualTotal(String value)throws InterruptedException {
		elementUtils.doubleClickElement(driver.findElement(acidActualTotalField));
		Thread.sleep(2000);
		WebElement hansdson=driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[4]"));
		hansdson.clear();
		hansdson.sendKeys(value);
	}

	public void enterAcidDesignTotal(String value)throws InterruptedException {
		elementUtils.doubleClickElement(driver.findElement(acidDesignTotalField));
		Thread.sleep(2000);
		WebElement hansdson=driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[4]"));
		hansdson.clear();
		hansdson.sendKeys(value);
	}

	public void enterAcidName(String acidName) throws InterruptedException {
		elementUtils.doubleClickElement(driver.findElement(acidNameField));
		Thread.sleep(2000);
		WebElement hansdson=driver.findElement(By.xpath("(//textarea[@class='handsontableInput'])[3]"));
		hansdson.clear();
		hansdson.sendKeys(acidName);
		
	}

	public void enterCleanTotal(String value) {
		driver.findElement(cleanTotalField).clear();
		driver.findElement(cleanTotalField).sendKeys(value);
	}

	public void selectPlotOption() throws InterruptedException {
		WebElement dropdown = driver.findElement(selectPlotDropdown);
		dropdown.click();
		Thread.sleep(1000);
		dropdown.findElement(By.xpath("(//span[text()='Surf PRC'])[2]")).click();
	}

	public boolean isPRCPlotButtonDisplayed() {
		return driver.findElement(displayPRCPlotButton).isDisplayed();
	}

	public void clickSaveButton() {
		driver.findElement(saveButton).click();
	}

	public void clickClearDesignButton() {
		driver.findElement(clearDesignButton).click();
	}

	public void clickClearMeteredButton() {
		driver.findElement(clearMeteredButton).click();
	}

	public void clickClearActualsButton() {
		driver.findElement(clearActualsButton).click();
	}

	// ===== Verification Methods =====
	public boolean isChemicalDesignCleared() {
		return driver.findElement(chemicalDesignTotalField).getAttribute("value").isEmpty();
	}

	public boolean isChemicalMeteredCleared() {
		return driver.findElement(chemicalMeteredTotalField).getAttribute("value").isEmpty();
	}

	public boolean isChemicalActualCleared() {
		return driver.findElement(chemicalActualTotalField).getAttribute("value").isEmpty();
	}

	public boolean isProppantDesignCleared() {
		return driver.findElement(proppantDesignTotalField).getAttribute("value").isEmpty();
	}

	public boolean isProppantMeteredCleared() {
		return driver.findElement(proppantMeteredTotalField).getAttribute("value").isEmpty();
	}

	public boolean isProppantActualCleared() {
		return driver.findElement(proppantActualTotalField).getAttribute("value").isEmpty();
	}
}
