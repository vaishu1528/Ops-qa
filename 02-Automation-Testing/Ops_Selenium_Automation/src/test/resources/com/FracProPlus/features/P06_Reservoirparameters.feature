@feature_reservoirparameters
Feature: ReservoirParameters

Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen
   
Scenario: User clicks on Reservoir Parameters option under Input tab
    When the user clicks on the Reservoir Parameters option under the input tab
Scenario: Verify Reservoir Parameters page header
    Then the page header should be Reservoir Parameters
Scenario: Verify default data for all fields
    Then the user should see default data for all the fields
Scenario: Verify warning message for Fracture Height field 
    And the user verifies the warning message for the Fracture Height field by clearing its value and clicking outside the field
Scenario: Verify warning message for Payzone Height field
    And the user verifies the warning message for the Payzone Height field by clearing its value and clicking outside the field
Scenario: Verify warning message for Depth to Center of Pay field
    And the user verifies the warning message for the Depth to Center of Pay field by clearing its value and clicking outside the field
Scenario: Verify warning message for Closure Stress in Payzone field
    And the user verifies the warning message for the Closure Stress in Payzone field by clearing its value and clicking outside the field
Scenario: Verify warning message for Formation Modulus field
    And the user verifies the warning message for the Formation Modulus field by clearing its value and clicking outside the field
Scenario: Verify warning message for Formation Poissons Ratio field
    And the user verifies the warning message for the Formation Poissons Ratio field by clearing its value and clicking outside the field
Scenario: Verify warning message for Leakoff Coefficient field
    And the user verifies the warning message for the Leakoff Coefficient field by clearing its value and clicking outside the field
Scenario: Verify warning message for Fracture Toughness field
    And the user verifies the warning message for the Fracture Toughness field by clearing its value and clicking outside the field
Scenario: User performs refresh action
    And the user performs the refresh action
Scenario: Verify Save and Next button disabled when a field is cleared
    Then the default data should appear in all the fields
Scenario: Verify Pore Fluid Permeability field is non-editable
    When the user clears any field from the Reservoir Parameters screen
Scenario: Verify Reservoir Temperature field is non-editable
    Then the save and next button should be disabled
    Then the Pore Fluid Permeability field should be non-editable
    And the Reservoir Temperature field should be non-editable
Scenario: Enter data into Fracture Height field
    And the user enters data into the Fracture Height Field 
Scenario: Enter data into Payzone Height field
    And the user enters data into the Payzone Height Field   
Scenario: Enter data into Depth to Center of Pay field
    And the user enters data into the Depth to Center of Pay Field 
Scenario: Enter data into Closure Stress in Payzone field  
    And the user enters data into the Closure Stress in Payzone Field
Scenario: Enter data into Formation Modulus field   
    And the user enters data into the Formation Modulus Field  
Scenario: Enter data into Formation Poissons Ratio field     
    And the user enters data into the Formation Poissons Ratio Field
Scenario: Enter data into Leakoff Coefficient field
    And the user enters data into the Leakoff Coefficient Field
Scenario: Enter data into Fracture Toughness field
    And the user enters data into the Fracture Toughness Field
Scenario: Select value from Reservoir Lithology dropdown
    And the user selects a value from the Reservoir Lithology dropdown
Scenario: Click on Save button for Reservoir Parameters screen 
    And the user clicks on the save button for Reservoir Parameters screen 
Scenario: Verify success toast message after saving
    Then the user verifies that the user is getting the success toast message
Scenario: Verify Reservoir Parameters data is saved successfully
    Then the data should be saved successfully
  