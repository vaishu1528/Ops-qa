@feature_Proppant_Data
Feature: ProppantData

Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen
    And the user clicks on Material selection option
    And the user clicks on the Proppant selection tab
@ProppantData-Edit    
Scenario: User clicks on Edit Proppant icon for first proppant
    When the user click on the Edit Proppant icon for first proppant
Scenario: Verify default option for Proppant Name dropdown
    Then verify default option for proppant name dropdown
Scenario: Verify Description field value and read-only property
    And verify Description field value and also verify description field should be read only
Scenario: Verify default value of Vendor field
    And verify the default value of vendor field
Scenario: Verify default value of System field 
    And verify the default value of system field
Scenario: Verify default value of Mesh Size field
    And verify the default value of mesh size field
Scenario: Verify default selected option for Source dropdown
    And verift default selected option for source dropdown
Scenario: Verify default option for Proppant Type dropdown
    And verify default option for proppant type dropdown
Scenario: Verify default option for Proppant Coating dropdown
    And verify default option for proppant coating dropdown
Scenario: Verify default value for Proppant Perm Displayed At field
    And verify default value for Proppant Perm Displayed at field
Scenario: Verify Proppant Perm Displayed At field is read-only
    And verify Proppant Perm Displayed at field is read only
Scenario: Verify Proppant Perm field is read-only
    And verify Proppant perm and field is read only
Scenario: Verify default value for Perm Displayed And field
    And verify default value for Perm Displayed and field
Scenario: Verify Source dropdown displays all options
    And verify that the Source dropdown should display all available options
Scenario: Verify Proppant Type dropdown displays all options   
    And verify that the proppant type dropdown should display all available options
Scenario: Verify Proppant Coating dropdown displays all options
    And verify that the proppant coating dropdown should display all available options 
Scenario: Verify Packed Porosity field is read-only
    And verify packed porosity field must be read only
Scenario: Verify read-only property of all columns except Column2
    And verify all column are read only except column2
Scenario: Verify Column2 is editable
    And verify only column2 is editable
Scenario: Verify Column1 values increment by 2000
    And verify that Column1 displays numbers incremented by 2000 starting from 0 to 20000
Scenario: Verify default values for all columns in first row
    And verify the default value of all columns in table for first row
Scenario: Verify Independent Lab Verification checkbox default state
    And verify Independent Lab Verification checkbox should be unchecked by-default
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    