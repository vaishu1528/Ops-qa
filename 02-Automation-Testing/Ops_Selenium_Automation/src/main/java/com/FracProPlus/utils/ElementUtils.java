package com.FracProPlus.utils;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Assert;

public class ElementUtils {

    private static Logger logger = LogManager.getLogger(ElementUtils.class);
    WebDriver driver;
    long durationInSeconds = CommonUtils.EXPLICIT_WAIT_BASIC_TIME;

    public ElementUtils(WebDriver driver) {

        this.driver = driver;

    }

    // public void clickElement(WebElement element) {
    //
    // WebElement webElement = waitForElement(element,durationInSeconds);
    // webElement.click();
    // logger.info("clickOnElement(), invoked and clicked on element "+element);
    //
    // }

    public static void jsClick(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }

    public static LocalTime getRandomTime() {
        // Generate random hours (0-23) and minutes (0-59)
        int randomHour = ThreadLocalRandom.current().nextInt(0, 24);
        int randomMinute = ThreadLocalRandom.current().nextInt(0, 60);

        // Return the random time
        return LocalTime.of(randomHour, randomMinute);
    }

    // Method to check if an element is clickable
    public boolean isElementReadOnly(WebDriver driver, WebElement Element) {
        try {
            boolean isFieldReadOnly = !Element.getAttribute("disabled").equals("true")
                    && !Element.getAttribute("readonly").equals("true");
            Assert.assertFalse(isFieldReadOnly, "Display Temperature at is enabled");
        } catch (TimeoutException e) {

        }
        return false;
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        try {

            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkFieldReadOnly(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);

            // Check if the 'readonly' attribute is present
            String readOnlyAttr = element.getAttribute("readonly");
            boolean isReadOnly = readOnlyAttr != null;

            // Assert based on the read-only status
            Assert.assertTrue(isReadOnly, "Field is not read-only!");
            System.out.println("  Assertion Passed: Field is read-only.");

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("  Exception occurred while checking the field.");
        }
    }

    public static void checkFieldNotReadOnly(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);

            // Check if the 'readonly' attribute is present
            String readOnlyAttr = element.getAttribute("readonly");
            boolean isReadOnly = readOnlyAttr != null;

