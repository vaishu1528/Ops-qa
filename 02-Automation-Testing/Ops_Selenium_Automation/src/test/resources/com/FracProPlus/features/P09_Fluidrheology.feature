@feature_fluidrheology
Feature: FluidRheology

  Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen

  @fluidrheology_navigation
  Scenario: Navigate to Fluid Selection tab
    When the user clicks on Material selection option
    Then the user verifies that they are on the fluid selection tab

  Scenario: Edit fluid details
    When the user clicks on the edit button in front of the fluid name
    Then the user verifies the page title

  Scenario: Verify Fluid Rheology tab details
    When the user clicks on Fluid Rheology tab
    And verify the vendor field data
    And verify Modified Properties field data
    And verify system field data
    And the user verifies the description for the fluid

  Scenario: Validate error when entering more than three digits in time column
    When the user enters more than three digits into time column under Rheology for Selected Fluid section
    Then verify user is getting Error popup
    And user click on close button

  Scenario: Validate error when entering valid time and invalid n column values
    When the user enters less than three digits into time column under Rheology for Selected Fluid section
    And the user enters more than three digits into n column under Rheology for Selected Fluid section
    Then verify user is getting Error popup
    And user click on close button

  Scenario: Validate successful entry for n and k column values
    When the user enters less than three digits into n column under Rheology for Selected Fluid section
    And the user enters data into k column under Rheology for Selected Fluid section

  Scenario: Verify default data for the Shear Rate field
    And the user verifies the default data for the Shear Rate field

  Scenario: Verify default data for App Visc field
    And the user verifies the default data for the App Visc field
    And the user verifies the default data for the Temperature field

  Scenario: Verify Temperature field becomes editable when Use Reservoir Temperature is unchecked
    And the user verifies that Use Reservoir Temperature check box is already selected
    When the user unchecks Use Reservoir Temperature check box
    Then verify that temperature field is editable

  Scenario: Save Fluid Rheology data
    When the user enters data into time field

  Scenario: Enter time and shear rate values
    And the user enters data into Shear Rate field

  Scenario: Enter temperature value
    And the user enters data in Temperature field
    When the user clicks on the save button for Fluid data

  Scenario: Verify Apparent Viscosity Calculator data save
    Then verify that data has been saved for Apparent Viscosity Calculator section

  Scenario: Verify recalculation of App Visc value
    When the user enters data into time field for recalculation
    And the user enters data into Shear Rate field for recalculation
    Then verify that App Visc value is changed after clicking on the Recalculate button

  Scenario: Verify navigation back to Material selection screen
    And the user verifies the presence of the Go Back button
    When the user clicks on the Go Back button
    Then the user verifies that they are directed to the Material selection screen

  Scenario: Open Fluid Thermal Properties tab
    When the user clicks on Material selection option
    Then the user verifies that they are on the fluid selection tab
    When the user clicks on the edit button in front of the fluid name

  Scenario: Verify page title after editing fluid
    Then the user verifies the page title
    When user clicks on the Fluid Thermal Properties tab

  Scenario: Verify vendor field data for first fluid
    Then verify the vendor field data

  Scenario: Verify Modified Properties field data first fluid
    And verify Modified Properties field data

  Scenario: Verify system field data first fluid
    And verify system field data

  Scenario: Verify fluid description first fluid
    And the user verifies the description for the fluid

  Scenario: Verify default data under Thermal Properties section first fluid
    When user clicks on the Fluid Thermal Properties tab
    Then user verifies the default data for all fields under the Thermal properties section

  Scenario: Enter Thermal Conductivity data first fluid
    When user enters data for the Thermal Conductivity field

  Scenario: Enter Specific Heat data first fluid
    And user enters data for the Specific Heat field

  Scenario: Enter Fluid Density data first fluid
    And user enters data for the Fluid Density field
    Then the user clicks on the save button for Fluid data

  Scenario: Verify data saved for Fluid 1 under Thermal Properties tab first fluid
    Then verify that data has been saved or not for the first Fluid under Thermal Properties tab

  Scenario: Navigate to Material selection for Second Fluid
    When the user clicks on Material selection option
    When the user clicks on the edit button in front of the second fluid name

  Scenario: Open Fluid Thermal Properties tab for Second Fluid
    When user clicks on the Fluid Thermal Properties tab
    Then verify the vendor field data for the Second fluid
    And verify Modified Properties field data for the Second fluid

  Scenario: Verify system field data for Second Fluid
    And verify system field data for the Second fluid
    And the user verifies the description for the Second fluid
    Then user verifies the default data for all fields under the Thermal properties section

  Scenario: Verify default data under Thermal Properties section for Second Fluid
    When user enters data for the Thermal Conductivity field for the Second fluid

  Scenario: Enter Specific Heat data for Second Fluid
    And user enters data for the Specific Heat field for the Second fluid

  Scenario: Enter Fluid Density data for Second Fluid
    And user enters data for the Fluid Density field for the Second fluid
    Then the user clicks on the save button for Fluid data

  Scenario: Verify saved data for Second Fluid under Thermal Properties tab
    Then verify that data has been saved or not for the Second Fluid under Thermal Properties tab

  Scenario: Fluid 3 - Thermal Properties Validations
    When the user clicks on Material selection option
    When the user clicks on the edit button in front of the third fluid name

  Scenario: Open Fluid Thermal Properties tab
    When user clicks on the Fluid Thermal Properties tab
    Then verify the vendor field data for the Third fluid

  Scenario: Verify system field and description for Fluid 3
    And verify system field data for the Third fluid
    And the user verifies the description for the third fluid
    Then user verifies the default data for all fields under the Thermal properties section

  Scenario: Verify default thermal properties data for Fluid 3
    When user enters data for the Thermal Conductivity field for the Third fluid

  Scenario: Enter specific heat and fluid density for Fluid 3
    And user enters data for the Specific Heat field for the Third fluid
    And user enters data for the Fluid Density field for the Third fluid

  Scenario: Save thermal properties data for Fluid 3
    Then the user clicks on the save button for Fluid data

  Scenario: Verify saved thermal properties data for Fluid 3
    Then verify that data has been saved or not for the Third Fluid under Thermal Properties tab

  Scenario: Open material selection and edit Fluid 4
    When the user clicks on Material selection option
    When the user clicks on the edit button in front of the fourth fluid name

  Scenario: Open Fluid Thermal Properties tab for Fluid 4
    When user clicks on the Fluid Thermal Properties tab
    Then verify the vendor field data for the Fourth fluid

  Scenario: Verify modified properties and system data for Fluid 4
    And verify Modified Properties field data for the Fourth fluid
    And verify system field data for the Fourth fluid

  Scenario: Verify description and default thermal data for Fluid 4
    And the user verifies the description for the fourth fluid
    Then user verifies the default data for all fields under the Thermal properties section

  Scenario: Enter thermal conductivity and specific heat for Fluid 4
    When user enters data for the Thermal Conductivity field for the Fourth fluid
    And user enters data for the Specific Heat field for the Fourth fluid

  Scenario: Enter fluid density and save thermal properties for Fluid 4
    And user enters data for the Fluid Density field for the Fourth fluid
    Then the user clicks on the save button for Fluid data

  Scenario: Verify save success message and persisted data for Fluid 4
    Then verify that data has been saved or not for the Fourth Fluid under Thermal Properties tab

  Scenario: Fluid 1 - Chemicals Tab Validations
  # Fluid 1
    When the user clicks on Material selection option
    When the user clicks on the edit button in front of the fluid name

  Scenario: Open Chemicals tab for First Fluid
    When user clicks on the Chemicals tab
    Then verify the vendor field data

  Scenario: Verify Modified Properties field data for First Fluid
    And verify Modified Properties field data
    And verify system field data
    And the user verifies the description for the fluid

  Scenario: Verify chemical names for First Fluid
    Then user verifies the chemial names form the table

  Scenario: Verify chemical types for First Fluid
    And user enters the Concentration for each chemical for first fluid
    Then the user clicks on the save button for Fluid data

