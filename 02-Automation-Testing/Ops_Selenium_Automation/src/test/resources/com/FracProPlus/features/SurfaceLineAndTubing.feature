@feature_SurfaceLineAndTubing
Feature: SurfaceLineAndTubing

Background: Given the user is on the Home Screens
    Given the user is on the Home Screens
    And Navigate and click on the pad from the home screens
    And Clicks on the well from overviews
    And Click on wellbore configuration option
    And Verify the page header name
    
@SurfLineANdTubing
Scenario: Navigate and click on the pad from the home screen
    When Click on the surface line and tubing tab
    Then Verify the table page header
    When Enter the data in to Top MD input field
    Then User verify bot md field should be auto updated
    When User enter data less than top md into bot md field 
    Then Verify the error message
    And Verify the save buttion should be disable
    And Enter the data in to Bot MD input field
    Then Verify the surf line and tubing default value
    When Select a value from Od input field
    And Select a value fron Weight input field
    Then Verify the values of ID input field
    And Verify the default selection option in grade field
    And Click on the save button
    And User refresh the page
    When Click on the surface line and tubing tab
    Then Verify the value of length field for first row under surf line and tubing tab
    And Verify the value of Top MD field for first row under surf line and tubing tab
    And Verify the value of Bot MD field for first row under surf line and tubing tab
    And Verify the value of surfline and tubing field field for first row under surf line and tubing tab
    And Verify the value of od field for first row under surf line and tubing tab
    And Verify the value of weight field for first row under surf line and tubing tab
    And User verify the value of id field for first row under surf line and tubing tab
    And Verify the value of grade field for first row under surf line and tubing tab
    And User refresh the page
    When Click on the surface line and tubing tab
    Then Verify the value of length field for first row under surf line and tubing tab
    And Verify the value of Top MD field for first row under surf line and tubing tab
    And Verify the value of Bot MD field for first row under surf line and tubing tab
    And Verify the value of surfline and tubing field field for first row under surf line and tubing tab
    And Verify the value of od field for first row under surf line and tubing tab
    And Verify the value of weight field for first row under surf line and tubing tab
    And User verify the value of id field for first row under surf line and tubing tab
    And Verify the value of grade field for first row under surf line and tubing tab
    When User right click on the first row and insert or remove rows
    #Enter_data_for_Second_Row
    And User enter the value into Top MD input field for second row under surf line and tubing tab
    And User enter the value into length input field for second row under surf line and tubing tab
    And User select the value from surf line dropdown for second row under surf line and tubing tab
    When User select a value from Od input field for second row under surf line and tubing tab
    And User select a value from Weight input field for second row under surf line and tubing tab
    And User enter the value into ID input field for second row under surf line and tubing tab
    And Select the value from grade field dropdown for second row under surf line and tubing tab
    And Click on the save button
    And User refresh the page
    When Click on the surface line and tubing tab
    #Verification_after_save_action
    Then Verify the value of length field for second row under surf line and tubing tab
    And Verify the value of Top MD field for second row under surf line and tubing tab
    And Verify the value of Bot MD field for second row under surf line and tubing tab
    And Verify the value of surfline and tubing second field for second row under surf line and tubing tab
    And Verify the value of od field for second row under surf line and tubing tab
    And Verify the value of weight field for second row under surf line and tubing tab
    And Verify the value of id field for first row under surf line and tubing tab
    And Verify the value of grade field for second row under surf line and tubing tab
    And User refresh the page
    When Click on the surface line and tubing tab
    #Verification_after_page_refresh
    Then Verify the value of length field for second row under surf line and tubing tab
    And Verify the value of Top MD field for second row under surf line and tubing tab
    And Verify the value of Bot MD field for second row under surf line and tubing tab
    And Verify the value of surfline and tubing second field for second row under surf line and tubing tab
    And Verify the value of od field for second row under surf line and tubing tab
    And Verify the value of weight field for second row under surf line and tubing tab
    And Verify the value of id field for first row under surf line and tubing tab
    And Verify the value of grade field for second row under surf line and tubing tab