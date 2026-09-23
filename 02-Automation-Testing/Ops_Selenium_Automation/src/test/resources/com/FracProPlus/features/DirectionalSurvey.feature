@feature_DirectionalSurvey
Feature: DirectionalSurvey

Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen  
    And Click on wellbore configuration option
    And Verify the page header name
Scenario: User clicks on Directional Survey tab
    When the user clicks on the directional survey tab
Scenario: Verify the md inclination azimuth tvd Ns and Ew header name in directional survey tab
    And Verify the md inclination azimuth tvd Ns and Ew header name in directional survey tab
Scenario: Select North, South, East, West, TVD from Specify dropdown
    When the user selects north south east west and TVD option from the specify dropdown
Scenario: Select MD, Inclination, Azimuth from Specify dropdown
    And the user selects MD and Inclination and Azimuth option from specify dropdown
Scenario: Select MD, TVD, Azimuth from Specify dropdown
    And the user selects MD and TVD and Azimuth option from specify dropdown
Scenario: Select North, South, East, West, TVD again
    When the user selects north south east west and TVD option from the specify dropdown
Scenario: Enter North-South value for first row
    And the user enters the data into north south field for first row
Scenario: Enter East-West value for first row
    And the user enters the data into east west field for first row
Scenario: Enter TVD value for first row
    And the user enters the data into TVD field for first row
Scenario: Select MD, Inclination, Azimuth again
    When the user selects MD and inclination and azimuth option from specify dropdown
Scenario: Enter MD value for first row
    And the user enters the data into MD field for first row
Scenario: Enter Inclination value for first row
    And the user enters the data into Inclination field for first row
Scenario: Enter Azimuth value for first row
    And the user enters the data into Azimuth field for first row
    When the user clicks on save button
Scenario: Refresh page on Directional Survey tab
    When the user refreshes the page
    When the user clicks on the directional survey tab
Scenario: Validate the 300 of rows data in the directiona survey table
    And user copy and paste the data from excel to the MD Inclination Azimuth column
    When the user selects north south east west and TVD option from the specify dropdown
Scenario: User copy and pastes the data from excel into TVD, NS, and EW columns
    And user copy and paste the data from excel to the TVD NS and EW column
    When the user clicks on save button
    #Then the value into MD field for first row should be verified
    #And the value into inclination field for first row should be verified
    #And the value into Azimuth field for first row should be verified
    #And the value into north south field for first row should be verified
    #And the value into east west field for first row should be verified
    #And the value into TVD field for first row should be verified
    #When the user refreshes the page
    #Then the value into MD field for first row should be verified
    #And the value into inclination field for first row should be verified
    #And the value into Azimuth field for first row should be verified
    #And the value into north south field for first row should be verified
    #And the value into east west field for first row should be verified
    #And the value into TVD field for first row should be verified