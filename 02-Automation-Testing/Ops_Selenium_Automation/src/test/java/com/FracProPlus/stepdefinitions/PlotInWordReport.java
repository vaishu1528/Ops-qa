package com.FracProPlus.stepdefinitions;

import com.FracProPlus.driverfactory.DriverFactory;
import com.FracProPlus.pages.PlotInWordReportPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlotInWordReport extends DriverFactory {

	PlotInWordReportPage plotinwordreport= new PlotInWordReportPage(driver);
	
	@When("the user click on the plot in word report tab")
	public void the_user_click_on_the_plot_in_word_report_tab() {
		plotinwordreport.clickElementPlotInWordReportModule();
	}

	@Then("verify the Available plot table header name")
	public void verify_the_available_plot_table_header_name() {
		plotinwordreport.verifyAvailablePlotPageHeader();
	}

	@Then("verify the plot names present in available plot table")
	public void verify_the_plot_names_present_in_available_plot_table() {
		plotinwordreport.verifyAvailablePlots();
	}

	@When("the user click on the all check box present in available plot table")
	public void the_user_click_on_the_all_check_box_present_in_available_plot_table() {
		plotinwordreport.ClickPlot1checkBox();
		plotinwordreport.ClickPlot2checkBox();
		plotinwordreport.ClickPlot3checkBox();
		plotinwordreport.ClickPlot4checkBox();
		plotinwordreport.ClickPlot5checkBox();
	}

	@Then("verify that all the check box present in available plot table should be checked")
	public void verify_that_all_the_check_box_present_in_available_plot_table_should_be_checked() {
		plotinwordreport.verifyBehaviorOfAllCheckBox();
	}

	@When("user refresh the page")
	public void user_refresh_the_page() {
		driver.navigate().refresh();
	}
	
}
