package com.FracProPlus.utils;

import com.aventstack.extentreports.service.ExtentService;

public class ExtentReportHooks {

    public static void addSystemInfo() {
        ExtentService.getInstance().setSystemInfo("User", "Ankit,Akshay and Bikash");
        ExtentService.getInstance().setSystemInfo("Environment", "Fracpro plus UAT");
        ExtentService.getInstance().setSystemInfo("Browser", "Chrome");
        ExtentService.getInstance().setSystemInfo("App", "FracProPlus");
    }
}
