@feature_WellAndTreatmentGeneralInfo
Feature: WellAndTreatment - General Information

  Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page

  Scenario: verifies navigation to Well and Treatment screen
    When User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen
    Then the user should be landed on the Well and Treatment screen

  Scenario: verifies user is on General Information tab
    Then the user verifies that user is on general information tab under under Well and Treatment screen

  Scenario: verifies well name in top right corner
    Then the well name displayed in the top right corner should match the well name entered in the textbox

  Scenario: verifies Pad Name entered by the user
    Then the Pad Name entered by the user should be verified

  Scenario: verifies Field Name entered by the user
    Then the Field Name entered by the user should be verified

  Scenario: verifies Well Name entered by the user
    Then the Well Name entered by the user should be verified

  Scenario: verifies Well API entered by the user
    Then the Well API entered by the user should be verified

  Scenario: verifies Company Name selected by the user
    Then the Company Name selected by the user from the Company Name dropdown should be verified

  Scenario: verifies Company Representative entered by the user
    Then the Company Representative entered by the user should be verified

  Scenario: verifies Service Company Rep entered by the user
    Then the Service Company Rep entered by the user should be verified

  Scenario: verifies Service Company Name selected by the user
    Then the Service Company Name selected by the user from the Service Company Name dropdown should be verified

  Scenario: verifies Treatment Analyst entered by the user
    Then the Treatment Analyst entered by the user should be verified
    When the user click on the additional info expand arrow

  Scenario: Verify Seismos Integration checkbox is available
    And User verify the seismos check box

  Scenario: User perform click action on the seismos check box
    And User click on the seismos check box

  Scenario: Verify ProPilot checkbox visibility
    And verify the presence of propilot check bok
    And user click on the propilot check box

  Scenario: Verify selecting ProPilot checkbox displays VanID field
    And user verify the van id field
    And user enter the data into the van id field
    And user clicks on the Save button
    And the user clicks on the results module
    And the user click on the plot option

  Scenario: Verify that Include Seismos Data checkbox is visible when Seismos is ON in plot setting screen
    Then Verify that Include Seismos Data checkbox is visible when Seismos is ON in plot setting screen
    And user click on the well & treatment option
    When the user click on the additional info expand arrow
    And verify the presence of propilot check bok

  Scenario: Verify the seismos check box is check after save
    Then verify the presence of seismos check bok

  Scenario: Verify state persistence after saving of VanId
    And verify the van id value

  Scenario: Verify ProPilot checkbox is unchecked
    And uncheck the seismos check box
    And uncheck the propilot check box
    And user clicks on the Save button
