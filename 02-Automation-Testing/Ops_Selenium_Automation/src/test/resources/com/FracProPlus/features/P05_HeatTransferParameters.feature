@feature_heattransferparameters
Feature: HeatTransferParameters

Scenario: User is on the Home Screen
     Given the user is on the Dashboard Page
     Then User click on Continue button from the Fracpro live plus card
     And Navigate and click on the pad from the home screen    
Scenario:  Navigate to the Heat Transfer Parameters module
    When the user clicks on the heat transfer parameters module
    Then the page header of heat transfer parameters should be displayed
Scenario: Verify Use Fracture Center Depth checkbox presence
    Then the Use Fracture center depth check box should be present
Scenario: Verify Offshore Well checkbox presence
    And the Offshore Well check box should be present
Scenario: Verify Enter Temperature vs Depth checkbox presence
    And the Enter temperature vs Depth check box should be present
Scenario: Verify default value in Surface Proppant Temperature field
    Then the default value in Surface Fluid Temperature field should be displayed
Scenario: Verify default value in Surface N2 Temperature field
    And the default value in Surface Proppant Temperature field should be displayed
Scenario: Verify default value in Surface N2 Temperature field
    And the default value in Surface N2 Temperature field should be displayed
Scenario: Verify default value in Surface CO2 Temperature field
    And the default value in Surface C02 Temperature field should be displayed
Scenario: Verify default value in Surface Rock Temperature field
    And the default value in Surface Rock Temperature field should be displayed
Scenario: Verify default value in Reservoir Temperature at Frac Center Depth field
    And the default value in Reservoir Temperature at Frac Center Depth field should be displayed
Scenario: Verify default value in Display Temperature at field
    And the default value in Display Temperature at field should be displayed
Scenario: Verify default value in Fracture Heat Transfer Coefficient Multiplier field
    And the default value in Fracture Heat Transfer Coefficient Multiplier field should be displayed
Scenario: Verify default value in Wellbore Heat Transfer Coefficient Multiplier field
    And the default value in Wellbore Heat Transfer Coefficient Multiplier field should be displayed
Scenario: Verify Offshore Well checkbox default fields
    When the user clicks on the Offshore Well check box
Scenario: Verify Surface Rock Temperature read-only when Offshore Well checked
    Then the default value in Surface Water Temperature field should be displayed
    And the default value in Seabed Temperature field should be displayed
    And the default value in Water Depth field should be displayed
    And the default value in Sea Current field should be displayed
    And the default value in Ocean or Wellbore Heat Transfer Coefficient Multiplier field should be displayed
Scenario: Verify Surface Rock Temperature read-only when Offshore Well checked
    Then the Surface Rock Temperature field should be read only
    When the user unchecks the Offshore Well check box
Scenario: Verify Surface Rock Temperature editable when Offshore Well unchecked
    Then the Surface Rock Temperature field should be editable
Scenario: Verify Surface Rock Temperature read-only when Enter Temperature vs Depth checked
    When the user clicks on the Enter Temperature vs Depth check box
    Then the Surface Rock Temperature field should be read only
Scenario: Verify Depth TVD and Temperature table headers
    And the table header name of Depth TVD field should be displayed
    And the table header name of Temperature field should be displayed
    When the user unchecks the Enter Temperature vs Depth check box
Scenario: Verify Surface Rock Temperature read-only when Enter Temperature vs Depth unchecked
    Then the Surface Rock Temperature field should be read only
Scenario: Verify Use Fracture Center Depth checkbox is checked by default
    And the Use Fracture Center Depth check box should be checked by default
Scenario: Verify Display Temperature editable when Use Fracture Center Depth unchecked
    When the user unchecks the Use Fracture Center Depth check box
Scenario:  Verify Display Temperature field editable when Use Fracture Center Depth is unchecked
    Then the Display Temperature at field should be editable
Scenario: Enter value in Surface Fluid Temperature field
    When the user enters the value into the Surface Fluid Temperature field
