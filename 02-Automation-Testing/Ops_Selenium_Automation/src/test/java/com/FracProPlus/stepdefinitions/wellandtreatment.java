package com.FracProPlus.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.wellandtreatmentPage;
import com.FracProPlus.utils.ElementUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class wellandtreatment extends DriverFactory {

	wellandtreatmentPage wellAndTreatmentGeneralInfoPage = new wellandtreatmentPage(driver);

//@Given("the user is on the Home Screen")
//public void the_user_is_on_the_Home_Screen() {
//wellAndTreatmentGeneralInfoPage.verifyUserIsOnHomeScreen();
//}
//@When("the user navigates and clicks on the pad from the home screen")
//public void the_user_navigates_and_clicks_on_the_pad_from_the_home_screen() {
//wellAndTreatmentGeneralInfoPage.navigateAndClickOnPad();
//}
//@And("the user clicks on the well from the overview screen")
//public void the_user_clicks_on_the_well_from_the_overview_screen() {
//wellAndTreatmentGeneralInfoPage.clickElementOnWellFromOverviewScreen();
//}
	@Then("the user should be landed on the Well and Treatment screen")
	public void the_user_should_be_landed_on_the_Well_and_Treatment_screen() {
		wellAndTreatmentGeneralInfoPage.verifyUserIsOnWellAndTreatmentScreen();
	}

	@And("the user verifies that user is on general information tab under under Well and Treatment screen")
	public void the_user_verifies_that_user_is_on_general_information_tab_under_under_Well_and_Treatment_screen() {
		wellAndTreatmentGeneralInfoPage.verifygeneralinfotab();
	}

	@And("the well name displayed in the top right corner should match the well name entered in the textbox")
	public void the_well_name_displayed_in_the_top_right_corner_should_match_the_well_name_entered_in_the_textbox() {
		wellAndTreatmentGeneralInfoPage.verifyWellNameInTopRightCorner();
	}

	@And("the Pad Name entered by the user should be verified")
	public void the_Pad_Name_entered_by_the_user_should_be_verified() {
		wellAndTreatmentGeneralInfoPage.verifyPadName();
	}

	@And("the Field Name entered by the user should be verified")
	public void the_Field_Name_entered_by_the_user_should_be_verified() {
		wellAndTreatmentGeneralInfoPage.verifyFieldName();
	}

	@And("the Well Name entered by the user should be verified")
	public void the_Well_Name_entered_by_the_user_should_be_verified() {
		wellAndTreatmentGeneralInfoPage.verifyWellName();
	}

	@And("the Well API entered by the user should be verified")
	public void the_Well_API_entered_by_the_user_should_be_verified() {
		wellAndTreatmentGeneralInfoPage.verifyWellAPI();
	}

	@And("the Company Name selected by the user from the Company Name dropdown should be verified")
	public void the_Company_Name_selected_by_the_user_from_the_Company_Name_dropdown_should_be_verified() {
		wellAndTreatmentGeneralInfoPage.verifyCompanyName();
	}

	@And("the Company Representative entered by the user should be verified")
	public void the_Company_Representative_entered_by_the_user_should_be_verified() {
		wellAndTreatmentGeneralInfoPage.verifyCompanyRepresentative();
	}

	@And("the Service Company Rep entered by the user should be verified")
	public void the_Service_Company_Rep_entered_by_the_user_should_be_verified() {
		wellAndTreatmentGeneralInfoPage.verifyServiceCompanyRep();
	}

	@And("the Service Company Name selected by the user from the Service Company Name dropdown should be verified")
	public void the_Service_Company_Name_selected_by_the_user_from_the_Service_Company_Name_dropdown_should_be_verified() {
		wellAndTreatmentGeneralInfoPage.verifyServiceCompanyName();
	}

	@Then("the Treatment Analyst entered by the user should be verified")
	public void the_Treatment_Analyst_entered_by_the_user_should_be_verified() {
		wellAndTreatmentGeneralInfoPage.verifyTreatmentAnalyst();
	}
	
	@Then("the user click on the additional info expand arrow")
	public void the_user_click_on_the_additional_info_expand_arrow() {
		wellAndTreatmentGeneralInfoPage.ClickExpandAdditionalInfo();
	}

	@And("verify the presence of propilot check bok")
    public void verifyProPilotCheckBoxPresence() throws InterruptedException {
		Thread.sleep(2000);
        WebElement checkBox = driver.findElement(By.xpath("//label[text()=' Propilot ']")); // Replace with actual locator
        Assert.assertEquals(checkBox.getText(),"Propilot", "ProPilot checkbox is not visible");
    }
	
    @And("verify the presence of seismos check bok")
    public void verifySeismosCheckBoxState() throws InterruptedException {
		Thread.sleep(2000);
		 WebElement seismosCheckbox = driver.findElement(By.xpath("//label[text()=' Seismos ']/parent::div/input"));; // Replace with actual locator
		 if (seismosCheckbox.isSelected()) {
		        System.out.println("PASS: Seismos checkbox is checked.");
		        Assert.assertTrue(true, "Seismos checkbox is checked.");  // Pass
		    } else {
		        System.out.println("FAIL: Seismos checkbox is not checked.");
		        Assert.fail("Seismos checkbox is not checked.");  // Fail
		    }
    }
    
	@And("User verify the seismos check box")
    public void verifySeismosCheckBoxPresence() throws InterruptedException {
		Thread.sleep(2000);
        WebElement checkBox1 = driver.findElement(By.xpath("//label[text()=' Seismos ']")); // Replace with actual locator
        Assert.assertEquals(checkBox1.getText(),"Seismos", "Seismos checkbox is not visible");
    }
	
	
    @And("user click on the propilot check box")
    public void clickProPilotCheckBox() {
    	
        WebElement checkBox1 = driver.findElement(By.xpath("//label[text()=' Propilot ']/parent::div/input"));
        checkBox1.click();
    }


    @And("User click on the seismos check box")
    public void clickSeismosCheckBox() throws InterruptedException {
    	Thread.sleep(2000);
        WebElement checkBox12 = driver.findElement(By.xpath("//label[text()=' Seismos ']/parent::div/input"));
        checkBox12.click();
    }
    
    @And("user verify the van id field")
    public void verifyVanIdField() throws InterruptedException {
    	Thread.sleep(2000);
        WebElement vanIdField = driver.findElement(By.xpath("//label[text()=' Van ID ']")); // Replace with actual locator
        Assert.assertEquals(vanIdField.getText().trim(),"Van ID *", "Van ID field is not visible");
    }

    @And("user enter the data into the van id field")
    public void enterVanIdField() {
        WebElement vanIdField1 = driver.findElement(By.xpath("//label[text()=' Van ID ']/parent::div/div/input"));
        vanIdField1.clear();
        vanIdField1.sendKeys("V12345"); // Replace with dynamic/test data if needed
    }

    @And("the user click on the plot option")
    public void clickPlotOption() throws InterruptedException {
    	Thread.sleep(2000);
        WebElement plotButton = driver.findElement(By.xpath("//a[text()=' Plot ']")); 
        plotButton.click();
    }

    @Then("verify the presence of edit scheduled button")
    public void verifyEditScheduledButtonPresence() {
        WebElement editButton = driver.findElement(By.xpath("//button[text()=' Edit Schedule ']")); 
        Assert.assertTrue(editButton.isDisplayed(), "Edit Scheduled button is not visible");
    }

    @Then("Verify that Include Seismos Data checkbox is visible when Seismos is ON in plot setting screen")
    public void verifyncludeSeismosDataButtonPresence() throws InterruptedException {
        WebElement editButton1 = driver.findElement(By.xpath("//label[text()=' Surf PRC ']/parent::li/div/input"));
        editButton1.click();
        Thread.sleep(1000);
        WebElement setting = driver.findElement(By.xpath("//img[@alt='settings']"));
        setting.click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Include Seismos Data']")).getText(),"Include Seismos Data" ,"Include Seismos Data is not visible in plot setting");
        WebElement IncludeSeismos = driver.findElement(By.xpath("//label[text()='Include Seismos Data']/parent::div/input"));
        if (IncludeSeismos.isSelected()) {
            System.out.println("PASS: Seismos checkbox is checked.");
            Assert.assertTrue(true, "Seismos checkbox is checked.");  // Pass
        } else {
            System.out.println("FAIL: Seismos checkbox is not checked.");
            Assert.fail("Seismos checkbox is not checked.");  // Fail
        }
        WebElement cancelBtn = driver.findElement(By.xpath("//button[text()='Cancel']"));
        cancelBtn.click();
        Thread.sleep(1000);
      
    }
    
    @Then("On pressing Edit Schedule button open Treatment Schedule Actual page in a special Propilot mode")
    public void verifyActualTreatmentScheduledActualPageEditScheduledButtonClick() throws InterruptedException {
        WebElement editButton2 = driver.findElement(By.xpath("//button[text()=' Edit Schedule ']")); 
        editButton2.click();
        Thread.sleep(2000);
        WebElement treatmentHeader = driver.findElement(By.xpath("//h4[text()='Treatment Schedule']"));
        Assert.assertEquals(treatmentHeader.getText(), "Treatment Schedule");
        
    }
    
    @And("user click on the well & treatment option")
    public void clickWellAndTreatmentOption() throws InterruptedException {
        WebElement input = driver.findElement(By.xpath("//span[text()=' Inputs']")); 
        input.click();
        Thread.sleep(2000);
        WebElement wellTreatment = driver.findElement(By.xpath("//a[text()=' Well & Treatment ']")); 
        wellTreatment.click();
        
    }

    @And("verify the van id value")
    public void verifyVanIdValue() {
        WebElement vanIdField = driver.findElement(By.xpath("//label[text()=' Van ID ']/parent::div/div/input"));
        String value = vanIdField.getAttribute("value");
        Assert.assertEquals(value, "V12345", "Van ID value is incorrect"); // Replace expected value dynamically if needed
    }

    @And("uncheck the propilot check box")
    public void uncheckProPilotCheckBox() {
        WebElement checkBox = driver.findElement(By.xpath("//label[text()=' Propilot ']/parent::div/input"));
        if (checkBox.isSelected()) {
            checkBox.click();
        }
    }
    
    @And("uncheck the seismos check box")
    public void uncheckSeismosCheckBox() throws InterruptedException {
    	Thread.sleep(2000);
    	WebElement CollapseMenu = driver.findElement(By.xpath("//img[@tooltip='Collapse']"));   
    	CollapseMenu.click();
    	Thread.sleep(2000);
        WebElement checkBox = driver.findElement(By.xpath("//label[text()=' Seismos ']/parent::div/input"));
        if (checkBox.isSelected()) {
            checkBox.click();
        }
    }

    @And("verify the absence of edit scheduled button")
    public void verifyEditScheduledButtonAbsence() {
        boolean isPresent = driver.findElements(By.xpath("//button[text()=' Edit Schedule ']")).size() > 0;
        Assert.assertFalse(isPresent, "Edit Scheduled button should not be visible");
    }
}