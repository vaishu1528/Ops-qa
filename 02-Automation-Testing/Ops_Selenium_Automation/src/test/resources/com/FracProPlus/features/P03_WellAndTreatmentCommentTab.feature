@feature_CommentTab
Feature: Well & Treatment Comment Tab

Scenario: Verify user is on the Home Screen
     Given the user is on the Dashboard Page
Scenario: User clicks Continue button on Fracpro Live Plus card
    Then User click on Continue button from the Fracpro live plus card
Scenario: User navigates and clicks on Pad
    And Navigate and click on the pad from the home screen
Scenario: Verify page title in Well and Treatment section
   Then the user verifies page title
Scenario: Navigation to the comments tab
   And the user clicks on the comment tab 
Scenario: User adds a new row for the first time
   Then the user add the new row first time
Scenario: Enter minutes in Job Time column for first row
   Then the user enter Minutes in the Job time column section
#Scenario: Validate entered Job Time updates default time
   #Then the user validate that entered time added in default time
Scenario: Enter comments in first row
   Then the user enters comments in the Comments column 
Scenario: Save first row data
   Then user clicks on the Save button
Scenario: User adds a new row again
   Then the user add the new row
Scenario: Enter minutes in Job Time column for new row
   Then the user enter Minutes in the Job time column section in new row
Scenario: Enter comments in new row
   Then the user enters comments in the Comments column in new row
   Then user clicks on the Save button
Scenario: Verify new row data saved
   Then the user verifies new added data into new row
Scenario: User refresh the comments page
   Then the user perform page refresh action
Scenario: User clicks on Comments tab after refresh
   Then the user clicks on the comment tab
   Then the user add the new row second time
Scenario: Enter minutes in Job Time column for third row
   Then the user enter Minutes in the Job time column section for forth row
   Then the user enters comments in the Comments column for forth row  
Scenario: User clicks on Next button
   Then the user click on the next button
Scenario: Verify Action Required popup on Next
   Then the user verifies that user is getting the Action Required popup
Scenario: User clicks No Discard button in Action Required popup
   Then the user clicks on the No Discard button in the Action Required popup
Scenario: User clicks on Well and Treatment option
   Then the user clicks on the Well and Treatment option
   And the user clicks on the comment tab
Scenario: Add a new row second time
   Then the user add the new row second time
Scenario: Enter minutes in Job Time column for fourth row (second attempt)
   Then the user enter Minutes in the Job time column section for forth row
Scenario: Enter comments in Comments column for fourth row (second attempt)
   Then the user enters comments in the Comments column for forth row 
Scenario: User clicks on General Information tab
   Then the user clicks on the general information tab
Scenario: Verify Action Required popup when switching to General Information tab
   Then the user verifies that user is getting the Action Required popup
Scenario: User clicks No Discard in Action Required popup for General Information tab
   Then the user clicks on the No Discard button in the Action Required popup
Scenario: Verify redirection to General Information tab
   Then the user verifies that user is rediecting to the general information tab
   Then the user clicks on the comment tab
   Then the user enter Minutes in the Job time column section for forth row
   Then the user enters comments in the Comments column for forth row
Scenario: Click on Channel Inputs for Model option 	
   Then the user click Channel Inputs for Model option from the side bar menu 
Scenario: Verify Action Required popup after sidebar navigation
   Then the user verifies that user is getting the Action Required popup
Scenario: User clicks No Discard button in Action Required popup
   Then the user clicks on the No Discard button in the Action Required popup
Scenario: Verify redirection to Channel Inputs for Model screen
   Then the user verifies that user is rediecting to the Channel Inputs for Model screen
Scenario: User clicks on Well and Treatment option
   Then the user clicks on the Well and Treatment option
   And the user clicks on the comment tab 
Scenario: User clicks on Profile icon
	 Then the user add the new row second time
	 When the user enter Minutes in the Job time column section for forth row
   And the user enters comments in the Comments column for forth row 	
   And the user click Profile icon
Scenario: User clicks on My Profile from dropdown
   And the user click on the my profile from dropdown
Scenario: Verify Action Required popup after profile navigation
   Then the user verifies that user is getting the Action Required popup
   Then the user clicks on the No Discard button in the Action Required popup
Scenario: Verify redirection to Profile screen
   Then the user verifies that user is rediecting to the Profile screen
Scenario: User clicks on Fracpro Plus icon
   And user click Fracpro Plus icon
Scenario: Navigate and click on pad from home screen
   And Navigate and click on the pad from the home screen
   Then the user clicks on the Well and Treatment option second time
   And the user clicks on the comment tab

   
	
