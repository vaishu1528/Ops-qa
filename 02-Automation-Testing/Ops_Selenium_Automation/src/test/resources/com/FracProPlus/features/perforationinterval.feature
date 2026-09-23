@feature_perforationinterval
Feature: PerforationInterval


Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen

  Scenario: User clicks on Wellbore Configuration option
    And Click on wellbore configuration option
    
  Scenario: As a user I can navigate to perforation interval
    When the user clicks on the perforation interval tab

  Scenario: Verify default state of 'use multiple clusters for model' checkbox
    And the by default state of use multiple clusters for model check box should be verified

  Scenario: Verify tooltip text on first column
    And verify the first column name as edit clusters in the first column

  Scenario: Verify copy and paste button functionality
    When the user clicks on the copy and paste button
    Then the copy and paste page title name should be verified

  Scenario: Verify the copy and paste functionality from excel in the perforation interval tab
    When the user copies the data from excel and pastes it into the copy and paste table
    And the user clicks on the save button2
    And User refresh the page
    And the user clicks on the perforation interval tab
    And the by default state of use multiple clusters for model check box should be verified

  Scenario: Verify validation when Top MD > Bot MD
    And Click on the add row button for first row

  Scenario: Verify auto-populated Top TVD when Top MD < Bot MD
    And Enter the data into the Top MD field greater than to the BOT MD
    Then Verify the error message sub interval
    When User enter the data into Top md field less than Bot md value
    Then Verify the auto populated value into Top TVD field

  Scenario: Verify auto-populated Bot TVD in sub interval
    When User enter the data into Bot md field in sub interval of first row
    And Verify the auto populated value into Bot TVD field in sub interval of first row
    When User enter data into Top md field for second sub interval of first row
    And User enter data into Bot md field for second sub interval of first row

  Scenario: Enter diameter value in sub interval
    And User enter the value into the diameter field in sub interval
    And User enter the value into the number of perfs field into the sub interval

  Scenario: Select perf phasing in sub interval
    And User select the value into the perf phasing field into the sub interval

  Scenario: Save perforation interval tab
    And Click on the ok button in Perforation Interval tab
    And Click on the save button
    And User refresh the page
    And the user clicks on the perforation interval tab

  Scenario: Verify user stage alias checkbox
    When the user clicks on the user stage alias check box
    Then the Alias table header name should be verified
    When the user enters the data into the alias column of the intervals
    And the user clicks on save button
    And User refresh the page
    And the user clicks on the perforation interval tab

  Scenario: Verify alias entry in interval
    Then the new entered value in the alias column should be verified