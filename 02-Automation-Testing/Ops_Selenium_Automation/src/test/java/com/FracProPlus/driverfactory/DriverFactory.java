package com.FracProPlus.driverfactory;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;
	private static Logger logger = LogManager.getLogger(DriverFactory.class);

	public static void initializeBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();

			// Window settings
			chromeOptions.addArguments("--window-size=1920,1080");
			chromeOptions.addArguments("--start-maximized");

			// Browser behavior
			chromeOptions.addArguments("--disable-notifications");
			chromeOptions.addArguments("--incognito");

			// Headless mode (correct, modern syntax)
			chromeOptions.addArguments("--headless=new");
			chromeOptions.addArguments("--disable-gpu");
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-dev-shm-usage");
			chromeOptions.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(chromeOptions);
			logger.info("Chrome driver initialized in incognito mode");

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.info("Firefox driver initialized");

		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			logger.info("Safari driver initialized");

		} else {
			throw new RuntimeException("Browser not supported: " + browserName);
		}

		// Set window position and timeouts
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