            // Assert based on the read-only status
            Assert.assertTrue(!isReadOnly, "Field is not read-only!");
            System.out.println("  Assertion Passed: Field is not read-only.");

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("  Exception occurred while checking the field.");
        }
    }

    // public void clearAndSendKeys(WebElement element,String textToBeTyped) {
    //
    // WebElement webElement = waitForElement(element,durationInSeconds);
    // webElement.click();
    // webElement.clear();
    // webElement.sendKeys(textToBeTyped);
    // logger.info("clearAndSendKeys(), invoked and enter text "+textToBeTyped +" in
    // "+element);
    // }

    public void clickElement(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
            clickableElement.click();
        } catch (Exception e) {
            try {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                js.executeScript("arguments[0].click();", element);
            } catch (Exception jsException) {
                throw new RuntimeException("Failed to click the element using both Selenium and JavaScript click.",
                        jsException);
            }
        }
    }

    // Method to check if an element is clickable
    public static boolean isElementClickable(WebDriver driver, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set timeout to 10 seconds
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            return !element.isEnabled();
        } catch (TimeoutException e) {
            // Element was not clickable within the timeout
            System.out.println("Element is not clickable: " + locator);
            return false;
        }
    }

    public void clearAndSendKeys(WebElement element, String textToBeTyped) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the element to be visible
        WebElement welement = wait.until(ExpectedConditions.visibilityOf(element));
        // element.click();
        element.clear();
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            // TODO: handle exception
        }

        element.sendKeys(textToBeTyped);
        // logger.info("clearAndSendKeys(), invoked and enter text "+textToBeTyped +" in
        // "+element);
    }

    public void clearElement(WebElement element) {

        WebElement webElement = waitForElement(element, durationInSeconds);
        webElement.clear();
        logger.info("clearElement() in" + element);
    }

    public WebElement waitForElement(WebElement element, long durationInSeconds) {

        WebElement webElement = null;

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
            webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info(element + " element is clickable");
        return webElement;

    }

    // Method to fetch and verify values of all WebElements
    public void fetchAndVerifyElementValues(List<String> xpaths, List<String> expectedValues) {
        for (int i = 0; i < xpaths.size(); i++) {
            try {
                // Find the element using XPath
                WebElement element = driver.findElement(By.xpath(xpaths.get(i)));

                // Get the actual value from the element
                String actualValue = element.getText(); // or element.getAttribute("value") if it's an input field.

                // Compare the actual value with the expected value
                Assert.assertEquals(actualValue, expectedValues.get(i), "Value mismatch for element " + (i + 1));
                System.out.println("Value of element " + (i + 1) + " is correct: " + actualValue);
            } catch (Exception e) {
                System.out
                        .println("Error occurred while fetching value for element " + (i + 1) + ": " + e.getMessage());
            }
        }
    }

    public void selectOptionInDropdown(WebElement element, String dropDownOption) {

        WebElement webElement = waitForElement(element, durationInSeconds);
        Select select = new Select(webElement);
        select.selectByVisibleText(dropDownOption);
        logger.info("selectOptionInDropdown(), invoked , value selected from dropdown " + dropDownOption);
    }

    public void selectOptionInNgSelect(WebElement ngSelectElement, String optionText) {
        // Click to open the ng-select dropdown
        WebElement webElement = waitForElement(ngSelectElement, durationInSeconds);
        webElement.click();

        // Wait for the options to appear and then select the matching one
        // *[@class='ng-dropdown-panel-items scroll-host']//following::div[text()=' " +
        // optionText + " ']
        By optionLocator = By.xpath(
                "//*[contains(@class,'ng-select-searchable')]//following::span[contains(text(),'" + optionText + "')]");
        WebElement optionElement = waitForElement(driver.findElement(optionLocator), durationInSeconds);
        optionElement.click();

        logger.info("selectOptionInNgSelect(), invoked, value selected from ng-select: " + optionText);
    }

    public void acceptAlert() {

        Alert alert = waitForAlert();
        alert.accept();
        logger.info("alert accepted successfully");

    }

    public void dismissAlert(long durationInSeconds) {

        Alert alert = waitForAlert();
        alert.dismiss();
        logger.info("alert dismiss successfully");
    }

    public Alert waitForAlert() {

        Alert alert = null;

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
            alert = wait.until(ExpectedConditions.alertIsPresent());
        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info("waiting for the alert");
        return alert;

    }

    public void mouseHoverAndClick(WebElement element) {

        WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).click().build().perform();
        logger.info("mousehover on element " + element + " and clicked");

    }

    public WebElement waitForVisibilityOfElement(WebElement element, long durationInSeconds) {

        WebElement webElement = null;

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
            webElement = wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info("waiting for the element visibility");
        return webElement;

    }

    public void javaScriptClick(WebElement element) {

        WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("arguments[0].click();", webElement);
        logger.info("clicked on element using javascriptexecutor");
    }

    public void javaScriptType(WebElement element, String textToBeTyped) {

        WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("arguments[0].value='" + textToBeTyped + "'", webElement);
        logger.info("enter text in textbox using  javascriptexecutor");
    }

    public String getElementText(WebElement element) {

        WebElement webElement = waitForElement(element, durationInSeconds);
        logger.info("getting text from webpage " + webElement.getText());
        return webElement.getText();

    }

    public boolean isPaginationPresent() {
        return !driver.findElements(By.xpath("(//*[contains(@class,'paginator')])[1]")).isEmpty();
    }

    // Navigate to the last page, if pagination exists; otherwise, stay on the
    // current page
    public void navigateToLastPageIfPresent() {
        if (isPaginationPresent()) {
            WebElement lastPage = driver.findElement(By.xpath("//*[@aria-label='Last page']"));
            lastPage.click();
        } else {
            System.out.println("Pagination not present. Checking the current page.");
        }
    }

    public boolean isElementDisplayed(WebElement element) {

        try {
            WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
            return webElement.isDisplayed();
        } catch (Throwable e) {
            return false;
        }

    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll the page to bring the specified element into view
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void assertNumberNotInDropdown(List<WebElement> dropdownOptions, String restrictedNumber) {
        boolean isNumberPresent = dropdownOptions.stream()
                .anyMatch(option -> option.getText().equals(String.valueOf(restrictedNumber)));

        // Use TestNG or JUnit assertion based on your preference
        Assert.assertFalse(isNumberPresent,
                "Error: Number '" + restrictedNumber + "' should not be visible in the dropdown.");
        // Alternatively, for JUnit:
        // Assertions.assertFalse(isNumberPresent, "Error: Number '" + restrictedNumber
        // + "' should not be visible in the dropdown.");
    }

    // selectOptionInDropdownByIndex
    public void selectOptionInDropdownByIndex(WebElement element, int index) {
        WebElement webElement = waitForElement(element, durationInSeconds);
        Select select = new Select(webElement);
        select.selectByIndex(index);
        logger.info("selectOptionInDropdownByIndex(), invoked, index selected from dropdown: " + index);
    }

    public void doubleClickElement(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
            Actions actions = new Actions(driver);
            actions.doubleClick(clickableElement).perform();
        } catch (Exception e) {
            try {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                js.executeScript("var event = document.createEvent('MouseEvents');"
                        + "event.initMouseEvent('dblclick', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, 0, null);"
                        + "arguments[0].dispatchEvent(event);", element);
            } catch (Exception jsException) {
                throw new RuntimeException("Failed to double-click the element using both Selenium and JavaScript.",
                        jsException);
            }
        }
    }

    private static final String HOST = "imap.gmail.com"; // Use IMAP server (e.g., for Gmail)
    private static final String USERNAME = "your-email@gmail.com"; // Your test email
    private static final String PASSWORD = "your-app-password"; // Use App Password if needed

    public static String getVerificationCode(String subjectKeyword) {
        try {
            Properties properties = new Properties();
            properties.put("mail.store.protocol", "imaps");

            // Session session = Session.getDefaultInstance(properties, null);
            // Store store = session.getStore("imaps");
            // store.connect(HOST, USERNAME, PASSWORD);
            //
            // Folder inbox = store.getFolder("INBOX");
            // inbox.open(Folder.READ_ONLY);
            //
            // Message[] messages = inbox.getMessages();
            //
            // for (int i = messages.length - 1; i >= 0; i--) { // Check latest emails first
            // Message message = messages[i];
            // String subject = message.getSubject();
            //
            // if (subject.contains(subjectKeyword)) { // Filter by subject
            // String content = getTextFromMessage(message);
            // return extractCode(content);
            // }
            // }
            // inbox.close(false);
            // store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Method to Check the element is read only fields in handsontable

    public void verifyCellIsReadOnly(WebElement cell) {
        String ariaReadOnly = cell.getAttribute("aria-readonly");
        Assert.assertEquals(ariaReadOnly, "true", "The cell is not read-only");
    }

    public void verifyCellIsEditable(WebElement cell) {
        String ariaReadOnly = cell.getAttribute("aria-readonly");
        boolean isEditable = (ariaReadOnly == null || !ariaReadOnly.equals("true"));
        Assert.assertTrue(isEditable, "The cell is not editable");
    }

    // Check if checkbox is checked
    public boolean isCheckboxChecked(WebElement checkbox) {
        return checkbox.isSelected(); // Returns true if checkbox is checked, otherwise false
    }

    // check if dropdown option selected
    public boolean isOptionSelected(WebElement dropdownElement, String expectedOption) {
        Select dropdown = new Select(dropdownElement);
        String selectedOption = dropdown.getFirstSelectedOption().getText();
        return selectedOption.equals(expectedOption);
    }

    // Verifies the dropdown options against expected values.
    public void verifyDropdownOptions(WebElement dropdownElement, List<String> expectedOptions,
            String dropDownOptionCountMessage) {
        Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();

        List<String> actualOptions = new ArrayList<>();
        for (WebElement option : options) {
            actualOptions.add(option.getText().trim());
        }

        // Assert the size first
        Assert.assertEquals(actualOptions.size(), expectedOptions.size(), dropDownOptionCountMessage);

        // Assert each option
        for (int i = 0; i < expectedOptions.size(); i++) {
            Assert.assertEquals(expectedOptions.get(i), actualOptions.get(i), "Mismatch at index " + i);
        }

        // System.out.println("Dropdown options verified successfully.");
    }

    /**
     * Drags source element and drops it onto target element.
     */
    public void dragAndDrop(WebElement source, WebElement target) {
        try {
            Actions actions = new Actions(driver);
            actions.dragAndDrop(source, target).build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Checks if all elements matching the XPath are in an expanded state.
     * Assumes expanded state can be determined via "aria-expanded='true'" or a
     * class like "expanded".
     */
    public boolean areElementsExpanded(String xpath) {
        try {
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            for (WebElement element : elements) {
                String ariaExpanded = element.getAttribute("aria-expanded");
                if (ariaExpanded != null) {
                    if (!ariaExpanded.equalsIgnoreCase("true"))
                        return false;
                } else if (!element.getAttribute("class").contains("expanded")) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Checks if all elements matching the XPath are in a collapsed state.
     * Assumes collapsed state can be determined via "aria-expanded='false'" or
     * absence of "expanded" class.
     */
    public boolean areElementsCollapsed(String xpath) {
        try {
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            for (WebElement element : elements) {
                String ariaExpanded = element.getAttribute("aria-expanded");
                if (ariaExpanded != null) {
                    if (!ariaExpanded.equalsIgnoreCase("false"))
                        return false;
                } else if (element.getAttribute("class").contains("expanded")) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Checks if a given element is selected (e.g., radio button, dropdown option).
     */
    public boolean isElementSelected(WebElement element) {
        try {
            return element.isSelected();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectFromNgSelect(WebElement dropdown, WebElement option) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(option)).click();
    }

}
