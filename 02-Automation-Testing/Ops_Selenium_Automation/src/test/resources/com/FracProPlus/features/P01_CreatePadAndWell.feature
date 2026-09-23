@feature_PadCreation
Feature: PadCreation

Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
Scenario: Verify FracPro Core+ card is displayed
		Then user verifies the FracPro Core+ card is displayed
Scenario: Verify FracPro Live+ card is displayed	
		And user verifies the FracPro Live+ card is displayed
Scenario: Verify XOPS card is displayed		
		And user verifies the XOPS card is displayed
Scenario: Verify FracPro Live X card is displayed		
		And user verifies the FracPro Live X card is displayed
Scenario: Verify StimPro card is displayed		
		And user verifies the StimPro card is displayed
Scenario: Click Continue button from FracPro Live+ card
		Then User click on Continue button from the Fracpro live plus card
Scenario: Verify title after clicking Continue
		And the title should be displayed correctly
Scenario: Click Add New Pad button
    And user clicks on the Add New Pad button
Scenario: Verify error message for Pad Name field
    Then User verifies that after clicking out side the pad name textbox user is getting the error massage
Scenario: Verify error message for Field Name field
    Then User verifies that after clicking out side the Field Name textbox user is getting the error massage
Scenario: Verify error message for Well Name field
    Then User verifies that after clicking out side the Well Name textbox user is getting the error massage
Scenario: Verify error message for Well API field
    Then User verifies that after clicking out side the Well API textbox user is getting the error massage
Scenario: Verify error message for invalid API length
    Then Verify error message when API length is invalid
Scenario: Enter Pad Name
    When user enters Pad Name under the Pad Name testbox
Scenario: Enter Field Name
		Then user enters Field Name under the Field Name testbox
Scenario: Enter Well Name and well api name
		And user enters Well Name under the Well Name testbox
		And user enters Well API under the Well API testbox
Scenario: Select Company Name from dropdown
		And user selects dropdown value from the Company Name dropdown
Scenario: Enter Company Representative and Service Company Representative name
		And user enters Company Representative under the Company Representative testbox 
		And user enters Service Company Rep under the Service Company Rep testbox
		And user selects dropdown value from the Service Company Name dropdown
Scenario: Enter Treatment Analyst
		And user enters Treatment Analyst under the Treatment Analyst testbox
Scenario: Click Location tab
		And user need to click on the location tab
Scenario: User enter lattitude and longitude 
		And user enters Latitude under the Latitude testbox
	  And user enters Longtitude under the Longtitude testbox
Scenario: Enter Elevation and Kb name
		And user enters Elevation under the Elevation testbox
		And user enters KB under the KB testbox
Scenario: Click Additional Info tab and zipper
		And user need to click on the Additional Info tab
		And user enters Zipper Group under the Zipper Group testbox
		And user enters Landing Point under the Landing Point testbox
		And user enters Fleet under the Fleet testbox
		And user enters Well Tag under the Well Tag testbox
		And user enters AFE under the AFE testbox
Scenario: Save Pad details
		And user clicks on the Save button
#Scenario: Verify Pad name and Well Name after save
#		Then user verifies the Pad name and Well Name for top left corner
#Scenario: Navigate back using FracPro Plus icon
#		And user click Fracpro Plus icon
#		Then user verifies that saved pad added under the pad list on the home page
#Scenario: User search Pad from search bar
#		And user find the pad from search bar
		
