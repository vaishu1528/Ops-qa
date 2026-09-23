package com.FracProPlus.utils;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcelToWebPaste {

    private WebDriver driver;

    // Constructor to initialize WebDriver
    public ExcelToWebPaste(WebDriver driver) {
        this.driver = driver;
    }

    // Method to read Excel data and copy to clipboard
//    public void copyExcelDataToClipboard(String filePath) throws IOException {
//        FileInputStream file = new FileInputStream(filePath);
//        Workbook workbook = new XSSFWorkbook(file);
//        Sheet sheet = workbook.getSheetAt(0);
//        
//        StringBuilder data = new StringBuilder();
//
//        for (Row row : sheet) {
//            for (Cell cell : row) {
//                data.append(cell.toString()).append("\t");
//            }
//            data.append("\n");
//        }
//
//        workbook.close();
//
//        StringSelection stringSelection = new StringSelection(data.toString());
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//    }
    public void copyExcelDataToClipboard(String filePath) throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);

        StringBuilder data = new StringBuilder();

        int maxColumns = 0;
        for (Row row : sheet) {
            if (row.getLastCellNum() > maxColumns) {
                maxColumns = row.getLastCellNum();
            }
        }

        for (Row row : sheet) {
            for (int i = 0; i < maxColumns; i++) {
                Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                data.append(cell.toString()).append("\t");
            }
            // Remove trailing tab and add a newline
            if (data.length() > 0 && data.charAt(data.length() - 1) == '\t') {
                data.setLength(data.length() - 1);
            }
            data.append("\n");
        }

        workbook.close();

        StringSelection stringSelection = new StringSelection(data.toString().trim());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    // Method to find cell and paste data using Robot
    public void pasteDataIntoCell(By cellLocator) throws AWTException, InterruptedException {

        WebElement cell = driver.findElement(cellLocator);
        cell.click();

        Robot robot = new Robot();
        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(6000);
    }
    
    public void pasteDataIntoCellBySendKey(By cellLocator) throws InterruptedException {
        WebElement cell = driver.findElement(cellLocator);
        cell.click();

        // Perform Ctrl+V using Selenium
        cell.sendKeys(Keys.chord(Keys.CONTROL, "v"));

        Thread.sleep(3000); // optional wait if needed
    }
}