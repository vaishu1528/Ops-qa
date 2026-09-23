package com.FracProPlus.utils;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.Scenario;

public class CommonUtils {
	
	public static final int IMPLICIT_WAIT_TIME=10;
	public static final int PAGE_LOAD_TIME=15;
	public static final int EXPLICIT_WAIT_BASIC_TIME=20;
	private static Logger logger = LogManager.getLogger(CommonUtils.class);
	public static String getEmailWithTimeStamp() {
		
		Date date = new Date();
		String newEmail= "newemail"+date.toString().replace(" ","_").replace(":","_")+"@gmail.com";
		logger.info("getEmailWithTimeStamp() invoked and returning new email "+newEmail);
		return newEmail;
		
	}
	public static byte[] takeScreenShot(Scenario scenario,WebDriver driver,String scenarioName) {
		byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		logger.info("takeScreenShot() invoked , screenshot taken");
		return srcScreenshot;
	}
	
	
	public static void scrollToBottom(WebDriver driver) {
        // Get the initial page height
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

        while (true) {
            // Scroll to the bottom of the page
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            // Wait for the page to load new content (adjust the sleep time as needed)
            try {
                Thread.sleep(2000);  // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Get the new page height after scrolling
            long newHeight = (long) js.executeScript("return document.body.scrollHeight");

            // If the height hasn't changed, we've reached the bottom
            if (newHeight == lastHeight) {
                break;
            }

}
    }
	
	
	
	public static void scrollToTop(WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // Get the initial scroll position
	    long lastScrollPosition = (long) js.executeScript("return window.pageYOffset");

	    while (true) {
	        // Scroll up by a fixed amount (e.g., 1000 pixels)
	        js.executeScript("window.scrollBy(0, -1000);");

	        // Wait for the page to adjust (tweak time if needed)
	        try {
	            Thread.sleep(500); // Sleep for half a second
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Get the current scroll position
	        long newScrollPosition = (long) js.executeScript("return window.pageYOffset");

	        // If we've reached the top (position is 0) or it hasn't changed, we're done
	        if (newScrollPosition == 0 || newScrollPosition == lastScrollPosition) {
	            break;
	        }

	        lastScrollPosition = newScrollPosition;
	    }
	}
	
	//Dropdown selected option verification
	
	public static void DropdownSelectedOptionVerification(WebElement dropdownElement, int selecteOptionIndexNo, String ErrorMessage) {
        try {
            Select dropdown = new Select(dropdownElement);
            WebElement selectedOption = dropdown.getFirstSelectedOption();
            Assert.assertEquals(dropdown.getOptions().indexOf(selectedOption), selecteOptionIndexNo, ErrorMessage);
        } catch (Exception e) {
            Assert.fail("Dropdown verification failed", e);
        }
    }
	
	public static void dismissChromePasswordPopup() {
        try {
//            Robot robot = new Robot();
//
//           
//            int x = 1132; 
//            int y = 348;
//
//            robot.mouseMove(x, y);
//            Thread.sleep(5000); 
//
//           
//            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//            Thread.sleep(1000);
//            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

          System.out.println("User is on hoeme page");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static void dismissChromePasswordPopup2() {
        try {
            Robot robot = new Robot();

            // Replace these with your actual coordinates
            int x = 935; // Example only — update after getting from console
            int y = 342;

            robot.mouseMove(x, y);
            Thread.sleep(5000); // slight pause

           
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(1000);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

//            System.out.println("Clicked on OK button at X=" + x + ", Y=" + y);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
 public static void getMousePosition() {
        try {
            System.out.println("Move your mouse to the OK button within 5 seconds...");

            Thread.sleep(5000); // Gives you time to hover over the OK button

            PointerInfo info = MouseInfo.getPointerInfo();
            Point location = info.getLocation();
            System.out.println("Current mouse position: X = " + location.x + ", Y = " + location.y);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


	
	
	
	
	
	
	
	
	
	

}
