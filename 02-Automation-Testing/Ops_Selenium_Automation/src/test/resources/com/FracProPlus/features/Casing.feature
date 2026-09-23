@feature_casing
Feature: Casing

Background: User is on the Home Screen
    Given the user is on the Home Screens
    And Navigate and click on the pad from the home screens
    And Clicks on the well from overviews
    And Click on wellbore configuration option
    And Verify the page header name
    
    @Casing
    Scenario: As a user i can navigate to the casing section and create data's
    When Click on the casing tab
    Then Verify the casing table header names
    When Enter the data into top md field
    Then Verify the bot md field should be auto updated
    When Enter the data less than top md into bot md field 
    Then Verify the error message
    And Verify the save buttion should be disable
    When Enter the data greater than top md into bot md field
    Then User verify save button should be enable
    And Verify the default selection option in casing field
    And Verify the default selection option in grade field
    When Select the OD field drop down
    When Select a option from weight field dropdown
    Then Verify the value in ID field
    And Verify the value in length field of first row 
    When Select casing option from injection is down dropdown
    And Click on the save button
    #And User refresh the page
    When Click on the casing tab
    Then Verify the values in the Length field for the first row under the Casing tab
    And Verify the values in the Top MD field for the first row under the Casing tab
    And Verify the values in the Bot MD field for the first row under the Casing tab
    And Verify the values in the casing field for the first row under the Casing tab
    And Verify the values in the OD field for the first row under the Casing tab
    And Verify the values in the Weight field for the first row under the Casing tab
    And Verify the values in the ID field for the first row under the Casing tab
    And Verify the values in the Grade field for the first row under the Casing tab
    And Verify the save buttion should be disable
    When User right click on the first row and insert or remove rows
    #SecondRow
    When User enter the value into the Top MD field for second row
    And User enter the value into the Bot MD field for second row
    And User Select the value from the Casing dropdown for second row
    And User enter the value into the OD field for second row
    And User enter the value into the Weight field for second row
    And User enter the value into the ID field for second row
    And User Select the value from the grade dropdown for second row
    And Click on the save button
    And User refresh the page
    When Click on the casing tab
    Then Verify the values in the Length field for the second row under the Casing tab
    And Verify the values in the Top MD field for the second row under the Casing tab
    And Verify the values in the Bot MD field for the second row under the Casing tab
    And Verify the values in the casing field for the second row under the Casing tab
    And Verify the values in the OD field for the second row under the Casing tab
    And Verify the values in the Weight field for the second row under the Casing tab
    And Verify the values in the ID field for the second row under the Casing tab
    And Verify the values in the Grade field for the second row under the Casing tab
    And Verify the save buttion should be disable