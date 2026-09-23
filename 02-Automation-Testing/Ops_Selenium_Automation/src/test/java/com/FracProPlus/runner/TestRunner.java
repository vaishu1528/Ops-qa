package com.FracProPlus.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {
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
        "src/test/resources/com/FracProPlus/features/P15_WellBoreConfiguration.feature",
    },
    glue = "stepDefinitions",
    publish = true,
    plugin = {
        "pretty",
        "html:target/CucumberReports/CucumberReport.html",
        "json:target/CucumberReports/CucumberReport.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    tags = "@feature_PadCreation or @feature_wellandtreatment_generalinf or @feature_WellAndTreatmentCommentTab or @wellbore_configuration or @feature_heattransferparameters or @feature_reservoirparameters or @feature_addproppentandfluid or @feature_editfluid or @feature_fluidrheology or @feature_Proppant-Data or @feature_TreatmentSchedule_Design or @feature_treatmentscheduledtotal or @PlotsinWordReport or @feature_postjobreport"                                                              // 👈 'or' instead of 'and'
)
public class TestRunner {
}

