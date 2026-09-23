@feature_ChannelInput
Feature: ChannelInput
 

Scenario: User is on the Home Screen
     Given the user is on the Dashboard Page
     Then User click on Continue button from the Fracpro live plus card
     And Navigate and click on the pad from the home screen 
Scenario: Channel Inputs for Model-Channel Inputs tab
    When the user clicks on the Channel Inputs for Model option
    Then the page header name should be verified
    And the Channel Inputs table header names should be verified
    And the Real-Time Channel section should display empty data
    And the Channel Options section should be visible
    When the user selects the checkbox Use User-defined Channels in Input Channel Selection from Channel Options section
    Then the user get the Action required popup
    And the user select yes create option from Action required popup
    And the user enters Channel Name into the channel name input box
    And the user select Unit types form the Unit types dropdown
    Then the user verifies the in the units column the unit is auto selcted when user select the unit type
   	And the user enters the foumula under the formula input box
   	And the user clicks the save and validate button
    And all options in the Channel Options section should be selectable
    Then user verifies that checkbox of the Use User-defined Channels in Input Channel Selection is checked 
    Then the user should be able to select User-defined Channels from the dropdown in the Real-Time Channel Names column for Additional Display Channel one
    And if Additional Display Channel one is selected then the corresponding Input Channel Unit for the same model must be displayed 
    Then the Observed Net Pressure Calculation section should be visible
    When the user select the Real-Time Channel Names for Treating Pressure
    Then the user verifies the under the Observed Net Pressure Calculation section From Surface Treating Pressure option is auto selected
    When The user select the Real-Time Channel Names for Bottomhole Pressure
    Then the user verifies the under the Observed Net Pressure Calculation section From Bottom Hole Pressure is auto selected
    Then the user verifies the Measured Depth to Bottom Hole Gauge field is appers
    Then the user verifies the unit of the Measured Depth to Bottom Hole Gauge 
    And The user enters data into Measured Depth to Bottom Hole Gauge input field
    And the user clicks the Save button
    Then the user verifies that the data has been saved for the Measured Depth to Bottom Hole Gauge
    And the user unselects the the Real-Time Channel Names for Bottomhole Pressure
    When The user select the Real-Time Channel Names for Dead String Pressure
    Then the user verifies the under the Observed Net Pressure Calculation section From Dead String Pressure is auto selected
    Then the user verifies the Dead String SG field is appers 
    And The user enters data into Dead String SG input field
    And the user clicks the Save button
    Then the user verifies that the data has been saved for Dead String SG 
    When the user enters data into the Smoothing number of Points field
    And the user enters data into the number of Flowmeters field
    And the user enters data into the number of Densometers field
    And the user clicks the Save button
    Then the user verifies that the user is getting the success toast message
    And the user verifies that entered data under Parameters section should be saved
    When the user clicks the Next button
    Then the Use User-defined Channels in Input Channel Selection checkbox should remain selected
    And the Smoothing number of Points field value should match the previously saved data
    When the user clicks on the Channel Inputs tab
    When the user clicks on the Measured Data button
    Then the user should be directed to the Measured Data screen under Plots
# User Define Channels 
    When the user click on the utility tab
		And then user click on the user-define Channel option
		Then user verifies the page header name 
		And the user verifies pad name from upper left corner
		And the user verifies Well name from upper left corner
#	User-Define Channel for Delete Functionality	
  	And the user delete the channel from first row
    Then the user get the Confirm Action popup
    And the user clicks on the No button
    Then the user verifies channel is not gets deleted from first row
    And the user delete the channel from first row
    Then the user get the Confirm Action popup
    And the user clicks on the cross icon from Confirm Action popup
    Then the user verifies channel is not gets deleted from first row
 		And the user delete the channel from first row
    Then the user get the Confirm Action popup
    And the user select Yes delete option from Confirm Action popup
    And the user clicks on the Inputs
    And the user clicks on Channel Inputs for Model again
    Then user verifies that checkbox of the Use User-defined Channels in Input Channel Selection is unchecked
## First User-Define Channel	with Unit Rate Solid Additive  - lbm/min
    When the user selects the checkbox Use User-defined Channels in Input Channel Selection from Channel Options section
    Then the user get the Action required popup
    And the user select yes create option from Action required popup
	  When the user enters Channel Name into the channel name input box in first row
    And the user select Unit types Rate Solid Additive from the Unit types dropdown in first row
    Then the user verifies in the units column the unit is auto selcted and its lbm per min for first row
   	And the user enters foumula under the formula input box for first row
   	And the user clicks the save and validate button
   	Then the user verifies that the newly added First User Define Channel
