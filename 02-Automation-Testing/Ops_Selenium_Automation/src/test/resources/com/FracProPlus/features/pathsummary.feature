@feature_pathsummary
Feature: Pathsummary

  Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen

  Scenario: User clicks on Wellbore Configuration option
    And Click on wellbore configuration option
    And Verify the page header name
    
Scenario: User navigate to the Path Summary tab
    When the user clicks on the path summary tab

  Scenario: Verify field names in bottom right card
    And the field names present in bottom right card in path summary tab should be verified

  Scenario: Verify Total Frac String Volume field is readonly
    And the total frac string volume field should be readonly

  Scenario: Verify Flush Volume field is readonly
    And the flush volume field should be readonly

  Scenario: Click Frac String Partly Full radio button
    When the user clicks on the frac string partly full radio button

  Scenario: Enter data into Frac String Volume field
    And the user enters the data into the frac string volume field

  Scenario: Click Frac String Full radio button
    And the user clicks on the frac string full radio button

  Scenario: Verify Frac String Volume field is readonly
    And the Frac String Volume field should be readonly

  Scenario: Enter data into Flush Above Top Perf field
    And the user enters the data into flush above top perf field
    And Click on the save button

  Scenario: Verify Frac String Volume field readonly after save
    Then the Frac String Volume field should be readonly

  Scenario: Click Recalculate button
    When the user clicks on the recalculate button
    Then the user should remain on the same screen

  Scenario: Verify default value for injection
    And the default value should be casing
    When the user clicks on the Injection is down dropdown

  Scenario: Select tubing and annulus option
    When the user selects tubing and annulus option from injection is down dropdown

  Scenario: Verify common manifold and isolated radio buttons are enabled
    Then the two radio buttons common manifold and isolated should be enabled and user can click any one

  Scenario: Verify use bottom hole checkbox enabled by default
    And the use bottom hole check box should be enabled by default

  Scenario: Verify MD for well transit time readonly when checkbox checked
    And the MD for well transit time field should be read only if the use bottom hole check box is checked

  Scenario: Uncheck use bottom hole checkbox
    When the user unchecks the use bottom hole check box

  Scenario: Verify MD for well transit time enabled when checkbox unchecked
    Then the MD for well transit time field should be enabled only if the use bottom hole check box is unchecked and user should enter the value on it
    When Click on the save button
    And User refresh the page
    When the user clicks on the path summary tab
