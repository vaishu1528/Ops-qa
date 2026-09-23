@feature_TreatmentSchedule_Design
Feature: DesignTreatmentSchedule

  Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen
    And the user clicks on the treatment schedule sidebar option

  Scenario: Verify Design Treatment Schedule Tab Navigation
    And the user click on the design treatment schedule tab

  Scenario: Verify Design Treatment Schedule page title
    Then Verify design treatment schedule page title

  Scenario: Click Edit Schedule button
    And the user click on the edit schedule button

  Scenario: Verify Stop Schedule Editing button is displayed
    Then verify Stop Schedule editing button should be displayed

  Scenario: Verify Treatment Type should ne no foam
    And Verify treatment type should be no foam

  Scenario: Verify Prop Mode
    And verify prop mode should be staged

  Scenario: Verify Step Type Dropdown default option
    And Verify step type dropdown bydefault option for first row

  Scenario: Verify Flow Rate value in first row should be Zero by default
    And Verify flow rate field value must be zero for default row

  Scenario: Verify Prop Conc value in first row should be Zero by default
    And Verify prop conc field value must be zero for default row

  Scenario: Verify Clean Vol value in first row should be Zero by default
    And Verify Clean vol field value must be zero for default row

  Scenario: Verify Step Length value in first row should be Zero by default
    And Verify step length field value must be zero for default row

  Scenario: verify the treatment schedule header name when treatment type is N2 and prop mode is ramped
    When the user click and select ramped option from the Prop mode dropdown

  Scenario: click and select N2 option from treatment type info
    When the user click and select N2 option from treatment type info

  Scenario: Verify Scheduled Based on Conditions options
    And verify scheduled based on conditions options should be displayed

  Scenario: Verify Estimate Treating Conditions options
    And verify estimate treating conditions options should be displayed

  Scenario: CO2 Properties options are displayed for Non-'No Foam' Treatment Types
    And verify CO2 Properties options should be displayed

  Scenario: Quality option is displayed with default set to Conventional Quality for Non-'No Foam' Treatment Types
    And verify Quality option should be displayed and default option should be conventional quality

  Scenario: Verification of Default Values and UI Behavior for N2 Treatment Type with Pulsed Proppant and Prop Mode Options
    And verify default value must be 5,000 for estimated foam pressure

  Scenario: Verify default value must be 180 for estimated foam temperature
    And verify default value must be 180 for estimated foam temperature

  Scenario: Verify metering pressure default field value must be 910
    And verify metering pressure default field value must be 910

  Scenario: Verify metering temperature default field value must be 32
    And verify metering temperature default field value must be 32

  Scenario: Verify density at flow meter default field value must be 0.95
    And verify density at flow meter default field value must be 0.95

  Scenario: Verify Pulse Duration field should be read-only and Pulsed Proppant should be unchecked by default
    And verify Pulse Duration field should be read only and pulse proppant should be unchecked by default

  Scenario: verify Pulse Duration field should be editable
    When the user checked the Pulsed Proppant checkbox

  Scenario: verify the treatment schedule header name when treatment type is N2 and prop mode is staged
    Then verify Pulse Duration field should be editable
    When the user click and select staged option from the Prop mode dropdown

  Scenario: verify the treatment schedule header name when treatment type is CO2 and prop mode is staged
    When the user click and select CO2 option from treatment type info

  Scenario: verify the treatment schedule header name when treatment type is CO2 and prop mode is ramped
    When the user click and select ramped option from the Prop mode dropdown
    When the user click and select N2 & CO2 option from treatment type info

  Scenario: verify the treatment schedule header name when treatment type is CO2 and prop mode is ramped
    When the user click and select staged option from the Prop mode dropdown

  Scenario: Verify step alias column must be displayed in the header
    When the user click and select option from treatment type info is no foam
    And the user click on the Include step Aliases checkbox

  Scenario: Data Entry for First Row
    When the user click and select an option from step type dropdown for first row

  Scenario: Verify user enters valid value into Step Alias input field for first row
    And the user enter the valid value into step alias input field for first row

  Scenario: Verify user enters valid value into Flow Rate column for first row
    When the user enter valid value into flow rate column for first row

  Scenario: Verify user enters valid value into Prop Conc column for first row
    And the user enter valid value into prop conc column for first row

  Scenario: The user verifies the first option from the Proppant Type dropdown is selected by default
    Then verify the first option from the Proppant Type dropdown is selected by default
    When the user enter valid value into clean vol column for first row

  Scenario: The user verifies the calculated value of Step Length for first row
    Then verify the calculated value of step length for first row
    Then verify the first fluid type in the drop down is selected in the Fluid type for first row

  Scenario: The user verifies Step Length field must be read-only and Clean Volume must be enabled
    When the user click on the volume from time option
    When the user enter valid value into step length column for first row

  Scenario: The user verifies the calculated value of Clean Vol for first row
    Then verify the calculated value of clean vol for first row

  Scenario: The user verifies the calculated value of Clean Vol when Flow Rate is updated for first row
    When the user update the value of flow rate input field for first row

  Scenario: The user verifies the calculated value of Step Length when Flow Rate is updated for first row
    Then verify the calculated value of clean vol when flow rate is updated for first row

  Scenario: Verify calculated value of Step Length when Flow Rate is updated for first row
    Then verify the calculated value of step length when flow rate is updated for first row

  Scenario: Verify user updates Prop Conc field value for first row
    When the user update the prop conc field value for first row

  Scenario: The user verifies updated Step Length field value after updating the Prop Conc input field for first row
    Then verify updated step length field value after updating the prop conc input field for first row

  Scenario: The user verifies updated Clean Vol field value after updating the Prop Conc input field for first row
    Then verify updated clean vol field value after updating the prop conc input field for first row

  Scenario: The user verifies updated Step Length field value after updating the Prop Conc input field for first row
    When the user update the proppant type dropdown option
    Then verify updated step length field value after updating the prop conc input field for first row

  Scenario: The user verifies updated Clean Vol field value after updating the Proppant Type input field for first row
    Then verify updated clean vol field value after updating the proppant type input field for first row

  Scenario: Verify user clicks and selects Ramped option from Prop Mode dropdown
    When the user click and select ramped option from the Prop mode dropdown

  Scenario: The user verifies Flow Rate 1 matching Flow Rate value for first row
    Then verify Flow Rate 1 Matching Flow Rate Value for first row

  Scenario: The user verifies Prop Conc 1 matching Prop Conc 2 value for first row
    And verify Prop Conc 1 Matching Prop Conc 2 Value for first row

  Scenario: The user verifies updated Step Length field value when Flow Rate 1 and Flow Rate 2 are equal for first row
    When the user checked the 'time from volume'option

  Scenario: The user verifies updated Step Length field value when Flow Rate 1 and Flow Rate 2 are different for first row
    Then verify updated step length field value when flow rate 1 and flow rate 2 are equal for first row

  Scenario: The user verifies updated Step Length field value when Prop Conc 2 input field is updated
    Then verify updated step length field value when Flow Rate 1 and Flow Rate 2 are different for first row

  Scenario: Verify user enters valid value into Prop Conc 2 input field
    When the user enter valid value into the Prop Conc 2 input field

  Scenario: Verify step length field value is updated when Prop Conc 2 value is updated
    Then verify updated step length field value when Prop Conc 2 input field is updated

  Scenario: Verify user clicks on Volume from Time option
    When the user click on the volume from time option

  Scenario: The user verifies calculated Clean Vol when calculate is selected as volume from time
    Then verify calculated clean Vol when calculate is selected as volume from time

  Scenario: Verify updated Step Length field value when Prop Conc 2 input field is updated
    Then verify updated step length field value when Prop Conc 2 input field is updated1

  Scenario: Verify updated Clean Volume field value when Flow Rate 1 input field is updated
    Then verify updated Clean Vol field value when Flow Rate 1 input field is updated

  Scenario: Verify updated Clean Volume field value when Flow Rate 2 input field is updated
    Then verify updated Clean Vol field value when Flow Rate 2 input field is updated

  Scenario: The user verifies updated Clean Vol field value when Prop Conc 1 input field is updated
    When the user update the value into the Prop Conc 1 input field

  Scenario: The user verifies updated Clean Vol field value when Prop Conc second input field is updated
    Then verify updated Clean Vol field value when Prop Conc 1 input field is updated

  Scenario: Verify user updates value into Prop Conc second input field
    When the user update the value into the Prop Conc second input field

  Scenario: Verify updated Clean Volume field value when Prop Conc second input field is updated
    Then verify updated Clean Vol field value when Prop Conc second input field is updated

  Scenario: Check flow rate and Prop Conc when when prop mode is changed from ramped to staged
    When the user click and select staged option from the Prop mode dropdown

  Scenario: Check flow rate 1 and flow rate 2 value must be same when prop mode is changed from ramped to staged
    When the user click and select ramped option from the Prop mode dropdown
    And verify Prop Conc 1 and Prop Conc 2 field value must be same
    When the user click and select staged option from the Prop mode dropdown

  Scenario: Add data for second row and verify
    When the user click and select 'Circulation' option from step type dropdown

  Scenario: Clean vol is calculated when treat type is zero and clean vol is zero and Calculate is Time from volume
    When the user enter valid value into the step length field for second row

  Scenario: The user verifies Clean Volume Calculation when Treat Type = 0, Clean Vol = 0, and Calc = Time/Volume
    When the user checked the 'time from volume'option

  Scenario: Verify user resets Clean Volume field as zero for second row
    When the user reset clean volume field as zero for second row

  Scenario: Verify Clean Volume calculation when Treat Type is Zero, Clean Vol is Zero, and Calculation Method is Time from Volume
    Then Verify Clean Volume Calculation When Treat Type is Zero, Clean Vol is Zero, and Calculation Method is Time from Volume

  Scenario: Validation of Flow Rate and Clean Vol Reset to 0 and Fluid Type" field is set to "Shut-in" and read-only When Stage Type is Set to Shut-in
    And the user click and select 'Shut-in' option from step type dropdown for second row
    Then verify Flow Rate and Clean Vol Reset to 0 for second row

  Scenario: Validation of Flow Rate and Clean Vol Reset to 0 and Fluid Type" field is set to "Shut-in" and read-only When Stage Type is Set to Shut-in w/ flowpulses
    And the user clicks and select 'Shut-in w/ flowpulses' option from step type dropdown for second row

  Scenario: Verify Flow Rate and Clean Volume are reset to 0 for second row
    Then verify Flow Rate and Clean Vol Reset to 0 for second row

  Scenario: Validation of Flow Rate and Clean Vol reset to negative value of earlier value and Fluid Type" field is set to "Flowback" and read-only When Stage Type is Set to 'Flowback'
    And the user click and select Flowback option from step type dropdown for second row

  Scenario: If Stage Type is changed from Shut-in or Shut-in w/flowpulses or Flowback to anything else then the value of Flow Rate is set to 1
    And the user change the step type dropdown option from Flowback to Prop slug for second row
    Then verify the value of Flow Rate is set to one

  Scenario: Change step type from Prop slug to Shut-in for second row
    And the user click and select 'Shut-in' option from step type dropdown for second row
    And the user change the step type dropdown option from Shut-in to Main frac acid for second row

  Scenario: Verify flow rate after changing to Main frac acid
    Then verify the value of Flow Rate is set to one
    And the user clicks and select 'Shut-in w/ flowpulses' option from step type dropdown for second row

  Scenario: Change step type to Steprate test for second row
    And the user change the step type dropdown option from Shutin wflowpulses to Steprate test for second row
    Then verify the value of Flow Rate is set to one

  Scenario: Add CO2 and N2 related data
    When the user click and select N2 & CO2 option from treatment type info
    And the user click and select ramped option from the Prop mode dropdown

  Scenario: Enter valid data into N2 Rate1 field
    And the user enter valid data into N2 Rate1 field for first row

  Scenario: Enter valid data into N2 Rate2 field
    And the user enter valid data into N2 Rate2 field for first row

  Scenario: Enter valid data into CO2 Rate2 field
    And the user enter valid data into CO2 Rate2 field for first row

  Scenario: Enter valid data into Btm prop Conc1 field
    And the user enter valid data into Btm prop Conc1 field for first row

  Scenario: Enter valid data into Btm prop Conc2 field
    And the user enter valid data into Btm prop Conc2 field for first row

  Scenario: Enter valid data into Btm N2 qual field
    And the user enter valid data into Btm N2 qual field for first row

  Scenario: Enter valid data into Btm CO2 qual field
    And the user enter valid data into Btm CO2 qual field for first row

  Scenario: Enter valid data into Btm clean foam Volume field
    And the user enter valid data into Btm clean foam Volume field for first row

  Scenario: Update the value of common fields
    When the user update the value into the Estimated Foam Pressure input field
    And the user update the value into the Estimated Foam Temperature input field

  Scenario: Select In Fracture condition and update metering pressure
    And the user mark the 'In Fracture' option from Schedule Based on Conditions
    And the user update the value into the Metering Pressure input field

  Scenario: Update metering temperature and pulse duration
    And the user update the value into the Metering Temperature input field
    And the user update the value into the Pulse Duration input field

  Scenario: Select quality option and save changes
    And the user select the Constant Internal Phase option from Quality option dropdown
    And the user click on the Save button
    When the user refresh the page

  Scenario: Verification in design tab after save data
    And the user click on the design treatment schedule tab

  Scenario: Verification of Common fields on Design tab
    Then verify N2 & CO2 option must be selected
    Then verify ramped option must be selected

  Scenario: Verify updated estimated foam values
    Then Verify updated value of Estimated Foam Pressure input field
    And Verify updated value of Estimated Foam Temperature input field
    And verify step Alias value must be persistant for first row

  Scenario: Verify updated metering values
    And Verify updated value of Metering Pressure input field
    And Verify updated value of Metering Temperature input field

  Scenario: Verify pulse duration and quality option
    And Verify updated value of Pulse Duration input field
    And verify Constant Internal Phase option must be checked

  Scenario: Verification of cell data on design page after saving propmode is ramped
    Then verify step Type Selected Value For first row on design tab

  Scenario: Verify flow rate and proppant concentration 1 for first row
    And verify flow rate1 Value For first row on design tab
    And verify prop conc1 Value For first row on design tab

  Scenario: Verify flow rate and proppant concentration 1 for first row
    And verify prop conc2 Value For first row on design tab after save

  Scenario: Verify CO2 rate 2 and clean volume for first row
    And verify CO2Rate2 Value For first row on design tab
    And verify clean Vol Value For first row on design tab

  Scenario: Verify step length and bottom proppant concentration 1
    And verify step length Value For first row on design tab

  Scenario: Verify bottom proppant concentration 2 and slurry foam rate
    And verify btm prop Conc1 Value For first row on design tab after save
    And verify btm prop Conc2 Value For first row on design tab

  Scenario: Verify bottom clean foam volume and selected fluid type
    Then verify selected fluid type Value For first row on design tab

  Scenario: Verify selected proppant type for first row
    And verify selected proppant type Value For first row on design tab

  Scenario: Verify calculation for custom value
    When the user click and checked the 'select All' option into select Custom Columns and click again

  Scenario: Scroll to extreme right and verify calculated cumulative time
    And scroll To Extreme right in the handsontable
