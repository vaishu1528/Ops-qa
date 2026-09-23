package com.FracProPlus.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class TestRunnerExtentpdfReport {

    @Test
    public void runAllFeatures() {
        // List all your feature files here
        String[] features = new String[] {
        		"src/test/resources/com/FracProPlus/features/P01_CreatePadAndWell.feature",
                "src/test/resources/com/FracProPlus/features/P02_awellandtreatmentgeneralinfo.feature",
                "src/test/resources/com/FracProPlus/features/P03_WellAndTreatmentCommentTab.feature",
                "src/test/resources/com/FracProPlus/features/P04_dashboard.feature",
                "src/test/resources/com/FracProPlus/features/P05_HeatTransferParameters.feature",
                "src/test/resources/com/FracProPlus/features/P06_Reservoirparameters.feature",
                "src/test/resources/com/FracProPlus/features/P07_AddMaterial.feature",
                "src/test/resources/com/FracProPlus/features/P08_Editfluid.feature",
                "src/test/resources/com/FracProPlus/features/P09_Fluidrheology.feature",
                "src/test/resources/com/FracProPlus/features/P10_EditProppantData.feature",
                "src/test/resources/com/FracProPlus/features/P11_TreatmentSchedule.feature",
                "src/test/resources/com/FracProPlus/features/P12_TreatmentScheduledTotal.feature",
                "src/test/resources/com/FracProPlus/features/P13_PlotInWordReport.feature",
                "src/test/resources/com/FracProPlus/features/P14_PostJobReport.feature",
                "src/test/resources/com/FracProPlus/features/P15_WellBoreConfiguration.feature"
            
        };
       
        // CLI args without feature paths
        List<String> argvList = new ArrayList<>(Arrays.asList(
            "--glue", "com.FracProPlus.stepdefinitions",
            "--glue", "com.FracProPlus.hook",
            "--plugin", "pretty",
            "--plugin", "html:target/ExtentReports/Combined-report.html",
            "--plugin", "json:target/ExtentReports/Combined-report.json",
            "--plugin", "junit:target/ExtentReports/Combined-report.xml",
            "--plugin", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/ExtentReport/"
        ));

        // Add all feature paths
        argvList.addAll(Arrays.asList(features));

        // Convert to array
        String[] argv = argvList.toArray(new String[0]);

        // Run Cucumber
        io.cucumber.core.cli.Main.run(argv, Thread.currentThread().getContextClassLoader());
    }
}