@feature_treatmentscheduledtotal
Feature: TreatmentScheduledTotal

Scenario: Navigate to the home screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen
Scenario: User clicks on Treatment Scheduled total module
    Given the user clicks on the treatment scheduled module
Scenario: User clicks on Treatment Total tab
    When the user clicks on the treatment total tab
Scenario: Verify presence of Design Scheduled radio button
    Then verify the presence of Design scheduled radio button
Scenario: Verify presence of Actual Data radio button
    And verify the presence of Actual Data radio button
Scenario: Verify presence of Totals For header
    And verify the presence of Totals for header
Scenario: Verify presence of Totals Split By header
    And verify the presence of Totals split by header name
Scenario: Verify presence of Materials radio button
    And verify the presence of Materials radio button
Scenario: Verify presence of Injection radio button
    And verify the presence of Injection radio button
Scenario: Verify default behavior of Include Storage Units check box
    And verify the bydefault behavior of Include storage units check box
Scenario: Verify default behavior of Include Wb Vol in Pad check box
    And verify the bydefault behavior of Include Wb Vol in Pad check box
Scenario: Verify default behavior of Include Cost check box
    And verify the bydefault behavior of Include Cost check box
Scenario: User clicks on Materials check box
    When the user clicks on the materials check box
Scenario: User clicks on Include Storage Units check box to make it active
    And the user clicks on the Include Storage Units check box as active
Scenario: Verify table header names under Proppant and Fluid
    Then verify the table header name under proppant and fluid
Scenario: User clicks on Injection check box
    When the user clicks on the injection check box
Scenario: Verify header names under Proppant and Fluid table
    Then verify the header names under proppant and fluid table
Scenario: Verify editable fields for Injection
    Then verify the Fluid Tank VOI and Incl Tank Bottoms and prop Sack Wt and N2 Storage VOI and C02 Storage VOI field should be editable
Scenario: Verify read-only behavior when Include Storage Units inactive
    When the user clicks on the Include Storage Units check box as inactive
    Then verify the Fluid Tank VOI and Incl Tank Bottoms and prop Sack Wt and N2 Storage VOI and C02 Storage VOI field should be read only
Scenario: Verify table headers under Proppant and Fluid when Materials and Storage Units active
    When the user clicks on the materials check box
Scenario: Verify table headers under Additional Items when Storage Units active
    And the user clicks on the Include Storage Units check box as active
    Then verify the table header name under proppant and fluid section
    And verify the table header name under additional items section
Scenario: Verify table headers under Proppant and Fluid when Storage Units inactive 
    When the user clicks on the Include Storage Units check box as inactive
    Then verify the table header name under proppant and fluid section
    And User verify the table header name under additional items section
Scenario: Verify visibility of Material Cost Subtotal field
    Then verify the Material Cost Subtotal field should be visible
Scenario: Verify cost-related fields when Include Cost is active
    Then verify that unit Cost S and Discount and Cost S should be visible under proppant and fluid and additional items section
Scenario: Verify visibility of Total Cost field
    And verify the Total cost field should be visible
Scenario: Verify cost-related fields when Include Cost is inactive
    When the user clicks on the Include Cost to make it as inactive
    Then verify that unit Cost S and Discount and Cost S should not be visible under proppant and fluid and additional items section