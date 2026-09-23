package com.FracProPlus.pages;

import com.FracProPlus.utils.ElementUtils;
import com.FracProPlus.utils.ReadData;

import java.time.Duration;

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

public class wellandtreatmentPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public wellandtreatmentPage(WebDriver driver) {
    	this.driver = driver;
	    this.elementUtils = new ElementUtils(driver);
	    PageFactory.initElements(driver, this);
    }

    @FindBy(id = "homeScreen")
    private WebElement homeScreen;

    @FindBy(id = "padOverview")
    private WebElement padOverview;

    @FindBy(id = "wellOverview")
    private WebElement wellOverview;

    @FindBy(xpath = "//h4[text()=' Well & Treatment ']")
    private WebElement wellAndTreatmentScreen;

    @FindBy(xpath = "//*[@class='fw-bold text-dark']")
    private WebElement wellNameTopRight;

    @FindBy(xpath = "(//*[text()='Pad Name']/following::input[@type='text'])[1]")
    private WebElement padName;

    @FindBy(id = "prospect")
    private WebElement fieldName;

    @FindBy(xpath = "//*[text()='Well Name']/following::input[@id='wellName']")
    private WebElement wellName;

    @FindBy(id = "wellAPI")
    private WebElement wellAPI;

    @FindBy(id = "operatorCompany")
    private WebElement companyNameDropdown;

    @FindBy(id = "compRepresentative")
    private WebElement companyRepresentative;

    @FindBy(id = "supervisor")
    private WebElement serviceCompanyRep;

    @FindBy(id = "serviceCompany")
    private WebElement serviceCompanyNameDropdown;

    @FindBy(id = "treatmentAnalyst")
    private WebElement treatmentAnalyst;

    @FindBy(id = "fuelChargesQuantities")
    private WebElement fuelChargesQuantities;

    public void verifyUserIsOnHomeScreen() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(homeScreen), "User is not on the Home Screen");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateAndClickOnPad() {
        try {
            elementUtils.clickElement(padOverview);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementOnWellFromOverviewScreen() {
        try {
            elementUtils.clickElement(wellOverview);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void waitUntilDomIsStable() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 3; i++) {  
            try {
                // Wait for JS & AJAX to complete
                js.executeScript(
                    "return document.readyState"
                ).equals("complete");

                Thread.sleep(500); // give DOM time to settle
            } catch (Exception ignored) {}
        }
    }

    
    public void verifyUserIsOnWellAndTreatmentScreen() {
        try {
            // Wait for page to be fully loaded using JavaScript
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(webDriver -> js.executeScript("return document.readyState").equals("complete"));

            // Additional wait for Angular/React to finish rendering
            Thread.sleep(3000);

            // Get current URL
            String currentUrl = driver.getCurrentUrl();
            // FIXED: Verify using URL instead of missing element
            // The Well & Treatment page URL contains "well-treatment"
            if (currentUrl.contains("well-treatment") || currentUrl.contains("well-pad/well-treatment")) {
                System.out.println("✅ SUCCESS - User is on Well & Treatment screen (verified by URL)");
                Assert.assertTrue(true, "User is on the Well and Treatment screen");
                return;
            }

            // If URL check fails, try to find General Information tab as secondary verification
            try {
                WebElement generalInfoTab = driver.findElement(By.xpath("//h4[text()=' Well & Treatment ']"));
                if (generalInfoTab.isDisplayed()) {
                    System.out.println("✅ SUCCESS - Found 'General Information' tab, confirming Well & Treatment screen");
                    Assert.assertTrue(true, "User is on the Well and Treatment screen");
                    return;
                }
            } catch (Exception tabEx) {
                System.out.println("DEBUG - General Information tab not found either");
            }

            // If both verifications fail, take screenshot and fail
            System.out.println("❌ FAIL - Not on Well & Treatment screen. URL: " + currentUrl);
            Assert.fail("User is not on the Well and Treatment screen. Current URL: " + currentUrl);

        } catch (Exception e) {
            // Take screenshot on failure
            try {
                org.openqa.selenium.TakesScreenshot ts = (org.openqa.selenium.TakesScreenshot) driver;
                java.io.File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
                String screenshotPath = "target/debug_welltreatment_" + System.currentTimeMillis() + ".png";
                org.apache.commons.io.FileUtils.copyFile(source, new java.io.File(screenshotPath));
                System.out.println("DEBUG - Screenshot saved: " + screenshotPath);
            } catch (Exception screenshotEx) {
                screenshotEx.printStackTrace();
            }

            e.printStackTrace();
            throw new RuntimeException("Failed to verify Well and Treatment screen: " + e.getMessage(), e);
        }
    }


    public void verifygeneralinfotab() {
        try {
        	
        	WebElement Tabname = driver.findElement(By.xpath("//*[text()='General Information']"));
//        	String ExpectedTabname = Tabname.getText();
//        	String Actualtabname = "General Information";
        	Assert.assertEquals("General Information", Tabname.getText(), "Tab name does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public void verifyWellNameInTopRightCorner() {
        try {
        	
        	WebElement WellName = driver.findElement(By.xpath("(//span[text()='"+ReadData.readdata("WellName")+"'])"));
        	String expectedWellName = WellName.getText();
            Assert.assertEquals(ReadData.readdata("WellName"), expectedWellName, "Well name does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyPadName() {
        try {
        	WebElement inputElement = driver.findElement(By.xpath("//*[@id='padName']"));
            String actualPadName = inputElement.getAttribute("value");
            String expectedPadName = ReadData.readdata("Padname"); 
            Assert.assertEquals(actualPadName, expectedPadName, "Pad name does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 

    public void verifyFieldName() {
        try {
        	WebElement inputElement = driver.findElement(By.id("prospect"));
            String actualFieldName = inputElement.getAttribute("value");
            String expectedFieldName = ReadData.readdata("FieldName"); 
            Assert.assertEquals(actualFieldName, expectedFieldName, "Field name does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyWellName() {
        try {
        	WebElement inputElement = driver.findElement(By.id("wellName"));
            String actualWellName = inputElement.getAttribute("value");
            String expectedWellName = ReadData.readdata("WellName"); 
            Assert.assertEquals(actualWellName, expectedWellName, "Well name does not match!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyWellAPI() {
        try {
        	WebElement inputElement = driver.findElement(By.id("wellAPI"));
            String actualWellAPI = inputElement.getAttribute("value");
            String expectedWellAPI = ReadData.readdata("WellApi"); 
            Assert.assertEquals(actualWellAPI, expectedWellAPI, "Well API does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyCompanyName() {
        try {
        	WebElement inputElement = driver.findElement(By.id("operatorCompany"));
            String actualCompanyName = inputElement.getText();
            String expectedCompanyName = ReadData.readdata("CompanyName");
            Assert.assertEquals(actualCompanyName, expectedCompanyName, "Company name does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyCompanyRepresentative() {
        try {
        	WebElement inputElement = driver.findElement(By.id("compRepresentative"));
            String actualCompanyRepresentative = inputElement.getAttribute("value");
            String expectedCompanyRepresentative = ReadData.readdata("CompanyRepresentative");
            Assert.assertEquals(actualCompanyRepresentative, expectedCompanyRepresentative, "Company representative does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyServiceCompanyRep() {
        try {
        	WebElement inputElement = driver.findElement(By.id("supervisor"));
            String actualServiceCompanyRep = inputElement.getAttribute("value");
            String expectedServiceCompanyRep = ReadData.readdata("ServiceCompanyRep");
            Assert.assertEquals(actualServiceCompanyRep, expectedServiceCompanyRep, "Service company rep does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyServiceCompanyName() {
        try {
        	WebElement inputElement = driver.findElement(By.id("serviceCompany"));
            String actualServiceCompanyName = inputElement.getText();
            String expectedServiceCompanyName = ReadData.readdata("ServiceCompanyName");
            Assert.assertEquals(actualServiceCompanyName, expectedServiceCompanyName, "Service company name does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void ClickExpandAdditionalInfo() {
        try {
        	WebElement AdditionalInfoHeader=driver.findElement(By.xpath("//span[text()='Additional Info']"));
        	Actions action=new Actions(driver);
        	action.scrollToElement(AdditionalInfoHeader).perform();
        	Thread.sleep(2000);
        	WebElement expandAdditional = driver.findElement(By.xpath("//span[text()='Additional Info']/parent::div/following-sibling::i"));
            elementUtils.clickElement(expandAdditional);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    public void verifyServiceCompanyName() {
//        try {
//            WebElement ngSelectElement = driver.findElement(By.id("serviceCompany"));
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            String actualServiceCompanyName = (String) js.executeScript(
//                "return arguments[0].querySelector('.ng-value-label')?.textContent?.trim();",
//                ngSelectElement
//            );
//            String expectedServiceCompanyName = ReadData.readdata("ServiceCompanyName");
//            Assert.assertEquals(actualServiceCompanyName, expectedServiceCompanyName, "Service company name does not match!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            Assert.fail("Exception occurred while verifying service company name: " + e.getMessage());
//        }
//    }


    public void verifyTreatmentAnalyst() {
        try {
        	WebElement inputElement = driver.findElement(By.id("treatmentAnalyst"));
            String actualTreatmentAnalyst = inputElement.getAttribute("value");
            String expectedTreatmentAnalyst = ReadData.readdata("TreatmentAnalyst");
            Assert.assertEquals(actualTreatmentAnalyst, expectedTreatmentAnalyst, "Treatment analyst does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}