##Second User-Define Channel with Rate Liquid Additive - gal/min 
		When the user enters Channel Name into the channel name input box in Second row
    And the user select Unit types Rate Liquid Additive from the Unit types dropdown in Second row
    Then the user verifies in the units column the unit is auto selcted and its gal per min for Second row
   	And the user enters foumula under the formula input box for Second row
   	And the user clicks the save and validate button
   	Then the user verifies that the newly added Second User Define Channel
##Third User-Define Channel  with Unit Rate (CO2) - bpm 
 		When the user enters Channel Name into the channel name input box in Third row
    And the user select Unit types Rate CO2 from the Unit types dropdown in Third row
    Then the user verifies in the units column the unit is auto selcted and its bpm for Third row
   	And the user enters foumula under the formula input box for Third row
   	And the user clicks the save and validate button
   	Then the user verifies that the newly added Third User Define Channel
##Fourth User-Define Channel with unit Rate (Slurry/clean) - bpm
 		When the user enters Channel Name into the channel name input box in Fourth row
    And the user select Unit types Rate Slurry per clean from the Unit types dropdown in Fourth row
    Then the user verifies in the units column the unit is auto selcted and its bpm for Fourth row
   	And the user enters foumula under the formula input box for Fourth row
   	And the user clicks the save and validate button
   	Then the user verifies that the newly added Fourth User Define Channel
##Fifth User-Define Channel with Additive Volume concentration - gal/Mgal
  	When the user enters Channel Name into the channel name input box in Fifth row
    And the user select Unit types Additive Volume concentration from the Unit types dropdown in Fifth row
    Then the user verifies in the units column the unit is auto selcted and its gal per Mgal for Fifth row
   	And the user enters foumula under the formula input box for Fifth row
   	And the user clicks the save and validate button
   	Then the user verifies that the newly added Fifth user define channel
##Sixth User-Define Channel for inserting channel in formula column by help of scientific calculator
   ##And the user verifies that user can drag the scientific calculator
    When the user enters Channel Name into the channel name input box in Sixth row
    And the user select Unit types form the Unit types dropdown in Sixth row
    Then the user verifies in the units column the unit is auto selcted when user select the unit type for Sixth row
   	And user click on the formula input in sixth row
   	And the user click on the Insert Channel Name from scientific calculator
   	Then user verifies that channel popup appers
   	And user selects channel type from channel type dropdown
   	And the user selects channel name from channel name dropdown
   	And the user clicks on the Cancel button
   	Then the user verifies that selected channel is not added under Fourmula column
   	And user click on the formula input in sixth row
   	And the user click on the Insert Channel Name from scientific calculator
   	Then user verifies that channel popup appers
   ##	And user selects channel type from channel type dropdown
   ##	And the user selects channel name from channel name dropdown
   	And the user clicks on the cross icon from the Channels popup
   	Then the user verifies that selected channel is not added under Fourmula column
   	And user click on the formula input in sixth row
   	And the user click on the Insert Channel Name from scientific calculator
   	Then user verifies that channel popup appers
   ##	And user selects channel type from channel type dropdown
   ##	And the user selects channel name from channel name dropdown
   	And the user click on the Insert button
   	Then user verifies that selected channel displayed in formula column
   	And the user clicks the save and validate button
  ##Seventh User-Define Channel   
    When the user enters Channel Name into the channel name input box in Seventh row
    And the user select Unit types form the Unit types dropdown in Seventh row
    Then the user verifies in the units column the unit is auto selcted when user select the unit type for Seventh row
   	And the user enters wrong foumula under the formula input box for Seventh row
   	And the user clicks the save and validate button
   	Then the user verifies that user is getting error massage
# Channel Inputs for Model-Additives Tab
    When the user clicks on the Inputs
    And the user clicks on Channel Inputs for Model again
    When the user Clicks on Additives Tab
    Then the Use User-defined Channels in Input Channel Selection checkbox should remain selected
    And the Smoothing number of Points field value should match the previously saved data
    And the user Clicks on Additives Tab
    Then the user verifies that Rate Solid Additive and Rate Liquid Additive displayed only in Additive Rate Channel column
    And the user verifies that Rate CO2 and Rate Slurry per clean option displayed only in Key Rate column
    And the user verifies that Additive Volume concentration option displayed only in Additive Set Point column 
    And the user clicks the Save button
    Then the user verifies that the data has been saved for Additives Tab
    When the user enters data into the Smoothing number of Points field for Additive tab
    And the user clicks the Save button
    Then the user verifies that entered data should be saved for Additive Tab
    
		