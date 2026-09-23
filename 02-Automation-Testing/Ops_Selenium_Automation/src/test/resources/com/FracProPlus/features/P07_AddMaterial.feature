@feature_Addproppantandfluid
Feature: AddMaterials

Scenario: User is on the Home Screen
     Given the user is on the Dashboard Page
     Then User click on Continue button from the Fracpro live plus card
     And Navigate and click on the pad from the home screen
Scenario: User navigate to the  Material Selection tab
    And the user clicks on Material selection option
Scenario: Click Proppant Selection tab
    And the user clicks on the Proppant selection tab
Scenario: Click Add New Proppant to List button (first time)
    And the user clicks on the Add New Proppant to List button
Scenario: Select first proppant from table
    And the user selects the first proppant from the table
Scenario: Click Add button for first proppant
    And the user clicks on the add button
Scenario: Click Add New Proppant to List button (second time)
    And the user clicks on the Add New Proppant to List button
Scenario: Select second proppant from table
    And the user selects the Second proppant from the table
Scenario: Click Add button for second proppant
    And the user clicks on the add button
Scenario: Click Add New Proppant to List button (third time)
    And the user clicks on the Add New Proppant to List button
    And the user selects the Third proppant from the table
    And the user clicks on the add button
Scenario: Click Add New Proppant to List button (fourth time)
    And the user clicks on the Add New Proppant to List button
    And the user selects the Fourth proppant from the table
    And the user clicks on the add button
Scenario: Verify selected proppants are added to the list
    And the user verifies that selected proppant is added to the list or not
Scenario: Click Fluid Selection tab
    When the user clicks on the fluid selection tab
Scenario: Click Add New Fluid to List button (first time)
    And the user clicks on the add new fluid to list button
    And the user selects the fluid from the table
    And the user clicks on the add button First Fluid
Scenario: Click Add New Fluid to List button (second time)
    And the user clicks on the add new fluid to list button
    And the user selects the Second fluid from the table
    And the user clicks on the add button Second Fluid
Scenario: Click Add New Fluid to List button (third time)
    And the user clicks on the add new fluid to list button
    And the user selects the Third fluid from the table
    And the user clicks on the add button Third Fluid
Scenario: Click Add New Fluid to List button (fourth time)
    And the user clicks on the add new fluid to list button
    And the user selects the Fourth fluid from the table
    And the user clicks on the add button Fourth Fluid
Scenario: Verify selected fluids are added to the list
    And the user verifies that selected fluid is added to the list or not
Scenario: Click Chemical Selection tab
    When the user clicks on the Chemical selection tab
Scenario: Enter first Chemical name
    And the user enters the Chemical name in Chemical Name column
Scenario: Select unit for first Chemical
    And the user selectes unit from the unit column
#Scenario: Select type for first Chemical
    #And the user selects type from the type column
#Scenario: Enter second Chemical name
    #And the user enters second Chemical name in Chemical Name column
#Scenario: Select unit for second Chemical
    #And the user selectes unit For Second Chemical from the unit column
#Scenario: Select type for second Chemical
    #And the user selects second type from the type column
    #And the user enters Third Chemical name in Chemical Name column
#Scenario: Select unit for third Chemical
    #And the user selectes unit For Third Chemical from the unit column
    #And the user selects Third type from the type column
#Scenario: Enter fourth Chemical name
    #And the user enters Fourth Chemical name in Chemical Name column
#Scenario: Select unit for fourth Chemical
    #And the user selectes unit For Fourth Chemical from the unit column
    #And the user selects Fourth type from the type column
Scenario: Click save button for add material screen
    Then the user clicks on the save button for add material screen
    And the user perform page refresh action
    And the user clicks on the Chemical selection tab
Scenario: Verify selected chemicals are added to the list
    And the user verifies that selected Chemical is added to the list or not
    
    

   