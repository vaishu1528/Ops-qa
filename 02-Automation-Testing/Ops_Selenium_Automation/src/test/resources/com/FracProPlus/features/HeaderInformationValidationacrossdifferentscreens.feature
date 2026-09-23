#Feature: Header Information Validation across different screens
#
  #Background:
    #Given the user is on the Dashboard Page
    #When User click on Continue button from the Fracpro live plus card
    #And Navigate and click on the pad from the home screen
#
  #@HeaderNavigation
  #Scenario: Validate navigation to the Header screen
    #When the user navigates to any input screen from the side menu
    #Then the respective screen should be displayed
#
  #@PadNameInputScreens
  #Scenario: Validate the Pad name in all input screens
    #When the user navigates to any input screen
    #Then the current Pad name should be displayed in the header
    #When the user changes the Pad name from the Pad and Well screen
    #Then the updated Pad name should reflect in the header
#
  #@WellNameInputScreens
  #Scenario: Validate the Well name in all input screens
    #When the user navigates to any input screen
    #Then the current Well name should be displayed in the header
    #When the user changes the Well name from the Pad and Well screen
    #Then the updated Well name should reflect in the header
#
  #@VersionNameInputScreens
  #Scenario: Validate the Version name in all input screens
    #When the user navigates to any input screen
    #Then the current Version name should be displayed in the header
    #When the user changes the Version from the Version screen
    #Then the updated Version name should reflect in the header
#
  #@StageNameInputScreens
  #Scenario: Validate the Stage name in all input screens
    #When the user navigates to any input screen
    #Then the current Stage name should be displayed in the header
    #When the user changes the Stage from the Version screen
    #Then the updated Stage name should reflect in the header
    #And the user revisits the screen
    #Then the updated Stage name should persist
#
  #@HeaderValidationPlotReportsDashboardUserDefinedVersionScreens
  #Examples:
    #| screen               | changeFrom               |
    #| Plot                | Welcome screen           |
    #| Reports             | Welcome screen           |
    #| Dashboard           | Welcome screen           |
    #| User Defined Channel| Welcome screen           |
    #| Version Control     | Welcome screen           |
#
  #Scenario Outline: Validate Pad/Well/Version/Stage name in <screen> screen
    #When the user navigates to the <screen> screen
    #Then the current Pad name should be displayed in the header
    #When the user changes the Pad from the <changeFrom>
    #Then the updated Pad name should reflect in the header
    #And the user revisits the screen
    #Then the updated Pad name should persist
#
    #When the user navigates to the <screen> screen
    #Then the current Well name should be displayed in the header
    #When the user changes the Well from the <changeFrom>
    #Then the updated Well name should reflect in the header
    #And the user revisits the screen
    #Then the updated Well name should persist
#
    #When the user navigates to the <screen> screen
    #Then the current Version name should be displayed in the header
    #When the user changes the Version from the <changeFrom>
    #Then the updated Version name should reflect in the header
    #And the user revisits the screen
    #Then the updated Version name should persist
#
    #When the user navigates to the <screen> screen
    #Then the current Stage name should be displayed in the header
    #When the user changes the Stage from the <changeFrom>
    #Then the updated Stage name should reflect in the header
    #And the user revisits the screen
    #Then the updated Stage name should persist