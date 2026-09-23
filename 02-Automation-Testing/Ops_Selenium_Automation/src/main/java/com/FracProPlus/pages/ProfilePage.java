package com.FracProPlus.pages;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.FracProPlus.utils.ElementUtils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
	
	private WebDriver driver;
	private ElementUtils elementUtils;
	private WebDriverWait wait;
	

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
//		PageFactory.initElements(driver, this);
	
	}
//	public ProfilePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//        wait = new WebDriverWait(driver, 10);
//    }
//	    

	    // Locators
	    @FindBy(xpath = "//*[@class='icon-circle name-alignment']") // Replace with actual ID/class
	    private WebElement userInitialsIcon;

	    @FindBy(xpath = "//span[contains(text(),'My Profile')]") // Replace with actual XPath
	    private WebElement myProfileOption;

	    @FindBy(xpath = "//*[@formcontrolname='email']") // Replace with actual locator
	    private WebElement emailField;

	    @FindBy(xpath = "//*[@formcontrolname='firstName']") // Example editable field
	    private WebElement firstNameField;

	    @FindBy(xpath = "//button[@type='submit'][contains(text(),'Save')]") // Example save button
	    private WebElement saveButton;

	    @FindBy(xpath = "//*[@class='d-none d-xl-flex ms-1 name-alignment']") // Replace with actual locator
	    private WebElement enitials;

	    // Methods
	    public void clickOnUserInitialsIcon() {
	    	
	        try {

			elementUtils.clickElement(userInitialsIcon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	    
	    public void navigateToMyProfile() {
	    	  try {

	  			elementUtils.clickElement(myProfileOption);
	  		} catch (Exception e) {
	  			e.printStackTrace();
	  		}
	      
	    }

	    public boolean isEmailFieldReadOnly() {
	        return !emailField.isEnabled() || emailField.getAttribute("readonly") != null;
	    }
	    
//	    public void updateEditableFields() {
//	        updateEditableFields("Shantanu"); // default value
//	    }

	    public void updateEditableFields(String newFirstName) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement firstName = wait.until(ExpectedConditions.visibilityOf(firstNameField));
	            firstName.clear();
	            firstName.sendKeys(newFirstName);
	            saveButton.click();
	        } catch (Exception e) {
	            System.out.println("Failed to update editable fields: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }



	    public boolean isProfileNameMatchingWithFirstName(String updatedFirstName) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            String displayedProfileName = wait.until(ExpectedConditions.visibilityOf(enitials)).getText().trim();

	            System.out.println("Expected Profile Name: " + updatedFirstName + ", Displayed Profile Name: " + displayedProfileName);

	            return displayedProfileName.equalsIgnoreCase(updatedFirstName); // case-insensitive comparison
	        } catch (Exception e) {
	            System.out.println("Error verifying profile name: " + e.getMessage());
	            return false;
	        }
	    }
	    public String getFirstNameFromProfile() {
	        return wait.until(ExpectedConditions.visibilityOf(firstNameField)).getAttribute("value");
	    }
	}

	
	

