@feature_dashboard
Feature: Dashboard

Scenario: User is on the Dashboard Page
    Given the user is on the Dashboard Page
Scenario: Verify the Explore Our Digital Solutions
    And verify the Explore Our Digital Solutions header name
Scenario: Verify Dashboard sub-header text From basic functionality to advanced features
    And verify the From basic functionality to advanced features we have the right solution for you
Scenario: Verify Linqx logo
    And verify the linqx logo
Scenario: Verify default status for Simulation tab
    And verify the bydefault status for simulation tab
Scenario: Verify functionality of Well Construction tab
    And verify the functionality of well construction tab 
Scenario: User clicks Continue from Fracpro Live Plus card
    Then User click on Continue button from the Fracpro live plus card
Scenario: User views favorite Pads list in FracPro LIVE+ dashboard
    When the user should see a list of Favorite Pads
Scenario: User clicks a pad from Pad List
    Then the user clicks on any pad from List in pad section
Scenario: User views Wells under selected Pad
    And the user should see the Wells listed under that Pad
Scenario: User clicks on Star icon for a Pad
    When the user clicks on the star icon for a pad
Scenario: Verify pad appears in Favorites list
    And that pad should appear in the Favorite Pads list 
Scenario: User removes Pad from Favorites
    When the user clicks on the star icon for a pad from the Favorite Pads section
Scenario: User drags Pad to Favorites
    When the user drags a pad to the Favorite Pads section
Scenario: Verify Pad Added toast message   
    Then the user verifies that the user is getting the Pad Added toast message
Scenario: Verify Pad appears in Favorites after drag 
    And that pad should appear in the Favorite Pads list
Scenario: User clicks a pad
    When the user click on the pad
Scenario: Verify Add New Well button is visible
    Then the user verifies the add New Well button is visible
Scenario: User clicks Add New Well button
    And the user click on the add New Well button
Scenario: Verify redirection to General Information page  
    Then the user should be redirected to the General Information page
Scenario: Verify Pad Name field pre-filled
    And the Pad Name field should be pre-filled with the selected pad’s name
    Then the user filled the required details to New Well under the same pad
		And the user clicks on the save button
Scenario: Verify Well Name
		Then the user verifies Well Name
Scenario: User clicks Fracpro Plus icon
    And user click Fracpro Plus icon
    When the user verifies that New Pad button is visible under the Pads Section
    Then the user clicks on the New Pad button
Scenario: Verify redirection to General Information page after New Pad
    And the user should be navigated to the General Information page
Scenario: User clicks Fracpro Plus icon again
    And user click Fracpro Plus icon again
Scenario: Verify Expand All button is present
		When the user will look for the Expand All button present on screen
    Then the user clicks on the Expand All button
Scenario: Verify Collapse All button is present
		When the user will look for the Collapse All button present on screen
Scenario: User clicks Collapse All button
    Then the user clicks on the Collapse All button
Scenario: User clicks Filter icon
    When the user clicks on the filter icon
Scenario: Verify filter options are displayed
    Then all filter options should be displayed
Scenario: Verify All option is default
    And the All option should be selected by default in the filter type
Scenario: Verify Three Months option is default
    And the three months option should be selected by default in the time filter
    Then user find the pad from search bar
Scenario: User clicks Profile icon
    When the user click Profile icon
Scenario: User opens My Profile from dropdown
    And the user click on the my profile from dropdown
Scenario: Verify Profile Page title
    Then user verifies the Page title 
Scenario: Verify First Name in Profil
    And user verifies the first name 
Scenario: Verify Last Name in Profile
    And user verifies the Last name
Scenario: Verify Email in Profile
    And user verifies the Email
Scenario: Verify Company Name in Profile
    And User verifies Company Name
Scenario: User saves Profile details like first , last name
    Then User Enters the First Name
    And User Enters the Last name
    And User clicks on the save button
Scenario: Verify Profile data is saved
    Then user verifies that data has been saved or not 
    And user enter the first name
    And user enter the last name 
    And User clicks on the save button
Scenario: Verify Reset Compute Resources button
    And verify the reset compute resources button functionality 
Scenario: User clicks Fracpro Plus icon from Profile
    And user click Fracpro Plus icon again