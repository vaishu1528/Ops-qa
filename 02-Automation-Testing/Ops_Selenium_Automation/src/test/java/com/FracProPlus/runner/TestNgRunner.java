package com.FracProPlus.runner;

import java.io.File;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@Listeners({ExtentITestListenerClassAdapter.class})
public class TestNgRunner extends AbstractTestNGCucumberTests {

    @Test(priority = 1)
    public void runCreatePadAndWellFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P01_CreatePadAndWell.feature");
    }
    
    
    @Test(priority = 2)
    public void runawellandtreatmentgeneralinfoFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P02_awellandtreatmentgeneralinfo.feature");
   }
    
    @Test(priority = 3)
    public void runWellJobCommentsFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P03_WellAndTreatmentCommentTab.feature");
    }
    
    
    @Test(priority = 4)
    public void runWellboreConfigFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P04_dashboard.feature");
    }
    
    @Test(priority = 5)
    public void runHeatTransferParamsFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P05_HeatTransferParameters.feature");
    }
    
    
    @Test(priority = 6)
    public void runReservoirparametersFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P06_Reservoirparameters.feature");
    }
    
    @Test(priority = 7)
    public void runAddMAterialFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P07_AddMaterial.feature");
    }
    
    @Test(priority = 8)
    public void runEditFluidFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P08_Editfluid.feature");
    }
    
    @Test(priority = 9)
    public void runFluidRheologyFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P09_Fluidrheology.feature");
    }
    
    @Test(priority = 10)
    public void runEditProppantFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P10_EditProppantData.feature");
    }
    
    @Test(priority = 11)
    public void runTreatmentScheduledFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P11_TreatmentSchedule.feature");
    }
    
    @Test(priority = 12)
    public void runTreatmentScheduledTotalFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P12_TreatmentScheduledTotal.feature");
    }
    
    @Test(priority = 13)
    public void runPlotInWordReportFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P13_PlotInWordReport.feature");
    }
    
    @Test(priority = 14)
    public void runPostJobReportFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P14_PostJobReport.feature");
    }
    
    @Test(priority = 15)
    public void runWellboreConfigurationFeature() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P15_WellBoreConfiguration.feature");
    }
    
    @Test(priority = 16)
    public void runActualTreatmentScheduled() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P16_ActualTreatmentScheduled.feature");
    }
    
    
    @Test(priority = 17)
    public void runSaveAndNext() {
        runCucumberFeature("src/test/resources/com/FracProPlus/features/P17_SaveAndNext.feature");
    }
    
    
    private void runCucumberFeature(String featurePath) {
	    String featureName = new File(featurePath).getName().replace(".feature", "");

	    String[] argv = new String[] {
	        featurePath,
	        "--plugin", "pretty",
	        "--plugin", "html:target/cucumber-reports/html-" + featureName + ".html",
	        "--plugin", "json:target/cucumber-reports/" + featureName + ".json",
	        "--plugin", "junit:target/cucumber-reports/" + featureName + ".xml"
	    };

	    io.cucumber.core.cli.Main.run(argv, Thread.currentThread().getContextClassLoader());
	}


}
