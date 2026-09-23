package com.FracProPlus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.FracProPlus.utils.ElementUtils;

public class PlotInWordReportPage {

	private WebDriver driver;
	private ElementUtils elementUtils;

	public PlotInWordReportPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtils = new ElementUtils(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Plots in Word Report']")
	private WebElement plotInWordReportModule;

	@FindBy(xpath = "(//*[contains(text(),'Available Plots')])[1]")
	private WebElement availablePlotTableHeader;

	@FindBy(xpath = "(//td[contains(text(),'Surf PRC')]//following::input[@role='checkbox'])[1]")
	private WebElement plot1CheckBox;

	@FindBy(xpath = "(//td[contains(text(),'Btm PRC')]//following::input[@role='checkbox'])[1]")
	private WebElement plot2CheckBox;

	@FindBy(xpath = "(//td[contains(text(),'Backside')]//following::input[@role='checkbox'])[1]")
	private WebElement plot3CheckBox;

	@FindBy(xpath = "(//td[contains(text(),'TP+Hyd')]//following::input[@role='checkbox'])[1]")
	private WebElement plot4CheckBox;

	@FindBy(xpath = "(//td[contains(text(),'xyztest')]//following::input[@role='checkbox'])[1]")
	private WebElement plot5CheckBox;

	public void clickElementPlotInWordReportModule() {
		try {
			elementUtils.clickElement(plotInWordReportModule);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAvailablePlotPageHeader() {
		try {
			String text13 = availablePlotTableHeader.getAttribute("textContent").replaceAll("\\s+", " ").trim();
			Assert.assertEquals(text13, "Available Plots", "Available plot header name is mismatched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAvailablePlots() {
		try {
			Thread.sleep(2000);
			Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Surf PRC']")).getText(), "Surf PRC",
					"Available plot name 1 is matched !");
			Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Btm PRC']")).getText(), "Btm PRC",
					"Available plot name 2 is matched !");
			Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Backside']")).getText(), "Backside",
					"Available plot name 3 is matched !");
			Assert.assertEquals(driver.findElement(By.xpath("//td[text()='TP+Hyd']")).getText(), "TP+Hyd",
					"Available plot name 4 is matched !");
			Assert.assertEquals(driver.findElement(By.xpath("//td[text()='xyztest']")).getText(), "xyztest",
					"Available plot name 5 is matched !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickPlot1checkBox() {
		try {
			elementUtils.clickElement(plot1CheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickPlot2checkBox() {
		try {
			elementUtils.clickElement(plot2CheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickPlot3checkBox() {
		try {
			elementUtils.clickElement(plot3CheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickPlot4checkBox() {
		try {
			elementUtils.clickElement(plot4CheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickPlot5checkBox() {
		try {
			elementUtils.clickElement(plot5CheckBox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBehaviorOfAllCheckBox() {
		try {
			Thread.sleep(2000);
			Assert.assertTrue(plot1CheckBox.isSelected(), "Checkbox is not checked - Test Failed!");
			Assert.assertTrue(plot2CheckBox.isSelected(), "Checkbox is not checked - Test Failed!");
			Assert.assertTrue(plot3CheckBox.isSelected(), "Checkbox is not checked - Test Failed!");
			Assert.assertTrue(plot4CheckBox.isSelected(), "Checkbox is not checked - Test Failed!");
			Assert.assertTrue(plot5CheckBox.isSelected(), "Checkbox is not checked - Test Failed!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
