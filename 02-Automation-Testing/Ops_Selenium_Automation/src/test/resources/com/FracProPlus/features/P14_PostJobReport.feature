@feature_postjobreport
Feature: PostJobData

Scenario: User is on the Report Page
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen

Scenario: Click Results module
    When the user clicks on the results module
Scenario: Click Report sub module
    And the user clicks on the report sub module
Scenario: Click Post Job Report tab
    When the user clicks on the post job report tab
Scenario: Enter data in Kickoff TVD field
    And the user enters the data into the kickoff TVD field
Scenario: Enter data in Plug Depth field
    And the user enters the data into the Plug Depth field
Scenario: Enter data in Produced Water field
    And the user enters the data into the Produced Water field
Scenario: Enter data in Pumpdown Volume field
    And the user enters the data into the Pumpdown Volume field
Scenario: Enter data in Operator Max Pressure field
    And the user enters the data into the Operator max pressure field
Scenario: Enter data in Pumpdown Max Pressure field   
    And the user enters the data into the Pumpdown Max Pressure field
Scenario: Enter data in Design Avg Treating Pressure field  
    And the user enters the data into the Design avg treating pressure field
Scenario: Enter data in Design Avg Frac Gradient field
    And the user enters the data into the Design avg frac gradient field
Scenario: Enter data in Charge Weight field   
    And the user enters the data into the Charge weight field
Scenario: Enter data in Pumpdown Max Rate field
    And the user enters the data into the Pumpdown max rate field
Scenario: Enter data in Field Gas field
    And the user enters the data into the Field Gas field
Scenario: Enter data in CNG field
    And the user enters the data into the CNG field
Scenario: Enter data in Plug Type field
    And the user enters the data into the plug type field
Scenario: Select Bacteria Treatment Method option
    And the user selects the option from Bacteria treatment method dropdown
Scenario: Enter data in Diesel field
    And the user enters the data into the diesel field
Scenario: Enter data in Chlorides field
    And the user enters the data into the chlorides field
Scenario: Enter number in Pad Stage No field
    And the user enters the number into the pad stage no field
Scenario: Enter data in Override Surface Max Pressure field
    And the user enters the data into the override surface max pressure field
Scenario: Verify Sub Percentage field read-only
    Then the user verifies the sub percentage field should be read only
Scenario: Verify Pump at Start field read-only
    And the user verifies the pump at start field should be read only
Scenario: Verify Pump at End field read-only
    And the user verifies the pump at end field should be read only
Scenario: Verify value in Sub Percentage field
    And the user verifies the value in the sub percentage field
Scenario: Select option from Select Plot dropdown
    When the user selects an option from select plot dropdown
Scenario: Click Clear Data button
    And the user clicks on the clear data button to clear the data from all fields
Scenario: Verify all field data after Clear
    Then the user verifies all field data after clicking clear data button
Scenario: User update all the relevant field data into Kickoff TVD field
    And the user enters the data into the kickoff TVD field
    And the user enters the data into the Plug Depth field
    And the user enters the data into the Produced Water field
    And the user enters the data into the Pumpdown Volume field
    And the user enters the data into the Operator max pressure field
    And the user enters the data into the Pumpdown Max Pressure field
    And the user enters the data into the Design avg treating pressure field
    And the user enters the data into the Design avg frac gradient field
    And the user enters the data into the Charge weight field
    And the user enters the data into the Pumpdown max rate field
    And the user enters the data into the Field Gas field
    And the user enters the data into the CNG field
    And the user enters the data into the plug type field
    And the user selects the option from Bacteria treatment method dropdown
    And the user enters the data into the diesel field
    And the user enters the data into the chlorides field
    And the user enters the number into the pad stage no field
    And the user enters the data into the override surface max pressure field
    Then the user verifies the sub percentage field should be read only
    And the user verifies the pump at start field should be read only
    And the user verifies the pump at end field should be read only
    And the user verifies the value in the sub percentage field
    When the user selects an option from select plot dropdown
Scenario: Click Save button to save Post Job Report data
    When the user clicks on the Save button to save data
    And the user refreshes the page
Scenario: Click Post Job Report tab after refresh
    And the user clicks on the post job report tab
    Then the user verifies the data in the kickoff TVD field
Scenario: Verify the Plug depth Values After Save
    And the user verifies the data in the Plug Depth field
Scenario: Verify the Produced Water values After Save
    And the user verifies the data in the Produced Water field
Scenario: Verify the Pumpdown Volume values After Save
    And the user verifies the data in the Pumpdown Volume field
Scenario: Verify the Operator max pressure values After Save
    And the user verifies the data in the Operator max pressure field
Scenario: Verify the Pumpdown Max Pressure values After Save
    And the user verifies the data in the Pumpdown Max Pressure field
Scenario: Verify the Design avg treating Pressure values After Save
    And the user verifies the data in the Design avg treating pressure field
Scenario: Verify the Design avg frac gradient After Save
    And the user verifies the data in the Design avg frac gradient field
Scenario: Verify the Charge weight field  
    And the user verifies the data in the Charge weight field
Scenario: Verify the Pumpdown max rate field
    And the user verifies the data in the Pumpdown max rate field
Scenario: Verify the Field Gas field
    And the user verifies the data in the Field Gas field
Scenario: Verify the CNG field
    And the user verifies the data in the CNG field
    And the user verifies the data in the plug type field
Scenario: Verify the bacteria treatment method dropdown value
    And the user verifies the option from Bacteria treatment method dropdown
    And the user verifies the data in the diesel field
    And the user verifies the data in the chlorides field
    #And the user verifies the number in the pad stage no field
    #And the user verifies the data in the override surface max pressure field
    And the user verifies the data in the pump at start field
    And the user verifies the data in the pump at end field
Scenario: Click Download WITSML Report
    When the user clicks on the download WITSML Report
    #Then the user verifies the report download successfully message
Scenario: Click Download word Report
    When the user clicks on the download word Report
    #Then the user verifies the report download successfully message
Scenario: Click Download ASCII file button  
    When the user clicks on the download ASCII file button
    #Then the user verifies the report download successfully message
