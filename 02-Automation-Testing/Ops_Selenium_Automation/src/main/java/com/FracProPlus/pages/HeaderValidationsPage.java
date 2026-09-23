//package com.FracProPlus.pages;
//import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;
//
//
//public class HeaderValidationsPage {
//	
//	
//
//
//	
//	    WebDriver driver;
//	    WebDriverWait wait;
//
//	    public HeaderValidationsPage(WebDriver driver) {
//	        this.driver = driver;
//	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	    }
//
//	    // ========== LOGIN PAGE ==========
//	    public void loginWithValidCredentials() {
//	        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//	        WebElement password = driver.findElement(By.id("password"));
//	        WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//
//	        username.sendKeys("yourUsername"); // replace with config if needed
//	        password.sendKeys("yourPassword");
//	        loginBtn.click();
//	    }
//
//	    // ========== DASHBOARD PAGE ==========
//	    public void clickLivePlusCard() {
//	        WebElement livePlusCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Live+')]")));
//	        livePlusCard.click();
//	    }
//
//	    public void navigateToInputScreen() {
//	        WebElement inputScreenLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Input Screen']")));
//	        inputScreenLink.click();
//	    }
//
//	    public void navigateToPadWellScreen() {
//	        WebElement padWellLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Pad & Well']")));
//	        padWellLink.click();
//	    }
//
//	    public void navigateToVersionScreen() {
//	        WebElement versionLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Version Control']")));
//	        versionLink.click();
//	    }
//
//	    public void navigateToDashboard() {
//	        WebElement dashboardLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Dashboard']")));
//	        dashboardLink.click();
//	    }
//
//	    public void navigateToScreen(String screenName) {
//	        WebElement screenLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='" + screenName + "']")));
//	        screenLink.click();
//	    }
//
//	    // ========== LIVE+ APP PAGE ==========
//	    public void selectFirstWell() {
//	        WebElement wellCard = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".well-card")));
//	        wellCard.click();
//	    }
//
//	    // ========== INPUT/HEADER VALIDATION ==========
//	    public boolean isInputScreenDisplayed() {
//	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Input')]"))).isDisplayed();
//	    }
//
//	    public String getPadNameFromHeader() {
//	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("padNameHeader"))).getText().trim();
//	    }
//
//	    public String getWellNameFromHeader() {
//	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wellNameHeader"))).getText().trim();
//	    }
//
//	    public String getVersionNameFromHeader() {
//	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("versionNameHeader"))).getText().trim();
//	    }
//
//	    public String getStageNameFromHeader() {
//	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("stageNameHeader"))).getText().trim();
//	    }
//
//	    // ========== PAD & WELL SCREEN ==========
//	    public String changePadName() {
//	        WebElement padDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("padDropdown")));
//	        padDropdown.click();
//	        WebElement newPadOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Pad')]")));
//	        String padName = newPadOption.getText().trim();
//	        newPadOption.click();
//	        return padName;
//	    }
//
//	    public String changeWellName() {
//	        WebElement wellDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("wellDropdown")));
//	        wellDropdown.click();
//	        WebElement newWellOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Well')]")));
//	        String wellName = newWellOption.getText().trim();
//	        newWellOption.click();
//	        return wellName;
//	    }
//
//	    // ========== VERSION CONTROL ==========
//	    public String changeVersionName() {
//	        WebElement versionDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("versionDropdown")));
//	        versionDropdown.click();
//	        WebElement versionOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Version')]")));
//	        String versionName = versionOption.getText().trim();
//	        versionOption.click();
//	        return versionName;
//	    }
//
//	    public String changeStageName() {
//	        WebElement stageDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("stageDropdown")));
//	        stageDropdown.click();
//	        WebElement stageOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Stage')]")));
//	        String stageName = stageOption.getText().trim();
//	        stageOption.click();
//	        return stageName;
//	    }
//
//	    // ========== CURRENT VALUES FOR ASSERTIONS ==========
//	    public String getCurrentPadName() {
//	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("padNameHeader"))).getText().trim();
//	    }
//
//	    public String getCurrentWellName() {
//	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wellNameHeader"))).getText().trim();
//	    }
//
//	    public String getCurrentVersionName() {
//	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("versionNameHeader"))).getText().trim();
//	    }
//
//	    public String getCurrentStageName() {
//	        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("stageNameHeader"))).getText().trim();
//	    }
//	}
//
//
//}
