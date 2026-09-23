
package com.FracProPlus.pages;

import com.FracProPlus.utils.ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage {

    private WebDriver driver;
    private ElementUtils elementUtils;
   


    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "next")
    private WebElement loginButton;

    @FindBy(xpath = "//*[text()='Please enter your Email Address']")
    private WebElement errorMessage;
    
    @FindBy(xpath = "//*[@class='icon-circle name-alignment']")
	private WebElement ProfileIcon;
  
    @FindBy(xpath = "//*[text()='Sign Out']")
	private WebElement Signoutbutton;
    

    @FindBy(id = "forgotPassword")
    private WebElement forgotPasswordLink;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "emailVerificationControl_but_send_code")
    private WebElement sendVerificationCodeButton;

    public void navigateToLoginPage() {
        driver.get("https://agileui-uat.walkingtree.tech:9444/auth/login");
    }

    public void enterValidUsername() {
        try {
            elementUtils.clearAndSendKeys(usernameField, "vaibhav.garg@walkingtree.tech");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterValidPassword() {
        try {
            elementUtils.clearAndSendKeys(passwordField, "Vaibhav@01");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUserLoggedIn() {
        try {
            WebElement Welcometext = driver.findElement(By.xpath("//*[text()='Explore Our Digital Solutions']"));
            String expectedTitle = "Explore Our Digital Solutions";
            Assert.assertEquals(Welcometext.getText(), expectedTitle, "User is not logged in!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterInvalidUsernameOrPassword() {
        try {
            elementUtils.clearAndSendKeys(usernameField, "akshay.sawant.tech");
            elementUtils.clearAndSendKeys(passwordField, "Aps2393@");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isErrorMessageDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(errorMessage), "Please enter a valid email address.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveUsernameAndPasswordFieldsEmpty() {
        try {
            elementUtils.clearElement(usernameField);
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementForgotPasswordLink() {
        try {
            elementUtils.clickElement(forgotPasswordLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterRegisteredEmailID() {
        try {
            elementUtils.clearAndSendKeys(emailField, "registeredEmail@example.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementSendVerificationCodeButton() {
        try {
            elementUtils.clickElement(sendVerificationCodeButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isVerificationCodeReceived() {
        try {
            // Assuming there's a method to check email for the verification code
            boolean isCodeReceived = checkEmailForVerificationCode();
            Assert.assertTrue(isCodeReceived, "Verification code not received!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static String verificationCode;


    private boolean checkEmailForVerificationCode() {
    	
    	 String verificationCode = elementUtils.getVerificationCode("Password Reset"); // Adjust subject as needed
         Assert.assertNotNull("Verification code not received", verificationCode);
         System.out.println("Extracted Verification Code: " + verificationCode);
        return true;
    }

    public void enterUsername(String username) {
        try {
            elementUtils.clearAndSendKeys(usernameField, username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isLoginSuccessful() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "Dashboard";
            Assert.assertEquals(actualTitle, expectedTitle, "User is not logged in!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getErrorMessage() {
        try {
            return elementUtils.getElementText(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void clickProfileIcon() {
    	elementUtils.clickElement(ProfileIcon);
    }

    public void clickSignOutButton() {
    	elementUtils.clickElement(Signoutbutton);
    }

    public void verifyUserIsLoggedOut() {
        WebElement loginElement = driver.findElement(By.xpath("//*[@id='localAccountForm']"));
        Assert.assertEquals("User is not on login page after logout.", loginElement.isDisplayed());
    }
}