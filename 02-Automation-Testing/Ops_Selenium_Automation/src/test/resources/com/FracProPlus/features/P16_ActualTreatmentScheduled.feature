@feature_ActualTreatmentSchedule_Design
Feature: ActualTreatmentSchedule

  Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page

  Scenario: Verify user clicks on Continue button from FracPro Live Plus card
    Then User click on Continue button from the Fracpro live plus card

  Scenario: Verify user navigates and clicks on Pad from Home screen
    And Navigate and click on the pad from the home screen

  Scenario: Verify user clicks on Treatment Schedule sidebar option
    And the user clicks on the treatment schedule sidebar option

  Scenario: Verify the common field value are persistant into the actual treatment schedule
    When the user refresh the page
    And click on the actual treatment scheduled button

  Scenario: Copy Design Schedule to Actual Schedule
    And the user click on the copy design to actual schedule button

  Scenario: Verify user clicks on Yes button on confirmation popup
    And the user click on the yes button on confirmation pop up

  Scenario: Verify user clicks on Actual Treatment Scheduled button
    And click on the actual treatment scheduled button

  Scenario: Verify N2 option is selected on Actual tab after copy
    Then verify N2 & CO2 option must be selected

  Scenario: Verify CO2 option is selected on Actual tab after copy
    Then verify ramped option must be selected

  Scenario: Verify ramped option is selected on Actual tab after copy
    Then Verify updated value of Estimated Foam Pressure input field

  Scenario: Verify updated value of Estimated Foam Pressure input field on Actual tab
    And Verify updated value of Estimated Foam Temperature input field

  Scenario: Verify updated value of Estimated Foam Temperature input field on Actual tab
    And Verify updated value of Metering Pressure input field

  Scenario: Verify updated value of Metering Pressure input field on Actual tab
    And Verify updated value of Metering Temperature input field

  Scenario: Verify updated value of Pulse Duration input field on Actual tab
    And Verify updated value of Pulse Duration input field in actual tab

  Scenario: Verify Constant Internal Phase option is checked on Actual tab
    And verify Constant Internal Phase option must be checked

  Scenario: Verification of cell data on actual page after copied data from design when propmode is ramped
    Then verify step Type Selected Value For first row on actual tab

  Scenario: Verify flow rate1 value for first row
    And verify flow rate1 Value For first row on actual tab

  Scenario: Verify prop conc1 value for first row
    And verify prop conc1 Value For first row on actual tab

  Scenario: Verify prop conc2 value for first row
    And verify prop conc2 Value For first row on actual tab

  Scenario: Verify N2 Rate1 and N2 Rate2 value for first row
    And verify N2Rate1 Value For first row on actual tab

  Scenario: Verify N2 Rate2 value for first row
    And verify N2Rate2 Value For first row on actual tab

  Scenario: Verify CO2 Rate1 value for first row
    And verify CO2Rate1 Value For first row on actual tab

  Scenario: Verify CO2 Rate2 value for first row
    And verify CO2Rate2 Value For first row on actual tab

  Scenario: Verify clean volume value for first row
    And verify clean Vol Value For first row on actual tab

  Scenario: Verify step length value for first row
    And verify step length Value For first row on actual tab

  Scenario: Verify bottom prop Conc1 value for first row after save
    And verify btm prop Conc1 Value For first row on actual tab after save

  Scenario: Verify bottom prop Conc2 value for first row
    And verify btm prop Conc2 Value For first row on actual tab

  Scenario: Verify fluid type value for first row
    Then verify selected fluid type Value For first row on actual tab

  Scenario: Verify proppant type value for first row
    And verify selected proppant type Value For first row on actual tab

  Scenario: Verify presence of Copy To button on Treatment Scheduled screen
    And verify the presence of copy to button on treatment scheduled screen

  Scenario: Verify presence of Step Length field and its data with units in Total section
    And verify the presence of step length field and its data with units in the total section

  Scenario: Verify presence of Clean Volume field and its data with units in Total section
    And verify the presence of clean volume field and its data with units in the total section

  Scenario: Verify presence of Step Proppant field and its data with units in Total section
    And verify the presence of step proppant field and its data with units in the total section

  Scenario: Verify user clicks on Copy To button
    And User click on the copy to button

  Scenario: Verify Copy option popup is displayed
    And user verify the copy option pop up

  Scenario: Verify Copy Into All Stages and Copy Into Group message
    And verify the copy into all stages and copy into group message

  Scenario: Verify auto populated Flush Volume in Copy option popup
    And user verify the auto populate flush volume in copy option pop up

  Scenario: Verify presence of OK and Cancel buttons in Copy option popup
    And verify the presence of ok and cancel button in copy option pop up

  Scenario: Verify user clicks on X button on confirmation popup
    And the user click on the X button on confirmation pop up
