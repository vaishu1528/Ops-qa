package com.FracProPlus.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class PathsummaryPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public PathsummaryPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	private WebElement pageHeaderName;

	@FindBy(xpath = "//span[text()='Path Summary']")
	private WebElement pathSummaryTab;

	@FindBy(xpath = "//span[text()='Path Summary']")
	private WebElement tableHeaderUnderPathSummaryTab;

	@FindBy(id = "valuesInTableUnderPathSummaryTab")
	private WebElement valuesInTableUnderPathSummaryTab;

	@FindBy(id = "rowReadOnlyBehavior")
	private WebElement rowReadOnlyBehavior;

	@FindBy(xpath = "//input[@id='fracStringVolume']")
	private WebElement fracStringVolumeField;

	@FindBy(xpath = "//label[text()=' Frac String Partly Full ']/parent::div/input")
	private WebElement fracStringPartlyFullRadioButton;

	@FindBy(xpath = "//label[text()=' Frac String Full ']/parent::div/input")
	private WebElement fracStringFullRadioButton;

	@FindBy(xpath = "//label[text()=' Frac String Full ']")
	private WebElement fracStringFullRadioButtonName;

	@FindBy(xpath = "//label[text()=' Frac String Partly Full ']")
	private WebElement fracStringPartlyFullRadioButtonName;

	@FindBy(xpath = "//input[@id='aboveTopPerf']")
	private WebElement flushAboveTopPerfField;

	@FindBy(xpath = "//button[text()=' Recalculate ']")
	private WebElement recalculateButton;

	@FindBy(xpath = "//label[text()=' Injection is Down ']/parent::div/ng-select")
	private WebElement injectionIsDownDropdown;

	@FindBy(xpath = "//label[text()=' Common Manifold ']/parent::div/input")
	private WebElement commonManifoldRadioButton;

	@FindBy(xpath = "//label[text()=' Isolated ']/parent::div/input")
	private WebElement isolatedRadioButton;

	@FindBy(xpath = "//input[@id='useBottomHole']")
	private WebElement useBottomHoleCheckBox;

	@FindBy(xpath = "//label[text()=' MD for Well Transit Time ']/parent::div/div/input")
	private WebElement mdForWellTransitTimeField;

	@FindBy(xpath = "//label[text()=' Flush Above Top Perf ']/parent::div/div/input")
	private WebElement flushAboveTopPerfFieldId;

	public void verifyPageHeaderName() {
		try {
			String actualName = elementUtils.getElementText(pageHeaderName);
			String expectedHeaderName = "Expected Header Name"; // Replace with actual expected header name
			Assert.assertEquals(actualName, expectedHeaderName, "Page header name does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementPathSummaryTab() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(pathSummaryTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTableHeaderUnderPathSummaryTab() {
		try {
			Thread.sleep(2000);
			WebElement header1=driver.findElement(By.xpath("//label[text()=' Use Bottom Hole ']"));
			String actualHeader1 = header1.getAttribute("innerText").trim();
			String expectedHeader1 = "Use Bottom Hole"; 
			Assert.assertEquals(actualHeader1, expectedHeader1, "Use Bottom Hole button under path summary tab is not present!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


	public void verifyValuesInTableUnderPathSummaryTab() {
		try {
			String actualValues = elementUtils.getElementText(valuesInTableUnderPathSummaryTab);
			String expectedValues = "Expected Values"; // Replace with actual expected values
			Assert.assertEquals(actualValues, expectedValues, "Values in table under path summary tab do not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyRowReadOnlyBehavior() {
		try {
			By elementClickable=By.xpath("((//span[text()='1']/parent::div)[2]/parent::th/parent::tr/td)[1]");
			elementUtils.isElementClickable(driver, elementClickable);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isFracStringVolumeFieldEnabled() {
		try {
			Assert.assertTrue(fracStringVolumeField.isEnabled(), "Frac string volume field is not enabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementFracStringPartlyFullRadioButton() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(fracStringPartlyFullRadioButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementFracStringFullRadioButton() {
		try {
			Thread.sleep(2000);
			elementUtils.clickElement(fracStringFullRadioButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFieldNamesInBottomRightCard() {
		try {
			Thread.sleep(2000);
			WebElement stringPartlyFull=driver.findElement(By.xpath("//label[text()=' Frac String Partly Full ']"));
			Actions act=new Actions(driver);
			act.scrollToElement(stringPartlyFull).perform();
			String actualstringPartlyFull=stringPartlyFull.getText();
			String expectedstringPartlyFull="Frac String Partly Full";
			Assert.assertEquals(actualstringPartlyFull, expectedstringPartlyFull, "Field names not match of frac string partly full");
			
			WebElement fracStringFull=driver.findElement(By.xpath("//label[text()=' Frac String Full ']"));
			String actualfracStringFull=fracStringFull.getText();
			String expectedfracStringFull="Frac String Full";
			Assert.assertEquals(actualfracStringFull, expectedfracStringFull, "Field names not match of frac string full");
			
			WebElement FlushAboveTopPerf=driver.findElement(By.xpath("//label[text()=' Flush Above Top Perf ']"));
			String actualFlushAboveTopPerf=FlushAboveTopPerf.getText();
			String expectedFlushAboveTopPerf="Flush Above Top Perf";
			Assert.assertEquals(actualFlushAboveTopPerf, expectedFlushAboveTopPerf, "Field names not match of Flush Above Top Perf");
			
			WebElement TotalFracStringVolume=driver.findElement(By.xpath("//label[text()=' Total Frac String Volume ']"));
			String actualTotalFracStringVolume=TotalFracStringVolume.getText();
			String expectedTotalFracStringVolume="Total Frac String Volume";
			Assert.assertEquals(actualFlushAboveTopPerf, expectedFlushAboveTopPerf, "Field names not match of Total Frac String Volume");
			
			WebElement FracStringVolume=driver.findElement(By.xpath("//label[text()=' Frac String Volume ']"));
			String actualFracStringVolume=FracStringVolume.getText();
			String expectedFracStringVolume="Frac String Volume";
			Assert.assertEquals(actualFracStringVolume, expectedFracStringVolume, "Field names not match of Frac String Volume");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFracStringVolumeField() {
		try {
		WebElement FSVInputField=driver.findElement(By.xpath("//label[text()=' Frac String Volume ']/parent::div/div/input"));
		Actions action=new Actions(driver);
		action.scrollToElement(FSVInputField).perform();
		action.doubleClick(FSVInputField).perform();
		Thread.sleep(1000);
		elementUtils.clearAndSendKeys(FSVInputField, ReadData.readDataFromExcel("FracStringVolumeFieldValue")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterDataIntoFlushAboveTopPerfField() {
		try { 
			Thread.sleep(2000);
			WebElement FATPInputField=driver.findElement(By.xpath("//label[text()=' Flush Above Top Perf ']/parent::div/div/input"));
			Actions action=new Actions(driver);
			action.scrollToElement(FATPInputField).perform();
			elementUtils.clearAndSendKeys(FATPInputField, ReadData.readDataFromExcel("FlushAboveTopPerfFieldValue")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementRecalculateButton() {
		try {
			elementUtils.clickElement(recalculateButton);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUserRemainsOnSameScreen() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickElementInjectionIsDownDropdown() {
		try {
			elementUtils.clickElement(injectionIsDownDropdown);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDefaultValueIsCasing() {
		try {
			WebElement casing=driver.findElement(By.xpath("//label[text()=' Injection is Down ']/parent::div/ng-select/div/div/descendant::span[text()='Casing']"));
			String actualValue1 = casing.getText();
			String expectedValue1 = "Casing"; 
			Assert.assertEquals(actualValue1, expectedValue1, "Default value is not casing!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


//	public void selectTubingAndAnnulusOption() {
//		try {
//			Thread.sleep(5000);
//			injectionIsDownDropdown.sendKeys(Keys.ARROW_DOWN);
//			injectionIsDownDropdown.sendKeys(Keys.ARROW_DOWN);
//			WebElement tubingAndAnnulus=driver.findElement(By.xpath("//div[text()=' Tubing and Annulus ']"));
//			elementUtils.clickElement(tubingAndAnnulus); 
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public void selectTubingAndAnnulusOption() {
	    try {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        // Open dropdown
	        elementUtils.clickElement(injectionIsDownDropdown);

	        // Locate option
	        WebElement tubingAndAnnulus = wait.until(
	                ExpectedConditions.presenceOfElementLocated(
	                        By.xpath("//div[normalize-space()='Tubing and Annulus']")
	                )
	        );

	        // Scroll option into view
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].scrollIntoView(true);", tubingAndAnnulus);

	        // Click option
	        wait.until(ExpectedConditions.elementToBeClickable(tubingAndAnnulus)).click();

	    } catch (Exception e) {
	        throw new RuntimeException("Failed to select Tubing and Annulus option", e);
	    }
	}


	public void verifyCommonManifoldAndIsolatedRadioButtonsEnabled() {
		try {
			Thread.sleep(3000);
			Assert.assertTrue(commonManifoldRadioButton.isEnabled(), "Common manifold radio button is not enabled!");
			Assert.assertTrue(isolatedRadioButton.isEnabled(), "Isolated radio button is not enabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyUseBottomHoleCheckBoxEnabledByDefault() {
		try {
			Assert.assertTrue(useBottomHoleCheckBox.isSelected(),
					"Use bottom hole check box is not enabled by default!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isMDForWellTransitTimeFieldEnabled() {
		try {
			boolean  isFieldEditable= !mdForWellTransitTimeField.getAttribute("disabled").equals("true") && !mdForWellTransitTimeField.getAttribute("readonly").equals("true");
			Assert.assertFalse(isFieldEditable, "The input field is editable, but it should not be");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void isTotalFracStringVolumeFieldEnabled() {
		try {
			Thread.sleep(2000);
			WebElement w1=driver.findElement(By.xpath("//label[text()=' Total Frac String Volume ']/parent::div/div/input"));
			boolean  isFieldEditable1= !w1.getAttribute("disabled").equals("true") && !w1.getAttribute("readonly").equals("true");
			Assert.assertFalse(isFieldEditable1, "The input field is editable, but it should not be");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void isFlushVolumeFieldEnabled() {
		try {
			Thread.sleep(2000);
			WebElement w2=driver.findElement(By.xpath("//label[text()=' Flush Volume ']/parent::div/div/input"));
			boolean  isFieldEditable2= !w2.getAttribute("disabled").equals("true") && !w2.getAttribute("readonly").equals("true");
			Assert.assertFalse(isFieldEditable2, "The input field is editable, but it should not be");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void isFracStringVolumeFieldEnabledInputField() {
		try {
			Thread.sleep(2000);
			WebElement w3=driver.findElement(By.xpath("//label[text()=' Frac String Volume ']/parent::div/div/input"));
			boolean  isFieldEditable3= !w3.getAttribute("disabled").equals("true") && !w3.getAttribute("readonly").equals("true");
			Assert.assertFalse(isFieldEditable3, "The input field is editable, but it should not be");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterValueMDForWellTransitTimeField() {
		try {
			Thread.sleep(1000);
			elementUtils.clearAndSendKeys(mdForWellTransitTimeField, ReadData.readDataFromExcel("mdForWellTransitTimeFieldValue")); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void uncheckUseBottomHoleCheckBox() {
		try {
			if (useBottomHoleCheckBox.isSelected()) {
				Thread.sleep(1000);
				elementUtils.clickElement(useBottomHoleCheckBox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNewEnteredDataPersists() {
		try {
			String actualData = elementUtils.getElementText(fracStringVolumeField);
			String expectedData = "Expected Data"; // Replace with actual expected data
			Assert.assertEquals(actualData, expectedData, "Newly entered data does not persist!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPadSummaryPageTitle() {
		try {
			String actualTitle = driver.getTitle();
			String expectedTitle = "XOPS"; // Replace with actual expected title
			Assert.assertEquals(actualTitle, expectedTitle, "Pad summary page title does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkSubmitProppantNames() {
		try {
			String actualProppantName = elementUtils.getElementText(fracStringVolumeField); // Replace with actual
																							// element
			String expectedProppantName = "Proppant Name1"; // Replace with actual expected proppant name
			Assert.assertEquals(actualProppantName, expectedProppantName, "Proppant name does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNewlyAddedDataInFracStringVolumeField() {
		try {
			Thread.sleep(2000);
			WebElement FSVInputField=driver.findElement(By.xpath("//label[text()=' Frac String Volume ']/parent::div/div/input"));
			String actualData1 =FSVInputField.getText();
			String expectedData1 = ReadData.readDataFromExcel("FracStringVolumeFieldValue"); 
			Assert.assertEquals(actualData1, expectedData1, "FracStringVolumeFieldValue Data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isPadSummaryPageDisplayed() {
		try {
			WebElement element = driver.findElement(By.xpath("//h1[text()='Pad Summary']"));
			boolean isDisplayed = elementUtils.isElementDisplayed(element);
			Assert.assertTrue(isDisplayed, "Pad Summary Page is not displayed!");
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

	public void isValidProductDisplayed(String product) {
		try {
			WebElement element = driver.findElement(By.xpath("//td[text()='" + product + "']"));
			boolean isDisplayed = elementUtils.isElementDisplayed(element);
			Assert.assertTrue(isDisplayed, "Product is not displayed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToHomePage() {
		try {
			driver.navigate().to("https://fracproplus-uat.linqx.com:9443/");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNewlyAddedDataInFlushAboveTopPerfField() {
		try {
			WebElement FATPInputField=driver.findElement(By.xpath("//label[text()=' Flush Above Top Perf ']/parent::div/div/input"));
			String actualData = FATPInputField.getText();
			String expectedData =  ReadData.readDataFromExcel("FlushAboveTopPerfFieldValue"); 
			Assert.assertEquals(actualData, expectedData, "FlushAboveTopPerfFieldValue Data does not match!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyTabHeaderNamesUnderPathSummaryTab() {
		try {
			 List<String> expectedHeaders = Arrays.asList(
			            "Segment Type",
			            "Length (ft)",
			            "MD (ft)",
			            "TVD (ft)",
			            "Deviat (deg)",
			            "Ann OD (in)",
			            "Ann ID (in)",
			            "Pipe ID (in)"
			    );

			    List<WebElement> headerElements = driver.findElements(
			            By.xpath("//div[@class='ht_master handsontable']//table[contains(@class,'htCore')]//thead//tr/th/div[@class='table-header']")
			    );

			    // Debug
			    System.out.println("Header elements found: " + headerElements.size());

			    JavascriptExecutor js = (JavascriptExecutor) driver;
			    List<String> actualHeaders = new ArrayList<>();

			    for (WebElement header : headerElements) {
			        String text = (String) js.executeScript("return arguments[0].textContent;", header);
			        actualHeaders.add(text.trim());
			    }

			    System.out.println("Actual Headers: " + actualHeaders);

			    Assert.assertEquals(actualHeaders, expectedHeaders, "Table headers do not match!");
		    
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyFirstRowValuesUnderPathSummaryTab() throws InterruptedException {
		Thread.sleep(2000);	    // Expected row values (as seen in your UI)
	    List<String> expectedRowValues = Arrays.asList(
	            "Tubing", "1,500.0", "0.0", "0.0", "0.0", "0.000", "30.000"
	    );

	    // Use JavaScriptExecutor to fetch all <td> text from the first row
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    List<WebElement> firstRowCells = driver.findElements(
	            By.cssSelector("div.ht_master table.htCore tbody tr:nth-child(1) td")
	    );

	    List<String> actualRowValues = new ArrayList<>();
	    for (WebElement cell : firstRowCells) {
	        String cellText = (String) js.executeScript("return arguments[0].textContent;", cell);
	        actualRowValues.add(cellText.trim());
	    }

	    // Assertion
	    Assert.assertEquals(actualRowValues, expectedRowValues, 
	            "First row values do not match!");
	}
	
	public void verifySecondRowValuesUnderPathSummaryTab() {
	    List<String> expectedRowValues = Arrays.asList(
	            "Tubing", "1,000.0", "1,000.0","1,000.0", "0.00", "0.000", "0.000", "30.000"
	    );

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    List<WebElement> secondRowCells = driver.findElements(
	            By.cssSelector("div.ht_master table.htCore tbody tr:nth-child(2) td")
	    );

	    List<String> actualRowValues = new ArrayList<>();
	    for (WebElement cell : secondRowCells) {
	        String cellText = (String) js.executeScript("return arguments[0].textContent;", cell);
	        actualRowValues.add(cellText.trim());
	    }

	    Assert.assertEquals(actualRowValues, expectedRowValues,
	            "Second row values do not match!");
	}


	public void verifyThirdRowValuesUnderPathSummaryTab() {
	    List<String> expectedRowValues = Arrays.asList(
	            "OpenHole", "9,098.0", "10,098.0", "10,098.0", "0.00", "0.000", "0.000","110,000.000"
	    );

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    List<WebElement> thirdRowCells = driver.findElements(
	            By.cssSelector("div.ht_master table.htCore tbody tr:nth-child(3) td")
	    );

	    List<String> actualRowValues = new ArrayList<>();
	    for (WebElement cell : thirdRowCells) {
	        String cellText = (String) js.executeScript("return arguments[0].textContent;", cell);
	        actualRowValues.add(cellText.trim());
	    }

	    Assert.assertEquals(actualRowValues, expectedRowValues,
	            "Third row values do not match!");
	}
}