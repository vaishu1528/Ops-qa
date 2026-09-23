@feature_Myprofile_Email
Feature: Myprofile_Email

Background: User is on the Dashboard Page
    Given the user is on the Dashboard Page
    Then User click on Continue button from the Fracpro live plus card

@verify-Myprofile_email
    Scenario: User should not be able to edit email field on the FracPro LIVE+ profile
   

    
    When the user click on username initials icon
    Then the user click and navigate to the My profile page
    And the user verify the email field should be read only
    And the user try to update the editable fileds
    And the verify the updated data should be visible properly on profile page after refresh
    #Then the user verify the side menu bar should work properly as required with the updated username