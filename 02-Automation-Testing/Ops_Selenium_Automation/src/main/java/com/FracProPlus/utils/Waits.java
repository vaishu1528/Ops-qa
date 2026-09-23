package com.FracProPlus.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    // Default timeout (you can change if needed)
    private static final int DEFAULT_TIMEOUT = 10;

    /* -------------------- VISIBILITY -------------------- */

    public static WebElement waitForVisibility(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(WebDriver driver, By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /* -------------------- CLICKABLE -------------------- */

    public static WebElement waitForClickable(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickable(WebDriver driver, By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    /* -------------------- TEXT WAITS -------------------- */

    /**
     * Wait until exact text is present in element
     */
    public static boolean waitForTextToBe(WebDriver driver, WebElement element, String expectedText) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.textToBePresentInElement(element, expectedText));
    }

    /**
     * Wait until exact text is present using locator
     */
    public static boolean waitForTextToBe(WebDriver driver, By locator, String expectedText) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.textToBePresentInElementLocated(locator, expectedText));
    }

    /**
     * Wait until element text is NOT empty
     */
    public static boolean waitForTextNotEmpty(WebDriver driver, WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(driver1 -> !element.getText().trim().isEmpty());
    }

    /**
     * Wait until element text contains partial text
     */
    public static boolean waitForTextContains(WebDriver driver, WebElement element, String partialText) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.textToBePresentInElement(element, partialText));
    }

    /**
     * Wait until element attribute contains text
     */
    public static boolean waitForTextInAttribute(WebDriver driver, WebElement element,
                                                  String attribute, String value) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.attributeContains(element, attribute, value));
    }

    /* -------------------- INVISIBILITY -------------------- */

    public static boolean waitForInvisibility(WebDriver driver, By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    /* -------------------- CUSTOM TIMEOUT -------------------- */

    public static WebElement waitForVisibility(WebDriver driver, WebElement element, int timeoutInSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.visibilityOf(element));
    }
}
