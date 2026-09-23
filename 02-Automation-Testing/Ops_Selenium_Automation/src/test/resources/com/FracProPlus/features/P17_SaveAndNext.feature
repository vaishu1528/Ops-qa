@feature_SaveAndNext
Feature: Save and Next functionality

  Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen

Scenario: Verify user clicks on Well and Treatment tab
    When Click on the well and treatment tab
Scenario: Verify user enters data in General Information tab
    And enter data into any field in general information tab
Scenario: Verify user clicks on Comments tab    
    And click on the comments tab
Scenario: Verify user clicks on Yes button in Save and Next popup
    And click on yes save button in save and next pop up
Scenario: Verify user navigates back to General Information tab
    And click on the general information tab
Scenario: Verify saved data is displayed in General Information tab
    Then Verify the saved data in general information tab
Scenario: Verify user navigates again to Comments tab
    And click on the comments tab
Scenario: Verify user clicks on Next button from Comments tab
    And Click on the next button
Scenario: Verify Channel Input for Model page header is displayed
    Then Verify the channel input for model page header name
Scenario: Verify user selects Model Input Channel checkbox
    And Select model input channel check box
Scenario: Verify user clicks on Additive tab
    And Click on the additive tab
Scenario: Verify user clicks on Yes button in Save and Next popup from Additive tab
    And click on yes save button in save and next pop up
Scenario: Verify user navigates to Real Time Channel tab
    And Click on the real time channel tab
    And Click on the next button
Scenario: Verify next page header name is displayed
    Then Verify the page header name
Scenario: Verify user clicks on Drilled Hole tab
    When Click on the drilled hole tab
Scenario: Verify user enters data into Top MD field
    When User enter the data into top md field for save and next
Scenario: Verify user clicks on Directional Survey tab
    And Click on the directional survey tab
Scenario: Verify user clicks on Yes button in Save and Next popup from Directional Survey
    And click on yes save button in save and next pop up
Scenario: Verify entered Top MD data is displayed in Drilled Hole tab
    Then Verify the data in the drilled hole tab
Scenario: Verify user navigates again to Directional Survey tab
    And Click on the directional survey tab
Scenario: Verify user clicks on Next button from Directional Survey tab
    And Click on the next button
Scenario: Verify Heat Transfer Parameters page header is displayed
    Then Verify the heat transfer parameters header page name
Scenario: Verify user enters value in Surface Fluid Temperature field
    When the user enters the value into the Surface Fluid Temperature field for save and next
    And Click on the next button
Scenario: Verify user confirms Save and Next action from Heat Transfer Parameters
    And click on yes save button in save and next pop up
Scenario: Verify Reservoir Parameters page header is displayed
    Then Verify the reservoir parameters page header name
Scenario: Verify user navigates back to Heat Transfer Parameters module
    When the user clicks on the heat transfer parameters module
Scenario: Verify saved Surface Fluid Temperature data is retained
    And Verify the Surface Fluid Temperature field data after save
Scenario: Verify user clicks on Next button from Heat Transfer Parameters module
    And Click on the next button
Scenario: Verify Reservoir Parameters page header is displayed again
    Then Verify the reservoir parameters page header name
    And Click on the next button
Scenario: Verify Material Selection page header is displayed
    Then Verify the material selection page header name
    And Click on the chemical selection tab
    And Click on the next button
Scenario: Verify user clicks on Collapse button
    And click on the collapse button
Scenario: Verify user enters value in Flow Rate column for first row
    When the user enter valid value into flow rate column for first row for save and next
Scenario: Verify user clicks on Next button after entering Flow Rate
    And Click on the next button
Scenario: Verify user confirms Save and Next action after Flow Rate entry
    And click on yes save button in save and next pop up
Scenario: Verify saved data is displayed in Actual Treatment Schedule tab
    And Click on the actual treatment schedule tab
    Then verify the saved data in actual treatment scheduled tab
    And Click on the treatment totals tab
    And Click on the next button
Scenario: Verify user navigates to Plot screen
    Then Verify the user navigate to plot screen
