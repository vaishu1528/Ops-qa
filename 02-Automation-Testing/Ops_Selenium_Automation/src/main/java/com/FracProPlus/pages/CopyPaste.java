package com.FracProPlus.pages;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.FracProPlus.utils.ExecelReader;

public class CopyPaste {

	WebDriver driver;

	// Constructor
	public CopyPaste(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getStage() {
		return driver.findElement(
				By.xpath("(//h5[text()='Copy & Paste']/ancestor::div[@class='modal-content']/descendant::td)[1]"));
	}

	public WebElement getTopMD() {
		return driver.findElement(
				By.xpath("(//h5[text()='Copy & Paste']/ancestor::div[@class='modal-content']/descendant::td)[2]"));
	}

	public WebElement getBotMD() {
		return driver.findElement(
				By.xpath("(//h5[text()='Copy & Paste']/ancestor::div[@class='modal-content']/descendant::td)[3]"));
	}

	public WebElement getDiameter() {
		return driver.findElement(
				By.xpath("(//h5[text()='Copy & Paste']/ancestor::div[@class='modal-content']/descendant::td)[4]"));
	}

	public WebElement getNumOfPerfs() {
		return driver.findElement(
				By.xpath("(//h5[text()='Copy & Paste']/ancestor::div[@class='modal-content']/descendant::td)[5]"));
	}

	public WebElement getPerfPhasing() {
		return driver.findElement(
				By.xpath("(//h5[text()='Copy & Paste']/ancestor::div[@class='modal-content']/descendant::td)[6]"));
	}

	public void pasteDataToColumnAsNumeric(String sheetName, String columnHeader, WebElement element,
			boolean performClick) throws Exception {
		try {
			Actions actions = new Actions(driver);
			ExecelReader exl = new ExecelReader();
			List<String> excelData = exl.getExcelDataWithColumn(sheetName, columnHeader);

			if (excelData.isEmpty()) {
				System.out.println("No data found in the specified column.");
				return;
			}

			if (performClick) { // Only click if performClick is true
				actions.click(element).perform();
				Thread.sleep(4000);
			}

			// Copy data to clipboard
			StringSelection stringSelection = new StringSelection(String.join("\n", excelData));
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			// Ensure element is interactable
			if (element.isDisplayed() && element.isEnabled()) {
				Robot robot = new Robot();
				robot.delay(500);
				
				// Press CTRL + V
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);

				// Press ENTER to confirm the input
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			} else {
				System.out.println("Element is not interactable");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value = arguments[1];", element, excelData.get(0));
			}
		} catch (Exception e) {
			System.out.println("Error while pasting data: " + e.getMessage());
		}
	}

}
