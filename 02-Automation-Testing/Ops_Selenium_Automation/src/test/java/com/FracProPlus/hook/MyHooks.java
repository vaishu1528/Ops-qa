package com.FracProPlus.hook;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.utils.ConfigReader;
import com.FracProPlus.utils.ReadData;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class MyHooks extends DriverFactory {
    private static final Logger logger = LogManager.getLogger(MyHooks.class);
    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        // Load properties
        Properties prop = new ConfigReader().intializeProperties();

        // Launch browser
        initializeBrowser(prop.getProperty("browser"));
        driver = getDriver();

        // Navigate to application
        driver.get("https://liveplus-qa.linqx.io/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        try {
        // Login flow
            driver.findElement(By.id("email")).sendKeys("vaibhav.garg@walkingtree.tech");
            driver.findElement(By.id("password")).sendKeys("Vaibhav@001");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    }catch (Exception e) {
        logger.warn("Login step skipped or failed: " + e.getMessage());
    }

    }


    @AfterStep
    public void takeScreenshotOnStepFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);

                String folderPath = "target/StepFailureScreenshots/";
                File screenshotDir = new File(folderPath);
                if (!screenshotDir.exists()) {
                    screenshotDir.mkdirs(); // Create folder if it doesn't exist
                }

                String fileName = scenario.getName().replaceAll(" ", "_") + "_step.png";
                FileUtils.copyFile(source, new File(folderPath + fileName));

                logger.info("Step failure screenshot saved: " + folderPath + fileName);
            } catch (Exception e) {
                logger.error("Failed to capture step failure screenshot: " + e.getMessage());
            }
        }
    }

    @AfterAll
    public static void tearDown() {
        try {
            // Check if scenario failed (you won't have Scenario object here directly,
            // so this screenshot is always taken as a workaround in static context)
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String folderPath = "target/Screenshot/";
            File screenshotDir = new File(folderPath);
            if (!screenshotDir.exists()) {
                screenshotDir.mkdirs();
            }

            String timestamp = String.valueOf(System.currentTimeMillis());
            String screenshotPath = folderPath + "tearDown_screenshot_" + timestamp + ".png";
            FileUtils.copyFile(source, new File(screenshotPath));
            logger.info("Screenshot captured at teardown: " + screenshotPath);

        } catch (IOException e) {
            logger.error("Failed to save screenshot at teardown: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Error during screenshot capture in teardown: " + e.getMessage());
        }

        try {
//            Thread.sleep(2000); // Optional wait
//            driver.findElement(By.xpath("//*[@class='d-none d-md-inline']")).click();
//            driver.findElement(By.xpath("//*[text()='Sign out']")).click();

            Thread.sleep(1000);
            driver.quit();
        } catch (Exception e) {
            System.out.println("⚠️ Error during logout: " + e.getMessage());
        }
    }
}