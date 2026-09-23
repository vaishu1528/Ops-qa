@wellbore_configuration
Feature: Well bore configuration

  Scenario: User is on the Home Screen
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card
    And Navigate and click on the pad from the home screen

  Scenario: User clicks on Wellbore Configuration option
    And Click on wellbore configuration option
    And Verify the page header name

  Scenario: As a user i can navigate to the drilled hole tab and create the data
    When Click on the drilled hole tab
    And User enter the data into top md field
    When Click on the casing tab

  Scenario: Verify popup on unsaved text field change
    And User verify the unsaved changes pop up

  Scenario: Verify user clicks on No Discard button
    And click on the no discard button

  Scenario: Verify user enters data into Top MD field
    When Enter the data into top md field

  Scenario: Verify user clicks on Surface Line and Tubing tab
    When Click on the surface line and tubing tab

  Scenario: Verify unsaved changes popup is displayed
    And User verify the unsaved changes pop up

  Scenario: Verify user clicks on No Discard button on unsaved changes popup
    And click on the no discard button

  Scenario: Verify user enters data into Top MD input field
    When Enter the data in to Top MD input field

  Scenario: Verify user clicks on Perforation Interval tab
    When the user clicks on the perforation interval tab

  Scenario: Verify unsaved changes popup is displayed on Perforation Interval tab navigation
    And User verify the unsaved changes pop up

  Scenario: Verify user clicks on No Discard button on unsaved changes popup from Perforation Interval tab
    And click on the no discard button

  Scenario: Verify user clicks on Path Summary tab
    When the user clicks on the path summary tab

  Scenario: Verify user clicks on Frac String Partly Full radio button
    When the user clicks on the frac string partly full radio button

  Scenario: Verify user clicks on Directional Survey tab
    When the user clicks on the directional survey tab

  Scenario: Verify popup on unsaved checkbox change
    And User verify the unsaved changes pop up

  Scenario: Verify user clicks on No Discard button
    And click on the no discard button

  Scenario: Verify user clicks on Path Summary tab
    When the user clicks on the path summary tab

  Scenario: Verify user clicks on Frac String Full radio button
    And the user clicks on the frac string full radio button

  Scenario: Verify user clicks on Drilled Hole tab
    When Click on the drilled hole tab

  Scenario: Verify unsaved changes popup is displayed
    And User verify the unsaved changes pop up

  Scenario: Verify user clicks on No Discard button on unsaved changes popup
    And click on the no discard button
    When Click on the drilled hole tab

  Scenario: Verify Drilled Hole table headers
    Then Verify drilled hole table header names

  Scenario: User enters Top MD data
    When User enter the data into top md field

  Scenario: Verify Bot MD auto update
    Then User verify the bot md field should be auto updated

  Scenario: Enter Bot MD less than Top MD
    When User enter the data less than top md into bot md field

  Scenario: Verify error message for invalid Bot MD
    Then User verify the error message

  Scenario: Verify Save button disabled for invalid Bot MD
    Then Verify the save buttion should be disable

  Scenario: Select an option from Compute dropdown (first time)
    When Select a option from compute dropdown

  Scenario: Verify Save button disabled after compute selection
    Then Verify the save buttion should be disable

  Scenario: Select an option from Compute dropdown (second time)
    When Select a option from compute dropdown for second time

  Scenario: Verify Save button disabled after second compute selection
    Then Verify the save buttion should be disable

  Scenario: Enter Bot MD greater than Top MD
    When User enter the data greater than top md into bot md field

  Scenario: Verify Save button enabled
    Then User verify save button should be enable

  Scenario: Verify first row values before save
    And Verify the Top MD value for first row

  Scenario: Verify Bot MD value for first row
    And Verify the Bot MD value for first row

  Scenario: Verify value in Length field for first row
    And Verify the value in length field for first row

  Scenario: Verify Open Hole dropdown default option for first row
    And Verify the open hole dropdown bydefault option for first row

  Scenario: Verify value in Bot Diam field for first row
    And Verify the value in bot diam field for first row

  Scenario: Verify value in Effective Diam field for first row
    And Verify the value in effective diam field for first row

  Scenario: User clicks Save button
    When Click on the save button

  Scenario: User refreshes the page
    And User refresh the page

  Scenario: Verify first row values after refresh
    Then Verify the Top MD value for first row

  Scenario: Verify Bot MD value for first row
    And Verify the Bot MD value for first row

  Scenario: Verify value in Length field for first row
    And Verify the value in length field for first row

  Scenario: Verify Open Hole dropdown default option for first row
    And Verify the open hole dropdown bydefault option for first row

  Scenario: Verify value in Bot Diam field for first row
    And Verify the value in bot diam field for first row

  Scenario: Verify value in Effective Diam field for first row
    And Verify the value in effective diam field for first row

  Scenario: User refreshes the page again
    And User refresh the page

  Scenario: Verify first row values after second refresh
    Then Verify the Top MD value for first row

  Scenario: Verify Bot MD value for first row
    And Verify the Bot MD value for first row

  Scenario: Verify value in Length field for first row
    And Verify the value in length field for first row

  Scenario: Verify Open Hole dropdown default option for first row
    And Verify the open hole dropdown bydefault option for first row

  Scenario: Verify value in Bot Diam field for first row
    And Verify the value in bot diam field for first row

  Scenario: Verify value in Effective Diam field for first row
    And Verify the value in effective diam field for first row

  Scenario: User inserts or removes rows
    When User right click on the first row and insert or remove rows
    And Click on the save button

  Scenario: Refresh after row modification
    And User refresh the page

  Scenario: User navigate to the casing tab
    When Click on the casing tab

  Scenario: Enter Top MD for first row in casing tab
    When Enter the data into top md field

  Scenario: Verify Bot MD auto update for first row in casing tab
    Then Verify the bot md field should be auto updated

  Scenario: User enter the Bot MD less than Top MD for first row in casing tab
    When Enter the data less than top md into bot md field

  Scenario: Verify error message for invalid Bot MD in casing tab
    Then Verify the error message

  Scenario: Verify Save button disabled for invalid Bot MD
    And Verify the save buttion should be disable

  Scenario: Enter Bot MD greater than Top MD for first row
    When Enter the data greater than top md into bot md field

  Scenario: Verify Save button enabled
    Then User verify save button should be enable

  Scenario: Verify default option in Casing field
    And Verify the default selection option in casing field

  Scenario: Verify default option in Grade field
    And Verify the default selection option in grade field

  Scenario: Select OD field option
    When Select the OD field drop down

  Scenario: Select Weight field option
    When Select a option from weight field dropdown
    Then Verify the value in ID field
    And Verify the value in length field of first row

  Scenario: Select Casing option from Injection dropdown
    When Select casing option from injection is down dropdown
    And Click on the save button

  Scenario: Refresh page after saving first row
    And User refresh the page
    When Click on the casing tab

  Scenario: Verify first row values after refresh
    Then Verify the values in the Length field for the first row under the Casing tab

  Scenario: Verify Top MD field value for first row under Casing tab
    And Verify the values in the Top MD field for the first row under the Casing tab

  Scenario: Verify Bot MD field value for first row under Casing tab
    And Verify the values in the Bot MD field for the first row under the Casing tab

  Scenario: Verify Casing field value for first row under Casing tab
    And Verify the values in the casing field for the first row under the Casing tab

  Scenario: Verify OD field value for first row under Casing tab
    And Verify the values in the OD field for the first row under the Casing tab

  Scenario: Verify Weight field value for first row under Casing tab
    And Verify the values in the Weight field for the first row under the Casing tab

  Scenario: Verify ID field value for first row under Casing tab
    And Verify the values in the ID field for the first row under the Casing tab

  Scenario: Verify Grade field value for first row under Casing tab
    And Verify the values in the Grade field for the first row under the Casing tab

  Scenario: Verify Save button is disabled under Casing tab
    And Verify the save buttion should be disable

  Scenario: Insert or remove rows in first row
    When User right click on the first row and insert or remove rows

  Scenario: User enter the second row values after refresh
    When User enter the value into the Top MD field for second row

  Scenario: Verify user enters value into Bot MD field for second row
    And User enter the value into the Bot MD field for second row

  Scenario: Verify user selects value from Casing dropdown for second row
    And User Select the value from the Casing dropdown for second row

  Scenario: Verify user enters value into OD field for second row
    And User enter the value into the OD field for second row

  Scenario: Verify user enters value into Weight field for second row
    And User enter the value into the Weight field for second row

  Scenario: Verify user enters value into ID field for second row
    And User enter the value into the ID field for second row

  Scenario: Verify user selects value from Grade dropdown for second row
    And User Select the value from the grade dropdown for second row

  Scenario: Verify user clicks on Save button
    And Click on the save button

  Scenario: Verify user refreshes the page
    And User refresh the page

  Scenario: Verify second row values after refresh
    When Click on the casing tab
    Then Verify the values in the Length field for the second row under the Casing tab

  Scenario: Verify Top MD field value for second row under Casing tab
    And Verify the values in the Top MD field for the second row under the Casing tab

  Scenario: Verify Bot MD field value for second row under Casing tab
    And Verify the values in the Bot MD field for the second row under the Casing tab

  Scenario: Verify Casing field value for second row under Casing tab
    And Verify the values in the casing field for the second row under the Casing tab

  Scenario: Verify OD field value for second row under Casing tab
    And Verify the values in the OD field for the second row under the Casing tab

  Scenario: Verify Weight field value for second row under Casing tab
    And Verify the values in the Weight field for the second row under the Casing tab

  Scenario: Verify ID field value for second row under Casing tab
    And Verify the values in the ID field for the second row under the Casing tab

  Scenario: Verify Grade field value for second row under Casing tab
    And Verify the values in the Grade field for the second row under the Casing tab
    And Verify the save buttion should be disable

  Scenario: User clicks Surface Line and Tubing tab
    When Click on the surface line and tubing tab

  Scenario: Enter Top MD for first row
    When Enter the data in to Top MD input field

  Scenario: Enter Bot MD less than Top MD for first row
    Then User verify bot md field should be auto updated
    When User enter data less than top md into bot md field

  Scenario: Verify error message for invalid Bot MD
    Then Verify the error message

  Scenario: Verify Save button disabled for invalid Bot MD
    And Verify the save buttion should be disable
    And Enter the data in to Bot MD input field

  Scenario: Verify default value in Surface Line and Tubing field
    Then Verify the surf line and tubing default value

  Scenario: Select OD value for first row
    When Select a value from Od input field

  Scenario: Select Weight value for first row
    And Select a value fron Weight input field

  Scenario: Verify ID field value for first row
    Then Verify the values of ID input field

  Scenario: Verify default Grade field selection
    And Verify the default selection option in grade field
    And Click on the save button

  Scenario: Click Surface Line and Tubing tab after refresh
    And User refresh the page
    When Click on the surface line and tubing tab

  Scenario: Verify first row values after save
    Then Verify the value of length field for first row under surf line and tubing tab

  Scenario: Verify Top MD field value for first row under Surface Line and Tubing tab
    And Verify the value of Top MD field for first row under surf line and tubing tab

  Scenario: Verify Bot MD field value for first row under Surface Line and Tubing tab
    And Verify the value of Bot MD field for first row under surf line and tubing tab

  Scenario: Verify Surface Line and Tubing field value for first row under Surface Line and Tubing tab
    And Verify the value of surfline and tubing field field for first row under surf line and tubing tab

  Scenario: Verify OD field value for first row under Surface Line and Tubing tab
    And Verify the value of od field for first row under surf line and tubing tab

  Scenario: Verify Weight field value for first row under Surface Line and Tubing tab
    And Verify the value of weight field for first row under surf line and tubing tab

  Scenario: Verify ID field value for first row under Surface Line and Tubing tab
    And User verify the value of id field for first row under surf line and tubing tab

  Scenario: Verify Grade field value for first row under Surface Line and Tubing tab
    And Verify the value of grade field for first row under surf line and tubing tab

  Scenario: Refresh page after first row verification
    And User refresh the page
    When Click on the surface line and tubing tab

  Scenario: Verify Length field value for first row under Surface Line and Tubing tab
    Then Verify the value of length field for first row under surf line and tubing tab

  Scenario: Verify Top MD field value for first row under Surface Line and Tubing tab
    And Verify the value of Top MD field for first row under surf line and tubing tab

  Scenario: Verify Bot MD field value for first row under Surface Line and Tubing tab
    And Verify the value of Bot MD field for first row under surf line and tubing tab

  Scenario: Verify Surface Line and Tubing field value for first row under Surface Line and Tubing tab
    And Verify the value of surfline and tubing field field for first row under surf line and tubing tab

  Scenario: Verify OD field value for first row under Surface Line and Tubing tab
    And Verify the value of od field for first row under surf line and tubing tab

  Scenario: Verify Weight field value for first row under Surface Line and Tubing tab
    And Verify the value of weight field for first row under surf line and tubing tab

  Scenario: Verify ID field value for first row under Surface Line and Tubing tab
    And User verify the value of id field for first row under surf line and tubing tab

  Scenario: Verify Grade field value for first row under Surface Line and Tubing tab
    And Verify the value of grade field for first row under surf line and tubing tab

  Scenario: Enter Top MD for second row
    And User enter the value into Top MD input field for second row under surf line and tubing tab

  Scenario: Enter Length for second row
    And User enter the value into length input field for second row under surf line and tubing tab

  Scenario: Select Surface Line for second row
    And User select the value from surf line dropdown for second row under surf line and tubing tab

  Scenario: Select OD value for second row
    When User select a value from Od input field for second row under surf line and tubing tab

  Scenario: Verify user selects value from Weight input field for second row under Surface Line and Tubing tab
    And User select a value from Weight input field for second row under surf line and tubing tab

  Scenario: Verify user enters value into ID input field for second row under Surface Line and Tubing tab
    And User enter the value into ID input field for second row under surf line and tubing tab

  Scenario: Verify user selects value from Grade dropdown for second row under Surface Line and Tubing tab
    And Select the value from grade field dropdown for second row under surf line and tubing tab

  Scenario: Verify user clicks on Save button
    And Click on the save button
    And User refresh the page

  Scenario: Verify user clicks on Surface Line and Tubing tab
    When Click on the surface line and tubing tab

  Scenario: Verify second row values after save
    Then Verify the value of length field for second row under surf line and tubing tab

  Scenario: Verify Top MD field value for second row under Surface Line and Tubing tab
    And Verify the value of Top MD field for second row under surf line and tubing tab

  Scenario: Verify Bot MD field value for second row under Surface Line and Tubing tab
    And Verify the value of Bot MD field for second row under surf line and tubing tab

  Scenario: Verify Surface Line and Tubing second field value for second row under Surface Line and Tubing tab
    And Verify the value of surfline and tubing second field for second row under surf line and tubing tab

  Scenario: Verify OD field value for second row under Surface Line and Tubing tab
    And Verify the value of od field for second row under surf line and tubing tab

  Scenario: Verify Weight field value for second row under Surface Line and Tubing tab
    And Verify the value of weight field for second row under surf line and tubing tab

  Scenario: Verify ID field value for first row under Surface Line and Tubing tab
    And Verify the value of id field for first row under surf line and tubing tab

  Scenario: Verify Grade field value for second row under Surface Line and Tubing tab
    And Verify the value of grade field for second row under surf line and tubing tab
    And User refresh the page

  Scenario: Verify user clicks on Surface Line and Tubing tab
    When Click on the surface line and tubing tab

  Scenario: Verify the second row values after save
    Then Verify the value of length field for second row under surf line and tubing tab

  Scenario: Verify Top MD field value for second row under Surface Line and Tubing tab
    And Verify the value of Top MD field for second row under surf line and tubing tab

  Scenario: Verify Bot MD field value for second row under Surface Line and Tubing tab
    And Verify the value of Bot MD field for second row under surf line and tubing tab

  Scenario: Verify Surface Line and Tubing second field value for second row under Surface Line and Tubing tab
    And Verify the value of surfline and tubing second field for second row under surf line and tubing tab

  Scenario: Verify OD field value for second row under Surface Line and Tubing tab
    And Verify the value of od field for second row under surf line and tubing tab

  Scenario: Verify Weight field value for second row under Surface Line and Tubing tab
    And Verify the value of weight field for second row under surf line and tubing tab

  Scenario: Verify ID field value for first row under Surface Line and Tubing tab
    And Verify the value of id field for first row under surf line and tubing tab

  Scenario: Verify Grade field value for second row under Surface Line and Tubing tab
    And Verify the value of grade field for second row under surf line and tubing tab

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

  Scenario: User clicks on Directional Survey tab
    When the user clicks on the directional survey tab

  Scenario: Verify the md inclination azimuth tvd Ns and Ew header name in directional survey tab
    And Verify the md inclination azimuth tvd Ns and Ew header name in directional survey tab

  Scenario: Select North, South, East, West, TVD from Specify dropdown
    When the user selects north south east west and TVD option from the specify dropdown

  Scenario: Select MD, Inclination, Azimuth from Specify dropdown
    And the user selects MD and Inclination and Azimuth option from specify dropdown

  Scenario: Select MD, TVD, Azimuth from Specify dropdown
    And the user selects MD and TVD and Azimuth option from specify dropdown

  Scenario: Select North, South, East, West, TVD again
    When the user selects north south east west and TVD option from the specify dropdown

  Scenario: Enter North-South value for first row
    And the user enters the data into north south field for first row

  Scenario: Enter East-West value for first row
    And the user enters the data into east west field for first row

  Scenario: Enter TVD value for first row
    And the user enters the data into TVD field for first row

  Scenario: Select MD, Inclination, Azimuth again
    When the user selects MD and inclination and azimuth option from specify dropdown

  Scenario: Enter MD value for first row
    And the user enters the data into MD field for first row

  Scenario: Enter Inclination value for first row
    And the user enters the data into Inclination field for first row

  Scenario: Enter Azimuth value for first row
    And the user enters the data into Azimuth field for first row
    When the user clicks on save button

  Scenario: Refresh page on Directional Survey tab
    When the user refreshes the page
    When the user clicks on the directional survey tab

  Scenario: Validate the 300 of rows data in the directiona survey table
    And user copy and paste the data from excel to the MD Inclination Azimuth column
    When the user selects north south east west and TVD option from the specify dropdown

  Scenario: User copy and pastes the data from excel into TVD, NS, and EW columns
    And user copy and paste the data from excel to the TVD NS and EW column
    When the user clicks on save button

  Scenario: As a user I can navigate to perforation interval
    When the user clicks on the perforation interval tab

  Scenario: Verify default state of 'use multiple clusters for model' checkbox
    And the by default state of use multiple clusters for model check box should be verified

  Scenario: Verify copy and paste button functionality
    When the user clicks on the copy and paste button
    Then the copy and paste page title name should be verified

  Scenario: Verify the copy and paste functionality from excel in the perforation interval tab
    When the user copies the data from excel and pastes it into the copy and paste table
    And the user clicks on the save button2
    And User refresh the page

  Scenario: verify the user click on the perforation tab
    And the user clicks on the perforation interval tab
    And the by default state of use multiple clusters for model check box should be verified

  Scenario: Verify validation when Top MD > Bot MD
    And Click on the add row button for first row

  Scenario: Verify auto-populated Top TVD when Top MD < Bot MD
    And Enter the data into the Top MD field greater than to the BOT MD

  Scenario: Verify error message for sub interval
    Then Verify the error message sub interval

  Scenario: Verify user enters Top MD value less than Bot MD value
    When User enter the data into Top md field less than Bot md value

  Scenario: Verify auto populated value into Top TVD field
    Then Verify the auto populated value into Top TVD field

  Scenario: Verify auto-populated Bot TVD in sub interval
    When User enter the data into Bot md field in sub interval of first row

  Scenario: Verify auto populated value into Bot TVD field in sub interval of first row
    And Verify the auto populated value into Bot TVD field in sub interval of first row

  Scenario: Verify user enters data into Top MD field for second sub interval of first row
    When User enter data into Top md field for second sub interval of first row

  Scenario: Verify user enters data into Bot MD field for second sub interval of first row
    And User enter data into Bot md field for second sub interval of first row

  Scenario: Enter diameter value in sub interval
    And User enter the value into the diameter field in sub interval
    And User enter the value into the number of perfs field into the sub interval

  Scenario: Select perf phasing in sub interval
    And User select the value into the perf phasing field into the sub interval

  Scenario: Save perforation interval tab
    And Click on the ok button in Perforation Interval tab
    And Click on the save button
    And User refresh the page
    And the user clicks on the perforation interval tab

  Scenario: Verify user stage alias checkbox
    When the user clicks on the user stage alias check box

  Scenario: Verify Alias table header name
    Then the Alias table header name should be verified

  Scenario: Verify user enters data into Alias column of the intervals
    When the user enters the data into the alias column of the intervals
    And the user clicks on save button
    And User refresh the page

  Scenario: Verify user clicks on Perforation Interval tab
    And the user clicks on the perforation interval tab

  Scenario: Verify alias entry in interval
    Then the new entered value in the alias column should be verified