Scenario: Enter value in Surface Proppant Temperature field
    And the user enters the value into the Surface Proppant Temperature field
Scenario: Enter value in Surface N2 Temperature field
    And the user enters the value into the Surface N2 Temperature field
Scenario: Enter value in Surface CO2 Temperature field
    And the user enters the value into the Surface C02 Temperature field
Scenario: Enter value in Surface Rock Temperature field
    And the user enters the value into the Surface Rock Temperature field
Scenario: Enter value in Reservoir Temperature at Frac Center Depth field
    And the user enters the value into the Reservoir Temperature at Frac Center Depth field
Scenario: Enter value in Display Temperature at field
    And the user enters the value into the Display Temperature at field
Scenario: Enable Use Fracture Center Depth
    And the user clicks the Use Fracture Center Depth check box for enable
Scenario: Enter value in Wellbore Heat Transfer Coefficient Multiplier field
    And the user enters the value into the Wellbore Heat Transfer Coefficient Multiplier field
    Scenario: Enter value in Fracture Heat Transfer Coefficient Multiplier field
    And the user enters the value into the Fracture Heat Transfer Coefficient Multiplier field
Scenario: Enter Offshore Well values
    When the user clicks on the Offshore Well check box
    And the user enters the value into the Water Depth field
    And the user enters the value into the Surface Water Temperature field
    And the user enters the value into the Seabed Temperature field
    And the user enters the value into the Sea Current field
    And the user enters the value into the Ocean or Wellbore Heat Transfer Coefficient Multiplier field
Scenario: Enter Temperature vs Depth values
    When the user clicks on the Enter Temperature vs Depth check box
    And the user enters the value into the Depth TVD field
    And the user enters the value into the Temperature field 
Scenario: Save entered Heat Transfer Parameters
    When the user click on the save button
Scenario: User perform the page refresh action
    And the user refreshes the page
Scenario: Verify saved Surface Fluid Temperature value
    Then the page header of heat transfer parameters should be displayed
    Then the new entered value in Surface Fluid Temperature field should be displayed
    And the new entered value in Surface Proppant Temperature field should be displayed
Scenario: Verify saved Surface N2 Temperature value
    And the new entered value in Surface N2 Temperature field should be displayed
Scenario: Verify saved Surface CO2 Temperature value
    And the new entered value in Surface C02 Temperature field should be displayed
Scenario: Verify saved Surface Rock Temperature value
    And the new entered value in Surface Rock Temperature field should be displayed
Scenario: Verify saved Reservoir Temperature at Frac Center Depth value
    And the new entered value in Reservoir Temperature at Frac Center Depth field should be displayed
Scenario: Verify saved Fracture Heat Transfer Coefficient Multiplier value
    And the new entered value in Fracture Heat Transfer Coefficient Multiplier field should be displayed
Scenario: Verify saved Wellbore Heat Transfer Coefficient Multiplier value
    And the new entered value in Wellbore Heat Transfer Coefficient Multiplier field should be displayed 
Scenario: Verify saved Surface Water Temperature value
    And the new entered value in Surface Water Temperature field should be displayed
    And the new entered value in Seabed Temperature field should be displayed
    And the new entered value in Water Depth field should be displayed
Scenario: Verify saved Sea Current value
    And the new entered value in Sea Current field should be displayed
Scenario: Verify saved Ocean or Wellbore Heat Transfer Coefficient Multiplier value
    And the new entered value in Ocean or Wellbore Heat Transfer Coefficient Multiplier field should be displayed
Scenario: Verify saved Depth TVD value
    And the new entered value in Depth TVD field should be displayed
    And the new entered value in Temperature field should be displayed
Scenario: Uncheck Offshore Well and Enter Temperature vs Depth check boxes and save
    When the user unchecks the Offshore Well check box
Scenario: Verify saved Temperature value
    And the user unchecks the Enter Temperature vs Depth check box
    And the user click on the save button
    And the user refreshes the page
Scenario: Verify the page header of heat transfer parameter page    
    Then the page header of heat transfer parameters should be displayed