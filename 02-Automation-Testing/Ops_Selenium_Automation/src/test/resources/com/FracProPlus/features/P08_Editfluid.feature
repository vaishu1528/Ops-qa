@feature_editfluid
Feature: EditFluid

  Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen

  Scenario: User navigates to the Fluid Selection tab from Material Selection
    When the user clicks on Material selection option
    Then the user verifies that they are on the fluid selection tab

  Scenario: User edits a fluid entry
    When the user clicks on the edit button in front of the fluid name
    Then the user verifies the page title

  Scenario: Verify fluid name under selected fluid section
    And the user verifies the fluid name under the selected fluid section

  Scenario: Verify fluid description
    And the user verifies the description for the fluid

  Scenario: Verify presence of Use Multiplier radio button
    And the user verifies the presence of the Use Multiplier radio button under the Friction Data for Selected Fluid and Wellbore Segment section

  Scenario: Verify Use Multiplier radio button is selected by default
    And the user verifies the Use Multiplier radio button is already selected

  Scenario: Verify Friction Multiplier field visibility
    And the user verifies the Friction Multiplier field is visible

  Scenario: Verify Friction Multiplier field is editable
    And the user verifies the Friction Multiplier field is editable

  Scenario: Enter data into Friction Multiplier input box
    When the user enters data into the Friction Multiplier input box

  Scenario: Save fluid data
    And the user clicks on the save button for Fluid data

  Scenario: Verify presence of Set Individual Values radio button
    And the user verifies the presence of the Set Individual Values radio button under the Friction Data for Selected Fluid and Wellbore Segment section

  Scenario: Click on Set Individual Values radio button
    When the user clicks on the Set Individual Values radio button

  Scenario: Verify Friction Multiplier field becomes non-editable
    Then the user verifies that the Friction Multiplier field is non-editable

  Scenario: Enter data under Q bpm column
    When the user enters data under the Q bpm column

  Scenario: Enter data under P psi column
    And the user enters data under the P psi column

  Scenario: Verify Save button is enabled
    Then the user verifies that the Save button is enabled

  Scenario: Save fluid data after entering Q bpm and P psi
    When the user clicks on the save button for Fluid data

  Scenario: Navigate and edit second fluid - Fluid 2
    When the user clicks on Material selection option

  Scenario: Verify fluid description - Fluid 2
    When the user clicks on the edit button in front of the second fluid name

  Scenario: Verify user verifies the description for the Second Fluid
    And the user verifies the description for the Second fluid

  Scenario: Verify presence of Use Multiplier radio button under Friction Data for Selected Fluid and Wellbore Segment section
    And the user verifies the presence of the Use Multiplier radio button under the Friction Data for Selected Fluid and Wellbore Segment section

  Scenario: Verify Use Multiplier radio button is selected by default - Fluid 2
    And the user verifies the Use Multiplier radio button is already selected

  Scenario: Verify Friction Multiplier field is editable - Fluid 2
    And the user verifies the Friction Multiplier field is visible

  Scenario: Verify Friction Multiplier field is editable
    And the user verifies the Friction Multiplier field is editable

  Scenario: Verify user enters data into Friction Multiplier input box for second Fluid
    When the user enters data into the Friction Multiplier input box for second Fluid

  Scenario: Save fluid data - Fluid 2
    And the user clicks on the save button for Fluid data

  Scenario: Verify presence of Set Individual Values radio button - Fluid 2
    And the user verifies the presence of the Set Individual Values radio button under the Friction Data for Selected Fluid and Wellbore Segment section
    When the user clicks on the Set Individual Values radio button

  Scenario: Verify Friction Multiplier field becomes non-editable - Fluid 2
    Then the user verifies that the Friction Multiplier field is non-editable

  Scenario: Verify user enters data under Q bpm column for Second Fluid
    When the user enters data under the Q bpm column for Second fluid

  Scenario: Verify user enters data under P psi column for Second Fluid
    And the user enters data under the P psi column for second fluid

  Scenario: Verify Save button is enabled after entering Fluid data
    Then the user verifies that the Save button is enabled

  Scenario: Verify user clicks on Save button for Fluid data
    When the user clicks on the save button for Fluid data

  Scenario: Manage fluid data for Fluid 3
    When the user clicks on Material selection option
    When the user clicks on the edit button in front of the third fluid name

  Scenario: Verify description of Fluid 3
    And the user verifies the description for the third fluid
    And the user verifies the presence of the Use Multiplier radio button under the Friction Data for Selected Fluid and Wellbore Segment section

  Scenario: Verify default Use Multiplier selection for Fluid 3
    And the user verifies the Use Multiplier radio button is already selected
    And the user verifies the Friction Multiplier field is visible

  Scenario: Verify Friction Multiplier field editability for Fluid 3
    And the user verifies the Friction Multiplier field is editable
    When the user enters data into the Friction Multiplier input box for third Fluid

  Scenario: Save Friction Multiplier data for Fluid 3
    And the user clicks on the save button for Fluid data

  Scenario: Verify Set Individual Values option for Fluid 3
    And the user verifies the presence of the Set Individual Values radio button under the Friction Data for Selected Fluid and Wellbore Segment section
    When the user clicks on the Set Individual Values radio button

  Scenario: Verify Friction Multiplier becomes non-editable
    Then the user verifies that the Friction Multiplier field is non-editable
    When the user enters data under the Q bpm column for Third fluid

  Scenario: Enter individual pressure value for Fluid 3
    And the user enters data under the P psi column for third fluid
    Then the user verifies that the Save button is enabled

  Scenario: Save individual friction values for Fluid 3
    When the user clicks on the save button for Fluid data

  Scenario: Open Material Selection and Edit Fluid 4
    When the user clicks on Material selection option
    When the user clicks on the edit button in front of the fourth fluid name
    And the user verifies the description for the fourth fluid

  Scenario: Verify default Use Multiplier option for Fluid 4
    And the user verifies the presence of the Use Multiplier radio button under the Friction Data for Selected Fluid and Wellbore Segment section

  Scenario: Verify Use Multiplier radio button is already selected
    And the user verifies the Use Multiplier radio button is already selected

  Scenario: Verify Friction Multiplier field is visible
    And the user verifies the Friction Multiplier field is visible

  Scenario: Verify Friction Multiplier field is editable
    And the user verifies the Friction Multiplier field is editable

  Scenario: Update Friction Multiplier value for Fluid 4
    When the user enters data into the Friction Multiplier input box for fourth Fluid
    And the user clicks on the save button for Fluid data

  Scenario: Switch to Set Individual Values option for Fluid 4
    And the user verifies the presence of the Set Individual Values radio button under the Friction Data for Selected Fluid and Wellbore Segment section
    When the user clicks on the Set Individual Values radio button
    Then the user verifies that the Friction Multiplier field is non-editable

  Scenario: Enter individual friction values for Fluid 4
    When the user enters data under the Q bpm column for Fourth fluid
    And the user enters data under the P psi column for fourth fluid
    Then the user verifies that the Save button is enabled

  Scenario: Save individual friction values for Fluid 4
    When the user clicks on the save button for Fluid data

  Scenario: Verify and use Go Back button
    And the user verifies the presence of the Go Back button
    When the user clicks on the Go Back button
    Then the user verifies that they are directed to the Material selection screen
