
package com.FracProPlus.pages;

import com.FracProPlus.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WellAndTreatmentGeneralInfoPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public WellAndTreatmentGeneralInfoPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dashboardPage")
    private WebElement dashboardPage;

    @FindBy(id = "goToApplicationButton")
    private WebElement goToApplicationButton;

    @FindBy(id = "padFromHomeScreen")
    private WebElement padFromHomeScreen;

    @FindBy(id = "wellFromOverview")
    private WebElement wellFromOverview;

    @FindBy(id = "wellAndTreatmentScreen")
    private WebElement wellAndTreatmentScreen;

    @FindBy(id = "wellNameTopRight")
    private WebElement wellNameTopRight;

    @FindBy(id = "padName")
    private WebElement padName;

    @FindBy(id = "fieldName")
    private WebElement fieldName;

    @FindBy(id = "wellName")
    private WebElement wellName;

    @FindBy(id = "wellAPI")
    private WebElement wellAPI;

    @FindBy(id = "companyNameDropdown")
    private WebElement companyNameDropdown;

    @FindBy(id = "companyRepresentative")
    private WebElement companyRepresentative;

    @FindBy(id = "serviceCompanyRep")
    private WebElement serviceCompanyRep;

    @FindBy(id = "serviceCompanyNameDropdown")
    private WebElement serviceCompanyNameDropdown;

    @FindBy(id = "treatmentAnalyst")
    private WebElement treatmentAnalyst;

    @FindBy(id = "searchBox")
    private WebElement searchBox;

    @FindBy(id = "searchButton")
    private WebElement searchButton;

    @FindBy(id = "searchResults")
    private WebElement searchResults;

    @FindBy(id = "laborHyperlink")
    private WebElement laborHyperlink;

    public void verifyUserIsOnDashboardPage() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(dashboardPage), "User is not on the Dashboard Page");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementGoToApplicationUnderFracProLiveCard() {
        try {
            elementUtils.clickElement(goToApplicationButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateAndClickOnPadFromHomeScreen() {
        try {
            elementUtils.clickElement(padFromHomeScreen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementOnWellFromOverview() {
        try {
            elementUtils.clickElement(wellFromOverview);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyUserIsOnWellAndTreatmentScreen() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(wellAndTreatmentScreen), "User is not on the Well and Treatment screen");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isWellNameMatching() {
        try {
            String actualWellName = elementUtils.getElementText(wellNameTopRight);
            String expectedWellName = elementUtils.getElementText(wellName);
            Assert.assertEquals(actualWellName, expectedWellName, "Well name does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isPadNameVerified() {
        try {
            String actualPadName = elementUtils.getElementText(padName);
            String expectedPadName = "Expected Pad Name"; // Replace with actual expected value
            Assert.assertEquals(actualPadName, expectedPadName, "Pad name does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isFieldNameVerified() {
        try {
            String actualFieldName = elementUtils.getElementText(fieldName);
            String expectedFieldName = "Expected Field Name"; // Replace with actual expected value
            Assert.assertEquals(actualFieldName, expectedFieldName, "Field name does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isWellNameVerified() {
        try {
            String actualWellName = elementUtils.getElementText(wellName);
            String expectedWellName = "Expected Well Name"; // Replace with actual expected value
            Assert.assertEquals(actualWellName, expectedWellName, "Well name does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isWellAPIVerified() {
        try {
            String actualWellAPI = elementUtils.getElementText(wellAPI);
            String expectedWellAPI = "Expected Well API"; // Replace with actual expected value
            Assert.assertEquals(actualWellAPI, expectedWellAPI, "Well API does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isCompanyNameVerified() {
        try {
            String actualCompanyName = elementUtils.getElementText(companyNameDropdown);
            String expectedCompanyName = "Expected Company Name"; // Replace with actual expected value
            Assert.assertEquals(actualCompanyName, expectedCompanyName, "Company name does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isCompanyRepresentativeVerified() {
        try {
            String actualCompanyRepresentative = elementUtils.getElementText(companyRepresentative);
            String expectedCompanyRepresentative = "Expected Company Representative"; // Replace with actual expected value
            Assert.assertEquals(actualCompanyRepresentative, expectedCompanyRepresentative, "Company representative does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isServiceCompanyRepVerified() {
        try {
            String actualServiceCompanyRep = elementUtils.getElementText(serviceCompanyRep);
            String expectedServiceCompanyRep = "Expected Service Company Rep"; // Replace with actual expected value
            Assert.assertEquals(actualServiceCompanyRep, expectedServiceCompanyRep, "Service company rep does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isServiceCompanyNameVerified() {
        try {
            String actualServiceCompanyName = elementUtils.getElementText(serviceCompanyNameDropdown);
            String expectedServiceCompanyName = "Expected Service Company Name"; // Replace with actual expected value
            Assert.assertEquals(actualServiceCompanyName, expectedServiceCompanyName, "Service company name does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isTreatmentAnalystVerified() {
        try {
            String actualTreatmentAnalyst = elementUtils.getElementText(treatmentAnalyst);
            String expectedTreatmentAnalyst = "Expected Treatment Analyst"; // Replace with actual expected value
            Assert.assertEquals(actualTreatmentAnalyst, expectedTreatmentAnalyst, "Treatment analyst does not match");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterProductIntoSearchBox(String validProductText) {
        try {
            elementUtils.clearAndSendKeys(searchBox, validProductText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSearchButton() {
        try {
            elementUtils.clickElement(searchButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isValidProductDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(searchResults), "Valid product is not displayed in search results");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToHomePage() {
        try {
            driver.get("https://fracproplus-uat.linqx.com:9443/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void performInterchangeSearch() {
        try {
            // Implement the interchange search logic here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isLaborHyperlinkDisplayed() {
        try {
            Assert.assertFalse(elementUtils.isElementDisplayed(laborHyperlink), "Labor hyperlink is displayed on Results page");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}