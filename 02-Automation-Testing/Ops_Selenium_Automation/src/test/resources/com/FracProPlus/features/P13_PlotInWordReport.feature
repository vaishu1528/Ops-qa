@PlotsinWordReport
Feature: Plots in Word Report

Scenario: user is on the Report Page
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen

Scenario: Click Results module
    When the user clicks on the results module
Scenario: Click Report sub module
    And the user clicks on the report sub module
Scenario: Verify Available Plot table header names
    Then verify the Available plot table header name
Scenario: Verify plot names in Available Plot table
    And verify the plot names present in available plot table
Scenario: Click All check box in Available Plot table
    When the user click on the all check box present in available plot table
Scenario: Click Save button to save data
    And the user clicks on the Save button to save data
Scenario: Verify all check boxes are checked
    Then verify that all the check box present in available plot table should be checked
Scenario: Verify plot names again in Available Plot table
    Then verify the plot names present in available plot table
Scenario: Verify all check boxes still checked
    And verify that all the check box present in available plot table should be checked
Scenario: Click Download WITSML Report
    When the user clicks on the download WITSML Report
    #Then the user verifies the report download successfully message
Scenario: Click Download Word Report
    When the user clicks on the download word Report
    #Then the user verifies the report download successfully message
Scenario: Click Download ASCII file
    When the user clicks on the download ASCII file button
    #Then the user verifies the report download successfully message
Scenario: Click All check box again in Available Plot table
    When the user click on the all check box present in available plot table
    #And the user clicks on the Save button to save data