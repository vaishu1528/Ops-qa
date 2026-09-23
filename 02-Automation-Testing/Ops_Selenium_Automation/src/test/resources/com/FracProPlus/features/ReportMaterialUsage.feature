@feature_MaterialUsage
Feature: Material Usage

Scenario: User is on the Report Page
     Given the user is on the Dashboard Page
     Then User click on Continue button from the Fracpro live plus card
     And Navigate and click on the pad from the home screen

Scenario: Verify the user can navigate to the Report Page
    When the user clicks on the results module
    And the user clicks on the report sub module
    Then the user verifies the report page header name
    When the user clicks on the material usage module
Scenario: Verify chemical table headers in Material Usage Page
    Then Verify the chemical table header names
Scenario: Verify proppant table headers in Material Usage Page
    And Verify the proppant table header names
Scenario: Verify acid table headers in Material Usage Page
    And Verify the acid table header names
Scenario: Enter design total value into the chemical table
    When user enter the design total value into the chemical table
Scenario: Enter metered total value into the chemical table
    And user enter the metered total value into the chemical table 
Scenario: Enter actual total value into the chemical table 
    And user enter the Actual total value into the chemical table
Scenario: Enter design total value into the proppant table
    And user enter the design total value into the proppant table
Scenario: Enter metered total value into the proppant table
    And user enter the metered total value into the proppant table  
Scenario: Enter actual total value into the proppant table
    And user enter the Actual total value into the proppant table
Scenario: Enter design total value into the acid table
    And user enter the acid name into the acid name table
    And user enter the design total value into the acid table
Scenario: Enter actual total value into the acid table
    And user enter the Actual Total total value into the acid table
Scenario: Enter clean total value into the field
    And user enter the clean total value into the field
Scenario: Select plot option in Material Usage Page
    And user select the plot option from select plot field
Scenario: Verify presence of PRC Plot button
    Then Verify the presence of display PRC Plot button in material usage page
    When the user clicks on the Save button to save the data
Scenario: Clear design data in Material Usage Page
    And the user click on the clear design button
Scenario: Clear metered data in Material Usage Page
    And the user click on the clear metered button
Scenario: Clear actual data in Material Usage Page
    And the user click on the clear actuals button
    #Then verify the data should be cleared for design total field both for chemical and proppant table
    #And verify the data should be cleared for actual total field both for chemical and proppant table
    #And verify the data should be cleared for metered total field both for chemical and proppant table