# Scenario: Fluid 2 - Chemicals Tab Validations
# When the user clicks on Material selection option
# When the user clicks on the edit button in front of the second fluid name
# And user clicks on the Chemicals tab
# Then verify the vendor field data for the Second fluid
# And verify Modified Properties field data for the Second fluid
# And verify system field data for the Second fluid
# And the user verifies the description for the Second fluid
# Then user verifies the chemial names form the table
# And user verifies the type for the chemicals
# And user enters the Concentration for each chemical for Second fluid
# Then the user clicks on the save button for Fluid data
# Then the user verifies that after saving the data, the user gets an updated toast message
# Then verify that data has been saved or not for the Second Fluid under Chemicals tab
# 
# Scenario: Fluid 3 - Chemicals Tab Validations
# When the user clicks on Material selection option
# When the user clicks on the edit button in front of the third fluid name
# And user clicks on the Chemicals tab
# Then verify the vendor field data for the Third fluid
# And verify system field data for the Third fluid
# And the user verifies the description for the third fluid
# Then user verifies the chemial names form the table
# And user verifies the type for the chemicals
# And user enters the Concentration for each chemical for Third fluid
# Then the user clicks on the save button for Fluid data
# Then the user verifies that after saving the data, the user gets an updated toast message
# Then verify that data has been saved or not for the Third Fluid under Chemicals tab
# 
# Scenario: Fluid 4 - Chemicals Tab Validations
# When the user clicks on Material selection option
# When the user clicks on the edit button in front of the fourth fluid name
# And user clicks on the Chemicals tab
# Then verify the vendor field data for the Fourth fluid
# And verify Modified Properties field data for the Fourth fluid
# And verify system field data for the Fourth fluid
# And the user verifies the description for the fourth fluid
# Then user verifies the chemial names form the table
# And user verifies the type for the chemicals
# And user enters the Concentration for each chemical for Fourth fluid
# Then the user clicks on the save button for Fluid data
# Then the user verifies that after saving the data, the user gets an updated toast message
# Then verify that data has been saved or not for the Fourth Fluid under Chemicals tab
